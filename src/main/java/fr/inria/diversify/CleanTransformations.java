package fr.inria.diversify;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.Properties;

/**
 * Clean repeated transformations taking into consideration the position and type of the TP and the transplantation
 * <p/>
 * <p/>
 * Created by marodrig on 25/07/2014.
 */
public class CleanTransformations {

    /**
     * Test if two transformations defined by their JSONObjects are equals
     *
     * @param a A transformation defined by a JSONObject
     * @param b Another transformation defined by a JSONObject
     * @return True if they are equals
     */
    private boolean different(JSONObject a, JSONObject b) throws JSONException {
        boolean result = a.get("position").equals(b.get("position")) &&
                a.get("sourceCode").equals(b.get("sourceCode")) &&
                a.get("type").equals(b.get("type"));

        return !result;
    }

    private void clean(String input, String output) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        JSONArray array = new JSONArray(sb.toString());

        JSONArray nonRepeated = new JSONArray();
        for (int i = 0; i < array.length(); i++) {
            boolean insert = true;

            JSONObject a = array.getJSONObject(i);
            JSONObject pa = a.getJSONObject("transplantationPoint");
            JSONObject ta = a.has("transplant") ? a.getJSONObject("transplant") : null;

            //Test that the Transplantation Point and the Transplantation are different
            if (ta == null || different(pa, ta)) {
                for (int j = 0; j < nonRepeated.length() && insert; j++) {
                    JSONObject b = nonRepeated.getJSONObject(j);
                    insert = different(
                            a.getJSONObject("transplantationPoint"),
                            b.getJSONObject("transplantationPoint"));

                    insert = insert || (a.has("transplant") != b.has("transplant"));

                    if (!insert && a.has("transplant")) {
                        insert = different(
                                a.getJSONObject("transplant"),
                                b.getJSONObject("transplant"));
                    }
                }
            }

            if (insert) {
                nonRepeated.put(array.get(i));
            }
        }

        System.out.println("Repeated length: " + array.length());
        System.out.println("Non repeated length: " + nonRepeated.length());

        FileWriter fw = new FileWriter(output);
        nonRepeated.write(fw);
        fw.close();
    }

    public static void main(String[] args) throws Exception {
/*
        Properties p = new Properties();
        p.load(new FileInputStream(args[0]));
        String path = p.getProperty("input");
        String outputPath = p.getProperty("output");
        CleanTransformations c = new CleanTransformations();
        c.clean(path, outputPath)
*/
        CleanTransformations c = new CleanTransformations();
        c.clean("C:\\MarcelStuff\\projects\\DIVERSE\\programs\\single-sosies-pools\\easymock3.2.json",
                "C:\\MarcelStuff\\projects\\DIVERSE\\programs\\single-sosies-pools\\easymock3.2-non-rep.json");
    }

}
