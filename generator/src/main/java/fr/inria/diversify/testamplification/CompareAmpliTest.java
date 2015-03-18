package fr.inria.diversify.testamplification;

import fr.inria.diversify.testamplification.compare.LogTestComparator;
import fr.inria.diversify.testamplification.compare.LogTestReader;
import fr.inria.diversify.testamplification.compare.Test;
import fr.inria.diversify.testamplification.compare.diff.Diff;
import fr.inria.diversify.testamplification.compare.diff.Filter;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.*;

/**
 * Created by Simon on 15/01/15.
 */
public class CompareAmpliTest {

    public Diff compare(String dirOriginalLog, String dirSosieLog) throws JSONException, IOException {
        LogTestReader reader = new LogTestReader();

        Collection<Test> testOriginal = reader.loadLog(dirOriginalLog);
        reader = new LogTestReader();
        Collection<Test> testSosie = reader.loadLog(dirSosieLog);

        LogTestComparator comparator = new LogTestComparator(testOriginal, testSosie);

        return  comparator.compare();
    }

    public void print(JSONObject object, String fileName) throws IOException, JSONException {
        FileWriter fw = new FileWriter(fileName);
        object.write(fw);
        fw.close();
    }

    public void buildAndPrintFilter(Diff diffs, String fileName) throws IOException, JSONException {
        FileWriter fw = new FileWriter(fileName);
        for(String f : diffs.buildFilter()) {
            fw.append(f + "\n");
        }
        fw.close();
    }

    public static void main(String[] args) throws IOException, JSONException {
        Log.DEBUG();
        CompareAmpliTest cat = new CompareAmpliTest();

        Diff diff = cat.compare(args[0], args[1]);
        diff.setSosie(null);
        cat.print(diff.toJson(), args[2]);
        cat.buildAndPrintFilter(diff, args[3]);
    }
}
