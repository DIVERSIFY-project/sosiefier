package fr.inria.diversify.codeFragment;

import spoon.compiler.Environment;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtLocalVariableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;

import java.util.Stack;

public class CodeFragmentEqualPrinter extends DefaultJavaPrettyPrinter {
	public PrintingContext context = new PrintingContext();

	public CodeFragmentEqualPrinter(Environment env) {
		super(env);
		
	}

public <T> void visitCtInvocation(CtInvocation<T> invocation) {
		
		if(invocation.getTarget() == null){
			write(invocation.getExecutable().getDeclaringType().toString());
			write(".");
		}
		super.visitCtInvocation(invocation);
	}
	public <T> void visitCtVariableAccess(CtVariableAccess<T> variableAccess) {
		enterCtExpression(variableAccess);
		write(variableAccess.getType().toString());
		exitCtExpression(variableAccess);
	}

	public <T> void visitCtLocalVariableReference(
			CtLocalVariableReference<T> reference) {
		write(reference.getType().toString());
	}



	public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
		if (reference.getSimpleName().equals("this")) {
			if (context.currentThis.isEmpty()
					|| (!reference.getType().equals(context.currentThis.peek()) && !reference
							.getDeclaringType().isAnonymous())) {
				context.ignoreGenerics = true;
				scan(reference.getDeclaringType());
				write(".");
				context.ignoreGenerics = false;
			}
		} else {
			boolean isStatic = false;
			if (reference.getSimpleName().equals("class")) {
				isStatic = true;
			} else if (reference.getSimpleName().equals("super")) {
				isStatic = false;
			} else {
				isStatic = reference.isStatic();
			}

			boolean printType = true;
			if (reference.isFinal() && reference.isStatic()) {
				if (context.currentTopLevel != null) {
					CtTypeReference<?> ref = reference.getDeclaringType();
					CtTypeReference<?> ref2;
					if(context.currentThis!=null && context.currentThis.size()>0)
						ref2 = context.currentThis.lastElement();
					else
						ref2 = context.currentTopLevel.getReference();
					// print type if not annonymous class ref and not within the
					// current scope
					printType = !ref.getSimpleName().equals("")
							&& !(ref.equals(ref2));
				} else {
					printType = true;
				}
			}

			if (isStatic && printType && !context.ignoreStaticAccess) {
				context.ignoreGenerics = true;
				scan(reference.getDeclaringType());
				context.ignoreGenerics = false;
				write(".");
			}
		}
		write(reference.getType().toString());
	}
	
	public <T> DefaultJavaPrettyPrinter writeLocalVariable(
		CtLocalVariable<T> localVariable) {
	if (!context.noTypeDecl) {
		writeModifiers(localVariable);
		scan(localVariable.getType());
		write(" ");
	}
	write(localVariable.getType().toString());
	if (localVariable.getDefaultExpression() != null) {
		write(" = ");
		scan(localVariable.getDefaultExpression());
	}
	return this;
}

//	public <T> void visitCtFieldAccess(CtFieldAccess<T> fieldAccess) {
//		enterCtExpression(fieldAccess);
//
//		context.ignoreGenerics = true;
//		scan(fieldAccess.getVariable());
//		context.ignoreGenerics = false;
//		context.ignoreStaticAccess = false;
//		exitCtExpression(fieldAccess);
//	}

	private class PrintingContext {
		boolean noTypeDecl = false;

		Stack<CtTypeReference<?>> currentThis = new Stack<>();

		CtSimpleType<?> currentTopLevel;

		boolean ignoreGenerics = false;

		/** Layout variables */
		int jumped = 0;

		int target = 0;

		boolean ignoreStaticAccess = false;
	}
	
}
