package fr.inria.replace;

import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.CtScanner;

public class ValidStatementVisitor extends CtScanner {
	protected boolean visitStart = false;
	protected boolean valid = true;
	
	
	public boolean isValid(){
		return valid;
	}
	
	protected void exit(CtElement e) {
		visitStart = true;
	}
	
	protected void enter(CtElement e) {
//		if(e.getParent(CtInvocation.class) != null)
//			valid = false;
	}
	
	public <T> void visitCtClass(CtClass<T> ctClass) {
		valid = false;
	}
	
	public <R> void visitCtReturn(CtReturn<R> returnStatement) {
		valid = false;
	}
	
	public <T> void visitCtLiteral(CtLiteral<T> literal) {
		if(!visitStart)
			valid = false;
	}
	
	public <R> void visitCtBlock(CtBlock<R> block) {
		CtElement parent = block.getParent();
			if(parent instanceof CtMethod || parent instanceof CtConstructor<?>)
				valid = false;
	}
	
	

}
