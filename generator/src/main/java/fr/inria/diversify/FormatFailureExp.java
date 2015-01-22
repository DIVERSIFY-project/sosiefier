package fr.inria.diversify;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;

/**
 * User: Simon
 * Date: 06/03/14
 * Time: 16:03
 */
public class FormatFailureExp {

    public static void main(String[] args) throws IOException, JSONException {
        FormatFailureExp f = new FormatFailureExp();
        f.format(args[0],args[1]);

    }

    public void format(String dir, String cvsFileName) throws IOException, JSONException {
        File file = new File(dir);
        File out = new File(cvsFileName);
        FileWriter fw = new FileWriter(out);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("total;assert;exceptionSamePosition;exceptionDiffPosition\n");
        for (File f : file.listFiles())  {
            addToCvsFile(readFile(f), bw);
        }
        bw.close();
        fw.close();
    }

    protected JSONArray readFile(File file) throws IOException, JSONException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }
        return new JSONArray(sb.toString());
    }


    protected void addToCvsFile(JSONArray array, BufferedWriter bw) throws JSONException, IOException {
        int exceptionSPCount = 0;
        int exceptionDPCount = 0;
        int assertCount = 0;
        for (int i = 0; i < array.length(); i++) {
            JSONObject diff = array.getJSONObject(i);
            if(diff.has("startingPoint")) {
            if(diff.getString("type").equals("assert"))
                assertCount++;
            else {
                if(diff.has("sosieStackTrace"))
                    exceptionSPCount++;
                else
                    exceptionDPCount++;
            }
            }
        }
        bw.write(array.length() + ";" + assertCount + ";" + exceptionSPCount + ";" +exceptionDPCount+"\n");
    }
}
