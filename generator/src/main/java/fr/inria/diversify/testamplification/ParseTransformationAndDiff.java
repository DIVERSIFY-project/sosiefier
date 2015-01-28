package fr.inria.diversify.testamplification;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.testamplification.compare.diff.TestDiff;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Simon on 27/01/15.
 */
public class ParseTransformationAndDiff {
    protected Map<Transformation, Set<TestDiff>> diffs;
    protected InputProgram inputProgram;


    public static void main(String[] args) throws IOException, InterruptedException, JSONException, TransformationParserException {
        InputConfiguration inputConfiguration = new InputConfiguration(args[0]);
        InputProgram inputProgram = initInputProgram(inputConfiguration);

        ParseTransformationAndDiff p = new ParseTransformationAndDiff(inputProgram);

        p.parseDir(args[1]);

    }

    public ParseTransformationAndDiff(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    public void parseDir(String dirName) throws IOException, JSONException, TransformationParserException {
        File dir = new File(dirName);

        for(File file : dir.listFiles()) {
            if(file.isFile() && file.getName().endsWith(".json")) {
                parseFile(file);
            }
        }
    }

    protected void parseFile(File file) throws IOException, JSONException, TransformationParserException {
        BufferedReader br = null;
        StringBuilder sb = null;
        try {
            br = new BufferedReader(new FileReader(file));
            sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
        } finally {
            if (br != null) br.close();
        }

        JSONArray array =  new JSONArray(sb.toString());
        for( int i = 0; i < array.length(); i++) {
            parseTD(array.getJSONObject(i));
        }

    }

    protected void parseTD(JSONObject td) throws JSONException, TransformationParserException {
        TransformationJsonParser parser = new TransformationJsonParser(true, inputProgram);
        Transformation trans =  parser.parseTransformation(td.getJSONObject("transformation"));

        Set<TestDiff> diff = parseDiff(td.getJSONArray("testDiff"));

        diffs.put(trans, diff);
    }

    protected Set<TestDiff> parseDiff(JSONArray array) throws JSONException {
        Set<TestDiff> diffs = new HashSet<>();

        for(int i = 0; i < array.length(); i++) {
            diffs.add(new TestDiff(array.getJSONObject(i)));
        }

        return diffs;
    }

    public Map<Transformation, Set<TestDiff>> getDiffs() {
        return diffs;
    }

    /**
     * Initializes the InputProgram dataset
     */
    protected static InputProgram  initInputProgram(InputConfiguration inputConfiguration) throws IOException, InterruptedException {
        InputProgram inputProgram = new InputProgram();
        inputConfiguration.setInputProgram(inputProgram);
        inputProgram.setProgramDir(inputConfiguration.getProperty("project"));
        inputProgram.setSourceCodeDir(inputConfiguration.getSourceCodeDir());

        if(inputConfiguration.getProperty("externalSrc") != null) {
            List<String> list = Arrays.asList(inputConfiguration.getProperty("externalSrc").split(System.getProperty("path.separator")));
            String sourcesDir = list.stream()
                                    .map(src -> inputProgram.getProgramDir() + "/" + src)
                                    .collect(Collectors.joining(System.getProperty("path.separator")));
            inputProgram.setExternalSourceCodeDir(sourcesDir);
        }


        inputProgram.setTransformationPerRun(
                Integer.parseInt(inputConfiguration.getProperty("transformation.size", "1")));

        //Path to pervious transformations made to this input program
        inputProgram.setPreviousTransformationsPath(
                inputConfiguration.getProperty("transformation.directory"));

        inputProgram.setClassesDir(inputConfiguration.getProperty("project") + "/" +
                                           inputConfiguration.getProperty("classes"));

        inputProgram.setCoverageDir(inputConfiguration.getProperty("jacoco"));

        return inputProgram;
    }
}
