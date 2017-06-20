package fr.inria.diversify.persistence.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * Created by nharrand on 15/05/17.
 */
public class FormatUpdater {
    public static void main (String ... args) {
        if(args.length < 3) {
            System.err.println("3 args are required, dirIn, dirOut, ProjectName.");
            return;
        }
        File dirIn = new File(args[0]);
        File dirOut = new File(args[1]);

        if(!dirOut.isDirectory()) {
            System.err.println("dirOut must be directories.");
            return;
        }

        String project = args[2];

        try {
            if(!dirIn.isDirectory()) doFile(dirIn, new File(dirOut, dirIn.getName()), project);
        } catch (JSONException e) {
            System.err.println("Error occured processing " + dirIn.getPath());
        }

        for(File f : dirIn.listFiles()) {
            if(f.isFile() && f.getName().endsWith(".json")) {
                File out = new File(dirOut, f.getName());
                try {
                    doFile(f, out, project);
                } catch (JSONException e) {
                    System.err.println("Error occured processing " + f.getPath());
                }
            }
        }
    }

    public static void doFile(File in, File out, String project) throws JSONException {
        String inStr = readFile(in);
        JSONArray ar = new JSONArray(inStr);
        JSONObject header = new JSONObject();
        JSONObject root = new JSONObject();
        JSONArray transformations = new JSONArray();
        JSONObject failureDictionary = new JSONObject();
        for(int i = 0; i < ar.length(); i++) {
            JSONObject cur = ar.getJSONObject(i);
            if(cur.has("tindex") && cur.has("type")) {
                transformations.put(cur);
            } else if (cur.has("failureDictionary")) {
                failureDictionary = cur;
            }

        }
        header.put("groupId", project);
        header.put("transformationCount", transformations.length());
        header.put("projectType", "maven");
        header.put("artifactId", project);
        header.put("generatorVersion", "1.0");


        root.put("header", header);
        root.put("failureDictionary", failureDictionary);
        root.put("transformations", transformations);
        writeFile(root, out);
    }

    public static String readFile(File in) {
        String result = null;
        try {
            InputStream input = new FileInputStream(in);
            if (input != null) {
                result = org.apache.commons.io.IOUtils.toString(input);
                input.close();
            } else {
                System.out.println("[Error] File not found: " + in.getPath());
            }
        } catch (Exception e) {
            //e.printStackTrace();
            return null; // the template was not found
        }
        return result;
    }

    public static void writeFile(JSONObject obj, File f) {
        try {
            PrintWriter w = new PrintWriter(f);
            w.print(obj.toString());
            w.close();
        } catch (Exception ex) {
            System.err.println("Problem writing " + f.getPath());
            ex.printStackTrace();
        }
    }
}
