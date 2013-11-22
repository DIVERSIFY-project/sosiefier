package fr.inria.diversify.transformation;

import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtTargetedAccess;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.CtScanner;
import spoon.support.reflect.code.CtFieldAccessImpl;
import spoon.support.reflect.code.CtTargetedAccessImpl;
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
        if (variableAccess.getVariable().equals(oldVar))
            if (newVar instanceof CtVariableReference)
                variableAccess.setVariable((CtVariableReference) newVar);
            else
                variableAccess.replace((CtFieldAccess) newVar);
        super.visitCtVariableAccess(variableAccess);
    }


    public <T> void visitCtTargetedAccess(CtTargetedAccess<T> targetedAccess) {
            if(targetedAccess.getVariable().equals(oldVar)) {
//                if(newVar instanceof CtFieldReference) {
                    CtTargetedAccess t = new CtTargetedAccessImpl();
                    t.setFactory(targetedAccess.getFactory());
                    t.setVariable((CtVariableReference)newVar);
                    targetedAccess.replace(t);
//                } else {
//                    targetedAccess.replace();
//                }
            }

            super.visitCtTargetedAccess(targetedAccess);
    }
//
    public <T> void visitCtFieldAccess(CtFieldAccess<T> fieldAccess) {
        if (fieldAccess.equals(oldVar))
            if (newVar instanceof CtVariableReference) {
                fieldAccess.replace(((CtVariableReference) newVar).getDeclaration());
            } else {
                fieldAccess.replace((CtFieldAccess) newVar);
            }
        super.visitCtVariableAccess(fieldAccess);
    }

    public <T> void visitCtInvocation(CtInvocation<T> invocation) {

        if (invocation.getTarget() == null && oldVarIsThis()) {
            CtVariableAccess access;// = new CtTargetedAccessImpl();
          ;
            if (newVar instanceof CtFieldReference) {
                access = new CtFieldAccessImpl();
//                access.setVariable((CtVariableReference)newVar);
//                access.setType(((CtVariableReference) newVar).getType());

//                access = (CtFieldAccess) newVar;
            } else {
                access = new CtVariableAccessImpl();
//                access.setVariable((CtVariableReference) newVar);
//                access.setType(((CtVariableReference) newVar).getType());

            }
            access.setFactory(invocation.getFactory());
            access.setVariable((CtVariableReference) newVar);
            access.setType(((CtVariableReference) newVar).getType());
            invocation.setTarget(access);
        }
        super.visitCtInvocation(invocation);
    }

    protected boolean oldVarIsThis() {
        if (newVar instanceof CtVariableReference)
            return ((CtVariableReference) oldVar).getSimpleName().equals("this");
        return false;
    }
}
