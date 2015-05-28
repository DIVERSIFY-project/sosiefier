package fr.inria.diversify.codeFragment;

import spoon.reflect.code.*;
import spoon.reflect.factory.CodeFactory;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.CtScanner;

/**
 * User: Simon
 * Date: 4/24/13
 * Time: 3:09 PM
 */
public class ReplaceVariableVisitor extends CtScanner {
    protected CtVariableReference oldVar;
    protected CtVariableReference newVar;

    public ReplaceVariableVisitor(CtVariableReference oldVar, CtVariableReference newVar) {
        this.oldVar = oldVar;
        this.newVar = newVar;
    }

    public <T> void visitCtVariableAccess(CtVariableAccess<T> variableAccess) {
        if (variableAccess.getVariable().equals(oldVar))
                variableAccess.setVariable(newVar);

        super.visitCtVariableAccess(variableAccess);
    }

    @Override
    public <T> void visitCtFieldAccess(CtFieldAccess<T> fieldAccess) {
        if(fieldAccess.getVariable().equals(oldVar)) {
            CodeFactory codeFactory = fieldAccess.getFactory().Code();
            CtVariableAccess variableAccess = codeFactory.createVariableAccess(newVar, false);
            fieldAccess.replace(variableAccess);
        }
        super.visitCtFieldAccess(fieldAccess);
    }


//    public <T> void visitCtTargetedAccess(CtTargetedAccess<T> targetedAccess) {
//            if(targetedAccess.getVariable().equals(oldVar)) {
//                CodeFactory codeFactory = targetedAccess.getFactory().Code();
//                CtVariableAccess variableAccess = codeFactory.createVariableAccess(newVar, false);
//                targetedAccess.replace(variableAccess);
//            }
//            super.visitCtTargetedAccess(targetedAccess);
//    }

    public <T> void visitCtThisAccess(CtThisAccess<T> thisAccess) {
        if(oldVar.getSimpleName().equals("this")) {
            CodeFactory codeFactory = thisAccess.getFactory().Code();
            CtVariableAccess variableAccess = codeFactory.createVariableAccess(newVar, false);
            thisAccess.replace(variableAccess);
        }

        super.visitCtThisAccess(thisAccess);
    }

    public <T> void visitCtInvocation(CtInvocation<T> invocation) {

        if (invocation.getTarget() == null && oldVarIsThis()) {
            CodeFactory codeFactory = invocation.getFactory().Code();
            CtVariableAccess variableAccess = codeFactory.createVariableAccess(newVar, false);
            invocation.setTarget(variableAccess);
        }
        super.visitCtInvocation(invocation);
    }

    protected boolean oldVarIsThis() {
        if (newVar instanceof CtVariableReference)
            return oldVar.getSimpleName().equals("this");
        return false;
    }
}
