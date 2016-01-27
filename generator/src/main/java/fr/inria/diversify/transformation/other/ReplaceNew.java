package fr.inria.diversify.transformation.other;

import fr.inria.diversify.transformation.SpoonTransformation;
import spoon.reflect.code.CtNewClass;
import spoon.reflect.factory.Factory;

/**
 * Created by Simon on 19/03/14.
 */
public class ReplaceNew extends SpoonTransformation<CtNewClass, CtNewClass> {


    @Override
    protected CtNewClass buildReplacementElement() {
        Factory factory = transplantationPoint.getFactory();

        return factory.Core().clone(transplant);
    }

}

