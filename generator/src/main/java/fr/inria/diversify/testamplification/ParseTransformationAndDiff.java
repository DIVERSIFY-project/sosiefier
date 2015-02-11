package fr.inria.diversify.testamplification;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.testamplification.compare.diff.TestDiff;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.factory.Factory;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Simon on 27/01/15.
 */
public class ParseTransformationAndDiff {
    protected Map<Transformation, Set<TestDiff>> diffs;
    protected InputProgram inputProgram;


    public static void main(String[] args) throws IOException, InterruptedException, JSONException, TransformationParserException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        InputConfiguration inputConfiguration = new InputConfiguration(args[0]);
        InputProgram inputProgram = initInputProgram(inputConfiguration);
        ParseTransformationAndDiff p = new ParseTransformationAndDiff(inputProgram);
        p.initSpoon(inputConfiguration);
        p.parseDir(args[1]);
        Map<String, Set<String>> filter = p.loadFilter(inputConfiguration.getProperty("compare.filter"));


        p.applyFilter(p.diffs, filter);
//        p.stat(p.diffs);
        for(Transformation trans : p.diffs.keySet()) {
            p.toJson(p.diffs.get(trans), trans);
        }

    }

    public void stat(Map<Transformation, Set<TestDiff>> diffs) {
        int count = 0;
        for (Transformation transformation : diffs.keySet()) {
           int sum = diffs.get(transformation).stream().mapToInt(diff -> diff.size()).sum();

            int diffSize = diffs.get(transformation).stream()
                 .mapToInt(diff -> diff.size())
                .sum();
            if(diffSize != 0) {
                Log.info("{} \nnb: {}\n",transformation, sum);
                count++;
                diffs.get(transformation).stream()
                     .filter(diff -> diff.size() != 0)
                     .forEach(diff -> Log.info(diff.toString()));
                Log.debug("");
            }
        }
        Log.info("{} {}",diffs.size(), count);


    }

    public void applyFilter(Map<Transformation, Set<TestDiff>> diffs, Map<String, Set<String>> filter) {
        for (Transformation trans : diffs.keySet()) {
            diffs.get(trans).stream().filter(d -> filter.containsKey(d.getSignature())).forEach(d -> d.filter(filter.get(d.getSignature())));
        }
    }

    public ParseTransformationAndDiff(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    public void parseDir(String dirName) throws IOException, JSONException, TransformationParserException {
        diffs = new HashMap<>();
        File dir = new File(dirName);

        for (File file : dir.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".json")) {
                try {

                    parseFile(file);
                } catch (Exception e) {

                    Log.debug("{}", file);
                }

            }

        }
        Log.debug("");
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

        JSONObject object = new JSONObject(sb.toString());
        parseTD(object);
    }

    protected void parseTD(JSONObject td) throws JSONException, TransformationParserException {
        TransformationJsonParser parser = new TransformationJsonParser(true, inputProgram);
        Transformation trans = parser.parseTransformation(td.getJSONObject("transformation"));

        Set<TestDiff> diff = parseDiff(td.getJSONArray("testDiff"));

        diffs.put(trans, diff);
    }

    protected Set<TestDiff> parseDiff(JSONArray array) throws JSONException {
        Set<TestDiff> diffs = new HashSet<>();

        for (int i = 0; i < array.length(); i++) {
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
    protected static InputProgram initInputProgram(InputConfiguration inputConfiguration) throws IOException, InterruptedException {
        InputProgram inputProgram = new InputProgram();
        inputConfiguration.setInputProgram(inputProgram);
        inputProgram.setProgramDir(inputConfiguration.getProperty("project"));
        inputProgram.setRelativeSourceCodeDir(inputConfiguration.getRelativeSourceCodeDir());

        if (inputConfiguration.getProperty("externalSrc") != null) {
            List<String> list = Arrays.asList(inputConfiguration.getProperty("externalSrc").split(System.getProperty("path.separator")));
            String sourcesDir = list.stream().map(src -> inputProgram.getProgramDir() + "/" + src).collect(Collectors.joining(System.getProperty("path.separator")));
            inputProgram.setExternalSourceCodeDir(sourcesDir);
        }


        inputProgram.setTransformationPerRun(Integer.parseInt(inputConfiguration.getProperty("transformation.size", "1")));

        //Path to pervious transformations made to this input program
        inputProgram.setPreviousTransformationsPath(inputConfiguration.getProperty("transformation.directory"));

        inputProgram.setClassesDir(inputConfiguration.getProperty("project") + "/" +
                                           inputConfiguration.getProperty("classes"));

        inputProgram.setCoverageDir(inputConfiguration.getProperty("jacoco"));

        return inputProgram;
    }

    public Map<String, Set<String>> loadFilter(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Map<String, Set<String>> filter = new HashMap<>();

        String line = reader.readLine();
        while (line != null) {
            String[] tmp = line.split(" ");
            if (!filter.containsKey(tmp[0])) {
                filter.put(tmp[0], new HashSet<>());
            }
            filter.get(tmp[0]).add(line.substring(tmp[0].length() + 1, line.length()));
            line = reader.readLine();
        }
        return filter;
    }

    protected void initSpoon(InputConfiguration inputConfiguration) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String sourcesDir = inputProgram.getAbsoluteSourceCodeDir();
        if(inputProgram.getExternalSourceCodeDir() != null) {
            sourcesDir += System.getProperty("path.separator") + inputProgram.getExternalSourceCodeDir();
        }

        Factory factory = new SpoonMetaFactory().buildNewFactory(
                sourcesDir,
                Integer.parseInt(inputConfiguration.getProperty("javaVersion")));
        inputProgram.setFactory(factory);
    }


    protected List<Integer> foo() {
        List ret = new ArrayList<>();
        return ret;
    }

    public JSONObject toJson(Set<TestDiff> diffs, Transformation sosie) throws JSONException {
        JSONObject object = new JSONObject();

        if(sosie != null) {
            object.put("transformation", sosie.toJSONObject());
        }

        JSONArray array = new JSONArray();
        object.put("testDiff", array);
        for(TestDiff diff : diffs) {
            if(!diff.getDiff().isEmpty()) {
                array.put(diff.toJSON());
            }
        }

        return object;
    }


}
