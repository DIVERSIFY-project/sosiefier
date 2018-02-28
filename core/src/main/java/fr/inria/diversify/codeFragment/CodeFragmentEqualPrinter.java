package fr.inria.diversify.codeFragment;

import spoon.compiler.Environment;
import spoon.reflect.code.CtComment;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtLocalVariableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.DefaultTokenWriter;
import spoon.reflect.visitor.ElementPrinterHelper;
import spoon.reflect.visitor.PrinterHelper;
import spoon.reflect.visitor.TokenWriter;

import java.util.Stack;

public class CodeFragmentEqualPrinter extends DefaultJavaPrettyPrinter {

	private final PrinterHelper printer;
	private final ElementPrinterHelper elementPrinterHelper;
	private final TokenWriter printerTokenWriter;
	public PrintingContext context = new PrintingContext();

	public CodeFragmentEqualPrinter(Environment env) {
		super(env);
		this.printer = new PrinterHelper(env);
		this.printerTokenWriter = new DefaultTokenWriter(this.printer);
		this.elementPrinterHelper = new ElementPrinterHelper(this.printerTokenWriter, this, env);
	}

    public <T> void visitCtInvocation(CtInvocation<T> invocation) {
		if(invocation.getTarget() == null){
			printer.write(invocation.getExecutable().getDeclaringType().toString());
			printer.write(".");
		}
		super.visitCtInvocation(invocation);
	}

	public <T> void visitCtVariableAccess(CtVariableAccess<T> variableAccess) {
		enterCtExpression(variableAccess);
		printer.write(variableAccess.getType().toString());
		exitCtExpression(variableAccess);
	}

	public <T> void visitCtLocalVariableReference(
			CtLocalVariableReference<T> reference) {
		printer.write(reference.getType().toString());
	}

	public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
		if (reference.getSimpleName().equals("this")) {
			if (context.currentThis.isEmpty()
					|| (!reference.getType().equals(context.currentThis.peek()) && !reference
							.getDeclaringType().isAnonymous())) {
				context.ignoreGenerics = true;
				scan(reference.getDeclaringType());
				printer.write(".");
				context.ignoreGenerics = false;
			}
		} else {
			boolean isStatic;
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
				printer.write(".");
			}
		}
		printer.write(reference.getType().toString());
	}

	public <T> DefaultJavaPrettyPrinter writeLocalVariable(
		CtLocalVariable<T> localVariable) {
	if (!context.noTypeDecl) {
		elementPrinterHelper.writeModifiers(localVariable);
		scan(localVariable.getType());
		printer.write(" ");
	}
	printer.write(localVariable.getType().toString());
	if (localVariable.getDefaultExpression() != null) {
		printer.write(" = ");
		scan(localVariable.getDefaultExpression());
	}
	return this;
}


	private class PrintingContext {
		boolean noTypeDecl = false;

		Stack<CtTypeReference<?>> currentThis = new Stack<>();

		CtType<?> currentTopLevel;

		boolean ignoreGenerics = false;

		/** Layout variables */
		int jumped = 0;

		int target = 0;

		boolean ignoreStaticAccess = false;
	}

}
