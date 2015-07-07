package fr.inria.diversify;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.Diff;
import fr.inria.diversify.logger.JsonDiffInput;
import fr.inria.diversify.logger.JsonDiffOutput;
import fr.inria.diversify.logger.branch.BranchDiff;
import fr.inria.diversify.logger.exception.ExceptionDiff;
import fr.inria.diversify.logger.graph.GraphsDiff;
import fr.inria.diversify.logger.variable.VariableDiff;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.persistence.json.output.JsonTransformationWriter;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.Log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
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

    public LoadDiff(String propertiesFile) throws Exception, InvalidSdkException {

        inputConfiguration = new InputConfiguration(propertiesFile);

        InitUtils.initLogLevel(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initSpoon(inputProgram, false);

        String transDir = inputConfiguration.getProperty("transformation.directory");
        String out = inputConfiguration.getProperty("result");

        computeDiversifyStat(transDir, out);
        witeCSV(out + ".csv");

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

        writer.append("type;name;status;diff;graphDiff;branchDiff;variableDiff;exceptionDiff\n");
        for(Transformation transformation: transformations) {
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
                        .count() + "");
            } else {
                writer.append("0;0;0;0;0");
            }
            writer.append("\n");
        }
        writer.close();
    }

    public static void main(String args[]) throws InvalidSdkException, Exception {
        new LoadDiff(args[0]);
    }

}
