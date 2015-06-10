package fr.inria.diversify.testamplification;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.output.JsonTransformationWriter;
import fr.inria.diversify.testamplification.compare.diff.Diff;
import fr.inria.diversify.testamplification.compare.diff.Filter;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.*;

/**
 * Created by Simon on 27/01/15.
 */
@Deprecated
public class ParseTransformationAndDiff {
    protected Map<Transformation, Diff> diffs;
    Filter filter;
    protected InputProgram inputProgram;

    int rm = 0;
    int add = 0;
    int commit = 0;


    public static void main(String[] args) throws IOException, InterruptedException, JSONException, TransformationParserException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        InputConfiguration inputConfiguration = new InputConfiguration(args[0]);
        InputProgram inputProgram = InitUtils.initInputProgram(inputConfiguration);
        ParseTransformationAndDiff p = new ParseTransformationAndDiff(inputProgram);
        InitUtils.initSpoon(inputProgram, false);

        p.parseDir(args[1]);
        p.loadFilter(inputConfiguration.getProperty("compare.filter"));
//        p.loadFilter(inputConfiguration.getProperty("compare.filter"));

        p.applyFilter();
        List<Transformation> transformations = p.stat();

        p.writeTransformations(args[1], transformations);

    }

    public List<Transformation> stat() {
        List<Transformation> transformations = new ArrayList<>();
        int totalSum = 0;
        int count = 0;
        for (Transformation transformation : diffs.keySet()) {
           int sum = diffs.get(transformation).size();
            if(diffs.get(transformation).toString().contains("RmCommand")) {
                rm++;
            }
            if(diffs.get(transformation).toString().contains("AddCommand")) {
                add++;
            }
            if(diffs.get(transformation).toString().contains("Commit")) {
                commit++;
            }
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

//        TransformationsWriter write = new TransformationsWriter(transformations, fileName);
//        return write.writeAllTransformation(null);
        JsonTransformationWriter writer = new JsonTransformationWriter();
        writer.write(transformations, fileName + ".json", inputProgram.getProgramDir() + "/pom.xml");
        return fileName + ".json";
    }

    public void applyFilter() {
        for (Transformation trans : diffs.keySet()) {
            diffs.get(trans).filter(filter);
        }
    }

    public ParseTransformationAndDiff(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    public void parseDir(String dirName) throws IOException, JSONException {
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


    public void loadFilter(String file) throws IOException {
       filter = new Filter(file);
    }
}
