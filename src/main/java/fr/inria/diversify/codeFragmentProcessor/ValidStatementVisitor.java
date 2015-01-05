package fr.inria.diversify.codeFragmentProcessor;

import spoon.reflect.code.*;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.visitor.CtScanner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ValidStatementVisitor extends CtScanner {
	protected boolean valid = true;
	protected CtElement root; 
	protected static Set<CtStatement> expressions  = new HashSet<CtStatement>();
	protected boolean withSuper;
	
	
	public boolean inExpression(CtElement elem) {
		if(expressions.contains(elem)) {
			expressions.remove(elem);
			return true;
		}
		return false;
	}

    public static Set<CtStatement> getExpressions() {
        return expressions;
    }

	public boolean isValid(){
		return valid;
	}
	
	public ValidStatementVisitor(CtElement e, boolean withSuper) {
		root = e;
        this.withSuper = withSuper;

	}
	
	protected Collection<CtStatement> getAllSubStatement(CtElement element) {
		SubStatementVisitor visitor = new SubStatementVisitor();
		element.accept(visitor);
		return visitor.getStatements();
	}
	
	protected void addAllSubStatement(CtElement element) {
		if(element != null)
			expressions.addAll(getAllSubStatement(element));
	}
	
	public <T> void visitCtClass(CtClass<T> ctClass) {
//        if(ctClass == root)
		    valid = false;
	}

	
	public <T> void visitCtLiteral(CtLiteral<T> literal) {
		if(literal == root)
			valid = false;
	}
	
	public <R> void visitCtBlock(CtBlock<R> block) {
		if(block == root)
			valid = false;
		super.visitCtBlock(block);
	}
	
	public <T> void visitCtInvocation(CtInvocation<T> invocation) {
        if(!withSuper && invocation.toString().contains("super(")) {
            valid = false;
        }

		for (CtExpression<?> i : invocation.getArguments()) 
			addAllSubStatement(i);
		super.visitCtInvocation(invocation);
	}
	
	public void visitCtFor(CtFor forLoop) {
		for (CtStatement i : forLoop.getForInit())
			addAllSubStatement(i);
		
		addAllSubStatement(forLoop.getExpression());
		for (CtStatement i : forLoop.getForUpdate())
			addAllSubStatement(i);
		super.visitCtFor(forLoop);
	}

	public void visitCtForEach(CtForEach foreach) {
		addAllSubStatement(foreach.getVariable());
		addAllSubStatement(foreach.getExpression());
		super.visitCtForEach(foreach);
	}

	public void visitCtIf(CtIf ifElement) {
		addAllSubStatement(ifElement.getCondition());
		super.visitCtIf(ifElement);
	}

    public void visitCtField(CtField field) {
        valid = false;
        super.visitCtField(field);
    }

	public <T> void visitCtNewArray(CtNewArray<T> newArray) {
		for (CtExpression<?> i : newArray.getDimensionExpressions()) 
			addAllSubStatement(i);
		super.visitCtNewArray(newArray);
	}

	public <T> void visitCtNewClass(CtNewClass<T> newClass) {
		for (CtExpression<?> i : newClass.getArguments()) 
			addAllSubStatement(i);
		super.visitCtNewClass(newClass);
	}
	
	public <T, A extends T> void visitCtAssignment(
			CtAssignment<T, A> assignement) {
		addAllSubStatement(assignement.getAssignment());
		super.visitCtAssignment(assignement);
	}

	public <T> void visitCtBinaryOperator(CtBinaryOperator<T> operator) {
		addAllSubStatement(operator.getLeftHandOperand());
		addAllSubStatement(operator.getRightHandOperand());
		super.visitCtBinaryOperator(operator);
	}
	
	public void visitCtWhile(CtWhile whileLoop) {
		addAllSubStatement(whileLoop.getLoopingExpression());
		super.visitCtWhile(whileLoop);
	}


	public <T> void visitCtLocalVariable(CtLocalVariable<T> localVariable) {
		addAllSubStatement(localVariable.getDefaultExpression());
		super.visitCtLocalVariable(localVariable);
	}
	
	public void visitCtThrow(CtThrow throwStatement) {
		addAllSubStatement(throwStatement.getThrownExpression());
		super.visitCtThrow(throwStatement);
	}
	
	public <S> void visitCtSwitch(CtSwitch<S> switchStatement) {
		addAllSubStatement(switchStatement.getSelector());
		super.visitCtSwitch(switchStatement);
	}

	public void visitCtSynchronized(CtSynchronized synchro) {
		addAllSubStatement(synchro.getExpression());
		super.visitCtSynchronized(synchro);
	}
	
	public <T> void visitCtUnaryOperator(CtUnaryOperator<T> operator) {
		addAllSubStatement(operator.getOperand());
		super.visitCtUnaryOperator(operator);
	}
	
	public <S> void visitCtCase(CtCase<S> caseStatement) {
		addAllSubStatement(caseStatement.getCaseExpression());
		super.visitCtCase(caseStatement);
	}
	
	public <T> void visitCtAssert(CtAssert<T> asserted) {
		addAllSubStatement(asserted.getAssertExpression());
		addAllSubStatement(asserted.getExpression());
		super.visitCtAssert(asserted);
	}
	public void visitCtDo(CtDo doLoop) {
		addAllSubStatement(doLoop.getLoopingExpression());
		super.visitCtDo(doLoop);
	}

    public <R> void visitCtReturn(CtReturn<R> returnStatement) {
        addAllSubStatement(returnStatement.getReturnedExpression());
        super.visitCtReturn(returnStatement);
    }

}
