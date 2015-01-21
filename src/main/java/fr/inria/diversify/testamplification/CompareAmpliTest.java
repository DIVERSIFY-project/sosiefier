package fr.inria.diversify.testamplification;

import fr.inria.diversify.testamplification.compare.LogTestComparator;
import fr.inria.diversify.testamplification.compare.LogTestReader;
import fr.inria.diversify.testamplification.compare.Test;
import fr.inria.diversify.testamplification.compare.diff.TestDiff;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * Created by Simon on 15/01/15.
 */
public class CompareAmpliTest {

    public static void main(String[] args) throws IOException, JSONException {
        Log.DEBUG();
        CompareAmpliTest cat = new CompareAmpliTest();

        List<TestDiff> diff = cat.compare(args[0], args[1]);
        cat.print(cat.toJson(diff, null), args[2]);
    }

    public List<TestDiff> compare(String dirOriginalLog, String dirSosieLog) throws JSONException, IOException {
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

    public JSONObject toJson(List<TestDiff> diffs, Transformation sosie) throws JSONException {
        JSONObject object = new JSONObject();

        object.put("transformation","");

        JSONArray array = new JSONArray();
        object.put("testDiff", array);
        for(TestDiff diff : diffs) {
            if(!diff.getDiff().isEmpty()) {
                array.put(diff.toJSON());
            }
        }

        return object;
    }
}
