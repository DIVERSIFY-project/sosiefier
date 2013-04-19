package fr.inria.diversify.statementProcessor;

import spoon.processing.AbstractProcessor;

import spoon.reflect.declaration.CtElement;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtStatement;
import spoon.support.reflect.code.CtInvocationImpl;

/**
 * Created with IntelliJ IDEA. User: Simon Date: 4/17/13 Time: 11:43 AM To
 * change this template use File | Settings | File Templates.
 */
public class TestProcessor extends AbstractProcessor<CtElement> {
	
	private CtLocalVariable variable;
	
	public TestProcessor() {
		// TODO Auto-generated constructor stub
	}

	public void process(CtElement element) {
		System.out.println(element);
		System.out.println("type: "+element.getClass());
		System.out.println("------------------------");
	}
	
	public void setVariable(CtElement element) {
		if(element instanceof CtLocalVariable)
			variable = (CtLocalVariable)element;
		
		
	} 
}
