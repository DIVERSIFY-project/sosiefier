package fr.inria.diversify.transformation;

import fr.inria.diversify.diversification.InputProgram;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by Simon on 28/01/15.
 */
public interface Transformation {

    public void apply(String srcDir) throws Exception;
    public void applyWithParent(String srcDir) throws Exception;
    public void restore(String srcDir) throws Exception;
    public void setStatus(Integer status);
    public int getStatus();
    public void setFailures(List<String> f);
    public List<String> getFailures();
    public void setParent(Transformation t);
    public Transformation getParent();
    public String getType();
    public String getName();

    public InputProgram getInputProgram();
    public void setInputProgram(InputProgram inputProgram);
    public JSONObject toJSONObject() throws JSONException;

    public boolean isSosie();

    public int getIndex();

    public void setIndex(int index);
}
