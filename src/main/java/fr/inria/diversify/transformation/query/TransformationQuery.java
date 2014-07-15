package fr.inria.diversify.transformation.query;

import fr.inria.diversify.coverage.CoverageSourcePosition;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.cu.SourcePosition;

import java.util.*;

/**
 * Super class for all transformation queries. The query is in charge of search transplantation points (pots) and
 * transformations to transplant
 * <p/>
 * User: Simon
 * Date: 07/11/13
 * Time: 18:09
 */
public abstract class TransformationQuery {



    protected class TransformationFound {
        //Transformation that this transformation increments.
        //A parent transformation of {1, 2, 3} is for example {1, 2}, {1, 3} or {2, 3}
        //Formally: Y is parent of X if Y subset of X
        TransformationFound parent = null;

        //Transformation found just before this one
        //Used to have a linked list of previously built transformations.
        TransformationFound previous = null;

        //Index of the transformations taken from the pool of transformations that conforms this multisosie
        ArrayList<Integer> transformation;

        int myHashCode = 0;

        public TransformationFound(Integer[] indexes, TransformationFound parent, TransformationFound previous) {
            transformation = new ArrayList<>(Arrays.asList(indexes));
            this.previous = previous;
            this.parent = parent;
        }

        @Override
        public boolean equals(Object p) {
            ArrayList<Integer> t = ((TransformationFound) p).transformation;
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

    }

    //The code coverage that we have for the current project
    private ArrayList<CoverageSourcePosition> codeCoverage;

    protected HashMap<Integer, HashSet<TransformationFound>> transformationFounds;

    protected String type;

    private InputProgram inputProgram;

    List<Transformation> transformations;

    /**
     * Current trial in the simulation. Queries may want to know this to do incremental search in the space
     */
    private int currentTrial;

    public TransformationQuery(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
        transformationFounds = new HashMap<>();
    }

    public abstract void setType(String type);

    public Transformation buildTransformation() {
        return query(1).get(0);
    }


    //public void prepareForNextTransformationSize()

    /**
     * Search for at most nb transformations
     *
     * @param nb
     */
    public abstract List<Transformation> query(int nb);

    /**
     * Performs the search for transformations
     *
     * @throws SeveralTriesUnsuccessful when several unsuccessful attempts have been made to get the transformations
     */
    public void query() {
        Exception[] causes = new Exception[10];
        int trials = 0;
        boolean failed = true;
        while (trials < 10 && failed)
            try {
                //The amount of transformations are given in the query by the InputProgram
                transformations = query(getInputProgram().getTransformationPerRun());
                failed = false;
            } catch (Exception e) {
                causes[trials] = e;
                failed = true;
                trials++;
            }
        if (trials >= 10) {
            throw new SeveralTriesUnsuccessful(causes);
        }
    }

    /**
     * Tells you if you already found a similar transformation
     *
     * @param tf      transformation found
     * @param size    Size of transformation asked by the users.
     *                This size may vary from the actual size of the transformation
     * @return true if already found
     */
    protected boolean alreadyFound(int size, TransformationFound tf) {

        if (!transformationFounds.containsKey(size)) {
            HashSet<TransformationFound> h = new HashSet<>();
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
    public Collection<Transformation> getTransformations() {
        return transformations;
    }

    public InputProgram getInputProgram() {
        return inputProgram;
    }


    /**
     * The code coverage that we have for the current project
     */
    public ArrayList<CoverageSourcePosition> getCodeCoverage() {
        return codeCoverage;
    }

    public void setCodeCoverage(ArrayList<CoverageSourcePosition> codeCoverage) {
        this.codeCoverage = codeCoverage;
    }
}
