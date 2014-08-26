package fr.inria.diversify.codeFragment;

import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.factory.FactoryImpl;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtLocalVariableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.CtScanner;
import spoon.support.reflect.reference.CtLocalVariableReferenceImpl;

import java.util.HashSet;
import java.util.Set;


public class VariableVisitor extends CtScanner {
    protected boolean withField;
    protected Set<CtVariableReference<?>> localVariableReferences = new HashSet<CtVariableReference<?>>();
    protected Set<CtVariableReference<?>> localVariableCreate = new HashSet<CtVariableReference<?>>();
    protected CtTypeReference<?> refThis;

    int count = 0;

    public VariableVisitor() {
        this.withField = true;
    }

    public VariableVisitor(boolean withField) {
        try {
            count++;
            this.withField = withField;
        } catch (RuntimeException e) {
            Log.error(e.getMessage() + " " + count);
        }
    }

    public InputContext input() {
        count++;
        try {
            localVariableReferences.removeAll(localVariableCreate);

            if (refThis != null)
                localVariableReferences.add(getThis());
        } catch (RuntimeException e) {
            Log.error(e.getMessage() + " " + count);
        }
        return new InputContext(localVariableReferences);

    }

    public <T> void visitCtLocalVariable(CtLocalVariable<T> localVariable) {
        count++;
        try {
            localVariableCreate.add(localVariable.getReference());
        } catch (RuntimeException e) {
            Log.error(e.getMessage() + " " + count);
        }
        super.visitCtLocalVariable(localVariable);
    }

    public <T> void visitCtVariableAccess(CtVariableAccess<T> variableAccess) {
        count++;
        try {
            localVariableReferences.add(variableAccess.getVariable());
        } catch (RuntimeException e) {
            Log.error(e.getMessage() + " " + count);
        }
        super.visitCtVariableAccess(variableAccess);
    }

    public <T> void visitCtLocalVariableReference(CtLocalVariableReference<T> reference) {
        count++;
        try {
            localVariableReferences.add(reference);
        } catch (RuntimeException e) {
            Log.error(e.getMessage() + " " + count);
        }
        super.visitCtLocalVariableReference(reference);
    }

    public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
        count++;
        try {
            if (withField && !(reference.getSimpleName() == "super"))
                localVariableReferences.add(reference);
        } catch (RuntimeException e) {
            Log.error(e.getMessage() + " " + count);
        }
        super.visitCtFieldReference(reference);
    }

    public <T> void visitCtInvocation(CtInvocation<T> invocation) {
        count++;
        try {
            if (invocation.getTarget() == null)
                refThis = invocation.getExecutable().getDeclaringType();
        } catch (RuntimeException e) {
            Log.error(e.getMessage() + " " + count);
        }
        super.visitCtInvocation(invocation);
    }

    protected CtVariableReference<?> getThis() {
        count++;
        try {
            CtVariableReference thisVariable = new CtLocalVariableReferenceImpl();
            thisVariable.setType(refThis);
            thisVariable.setFactory(FactoryImpl.getLauchingFactory());
            thisVariable.setSimpleName("this");
            return thisVariable;
        } catch (RuntimeException e) {
            Log.error(e.getMessage() + " " + count);
        }
        throw new RuntimeException("eeeee");
    }

    public Set<CtVariableReference<?>> getLocalVariableReferences() {
        count++;
        return localVariableReferences;
    }
}
