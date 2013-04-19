package fr.inria.diversify.statement;

import java.util.HashSet;
import java.util.Set;


import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtLocalVariableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.CtScanner;
import spoon.support.reflect.code.CtLocalVariableImpl;
import spoon.support.reflect.reference.CtLocalVariableReferenceImpl;
import spoon.support.reflect.reference.CtVariableReferenceImpl;


public class VariableVisitor extends CtScanner {
	protected Set<CtVariableReference<?>> localVariableReferences = new HashSet<CtVariableReference<?>>();
	protected Set<CtVariableReference<?>> fieldReferences = new HashSet<CtVariableReference<?>>();
	protected Set<CtVariableReference<?>> localVariableCreate = new HashSet<CtVariableReference<?>>();
	protected CtTypeReference<?> refThis;

	public InputContext input() {
		Set<CtVariableReference<?>> ref = new HashSet<CtVariableReference<?>>(localVariableReferences);
		ref.removeAll(localVariableCreate);
		ref.addAll(fieldReferences);
		
		if(refThis != null)
			ref.add(getThis());
		return new InputContext(ref);
	}

	public <T> void visitCtLocalVariable(CtLocalVariable<T> localVariable) {
//		System.out.println("\tvisitCtLocalVariable "+ localVariable.getReference().getDeclaration());
		localVariableCreate.add(localVariable.getReference());
		super.visitCtLocalVariable(localVariable);
	}

	public <T> void visitCtVariableAccess(CtVariableAccess<T> variableAccess) {
//		System.out.println("\tvisitCtVariableAccess "+ variableAccess.getVariable().getDeclaration());
		localVariableReferences.add(variableAccess.getVariable());
		super.visitCtVariableAccess(variableAccess);
	}

	public <T> void visitCtLocalVariableReference(
			CtLocalVariableReference<T> reference) {
//		System.out.println("\tvisitCtLocalVariableReference "+ reference.getDeclaration());
		localVariableReferences.add(reference);
		super.visitCtLocalVariableReference(reference);
	}

	public <T> void visitCtFieldAccess(CtFieldAccess<T> fieldAccess) {
//		System.out.println("\tvisitCtFieldAccess "+ fieldAccess.getVariable().getDeclaration());
		if(!(fieldAccess.getVariable().getSimpleName() == "super"))
			if(fieldAccess.getVariable().getDeclaration() != null)
				fieldReferences.add(fieldAccess.getVariable());
		super.visitCtVariableAccess(fieldAccess);
	}

	public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
//		System.out.println("\tvisitCtFieldReference "+ reference.getDeclaration());
		if(reference.getDeclaration() != null)
				fieldReferences.add(reference);
		super.visitCtFieldReference(reference);
	}
	
	public <T> void visitCtInvocation(CtInvocation<T> invocation) {
		
		if(invocation.getTarget() == null){
//			System.out.println("\tvisitCtInvocation "+ invocation.getExecutable().getDeclaringType());
			refThis = invocation.getExecutable().getDeclaringType();
		}
		super.visitCtInvocation(invocation);
	}
	
	protected CtVariableReference<?> getThis(){
		CtVariableReference thisVariable = new CtLocalVariableReferenceImpl();
		thisVariable.setType(refThis);
		thisVariable.setSimpleName("this");
		return thisVariable;
	}
}
