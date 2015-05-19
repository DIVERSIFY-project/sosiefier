package fr.inria.diversify;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.FromListQuery;
import fr.inria.diversify.util.InitUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * User: Simon
 * Date: 18/03/15
 * Time: 10:58
 */
public class WriteSosie {

    FromListQuery query;
    InputProgram inputProgram;
    InputConfiguration inputConfiguration;
    String outputDirectory;

    protected WriteSosie(String propertiesFile) throws Exception, InvalidSdkException {
        inputConfiguration = new InputConfiguration(propertiesFile);

        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initSpoon(inputProgram, false);

        outputDirectory = inputConfiguration.getProperty("outputDirectory");

        query = new FromListQuery(inputProgram);
    }

    protected void generateAndWrite() throws Exception {
        int count = 0;
        while (query.hasNextTransformation()) {
            try {
                Transformation transformation = query.query();
                transformation.apply(outputDirectory + "/" + count);
                transformation.restore(outputDirectory + "/delete");
                count++;
            } catch (Exception e) {}
        }
        FileUtils.forceDelete(new File(outputDirectory + "/delete"));
    }


    public static void main(String args[]) throws InvalidSdkException, Exception {
        WriteSosie writeSosie = new WriteSosie(args[0]);
        writeSosie.generateAndWrite();
    }

}
