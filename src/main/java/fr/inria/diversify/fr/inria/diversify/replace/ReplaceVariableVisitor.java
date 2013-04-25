package fr.inria.diversify.fr.inria.diversify.replace;

import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.CtScanner;
import spoon.support.reflect.code.CtVariableAccessImpl;

/**
 * User: Simon
 * Date: 4/24/13
 * Time: 3:09 PM
 */
public class ReplaceVariableVisitor extends CtScanner {
    protected Object oldVar;
    protected Object newVar;


    public ReplaceVariableVisitor(Object oldVar, Object newVar) {
        this.oldVar = oldVar;
        this.newVar = newVar;
    }


    public <T> void visitCtVariableAccess(CtVariableAccess<T> variableAccess) {
        System.out.println("visitCtVariableAccess: "+ variableAccess);
            if (variableAccess.getVariable().equals(oldVar))
                if(newVar instanceof CtVariableReference)
                    variableAccess.setVariable((CtVariableReference)newVar);
                else
                    variableAccess.replace((CtFieldAccess)newVar);
        super.visitCtVariableAccess(variableAccess);
    }

    public <T> void visitCtFieldAccess(CtFieldAccess<T> fieldAccess) {
        System.out.println("visitCtFieldAccess: " + fieldAccess);
        if (fieldAccess.equals(oldVar))
            if (newVar instanceof CtVariableReference) {
                fieldAccess.setVariable((CtVariableReference) newVar);
            } else
                fieldAccess.replace((CtFieldAccess)newVar);
        super.visitCtVariableAccess(fieldAccess);
    }

    public <T> void visitCtInvocation(CtInvocation<T> invocation) {

        if (invocation.getTarget() == null && oldVarIsThis()) {
            CtVariableAccess access = new CtVariableAccessImpl();
            if(newVar instanceof CtVariableReference)   {
                access.setVariable((CtVariableReference)newVar);
                access.setType(((CtVariableReference)newVar).getType());
            }
            else
                access = (CtFieldAccess)newVar;

            invocation.setTarget(access);
        }
        super.visitCtInvocation(invocation);
    }

    protected boolean oldVarIsThis() {
        if(newVar instanceof CtVariableReference)
           return ((CtVariableReference)oldVar).getSimpleName().equals("this");
        return false;
    }

    //    public <T> void visitCtLocalVariableReference(
//            CtLocalVariableReference<T> reference) {
//        //localVariableReferences.add(reference);
//
//        super.visitCtLocalVariableReference(reference);
//    }

//    public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
//        System.out.println("visitCtFieldReference: "+ reference);
//
//            super.visitCtFieldReference(reference);
//    }

}
