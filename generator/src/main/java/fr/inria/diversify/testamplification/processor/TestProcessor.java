package fr.inria.diversify.testamplification.processor;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtPackageReference;
import spoon.reflect.reference.CtTypeReference;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Simon on 03/12/14.
 */
public abstract class TestProcessor extends AbstractProcessor<CtMethod> {
    public static List<CtMethod> notHarmanTest = new LinkedList<>();
    protected static List<CtMethod> mutatedMethod = new LinkedList<>();
    protected static int count = 0;
    protected static Map<String, String> idMap = new HashMap();

    protected int cloneNumber = 1;

    @Override
    public boolean isToBeProcessed(CtMethod candidate) {
        return isTest(candidate) && !mutatedMethod.contains(candidate);
    }

    protected boolean isTest(CtMethod candidate) {
        if(candidate.isImplicit()
                || !candidate.getModifiers().contains(ModifierKind.PUBLIC)
                || candidate.getBody() == null
                || candidate.getBody().getStatements().size() == 0) {
            return false;
        }

        return candidate.getSimpleName().contains("test")
                || candidate.getAnnotations().stream()
                            .map(annotation -> annotation.toString())
                            .anyMatch(annotation -> annotation.startsWith("@org.junit.Test"));
    }

    protected CtMethod cloneMethod(CtMethod method, String suffix) {
        count++;
        CtMethod cloned_method = this.getFactory().Core().clone(method);
        cloned_method.setParent(method.getParent());
        //rename the clone
        cloned_method.setSimpleName(method.getSimpleName()+suffix+cloneNumber);
        cloneNumber++;

        CtAnnotation toRemove = cloned_method.getAnnotations().stream()
                                             .filter(annotation -> annotation.toString().contains("Override"))
                                             .findFirst().orElse(null);

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

        testAnnotation.getElementValues().put("timeout", timeOut);

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

    protected String idFor(String string, String anotation) {
        String key = string + " " + anotation;
        if (!idMap.containsKey(key))
            idMap.put(key, Integer.toString(idMap.size()));

        return idMap.get(key);
    }

    protected String idFor(String string) {
        return idFor(string, "");
    }

    public static void writeIdFile(String dir) throws IOException {
        File file = new File(dir + "/log");
        file.mkdirs();
        FileWriter fw = new FileWriter(file.getAbsoluteFile() + "/id");

        for (String s : idMap.keySet())
            fw.write(idMap.get(s) + " " + s + "\n");

        fw.close();
    }


    protected String getLogName() {
        return "fr.inria.diversify.testamplification.logger.Logger";
    }
}
