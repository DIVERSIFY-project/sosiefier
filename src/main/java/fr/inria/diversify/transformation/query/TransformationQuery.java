package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;

import java.util.*;

/**
 * Super class for all transformation queries. The query is in charge of search transplantation points (pots) and
 * transformations to transplant
 *
 * User: Simon
 * Date: 07/11/13
 * Time: 18:09
 */
public abstract class TransformationQuery {

    protected class TransformationFound {

        ArrayList<Integer> transformation;

        int myHashCode = 0;

        public TransformationFound(Integer[] indexes) {
            transformation = new ArrayList<>(Arrays.asList(indexes));
        }


        @Override
        public boolean equals(Object p) {
            ArrayList<Integer> t = ((TransformationFound) p).transformation;
            if ( t.size() != transformation.size() ) return false;
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

    private HashSet<TransformationFound> transformationFounds;

    protected String type;

    private InputProgram inputProgram;

    List<Transformation> transformations;

    public TransformationQuery(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
        transformationFounds = new HashSet<>();
    }

    public abstract void setType(String type);

    public Transformation buildTransformation() {
        return query(1).get(0);
    }

    /**
     * Clears the transformations founds
     */
    public void clearTransformationFounds() {
        transformationFounds.clear();
    }

    /**
     * Search for at most nb transformations
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
        while ( trials < 10 && failed)
            try {
                //The amount of transformations are given in the query by the InputProgram
                transformations = query(getInputProgram().getTransformationPerRun());
                failed = false;
            } catch ( Exception e ) {
                causes[trials] = e;
                failed = true;
                trials++;
            }
        if ( trials >= 10 ) { throw new SeveralTriesUnsuccessful(causes); }
    }

    /**
     * Tells you if you already found a similar transformation
     * @param indexes transformation indexes found
     * @return true if already found
     */
    protected boolean alreadyFound(Integer[] indexes) {
        TransformationFound tf = new TransformationFound(indexes);
        if (transformationFounds.contains(tf)) {
            return true;
        } else {
            transformationFounds.add(tf);
            return false;
        }
    }

    /**
     * Returns the list of found transformations a collection of transformations
     * @return
     * @throws Exception
     */
    public Collection<Transformation> getTransformations() {
        return transformations;
    }

    public InputProgram getInputProgram() {
        return inputProgram;
    }
}
