package fr.inria.diversify.codeFragmentProcessor;

import fr.inria.diversify.codeFragment.Expression;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtExpression;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 4:50 PM
 */
public class ExpressionProcessor extends AbstractCodeFragmentProcessor<CtExpression<?>> {


    @Override
    public void process(CtExpression<?> element) {
        try {
            if(isValidStatement(element) && element.getPosition() != null)
                addCf(new Expression(element));
        } catch (Exception e) {
            Log.error("error in ExpressionProcessor with expression: "+element, e);
        }
    }

    protected boolean isValidStatement(CtExpression<?> element) {
        ValidExpressionVisitor valid = new ValidExpressionVisitor(element);
        element.accept(valid);
        return valid.isValid();
    }
}
