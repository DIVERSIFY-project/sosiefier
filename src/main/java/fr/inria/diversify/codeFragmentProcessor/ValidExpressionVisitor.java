package fr.inria.diversify.codeFragmentProcessor;

import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.visitor.CtScanner;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 4:59 PM
 */
public class ValidExpressionVisitor extends CtScanner {
    protected boolean valid = true;
    protected CtExpression root;



    public boolean isValid(){
        return valid;
    }

    public ValidExpressionVisitor(CtExpression e) {
        root = e;
    }


    public <T> void visitCtLocalVariable(CtLocalVariable<T> localVariable) {
        if(localVariable == root)
            valid = false;
        super.visitCtLocalVariable(localVariable);
    }

    public <T> void visitCtVariableAccess(CtVariableAccess<T> variableAccess) {
        if(variableAccess == root)
            valid = false;
        super.visitCtVariableAccess(variableAccess);
    }

//    public <T> void visitCtLocalVariableReference(CtLocalVariableReference<T> reference) {
//        if(reference == root)
//            valid = false;
//    }

    public <T> void visitCtFieldAccess(CtFieldAccess<T> fieldAccess) {
        if(fieldAccess == root)
            valid = false;
    }




}
