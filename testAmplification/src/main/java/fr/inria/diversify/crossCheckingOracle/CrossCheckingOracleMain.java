package fr.inria.diversify.crossCheckingOracle;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.coverage.NullCoverageReport;
import fr.inria.diversify.runner.CoverageRunner;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.runner.SinglePointRunner;
import fr.inria.diversify.transformation.query.FromListQuery;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.transformation.typeTransformation.NewInstanceTransformation;
import fr.inria.diversify.transformation.typeTransformation.TypeTransformationQuery;
import fr.inria.diversify.util.InitUtils;

import java.io.File;


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

        CoverageRunner diversifyOracle = new CoverageRunner(inputConfiguration, output, inputProgram.getRelativeSourceCodeDir());
        String sosieDir = inputConfiguration.getProperty("copy.sosie.sources.to", "");
        diversifyOracle.setSosieSourcesDir(sosieDir);
        diversifyOracle.init(output, inputConfiguration.getProperty("tmpDir"));

        AbstractBuilder builder = new MavenBuilder(diversifyOracle.getTmpDir());
        builder.setGoals(new String[]{"clean", "test"});

        inputProgram.setCoverageReport(new NullCoverageReport());

//        builder.initTimeOut();
        builder.setTimeOut(150);
        diversifyOracle.setTransformationQuery(query());
        diversifyOracle.setBuilder(builder);
        diversifyOracle.run(100);

    }


    protected TransformationQuery query() {
//        FromListQuery query = new FromListQuery(inputProgram, true);
//        query.getTransformations().stream()
//                .forEach(t -> ((NewInstanceTransformation)t).setWithSwitch(true) );
//        return new FromListQuery(inputProgram, true);
        return new TypeTransformationQuery(inputProgram, "java.util.Collection:java.util.List:.*", true, true);
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
