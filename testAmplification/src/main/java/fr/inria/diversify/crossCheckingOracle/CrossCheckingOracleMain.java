package fr.inria.diversify.crossCheckingOracle;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenBuilder;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.query.FromListQuery;
import fr.inria.diversify.transformation.query.TransformationQuery;
import fr.inria.diversify.util.InitUtils;



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
        DiversifyOracle diversifyOracle = new DiversifyOracle(inputConfiguration, output, inputProgram.getRelativeSourceCodeDir());

        String sosieDir = inputConfiguration.getProperty("copy.sosie.sources.to", "");
        diversifyOracle.setSosieSourcesDir(sosieDir);
        diversifyOracle.init(output, inputConfiguration.getProperty("tmpDir"));

        AbstractBuilder builder = new MavenBuilder(diversifyOracle.getTmpDir());
        builder.setGoals(new String[]{"clean", "test"});
        builder.initTimeOut();

        diversifyOracle.setTransformationQuery(query());
        diversifyOracle.setBuilder(builder);
        diversifyOracle.run(100);

    }


    protected TransformationQuery query() {
        int rangeMin = Integer.parseInt(inputConfiguration.getProperty("transformation.range.min", "-1"));
        int rangeMax = Integer.parseInt(inputConfiguration.getProperty("transformation.range.max", "-1"));
        FromListQuery query;
        if(rangeMax == -1 || rangeMin == -1) {
            query = new FromListQuery(inputProgram);
        } else {
            query = new FromListQuery(inputProgram, rangeMin, rangeMax);
        }
        query.setShuffle(true);
        query.setRemoveAfterQuery(true);

        return query;
    }



    protected void init(String propertiesFile) throws Exception, InvalidSdkException {
        inputConfiguration = new InputConfiguration(propertiesFile);
        InitUtils.initLogLevel(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);

        InitUtils.initSpoon(inputProgram, true);

        outputDirectory = inputConfiguration.getProperty("tmpDir") + "/tmp_" + System.currentTimeMillis();
    }

    public static void main(String[] args) throws Exception, InvalidSdkException {
        CrossCheckingOracleMain main = new CrossCheckingOracleMain(args[0]);

    }
}
