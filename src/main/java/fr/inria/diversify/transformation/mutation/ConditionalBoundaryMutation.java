package fr.inria.diversify.transformation.mutation;

import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.factory.Factory;


/**
 * User: Simon
 * Date: 11/02/14
 * Time: 11:47
 */
public class ConditionalBoundaryMutation extends BinaryOperatorMutation {

    public ConditionalBoundaryMutation() {
        name = "conditionalBoundary";
        type = "mutation";
    }

    protected CtBinaryOperator getMutantOperator() {
        Factory factory = transformationPoint.getFactory();
        CtBinaryOperator mutant = factory.Code().createBinaryOperator(transformationPoint.getLeftHandOperand(), transformationPoint.getRightHandOperand(), transformationPoint.getKind());

        mutant.setParent(transformationPoint.getParent());

        BinaryOperatorKind kind = transformationPoint.getKind();
        if(kind.equals(BinaryOperatorKind.LT))
            mutant.setKind(BinaryOperatorKind.LE);
        if(kind.equals(BinaryOperatorKind.LE))
            mutant.setKind(BinaryOperatorKind.LT);
        if(kind.equals(BinaryOperatorKind.GT))
            mutant.setKind(BinaryOperatorKind.GE);
        if(kind.equals(BinaryOperatorKind.GE))
            mutant.setKind(BinaryOperatorKind.GT);
        return mutant;
    }
}
