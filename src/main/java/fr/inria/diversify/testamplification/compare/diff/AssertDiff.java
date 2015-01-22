package fr.inria.diversify.testamplification.compare.diff;

import fr.inria.diversify.testamplification.compare.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Simon on 19/01/15.
 */
public class AssertDiff {
    Assert original;
    Assert sosie;

    public AssertDiff(Assert original, Assert sosie) {
        this.original = original;
        this.sosie = sosie;
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

            if(!oValue.equals(sValue)) {
                JSONObject diff = new JSONObject();
                diffs.put(diff);
                diff.put("method", original.getMethods()[i]);
                diff.put("original", oValue);
                diff.put("sosie", sValue);
            }
        }

        return object;
    }

}
