package fr.inria.diversify.runner;

import fr.inria.diversify.buildSystem.DiversifyClassLoader;
import fr.inria.diversify.buildSystem.spoon.JunitRunner;
import fr.inria.diversify.info.BranchInfo;
import fr.inria.diversify.info.CoverageInfo;

import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import org.junit.runner.Result;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 06/10/15
 * Time: 10:33
 */
public class CoverageRunner extends SinglePointRunner {
    protected CoverageInfo coverageInfo;
    protected BranchInfo branchInfo;

    public CoverageRunner(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        super(inputConfiguration, projectDir, srcDir);
        InitUtils.initSpoon(inputConfiguration.getInputProgram(), true);
    }


    public String init(String dirProject, String dirTarget) throws IOException, InterruptedException {
        super.init(dirProject, dirTarget);

//        coverageInfo = new CoverageInfo(inputConfiguration.getInputProgram());
//        try {
//            File dir = new File(dirTarget + "/tmp_branch_" + System.currentTimeMillis());
//            coverageInfo.init(dir.getAbsolutePath());
//            FileUtils.forceDelete(dir);
//        } catch (Exception e) {
//            Log.error("error in coverageInfo");
//        }
//
//        branchInfo = new BranchInfo(inputConfiguration.getInputProgram());
//        branchInfo.intBranch();
        return tmpDir;
    }
    protected void run(Transformation trans) throws Exception {
        Log.info("trial {}", trial);
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
//        writePosition(tmpDir + "/transplant.json", (ASTTransformation) trans);

        try {
            applyTransformation(trans);
            try {
                transformations.add(trans);
                int status = runTestFor(tmpDir, trans.getPositions());

                trans.setStatus(status);
                trans.setFailures(builder.getTestFail());
                // error during runTest
            } catch (Exception e) {
                trans.setStatus(-2);
                Log.debug("compile error during diversification", e);
            }

            trial++;
            trans.restore(tmpDir + "/" + sourceDir);

            ((SinglePointSessionResults) sessionResults).addRunResults(trans);
        } catch (ApplyTransformationException e) {
            tryRestore(trans,e);
        } catch (BuildTransplantException e) {}
    }

    protected Integer runTestFor(String directory, List<SourcePosition> sourcePositions) throws InterruptedException {
        int status;
        Log.debug("run test in directory: {}", directory);
        String goals;
        Set<String> tests = new HashSet<>();
        for(String test : testsFor(sourcePositions)) {
            tests.add(test.split("#")[0]);
        }
        if(tests.isEmpty()) {
            goals  = "clean test ";
        }  else {
            goals = "clean test -Dtest=" +
                    tests.stream()
                        .collect(Collectors.joining(","));
        }

        builder.setDirectory(directory);
        builder.runBuilder(new String[]{goals});
        Log.info("status: " + builder.getStatus() + ", compile error: " + builder.getCompileError() + ", run all test: " + builder.allTestRun() + ", nb error: " + builder.getTestFail().size());
        status = builder.getStatus();

        return status;

//        int status;
//        Log.debug("run test in directory: {}", directory);
//        String goals = "clean compile test-compile";
//        builder.setDirectory(directory);
//        builder.runBuilder(new String[]{goals});
//
//        InputProgram inputProgram = inputConfiguration.getInputProgram();
//        status = builder.getStatus();
//        if(status == 0) {
//            List<CtClass> classes = inputProgram.getAllElement(CtClass.class);
//            Set<CtClass> tests = new HashSet<>();
//            for(String test : testsFor(sourcePositions)) {
//                String testName = test.split("#")[0];
//                CtClass testClass = classes.stream()
//                        .filter(cl -> cl.getQualifiedName().equals(testName))
//                        .findFirst()
//                        .orElse(null);
//                if(testClass != null) {
//                    tests.add(testClass);
//                }
//            }
//            try {
//                if(tests.isEmpty()) {
//                    tests = classes.stream()
//                            .filter(cl -> cl.getPosition().getFile().toString().contains(inputProgram.getRelativeTestSourceCodeDir()))
//                            .filter(cl -> cl.getSimpleName().contains("Test"))
//                            .filter(cl -> !cl.getModifiers().contains(ModifierKind.ABSTRACT))
//                            .collect(Collectors.toSet());
//                }
//
//                List<CtType> appClasses = sourcePositions.stream()
//                        .map(position -> position.getCompilationUnit().getMainType())
//                        .collect(Collectors.toList());
//
//                Result result = runTests(new ArrayList<>(tests), appClasses);
//                Log.debug(result.toString());
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//
//        }
//        return status;
    }

    protected Result runTests(List<CtClass> tests, List<CtType> appClasses) throws ClassNotFoundException {
        InputProgram inputProgram = inputConfiguration.getInputProgram();

        DiversifyClassLoader classLoader = new DiversifyClassLoader(Thread.currentThread().getContextClassLoader(), tmpDir + "/" + inputProgram.getRelativeSourceCodeDir());
        classLoader.setClassFilter(appClasses.stream().map(cl -> cl.getQualifiedName()).collect(Collectors.toList()));
        for(int i = 0; i < appClasses.size(); i++) {
            classLoader.loadClass(appClasses.get(i).getQualifiedName());
        }

        classLoader.setClassFilter(tests.stream().map(cl -> cl.getQualifiedName()).collect(Collectors.toList()));
        JunitRunner junitRunner = new JunitRunner(classLoader, tmpDir + "/" + inputProgram.getTestClassesDir());

        return junitRunner.runTestClasses(tests);
    }
    
    protected Set<String> testsFor(List<SourcePosition> sourcePositions) {
        return new HashSet<>();
//        return sourcePositions.stream()
//                .map(position -> branchInfo.smallBranchContaining(position))
//                .map(branch -> coverageInfo.getTestForBranch(branch))
//                .filter(tests -> tests != null)
//                .flatMap(tests ->tests.stream())
//                .collect(Collectors.toSet());
    }

}
