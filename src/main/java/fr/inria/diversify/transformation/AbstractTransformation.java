package fr.inria.diversify.transformation;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * User: Simon
 * Date: 12/02/14
 * Time: 10:44
 */
public abstract class AbstractTransformation implements Transformation {
    protected Integer status = -3;
    protected List<String> failures;
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

    public boolean isCompile() {
        return status > -1;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void init(JSONObject jsonObject) throws JSONException {
        type = jsonObject.getString("type");
        name = jsonObject.getString("name");

    }

    public void setParent(Transformation parent) {
        this.parent = parent;
    }
    public Transformation getParent() {
        return parent;
    }

}
