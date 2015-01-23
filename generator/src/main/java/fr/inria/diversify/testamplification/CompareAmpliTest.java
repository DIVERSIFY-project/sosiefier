package fr.inria.diversify.testamplification;

import fr.inria.diversify.testamplification.compare.LogTestComparator;
import fr.inria.diversify.testamplification.compare.LogTestReader;
import fr.inria.diversify.testamplification.compare.Test;
import fr.inria.diversify.testamplification.compare.diff.LogDiff;
import fr.inria.diversify.testamplification.compare.diff.TestDiff;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Simon on 15/01/15.
 */
public class CompareAmpliTest {

    public static void main(String[] args) throws IOException, JSONException {
        Log.DEBUG();
        CompareAmpliTest cat = new CompareAmpliTest();

        List<TestDiff> diff = cat.compare(args[0], args[1]);
        cat.print(cat.toJson(diff, null), args[2]);
        cat.buildAndPrintFilter(diff, args[3]);
        Map<String, Set<String>> filter = cat.loadFilter(args[3]);
        cat.filter(diff, filter);
        cat.print(cat.toJson(diff, null),args[2]+".json");
    }

    public List<TestDiff> compare(String dirOriginalLog, String dirSosieLog) throws JSONException, IOException {
        LogTestReader reader = new LogTestReader();

        Collection<Test> testOriginal = reader.loadLog(dirOriginalLog);
        Collection<Test> testSosie = reader.loadLog(dirSosieLog);

        LogTestComparator comparator = new LogTestComparator(testOriginal, testSosie);

        return  comparator.compare();
    }

    public void filter(List<TestDiff> diff, Map<String, Set<String>> filter) {
        diff.stream()
                .forEach(d -> d.filter(filter.get(d.getSignature())));
    }

    public void print(JSONObject object, String fileName) throws IOException, JSONException {
        FileWriter fw = new FileWriter(fileName);
        object.write(fw);
        fw.close();
    }

    public JSONObject toJson(List<TestDiff> diffs, Transformation sosie) throws JSONException {
        JSONObject object = new JSONObject();

        if(sosie != null) {
            object.put("transformation", sosie.toJSONObject());
        }

        JSONArray array = new JSONArray();
        object.put("testDiff", array);
        for(TestDiff diff : diffs) {
            if(!diff.getDiff().isEmpty()) {
                array.put(diff.toJSON());
            }
        }

        return object;
    }

    public Map<String, Set<String>> loadFilter(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Map<String, Set<String>> filter = new HashMap<>();

        String line = reader.readLine();
        while(line != null) {
            String[] tmp = line.split(" ");
            if(!filter.containsKey(tmp[0])) {
                filter.put(tmp[0], new HashSet<>());
            }
            filter.get(tmp[0]).add(line.substring(tmp[0].length() + 1,line.length()));
            line = reader.readLine();
        }
        return filter;
    }

    public Set<String> buildFilter(List<TestDiff> diffs) {
        Set<String> filter = new HashSet<>();
        for(TestDiff d : diffs) {
            filter.addAll(d.buildFilter());
        }
        return filter;
    }

    public void buildAndPrintFilter(List<TestDiff> diffs, String fileName) throws IOException, JSONException {
        FileWriter fw = new FileWriter(fileName);
        for(String f : buildFilter(diffs)) {
            fw.append(f + "\n");
        }
        fw.close();
    }
}
