package fr.inria.diversify.statement;

import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.CtScanner;
import spoon.support.reflect.code.CtVariableAccessImpl;

/**
 * Created with IntelliJ IDEA.
 * User: Simon
 * Date: 4/24/13
 * Time: 3:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReplaceVariableVisitor extends CtScanner {
    protected Object oldVar;
    protected Object newVar;


    public ReplaceVariableVisitor(Object oldVar, Object newVar) {
        this.oldVar = oldVar;
        this.newVar = newVar;
    }


    public <T> void visitCtVariableAccess(CtVariableAccess<T> variableAccess) {
        System.out.println("visitCtVariableAccess: "+ newVar);
//        if(newVar instanceof CtFieldReference)
//            System.out.println(newVar) ;

        if (variableAccess.getVariable().equals(oldVar))
            if (variableAccess.getVariable().equals(oldVar))
                if(newVar instanceof CtVariableReference)
                    variableAccess.setVariable((CtVariableReference)newVar);
                else
                    variableAccess.replace((CtFieldAccess)newVar);
        super.visitCtVariableAccess(variableAccess);
    }

//    public <T> void visitCtLocalVariableReference(
//            CtLocalVariableReference<T> reference) {
//        //localVariableReferences.add(reference);
//
//        super.visitCtLocalVariableReference(reference);
//    }

    public <T> void visitCtFieldAccess(CtFieldAccess<T> fieldAccess) {
        System.out.println("visitCtFieldAccess: "+ newVar);
        if (fieldAccess.getVariable().getDeclaration() != null)          // utile ??
            if (fieldAccess.getVariable().equals(oldVar))
                if(newVar instanceof CtVariableReference)
                fieldAccess.setVariable((CtVariableReference)newVar);
            else
                fieldAccess.replace((CtFieldAccess)newVar);
        super.visitCtVariableAccess(fieldAccess);
    }

//    public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
//
//        if (reference.getDeclaration() != null)
//
//            super.visitCtFieldReference(reference);
//    }

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
}
