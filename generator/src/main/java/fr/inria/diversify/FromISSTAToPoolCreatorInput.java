package fr.inria.diversify;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.factory.Factory;

import java.io.*;
import java.util.*;

/**
 * A program to create a pool of sosies out of a directory of transformations without the source code
 * <p/>
 * Created by marodrig on 19/06/2014.
 */
public class FromISSTAToPoolCreatorInput {

    HashMap<String, Integer[]> diffCount;

    public static void main(String[] args) throws Exception {
        FromISSTAToPoolCreatorInput creator = new FromISSTAToPoolCreatorInput();
        InputConfiguration inputConfiguration = new InputConfiguration("C:\\MarcelStuff\\projects\\DIVERSE\\programs\\properties\\common-math\\issta-to-normal.properties");
        //InputConfiguration inputConfiguration = new InputConfiguration(args[0]);

        try {
            creator.init(inputConfiguration);
            //creator.test(inputConfiguration);
        } catch (Exception e) {
            System.out.println("Something went wrong" + e.getMessage());
        }

    }

    private String readDiffDile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append(System.lineSeparator());
        }
        String s = sb.toString();
        if (s.length() == 0) Log.warn("Empty diff file: " + fileName);
        return sb.toString();
    }

    /**
     * Get the position of the computationally diverse code
     *
     * @param fileName
     * @return
     * @throws IOException
     */
    private HashMap<String, String> computationallyDiverseSosies(String fileName) throws IOException {
        HashMap<String, String> differences = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName + "/sosieDiffSummary.csv"));
        String line = reader.readLine();//Read the reader header
        diffCount = new HashMap<>();
        int i = 0;
        while ((line = reader.readLine()) != null) {
            try {
                String[] ln = line.split(";");
                if (ln.length < 3) continue;
                ln[0] = ln[0].substring(1, ln[0].length() - 1);
                int i1 = Integer.parseInt(ln[1]); int i2 = Integer.parseInt(ln[2]);
                if ( i1 != 0 || i2 != 0) {
                    String s = getObject(new File(fileName + "/sosie/" + ln[0] + ".json")).getString("Position");

                    if (differences.containsKey(s)) Log.info("Repeated pos: " + s);
                    else {
                        diffCount.put(s, new Integer[] { i1, i2 });
                        //Add the diff file
                        differences.put(s, readDiffDile(fileName + "/result/" + ln[0]));
                    }
                }
            } catch (JSONException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
                Log.warn("Unable to parse line " + i + " :" + line + " error:" + e.getMessage());
            }
            i++;
        }
        Log.info("Total differences read: " + differences.size());
        return differences;
    }

    private void test(InputConfiguration inputConfiguration) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IOException, JSONException {

        String project = inputConfiguration.getProjectPath();
        String src = inputConfiguration.getSourceCodeDir();
        String prevTransfPath = inputConfiguration.getPreviousTransformationPath();
        String out = inputConfiguration.getResultPath();

        JSONArray array = getNormalArray(new File(out));

        Factory factory = new SpoonMetaFactory().buildNewFactory(project, 7);

        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.setSourceCodeDir(src);
        inputProgram.setPreviousTransformationsPath(prevTransfPath);
        inputProgram.processCodeFragments();


        TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
        List<SingleTransformation> transf = parser.parseArray(array);

        System.out.println("transf size" + transf.size());
    }

    private JSONArray getNormalArray(File input) throws IOException, JSONException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return new JSONArray(sb.toString());
    }

    private JSONArray getArray(File input) throws IOException, JSONException {
        JSONArray result = new JSONArray();
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line;
        while ((line = reader.readLine()) != null) {
            JSONObject obj = new JSONObject(line);
            result.put(obj);
        }
        return result;
    }

    private JSONObject getObject(File input) throws IOException, JSONException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return new JSONObject(sb.toString());
    }

    /**
     * Fetch the array from the many different sources
     *
     * @param f
     * @return
     */
    private JSONArray fetchTheArray(File f) throws IOException, JSONException {
        if (f.isDirectory()) {
            return getArray(new File(f.getAbsolutePath() + "/trans.json"));//this code is one shot utility
            //this whole logic depends on the organization given, don't try to understand this
        } else {
            return getNormalArray(f);
        }
    }

    private String findNearest(JSONArray arr, String pos) throws JSONException {
        String s = "None found";
        String[] l = pos.split(":");
        String file = l[0];
        int line = Integer.parseInt(l[1]);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length(); i++) {
            String tpPos = arr.getJSONObject(i).getJSONObject("transplantationPoint").getString("position");
            String[] ln = tpPos.split(":");
            int c = tpPos.compareTo(ln[0]) + Math.abs(line - Integer.parseInt(ln[1]));
            if (c < diff) {
                diff = c;
                s = tpPos;
            }
        }
        return s;
    }

    private boolean correctPosition(JSONObject object, InputProgram inputProgram) throws JSONException {
        CodeFragment f = inputProgram.getCodeFragment(object);
        if (f != null) {
            object.put("position", f.positionString());
            object.put("sourceCode", f.equalString());
            return true;
        }
        return false;
    }

    /**
     * Creates a json file
     */
    public void init(InputConfiguration inputConfiguration) throws IOException, JSONException, IllegalAccessException,
            InstantiationException, ClassNotFoundException, TransformationParserException {

        String project = inputConfiguration.getProjectPath();
        Log.info("Project: " + project);
        String src = inputConfiguration.getSourceCodeDir();
        String prevTransfPath = inputConfiguration.getPreviousTransformationPath();
        Log.info("Transf path: " + prevTransfPath);
        String out = inputConfiguration.getResultPath();
        Log.info("Output path: " + out);

        String diverseFileName = inputConfiguration.getProperty("computationalDiversityDir", null);
        HashMap<String, String> differences = null;
        if (diverseFileName != null) differences = computationallyDiverseSosies(diverseFileName);

        JSONArray diverse = new JSONArray();
        File d = new File(prevTransfPath);
        for (File f : d.listFiles()) {
            int i = 0;
            try {
                JSONArray array = fetchTheArray(f);
                for (i = 0; i < array.length(); i++) {
                    JSONObject t = null;
                    try {
                        t = array.getJSONObject(i);
                        if (!t.has("status") || t.getInt("status") != 0) continue;
                        String tpPos = t.getJSONObject("transplantationPoint").getString("position");
                        //String tPos = null;
                        //if (t.has("transplant")) tPos = t.getJSONObject("transplant").getString("position");
                        if (differences == null || differences.containsKey(tpPos) /*|| diverseSet.contains(tPos)*/) {
                            diverse.put(t);
                            boolean c = diffCount != null && diffCount.containsKey(tpPos);
                            t.put("nbVar", c ? diffCount.get(tpPos)[0] : -1);
                            t.put("nbCall", c ? diffCount.get(tpPos)[1] : -1);
                        }
                    } catch (Exception e) {
                        if (t != null) {
                            Log.warn("Unable to parse transformation: " + t.toString() + " index: " + i);
                        }
                    }
                }
            } catch (JSONException e) {
                Log.warn("Unable to parse file at: " + f.getAbsoluteFile());
            }
        }

        System.out.println("Diverse amount: " + diverse.length());
        RepeatedTransformationCleaner cleaner = new RepeatedTransformationCleaner();
        diverse = cleaner.clean(diverse);
        System.out.println("Clean amount: " + diverse.length());

        boolean parse = Boolean.parseBoolean(inputConfiguration.getProperty("parse", "true"));

        //Collection<Transformation> transf = null;

        JSONArray toFileArr = new JSONArray();
        if (parse) {
            Factory factory = new SpoonMetaFactory().buildNewFactory(project + "/src/main", 7);

            InputProgram inputProgram = new InputProgram();
            inputProgram.setFactory(factory);
            inputProgram.setSourceCodeDir(src);
            inputProgram.setPreviousTransformationsPath(prevTransfPath);
            inputProgram.processCodeFragments();

            //Verify we can find the sosies
            for (int i = 0; i < diverse.length(); i++) {
                JSONObject o = diverse.getJSONObject(i);
                JSONObject tp = o.getJSONObject("transplantationPoint");
                o.put("diffString", tp.get("position"));
                boolean putOK = correctPosition(tp, inputProgram);
                if (!putOK) Log.warn("Unable to find TP " + i);
                if (putOK && o.has("transplant")) {
                    JSONObject t = o.getJSONObject("transplant");
                    putOK = correctPosition(t, inputProgram);
                    if (!putOK) Log.warn("Unable to find transplant " + i);
                }
                o.put("tindex", i);
                if (putOK) toFileArr.put(o);
            }

            //TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
            //transf = parser.parseArray(diverse);
        }

        JSONObject toFile = new JSONObject();
        toFile.put("transformations", toFileArr);
        if ( differences != null ) toFile.put("differences", differences);
        FileWriter fw = new FileWriter(out);
        toFile.write(fw);
        fw.close();


        /*
        if (transf != null) {
            int totalShifted = 0;
            for (Transformation t : transf) {
                String s = ((ASTTransformation) t).getTransplantationPoint().positionString();
                if (!differences.containsKey(s)) {
                    //Log.warn("Attempting to write non-com sosie with position: " + s + " closest:" + findNearest(arr, s));
                    totalShifted++;
                }
                arr.putDataToJSON(t.toJSONObject());
            }
            Log.info("Sifted: " + totalShifted + "/" + arr.length());
            toFile.putDataToJSON("transformations", arr);
        } else {
            toFile.putDataToJSON("transformations", diverse);
        }


        //Put the differences:
//        JSONObject diffObj = new JSONObject();
        /*
        for ( Map.Entry<String, String> k : differences.entrySet() ) {
            diffObj.putDataToJSON(k.)
        }*/


        /*
        //Read and test
        JSONArray test = getArray(new File(out));
        inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.setSourceCodeDir(src);
        inputProgram.setPreviousTransformationsPath(prevTransfPath);
        inputProgram.processCodeFragments();

        parser = new TransformationJsonParser(false, inputProgram);
        transf = parser.parseArray(diverse);

        System.out.println("transf size" + transf.size());*/

    }

}
