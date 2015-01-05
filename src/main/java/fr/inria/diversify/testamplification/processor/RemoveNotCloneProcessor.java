package fr.inria.diversify.testamplification.processor;

import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtSimpleType;

/**
 * Created by Simon on 17/12/14.
 */
public class RemoveNotCloneProcessor extends TestProcessor {

    @Override
    public boolean isToBeProcessed(CtMethod method) {

        return super.isToBeProcessed(method) && !mutatedMethod.contains(method);
    }


    @Override
    public void process(CtMethod method) {

        CtMethod replace = findCandidateForReplace(method);
        if(replace != null) {
            boolean remove = ((CtClass) method.getDeclaringType()).removeMethod(method);
            if(remove) {
                replace.setSimpleName(method.getSimpleName());
            }
        }
    }

    protected CtMethod findCandidateForReplace(CtMethod method) {
        CtSimpleType<?> type = method.getDeclaringType();
        String methodName = method.getSimpleName();

            return mutatedMethod.stream()
                                .filter(mth -> mth.getDeclaringType().equals(type))
                                .filter(mth -> mth.getSimpleName().startsWith(methodName))
                                .findAny().orElseGet(() ->  null);

    }
}
