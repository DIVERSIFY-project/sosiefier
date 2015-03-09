package fr.inria.diversify.util;

import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.Transformation;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Simon on 27/11/14.
 */
public class TransformationFilter {
    String type;
    String name;
    String transplantPosition;

    public Set<Transformation> filter(Collection<Transformation> transformations) {
        Set<Transformation> set = new HashSet<>();

        for(Transformation trans: transformations) {
            if((type == null || trans.getType().equals(type))
                    && (name == null || trans.getName().equals(name))
                    && (transplantPosition == null )) {
                set.add(trans);
            }
        }

        return set;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransplantPosition(String transplantPosition) {
        this.transplantPosition = transplantPosition;
    }
}
