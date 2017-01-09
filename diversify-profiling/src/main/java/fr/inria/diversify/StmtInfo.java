package fr.inria.diversify;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.log.*;
import fr.inria.diversify.log.branch.Coverage;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.processor.ProcessorUtil;
import fr.inria.diversify.processor.main.AddBlockEverywhereProcessor;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.InitUtils;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 30/06/16
 * Time: 13:44
 */
public class StmtInfo {
    protected InputProgram inputProgram;

    protected Map<String, Integer> nbStatementExecution;
    protected List<Coverage> testCoverages;
    protected List<Coverage> assertCoverages;
    protected Map<String, List<Integer>> methodDeep;
    protected Collection<Transformation> transformations;

    public static void main(String[] args) throws Exception, InvalidSdkException {
        InputConfiguration inputConfiguration = new InputConfiguration(args[0]);
        StmtInfo main = new StmtInfo(inputConfiguration);
        main.loadLog();
        main.loadTransformation(inputConfiguration.getPreviousTransformationPath());

        File resultDir = new File(inputConfiguration.getOutputDirectory());
        if(!resultDir.exists()) {
            resultDir.mkdirs();
        }

        main.printCSV(resultDir + "/stmt.csv");
    }

    public StmtInfo(InputConfiguration inputConfiguration) throws Exception, InvalidSdkException {
        InitUtils.initLogLevel(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        Factory factory = InitUtils.initSpoon(inputProgram, false);

        QueueProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(new AddBlockEverywhereProcessor(inputProgram));
        pm.process(factory.Package().getRootPackage());
    }

    protected void loadLog() throws IOException {
        LogReader logReader = new LogReader("out/log");
        TestCoverageParser coverageParser = new TestCoverageParser();
        logReader.addParser(coverageParser);

        StatementLogParser statementLogParser = new StatementLogParser();
        logReader.addParser(statementLogParser);

        MethodDeepParser methodDeepParser = new MethodDeepParser();
        logReader.addParser(methodDeepParser);

        AssertCoverageParser assertCoverageParser = new AssertCoverageParser();
        logReader.addParser(assertCoverageParser);

        logReader.readLogs();

        nbStatementExecution = statementLogParser.getResult();
        testCoverages = coverageParser.getResult();
        assertCoverages = assertCoverageParser.getResult();
        methodDeep = methodDeepParser.getResult();
    }

    protected void printCSV(String fileName) throws IOException {
        FileWriter writer = new FileWriter(new File(fileName));
        Map<CtStatement, CtExecutable>  statementToParentMethod = Utils.statementToParentMethod(inputProgram);
        Map<CtStatement, String> statementToBranch = Utils.statementToBranch(inputProgram);

        writer.append("stmt;nbExec;deepMax;deepMin;deepMean;nbTest;nbAssert;trial;compile;sosie;branch\n");

        for(CtStatement stmt : statementToParentMethod.keySet()) {
            String positionString = stmt.getPosition().getCompilationUnit().getMainType().getQualifiedName() + ":" + stmt.getPosition().getLine();
            CtExecutable parentMethod = statementToParentMethod.get(stmt);

            writer.append(positionString);
            writer.append(";");

            writer.append(nbStatementExecution.getOrDefault(positionString, 0)+ ";");

            writer.append(getDeepMaxFor(parentMethod) + ";");
            writer.append(getDeepMinFor(parentMethod) + ";");
            writer.append(getDeepMeanFor(parentMethod) + ";");

            writer.append(Math.min(nbStatementExecution.getOrDefault(positionString, 0), testFor(statementToBranch.get(stmt)).size()) + ";");
            writer.append(Math.min(nbStatementExecution.getOrDefault(positionString, 0), assertFor(statementToBranch.get(stmt)).size()) + ";");

            writer.append(trial(stmt).size() + ";");
            writer.append(compile(stmt).size() + ";");
            writer.append(sosie(stmt).size() + ";");

            writer.append(statementToBranch.get(stmt));
            writer.append("\n");
        }
        writer.close();
    }

    protected int getDeepMinFor(CtExecutable mth) {
        try {
            String mthString = ProcessorUtil.methodString(mth);

            if (methodDeep.containsKey(mthString)) {
                return methodDeep.get(mthString).stream().mapToInt(i -> i).min().getAsInt();
            }
        } catch (Exception e) {}
        return 0;
    }

    protected int getDeepMaxFor(CtExecutable mth) {
        try {
            String mthString = ProcessorUtil.methodString(mth);

            if(methodDeep.containsKey(mthString)) {
                return methodDeep.get(mthString).stream().mapToInt(i -> i).max().getAsInt();
            }
        } catch (Exception e) {}
        return 0;
    }

    protected double getDeepMeanFor(CtExecutable mth) {
        try {
            String mthString = ProcessorUtil.methodString(mth);

            if(methodDeep.containsKey(mthString)) {
                return ((double)methodDeep.get(mthString).stream().mapToInt(i -> i).sum()) / ((double) methodDeep.get(mthString).size());
            }
        } catch (Exception e) {}
        return 0;
    }

    protected List<String> testFor(String branch) {
        return testCoverages.stream()
                .filter(coverage -> coverage.getCoverageBranch().contains(branch))
                .map(coverage -> coverage.getName())
                .collect(Collectors.toList());
    }

    protected List<String> assertFor(String branch) {
        return assertCoverages.stream()
                .filter(coverage -> coverage.getCoverageBranch().contains(branch))
                .map(coverage -> coverage.getName())
                .collect(Collectors.toList());
    }

    protected Set<Transformation> trial(CtStatement stmt) {
        return transformations.stream()
                .filter(t -> t.getPositions().get(0).equals(stmt.getPosition()))
                .collect(Collectors.toSet());
    }

    protected Set<Transformation> compile(CtStatement stmt) {
        return trial(stmt).stream()
                .filter(t -> t.getStatus() >= -1)
                .collect(Collectors.toSet());
    }

    protected Set<Transformation> sosie(CtStatement stmt) {
        return trial(stmt).stream()
                .filter(t -> t.getStatus() == 0)
                .collect(Collectors.toSet());
    }

    protected void loadTransformation(String transDir) {
        JsonTransformationLoader loader = new JsonTransformationLoader(inputProgram);
        transformations = loader.load(transDir, true);
    }
}


