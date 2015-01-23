package fr.inria.diversify.testamplification.compare.diff;

import fr.inria.diversify.testamplification.compare.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Simon on 19/01/15.
 */
public class AssertDiff {
    Assert original;
    Assert sosie;
    Set<String> methodFilter;

    public AssertDiff(Assert original, Assert sosie) {
        this.original = original;
        this.sosie = sosie;
        methodFilter = new HashSet<>();
    }

    @Override
    public String toString() {
        return "original: " + original.toString() + "\nsosie: " + sosie;
    }


    public JSONObject toJson() throws JSONException {
        JSONObject object = new JSONObject();

        object.put("assertId", original.getAssertId());
        object.put("classId", original.getClassId());

        JSONArray diffs = new JSONArray();
        object.put("methodDiffs", diffs);
        for(int i = 0; i < original.getValues().length; i++) {
            Object oValue = original.getValues()[i];
            Object sValue = sosie.getValues()[i];

            if(!oValue.equals(sValue) && !methodFilter.contains(original.getMethods()[i])) {
                JSONObject diff = new JSONObject();
                diffs.put(diff);
                diff.put("method", original.getMethods()[i]);
                diff.put("original", oValue);
                diff.put("sosie", sValue);
            }
        }

        return object;
    }

    public void filter(String filter) {
        String[] mths = filter.split(";");

        for(String mth : mths) {
            methodFilter.add(mth);
        }
    }

    public String buildFilter() {
        String filter = getAssertId() + "";

        for (int i = 0; i < original.getValues().length; i++) {
            Object oValue = original.getValues()[i];
            Object sValue = sosie.getValues()[i];

            if (!oValue.equals(sValue)) {
                filter += ";" + original.getMethods()[i];
            }
        }
        return filter;
    }

    public int getAssertId(){
        return original.getAssertId();
    }

    public int nbOfDiff() {
        int count = 0;
        for (int i = 0; i < original.getValues().length; i++) {
            Object oValue = original.getValues()[i];
            Object sValue = sosie.getValues()[i];

            if (!oValue.equals(sValue) && !methodFilter.contains(original.getMethods()[i])) {
                count++;
            }
        }
        return count;
    }
}
