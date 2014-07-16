package fr.inria.diversify.transformation.query;

import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.transformation.ast.ASTTransformation;

import java.io.File;
import java.util.*;

/**
 * Search for points of known sosies
 * <p/>
 * Created by marcel on 6/06/14.
 */
public class KnownSosieQuery extends TransformationQuery {



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
    }

    /**
     * Sosies found from the transformation pool passed as paramethers.
     */
    protected Transformation getSosies(int index) {
        return sosies.get(index).transformation;
    }

    private ArrayList<SosieWithCoverage> sosies;

    //Indicates if the multi-sosies are build incrementing a the previously found smaller multi-sosie
    private boolean incrementalSosiefication = true;

    //Last multisosie found
    protected TransformationFound prevMultiSosieFound = null;

    //Last size of transformation elements we where ask to query for.
    protected int lastTransfSizeNOfElems = 0;


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

        sosies = new ArrayList<>();

        for (Transformation t : transf) {
            if (t.isSosie()) {
                SosieWithCoverage c = new SosieWithCoverage(t);
                sosies.add(c);
                if (coverageReport != null) {
                    //Distribution of this transformation transplant point
                    //each client creates a jacoco file, each one is assigned an index
                    c.coverage = coverageReport.getCoverageDistribution(((ASTTransformation) t).getTransplantationPoint());
                    Collections.sort(c.coverage);
                }
            }
        }
        //Order the sosies from less covered to more covered. This way we increases the chances that an uniformly
        //distributed selection covers most of the clients
        if (coverageReport != null) {
            Collections.sort(sosies, (o1, o2) -> {
                int sizeDiff = o1.coverage.size() - o2.coverage.size();
                if (sizeDiff == 0) {
                    int i = 0;
                    while (i < o1.coverage.size() && o1.coverage.get(i) - o1.coverage.get(i) == 0) {
                        i++;
                    }
                    return o1.coverage.get(i) - o1.coverage.get(i);
                }
                return sizeDiff;
            });
        }
    }

    @Override
    public void setType(String type) {

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

    @Override
    public List<Transformation> query(int nb) {

        transformations = new ArrayList();
        Integer[] indexes = new Integer[nb];

        //Create the linked list data structure to allow incremental multisosies
        if (incrementalSosiefication && prevMultiSosieFound != null) {
            ArrayList<Integer> tf = null;
            if (lastTransfSizeNOfElems != nb) {
                //This means that we have changed the transformation size and therefore we must use
                //the previously found multisosie as the parent of the current transformation
                tf = prevMultiSosieFound.transformation;
            } else if (prevMultiSosieFound.parent != null) {
                //On the other hand we may continue creating multisosies incrementing an existing one
                tf = prevMultiSosieFound.parent.previous.transformation;
            }
            //Copy the parent transformations and index in the pool of transformations
            if (tf != null) {
                for (int i = 0; i < tf.size(); i++) {
                    transformations.add(getSosies(tf.get(i)));
                    indexes[i] = tf.get(i);
                }
            }
        }

        Random r = new Random();

        //Don't create a sosie bigger than the sosie pool duh!
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

            //See if the transformation was already found
            found = alreadyFound(nb, prevMultiSosieFound);
            if (!found) {
                //Linking list mechanism to know the parent of a multisosie
                if (prevMultiSosieFound == null) {
                    prevMultiSosieFound = new TransformationFound(indexes, null, null);
                } else if (lastTransfSizeNOfElems != nb) {
                    prevMultiSosieFound = new TransformationFound(indexes, prevMultiSosieFound, null);
                } else if (prevMultiSosieFound.parent == null) {
                    prevMultiSosieFound = new TransformationFound(indexes, null, prevMultiSosieFound);
                } else {
                    prevMultiSosieFound = new TransformationFound(indexes, prevMultiSosieFound.parent.previous, prevMultiSosieFound);
                }
                transformations = tf;
            }
            transAttempts++;
        }

        if (transAttempts >= maxTransfNumbers) {
            throw new MaxNumberOfAttemptsReach(maxTransfNumbers, transAttempts);
        }

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

        boolean result = true;
        ASTTransformation ast = (ASTTransformation) t;
        String classFileT = ast.getTransplantationPoint().getCompilationUnit().getFile().getName();
        for (int i = 0; i < transformations.size() && result; i++) {
            ASTTransformation a = (ASTTransformation) transformations.get(i);
            String classFileA = a.getTransplantationPoint().getCompilationUnit().getFile().getName();
            result &= result && !classFileA.equals(classFileT);
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
     * @return
     */
    public ArrayList<Transformation> getSosies() {
        ArrayList<Transformation> result = new ArrayList<>();
        for ( SosieWithCoverage s: sosies) {
            result.add(s.transformation);
        }
        return result;
    }
}
