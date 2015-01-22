package fr.inria.diversify.testamplification.processor;

import spoon.reflect.code.*;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtUnaryOperatorImpl;

import java.util.List;
import java.util.Random;

/* This processor is meant to replace all literal values in test cases by other literal values
 * This first version replaces all integer literals by 0
 * */
public class TestDataMutator extends TestProcessor {
	
	/* This processor looks for all literals in a method (for the moment only int)
	 * It creates as many clones of the method as there are literals in the method
	 * The ith literal is replaced by zero in the ith clone of the method
	 * Perspectives: 
	 * - replace integers by random values; 
	 * - have each literal replaced by several values;
	 * - chose among a list of predefined values, depending on the type of the literal (� la koopman)
	 * */
	public void process(CtMethod method) {
		try{			
			//get the list of literals in the method
			List<CtLiteral> l = Query.getElements(method, new TypeFilter(CtLiteral.class));
			//this index serves to replace ith literal is replaced by zero in the ith clone of the method
			int lit_index = 0;
			for(CtLiteral lit : l) {
				if (!literalInAssert(lit) && !isCase(lit)) {
					//clone the method
					CtMethod cloned_method = cloneMethod(method, "_literalMutation");
					//add the cloned method in the same class as the original method
					((CtClass) method.getDeclaringType()).addMethod(cloned_method);
					//get the lit_indexth literal of the cloned method
					CtLiteral literal = Query.getElements(cloned_method, new TypeFilter<CtLiteral>(CtLiteral.class)).get(lit_index);
					//set the value of the selected literal
					if (!replaceByRandom(literal)) {
						((CtClass) method.getDeclaringType()).removeMethod(cloned_method);
						mutatedMethod.remove(cloned_method);
					} else {
						count++;
					}
				}
				lit_index++;
			}
		}
		catch(Exception e){
			//let's be plastic, the transforms that work will work, for the rest 'anything goes'
		}
	}

	private boolean literalInAssert(CtLiteral lit) {

		CtInvocation invocation = lit.getParent(CtInvocation.class);
		while (invocation != null && !(invocation.getParent() instanceof CtBlock)) {
			invocation = invocation.getParent(CtInvocation.class);
		}
		if(invocation == null)
			return false;
		return isAssert(invocation);
	}

	protected boolean replaceByRandom(CtLiteral literal) {
		Object value = literal.getValue();
		CtElement toReplace = literal;
		Random r = new Random();
		CtLiteral newLiteral = literal.getFactory().Core().createLiteral();
		newLiteral.setTypeCasts(literal.getTypeCasts());

		if(value instanceof String) {
			newLiteral.setValue("foo");
		} else if(value instanceof Boolean) {
			newLiteral.setValue(r.nextBoolean());
		} else {
			if(value instanceof Integer) {
				newLiteral.setValue((int)value + modif());
			} else  if(value instanceof Long) {
				newLiteral.setValue((long)value + (long)modif());
			} else if(value instanceof Double) {
				newLiteral.setValue((double)value + (double)modif());
			} else if(value instanceof Short) {
				newLiteral.setValue((short)value + (short)modif());
			} else if(value instanceof Float) {
				newLiteral.setValue((float)value + (float)modif());
			} else if(value instanceof Byte) {
				newLiteral.setValue((byte)value + (byte)modif());
			}
			if(literal.getParent() instanceof CtUnaryOperator) {
				CtUnaryOperator parent = (CtUnaryOperator)literal.getParent();
				if(parent.getKind().equals(UnaryOperatorKind.NEG)) {
					toReplace = parent;
				}
			}
		}
		if(newLiteral.getValue() == null) {
			return false;
		}

		toReplace.replace(newLiteral);

		return true;
	}

	protected int modif() {
		Random r = new Random();
		if(r.nextBoolean()) {
			return 1;
		} else {
			return -1;
		}
	}

	protected boolean isCase(CtLiteral literal) {
		return literal.getParent(CtCase.class) != null;
	}
}
