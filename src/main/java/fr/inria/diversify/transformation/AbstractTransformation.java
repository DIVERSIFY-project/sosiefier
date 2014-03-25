package fr.inria.diversify.transformation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 12/02/14
 * Time: 10:44
 */
public abstract class AbstractTransformation implements Transformation {
    protected Integer status = -3;
    protected List<String> failures;
    protected static Map<String,Integer> failuresDico = new HashMap<String, Integer>();
    protected String name;
    protected String type;
    protected Transformation parent;

    public void setStatus(Integer result) {
        status = result;
    }

    public int getStatus() {
        return status;
    }

    public void setFailures(List<String> f) {
        failures = f;
    }
    public List<String> getFailures() {
        return failures;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", type);
        object.put("name", name);
        object.put("failures", failuresToJSON());
        object.put("status", status);

        if(parent != null)
            object.put("parent",parent.toJSONObject());

        return object;
    }

    private static int id = 0;
    protected JSONArray failuresToJSON() {

        JSONArray array = new JSONArray();
        if(failures == null) {
            return array;
        }
        for(String failure : failures) {
            if(!failuresDico.containsKey(failure)) {
                failuresDico.put(failure,id);
                id++;
            }
            array.put(failuresDico.get(failure));
        }
        return array;
    }

    public  int hashCode() {
        return name.hashCode() * type.hashCode() + status.hashCode() + failures.hashCode();
    }

    public void setParent(Transformation parent) {
        this.parent = parent;
    }
    public Transformation getParent() {
        return parent;
    }

    public void apply(String srcDir) throws Exception {
        addSourceCode();

        printJavaFile(srcDir);
        removeSourceCode();
    }

    public void applyWithParent(String srcDir) throws Exception { throw new Exception("not implemented");};

    protected boolean equalParent(Transformation otherParent) {
        if(parent != null)
            return parent.equals(otherParent);
        if(otherParent != null)
            return otherParent.equals(parent);

        return true;
    }
}
