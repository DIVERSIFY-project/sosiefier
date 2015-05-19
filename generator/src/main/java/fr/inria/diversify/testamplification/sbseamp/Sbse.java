package fr.inria.diversify.testamplification.sbseamp;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.testamplification.branchcoverage.load.Coverage;
import fr.inria.diversify.testamplification.branchcoverage.load.CoverageReader;
import fr.inria.diversify.testamplification.branchcoverage.load.TestCoverage;
import fr.inria.diversify.testamplification.processor.*;

import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import spoon.reflect.declaration.*;


import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 28/04/15
 * Time: 16:00
 */
public class Sbse {
    protected List<CtMethod> ampTests;

    protected List<CtMethod> goodTest;
    protected List<TestCoverage> ampCoverage;
    protected Coverage globalCoverage;
    protected MavenBuilder builder;
    protected InputProgram inputProgram;
    protected String outputDirectory;
    protected boolean guavaTestlib = false;

    protected String[] ampTestsNames;


    public Sbse(String propertiesFile) throws Exception, InvalidSdkException {
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);
        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);

        outputDirectory = inputConfiguration.getProperty("outputDirectory");

        if(inputConfiguration.getProperty("ampTestsNames") != null) {
            ampTestsNames = inputConfiguration.getProperty("ampTestsNames").split(";");
        }

        goodTest = new ArrayList<>();
        ampTests = new ArrayList<>();
    }

    public void sbse(int maxIteration) throws IOException, InterruptedException {
        int count = 0;
        init();
        ampCoverage = loadCoverageInfo();
        Log.info("current coverage: {}", coverage());
        globalCoverage.info();
        initAmpTest();

        while(count < maxIteration) {
            run();
            ampCoverage = loadCoverageInfo();
            Log.info("iteration {}: current coverage: {}", count, coverage());

            count++;
            List<CtMethod> testToAmp = selectTestToAmp();
            removeBadAmpTest();
            makeAndWriteAmpTest(testToAmp);
        }
    }

    private void removeBadAmpTest() {
        for(CtMethod test : ampTests) {
            String name = test.getSimpleName();
            boolean b = goodTest.stream()
                    .noneMatch(gt -> gt.getSimpleName().equals(name));
            if(b) {
                ((CtClass) test.getDeclaringType()).removeMethod(test);
            }
        }
    }

    protected List<CtMethod> selectTestToAmp() {
        List<CtMethod> select = new ArrayList<>();

    for (CtMethod ampTest : ampTests) {
        for (TestCoverage tc : getTestCoverageFor(ampTest)) {
            TestCoverage parentTc = getParentTestCoverageFor(tc);
            if (parentTc != null && tc.containsAllBranch(parentTc) && !parentTc.containsAllBranch(tc)) {
                select.add(ampTest);
                goodTest.add(ampTest);
                break;
            }
        }
    }
        return select;
    }

    protected List<TestCoverage> getTestCoverageFor(CtMethod ampTest) {
        String testName = ampTest.getSimpleName();

        return ampCoverage.stream()
                .filter(c -> c.getTestName().endsWith(testName))
                .collect(Collectors.toList());
    }

    protected TestCoverage getParentTestCoverageFor(TestCoverage tc) {
        String parentName = tc.getTestName().substring(0, tc.getTestName().lastIndexOf("_"));

        return ampCoverage.stream()
                .filter(c -> c.getTestName().endsWith(parentName))
                .findFirst()
                .orElse(null);
    }

    protected List<TestCoverage> loadCoverageInfo() throws IOException {
        CoverageReader reader = new CoverageReader(outputDirectory+ "/log");
        List<TestCoverage> result = reader.loadTest();

        reader = new CoverageReader(outputDirectory+ "/log");
        globalCoverage = reader.load();

        File dir = new File(outputDirectory+ "/log");
        for(File file : dir.listFiles()) {
            if(!file.getName().equals("info")) {
                FileUtils.forceDelete(file);
            }
        }
        return result;
    }


    protected void init() throws IOException, InterruptedException {
        File dir = new File(outputDirectory);
        dir.mkdirs();
        FileUtils.copyDirectory(new File(inputProgram.getProgramDir()), dir);

        InitUtils.initSpoon(inputProgram, false);
        initBuilder();
    }


    protected void run() throws InterruptedException {
        builder.runBuilder();
    }


    protected void initBuilder() throws InterruptedException, IOException {
        String[] phases  = new String[]{"clean", "test"};
        builder = new MavenBuilder(outputDirectory);

        builder.setGoals(phases);
        builder.initTimeOut();
    }

    protected void initAmpTest() {
        goodTest = getAllTest();
        makeAndWriteAmpTest(goodTest);
    }

    protected void makeAndWriteAmpTest(List<CtMethod> tests) {
        ampTests.clear();

        File out = new File(outputDirectory + "/" + inputProgram.getRelativeTestSourceCodeDir());
        List<CtMethod>  testToInstru = tests.stream()
                .flatMap(test -> ampTests(test).stream())
                .collect(Collectors.toList());

        ampTests.addAll(testToInstru);
        testToInstru.addAll(goodTest);


        List<CtClass> classesInstru = testToInstru.stream()
                .map(ampTest -> instruMethod(ampTest))
                .map(instruTest -> {
                    CtClass cl = (CtClass) instruTest.getDeclaringType();
                    cl.removeMethod(instruTest);
                    cl.addMethod(instruTest);

                    return cl;
                })
                .distinct()
                .collect(Collectors.toList());

        classesInstru.stream()
                .forEach(cl -> {
                            try {
                                LoggerUtils.printJavaFile(out, cl);
                            } catch (Exception e) {
                            }
                        }
                );
    }

    protected List<CtMethod> ampTests(CtMethod test) {
        List<CtMethod> methods = new ArrayList<>();

        TestDataMutator dataMutator = new TestDataMutator();
        dataMutator.setFactory(inputProgram.getFactory());
        methods.addAll(dataMutator.apply(test));

        TestMethodCallAdder methodAdd = new TestMethodCallAdder();
        methodAdd.setFactory(inputProgram.getFactory());
        methods.addAll(methodAdd.apply(test));

        TestMethodCallRemover methodRemove = new TestMethodCallRemover();
        methodRemove.setFactory(inputProgram.getFactory());
        methods.addAll(methodRemove.apply(test));

        return methods;
    }

    protected CtMethod instruMethod(CtMethod method) {
        CtMethod clone = cloneMethod(method);

        TestCaseProcessor testCase = new TestCaseProcessor(inputProgram.getAbsoluteTestSourceCodeDir(), false);
        testCase.setLogName("fr.inria.diversify.testamplification.branchcoverage.logger.Logger");
        testCase.setFactory(inputProgram.getFactory());
        testCase.process(clone);

        TestLoggingInstrumenter logging = new TestLoggingInstrumenter();
        logging.setLogName("fr.inria.diversify.testamplification.branchcoverage.logger.Logger");
        logging.setFactory(inputProgram.getFactory());
        logging.process(clone);

        return clone;
    }


    protected CtMethod cloneMethod(CtMethod method) {
        CtMethod cloned_method = method.getFactory().Core().clone(method);
        cloned_method.setParent(method.getParent());

        CtAnnotation toRemove = cloned_method.getAnnotations().stream()
                .filter(annotation -> annotation.toString().contains("Override"))
                .findFirst().orElse(null);

        if(toRemove != null) {
            cloned_method.removeAnnotation(toRemove);
        }
        return cloned_method;
    }

    protected List<CtMethod> getAllTest() {
        return inputProgram.getAllElement(CtMethod.class).stream()
                .map(elem -> (CtMethod)elem)
                .filter(mth -> isTest(mth))
                .distinct()
                .collect(Collectors.toList());
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

        if(!guavaTestlib) {
            return candidate.getSimpleName().contains("test")
                    || candidate.getAnnotations().stream()
                    .map(annotation -> annotation.toString())
                    .anyMatch(annotation -> annotation.startsWith("@org.junit.Test"));
        } else {
            return  subClassOfAbstractTester((CtClass) candidate.getDeclaringType())
                    && (candidate.getSimpleName().contains("test")
                    || candidate.getAnnotations().stream()
                    .map(annotation -> annotation.toString())
                    .anyMatch(annotation -> annotation.startsWith("@org.junit.Test")));
        }
    }

    protected boolean subClassOfAbstractTester(CtClass cl) {
        try {
            if (cl.getSimpleName().equals("AbstractTester")) {
                return true;
            } else {
                if (cl.getSuperclass().getDeclaration() != null || !cl.getSuperclass().getSimpleName().equals("Object")) {
                    return subClassOfAbstractTester((CtClass) cl.getSuperclass().getDeclaration());
                }
            }
        } catch (Exception e) {}
        return false;
    }

    protected double coverage() {
        Set<String> set = new HashSet<>();
        if(ampTestsNames == null) {
           return globalCoverage.coverage();
        } else {
            for (String ampTest : ampTestsNames) {
                set.addAll(getSuperClasses(ampTest));
            }
        }
        globalCoverage.getCoverageBranch(set);
        return globalCoverage.coverage(set);
    }

    protected Set<String> getSuperClasses(String className) {
        CtClass cl = inputProgram.getAllElement(CtClass.class).stream()
                .map(c -> (CtClass) c)
                .filter(c -> c.getQualifiedName().contains("." + className))
                .findFirst()
                .orElse(null);

        Set<String> set = new HashSet<>();
        CtClass superCl = cl;
        while (superCl != null) {
            try {
                set.add(superCl.getQualifiedName());

                superCl = (CtClass) superCl.getSuperclass().getDeclaration();

            } catch (Exception e) {
                superCl = null;
            }
        }
        return set;
    }

    public static void main(String[] args) throws Exception, InvalidSdkException {
        Sbse sbse = new Sbse(args[0]);
        sbse.sbse(10);
    }
}
