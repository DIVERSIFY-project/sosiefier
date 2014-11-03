package fr.inria.diversify;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.sosie.SosiePoolCreator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.factory.Factory;

import java.io.*;

/**
 * A program to create a pool of sosies out of a directory of transformations
 * <p/>
 * Created by marodrig on 19/06/2014.
 */
public class FromISSTAToPoolCreatorInput {

    public static void main(String[] args) throws Exception {
        FromISSTAToPoolCreatorInput creator = new FromISSTAToPoolCreatorInput();
        //creator.init(args[0], args[1]);
        creator.init(
                "C:\\MarcelStuff\\projects\\DIVERSE\\programs\\single-sosies-pools\\common-lang-issta",
                "C:\\MarcelStuff\\projects\\DIVERSE\\programs\\single-sosies-pools\\common-lang-issta.json");


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
     * Creates a json file
     *
     * @param dir
     * @param out
     */
    public void init(String dir, String out) throws IOException, JSONException {

        JSONArray result = new JSONArray();
        File d = new File(dir);
        for (File f : d.listFiles()) {
            try {
                if (f.isDirectory()) {
                    JSONArray array = getArray(new File(f.getAbsolutePath() + "/trans.json"));
                    String position = getObject(new File(f.getAbsolutePath() + "/transplant.json")).getString("Position");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject t = array.getJSONObject(i);
                        if (t.getJSONObject("transplantationPoint").getString("position").equals(position)) {
                            result.put(t);
                        }
                    }
                }
            } catch (JSONException e) {
                System.out.println(f.getAbsoluteFile());
            }
        }

        FileWriter fw = new FileWriter(out);
        result.write(fw);
        fw.close();

    }

}
