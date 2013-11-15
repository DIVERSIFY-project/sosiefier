package fr.inria.diversify.transformation;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * User: Simon
 * Date: 07/11/13
 * Time: 11:16
 */
public interface ITransformation {

    public void apply(String srcDir) throws Exception;
    public void restore(String srcDir) throws Exception;
    public void setJUnitResult(Integer result);
    public int numberOfFailure();
    public String getType();
    public void write(StringBuffer sb, char separator);
    public void writeHead(BufferedWriter sb, char separator) throws IOException;
    public JSONObject toJSONObject() throws JSONException;
}
