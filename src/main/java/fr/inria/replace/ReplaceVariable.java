package fr.inria.replace;

import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtLocalVariableReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.CtScanner;
import spoon.support.reflect.code.CtFieldAccessImpl;
import spoon.support.reflect.code.CtVariableAccessImpl;

public class ReplaceVariable extends CtScanner {

	
	protected CtVariableReference<?> oldVar;
	protected CtVariableReference<?> newVar;

	public ReplaceVariable(CtVariableReference oldVar, CtVariableReference newVar) {
		this.oldVar = oldVar;
		this.newVar = newVar;
	}
	
	


	public <T> void visitCtVariableAccess(CtVariableAccess<T> variableAccess) {
//		System.out.println("\tvisitCtVariableAccess "+ variableAccess.getVariable().getDeclaration());
		if(variableAccess.getVariable() == oldVar){
			CtVariableAccess va =  new CtVariableAccessImpl();
			va.setType(oldVar.getType());
			va.setVariable(newVar);
			variableAccess.replace(va);
		}
		super.visitCtVariableAccess(variableAccess);
	}

//	public <T> void visitCtLocalVariableReference(
//			CtLocalVariableReference<T> reference) {
////		System.out.println("\tvisitCtLocalVariableReference "+ reference.getDeclaration());
//		localVariableReferences.add(reference.getDeclaration());
//		super.visitCtLocalVariableReference(reference);
//	}

	public <T> void visitCtFieldAccess(CtFieldAccess<T> fieldAccess) {
//		System.out.println("\tvisitCtFieldAccess "+ fieldAccess.getVariable().getDeclaration());
		if(!(fieldAccess.getVariable().getSimpleName() == "super"))
			if(fieldAccess.getVariable().getDeclaration() != null)
				if(fieldAccess.getVariable() == oldVar){
					CtFieldAccess va =  new CtFieldAccessImpl();
					va.setType(oldVar.getType());
					va.setVariable(newVar);
					fieldAccess.replace(va);
				}
		super.visitCtVariableAccess(fieldAccess);
	}

//	public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
////		System.out.println("\tvisitCtFieldReference "+ reference.getDeclaration());
//		if(reference.getDeclaration() != null)
//				fieldReferences.add(reference.getDeclaration());
//		super.visitCtFieldReference(reference);
//	}
}
