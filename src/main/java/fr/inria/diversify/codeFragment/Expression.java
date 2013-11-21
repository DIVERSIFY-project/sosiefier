package fr.inria.diversify.codeFragment;

import spoon.reflect.code.CtExpression;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 4:53 PM
 */
public class Expression extends CodeFragment {

    public Expression(CtExpression<?> expression) {
        codeFragment = expression;
        init(expression);
    }

    public Expression() {}

    public void init(Object expression) {
        codeFragment = (CtExpression)expression;
        init();
    }

    public String codeFragmentString() {
        return codeFragment.toString();
    }

    @Override
    public boolean isReplace(CodeFragment other, boolean varNameMatch) {
        return context.isReplace(other.context, varNameMatch);
//        return getInputContext().isInclude(other.getInputContext()) && getOutputContext().equals(other.getOutputContext());
    }
}
