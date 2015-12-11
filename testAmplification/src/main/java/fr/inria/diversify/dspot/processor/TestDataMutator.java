package fr.inria.diversify.dspot.processor;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.*;
import java.util.stream.Collectors;

/* This processor is meant to replace all literal values in test cases by other literal values
 * */
public class TestDataMutator extends AbstractAmp {
    public static  int dataCount = 0;
    protected Map<Class<?>, List<CtLiteral>> literals;

    public TestDataMutator(InputProgram inputProgram, CtClass testClass) {
        Set<CtType> codeFragmentsProvide = computeClassProvider(testClass);
        literals = getLiterals(codeFragmentsProvide).stream()
                .filter(lit -> lit.getValue() != null)
                .collect(Collectors.groupingBy(lit -> lit.getValue().getClass()));
    }

    protected List<CtMethod> createNumberMutant(CtMethod method, CtLiteral literal, int lit_index) {
        List<CtMethod> mutants = new ArrayList<>();
        for(Number literalMutated : numberMutated(literal)) {
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
        List<String> values = new ArrayList<>(4);
        int index = r.nextInt(string.length() -2) +1;
        values.add(string.substring(0,index - 1) + (char)r.nextInt(256) + string.substring(index , string.length()));

        index = r.nextInt(string.length() -2) +1;
        values.add(string.substring(0,index) + (char)r.nextInt(256) + string.substring(index, string.length()));

        index = r.nextInt(string.length() -2) +1;
        values.add(string.substring(0,index ) + string.substring(index +1, string.length()));

        List<CtLiteral> lits = literals.get(literal.getClass());
        if(lits != null && !lits.isEmpty()) {
            values.add((String) lits.get(r.nextInt(lits.size())).getValue());
        }

        values.remove(string);

        for(String literalMutated : values) {
            dataCount++;
            //clone the method
            CtMethod cloned_method = cloneMethod(method, "_literalMutation");
            //add the cloned method in the same class as the original method
            ((CtClass) method.getDeclaringType()).addMethod(cloned_method);
            //get the lit_indexth literal of the cloned method
            CtLiteral newLiteral = Query.getElements(cloned_method, new TypeFilter<CtLiteral>(CtLiteral.class))
                                        .get(lit_index);

            newLiteral.setValue(literalMutated);
            mutants.add(cloned_method);
        }
        return mutants;
    }


    protected Set<? extends Number> numberMutated(CtLiteral literal) {
        Set<Number> values = new HashSet<>();
        Double value = ((Number) literal.getValue()).doubleValue();
        values.add(value + 1);
        values.add(value - 1);

        values.add(value / 2);
        values.add(value * 2);


        List<CtLiteral> lits = literals.get(literal.getValue().getClass());
        if(lits.size() != 0) {
            Random r = new Random();
            values.add((Number) lits.get(r.nextInt(lits.size())).getValue());
        }

        values.remove(value);
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

    protected CtMethod createBooleanMutant(CtMethod test, int lit_index) {
        CtLiteral literal = Query.getElements(test, new TypeFilter<CtLiteral>(CtLiteral.class))
                .get(lit_index);
        Object value = literal.getValue();
        if(value instanceof Boolean) {
            Boolean b = (Boolean) value;

            dataCount++;
            //clone the method
            CtMethod cloned_method = cloneMethod(test, "_literalMutation");

            CtLiteral newLiteral = test.getFactory().Core().createLiteral();
            newLiteral.setTypeCasts(literal.getTypeCasts());

            if(b) {
                newLiteral.setValue(false);
            } else {
                newLiteral.setValue(true);
            }

            Query.getElements(cloned_method, new TypeFilter<CtLiteral>(CtLiteral.class))
                    .get(lit_index).replace(newLiteral);
            return cloned_method;
        }
        return null;
    }

	protected boolean isCase(CtLiteral literal) {
		return literal.getParent(CtCase.class) != null;
	}


    public List<CtMethod> apply(CtMethod method) {
        List<CtMethod> methods = new ArrayList<>();
        //get the list of literals in the method
        List<CtLiteral> l = Query.getElements(method, new TypeFilter(CtLiteral.class));
        //this index serves to replace ith literal is replaced by zero in the ith clone of the method
        int lit_index = 0;
        for(CtLiteral lit : l) {
            try {
            if (!literalInAssert(lit) && !isCase(lit) && lit.getValue() != null) {

                if (lit.getValue() instanceof Number) {
                    methods.addAll(createNumberMutant(method, lit, lit_index));
                }
                if (lit.getValue() instanceof String) {
                    methods.addAll(createStringMutant(method, lit, lit_index));
                }
                if (lit.getValue() instanceof Boolean) {
                    CtMethod mth = createBooleanMutant(method, lit_index);
                    if (mth != null) {
                        methods.add(mth);
                    }
                }
            }
            } catch (Exception e) {
                e.printStackTrace();
                Log.debug("");
            }

            lit_index++;
        }
        return filterAmpTest(methods, method);
    }

    protected Set<CtLiteral> getLiterals(Set<CtType> codeFragmentsProvide) {
        Factory factory = codeFragmentsProvide.stream().findFirst().get().getFactory();
        return (Set<CtLiteral>) codeFragmentsProvide.stream()
                .flatMap(cl -> Query.getElements(cl, new TypeFilter(CtLiteral.class)).stream())
                .map(literal -> ((CtLiteral) literal).getValue())
                .distinct()
                .map(literal -> factory.Code().createLiteral(literal))
                .collect(Collectors.toSet());
    }
}
