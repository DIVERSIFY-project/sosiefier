package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
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
     */
    public void query() {
        transformations = query(getInputProgram().getTransformationPerRun());
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
