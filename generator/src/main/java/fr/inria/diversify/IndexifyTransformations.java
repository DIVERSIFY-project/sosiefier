package fr.inria.diversify;

import fr.inria.diversify.testMutation.*;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.Properties;

/**
 * Load all transformations and assigns an index to them.
 * <p/>
 * Created by marodrig on 25/07/2014.
 */
@Deprecated
public class IndexifyTransformations {

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\MarcelStuff\\projects\\DIVERSE\\programs\\single-sosies-pools\\easymock3.2-non-rep.json"));
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        JSONArray array = new JSONArray(sb.toString());
        for (int i = 0; i < array.length(); i++) {
            JSONObject obj = array.getJSONObject(i);
            if ( !obj.has("tindex") ) {
                array.getJSONObject(i).put("tindex", i);
            }
        }
        FileWriter fw = new FileWriter("C:\\MarcelStuff\\projects\\DIVERSE\\programs\\single-sosies-pools\\easymock3.2-non-rep-index.json");
        array.write(fw);
        fw.close();
    }

}
