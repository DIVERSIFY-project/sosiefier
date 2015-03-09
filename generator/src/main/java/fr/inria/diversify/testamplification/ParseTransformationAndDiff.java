package fr.inria.diversify.testamplification;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.testamplification.compare.diff.Diff;
import fr.inria.diversify.testamplification.compare.diff.Filter;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.transformation.TransformationsWriter;
import fr.inria.diversify.util.Log;
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
    protected Map<Transformation, Diff> diffs;
    Filter filter;
    protected InputProgram inputProgram;


    public static void main(String[] args) throws IOException, InterruptedException, JSONException, TransformationParserException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        InputConfiguration inputConfiguration = new InputConfiguration(args[0]);
        InputProgram inputProgram = initInputProgram(inputConfiguration);
        ParseTransformationAndDiff p = new ParseTransformationAndDiff(inputProgram);
        p.initSpoon(inputConfiguration);
        p.parseDir(args[1]);
        p.loadFilter(inputConfiguration.getProperty("compare.filter"));
//        p.loadFilter(inputConfiguration.getProperty("compare.filter"));


        p.applyFilter();
        List<Transformation> transformations = p.stat();

        p.writeTransformations(inputConfiguration.getProperty("result"), transformations);

    }

    public List<Transformation> stat() {
        List<Transformation> transformations = new ArrayList<>();
        int totalSum = 0;
        int count = 0;
        for (Transformation transformation : diffs.keySet()) {
           int sum = diffs.get(transformation).size();

            if(sum != 0) {
                Log.info("{} \nnb: {}\n",transformation, sum);
                count++;
                transformations.add(transformation);
                Log.info(diffs.get(transformation).toString());
                totalSum += sum;
            }
        }
        Log.info("nb sosie: {}, nb diverse sosie: {}, mean divergence: {}",diffs.size(), count, ((double) totalSum)/((double) count));
        return transformations;


    }

    public String writeTransformations(String fileName, List<Transformation> transformations) throws IOException, JSONException {
        if (transformations.isEmpty())
            return "";

        TransformationsWriter write = new TransformationsWriter(transformations, fileName);
        return write.writeAllTransformation(null);
    }

    public void applyFilter() {
        for (Transformation trans : diffs.keySet()) {
            diffs.get(trans).filter(filter);
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
       Diff diff = new Diff(object, inputProgram);

        diffs.put(diff.getSosie(), diff);
    }



    public Map<Transformation,Diff> getDiffs() {
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

    public void loadFilter(String file) throws IOException {
       filter = new Filter(file);
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
}
