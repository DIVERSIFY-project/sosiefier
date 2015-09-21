package fr.inria.diversify.info;

import fr.inria.diversify.Profiling;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.Diff;
import fr.inria.diversify.logger.JsonDiffInput;
import fr.inria.diversify.logger.JsonDiffOutput;
import fr.inria.diversify.logger.branch.*;
import fr.inria.diversify.logger.exception.ExceptionDiff;
import fr.inria.diversify.logger.graph.GraphsDiff;
import fr.inria.diversify.logger.transformationUsed.StaticDiff;
import fr.inria.diversify.logger.variable.VariableDiff;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.persistence.json.output.JsonTransformationWriter;
import fr.inria.diversify.processor.main.BranchPositionProcessor;
import fr.inria.diversify.processor.test.CountProcessor;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 07/07/15
 * Time: 10:33
 */
public class StatementsInfo {


    protected final InputConfiguration inputConfiguration;
    protected final InputProgram inputProgram;
    protected Map<Transformation, Set<Diff>> transToDiffs;
    protected Collection<Transformation> transformations;

    protected Map<String, SourcePosition> branchPosition;
    protected Map<String, Set<String>> testsByBranch;
    protected Coverage globalCoverage;
    protected Map<String, Integer> assertPerTest;
    protected StaticDiff staticDiff;
    protected Set<String> transformationWithStaticDiff;

    public StatementsInfo(String propertiesFile) throws Exception, InvalidSdkException {

        inputConfiguration = new InputConfiguration(propertiesFile);

        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initSpoon(inputProgram, false);

        String transDir = inputConfiguration.getProperty("transformation.directory");
        String out = inputConfiguration.getProperty("result");

        init();
        if(transDir != null) {
            computeDiversifyStat(transDir, out);
//            staticDiff = new StaticDiff(branchPosition, testsByBranch);
            transformationWithStaticDiff = new HashSet<>();
            writeCSV(out + ".csv");
        }
        writeCSVStatement(out + "_stmt.csv");
    }

    protected void computeDiversifyStat(String transDir, String output) throws Exception {
        JsonTransformationLoader loader = new JsonTransformationLoader(inputProgram);
        JsonDiffInput jsonDiffInput = new JsonDiffInput();
        loader.addSection(jsonDiffInput.getClass(), jsonDiffInput);

        transformations = loader.load(transDir, true).stream()
            .collect(Collectors.toList());

        transToDiffs = jsonDiffInput.getTransToDiffs();

        JsonTransformationWriter writer = new JsonTransformationWriter();
        writer.addSection(JsonDiffOutput.class, new JsonDiffOutput(transToDiffs));

        Set<Transformation> sosies = transformations.stream()
                .filter(t -> t.getStatus() >= 0)
                .collect(Collectors.toSet());
        writer.write(sosies, output + "_sosie.json", inputProgram.getProgramDir() + "/pom.xml");
    }

    protected void writeCSV(String out) throws IOException {
        FileWriter writer = new FileWriter(new File(out));

        writer.append("uuid;type;name;position;status;diff;graphDiff;branchDiff;variableDiff;exceptionDiff;nbTest;maxDeep;meanDeep;medianDeep;minDeep;nodeTransplantationPoint;nodeTransplant\n");
        for(Transformation transformation: transformations) {
            writer.append(transformation.getIndex() + ";");
            writer.append(transformation.getType() + ";");
            writer.append(transformation.getName() + ";");
            writer.append(formatPosition(transformation.getPosition())+";");
            writer.append(transformation.getStatus() + ";");
            if(transToDiffs.containsKey(transformation)) {
                writer.append(transToDiffs.get(transformation).size() + ";");
                writer.append(transToDiffs.get(transformation).stream()
                        .filter(d -> d instanceof GraphsDiff)
                        .mapToInt(d -> d.size())
                        .sum()+ ";");
                writer.append(transToDiffs.get(transformation).stream()
                        .filter(d -> d instanceof BranchDiff)
                        .mapToInt(d -> d.size())
                        .sum()+ ";");
                writer.append(transToDiffs.get(transformation).stream()
                        .filter(d -> d instanceof VariableDiff)
                        .mapToInt(d -> d.size())
                        .sum()+ ";");
                writer.append(transToDiffs.get(transformation).stream()
                        .filter(d -> d instanceof ExceptionDiff)
                        .mapToInt(d -> d.size())
                        .sum()+ ";");
            } else {
                writer.append("0;0;0;0;0;");
            }
            writer.append(coveredTests(transformation.getPosition()).size() + ";");
            writer.append(deepMax(transformation.getPosition()) + ";");
            writer.append(deepMean(transformation.getPosition()) + ";");
            writer.append(deepMedian(transformation.getPosition()) + ";");
            writer.append(deepMin(transformation.getPosition()) + ";");

            writer.append(nodeTransplantationPoint(transformation) + ";");
            writer.append(nodeTransplant(transformation) + "\n");
        }
        writer.close();
    }

    protected String nodeTransplantationPoint(Transformation trans) {
        return ((ASTTransformation) trans).getTransplantationPoint().getCodeFragmentTypeSimpleName();
    }

    protected String nodeTransplant(Transformation trans) {
        if(trans instanceof ASTReplace) {
            return ((ASTReplace) trans).getTransplant().getCodeFragmentTypeSimpleName();
        }
        if(trans instanceof ASTAdd) {
            return ((ASTAdd) trans).getTransplant().getCodeFragmentTypeSimpleName();
        }
        return "NA";
    }

    protected void writeCSVStatement(String out) throws IOException {
        StatementInfo stmtInfo = new StatementInfo(inputProgram);
        FileWriter writer = new FileWriter(new File(out));

        InitUtils.initSpoon(inputProgram, false);

        writer.append("position;isCandidate;isCandidateDelete;nbTrial;nbCompile;nbSosie;nbTest;nbAssert;maxDeep;meanDeep;medianDeep;minDeep\n");
        for(CodeFragment stmt: inputProgram.getCodeFragments()) {
            SourcePosition position = stmt.getCtCodeFragment().getPosition();
            List<Transformation> transInThisStmt = transformations.stream()
                    .filter(trans -> include(position, trans.getPosition()))
                    .collect(Collectors.toList());

            writer.append( stmt.positionString() + ";");

            writer.append(stmtInfo.isTransformable(stmt) + ";");
            writer.append(stmtInfo.delete(stmt) + ";");

            writer.append(transInThisStmt.size() + ";");
            writer.append(transInThisStmt.stream()
                    .filter(trans -> trans.getStatus() >= -1)
                    .count() + ";");
            writer.append(transInThisStmt.stream()
                    .filter(trans -> trans.getStatus() >= 0)
                    .count() + ";");
            Collection<String> coveredTests = coveredTests(position);
            writer.append(coveredTests(position).size() + ";");
            writer.append(nbAssertFor(coveredTests) + ";");

            writer.append(deepMax(position) + ";");
            writer.append(deepMean(position) + ";");
            writer.append(deepMedian(position) + ";");
            writer.append(deepMin(position) + "\n");
        }
        writer.close();
    }

    public void init() throws Exception {
        Log.debug("init BranchComparator");
        String tmpDir = inputConfiguration.getProperty("tmpDir") + "/tmp_" + System.currentTimeMillis();
        copyDir(inputProgram.getProgramDir(), tmpDir);
        instru(tmpDir);
        MavenBuilder builder = new MavenBuilder(tmpDir);
        builder.runGoals(new String[]{"clean", "test"}, true);
        initTestByBranch(builder.getDirectory() + "/log");
        intBranch();
        globalCoverage = loadGlobalCoverage(builder.getDirectory() + "/log");

        initAssertCount();

        transformations = new LinkedList<>();
    }

    protected String formatPosition(SourcePosition position) {
        return position.getCompilationUnit().getMainType().getQualifiedName() + ":" + position.getLine();
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

        branchPosition = processor.getBranchPosition();
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

        List<TestCoverage> testCoverage = loadTestCoverage(logDir);

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

    protected void initAssertCount() {
        Factory factory = InitUtils.initSpoon(inputProgram, true);

        CountProcessor m = new CountProcessor();
        LoggerUtils.applyProcessor(factory, m);
        assertPerTest = m.getAssertPerTest();
    }

    protected String smallBranchContaining(SourcePosition sourcePosition) {
        List<String> branches = branchPosition.keySet().stream()
                .filter(branch -> include(branchPosition.get(branch), sourcePosition))
                .collect(Collectors.toList());

        if(branches.isEmpty()) {
            return "";
        }
        int minBranchSize = 10000;
        String minBranch = "";
        for (String branch : branches) {
            int size =  branchPosition.get(branch).getEndLine() - branchPosition.get(branch).getLine();
            if(size < minBranchSize) {
                minBranchSize = size;
                minBranch = branch;
            }
        }
        return minBranch;
    }

    protected int deepMax(SourcePosition sourcePosition) {
        String branchName = smallBranchContaining(sourcePosition);
        if(branchName.isEmpty()) {
            return 0;
        }
        Branch branch = globalCoverage.getBranch(branchName);
        if(branch == null) {
            return 0;
        }
        return branch.getDeeps().stream()
                .mapToInt(i -> i)
                .max()
                .orElse(0);
    }

    protected double deepMean(SourcePosition sourcePosition) {
        String branchName = smallBranchContaining(sourcePosition);
        if(branchName.isEmpty()) {
            return 0;
        }
        Branch branch = globalCoverage.getBranch(branchName);
        if(branch == null) {
            return 0;
        }
        return branch.getDeeps().stream()
                .mapToDouble(i -> i)
                .sum() / branch.getDeeps().size();
    }

    protected double deepMin(SourcePosition sourcePosition) {
        String branchName = smallBranchContaining(sourcePosition);
        if(branchName.isEmpty()) {
            return 0;
        }
        Branch branch = globalCoverage.getBranch(branchName);
        if(branch == null) {
            return 0;
        }
        return branch.getDeeps().stream()
                .mapToInt(i -> i)
                .min()
                .orElse(0);
    }

    protected double deepMedian(SourcePosition sourcePosition) {
        String branchName = smallBranchContaining(sourcePosition);
        if(branchName.isEmpty()) {
            return 0;
        }
        Branch branch = globalCoverage.getBranch(branchName);
        if(branch == null) {
            return 0;
        }
        List<Integer> sorted = branch.getDeeps().stream()
                .mapToInt(i -> i)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        return sorted.get(sorted.size()/2);
    }

    protected int nbAssertFor(Collection<String> tests) {
        return tests.stream()
                .filter(test -> assertPerTest.containsKey(test))
                .mapToInt(test -> assertPerTest.get(test))
                .sum();
    }

    protected Collection<String> coveredTests(SourcePosition sourcePosition) {
        String branch = smallBranchContaining(sourcePosition);

        if(testsByBranch.containsKey(branch)) {
            return testsByBranch.get(branch);
        } else {
            return new LinkedList<>();
        }
    }

    protected double methodNameContainedInTests(CtElement element, Collection<String> tests) {
        CtExecutable exe = getMethodOrConstructorContaining(element);
        if(exe == null) {
            return 0;
        } else {
            String name = exe.getSimpleName().toLowerCase();
            return tests.stream()
                    .map(test -> test.split("#")[1].toLowerCase())
                    .filter(test -> test.contains(name))
                    .count() / (double)tests.size();
        }
    }

    protected double methodClassTargetByTests(CtElement element, Collection<String> tests) {
        CtExecutable exe = getMethodOrConstructorContaining(element);
        if(exe == null) {
            return 0;
        } else {
            String className =  exe.getReference().getDeclaringType().getQualifiedName();
            return tests.stream()
                    .map(test -> test.split("#")[0])
                    .map(test -> test.substring(0, test.length() - 4))
                    .filter(testClass -> getSuperClasses(testClass).contains(className))
                    .count() / (double)tests.size();
        }
    }

    protected Collection<String> getSuperClasses(String className) {
        Collection<String> classes = new HashSet<>();

        classes.add(className);
        try {
        Class cl = Class.forName(className);

            while (cl.getSuperclass() != null) {
                cl = cl.getSuperclass();
                classes.add(cl.getCanonicalName());
            }
        } catch (Exception e) {}
        return classes;
    }

    protected CtExecutable getMethodOrConstructorContaining(CtElement element) {
        CtExecutable exe = element.getParent(CtMethod.class);
        if(exe == null) {
            exe = element.getParent(CtConstructor.class);
        }
        return exe;
    }

    //true if oThis include in oOther
    protected boolean include(SourcePosition oThis, SourcePosition oOther) {
        return oThis.getCompilationUnit().getMainType().getQualifiedName().equals(oOther.getCompilationUnit().getMainType().getQualifiedName())
                && oThis.getLine() <= oOther.getLine()
                && oThis.getEndLine() >= oOther.getEndLine();

    }

    public static void main(String args[]) throws InvalidSdkException, Exception {
        new StatementsInfo(args[0]);
    }

}
