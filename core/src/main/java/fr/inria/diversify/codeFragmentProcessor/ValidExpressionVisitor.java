package fr.inria.diversify.codeFragmentProcessor;

import spoon.reflect.code.*;
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

    @Override
    public <T> void visitCtVariableRead(CtVariableRead<T> variableRead) {
        if(variableRead == root)
            valid = false;
        super.visitCtVariableRead(variableRead);
    }

    @Override
    public <T> void visitCtVariableWrite(CtVariableWrite<T> variableWrite) {
        if(variableWrite == root)
            valid = false;
        super.visitCtVariableWrite(variableWrite);
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
