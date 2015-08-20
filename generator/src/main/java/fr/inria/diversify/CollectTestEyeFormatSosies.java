package fr.inria.diversify;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Collects a series of JSON files containing transformations into a big file only with sosies
 *
 * Created by marodrig on 19/08/2015.
 */
public class CollectTestEyeFormatSosies {


    public static void main(String[] args) throws Exception {
        File dir = new File("C:\\MarcelStuff\\DATA\\DIVERSE\\sosies-pools\\sosie-exp-master\\compare\\gson");

        JSONArray transf = new JSONArray();
        JSONObject main = null;
        for ( File f : dir.listFiles() ) {
            if ( f.getName().endsWith(".json") ) {
                String fs = readFile(f.getAbsolutePath(), Charset.defaultCharset());
                main = new JSONObject(fs);
                JSONArray a = main.getJSONArray("transformations");
                for ( int i = 0; i <  a.length(); i++ ) {
                    JSONObject jo = a.getJSONObject(i);
                    if ( jo.getInt("status") >= 0 ) {
                        transf.put(jo);
                    }
                }
            }
        }
        JSONObject result = new JSONObject();
        if ( main != null ) {
            result.put("transformations", transf);
            result.put("header", main.getJSONObject("header"));
            result.put("failureDictionary", main.getJSONObject("failureDictionary"));
        }
        FileWriter file = new FileWriter("C:\\MarcelStuff\\DATA\\DIVERSE\\sosies-pools\\gson-all-19082015.json");
        file.write(result.toString());
        file.flush();
        file.close();

        //result.write(new FileWriter(new File()));
    }

    private static String readFile(String path, Charset encoding)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

}
