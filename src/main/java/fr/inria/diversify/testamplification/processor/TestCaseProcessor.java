package fr.inria.diversify.testamplification.processor;

import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

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
		List stmts = Query.getElements(method, new TypeFilter(CtStatement.class));
		for(Object s: new ArrayList(stmts)){
			if(s instanceof CtInvocation){
				try {
					CtInvocation invocation = (CtInvocation) s;

					if (isAssert(invocation)) {
						CtBlock block = (CtBlock) invocation.getParent();
						getInvocation(invocation).stream().forEach(arg -> invocation.insertBefore(arg));
						block.removeStatement(invocation);
					}
				} catch (Exception e) {}
			}
		}
	}

	protected List<CtInvocation> getInvocation(CtInvocation invocation) {
		List<CtInvocation> list = new ArrayList<>();
		for(Object arg : invocation.getArguments()) {
			if(arg instanceof CtInvocation) {
				CtInvocation i = (CtInvocation)arg;
		    	i.setTypeCasts(new ArrayList<>());
				list.add(i);
			}
		}
		return list;
	}
}
