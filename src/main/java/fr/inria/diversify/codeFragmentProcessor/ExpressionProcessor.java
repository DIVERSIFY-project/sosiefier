package fr.inria.diversify.codeFragmentProcessor;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.Expression;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtExpression;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 4:50 PM
 */
public class ExpressionProcessor   extends AbstractProcessor<CtExpression<?>> {
    protected CodeFragmentList expressions;

    public  ExpressionProcessor() {
        expressions = new CodeFragmentList();
    }

    @Override
    public void process(CtExpression<?> element) {
        try {
            if(isValidStatement(element)) {
                Expression expr = new Expression(element);
                expressions.add(expr);
				System.out.println(expr);
				System.out.println(expr.getInputContext().equalString());
				System.out.println("-------------------------------\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected boolean isValidStatement(CtExpression<?> element) {
        ValidExpressionVisitor valid = new ValidExpressionVisitor(element);
        element.accept(valid);
        return valid.isValid();
    }
}
