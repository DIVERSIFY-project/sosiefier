package fr.inria.diversify.testamplification.harman;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import org.apache.commons.io.FileUtils;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Simon on 20/02/15.
 */
public class Harman {
    protected Map<CtClass, Set<CtMethod>> originalTests;
    protected Map<CtClass, Set<CtMethod>> newTests;
    protected String tmpDir;
    InputProgram inputProgram;
    protected AbstractBuilder builder;
    List<CtClass> applicationClasses;


    public Harman(InputConfiguration inputConfiguration) {
        this.inputProgram = inputConfiguration.getInputProgram();
    }

    public void run() throws IOException, InterruptedException {
        Algo algo = new Algo(tmpDir, inputProgram, builder, applicationClasses, 10, 1);
        algo.initFitnessValue();
        for(CtClass testClass : originalTests.keySet()) {
            Set<CtMethod> newTest = algo.testDataRegeneration(originalTests.get(testClass), testClass);
            newTests.put(testClass,newTest);
        }
    }

    public void init(String tmpDir) throws IOException, InterruptedException {
        this.tmpDir = tmpDir;
        originalTests = new HashMap<>();
        newTests = new HashMap<>();

        for(CtElement element : inputProgram.getAllElement(CtClass.class)) {
            CtClass cl = (CtClass) element;
            if(isTestClass(cl)) {
                originalTests.put(cl, new HashSet<>());
                for(Object o : cl.getMethods()) {
                    CtMethod method = (CtMethod) o;
                    if(isTestMethod(method)) {
                        originalTests.get(cl).add(method);
                    }
                }
            }
        }
//        initDirectory();
        initBuilder();
        initApplicationClasses();
    }

    protected void initApplicationClasses() throws IOException {
        String applicationSourceDir = (new File(tmpDir + "/" +inputProgram.getRelativeSourceCodeDir())).getCanonicalFile().getCanonicalPath();
        applicationClasses = inputProgram.getAllElement(CtClass.class).stream()
                .map(o -> (CtClass) o)
                .filter(cl -> cl.getPosition().getFile().getAbsolutePath().contains(applicationSourceDir))
                .collect(Collectors.toList());
    }

    protected boolean isTestClass(CtClass candidate) {
        return candidate.getSimpleName().contains("Test");
    }

    protected boolean isTestMethod(CtMethod candidate) {
        return candidate.getSimpleName().contains("test")
                || candidate.getAnnotations().stream()
                            .map(annotation -> annotation.toString())
                            .anyMatch(annotation -> annotation.startsWith("@org.junit.Test"));
    }


    protected void initBuilder() throws InterruptedException, IOException {
        String[] phases  = new String[]{"clean", "test" };
        builder = new MavenBuilder(tmpDir);

        builder.setGoals(phases);
        builder.initTimeOut();
    }
}
