package fr.inria.diversify.processor.test;

import spoon.reflect.code.*;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.*;

/* This processor is meant to replace all literal values in test cases by other literal values
 * */
public class TestDataMutator extends TestProcessor {

    public static  int dataCount = 0;


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
                    } if(lit.getValue() instanceof String) {
                      createStringMutant(method, lit, lit_index);
                    } else {
                        dataCount++;
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
                        }
                        notHarmanTest.add(cloned_method);
                    }
                }
				lit_index++;
			}
		}
		catch(Exception e){
			//let's be plastic, the transforms that work will work, for the rest 'anything goes'
		}
	}

    protected List<CtMethod> createNumberMutant(CtMethod method, CtLiteral literal, int lit_index) {
        List<CtMethod> mutants = new ArrayList<>();
        for(Number literalMutated : literalMutated(literal)) {
            dataCount++;
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
            mutants.add(cloned_method);
        }
        return mutants;
    }

    protected List<CtMethod> createStringMutant(CtMethod method, CtLiteral literal, int lit_index) {
        List<CtMethod> mutants = new ArrayList<>();
        String string = ((String) literal.getValue());
        Random r = new Random();
        String[] array = new String[3];
        int index = r.nextInt(string.length() -2) +1;
        array[0] = string.substring(0,index - 1) + (char)r.nextInt(256) + string.substring(index , string.length());

        index = r.nextInt(string.length() -2) +1;
        array[1] = string.substring(0,index) + (char)r.nextInt(256) + string.substring(index, string.length());

        index = r.nextInt(string.length() -2) +1;
        array[2] = string.substring(0,index ) + string.substring(index +1, string.length());

        for(String literalMutated : array) {
            dataCount++;
            //clone the method
            CtMethod cloned_method = cloneMethod(method, "_literalMutation");
            //add the cloned method in the same class as the original method
            ((CtClass) method.getDeclaringType()).addMethod(cloned_method);
            //get the lit_indexth literal of the cloned method
            CtLiteral newLiteral = Query.getElements(cloned_method, new TypeFilter<CtLiteral>(CtLiteral.class))
                                        .get(lit_index);

            newLiteral.setValue(literalMutated);
            notHarmanTest.add(cloned_method);
            mutants.add(cloned_method);
        }
        return mutants;
    }


    protected Set<? extends Number> literalMutated(CtLiteral literal) {
        Set<Number> values = new HashSet<>();
        Double value = ((Number) literal.getValue()).doubleValue();
        values.add(value + 1);
        values.add(value - 1);

        values.add(value / 2);
//        values.add(value * 2);

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
		CtLiteral newLiteral = literal.getFactory().Core().createLiteral();
		newLiteral.setTypeCasts(literal.getTypeCasts());


            if(value instanceof Boolean) {
            Boolean b = (Boolean) value;
            if(b) {
                if(!(literal.getParent() instanceof CtWhile)) {
                    newLiteral.setValue(false);
                    return false;
                }
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


    public List<CtMethod> apply(CtMethod method) {
        List<CtMethod> methods = new ArrayList<>();
        try{
            //get the list of literals in the method
            List<CtLiteral> l = Query.getElements(method, new TypeFilter(CtLiteral.class));
            //this index serves to replace ith literal is replaced by zero in the ith clone of the method
            int lit_index = 0;
            for(CtLiteral lit : l) {
                if (!literalInAssert(lit) && !isCase(lit)) {
                    if (lit.getValue() instanceof Number) {
                        methods.addAll(createNumberMutant(method, lit, lit_index));
                    } if(lit.getValue() instanceof String) {
                        methods.addAll(createStringMutant(method, lit, lit_index));
                    } else {
                        dataCount++;
                        //clone the method
                        CtMethod cloned_method = cloneMethod(method, "_literalMutation");

                        //get the lit_indexth literal of the cloned method
                        CtLiteral literal = Query.getElements(cloned_method, new TypeFilter<CtLiteral>(CtLiteral.class))
                                .get(lit_index);
                        //set the value of the selected literal
                        replaceByRandom(literal);
                        methods.add(cloned_method);
                    }
                }
                lit_index++;
            }
        }
        catch(Exception e){}
        return methods;
    }

}
