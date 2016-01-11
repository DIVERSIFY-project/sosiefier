package fr.inria;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.LoggerUtils;
import org.junit.runner.notification.Failure;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 08/01/16
 * Time: 18:36
 */
public class MutantTestSuiteBuilder {
    protected InputProgram inputProgram;
    protected CtClass originalClass;

    public MutantTestSuiteBuilder(InputProgram inputProgram , CtClass originalClass) {
        this.inputProgram = inputProgram;
        this.originalClass = originalClass;
    }

    public void addMutant(CtClass mutantClass, Collection<Failure> failures) throws IOException {
        Set<CtClass> mutantTestClasses = createMutantProject(mutantClass, failures);
        try {
            List<String> result = verifyFailure();
            Log.debug("");
        } catch (InterruptedException e) {
            e.printStackTrace();
            Log.debug("");
        }

        addGitBranch(mutantClass, mutantTestClasses);

        restore(mutantTestClasses);
    }

    protected List<String> verifyFailure() throws InterruptedException, IOException {
        String[] phases  = new String[]{"clean", "test"};
        MavenBuilder builder = new MavenBuilder(inputProgram.getProgramDir());

        builder.setGoals(phases);
        builder.initTimeOut();

        return builder.getFailedTests();
    }


        protected void addGitBranch(CtClass mutantClass, Set<CtClass> mutantTestClasses) {

    }

    protected Set<CtClass> createMutantProject(CtClass mutantClass, Collection<Failure> failures) throws IOException {
        File sourceDir = new File(inputProgram.getAbsoluteSourceCodeDir());
        File testSourceDir = new File(inputProgram.getAbsoluteTestSourceCodeDir());

        LoggerUtils.printJavaFile(sourceDir, mutantClass);

        Map<CtClass, List<Failure>> failureByTestClass = failures.stream()
                .collect(Collectors.groupingBy(failure -> findTestClass(failure.getDescription().getClassName())));

        cloneTestClass = new HashMap<>();
        Set<CtClass> mutantTestClasses = failureByTestClass.entrySet().stream()
                .flatMap(entry -> removeFailTest(entry.getKey(), entry.getValue()).stream())
                .collect(Collectors.toSet());

        for (CtClass testClass : mutantTestClasses) {
            LoggerUtils.printJavaFile(testSourceDir, testClass);
        }

        return mutantTestClasses;
    }
    Map<String, CtClass> cloneTestClass;
    protected Collection<CtClass> removeFailTest(CtClass testClass, List<Failure> failures) {
        Factory factory = testClass.getFactory();


        Set<String> testMthNames = failures.stream()
                .map(failure -> failure.getDescription().getMethodName())
                .collect(Collectors.toSet());
        Set<CtMethod> allTestMths = testClass.getAllMethods();

        for(String testMthName : testMthNames) {
            allTestMths.stream()
                    .filter(mth -> mth.getSimpleName().equals(testMthName))
                    .map(mth -> (CtClass)mth.getDeclaringType())
                    .peek(cl -> {
                        if(!cloneTestClass.containsKey(cl.getQualifiedName())) {
                            CtClass clone = factory.Core().clone(cl);
                            clone.setParent(cl.getParent());
                            cloneTestClass.put(cl.getQualifiedName(), clone);
                        }
                    })
                    .map(cl -> cloneTestClass.get(cl.getQualifiedName()))
                    .forEach(cl -> cl.getMethod(testMthName).setBody(factory.Core().createBlock()));
        }
        return cloneTestClass.values();
    }

    protected void restore(Collection<CtClass> testClasses) throws IOException {
        File sourceDir = new File(inputProgram.getAbsoluteSourceCodeDir());
        File testSourceDir = new File(inputProgram.getAbsoluteTestSourceCodeDir());

        LoggerUtils.printJavaFile(sourceDir, originalClass);

        List<CtClass> originalTestClass = testClasses.stream()
                .map(cl -> findTestClass(cl.getQualifiedName()))
                .collect(Collectors.toList());

        for(CtClass testClass : originalTestClass) {
            LoggerUtils.printJavaFile(testSourceDir, testClass);
        }
    }

    protected CtClass findTestClass(String className) {
        List<CtType> classes = inputProgram.getAllElement(CtType.class);

        return (CtClass) classes.stream()
                .filter(c -> c.getQualifiedName().equals(className))
                .findFirst()
                .orElse(null);
    }
}
