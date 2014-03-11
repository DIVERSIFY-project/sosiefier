package fr.inria.diversify.sosie.compare;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * User: Simon
 * Date: 10/16/13
 * Time: 4:20 PM
 */
public class VariableDiff extends Diff {
    protected String originalValue;
    protected String sosieValue;
    protected String name;


    public VariableDiff(String className, String methodSignature, String name, String originalValue, String sosieValue) {
        this.sosieClassName = className;
        this.sosieMethodSignature =methodSignature;
        this.name = name;
        this.originalValue = originalValue;
        this.sosieValue = sosieValue;
    }

    public VariableDiff(String var) {
        String[] tmp = var.split(":");
        this.sosieClassName = tmp[0];
        this.sosieMethodSignature = tmp[1];
        this.name = tmp[2];
    }

    public String getVarName() {
        return name;
    }


    public String toDot() {
        return name+":("+originalValue+" / "+sosieValue+")";
    }

    public String forFile() {
        return  sosieClassName +":"+ sosieMethodSignature +":"+name;
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("class", sosieClassName);
        object.put("method", sosieMethodSignature);
        object.put("name", name);
        object.put("originalValue", originalValue);
        object.put("sosieValue", sosieValue);

        return object;
    }
}
