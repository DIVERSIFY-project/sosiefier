package fr.inria.diversify.transformation.mutation;

import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtReturn;
/**
 * User: Simon
 * Date: 17/02/14
 * Time: 17:29
 */
public class ReturnValueMutation extends MutationTransformation<CtReturn, CtReturn> {

    public  ReturnValueMutation(CtReturn transplantationPoint) {
        super(transplantationPoint);
        type = "mutation";
        name = "returnValue";
    }

    @Override
    public void buildTransplant()  {
        CtLiteral literal = (CtLiteral) transplantationPoint.getReturnedExpression();
        String type = literal.getType().getSimpleName();

        CtLiteral newLiteral = transplantationPoint.getFactory().Core().clone(literal);

        if(type.equals("boolean")) {
            newLiteral.setValue(!((Boolean)literal.getValue()));
        } else if(type.equals("short")) {
            newLiteral.setValue(((Short)literal.getValue() + 1));
        } else if(type.equals("int")) {
            newLiteral.setValue(((Integer)literal.getValue() + 1));
        } else if(type.equals("long")) {
            newLiteral.setValue(((Long)literal.getValue() + 1));
        } else if(type.equals("byte")) {
            newLiteral.setValue(((Byte)literal.getValue() + 1));
        } else if(type.equals("float")) {
            newLiteral.setValue(((Float)literal.getValue() + 1.0f));
        } else if(type.equals("double")) {
            newLiteral.setValue(((Double)literal.getValue() + 1.0d));
        }

        transplant = transplantationPoint.getFactory().Core().clone(transplantationPoint);
        transplant.setReturnedExpression(newLiteral);
    }

}
