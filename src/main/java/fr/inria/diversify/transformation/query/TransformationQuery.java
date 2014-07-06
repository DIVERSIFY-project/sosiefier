package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.SeveralTriesUnsuccessful;
import fr.inria.diversify.transformation.Transformation;

import java.util.Collection;
import java.util.List;

/**
 * Super class for all transformation queries. The query is in charge of search transplantation points (pots) and
 * transformations to transplant
 *
 * User: Simon
 * Date: 07/11/13
 * Time: 18:09
 */
public abstract class TransformationQuery {
    protected String type;

    private InputProgram inputProgram;

    List<Transformation> transformations;

    public TransformationQuery(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    public abstract void setType(String type);

    public Transformation buildTransformation() {
        return query(1).get(0);
    }

    /**
     * Search for at most nb transformations
     * @param nb
     */
    public abstract List<Transformation> query(int nb);

    /**
     * Performs the search for transformations
     *
     * @throws fr.inria.diversify.transformation.SeveralTriesUnsuccessful when several unsuccessful attempts have been made to get the transformations
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
