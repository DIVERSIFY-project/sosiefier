package fr.inria.diversify.statementProcessor;

import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtLocalVariableReference;
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
    protected CtVariableReference oldVar;
    protected CtVariableReference newVar;


    public ReplaceVariableVisitor(CtVariableReference<?> oldVar, CtVariableReference<?> newVar) {
        this.oldVar = oldVar;
        this.newVar = newVar;
    }


    public <T> void visitCtVariableAccess(CtVariableAccess<T> variableAccess) {
        System.out.println("visitCtVariableAccess: "+ newVar);
//        if(newVar instanceof CtFieldReference)
//            System.out.println(newVar) ;

        if (variableAccess.getVariable().equals(oldVar))
            variableAccess.setVariable(newVar);
        super.visitCtVariableAccess(variableAccess);
    }

    public <T> void visitCtLocalVariableReference(
            CtLocalVariableReference<T> reference) {
        //localVariableReferences.add(reference);

        super.visitCtLocalVariableReference(reference);
    }

    public <T> void visitCtFieldAccess(CtFieldAccess<T> fieldAccess) {
        System.out.println("visitCtFieldAccess: "+ newVar);
        if (fieldAccess.getVariable().getDeclaration() != null)
            if (fieldAccess.getVariable().equals(oldVar))
                fieldAccess.setVariable(newVar);
        super.visitCtVariableAccess(fieldAccess);
    }

    public <T> void visitCtFieldReference(CtFieldReference<T> reference) {

        if (reference.getDeclaration() != null)

            super.visitCtFieldReference(reference);
    }

    public <T> void visitCtInvocation(CtInvocation<T> invocation) {

        if (invocation.getTarget() == null && oldVar.getSimpleName().equals("this")) {
            CtVariableAccess acces = new CtVariableAccessImpl();
            acces.setVariable(newVar);
            acces.setType(newVar.getType());
            invocation.setTarget(acces);
        }
        super.visitCtInvocation(invocation);
    }
}
