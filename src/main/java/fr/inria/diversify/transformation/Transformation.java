package fr.inria.diversify.transformation;

import fr.inria.diversify.diversification.InputProgram;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

/**
 * User: Simon
 * Date: 07/11/13
 * Time: 11:16
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
    public String getLevel();
    public InputProgram getInputProgram();
    public void setInputProgram(InputProgram inputProgram);
    public JSONObject toJSONObject() throws JSONException;

    public String classLocationName();
    public String packageLocationName();
    public String methodLocationName();
    public String stmtType();

    //public default String getTransformationString() throws Exception {return "";}
    public String getTransformationString() throws Exception;

    public int line();

    void printJavaFile(String srcDir) throws IOException;

    public boolean isSosie();

    public int getIndex();

    public void setIndex(int index);

}
