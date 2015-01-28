package fr.inria.diversify.transformation.query;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.coverage.NullCoverageReport;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.transformation.ast.ASTTransformation;

import java.io.*;
import java.util.*;

/**
 * Search for points of known sosies
 * <p/>
 * Created by marcel on 6/06/14.
 */
public class KnownSosieQuery extends TransformationQuery {

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

    @Override
    public void setLastTransformationStatus(int lastTransformationStatus) {
        super.setLastTransformationStatus(lastTransformationStatus);
        if (prevRecord != null) {
            prevRecord.status = lastTransformationStatus;
        }
    }

    public KnownSosieQuery(InputProgram inputProgram, ArrayList<Transformation> transf) {
        super(inputProgram);
        extractSosies(transf);
    }

    public KnownSosieQuery(InputProgram inputProgram) throws TransformationParserException {
        super(inputProgram);
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

        /*
        HashSet<String> setPos = new HashSet<>();
        ArrayList<SosieWithCoverage> overlap = new ArrayList<>();

        for ( int i = sosies.size() - 1; i >= 0; i-- ) {
            String pos = ((ASTTransformation)sosies.get(i).transformation).
                    getTransplantationPoint().getCtCodeFragment().getPosition().toString();
            if ( !setPos.contains(pos) ) {
                System.out.println(sosies.get(i).coverage.size() + ", " + pos);
                setPos.add(pos);
            }
        }
        System.out.println("OverlapEnd");
        */
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public SingleTransformation query() throws QueryException {
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
                    if (isCleanSeriesOnly() && prevRecord.status != AbstractTransformation.SOSIE) {
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
                    if (isCleanSeriesOnly() && s != AbstractTransformation.SOSIE) {
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
