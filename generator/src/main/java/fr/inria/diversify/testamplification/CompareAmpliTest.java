package fr.inria.diversify.testamplification;

import fr.inria.diversify.testamplification.compare.LogTestComparator;
import fr.inria.diversify.testamplification.compare.LogTestReader;
import fr.inria.diversify.testamplification.compare.Test;
import fr.inria.diversify.testamplification.compare.diff.Diff;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.*;

/**
 * Created by Simon on 15/01/15.
 */
public class CompareAmpliTest {

    public static void main(String[] args) throws IOException, JSONException {
        Log.DEBUG();
        CompareAmpliTest cat = new CompareAmpliTest();

        Diff diff = cat.compare(args[0], args[1]);
        diff.setSosie(null);
        cat.print(diff.toJson(), args[2]);
        cat.buildAndPrintFilter(diff, args[3]);
        Map<String, Set<String>> filter = cat.loadFilter(args[3]);
        diff.filter(filter);
        cat.print(diff.toJson(),args[2]+".json");
    }

    public Diff compare(String dirOriginalLog, String dirSosieLog) throws JSONException, IOException {
        LogTestReader reader = new LogTestReader();

        Collection<Test> testOriginal = reader.loadLog(dirOriginalLog);
        Collection<Test> testSosie = reader.loadLog(dirSosieLog);

        LogTestComparator comparator = new LogTestComparator(testOriginal, testSosie);

        return  comparator.compare();
    }

    public void print(JSONObject object, String fileName) throws IOException, JSONException {
        FileWriter fw = new FileWriter(fileName);
        object.write(fw);
        fw.close();
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

    public void buildAndPrintFilter(Diff diffs, String fileName) throws IOException, JSONException {
        FileWriter fw = new FileWriter(fileName);
        for(String f : diffs.buildFilter()) {
            fw.append(f + "\n");
        }
        fw.close();
    }
}
