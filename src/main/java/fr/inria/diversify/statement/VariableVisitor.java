package fr.inria.diversify.statement;

import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtLocalVariableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.CtScanner;
import spoon.support.reflect.reference.CtLocalVariableReferenceImpl;

import java.util.HashSet;
import java.util.Set;


public class VariableVisitor extends CtScanner {
	protected Set<CtVariableReference<?>> localVariableReferences = new HashSet<CtVariableReference<?>>();
	protected Set<CtFieldAccess<?>> fieldReferences = new HashSet<CtFieldAccess<?>>();
	protected Set<CtVariableReference<?>> localVariableCreate = new HashSet<CtVariableReference<?>>();
	protected CtTypeReference<?> refThis;

	public InputContext input() {
        localVariableReferences.removeAll(localVariableCreate);

		if(refThis != null)
            localVariableReferences.add(getThis());
		return new InputContext(localVariableReferences, fieldReferences);
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

	public <T> void visitCtFieldAccess(CtFieldAccess<T> fieldAccess) {
		if(!(fieldAccess.getVariable().getSimpleName() == "super"))
		    if(!(fieldAccess.getVariable().isStatic() && fieldAccess.getVariable().getModifiers().contains(ModifierKind.PUBLIC)))
				fieldReferences.add(fieldAccess);
		super.visitCtVariableAccess(fieldAccess);
	}

//	public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
//		System.out.println("\tvisitCtFieldReference "+ reference);
////        if(!reference.isStatic())
////
////				fieldReferences.add();
//		super.visitCtFieldReference(reference);
//	}

	public <T> void visitCtInvocation(CtInvocation<T> invocation) {
		if(invocation.getTarget() == null){
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
