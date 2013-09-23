package fr.inria.diversify.codeFragment;

import spoon.reflect.code.CtExpression;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 4:53 PM
 */
public class Expression extends CodeFragment{

    public Expression(CtExpression<?> expression) {
        codeFragment = expression;
        init(expression);
    }

    public Expression() {}

    public void init(Object expression) {
        codeFragment = (CtExpression)expression;
        init();
    }

    @Override
    public boolean isReplace(CodeFragment other) {
        Class<?> cl = codeFragment.getClass();
        Class<?> clOther = other.codeFragment.getClass();

//        if(clOther != cl )
//            return false;
//
//        SubStatementVisitor sub = new SubStatementVisitor()  ;
//        other.codeFragment.getParent().accept(sub);
//        if(sub.getStatements().contains(codeFragment))
//            return false;

        return getInputContext().isInclude(other.getInputContext()) && getOutputContext().equals(other.getOutputContext());
    }
}
