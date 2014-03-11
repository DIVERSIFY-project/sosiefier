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
    boolean sosieIsCatch;
    boolean originalIsCatch;
    List<String> originalStackTrace;
    List<String> sosieStackTrace;

    //same position
    public ExceptionDiff(String className, String methodSignature, boolean isCatch, List<String> originalStackTrace, List<String> sosieStackTrace) {
        this.originalClassName = className;
        this.originalMethodSignature = methodSignature;
        this.originalIsCatch = isCatch;
        this.originalStackTrace = originalStackTrace;
        this.sosieStackTrace =sosieStackTrace;
    }

    //different position
    public ExceptionDiff(String originalClassName, String originalMethodSignature, boolean originalIsCatch,
                         String sosieClassName, String sosieMethodSignature, boolean sosieIsCatch) {
        this.originalClassName = originalClassName;
        this.originalMethodSignature = originalMethodSignature;
        this.originalIsCatch = originalIsCatch;
        this.sosieClassName = sosieClassName;
        this.sosieMethodSignature = sosieMethodSignature;
        this.sosieIsCatch = sosieIsCatch;
    }

    public ExceptionDiff(String line) {
        String[] tmp = line.split(":");
        this.originalClassName = tmp[1];
        this.originalMethodSignature = tmp[2];
        if(tmp[3].equals("true"))
            originalIsCatch = true;
        else
            originalIsCatch = false;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", "exception");
        object.put("originalClass", originalClassName);
        object.put("originalMethod", originalMethodSignature);
        object.put("originalIsCatch", originalIsCatch);

        if(originalStackTrace != null) {
            object.put("originalStackTrace", originalStackTrace);
            object.put("sosieStackTrace", sosieStackTrace);
        } else {
            object.put("sosieClass", sosieClassName);
            object.put("sosieMethod", sosieMethodSignature);
            object.put("sosieIsCatch", sosieIsCatch);
        }

        return object;
    }

    public String toString() {
        return "E:"+ sosieClassName +":"+ sosieMethodSignature +":"+originalIsCatch;
    }
}
