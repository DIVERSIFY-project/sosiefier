package fr.inria.diversify.crossCheckingOracle;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.coverage.NullCoverageReport;
import fr.inria.diversify.runner.*;
import fr.inria.diversify.transformation.query.FromListQuery;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.transformation.typeTransformation.InstanceTransformation;
import fr.inria.diversify.util.InitUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * User: Simon
 * Date: 02/10/15
 * Time: 10:48
 */
public class CrossCheckingOracleMain {
    private InputProgram inputProgram;
    private String outputDirectory;
    private InputConfiguration inputConfiguration;

    public CrossCheckingOracleMain(String propertiesFile) throws InvalidSdkException, Exception {
        init(propertiesFile);
        run();
    }


    public void run() throws Exception {
        CrossCheckingOracle crossCheckingOracle = new CrossCheckingOracle(inputProgram, outputDirectory);
        String output = crossCheckingOracle.generateTest();

        SinglePointRunner diversifyOracle = new SinglePointRunner(inputConfiguration, output, inputProgram.getRelativeSourceCodeDir());
        diversifyOracle.init(output, inputConfiguration.getProperty("tmpDir"));

        AbstractBuilder builder = new MavenBuilder(diversifyOracle.getTmpDir());
        builder.setGoals(new String[]{"clean", "test"});

        inputProgram.setCoverageReport(new NullCoverageReport());


        List<String> acceptedErrors = new ArrayList<>();
        for(int i = 0; i < 8; i++) {
            builder.initTimeOut();
            acceptedErrors.addAll(builder.getFailedTests());
        }
        builder.setAcceptedErrors(acceptedErrors);
//        builder.setTimeOut(150);
        diversifyOracle.setTransformationQuery(query());
        diversifyOracle.setBuilder(builder);
        int n = Integer.parseInt(inputConfiguration.getProperty("nbRun"));
        diversifyOracle.run(n);
        writeResult(diversifyOracle);
        diversifyOracle.deleteTmpFiles();
    }

    protected void writeResult(AbstractRunner runner) {
        String repo = inputConfiguration.getProperty("gitRepository");

        if (repo.equals("null")) {
            runner.printResult(inputConfiguration.getProperty("result"));
        } else {
            runner.printResultInGitRepo(inputConfiguration.getProperty("result"), repo);
        }
    }

    protected TransformationQuery query() {
        int rangeMin = Integer.parseInt(inputConfiguration.getProperty("transformation.range.min", "0"));
        int rangeMax = Integer.parseInt(inputConfiguration.getProperty("transformation.range.max", "10000000"));
        FromListQuery query = new FromListQuery(inputProgram, rangeMin, rangeMax, true);
        query.getTransformations().stream()
                .forEach(t -> ((InstanceTransformation)t).setWithSwitch(true) );
        return query;
//        return new TypeTransformationQuery(inputProgram, "java.util.Collection:java.util.List:.*", true, true);
    }



    protected void init(String propertiesFile) throws Exception, InvalidSdkException {
        inputConfiguration = new InputConfiguration(propertiesFile);
        InitUtils.initLogLevel(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);

        InitUtils.initSpoon(inputProgram, true);

        outputDirectory = inputConfiguration.getProperty("tmpDir") + "/tmp_" + System.currentTimeMillis();
        new File(outputDirectory).mkdirs();
    }

    public static void main(String[] args) throws Exception, InvalidSdkException {
        CrossCheckingOracleMain main = new CrossCheckingOracleMain(args[0]);

    }
}
