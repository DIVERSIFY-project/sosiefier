package fr.inria.diversify;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.persistence.json.output.JsonTransformationWriter;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.Log;

import java.io.File;
import java.util.Collection;

/**
 * User: Simon
 * Date: 21/05/15
 * Time: 15:29
 */
public class OltToNewJsonTransformationFormat {


    private final InputConfiguration inputConfiguration;
    private final InputProgram inputProgram;

    public OltToNewJsonTransformationFormat(String propertiesFile) throws Exception, InvalidSdkException {
        inputConfiguration = new InputConfiguration(propertiesFile);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);

        InitUtils.initSpoon(inputProgram, false);

        String transDir = inputConfiguration.getProperty("transformation.directory");
        String out = inputConfiguration.getProperty("result");

        compute(transDir, out);
    }

    protected void compute(String transDir, String output) throws Exception {
        TransformationParser tf = new TransformationParser(true, inputProgram);
        Collection<Transformation> transformations = tf.parse(transDir);

        Log.info("nb transformation: {}",transformations.size());
        Log.info("nb compile: {}", transformations.parallelStream()
                .filter(t -> t.getStatus() >= -1)
                .count());
        Log.info("nb sosie: {}",transformations.parallelStream()
                .filter(t -> t.getStatus() == 0)
                .count());

        JsonTransformationWriter writer = new JsonTransformationWriter();

        File out = new File(output);
        if(!out.exists()) {
            out.mkdirs();
        }
        writer.write(transformations, output + ".json", inputProgram.getProgramDir() + "/pom.xml");
    }

    public static void main(String[] args) throws InvalidSdkException, Exception {
        new OltToNewJsonTransformationFormat(args[0]);
    }
}

