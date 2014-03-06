package fr.inria.diversify.sosie.compare;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * User: Simon
 * Date: 03/03/14
 * Time: 15:05
 */
public class ExceptionDiff extends Diff {
    boolean isCatch;
    List<String> originalStackTrace;
    List<String> sosieStackTrace;

    public ExceptionDiff(String className, String methodSignature, boolean isCatch, List<String> originalStackTrace, List<String> sosieStackTrace) {
        this.className = className;
        this.methodSignature = methodSignature;
        this.isCatch = isCatch;
        this.originalStackTrace = originalStackTrace;
        this.sosieStackTrace =sosieStackTrace;
    }

    public ExceptionDiff(String line) {
        String[] tmp = line.split(":");
        this.className = tmp[1];
        this.methodSignature = tmp[2];
        if(tmp[3].equals("true"))
            isCatch = true;
        else
            isCatch = false;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", "exception");
        object.put("class", className);
        object.put("method", methodSignature);
        object.put("isCatch", isCatch);
        object.put("originalStackTrace", originalStackTrace);
        object.put("sosieStackTrace", sosieStackTrace);

        return object;
    }

    public String toString() {
        return "E:"+className+":"+methodSignature+":"+isCatch;
    }
}
