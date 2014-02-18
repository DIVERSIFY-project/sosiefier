package fr.inria.diversify.codeFragmentProcessor;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtReturn;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 18/02/14
 * Time: 11:14
 */
public class ReturnProcessor extends AbstractProcessor<CtReturn> {

    protected List<CtReturn> returns;

    public ReturnProcessor() {
        returns = new ArrayList<CtReturn>();
    }

    @Override
    public void process(CtReturn candidate) {
        returns.add(candidate);
    }

    public boolean isToBeProcessed(CtReturn candidate) {
        try {
            CtLiteral literal = (CtLiteral)candidate.getReturnedExpression();
            String type = literal.getType().getSimpleName();
            return type.equals("boolean") || type.equals("short") ||
                    type.equals("int") || type.equals("long") ||
                    type.equals("byte") || type.equals("float") ||
                    type.equals("double");

        } catch (Exception e) {
            return false;
        }
    }

    public List<CtReturn> getReturns() {
        return returns;
    }
}
