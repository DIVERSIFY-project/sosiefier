package fr.inria.diversify.logger.branch;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.Comparator;
import fr.inria.diversify.logger.Diff;
import fr.inria.diversify.processor.main.BranchPositionProcessor;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import spoon.reflect.cu.SourcePosition;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 23/06/15
 * Time: 14:40
 */
public class BranchComparator implements Comparator {
    Map<String, Set<String>> testsByBranch;
    Map<String, SourcePosition> branchPosition;

    @Override
    public void init(InputProgram  originalInputProgram, AbstractBuilder originalBuilder) throws Exception {
        Log.debug("init BranchComparator");
        initTestByBranch(originalBuilder);
        intBranch(originalInputProgram);
    }

    @Override
    public Diff compare(SingleTransformation transformation, String originalLogDir, String sosieLogDir) throws Exception {
        List<TestCoverage> sosieCoverage = loadTestCoverage(sosieLogDir);
        List<TestCoverage> originalCoverage = loadTestCoverage(originalLogDir);

        boolean filterTransformationPosition = filterTransformationPosition(transformation, originalCoverage, sosieCoverage);

        BranchDiff diff = new BranchDiff();
        for(TestCoverage originalTestCoverage : originalCoverage) {
            TestCoverage sosieTestCoverage = sosieCoverage.stream()
                    .filter(tc -> tc.getTestName().equals(originalTestCoverage.getTestName()))
                    .findFirst()
                    .get();

            if(!originalTestCoverage.containsAllBranch(sosieTestCoverage)) {
                Set<String> originalBranches =  originalTestCoverage.getCoveredBranch();
                Set<String> sosieBranches = sosieTestCoverage.getCoveredBranch();

                Set<String> d1 = originalBranches.stream()
                        .filter(branch -> !sosieBranches.contains(branch))
                        .filter(branch -> !filterTransformationPosition || !(branch.contains(transformation.classLocationName())
                                && branch.contains(transformation.methodLocationName())))
                        .collect(Collectors.toSet());

                Set<String> d2 = sosieBranches.stream()
                        .filter(branch -> !originalBranches.contains(branch))
                        .filter(branch -> !filterTransformationPosition || !(branch.contains(transformation.classLocationName())
                                && branch.contains(transformation.methodLocationName())))
                        .collect(Collectors.toSet());

                d1.addAll(d2);

                if(!d1.isEmpty()) {
                    diff.addBranchDiff(originalTestCoverage.getTestName(), d1);
                }
            }
        }
        return diff;
    }

    protected boolean filterTransformationPosition(SingleTransformation transformation, List<TestCoverage> originalCoverage, List<TestCoverage> sosieCoverage) {
        if(transformation == null) {
            return false;
        }
        String className = transformation.classLocationName();
        String methodName = transformation.methodLocationName();


        Set<String> originalBranches = allBranchesOf(originalCoverage, className, methodName);
        Set<String> sosieBranches = allBranchesOf(sosieCoverage, className, methodName);

        return !originalBranches.equals(sosieBranches);

    }

    protected Set<String> allBranchesOf(List<TestCoverage> testCoverages, String className, String methodName) {
        return testCoverages.stream()
                .flatMap(coverage -> coverage.getCoverage().getMethodCoverages().stream())
                .filter(methodCoverage -> methodCoverage.getMethodName().contains("_" + methodName)
                        && methodCoverage.getMethodName().contains(className+ "_"))
                .flatMap(methodCoverage -> methodCoverage.getAllBranch().stream())

                .collect(Collectors.toSet());
    }

    protected void initTestByBranch(AbstractBuilder originalBuilder) throws InterruptedException, IOException {
        testsByBranch = new HashMap<>();

        writePropertiesFile(originalBuilder.getDirectory() + "/log");
        originalBuilder.runGoals(new String[]{"clean", "test"}, false);
        deletePropertiesFile(originalBuilder.getDirectory() + "/log");

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
//                    testName = testName.substring(0, ind);
                    testsByBranch.get(key).add(testName);
                }
            }
        }
    }

    protected void writePropertiesFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName + "/options");
        writer.write("fullPath=false\n");
        writer.write("writeVar=false\n");
        writer.write("logMethodCall=false\n");
        writer.close();
    }

    protected void deletePropertiesFile(String fileName) throws IOException {
        File file = new File(fileName + "/options");
        FileUtils.forceDelete(file);
    }

    protected void intBranch(InputProgram  originalInputProgram) {
        BranchPositionProcessor processor = new BranchPositionProcessor(originalInputProgram);
        LoggerUtils.applyProcessor(originalInputProgram.getFactory(), processor);

        branchPosition = processor.getBranchPosition();
    }

    protected  List<TestCoverage> loadTestCoverage(String logDir) throws IOException {
        CoverageReader reader = new CoverageReader(logDir);
        List<TestCoverage> result = reader.loadTest();

        return result;
    }

    protected boolean branchContainsIn(SingleTransformation trans, Set<String> branches) {
        return branches.stream()
                .filter(branch -> !(branch.contains(trans.classLocationName()) && branch.contains(trans.methodLocationName())))
                .count() == 0;
    }

    public Collection<String> selectTest(SourcePosition sourcePosition) {
        return branchPosition.keySet().stream()
                .filter(branch -> include(branchPosition.get(branch),sourcePosition))
                .filter(branch -> testsByBranch.containsKey(branch))
                .flatMap(branch -> testsByBranch.get(branch).stream())
                .collect(Collectors.toSet());
    }

    @Override
    public Diff getEmptyDiff() {
        return new BranchDiff();
    }

    //true if oThis include in oOther
    protected boolean include(SourcePosition oThis, SourcePosition oOther) {
        return oThis.getCompilationUnit().getMainType().getQualifiedName().equals(oOther.getCompilationUnit().getMainType().getQualifiedName())
                && oThis.getLine() <= oOther.getLine()
                && oThis.getEndLine() >= oOther.getEndLine();

    }


//    public String branchFor(CtElement element) {
//        String info = "";
//        int branchId = 0;
//        for(Object object : Query.getElements(element, new TypeFilter(CtIf.class))) {
//            info += ";t" + branchId;
//            info += ";e" + branchId;
//            branchId++;
//        }
//
//        for(Object object : Query.getElements(element, new TypeFilter(CtCase.class))) {
//            info += ";s" + branchId;
//            branchId++;
//        }
//
//        for(Object object : Query.getElements(element, new TypeFilter(CtLoop.class))) {
//
//            info += ";l" + branchId;
//            branchId++;
//        }
//        for(Object object : Query.getElements(element, new TypeFilter(CtCatch.class))) {
//            info += ";c" + branchId;
//            branchId++;
//        }
//
//        return info;
//    }
}
