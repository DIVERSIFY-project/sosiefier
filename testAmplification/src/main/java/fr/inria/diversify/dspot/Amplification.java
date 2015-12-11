package fr.inria.diversify.dspot;

import fr.inria.diversify.buildSystem.DiversifyClassLoader;
import fr.inria.diversify.dspot.processor.*;
import fr.inria.diversify.factories.DiversityCompiler;
import fr.inria.diversify.logger.branch.Coverage;
import fr.inria.diversify.logger.branch.TestCoverage;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import spoon.compiler.Environment;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 03/12/15
 * Time: 13:52
 */
public class Amplification {
    protected DiversifyClassLoader applicationClassLoader;
    protected InputProgram inputProgram;
    protected List<AbstractAmp> amplifiers;
    protected DiversityCompiler compiler;
    protected TestSelector testSelector;
    protected List<CtMethod> allTests;

    public Amplification(InputProgram inputProgram, DiversityCompiler compiler) {
        this.inputProgram = inputProgram;
        this.compiler = compiler;
        testSelector = new TestSelector(inputProgram);
        allTests = new ArrayList<>();
        initClassLoader();
        initCompiler();

    }

    public void amplification(CtClass classTest, int maxIteration) throws IOException, InterruptedException, ClassNotFoundException {

        Set<CtMethod> tests = getAllTest(classTest);
        int nbTest = tests.size();
        if(nbTest == 0) {
            return;
        }
        Log.info("amplification of {} ({} test)", classTest.getQualifiedName(), nbTest);

        List<CtClass> classWithLogger = testSelector.getMethodsWithLogger(tests);
        boolean status = writeAndCompile(classWithLogger);
        if(!status) {
            Log.info("error whit Logger in classes {}", classWithLogger.stream().map(cl ->cl.getQualifiedName()).collect(Collectors.toList()));
            return;
        }
        runTests(classWithLogger, new ArrayList<>());
        testSelector.updateLogInfo();
        initAmplifiers(classTest, testSelector.getGlobalCoverage());

        List<CtMethod> ampTest = new ArrayList<>();
        for(CtMethod test : tests) {
            allTests.clear();
            testSelector.init();

            List<CtMethod> t = new ArrayList<>(1);
            t.add(test);

            runTests(classWithLogger, t);
            testSelector.updateLogInfo();

            amplification(t, maxIteration);
            ampTest.addAll(testSelector.selectedAmplifiedTests(allTests));
        }

        makeDSpotClassTest(ampTest);
    }

    public void amplification(Collection<CtMethod> tests, int maxIteration) throws IOException, InterruptedException, ClassNotFoundException {
        Collection<CtMethod> newTests = tests;
        allTests.addAll(newTests);
        for (int i = 0; i < maxIteration; i++) {
            Log.info("iteration {}:", i);

            Collection<CtMethod> testToAmp = testSelector.selectTestToAmp(allTests, newTests, 10);
            if(testToAmp.isEmpty()) {
                break;
            }
            newTests = ampTest(testToAmp);
            Log.info("{} new tests generated", newTests.size());

            List<CtClass> classWithLogger = testSelector.getMethodsWithLogger(newTests);
            boolean status = writeAndCompile(classWithLogger);

            if(!status) {
                break;
            }
//            CtMethod tmp = newTests.stream().findAny().get();
//            AssertGenerator ag = new AssertGenerator(tmp, inputProgram, compiler, applicationClassLoader ,findStatementToAssert(tmp)) ;
//            ag.genereteAssert();

            Result result = runTests(classWithLogger, newTests);
            allTests.addAll(excludeTimeOutAndCompilationErrorTest(newTests, result));
            testSelector.updateLogInfo();
        }
    }

    private Collection<? extends CtMethod> excludeTimeOutAndCompilationErrorTest(Collection<CtMethod> newTests, Result result) {
        List<CtMethod> tests = new ArrayList<>(newTests);
        for(Failure failure : result.getFailures()) {
            String exceptionMessage = failure.getException().getMessage();
            if(exceptionMessage == null
                    || exceptionMessage.contains("Unresolved compilation problem")
                    || exceptionMessage.contains("test timed out after")) {
                String testName = failure.getDescription().getMethodName();
                CtMethod toRemove = newTests.stream()
                        .filter(test -> test.getSimpleName().equals(testName))
                        .findFirst()
                        .get();
                tests.remove(toRemove);
            }
        }
        return tests;
    }

    protected void initCompiler() {
        if(compiler.getDestinationDirectory() == null) {
            File classOutputDir = new File("tmpDir/tmpClasses_" + System.currentTimeMillis());
            if (!classOutputDir.exists()) {
                classOutputDir.mkdirs();
            }
            compiler.setDestinationDirectory(classOutputDir);
        }
        if(compiler.getOutputDirectory().toString().equals("spooned")) {
            File sourceOutputDir = new File("tmpDir/tmpSrc_" + System.currentTimeMillis());
            if (!sourceOutputDir.exists()) {
                sourceOutputDir.mkdirs();
            }
            compiler.setOutputDirectory(sourceOutputDir);
        }

        Environment env = compiler.getFactory().getEnvironment();
        env.setDefaultFileGenerator(new JavaOutputProcessor(compiler.getOutputDirectory(),
                new DefaultJavaPrettyPrinter(env)));
    }

    protected boolean writeAndCompile(List<CtClass> classesInstru) throws IOException {
        FileUtils.cleanDirectory(compiler.getOutputDirectory());
        FileUtils.cleanDirectory(compiler.getDestinationDirectory());
        classesInstru.stream()
                .forEach(cl -> {
                            try {
                                LoggerUtils.printJavaFile(compiler.getOutputDirectory(), cl);
                            } catch (Exception e) {
                            }
                        }
                );
        try {
            compiler.compileFileIn(compiler.getOutputDirectory());
            return true;
        } catch (Exception e) {
            Log.warn("error during compilation",e);
            return false;
        }
    }

    protected Result runTests(List<CtClass> testClasses, Collection<CtMethod> tests) throws ClassNotFoundException {
        JunitRunner junitRunner = new JunitRunner(inputProgram, new DiversifyClassLoader(applicationClassLoader, compiler.getDestinationDirectory().getAbsolutePath()));

        return junitRunner.runTestClasses(testClasses, tests.stream()
                .map(test-> test.getSimpleName())
                .collect(Collectors.toList()));
    }



    protected List<CtMethod> ampTest(Collection<CtMethod> tests) {
        return tests.stream()
                .flatMap(test -> ampTest(test).stream())
                .collect(Collectors.toList());
    }

    protected List<CtMethod> ampTest(CtMethod test) {
        return amplifiers.stream().
                flatMap(amplifier -> amplifier.apply(test).stream())
                .collect(Collectors.toList());
    }

    protected void initAmplifiers(CtClass parentClass, Coverage coverage) {
        amplifiers = new ArrayList<>();

        AbstractAmp dataMutator = new TestDataMutator(inputProgram, parentClass);
        dataMutator.reset();
        amplifiers.add(dataMutator);

        AbstractAmp methodAdd = new TestMethodCallAdder();
        methodAdd.reset();
        amplifiers.add(methodAdd);

        AbstractAmp methodRemove = new TestMethodCallRemover();
        methodRemove.reset();
        amplifiers.add(methodRemove);

        AbstractAmp stmtAdder = new StatementAdder2(inputProgram, coverage, parentClass);
        stmtAdder.reset();
        amplifiers.add(stmtAdder);

    }

    protected void initClassLoader() {
        List<String> classPaths = new ArrayList<>();
        classPaths.add(inputProgram.getProgramDir() + "/" + inputProgram.getClassesDir());
        classPaths.add(inputProgram.getProgramDir() + "/" + inputProgram.getTestClassesDir());
        applicationClassLoader = new DiversifyClassLoader(Thread.currentThread().getContextClassLoader(), classPaths);
        List<String> filter = new ArrayList<>();
        filter.add("org.apache.commons.lang3");
        applicationClassLoader.setClassFilter(filter);
    }

    protected Set<CtMethod> getAllTest(CtClass classTest) {
        Set<CtMethod> mths = classTest.getMethods();
        return mths.stream()
                .filter(mth -> isTest(mth))
                .collect(Collectors.toSet());
    }

    protected boolean isTest(CtMethod candidate) {
        if(candidate.isImplicit()
                || !candidate.getModifiers().contains(ModifierKind.PUBLIC)
                || candidate.getBody() == null
                || candidate.getBody().getStatements().size() == 0) {
            return false;
        }

        if(!candidate.getPosition().getFile().toString().contains(inputProgram.getRelativeTestSourceCodeDir())) {
            return false;
        }

        return candidate.getSimpleName().contains("test")
                || candidate.getAnnotations().stream()
                .map(annotation -> annotation.toString())
                .anyMatch(annotation -> annotation.startsWith("@org.junit.Test"));
    }

    protected void makeDSpotClassTest(Collection<CtMethod> tests) {
        //                    AssertGenerator ag = new AssertGenerator( instruTests.get(0), compiler, inputProgram) ;
//                    ag.genereteAssert();


        File out = new File(inputProgram.getProgramDir() + "/" + inputProgram.getRelativeTestSourceCodeDir());
        tests.stream()
                .forEach(test -> test.getDeclaringType().addMethod(test));

        tests.stream()
                .map(test -> test.getDeclaringType())
                .distinct()
                .forEach(cl -> {
                            try {
                                LoggerUtils.printJavaFile(out, cl);
                            } catch (Exception e) {
                            }
                        }
                );
    }

    protected List<Integer> findStatementToAssert(CtMethod test) {
        CtMethod originalTest = getOriginalTest(test);

        List<CtStatement> originalStmts = Query.getElements(originalTest, new TypeFilter(CtStatement.class));
        List<String> originalStmtStrings = originalStmts.stream()
                .map(stmt -> stmt.toString())
                .collect(Collectors.toList());

        List<CtStatement> ampStmts = Query.getElements(test, new TypeFilter(CtStatement.class));
        List<String> ampStmtStrings = ampStmts.stream()
                .map(stmt -> stmt.toString())
                .collect(Collectors.toList());

        List<Integer> indexs = new ArrayList<>();
        for(int i = 0; i < ampStmtStrings.size(); i++) {
            int index = originalStmtStrings.indexOf(ampStmtStrings.get(i));
            if(index == -1) {
                indexs.add(i);
            } else {
                originalStmtStrings.remove(index);
            }
        }

        return indexs;
    }

    protected CtMethod getOriginalTest(CtMethod test) {
        CtMethod parent = AbstractAmp.getAmpTestToParent().get(test);
        while(AbstractAmp.getAmpTestToParent().get(parent) != null) {
            parent = AbstractAmp.getAmpTestToParent().get(parent);
        }
        return parent;
    }
}
