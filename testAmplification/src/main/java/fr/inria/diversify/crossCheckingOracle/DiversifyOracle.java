package fr.inria.diversify.crossCheckingOracle;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.SinglePointDiversify;
import fr.inria.diversify.info.BranchInfo;
import fr.inria.diversify.info.CoverageInfo;

import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import spoon.reflect.cu.SourcePosition;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 06/10/15
 * Time: 10:33
 */
public class DiversifyOracle extends SinglePointDiversify {
    protected CoverageInfo coverageInfo;
    protected BranchInfo branchInfo;

    public DiversifyOracle(InputConfiguration inputConfiguration, String projectDir, String srcDir) {
        super(inputConfiguration, projectDir, srcDir);
    }

    public String init(String dirProject, String dirTarget) throws IOException, InterruptedException {
        super.init(dirProject, dirTarget);

        copySwitch(tmpDir + "/" + sourceDir);

        coverageInfo = new CoverageInfo(inputConfiguration.getInputProgram());
        try {
            File dir = new File(dirTarget + "/tmp_branch_" + System.currentTimeMillis());
            coverageInfo.init(dir.getAbsolutePath());
            FileUtils.forceDelete(dir);
        } catch (Exception e) {
            Log.error("error in coverageInfo");
        }

        branchInfo = new BranchInfo(inputConfiguration.getInputProgram());
        branchInfo.intBranch();

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
                int status = runTestFor(tmpDir, trans.getPosition());

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

    protected Integer runTestFor(String directory, SourcePosition sourcePosition) throws InterruptedException {
        int status;
        Log.debug("run test in directory: {}", directory);
        String goals;
        Set<String> tests = new HashSet<>();
        for(String test : testsFor(sourcePosition)) {
            tests.add(test.split("#")[0]);
        }
        if(tests.isEmpty()) {
            goals  = "test -Dmaven.compiler.useIncrementalCompilation=false";
        }  else {
            goals = "test -Dmaven.compiler.useIncrementalCompilation=false -Dtest=" +
                    tests.stream()
                        .collect(Collectors.joining(","));
        }

        builder.setDirectory(directory);
        builder.runBuilder(new String[]{goals});
        Log.info("status: " + builder.getStatus() + ", compile error: " + builder.getCompileError() + ", run all test: " + builder.allTestRun() + ", nb error: " + builder.getTestFail().size());
        status = builder.getStatus();

        return status;
    }

    protected Set<String> testsFor(SourcePosition position) {
        String branch = branchInfo.smallBranchContaining(position);

        return coverageInfo.getTestForBranch(branch);
    }

    protected void copySwitch(String copyDirName) throws IOException {
        File srcFile = new File(System.getProperty("user.dir") + "/generator/src/main/java/fr/inria/diversify/switchsosie/Switch.java");
        File destFile = new File(copyDirName  + "/fr/inria/diversify/transformation/switchsosie/Switch.java");

        FileUtils.copyFile(srcFile, destFile);
    }


}
