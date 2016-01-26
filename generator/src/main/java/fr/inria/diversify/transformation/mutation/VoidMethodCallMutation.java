package fr.inria.diversify.transformation.mutation;

import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtStatement;

/**
 * User: Simon
 * Date: 08/01/16
 * Time: 14:44
 */
public class VoidMethodCallMutation extends MutationTransformation<CtInvocation, CtStatement>{

    public VoidMethodCallMutation(CtInvocation transplantationPoint) {
        super(transplantationPoint);
    }

    @Override
    protected void buildTransplant() {
        transplant = transplantationPoint.getFactory().Code().createCodeSnippetStatement("//" + transplantationPoint.toString());
    }
}
