package fr.inria.diversify.dspot;

import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.diversification.InputProgram;

import fr.inria.diversify.logger.branch.CoverageReader;
import fr.inria.diversify.logger.branch.TestCoverage;
import fr.inria.diversify.processor.test.*;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import spoon.reflect.declaration.*;
import spoon.reflect.reference.CtTypeReference;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 28/04/15
 * Time: 16:00
 */
public class TestAmplification {
    //current amp test
    //Todo rename
    protected List<CtMethod> ampTests;

    //original test + good amp test
    protected Set<CtMethod> goodTest;
    protected List<TestCoverage> ampCoverage;
    protected MavenBuilder builder;
    protected InputProgram inputProgram;
    protected String outputDirectory;
    protected boolean guavaTestlib = false;
    protected String logger;


    public TestAmplification(InputProgram inputProgram, MavenBuilder builder, String outputDirectory) {
        this.inputProgram = inputProgram;
        this.builder = builder;
        this.outputDirectory = outputDirectory;

        logger = "fr.inria.diversify.logger.logger";

    }

    protected void init() {
        goodTest = new HashSet<>();
        ampTests = new ArrayList<>();
    }

    public void amplification(CtClass classTest, int maxIteration) throws IOException, InterruptedException {
        init();
        int nbTest = getAllTest(classTest).size();
        if(nbTest == 0) {
            return;
        }
        Log.info("amplification of {} ({} test)", classTest.getQualifiedName(), nbTest);

        int nbAmpTest = 0;
        run(classTest);

        deleteLogFile();
        List<CtMethod> instruTests = initAmpTest(classTest);

        for (int i = 0; i < maxIteration; i++) {
            Log.info("iteration {}:", i);
            Log.info("{} new tests generated", instruTests.size() - nbTest);

            int status = run(classTest);
            if(status < -1) {
                break;
            }
            ampCoverage = loadCoverageInfo();

            Collection<CtMethod> testToAmp = selectTestToAmp(nbTest);
            Log.info("{} tests selected", testToAmp.size());
            nbAmpTest += testToAmp.size();
            if (testToAmp.isEmpty()) {
                break;
            }
            removeTests(instruTests);
            instruTests = makeAndWriteAmpTest(testToAmp);
        }
        Log.info("{} tests amplified", nbAmpTest);
        removeTests(instruTests);
        makeDSpotClassTest();
    }

    protected int run(CtClass classTest) throws InterruptedException {
        String goals = "test -Dmaven.compiler.useIncrementalCompilation=false -Dmaven.main.skip=true -Dtest=";
        if(classTest.getModifiers().contains(ModifierKind.ABSTRACT)) {
            goals += inputProgram.getAllElement(CtClass.class).stream()
                        .map(elem -> (CtClass) elem)
                        .filter(cl -> !cl.getModifiers().contains(ModifierKind.ABSTRACT))
                        .filter(cl -> {
                            CtTypeReference superClass = cl.getSuperclass();
                            while (superClass != null && superClass.getDeclaration() != null) {
                                if (superClass.getDeclaration() == classTest) {
                                    return true;
                                }
                                superClass = superClass.getSuperclass();
                            }
                            return false;
                        })
                        .map(CtClass::getQualifiedName)
                        .collect(Collectors.joining(","));
        } else {
            goals += classTest.getQualifiedName();
        }

        builder.runBuilder(new String[]{goals});
        return builder.getStatus();
    }

    protected void removeTests(Collection<CtMethod> tests) {
        tests.stream()
                .forEach(test -> {
                    CtClass cl = (CtClass) test.getDeclaringType();
                    cl.removeMethod(test);
                });
    }

    protected Collection<CtMethod> selectTestToAmp(int reduceThreshold) {
        Map<CtMethod, Set<String>> select = new HashMap<>();

        for (CtMethod ampTest : ampTests) {
            for (TestCoverage tc : getTestCoverageFor(ampTest)) {
                TestCoverage parentTc = getParentTestCoverageFor(tc);
                if (parentTc != null && tc.containsAllBranch(parentTc) && !parentTc.containsAllBranch(tc)) {
                    Set<String> branches = tc.getCoveredBranch();
                    branches.removeAll(parentTc.getCoveredBranch());
                    select.put(ampTest, branches);
                    goodTest.add(ampTest);
                    break;
                }
            }
        }
        if(select.size() > reduceThreshold) {
            return reduceSelectedTest(select);
        } else {
            return select.keySet();
        }
    }

    protected Collection<CtMethod> reduceSelectedTest(Map<CtMethod, Set<String>> selected) {
        Map<Set<String>, List<CtMethod>> map = selected.keySet().stream()
                .collect(Collectors.groupingBy(mth -> selected.get(mth)));

        List<Set<String>> sortedKey = map.keySet().stream()
                .sorted((l1, l2) -> Integer.compare(l2.size(), l1.size()))
                .collect(Collectors.toList());

        Set<String> branches = sortedKey.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toSet());

        List<CtMethod> methods = new ArrayList<>();

        while(!branches.isEmpty()) {
            Set<String> key = sortedKey.remove(0);
            branches.removeAll(key);
            methods.add(map.get(key).stream().findAny().get());
        }

        return methods;
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

        deleteLogFile();

        return result;
    }

    protected void deleteLogFile() throws IOException {
        File dir = new File(outputDirectory+ "/log");
        for(File file : dir.listFiles()) {
            if(!file.getName().equals("info")) {
                FileUtils.forceDelete(file);
            }
        }
    }

    protected List<CtMethod> initAmpTest(CtClass classTest) {
        goodTest = getAllTest(classTest);
        return makeAndWriteAmpTest(goodTest);
    }

    protected List<CtMethod> makeAndWriteAmpTest(Collection<CtMethod> tests) {
        ampTests.clear();
        removeTests(goodTest);

        File out = new File(outputDirectory + "/" + inputProgram.getRelativeTestSourceCodeDir());
        List<CtMethod>  currentAmpTests = tests.stream()
                .flatMap(test -> ampTests(test).stream())
                .collect(Collectors.toList());

        ampTests.addAll(currentAmpTests);
        currentAmpTests.addAll(goodTest);

        currentAmpTests.stream()
                .forEach(test -> test.getDeclaringType().removeMethod(test));

        List<CtClass> classesInstru = currentAmpTests.stream()
                .map(ampTest -> instruMethod(ampTest))
                .map(instruTest -> {
                    CtClass cl = (CtClass) instruTest.getDeclaringType();
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
        return currentAmpTests;
    }

    protected void makeDSpotClassTest() {
        File out = new File(outputDirectory + "/" + inputProgram.getRelativeTestSourceCodeDir());
        goodTest.stream()
//                .map(ampTest -> instruMethod(ampTest))
                .forEach(test -> test.getDeclaringType().addMethod(test));

        goodTest.stream()
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
        testCase.setLogger(logger + ".Logger");
        testCase.setFactory(inputProgram.getFactory());
        testCase.process(clone);

        TestLoggingInstrumenter logging = new TestLoggingInstrumenter();
        logging.setLogger(logger + ".Logger");
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

    protected Set<CtMethod> getAllTest(CtClass classTest) {
        return new ArrayList<CtMethod>(classTest.getMethods()).stream()
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
}
