package fr.inria.diversify.transformation;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Set;

/**
 * User: Simon
 * Date: 07/11/13
 * Time: 11:16
 */
public interface Transformation {

    public void apply(String srcDir) throws Exception;
    public void restore(String srcDir) throws Exception;
    public void setStatus(Integer status);
    public int getStatus();
    public void setFailures(Set<String> f);
    public Set<String> getFailures();

    public String getType();
    public JSONObject toJSONObject() throws JSONException;

    public String classLocationName();
    public String packageLocationName();
    public String methodLocationName();
    public String level();
    public String stmtType();

    public boolean isCompile();

    public int line();
}
