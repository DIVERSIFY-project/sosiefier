package fr.inria.diversify.logger.graph;


import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.branch.CoverageReader;
import fr.inria.diversify.logger.branch.TestCoverage;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.LoggerUtils;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;

import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 20/05/15
 * Time: 16:30
 */
public class Foo {
    private final InputConfiguration inputConfiguration;
    private final InputProgram inputProgram;
    List<TestCoverage> testCoverages;

    protected Map<String, Set<String>> branchToTest() {
        Map<String, Set<String>> branchToTest = new HashMap<>();
        for(TestCoverage tc : testCoverages) {
            for(String branch : tc.getAllBranch()) {
                if(!branchToTest.containsKey(branch)) {
                    branchToTest.put(branch, new HashSet<>());
                }
                branchToTest.get(branch).add(tc.getTestName());
            }
        }
        return branchToTest;
    }

    protected  Map<String, Graph> graphByName() {
        Map<String, Graph> graphByName = new HashMap<>();
        Factory factory = InitUtils.initSpoon(inputProgram, true);
        String testSrc = inputProgram.getRelativeTestSourceCodeDir();

        AbstractProcessor<CtMethod> p = new AbstractProcessor<CtMethod>() {

            public boolean isToBeProcessed(CtMethod candidate) {
                return  candidate.getPosition().toString().contains(testSrc)
                        && candidate.getSimpleName().contains("test");
            }

            @Override
            public void process(CtMethod method) {
                BuildGraph bg = new BuildGraph();
                method.accept(bg);
                String testName = method.getSimpleName();
                graphByName.put(testName, bg.getGraph(method.getSimpleName()));
            }
        };
        LoggerUtils.applyProcessor(factory, p);
        return graphByName;
    }
    public void foo() throws IOException {
        Map<String, Set<String>> branchToTest = branchToTest();
        Map<String, Graph> graphByName = graphByName();

        for(String branch : branchToTest.keySet()) {
            if(branchToTest.get(branch).size() > 10) {
                Graph intersection = null;
                for(String test : branchToTest.get(branch)) {
                    if(intersection == null) {
                        String[] tmp = test.split("\\.");
                        intersection = graphByName.get(tmp[tmp.length -1]);
                    } else {
                        String[] tmp = test.split("\\.");
                        intersection = intersection.intersection(graphByName.get(tmp[tmp.length -1]));
                    }
                }
                intersection.toDot(branchToTest + ".dot");
            }
        }
    }

    protected  List<TestCoverage> loadCoverageInfo(String logDir) throws IOException {
        CoverageReader reader = new CoverageReader(logDir);
        List<TestCoverage> result = reader.loadTest();

        return result;
    }

    public Foo(String propertiesFile) throws Exception, InvalidSdkException {
        inputConfiguration = new InputConfiguration(propertiesFile);
        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);


        testCoverages = loadCoverageInfo(inputConfiguration.getProperty("logDir"));




    }

    public static void main(String[] args) throws InvalidSdkException, Exception {
        Foo foo = new Foo(args[0]);
        foo.foo();

    }
}
