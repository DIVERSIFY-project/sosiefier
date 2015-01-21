package fr.inria.diversify.testamplification.compare.diff;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon on 19/01/15.
 */
public class TestDiff {
    List<LogDiff> diff;
    String signature;

    public TestDiff(String signature) {
        this.signature = signature;
        diff = new ArrayList<>();
    }

    public void add(LogDiff logResult) {
        if(logResult != null) {
            diff.add(logResult);
        }
    }

    public List<LogDiff> getDiff() {
        return diff;
    }

    public String getSignature() {
        return signature;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();

        object.put("test", signature);
        JSONArray array = new JSONArray();
        object.put("logDiff", array);

        for(LogDiff d : diff) {
            array.put(d.toJson());
        }

        return object;
    }


}
