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
    String originalAssertType;
    String sosieAssertType;

    //same position
    public AssertDiff(String className, String methodSignature, String assertType, List<String> originalAssert, List<String> sosieAssert) {
        this.originalClassName = className;
        this.originalMethodSignature = methodSignature;
        this.originalAssertType = assertType;
        this.originalAssert = originalAssert;
        this.sosieAssert =sosieAssert;
    }

    //different position
    public AssertDiff(String originalClassName, String originalMethodSignature, String originalAssertType,
                         String sosieClassName, String sosieMethodSignature, String sosieAssertType) {
        this.originalClassName = originalClassName;
        this.originalMethodSignature = originalMethodSignature;
        this.originalAssertType = originalAssertType;
        this.sosieClassName = sosieClassName;
        this.sosieMethodSignature = sosieMethodSignature;
        this.sosieAssertType = sosieAssertType;
    }

    public AssertDiff(String line) {
        String[] tmp = line.split(":");
        this.originalClassName = tmp[1];
        this.originalMethodSignature = tmp[2];
        this.originalAssertType = tmp[3];
    }

    public String toString() {
        return "A:"+ testName+ ":" + originalClassName +":"+ originalMethodSignature +":"+originalAssertType;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", "assert");
        object.put("originalClass", originalClassName);
        object.put("originalMethod", originalMethodSignature);
        object.put("originalAssertType", originalAssertType);

        if(originalAssert != null) {
            object.put("originalAssert", originalAssert);
            object.put("sosieAssert", sosieAssert);
        } else {
            object.put("sosieClass", sosieClassName);
            object.put("sosieMethod", sosieMethodSignature);
            object.put("sosieAssertType",sosieAssertType);
        }

        return object;
    }
}
