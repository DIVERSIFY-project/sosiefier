package fr.inria.diversify.testamplification.processor;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.reference.CtPackageReference;
import spoon.reflect.reference.CtTypeReference;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Simon on 03/12/14.
 */
public abstract class TestProcessor extends AbstractProcessor<CtMethod> {
    protected static List<CtMethod> mutatedMethod = new LinkedList<>();
    protected static int count;

    protected int cloneNumber = 1;
    @Override
    public boolean isToBeProcessed(CtMethod candidate) {

        if(candidate.isImplicit()
                || candidate.getBody() == null
                || candidate.getBody().getStatements().size() == 0
                || mutatedMethod.contains(candidate)) {
            return false;
        }

        return candidate.getSimpleName().contains("test")
            || candidate.getAnnotations().stream()
                .map(annotation -> annotation.toString())
                .anyMatch(annotation -> annotation.startsWith("@org.junit.Test"));

//        for(CtAnnotation<?> annotation: candidate.getAnnotations()) {
//            if (annotation.toString().startsWith("@org.junit.Test")) {
//                return true;
//            }
//        }
//        if(candidate.getSimpleName().contains("test")) {
//            return true;
//        }
//        return false;
    }

    protected CtMethod cloneMethod(CtMethod method, String suffix) {
        CtMethod cloned_method = this.getFactory().Core().clone(method);
        cloned_method.setParent(method.getParent());
        //rename the clone
        cloned_method.setSimpleName(method.getSimpleName()+suffix+cloneNumber);
        cloneNumber++;

        CtAnnotation toRemove = cloned_method.getAnnotations().stream()
                .filter(annotation -> annotation.toString().contains("Override"))
                .findFirst().orElse(null);
//        for(CtAnnotation annotation : cloned_method.getAnnotations()) {
//            if(annotation.toString().contains("Override")) {
//                toRemove = annotation;
//            }
//        }
        if(toRemove != null) {
            cloned_method.removeAnnotation(toRemove);
        }
        mutatedMethod.add(cloned_method);
        return cloned_method;
    }

    protected CtMethod cloneMethodTest(CtMethod method, String suffix, int timeOut) {
        CtMethod cloned_method = cloneMethod(method,suffix);
        CtAnnotation testAnnotation = cloned_method.getAnnotations().stream()
                .filter(annotation -> annotation.toString().contains("Test"))
                .findFirst().orElse(null);
//        for(CtAnnotation annotation : cloned_method.getAnnotations()) {
//            if(annotation.toString().contains("Test")) {
//                testAnnotation = annotation;
//            }
//        }
        if(testAnnotation == null) {
            testAnnotation = getFactory().Core().createAnnotation();
            CtTypeReference<Object> ref = getFactory().Core().createTypeReference();
            ref.setSimpleName("Test");

            CtPackageReference refPackage = getFactory().Core().createPackageReference();
            refPackage.setSimpleName("org.junit");
            ref.setPackage(refPackage);
            testAnnotation.setAnnotationType(ref);
            Map<String, Object> elementValue = new HashMap<String, Object>();
            testAnnotation.setElementValues(elementValue);
        }
//        if(testAnnotation.getElementValue("timeout") == null) {
            testAnnotation.getElementValues().put("timeout", timeOut);
//        }
        cloned_method.addAnnotation(testAnnotation);

        return cloned_method;
    }

    protected boolean isAssert(CtInvocation invocation) {
        try {
            Class cl = invocation.getExecutable().getDeclaringType().getActualClass();
            String signature = invocation.getSignature();
            return (signature.contains("assert") || signature.contains("fail"))
             && isAssertInstance(cl);
        } catch (Exception e) {
            return false;
        }

    }

    protected boolean isAssertInstance(Class cl) {
        if (cl.equals(org.junit.Assert.class) || cl.equals(junit.framework.Assert.class))
            return true;
        Class superCl = cl.getSuperclass();
        if(superCl != null) {
            return isAssertInstance(superCl);
        }
        return false;
    }

    public static int getCount() {
        return count;
    }
}
