package fr.inria.diversify.dspot;

import fr.inria.diversify.dspot.processor.AbstractAmp;
import fr.inria.diversify.logger.branch.CoverageReader;
import fr.inria.diversify.logger.branch.TestCoverage;
import fr.inria.diversify.processor.test.AssertionRemover;
import fr.inria.diversify.processor.test.TestLoggingInstrumenter;
import fr.inria.diversify.runner.InputProgram;
import org.apache.commons.io.FileUtils;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 03/12/15
 * Time: 14:09
 */
public class TestSelector {
    protected InputProgram inputProgram;
    protected Map<String, Integer> testAges;
    protected List<TestCoverage> ampCoverage;
    protected String logger;

    public TestSelector(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
        this.logger = "fr.inria.diversify.logger.logger";
    }

    protected void init() throws IOException {
        deleteLogFile();
        testAges = new HashMap<>();
    }

    protected void updateLogInfo() throws IOException {
        CoverageReader reader = new CoverageReader(inputProgram.getProgramDir()+ "/log");
        if(ampCoverage == null) {
            ampCoverage = reader.loadTest();
        } else {
            for(TestCoverage coverage : reader.loadTest()) {
                TestCoverage previous = ampCoverage.stream()
                        .filter(ac -> ac.getTestName().equals(coverage.getTestName()))
                        .findFirst()
                        .orElse(null);
                if(previous != null) {
                    ampCoverage.remove(previous);
                }
                ampCoverage.add(coverage);
            }
        }
        deleteLogFile();
    }

    protected Collection<CtMethod> selectTestToAmp(Collection<CtMethod> oldTests, Collection<CtMethod> newTests) {
        Set<CtMethod> selectedTest = new HashSet<>();
        for (CtMethod test : oldTests) {
            String testName = test.getSimpleName();
            if (!testAges.containsKey(testName)) {
                testAges.put(testName, getAgesFor(test));
            }
            if (testAges.get(testName) > 0) {
                testAges.put(testName, testAges.get(testName) - 1);
                selectedTest.add(test);
            }
        }
        for (CtMethod test : newTests) {
            for (TestCoverage tc : getTestCoverageFor(test)) {
                TestCoverage parentTc = getParentTestCoverageFor(tc);
                if (parentTc == null || !parentTc.containsAllBranch(tc)) {
                    selectedTest.add(test);
                    break;
                }
            }
        }

        return selectedTest;
    }

    protected Integer getAgesFor(CtMethod test) {
        String testName = test.getSimpleName();
        if(testName.endsWith("_cf")) {
            return 2;
        }
        if(!AbstractAmp.getAmpTestToParent().containsKey(test)) {
            return 3;
        }
        return 0;
    }


    public Set<CtMethod> selectedAmplifiedTests(Collection<CtMethod> tests) {
        Set<CtMethod> amplifiedTests = new HashSet<>();
        Set<CtMethod> toRemove = new HashSet<>();
        for (CtMethod test : tests) {
            for (TestCoverage tc : getTestCoverageFor(test)) {
                TestCoverage parentTc = getParentTestCoverageFor(tc);
                if (parentTc != null && tc.containsAllBranch(parentTc) && !parentTc.containsAllBranch(tc)) {
                    amplifiedTests.add(test);
                    toRemove.remove(getParent(test));
//                    toRemove.remove(getParent(test.getSimpleName(), tests));
                    break;
                }
                if(parentTc != null && !tc.containsAllBranch(parentTc) && !parentTc.containsAllBranch(tc)) {
                    amplifiedTests.add(test);
                    break;
                }
            }
        }
        amplifiedTests.removeAll(toRemove);
        return amplifiedTests;
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

    protected String parentName(String name) {
        if(name.contains("_")) {
            return name.substring(0, name.lastIndexOf("_"));
        } else {
            return null;
        }
    }

//    protected CtMethod getParent(String name, Collection<CtMethod> tests) {
//        String parentName = parentName(name);
//        return tests.stream()
//                .filter(test -> parentName.equals(test.getSimpleName()))
//                .findFirst()
//                .orElse(null);
//    }

    protected CtMethod getParent(CtMethod test) {
        return AbstractAmp.getAmpTestToParent().get(test);
    }

    protected TestCoverage getParentTestCoverageFor(TestCoverage tc) {
        String parentName = parentName(tc.getTestName());
        if(parentName != null) {
            return ampCoverage.stream()
                    .filter(c -> c.getTestName().endsWith(parentName))
                    .findFirst()
                    .orElse(null);
        } else {
            return null;
        }
    }


    protected List<CtClass> getMethodsWithLogger(Collection<CtMethod> tests) {
        Map<String, CtClass> cloneClasses = new HashMap<>();
        return tests.stream()
                .map(test -> getMethodWithLogger(test))
                .map(instruTest -> {
                    CtClass cl = (CtClass) instruTest.getDeclaringType();
                    String className = cl.getQualifiedName();
                    if(!cloneClasses.containsKey(cl.getQualifiedName())) {
                        CtClass clone = cl.getFactory().Core().clone(cl);
                        clone.setParent(cl.getParent());
                        cloneClasses.put(className, clone);
                    }
                    cloneClasses.get(className).removeMethod(instruTest);
                    cloneClasses.get(className).addMethod(instruTest);

                    return cloneClasses.get(className);
                })
                .distinct()
                .collect(Collectors.toList());
    }

    protected CtMethod getMethodWithLogger(CtMethod method) {
        CtMethod clone = cloneMethod(method);

        AssertionRemover testCase = new AssertionRemover(inputProgram.getAbsoluteTestSourceCodeDir(), false);
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

    protected void deleteLogFile() throws IOException {
        File dir = new File(inputProgram.getProgramDir()+ "/log");
        for(File file : dir.listFiles()) {
            if(!file.getName().equals("info")) {
                FileUtils.forceDelete(file);
            }
        }
    }
}
