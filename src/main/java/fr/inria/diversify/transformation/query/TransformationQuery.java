package fr.inria.diversify.transformation.query;

import fr.inria.diversify.transformation.Transformation;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * User: Simon
 * Date: 07/11/13
 * Time: 18:09
 */
public abstract class TransformationQuery {

//    public abstract void setNbTransformation(int n);
    public abstract void setType(String type);

    public abstract Transformation getTransformation() throws Exception;

    public Set<Transformation> getTransformations(int nb) throws Exception {
        HashSet<Transformation> set = new HashSet<Transformation>();

        while (set.size() < nb)
            set.add(getTransformation());

        return set;
    }

}
