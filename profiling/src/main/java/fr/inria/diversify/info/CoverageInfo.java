package fr.inria.diversify.info;

import fr.inria.diversify.Profiling;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.logger.branch.*;
import fr.inria.diversify.processor.main.BranchPositionProcessor;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 24/09/15
 * Time: 11:25
 */
public class CoverageInfo {
    protected InputProgram inputProgram;
    protected Map<String, Set<String>> testsByBranch;
    protected Coverage globalCoverage;
    protected List<TestCoverage> testCoverage;


    public CoverageInfo(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    public void init(String tmpDir) throws Exception {
        Log.debug("init BranchComparator");
        copyDir(inputProgram.getProgramDir(), tmpDir);
        instru(tmpDir);
        MavenBuilder builder = new MavenBuilder(tmpDir);
        builder.runGoals(new String[]{"clean", "test"}, true);
        initTestByBranch(builder.getDirectory() + "/log");
        intBranch();
        globalCoverage = loadGlobalCoverage(builder.getDirectory() + "/log");

    }

    public Coverage getGlobalCoverage() {
        return globalCoverage;
    }

    public BranchCoverage getBranch(String branch) {
        return getGlobalCoverage().getBranch(branch);
    }

    public boolean containsTestForBranch(String branch) {
        return testsByBranch.containsKey(branch);
    }

    public Set<String> getTestForBranch(String branch) {
        return testsByBranch.get(branch);
    }

    public List<TestCoverage> getTestCoverage() {
        return testCoverage;
    }

    protected void copyDir(String src, String dest) throws IOException {
        File dir = new File(dest);
        if(dir.exists()) {
            FileUtils.forceDelete(dir);
        }
        dir.mkdirs();
        FileUtils.copyDirectory(new File(src), dir);
    }


    protected void intBranch() {
        BranchPositionProcessor processor = new BranchPositionProcessor(inputProgram);
        LoggerUtils.applyProcessor(inputProgram.getFactory(), processor);
    }

    protected List<TestCoverage> loadTestCoverage(String logDir) throws IOException {
        CoverageReader reader = new CoverageReader(logDir);
        List<TestCoverage> result = reader.loadTest();

        return result;
    }

    protected Coverage loadGlobalCoverage(String logDir) throws IOException {
        CoverageReader reader = new CoverageReader(logDir);

        return reader.load();
    }

    protected void instru(String outputDirectory) throws Exception {
        Properties properties = new Properties();
        properties.put("profiling.main.branch", "true");
        properties.put("profiling.main.branch.addBodyBranch", "true");
        properties.put("profiling.test.logTest", "true");

        Profiling profiling = new Profiling(inputProgram, outputDirectory, "fr.inria.diversify.logger.logger", properties);
        profiling.apply();
    }

    protected void initTestByBranch(String logDir) throws InterruptedException, IOException {
        testsByBranch = new HashMap<>();

        testCoverage = loadTestCoverage(logDir);

        for(TestCoverage tc : testCoverage) {
            for(MethodCoverage mth : tc.getCoverage().getMethodCoverages()) {
                for(BranchCoverage branchCoverage : mth.getCoveredBranchCoverages()) {
                    String key = mth.getMethodId() + "." + branchCoverage.getId();
                    if (!testsByBranch.containsKey(key)) {
                        testsByBranch.put(key, new HashSet<>());
                    }
                    String testName = tc.getTestName();
                    int ind = testName.lastIndexOf(".");
                    testName = new StringBuilder(testName).replace(ind, ind + 1, "#").toString();
                    testsByBranch.get(key).add(testName);
                }
            }
        }
    }
}
