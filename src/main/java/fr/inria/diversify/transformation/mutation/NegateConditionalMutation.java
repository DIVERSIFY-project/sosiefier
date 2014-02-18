package fr.inria.diversify.transformation.mutation;

import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.factory.Factory;

/**
 * User: Simon
 * Date: 13/02/14
 * Time: 14:44
 */
public class NegateConditionalMutation extends BinaryOperatorMutation {

    public NegateConditionalMutation() {
        type = "mutation";
        name = "negateConditional";
    }

    @Override
    protected CtBinaryOperator getMutantOperator() {
        Factory factory = operator.getFactory();
        CtBinaryOperator mutant = factory.Code().createBinaryOperator(operator.getLeftHandOperand(), operator.getRightHandOperand(), operator.getKind());

        mutant.setParent(operator.getParent());

        BinaryOperatorKind kind = operator.getKind();
        if(kind.equals(BinaryOperatorKind.EQ))
            mutant.setKind(BinaryOperatorKind.NE);
        if(kind.equals(BinaryOperatorKind.NE))
            mutant.setKind(BinaryOperatorKind.EQ);

        if(kind.equals(BinaryOperatorKind.LE))
            mutant.setKind(BinaryOperatorKind.GT);
        if(kind.equals(BinaryOperatorKind.GE))
            mutant.setKind(BinaryOperatorKind.LT);

        if(kind.equals(BinaryOperatorKind.LT))
            mutant.setKind(BinaryOperatorKind.GE);
        if(kind.equals(BinaryOperatorKind.GT))
            mutant.setKind(BinaryOperatorKind.LE);

        return mutant;
    }
}
