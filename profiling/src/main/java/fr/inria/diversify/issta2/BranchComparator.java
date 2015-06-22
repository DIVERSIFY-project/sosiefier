package fr.inria.diversify.issta2;

import fr.inria.diversify.Profiling;
import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.branch.Branch;
import fr.inria.diversify.logger.branch.CoverageReader;
import fr.inria.diversify.logger.branch.MethodCoverage;
import fr.inria.diversify.logger.branch.TestCoverage;
import fr.inria.diversify.processor.main.BranchPositionProcessor;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import spoon.reflect.cu.SourcePosition;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 18/06/15
 * Time: 10:29
 */
public class BranchComparator implements SosieComparator {
    InputProgram inputProgram;
    AbstractBuilder originalBuilder;
    String tmpSosieDir;
    Map<String, Set<String>> testsByBranch;
    Map<String, SourcePosition> branchPosition;

    public BranchComparator(InputProgram inputProgram)  {
        this.inputProgram = inputProgram;
        testsByBranch = new HashMap<>();

    }

    public void init(String tmpDir) throws Exception {
        String dir = tmpDir + "_original";
        copyDir(inputProgram.getProgramDir(), dir);
        instru(dir);
        originalBuilder = new MavenBuilder(dir);

        initTestByBranch();
        intBranch();

        tmpSosieDir = tmpDir + "_sosie";
    }

    @Override
    public void compare(SingleTransformation trans) throws Exception {

        try {
            copyDir(tmpSosieDir.substring(0, tmpSosieDir.length() - 6), tmpSosieDir);
            trans.applyWithParent(tmpSosieDir + "/" + inputProgram.getRelativeSourceCodeDir());
            instru(tmpSosieDir);
            AbstractBuilder sosieBuilder = new MavenBuilder(tmpSosieDir);


            runAndCompare(sosieBuilder, trans);
        } finally {
            trans.restore(tmpSosieDir);
        }
    }

    protected void runAndCompare(AbstractBuilder sosieBuilder, SingleTransformation trans) throws InterruptedException, IOException {
        Collection<String> testToRun = selectTest(trans.getPosition());
        run(sosieBuilder, testToRun);
        run(originalBuilder, testToRun);

        List<TestCoverage> sosieCoverage = loadTestCoverage(tmpSosieDir + "/log");
        List<TestCoverage> originalCoverage = loadTestCoverage(originalBuilder.getDirectory() + "/log");

        for(TestCoverage originalTestCoverage : originalCoverage) {
            TestCoverage sosieTestCoverage = sosieCoverage.stream()
                    .filter(tc -> tc.getTestName().equals(originalTestCoverage.getTestName()))
                    .findFirst()
                    .get();
             if(!originalTestCoverage.containsAllBranch(sosieTestCoverage)) {
                 Set<String> set = new HashSet<>(originalTestCoverage.getCoveredBranch());
                 set.removeAll(sosieTestCoverage.getCoveredBranch());
                 if(!branchContainsIn(trans,set )) {
                     Log.info("diff for test {}", originalTestCoverage.getTestName());
                 }
            }
        }
    }

    protected boolean branchContainsIn(SingleTransformation trans, Set<String> branches) {
      return branches.stream()
              .filter(branch -> !(branch.contains(trans.classLocationName()) && branch.contains(trans.methodLocationName())))
              .count() == 0;
    }

    protected  List<TestCoverage> loadTestCoverage(String logDir) throws IOException {
        CoverageReader reader = new CoverageReader(logDir);
        List<TestCoverage> result = reader.loadTest();

        return result;
    }

    private int run(AbstractBuilder builder, Collection<String> testToRun) throws InterruptedException, IOException {
        String goals = "test -Dmaven.compiler.useIncrementalCompilation=false -Dmaven.test.useIncrementalCompilation=false -Dtest="
                + testToRun.stream()
                .collect(Collectors.joining(","));

        File logDir = new File(builder.getDirectory() + "/log");
        for(File file : logDir.listFiles()) {
            if(file.getName().startsWith("log")) {
                FileUtils.forceDelete(file);
            }
        }

        builder.runGoals(new String[]{goals}, true);
        return builder.getStatus();
    }

    protected void copyDir(String src, String dest) throws IOException {
        File dir = new File(dest);
        if(dir.exists()) {
            FileUtils.forceDelete(dir);
        }
        dir.mkdirs();
        FileUtils.copyDirectory(new File(src), dir);
    }

    protected void instru(String outputDirectory) throws Exception {
        Properties properties = new Properties();
        properties.put("profiling.main.branch", "true");
        properties.put("profiling.test.logTest", "true");

        Profiling profiling = new Profiling(inputProgram, outputDirectory, "fr.inria.diversify.logger.logger", properties);
        profiling.apply();
    }

    protected Collection<String> selectTest(SourcePosition sourcePosition) {
        return branchPosition.keySet().stream()
                .filter(branch -> include(branchPosition.get(branch),sourcePosition))
                .filter(branch -> testsByBranch.containsKey(branch))
                .flatMap(branch -> testsByBranch.get(branch).stream())
                .collect(Collectors.toSet());
    }

    protected void initTestByBranch() throws InterruptedException, IOException {
        originalBuilder.runGoals(new String[]{"clean", "test"}, true);
        List<TestCoverage> testCoverage = loadTestCoverage(originalBuilder.getDirectory() + "/log");

        for(TestCoverage tc : testCoverage) {
            for(MethodCoverage mth : tc.getCoverage().getMethodCoverages()) {
                for(Branch branch : mth.getCoveredBranchs()) {
                    String key = mth.getMethodId() + "." + branch.getId();
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

    protected void intBranch() {
        BranchPositionProcessor processor = new BranchPositionProcessor(inputProgram);
        LoggerUtils.applyProcessor(inputProgram.getFactory(), processor);

        branchPosition = processor.getBranchPosition();
    }

    //true if oThis include in oOther
    protected boolean include(SourcePosition oThis, SourcePosition oOther) {
        return oThis.getCompilationUnit().getMainType().getQualifiedName().equals(oOther.getCompilationUnit().getMainType().getQualifiedName())
                && oThis.getLine() <= oOther.getLine()
                && oThis.getEndLine() >= oOther.getEndLine();

    }
}
