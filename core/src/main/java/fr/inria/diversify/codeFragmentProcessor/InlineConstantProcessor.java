package fr.inria.diversify.codeFragmentProcessor;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtLocalVariable;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 18/02/14
 * Time: 15:10
 */
public class InlineConstantProcessor extends AbstractProcessor<CtLocalVariable> {
    protected List<CtLocalVariable> inlineConstant;


    public InlineConstantProcessor() {
        inlineConstant = new ArrayList<CtLocalVariable>();
    }

    @Override
    public void process(CtLocalVariable element) {
        inlineConstant.add(element);
    }

    public boolean isToBeProcessed(CtLocalVariable candidate) {
        try {
            CtLiteral literal = (CtLiteral)candidate.getDefaultExpression();
            String type = literal.getType().getSimpleName();
            return type.equals("boolean") || type.equals("short") ||
                    type.equals("int") || type.equals("long") ||
                    type.equals("byte") || type.equals("float") ||
                    type.equals("double");

        } catch (Exception e) {
            return false;
        }
    }

    public List<CtLocalVariable> getInlineConstant()  {
        return inlineConstant;
    }
}
