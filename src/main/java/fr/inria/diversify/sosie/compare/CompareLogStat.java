package fr.inria.diversify.sosie.compare;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 16/01/14
 * Time: 17:34
 */
public class CompareLogStat {

    public static void main(String[] args) throws IOException, JSONException {
        File resultDir = new File(args[0]);
        File resultSame = new File(args[1]);

        CompareLogStat cls = new CompareLogStat();
        cls.writeResult(cls.loadObjects(resultDir), cls.loadObjects(resultSame), "exp/result.csv");

    }

    public void writeResult(List<JSONObject> diffS,List<JSONObject> diffO, String fileName) throws JSONException, IOException {
        List<String> callExclude = callSequenceToExclude(diffO);
        List<String> varExclude = varSequenceToExclude(diffO);
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("diffVar;diffUniqueVar;diffVarPoint;varSequenceDiff;callSequenceDiff\n");
        for(JSONObject object : diffS) {
            bw.write(object.getInt("diffVar")+";");
            bw.write(object.getInt("diffUniqueVar")+";");
            bw.write(object.getInt("diffVarPoint")+";");

            List<String> list = toStringList(object.optJSONArray("varSequenceDiff"));
            list.removeAll(varExclude);
            bw.write(list.size()+";");

            list = toStringList(object.optJSONArray("callSequenceDiff"));
            list.removeAll(callExclude);
            bw.write(list.size()+"\n");
        }
        bw.close();
        fw.close();
    }

    protected JSONObject loadJSONObject(File file) throws IOException, JSONException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }
        return new JSONObject(sb.toString());
    }

    protected List<JSONObject> loadObjects(File directory) throws IOException, JSONException {
        List<JSONObject> list = new ArrayList<JSONObject>();
        for(File file : directory.listFiles())
            if(file.getName().endsWith(".json"))
                try {
                    list.add(loadJSONObject(file));
                } catch (Exception e) {
                  e.printStackTrace();
                }


        return list;
    }

    protected List<String> callSequenceToExclude(List<JSONObject> objects) throws JSONException {
        List<String> list = new ArrayList<String>();
        for(JSONObject object : objects) {
            JSONArray array = object.getJSONArray("callSequenceDiff");
            list.addAll(toStringList(array));
        }
        return list;
    }

    protected List<String> varSequenceToExclude(List<JSONObject> objects) throws JSONException {
        List<String> list = new ArrayList<String>();
        for(JSONObject object : objects) {
            JSONArray array = object.getJSONArray("varSequenceDiff");
            list.addAll(toStringList(array));
        }
        return list;
    }

    protected List<String> toStringList(JSONArray array) throws JSONException {
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < array.length(); i++) {
            list.add(array.getString(i));
        }
        return list;
    }
}
