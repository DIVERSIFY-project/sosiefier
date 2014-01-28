package fr.inria.diversify.codeFragment;

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
	protected Set<CtVariableReference<?>> localVariableReferences = new HashSet<CtVariableReference<?>>();
 	protected Set<CtVariableReference<?>> localVariableCreate = new HashSet<CtVariableReference<?>>();
	protected CtTypeReference<?> refThis;

	public InputContext input() {
        localVariableReferences.removeAll(localVariableCreate);

		if(refThis != null)
            localVariableReferences.add(getThis());
		return new InputContext(localVariableReferences);
	}

	public <T> void visitCtLocalVariable(CtLocalVariable<T> localVariable) {
		localVariableCreate.add(localVariable.getReference());
		super.visitCtLocalVariable(localVariable);
	}

	public <T> void visitCtVariableAccess(CtVariableAccess<T> variableAccess) {
		localVariableReferences.add(variableAccess.getVariable());
		super.visitCtVariableAccess(variableAccess);
	}

	public <T> void visitCtLocalVariableReference(
			CtLocalVariableReference<T> reference) {
		localVariableReferences.add(reference);
		super.visitCtLocalVariableReference(reference);
	}

    public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
        if(!(reference.getSimpleName() == "super"))
            if(!(reference.isStatic()))
                localVariableReferences.add(reference);
        super.visitCtFieldReference(reference);
    }

	public <T> void visitCtInvocation(CtInvocation<T> invocation) {
		if(invocation.getTarget() == null){
			refThis = invocation.getExecutable().getDeclaringType();
		}
		super.visitCtInvocation(invocation);
	}

	protected CtVariableReference<?> getThis(){
		CtVariableReference thisVariable = new CtLocalVariableReferenceImpl();
		thisVariable.setType(refThis);
        thisVariable.setFactory(FactoryImpl.getLauchingFactory());
		thisVariable.setSimpleName("this");
		return thisVariable;
	}


}
