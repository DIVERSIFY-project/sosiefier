package fr.inria.diversify.testamplification.processor;

import spoon.reflect.code.*;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* This processor is meant to replace all literal values in test cases by other literal values
 * This first version replaces all integer literals by 0
 * */
public class TestDataMutator extends TestProcessor {
    protected static String[] stringList = {"foo", "bar", "baz"};

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
                    if (lit.getValue() instanceof Number) {
                        createNumberMutant(method, lit, lit_index);
                    } else {
                        //clone the method
                        CtMethod cloned_method = cloneMethod(method, "_literalMutation");
                        //add the cloned method in the same class as the original method
                        ((CtClass) method.getDeclaringType()).addMethod(cloned_method);
                        //get the lit_indexth literal of the cloned method
                        CtLiteral literal = Query.getElements(cloned_method, new TypeFilter<CtLiteral>(CtLiteral.class))
                                                 .get(lit_index);
                        //set the value of the selected literal
                        if (!replaceByRandom(literal)) {
                            ((CtClass) method.getDeclaringType()).removeMethod(cloned_method);
                            mutatedMethod.remove(cloned_method);
                        } else {
                            count++;
                        }
                    }
                }
				lit_index++;
			}
		}
		catch(Exception e){
			//let's be plastic, the transforms that work will work, for the rest 'anything goes'
		}
	}

    protected void createNumberMutant(CtMethod method, CtLiteral literal, int lit_index) {
        for(Number literalMutated : literalMutated(literal)) {
            //clone the method
            CtMethod cloned_method = cloneMethod(method, "_literalMutation");
            //add the cloned method in the same class as the original method
            ((CtClass) method.getDeclaringType()).addMethod(cloned_method);
            //get the lit_indexth literal of the cloned method
            CtLiteral newLiteral = Query.getElements(cloned_method, new TypeFilter<CtLiteral>(CtLiteral.class))
                                     .get(lit_index);
            CtElement toReplace = newLiteral;


            if(literal.getValue() instanceof Integer) {
                newLiteral.setValue(literalMutated.intValue());
            } else if(literal.getValue() instanceof Long) {
                newLiteral.setValue(literalMutated.longValue());
            } else if(literal.getValue() instanceof Double) {
                newLiteral.setValue(literalMutated.doubleValue());
            } else if(literal.getValue() instanceof Short) {
                newLiteral.setValue(literalMutated.shortValue());
            } else if(literal.getValue() instanceof Float) {
                newLiteral.setValue(literalMutated.floatValue());
            } else if(literal.getValue() instanceof Byte) {
                newLiteral.setValue(literalMutated.byteValue());
            }
            if(literal.getParent() instanceof CtUnaryOperator) {
                CtUnaryOperator parent = (CtUnaryOperator)literal.getParent();
                if(parent.getKind().equals(UnaryOperatorKind.NEG)) {
                    toReplace = parent;
                }
            }
            toReplace.replace(newLiteral);

            count++;
        }
    }

    protected Set<? extends Number> literalMutated(CtLiteral literal) {
        Set<Number> values = new HashSet<>();
        Double value = ((Number) literal.getValue()).doubleValue();
        values.add(value + 1);
        values.add(value - 1);

        values.add(value / 2);
        values.add(value * 2);

//        values.add(value + 2);
//        values.add(value - 2);
        return values;
    }

    protected boolean literalInAssert(CtLiteral lit) {

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
			newLiteral.setValue(stringList[r.nextInt(2)]);
		} else if(value instanceof Boolean) {
            Boolean b = (Boolean) value;
            if(b) {
                newLiteral.setValue(false);
            } else {
                newLiteral.setValue(true);
            }
		}
		if(newLiteral.getValue() == null) {
			return false;
		}

		toReplace.replace(newLiteral);

		return true;
	}

	protected boolean isCase(CtLiteral literal) {
		return literal.getParent(CtCase.class) != null;
	}
}
