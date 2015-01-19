package fr.inria.diversify.testamplification.processor;

import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;

import java.util.ArrayList;
import java.util.List;

public class TestCaseProcessor extends TestProcessor {

	/*
	 * This processor removes all the assertions from a test case
	 * For future version: 
	 * - we should check first whether the assertion contains a call to a method under test. If yes, we should extract it.
	 * - some method calls might actually be assertions embedded in some more complex 'checker' methods (for example 
	 * we could check if the invocation is to a method inside the test packages and that's not a test, then it's probably a checker)
	 * */

	public boolean isToBeProcessed(CtMethod candidate) {return  true;}

	@Override
	public void process(CtMethod method) {
//		String testName =  method.getPosition().getCompilationUnit().getMainType().getQualifiedName()
//				+ "." + method.getSimpleName();
//		String idTest = idFor(testName, "TEST");

		List stmts = Query.getElements(method, new TypeFilter(CtStatement.class));
		for(Object s: new ArrayList(stmts)){
			if(s instanceof CtInvocation){
				try {
					CtInvocation invocation = (CtInvocation) s;
					if (isAssert(invocation)) {
						if(invocation.getParent() instanceof CtCase) {
							CtCase ctCase = (CtCase) invocation.getParent();
							int index = ctCase.getStatements().indexOf(invocation);
							getArgs(invocation).stream()
													 .forEach(arg -> ctCase.getStatements().add(index, buildLogStatement(arg)));
							ctCase.getStatements().remove(invocation);
						} else {
							CtBlock block = (CtBlock) invocation.getParent();
							getArgs(invocation).stream().forEach(arg -> invocation.insertBefore(buildLogStatement(arg)));
							block.removeStatement(invocation);
						}
					}
				} catch (Exception e) {}
			}
		}
	}

	protected List<CtElement> getArgs(CtInvocation invocation) {
		List<CtElement> list = new ArrayList<>();
		for(Object arg : invocation.getArguments()) {
			if(!(arg instanceof CtLiteral)) {
				CtElement i = (CtElement)arg;
				list.add(i);
			}
		}
		return list;
	}


	protected CtCodeSnippetStatement buildLogStatement(CtElement arg) {
		CtCodeSnippetStatement stmt = new CtCodeSnippetStatementImpl();

		String snippet;
		String idAssertInvocation = idFor(arg.getPosition().getLine()+"_"+arg.toString(), "ASSERT");
		if(arg instanceof CtInvocation) {
			CtInvocation invocation = (CtInvocation) arg;
			CtExpression target = invocation.getTarget();
			String idAssertTarget = idFor(arg.getPosition().getLine()+"_"+invocation.toString(), "ASSERT");

			snippet = getLogName() + ".logAssertArgument(Thread.currentThread()," + idAssertTarget + "," + target
					+ "," + idAssertInvocation + ","  + arg + ")";
		} else {
			snippet = getLogName() + ".logAssertArgument(Thread.currentThread()," + idAssertInvocation + ","+ arg + ")";
		}
		stmt.setValue(snippet);

		return stmt;
	}
}
