package fr.inria.diversify.transformation.query;

import fr.inria.diversify.transformation.Transformation;

import java.util.HashSet;
import java.util.Set;

/**
 * Super class for all transformation queries. The query is in charge of search transplantation points and build
 * transformations to transplant
 *
 * User: Simon
 * Date: 07/11/13
 * Time: 18:09
 */
public abstract class TransformationQuery {
    protected String type;

    public abstract void setType(String type);

    public abstract Transformation buildTransformation() throws Exception;

    public Set<Transformation> getTransformations(int nb) throws Exception {
        HashSet<Transformation> set = new HashSet<Transformation>();

        while (set.size() < nb)
            set.add(buildTransformation());

        return set;
    }

}
