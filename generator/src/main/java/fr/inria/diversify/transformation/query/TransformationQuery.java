package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;

import java.util.*;

/**
 * Super class for all transformation queries.
 * <p/>
 * User: Simon
 * Date: 07/11/13
 * Time: 18:09
 */
public abstract class TransformationQuery {

    protected InputProgram inputProgram;


    public TransformationQuery(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    public abstract Transformation query() throws QueryException;


    /**
     * Search for at most nb transformations
     *
     * @param nb
     */
    public List<Transformation> query(int nb) throws QueryException {
        try {
            List<Transformation> result = new ArrayList<>();
            for ( int j = 0; j < nb; j++ ) {
                result.add(query());
            }
            return result;
        } catch (Exception e) {
            throw new QueryException(e);
        }
    }

    public InputProgram getInputProgram() {
        return inputProgram;
    }

    public boolean hasNextTransformation() {
        return true;
    }

    public void currentTransformationEnd() {

    }
}
