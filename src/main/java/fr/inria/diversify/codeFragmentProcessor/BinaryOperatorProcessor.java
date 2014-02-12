package fr.inria.diversify.codeFragmentProcessor;

import spoon.reflect.code.CtBinaryOperator;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 12/02/14
 * Time: 11:32
 */
public class BinaryOperatorProcessor extends AbstractCodeFragmentProcessor<CtBinaryOperator<?>> {
    protected List<CtBinaryOperator<?>> binaryOperators;

    public BinaryOperatorProcessor() {
        binaryOperators = new ArrayList<CtBinaryOperator<?>>();
    }

    @Override
    public void process(CtBinaryOperator<?> element) {
        binaryOperators.add(element);
    }

    public List<CtBinaryOperator<?>> getBinaryOperators() {
        return binaryOperators;
    }
}
