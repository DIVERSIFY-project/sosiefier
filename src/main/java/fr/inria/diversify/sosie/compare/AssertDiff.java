package fr.inria.diversify.sosie.compare;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * User: Simon
 * Date: 03/03/14
 * Time: 16:38
 */
public class AssertDiff extends Diff {
    List<String> sosieAssert;
    List<String> originalAssert;
    String assertType;

    public AssertDiff(String className, String methodSignature, String assertType, List<String> originalAssert, List<String> sosieAssert) {
        this.className = className;
        this.methodSignature = methodSignature;
        this.assertType = assertType;
        this.originalAssert = originalAssert;
        this.sosieAssert =sosieAssert;
    }

    public AssertDiff(String line) {
        String[] tmp = line.split(":");
        this.className = tmp[1];
        this.methodSignature = tmp[2];
        this.assertType = tmp[3];
    }

    public String toString() {
        return "A:"+className+":"+methodSignature+":"+assertType;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", "assert");
        object.put("class", className);
        object.put("method", methodSignature);
        object.put("assert", assertType);
        object.put("originalAssert", originalAssert);
        object.put("sosieAssert", sosieAssert);

        return object;
    }
}
