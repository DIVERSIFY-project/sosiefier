package fr.inria.diversify;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.persistence.json.input.JsonSosiesInput;
import fr.inria.diversify.persistence.json.output.*;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * Class to turn ISSTA JSON sosies into the Brand new TestEye format
 *
 * Created by marodrig on 11/02/2015.
 */
public class FromISSTAToTestEyeFormat {


    //private static final String CONF_PATH = "C:\\MarcelStuff\\data\\DIVERSE\\input_configurations\\IsstaToTestEye-CommonColl.properties";
    private static final String CONF_PATH = "C:\\MarcelStuff\\data\\DIVERSE\\input_configurations\\IsstaToTestEye-CommonColl.properties";

    public static void main(String[] args) throws Exception {
        Log.NONE();


        InputConfiguration inputConfiguration = new InputConfiguration(CONF_PATH);
/*
        JSONObject result = new JSONObject();
        JsonHeaderOutput output = new JsonHeaderOutput(inputConfiguration.getProjectPath() + "/pom.xml", "1.0.0");
        output.write(result);
        JsonFailuresOutput failuresOutput = new JsonFailuresOutput();
        failuresOutput.setTransformations(new ArrayList<>());
        failuresOutput.write(result);
        JSONArray transformations = new JSONArray();
        result.put(JsonSectionOutput.TRANSFORMATIONS, transformations);

        int globalIndex = 0;
        for ( File f : new File(inputConfiguration.getPreviousTransformationPath()).listFiles() ) {
            JSONArray a = getArray(f);
            for ( int i = 0;  i < a.length() - 2; i ++) {
                try {
                    JSONObject tObj = a.getJSONObject(i);
                    globalIndex++;
                    if ( tObj.has(JsonSectionOutput.TINDEX) ) tObj.put(JsonSectionOutput.TINDEX, globalIndex);
                    if ( tObj.has("variableMapping") ) {
                        tObj.put(JsonSectionOutput.VARIABLE_MAP, tObj.get("variableMapping"));
                        tObj.remove("variableMapping");
                    }
                    if ( tObj.has(JsonSectionOutput.TRANSPLANT) ) {
                        correctSource(tObj.getJSONObject(JsonSectionOutput.TRANSPLANT));
                    }
                    if ( tObj.has(JsonSectionOutput.TRANSPLANT_POINT) ) {
                        correctSource(tObj.getJSONObject(JsonSectionOutput.TRANSPLANT_POINT));
                    }
                    if (tObj.has(JsonSectionOutput.STATUS) && tObj.getInt(JsonSectionOutput.STATUS) == 0) {
                        transformations.put(tObj);
                    }
                } catch (JSONException e) {
                    System.out.println("FUUUUUUUCCCKKKKK!!!!!!!");
                }
            }
        }

        FileWriter fw = new FileWriter(inputConfiguration.getResultPath());
        result.write(fw);
        fw.close();
*/
        MavenDependencyResolver dr = new MavenDependencyResolver();
        dr.DependencyResolver(inputConfiguration.getProjectPath() + "\\pom.xml");

        InputProgram p = new InputProgram();
        p.configure(inputConfiguration);

        long t = System.currentTimeMillis();
        p.setFactory(new SpoonMetaFactory().buildNewFactory(inputConfiguration.getSourceCodeDir(), 7));
        System.out.println("Build: " + Math.abs(System.currentTimeMillis() - t));

        t = System.currentTimeMillis();
        p.processCodeFragments();
        System.out.println("Process code fragment Time: " + Math.abs(System.currentTimeMillis() - t));

        t = System.currentTimeMillis();
        JsonSosiesInput input = new JsonSosiesInput(inputConfiguration.getResultPath(), p);
        Collection<Transformation> r = input.read();
        System.out.println("Read Time: " + Math.abs(System.currentTimeMillis() - t));
        /*
        for ( String s : input.getLoadMessages() ) {
            System.out.println(s);
        }*/

        JsonSosiesOutput sosiesOutput = new JsonSosiesOutput(r, inputConfiguration.getResultPath() + ".corrected.json",
                inputConfiguration.getProjectPath() + "/pom.xml", InputConfiguration.LATEST_GENERATOR_VERSION);
        sosiesOutput.write();
    }

    private static void correctSource(JSONObject o) throws JSONException {
        if ( o.has("sourceCode") ) {
            o.put(JsonSectionOutput.SOURCE_CODE, o.getString("sourceCode"));
        }
    }

    /**
     * Get the array from the json
     * @param input A file with a JSON Array inside
     * @return
     * @throws IOException
     * @throws JSONException
     */
    private static JSONArray getArray(File input) throws IOException, JSONException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return new JSONArray(sb.toString());
    }
}
