package fr.inria.diversify;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.log.branch.Coverage;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.processor.main.AddBlockEverywhereProcessor;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.InitUtils;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.QueueProcessingManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 07/07/16
 * Time: 11:25
 */
public class SosieSubSetExp {
    protected InputProgram inputProgram;
    protected List<Coverage> testCoverages;
    protected Collection<Transformation> transformations;

    public Map<CtType, Set<String>> classToCoverageTests() {
        Map<CtType, Set<String>> classToTests = new HashMap<>();
        Map<CtStatement, String> statementToBranch = Utils.statementToBranch(inputProgram);
        List<CtClass> classes = inputProgram.getAllElement(CtClass.class);

        classes.stream()
                .map(cl -> cl.getPosition().getCompilationUnit().getMainType())
                .distinct()
                .forEach(cl ->
                        classToTests.put(cl,
                        getStatements(cl).stream()
                                .map(stmt -> statementToBranch.get(stmt))
                                .filter(b -> b != null)
                                .flatMap(b -> testFor(b).stream())
                            .collect(Collectors.toSet())));

        return classToTests;
    }


    public Map<CtType, Set<String>> classToLocalTests() {
        Map<CtType, Set<String>> classToTests = new HashMap<>();
        Set<String> allTests = allTests();
        List<CtClass> classes = inputProgram.getAllElement(CtClass.class);

        classes.stream()
                .map(cl -> cl.getPosition().getCompilationUnit().getMainType())
                .distinct()
                .forEach(cl -> classToTests.put(cl,
                            allTests.stream()
                                .filter(test -> test.contains(cl.getSimpleName()))
                                .collect(Collectors.toSet())));

        return classToTests;
    }

    protected Set<String> allTests() {
        return testCoverages.stream()
                .map(coverage -> coverage.getName())
                .collect(Collectors.toSet());
    }

    protected List<String> testFor(String branch) {
        return testCoverages.stream()
                .filter(coverage -> coverage.getCoverageBranch().contains(branch))
                .map(coverage -> coverage.getName())
                .collect(Collectors.toList());
    }

    protected List<CtStatement> getStatements(CtType cl) {
        return Query.getElements(cl, new TypeFilter(CtStatement.class));
    }

    protected void printCsv(File file) throws IOException {
        Map<CtType, Set<String>> classToLocalTests = classToLocalTests();
        Map<CtType, Set<String>> classToTests = classToCoverageTests();
        FileWriter writer = new FileWriter(file + "/cl.csv");
        writer.write("cl;test;localTest;trial;compile;sosie;localSosie;localsosieNotGlobalSosie\n");

        for(CtType cl : classToTests.keySet()) {
            Set<String> tests = classToTests.get(cl);
            Set<String> localTests = classToLocalTests.get(cl);

            Set<Transformation> trial = transformations.parallelStream()
                    .filter(t -> mainType(t).equals(cl))
                    .collect(Collectors.toSet());

            Set<Transformation> compile = trial.stream()
                    .filter(t -> t.getStatus() >= -1)
                    .collect(Collectors.toSet());

            Set<Transformation> sosie = compile.stream()
                    .filter(t -> t.getStatus() == 0)
                    .collect(Collectors.toSet());

            Set<Transformation> localSosie = new HashSet<>();
            for(Transformation t : compile) {
                boolean b = false;
                for(String test : t.getFailures()) {
                    b = b || localTests.contains(test);
                    if(b) {
                        break;
                    }
                }
                if(!b) {
                    localSosie.add(t);
                }
            }

            Set<Transformation> localsosieNotGlobalSosie = localSosie.stream()
                    .filter(t -> t.getStatus() != 0)
                    .collect(Collectors.toSet());

            writer.write(cl.getQualifiedName() + ";");
            writer.write(tests.size() + ";");
            writer.write(localTests.size() + ";");
            writer.write(trial.size() + ";");
            writer.write(compile.size() + ";");
            writer.write(sosie.size() + ";");
            writer.write(localSosie.size() + ";");
            writer.write(localsosieNotGlobalSosie.size() + "\n");
        }
        writer.close();
    }

    protected CtType mainType(Transformation t) {
        return t.getPositions().get(0).getCompilationUnit().getMainType();
    }

    protected Collection<Transformation> loadTransformation(String transDir) {
        JsonTransformationLoader loader = new JsonTransformationLoader(inputProgram);
        return loader.load(transDir, true);
    }

    public SosieSubSetExp(InputConfiguration inputConfiguration) throws Exception, InvalidSdkException {

        InitUtils.initLogLevel(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        InitUtils.initSpoon(inputProgram, false);

        loadLog();

        transformations = loadTransformation(inputConfiguration.getPreviousTransformationPath());
    }

    protected void loadLog() throws IOException {
        Factory factory = inputProgram.getFactory();

        QueueProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(new AddBlockEverywhereProcessor(inputProgram));
        pm.process(factory.Package().getRootPackage());


    }

    public static void main(String[] args) throws InvalidSdkException, Exception {
        InputConfiguration inputConfiguration = new InputConfiguration(args[0]);
        SosieSubSetExp ssse = new SosieSubSetExp(inputConfiguration);

        File resultDir = new File(inputConfiguration.getOutputDirectory());
        if(!resultDir.exists()) {
            resultDir.mkdirs();
        }

        ssse.printCsv(resultDir);
    }
}
