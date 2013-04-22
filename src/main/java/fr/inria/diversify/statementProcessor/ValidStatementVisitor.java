package fr.inria.diversify.statementProcessor;

import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.CtScanner;

public class ValidStatementVisitor extends CtScanner {
	protected boolean valid = true;
	protected CtElement root; 
	
	public boolean isValid(){
		return valid;
	}
	
	public ValidStatementVisitor(CtElement e) {
		root = e;
	}
	
	public <T> void visitCtClass(CtClass<T> ctClass) {
		valid = false;
	}
	
	public <R> void visitCtReturn(CtReturn<R> returnStatement) {
		valid = false;
	}
	
	public <T> void visitCtLiteral(CtLiteral<T> literal) {
		if(literal == root)
			valid = false;
	}
	
	public <R> void visitCtBlock(CtBlock<R> block) {
		if(block == root)
			valid = false;
	}
}
