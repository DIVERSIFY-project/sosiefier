package fr.inria.diversify.transformation.query;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.coverage.NullCoverageReport;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.Log;

import java.io.*;
import java.util.*;

/**
 * Search for points of known sosies
 * <p/>
 * Created by marcel on 6/06/14.
 */
public class KnownSosieQuery extends TransformationQuery {

    List<Transformation> transformations;

    /**
     * A class containing data and logic to help increase the speed of the search process of a previously found
     * transformation
     */
    protected class TransformationFoundRecord {
        //Transformation that incremented by this transformation.
        //A parent transformation of {1, 2, 3} is for example {1, 2}, {1, 3} or {2, 3}
        //Formally: Y is parent of X if Y subset of X
        private TransformationFoundRecord parent = null;

        //Transformation found just before this one
        //Used to have a linked list of previously built transformations.
        private TransformationFoundRecord previous = null;

        //Index of the transformations taken from the pool of transformations that conforms this multisosie
        ArrayList<Integer> transformation;

        private int incrementalSeries;

        //Known status of this transformation
        int status = Transformation.SOSIE;

        int myHashCode = 0;

        public TransformationFoundRecord(TransformationFoundRecord parent, TransformationFoundRecord previous, int status) {
            setParentAndPrevious(parent, previous);
            this.status = status;
        }

        public TransformationFoundRecord(Integer[] indexes, TransformationFoundRecord parent, TransformationFoundRecord previous) {
            transformation = new ArrayList<>(Arrays.asList(indexes));
            setParentAndPrevious(parent, previous);
        }

        public void setParentAndPrevious(TransformationFoundRecord parent, TransformationFoundRecord previous) {
            this.setPrevious(previous);
            this.setParent(parent);

        }

        @Override
        public boolean equals(Object p) {
            ArrayList<Integer> t = ((TransformationFoundRecord) p).transformation;
            if (t.size() != transformation.size()) return false;
            for (Integer ti : t) {
                if (!transformation.contains(ti)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int hashCode() {
            if (myHashCode == 0) {
                if (transformation == null) return 0;
                for (Integer i : transformation) {
                    myHashCode += i * 17;
                }
                myHashCode %= 5009;
            }

            return myHashCode;
        }

        public void setIncrementalSeries(int incrementalSeries) {
            if ( getParent() != null && getParent().getIncrementalSeries() != incrementalSeries ) {
                throw new RuntimeException("the series number mismatch!!");
            }
            this.incrementalSeries = incrementalSeries;
        }

        /**
         * Series number of the transformation found. A redundant data to help improve robustness.
         */
        public int getIncrementalSeries() {
            return incrementalSeries;
        }

        public TransformationFoundRecord getParent() {
            return parent;
        }

        public void setParent(TransformationFoundRecord parent) {
            this.parent = parent;
            if ( this.parent != null ) {
                this.incrementalSeries = this.parent.incrementalSeries;
            }
        }

        public TransformationFoundRecord getPrevious() {
            return previous;
        }

        public void setPrevious(TransformationFoundRecord previous) {
            this.previous = previous;
        }
    }

    /**
     * Status of the last transformation found. Querys may use this information to optimize further exploration of
     * the search space
     */
    private int lastTransformationStatus = Transformation.SOSIE;

    /**
     * Multipoint transformations may be (parent/child) related.
     *
     * The incremental series number helps to identify parents and childs obtained in different runs
     */
    protected int lastIncrementalSeries = 0;

    protected HashMap<Integer, HashSet<TransformationFoundRecord>> transformationFounds;


    public boolean isCleanSeriesOnly() {
        return cleanSeriesOnly;
    }

    public void setCleanSeriesOnly(boolean cleanSeriesOnly) {
        this.cleanSeriesOnly = cleanSeriesOnly;
    }

    /**
     * An small helper class to order sosies by their coverage
     */
    private class SosieWithCoverage {
        private List<Integer> coverage;

        private Transformation transformation;

        public SosieWithCoverage(Transformation t) {
            this.transformation = t;
            coverage = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Coverage size: " + coverage.size() + " " + this.transformation.toString();
        }
    }

    /**
     * Status of the last transformation found. Querys may use this information to optimize further exploration of
     * the search space
     */
    public int getLastTransformationStatus() {
        return lastTransformationStatus;
    }



    /**
     * Multipoint transformations may be (parent/child) related.
     *
     * The incremental series number helps to identify parents and childs obtained in different runs
     */
    public int getLastIncrementalSeries() {
        return lastIncrementalSeries;
    }

    /*
    public void setLastIncrementalSeries(int lastIncrementalSeries) {
        this.lastIncrementalSeries = lastIncrementalSeries;
    }
    */


    private boolean cleanSeriesOnly = true;

    /**
     * Sosies found from the transformation pool passed as paramethers.
     */
    protected Transformation getSosies(int index) {
        return sosies.get(index).transformation;
    }

    private ArrayList<SosieWithCoverage> sosies;

    //Indicates if the multi-sosies are locate incrementing a the previously found smaller multi-sosie
    private boolean incrementalSosiefication = true;

    //Last multisosie found
    protected TransformationFoundRecord prevRecord = null;

    //Last size of transformation elements we where ask to executeQuery for.
    protected int lastTransfSizeNOfElems = 0;

    //Increment of the last series number
    private boolean seriesIncrement = true;


    public void setLastTransformationStatus(int lastTransformationStatus) {
        this.lastTransformationStatus = lastTransformationStatus;
        if (prevRecord != null) {
            prevRecord.status = lastTransformationStatus;
        }
    }

    public KnownSosieQuery(InputProgram inputProgram, ArrayList<Transformation> transf) {
        super(inputProgram);
        transformationFounds = new HashMap<>();
        extractSosies(transf);
    }

    public KnownSosieQuery(InputProgram inputProgram) throws TransformationParserException {
        super(inputProgram);
        transformationFounds = new HashMap<>();
        TransformationJsonParser parser = new TransformationJsonParser(false, getInputProgram());
        File f = new File(getInputProgram().getPreviousTransformationsPath());
        Collection<Transformation> ts;
        if (f.isDirectory()) {
            ts = parser.parseDir(f.getAbsolutePath());
        } else {
            ts = parser.parseFile(f);
        }
        extractSosies(ts);
    }

    /**
     * Extracts the sosies from a transformation list. This method also extract the coverage report and sorts
     * the sosies by their coverage
     *
     * @param transf
     */
    private void extractSosies(Collection<Transformation> transf) {

        ICoverageReport coverageReport = getInputProgram().getCoverageReport();

        boolean coveragePresent = coverageReport != null && !(coverageReport instanceof NullCoverageReport);

        sosies = new ArrayList<>();

        for (Transformation t : transf) {
            if (t.isSosie()) {
                SosieWithCoverage c = new SosieWithCoverage(t);

                if (coveragePresent) {
                    //Distribution of this transformation transplant point
                    //each client creates a jacoco file, each one is assigned an index
                    c.coverage = coverageReport.getCoverageDistribution(((ASTTransformation) t).getTransplantationPoint());
                    Collections.sort(c.coverage);
                }
                //Don't add sosies without coverage in case such coverage exists
                if (!coveragePresent || c.coverage.size() > 0) {
                    sosies.add(c);
                }
            }
        }

        //Order the sosies from less covered to more covered. This way we increases the chances that an uniformly
        //distributed selection covers most of the clients
        if (coveragePresent) {
            Collections.sort(sosies, new Comparator<SosieWithCoverage>() {
                @Override
                public int compare(SosieWithCoverage o1, SosieWithCoverage o2) {
                    int sizeDiff = o1.coverage.size() - o2.coverage.size();
                    if (sizeDiff == 0) {
                        int i = 0;
                        while (i < o1.coverage.size() && o1.coverage.get(i) - o1.coverage.get(i) == 0) {
                            i++;
                        }
                        return i >= o1.coverage.size() ? sizeDiff : o1.coverage.get(i) - o1.coverage.get(i);
                    }
                    return sizeDiff;
                }
            });
        }
    }


    /**
     * Performs the search for transformations
     *
     * @throws SeveralTriesUnsuccessful when several unsuccessful attempts have been made to get the transformations
     */
    public void executeQuery() {
        int max = 100;
        Exception[] causes = new Exception[max];
        int trials = 0;
        boolean failed = true;
        while (trials < max && failed)
            try {
                //The amount of transformations are given in the executeQuery by the InputProgram
                transformations = query(getInputProgram().getTransformationPerRun());
                failed = false;
            } catch (QueryException qe) {
                if ( qe.getReason().equals(QueryException.Reasons.UNABLE_TO_FIND_SOSIE_PARENT) ) {
                    //We cannot recover from this one. No use to try
                    causes[0] = qe;
                    trials = max + 1;
                }
            } catch (Exception e) {
                Log.warn("Unable to executeQuery: " + e.getMessage());
                causes[trials] = e;
                failed = true;
                trials++;
            }

        if (trials >= max) {
            throw new SeveralTriesUnsuccessful(causes);
        }
    }

    /**
     * Tells if a similar transformation has been already found
     *
     * @param tf   transformation found
     * @param size Size of transformation asked by the users.
     *             This size may vary from the actual size of the transformation
     * @return true if already found
     */
    protected boolean alreadyFound(int size, TransformationFoundRecord tf) {

        if (!transformationFounds.containsKey(size)) {
            HashSet<TransformationFoundRecord> h = new HashSet<>();
            h.add(tf);
            transformationFounds.put(size, h);
            return false;
        } else if (transformationFounds.get(size).contains(tf)) {
            return true;
        } else {
            transformationFounds.get(size).add(tf);
            return false;
        }
    }

    /**
     * Returns the list of found transformations a collection of transformations
     *
     * @return
     * @throws Exception
     */
    public Collection<Transformation> getMultiTransformations() {
        return transformations;
    }

    @Override
    public Transformation query() throws QueryException {
        return null;
    }

    /**
     * Estimate the max number of multisosie transformations
     */
    private long maxNumberOfTransformations(int nb) {

        long z = sosies.size();
        long max = z;
        for (int i = 0; i < nb - 1; i++) {
            z--;
            long preMax = max * z;
            //Avoid overflow
            if (preMax < 0) return Long.MAX_VALUE;
            max = preMax;
        }

        z = nb;
        for (int i = nb; i > 1; i--) {
            nb--;
            z = z * nb;
        }
        return max / z;
    }

    /**
     * Finds an sosie transformation to increment (inherit from)
     *
     * @param nb Current transformation size
     * @return An integer array with the index of the single-transformations forming the multi-transformation
     * @throws QueryException
     */
    private Integer[] initIncrementalTransformation(int nb) throws QueryException {
        Integer[] indexes = new Integer[nb];

        //Create the linked list data structure to allow incremental multisosies
        if (incrementalSosiefication && prevRecord != null) {
            ArrayList<Integer> tf = null;

            do {
                if (lastTransfSizeNOfElems != nb) {
                    seriesIncrement = false;
                    //This means that we have changed the transformation size and therefore we must use
                    //the previously found multisosie as the parent of the current transformation
                    if (isCleanSeriesOnly() && prevRecord.status != Transformation.SOSIE) {
                        //The last transformation was not a sosie. Create an empty slot and continue search
                        prevRecord = new TransformationFoundRecord(
                                prevRecord, null, prevRecord.status);
                        //Since we create and empty slot we are not longer on the edge
                        lastTransfSizeNOfElems = nb;
                    } else {
                        tf = prevRecord.transformation;
                    }
                } else if (prevRecord.getParent() != null) {

                    if (prevRecord.getParent().getPrevious() == null) {
                        //Special case when we reach the end of the previous sosie list
                        // and we are still searching for new sosies
                        throw new QueryException(QueryException.Reasons.UNABLE_TO_FIND_SOSIE_PARENT);
                    }

                    //On the other hand we may continue creating multisosies incrementing an existing one

                    int s = prevRecord.getParent().getPrevious().status;
                    if (isCleanSeriesOnly() && s != Transformation.SOSIE) {
                        //The last transformation was not a sosie. Create an empty slot and continue search
                        prevRecord = new TransformationFoundRecord(
                                prevRecord.getParent().getPrevious(),
                                prevRecord, s);
                    } else {
                        tf = prevRecord.getParent().getPrevious().transformation;
                    }
                }
            } while (!(tf != null ||
                    prevRecord.getParent() == null ||
                    prevRecord.getParent().getPrevious() == null));

            //We found none... go boom
            if (tf == null &&
                    prevRecord.getParent() != null &&
                    prevRecord.getParent().getPrevious() == null) {
                throw new QueryException(QueryException.Reasons.UNABLE_TO_FIND_SOSIE_PARENT);
            }

            //Copy the parent transformations and index in the pool of transformations
            if (tf != null) {
                for (int i = 0; i < tf.size(); i++) {
                    transformations.add(getSosies(tf.get(i)));
                    indexes[i] = tf.get(i);
                }
            }
        }

        return indexes;
    }


    /**
     * Completes the incremental transformation process
     *
     * @param nb      Current transformation size
     * @param indexes Indexes of the transformations found
     * @param tf      Transformations found
     * @param f
     */
    private void completeIncrementalTransformation(int nb, Integer[] indexes,
                                                   ArrayList<Transformation> tf, TransformationFoundRecord f) {
        //Linking list mechanism to know the parent of a multisosie
        if (prevRecord == null) {
            prevRecord = f;
        } else if (lastTransfSizeNOfElems != nb) {
            prevRecord = new TransformationFoundRecord(indexes, prevRecord, null);
        } else if (prevRecord.getParent() == null) {
            prevRecord = new TransformationFoundRecord(indexes, null, prevRecord);
            if (seriesIncrement) {
                lastIncrementalSeries += 1;
            }
            prevRecord.setIncrementalSeries(lastIncrementalSeries);
        } else {
            prevRecord = new TransformationFoundRecord(indexes, prevRecord.getParent().getPrevious(), prevRecord);
        }
        transformations = tf;


        //prevRecord.setIncrementalSeries(lastIncrementalSeries);
    }

    @Override
    public List<Transformation> query(int nb) throws QueryException {

        //Update the incremental series number
        if (prevRecord == null) lastIncrementalSeries = 0;

        transformations = new ArrayList();
        //Integer[] indexes = new Integer[nb];

        Integer[] indexes = initIncrementalTransformation(nb);

        Random r = new Random();

        //Don't create a sosie bigger than the sosie pool. Duh!
        if (nb > sosies.size()) nb = sosies.size();

        long maxTransfNumbers = maxNumberOfTransformations(nb);

        int transAttempts = 0;

        boolean found = true;

        //Try several times searching for a transformation we haven't found before.
        while (found && transAttempts < maxTransfNumbers) {

            int attempts = 0;
            ArrayList<Transformation> tf = new ArrayList<>(transformations);
            int i = tf.size();
            Arrays.fill(indexes, tf.size(), indexes.length, -1);

            //Build the transformation
            while (tf.size() < nb && attempts < sosies.size()) {
                int index = r.nextInt(sosies.size());
                Transformation t = getSosies(index);
                if (canBeMerged(t)) {
                    indexes[i] = index;
                    i++;
                    tf.add(t);
                }
                attempts++;
            }
            TransformationFoundRecord f = new TransformationFoundRecord(indexes, null, null);
            //See if the transformation was already found
            found = alreadyFound(nb, f);
            if (!found) {
                completeIncrementalTransformation(nb, indexes, tf, f);

                //Log the transformation found in the run
                try {
                    StringBuilder sb = new StringBuilder();
                    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("multisosiesfound.txt", true)));
                    if (transformationFounds.get(nb).size() > 1) {
                        sb.append(" Status: ").append(getLastTransformationStatus());
                    }
                    sb.append("\n Serie:: ").append(prevRecord.getIncrementalSeries()).append(". Transf::");
                    for (int k = 0; k < indexes.length && indexes[k] > -1; k++) {
                        sb.append(indexes[k]).append(", ");
                    }
                    out.println(sb.toString());
                    out.close();
                } catch (IOException e) {
                    //Nothing to do here
                }
            }
            transAttempts++;
        }

        if (transAttempts >= maxTransfNumbers) {
            throw new MaxNumberOfAttemptsReach(maxTransfNumbers, transAttempts);
        }

        lastIncrementalSeries = prevRecord.getIncrementalSeries();

        lastTransfSizeNOfElems = nb;

        return transformations;
    }


    /**
     * Indicates if the transformation can be merged with the current ones
     *
     * @param t
     * @return
     */
    protected boolean canBeMerged(Transformation t) {

        //Avoid sosies already in the transformation
        boolean result = !transformations.contains(t);

        //Get the class name of the transformation
        ASTTransformation ast = (ASTTransformation) t;
        String classFileT = ast.getTransplantationPoint().getCompilationUnit().getFile().getName();

        //Avoid sosies in the same class
        for (int i = 0; i < transformations.size() && result; i++) {
            ASTTransformation a = (ASTTransformation) transformations.get(i);
            String classFileA = a.getTransplantationPoint().getCompilationUnit().getFile().getName();
            result = result && !classFileA.equals(classFileT);
        }

        return result;
    }

    /**
     * Uses sosies from previous runs
     */
    public boolean getIncrementalSosiefication() {
        return incrementalSosiefication;
    }

    public void setIncrementalSosiefication(boolean incrementalSosiefication) {
        this.incrementalSosiefication = incrementalSosiefication;
    }

    /**
     * Returns the sosies found from the pool of transformations
     *
     * @return
     */
    public ArrayList<Transformation> getSosies() {
        ArrayList<Transformation> result = new ArrayList<>();
        for (SosieWithCoverage s : sosies) {
            result.add(s.transformation);
        }
        return result;
    }
}
