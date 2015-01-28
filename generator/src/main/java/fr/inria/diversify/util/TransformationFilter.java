package fr.inria.diversify.util;

import fr.inria.diversify.transformation.SingleTransformation;

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

    public Set<SingleTransformation> filter(Collection<SingleTransformation> transformations) {
        Set<SingleTransformation> set = new HashSet<>();

        for(SingleTransformation trans: transformations) {
            if((type == null || trans.getType().equals(type))
                    && (name == null || trans.getName().equals(name))
                    && (transplantPosition == null || !trans.classLocationName().contains(transplantPosition))) {
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
