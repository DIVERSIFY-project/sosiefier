package fr.inria.diversify.testamplification.processor;

import fr.inria.diversify.util.Log;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;

import java.util.ArrayList;
import java.util.List;

public class TestCaseProcessor extends TestProcessor {
    protected String testDir;
    public static int monitorPointCount = 0;

	/*
	 * This processor removes all the assertions from a test case
	 * For future version: 
	 * - we should validate first whether the assertion contains a call to a method under test. If yes, we should extract it.
	 * */


    public TestCaseProcessor(String testDir) {
        this.testDir = testDir;
    }

	public boolean isToBeProcessed(CtMethod candidate) {
        return  candidate.getPosition().toString().contains(testDir);
    }

    @Override
    public void process(CtMethod method) {
        List<CtInvocation> stmts = Query.getElements(method, new TypeFilter(CtInvocation.class));
        for(CtInvocation invocation: stmts){
            try {
                if (isAssert(invocation)) {
                    if(invocation.getParent() instanceof CtCase) {
                        CtCase ctCase = (CtCase) invocation.getParent();
                        int index = ctCase.getStatements().indexOf(invocation);
                        getArgs(invocation).stream()
//                                            .filter(arg -> arg instanceof CtInvocation)
                                           .forEach(arg -> ctCase.getStatements().add(index, buildLogStatement(arg)));
                        ctCase.getStatements().remove(invocation);
                    } else {
                        CtBlock block = (CtBlock) invocation.getParent();
                        getArgs(invocation).stream()
//                                           .filter(arg -> arg instanceof CtInvocation)
                                           .forEach(arg -> invocation.insertBefore(buildLogStatement(arg)));
                        block.removeStatement(invocation);
                    }
                }
            } catch (Exception e) {}

        }
        if(!method.getModifiers().contains(ModifierKind.STATIC)) {
            List<CtAssignment> assignments = Query.getElements(method, new TypeFilter(CtAssignment.class));
            for (CtAssignment assignment : assignments) {
                try {
                    if(!(assignment.getParent() instanceof CtLoop)){
                        assignment.insertAfter(logAssignment(assignment.getAssigned()));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.debug("");
                }
            }

            List<CtLocalVariable> vars = Query.getElements(method, new TypeFilter(CtLocalVariable.class));
            for (CtLocalVariable var : vars) {
                try {
                    if (var.getDefaultExpression() != null && !(var.getParent() instanceof CtLoop)) {
                        var.insertAfter(logLocalVar(var));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.debug("");
                }
            }
        }
    }

    protected CtCodeSnippetStatement logLocalVar(CtLocalVariable var) {
        String id = idFor(var.getPosition().getLine() + "_" + var.getReference());
        return buildSnippet(id, var.getSimpleName());
    }


    protected CtCodeSnippetStatement logAssignment(CtElement expression) {
        String id = idFor(expression.getPosition().getLine()+"_"+expression.toString(), "ASSIGNMENT");
        return buildSnippet(id, expression.toString());
    }

    protected CtCodeSnippetStatement buildSnippet(String id, String expression) {
        monitorPointCount++;
        CtCodeSnippetStatement stmt = new CtCodeSnippetStatementImpl();
        String snippet = getLogName() + ".logAssertArgument(Thread.currentThread()," + id + ","+ expression + ")";
        stmt.setValue(snippet);

        return stmt;
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


//	protected CtCodeSnippetStatement buildLogStatement(CtElement arg) {
//		CtCodeSnippetStatement stmt = new CtCodeSnippetStatementImpl();
//
//		String snippet;
//		String idAssertInvocation = idFor(arg.getPosition().getLine()+"_"+arg.toString(), "ASSERT_I");
//		if(arg instanceof CtInvocation && !((CtInvocation) arg).getExecutable().isStatic()) {
//			CtInvocation invocation = (CtInvocation) arg;
//			CtExpression target = invocation.getTarget();
//			String idAssertTarget = idFor(arg.getPosition().getLine()+"_"+invocation.toString(), "ASSERT_T");
//
//			snippet = getLogName() + ".logAssertArgument(Thread.currentThread()," + idAssertTarget + "," + target
//					+ "," + idAssertInvocation + ","  + arg + ")";
//		} else {
//			snippet = getLogName() + ".logAssertArgument(Thread.currentThread()," + idAssertInvocation + ","+ arg + ")";
//		}
//		stmt.setValue(snippet);
//
//		return stmt;
//	}


    protected CtCodeSnippetStatement buildLogStatement(CtElement arg) {
        String id = idFor(arg.getPosition().getLine()+"_"+arg.toString(), "ASSERT_I");
        return buildSnippet(id, arg.toString());
    }
}
