package fr.inria.diversify;

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
import fr.inria.diversify.logger.variable.VariableDiff;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.persistence.json.output.JsonTransformationWriter;
import fr.inria.diversify.processor.main.BranchPositionProcessor;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.InitUtils;
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
 * Date: 07/07/15
 * Time: 10:33
 */
public class LoadDiff {


    private final InputConfiguration inputConfiguration;
    private final InputProgram inputProgram;
    Map<Transformation, Set<Diff>> transToDiffs;
    Collection<Transformation> transformations;

    private Map<String, SourcePosition> branchPosition;
    Map<String, Set<String>> testsByBranch;
    Coverage globalCoverage;

    public LoadDiff(String propertiesFile) throws Exception, InvalidSdkException {

        inputConfiguration = new InputConfiguration(propertiesFile);

        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initSpoon(inputProgram, false);

        String transDir = inputConfiguration.getProperty("transformation.directory");
        String out = inputConfiguration.getProperty("result");

        init();

        computeDiversifyStat(transDir, out);

        witeCSV(out + ".csv");
        witeCSVStatement(out + "_stmt.csv");
    }

    protected void computeDiversifyStat(String transDir, String output) throws Exception {
        JsonTransformationLoader loader = new JsonTransformationLoader(inputProgram);
        JsonDiffInput jsonDiffInput = new JsonDiffInput();
        loader.addSection(jsonDiffInput.getClass(), jsonDiffInput);

        transformations = loader.load(transDir, true);
        transToDiffs = jsonDiffInput.getTransToDiffs();

        JsonTransformationWriter writer = new JsonTransformationWriter();
        writer.addSection(JsonDiffOutput.class, new JsonDiffOutput(transToDiffs));


//        File out = new File(output);
//        if(!out.exists()) {
//            out.mkdirs();
//        }
//        writer.write(transformations, output + ".json", inputProgram.getProgramDir() + "/pom.xml");
//        Set<Transformation> sosies = transformations.stream().keySet().stream()
//                .filter(t -> t.isSosie())
//                .collect(Collectors.toSet());
////        writer.write(sosies, output+"_sosie.json", inputProgram.getProgramDir() + "/pom.xml");
//
//        Log.info("nb transformation: {}", transformations.size());
//        Log.info("nb compile: {}", transformations.stream().filter(t -> t.getStatus() >= -1).count());
//        Log.info("nb sosie: {}", sosies.size());
    }

    protected void witeCSV(String out) throws IOException {
        FileWriter writer = new FileWriter(new File(out));

        writer.append("uuid;type;name;status;diff;graphDiff;branchDiff;variableDiff;exceptionDiff;nbTest;maxDeep;meanDeep\n");
        for(Transformation transformation: transformations) {
            writer.append(transformation.getIndex() + ";");
            writer.append(transformation.getType() + ";");
            writer.append(transformation.getName() + ";");
            writer.append(transformation.getStatus() + ";");
            if(transToDiffs.containsKey(transformation)) {
                writer.append(transToDiffs.get(transformation).size() + ";");
                writer.append(transToDiffs.get(transformation).stream()
                        .filter(d -> d instanceof GraphsDiff)
                        .count()+ ";");
                writer.append(transToDiffs.get(transformation).stream()
                        .filter(d -> d instanceof BranchDiff)
                        .count()+ ";");
                writer.append(transToDiffs.get(transformation).stream()
                        .filter(d -> d instanceof VariableDiff)
                        .count()+ ";");
                writer.append(transToDiffs.get(transformation).stream()
                        .filter(d -> d instanceof ExceptionDiff)
                        .count() + ";");
            } else {
                writer.append("0;0;0;0;0;");
            }
            writer.append(coveredTests(transformation.getPosition()).size() + ";");
            writer.append(deepMax(transformation.getPosition()) + ";");
            writer.append(deepMean(transformation.getPosition()) + "\n");
        }
        writer.close();
    }

    protected void witeCSVStatement(String out) throws IOException {
        FileWriter writer = new FileWriter(new File(out));

        writer.append("nbTrial;nbCompile;nbSosie;nbTest;maxDeep;meanDeep\n");
        for(CodeFragment stmt: inputProgram.getCodeFragments()) {
            SourcePosition position = stmt.getCtCodeFragment().getPosition();
            List<Transformation> transInThisStmt = transformations.stream()
                    .filter(trans -> include(position, trans.getPosition()))
                    .collect(Collectors.toList());

            writer.append(transInThisStmt.size() + ";");
            writer.append(transInThisStmt.stream()
                    .filter(trans -> trans.getStatus() >= -1)
                    .count() + ";");
            writer.append(transInThisStmt.stream()
                    .filter(trans -> trans.getStatus() == 0)
                    .count() + ";");
            writer.append(coveredTests(position).size() + ";");
            writer.append(deepMax(position) + ";");
            writer.append(deepMean(position) + "\n");
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

    protected int deepMax(SourcePosition sourcePosition) {
        return branches(sourcePosition).stream()
                .flatMap(branch -> deeps(branch).stream())
                .mapToInt(i -> i)
                .max()
                .orElse(0);
    }

    protected Set<Integer> deeps(Branch b) {
        return  b.getDeeps();
    }

    protected double deepMean(SourcePosition sourcePosition) {
        Collection<Branch> branches = branches(sourcePosition);
        return branches.stream()
                .flatMap(branch -> branch.getDeeps().stream())
                .mapToDouble(i -> i)
                .sum() / branches.stream().flatMap(branch -> branch.getDeeps().stream()).count();
    }

    protected Collection<Branch> branches(SourcePosition sourcePosition) {
        return branchPosition.keySet().stream()
                .filter(branch -> include(branchPosition.get(branch), sourcePosition))
                .map(branch -> globalCoverage.getBranch(branch))
                .filter(branch -> branch != null)
                .collect(Collectors.toSet());
    }

    protected Collection<String> coveredTests(SourcePosition sourcePosition) {
        return branchPosition.keySet().stream()
                .filter(branch -> include(branchPosition.get(branch), sourcePosition))
                .filter(branch -> testsByBranch.containsKey(branch))
                .flatMap(branch -> testsByBranch.get(branch).stream())
                .collect(Collectors.toSet());
    }

    //true if oThis include in oOther
    protected boolean include(SourcePosition oThis, SourcePosition oOther) {
        return oThis.getCompilationUnit().getMainType().getQualifiedName().equals(oOther.getCompilationUnit().getMainType().getQualifiedName())
                && oThis.getLine() <= oOther.getLine()
                && oThis.getEndLine() >= oOther.getEndLine();

    }

    public static void main(String args[]) throws InvalidSdkException, Exception {
        new LoadDiff(args[0]);
    }

}
