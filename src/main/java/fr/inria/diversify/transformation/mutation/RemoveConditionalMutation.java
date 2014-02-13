package fr.inria.diversify.transformation.mutation;

import spoon.reflect.code.CtLiteral;
import spoon.reflect.factory.Factory;

/**
 * User: Simon
 * Date: 13/02/14
 * Time: 14:45
 */
public class RemoveConditionalMutation extends BinaryOperatorMutation{
    @Override
    protected CtLiteral getMutantOperator() {
        Factory factory = operator.getFactory();
        return factory.Code().createLiteral(true);
    }

    @Override
    public String getType() {
        return "RemoveConditionalMutation";
    }
}
