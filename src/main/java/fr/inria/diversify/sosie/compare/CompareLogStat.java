package fr.inria.diversify.sosie.compare;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * User: Simon
 * Date: 16/01/14
 * Time: 17:34
 */
public class CompareLogStat {

    public static void main(String[] args) {
        File resultDir = new File(args[0]);
        File resultSame = new File(args[1]);

    }


    public JSONObject loadJSONObject(File file) throws IOException, JSONException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }
        return new JSONObject(line);
    }
}
