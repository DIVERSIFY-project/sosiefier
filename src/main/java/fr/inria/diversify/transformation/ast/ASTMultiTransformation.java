package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.transformation.Transformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 15/11/13
 * Time: 13:38
 */
public class ASTMultiTransformation implements Transformation {
    protected Integer failures;
    protected List<ASTTransformation> transformations;
    protected boolean compile;

    public ASTMultiTransformation() {
        transformations = new ArrayList<ASTTransformation>();
    }

    @Override
    public void apply(String srcDir) throws Exception {
        for(ASTTransformation trans : transformations)
            trans.addSourceCode();

        for(ASTTransformation trans : transformations) {
            trans.printJavaFile(srcDir);
        }

        for(ASTTransformation trans : transformations)
            trans.removeSourceCode();
    }

    @Override
    public void restore(String srcDir) throws Exception {
        for(ASTTransformation trans : transformations)
            trans.restore(srcDir);
    }

    public void setJUnitResult(Integer result) {
        failures = result;
    }

    public int numberOfFailure() {
        return failures;
    }


    @Override
    public String getType() {
        return "ASTMulti";
    }

    @Override
    public void write(StringBuffer sb, char separator) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void writeHead(BufferedWriter sb, char separator) throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("type", getType());
        JSONArray array = new JSONArray();
        object.put("transformation",array);
        for (ASTTransformation t : transformations)
            array.put(t.toJSONObject());
        return object;
    }

    @Override
    public long classSize() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int nbMethodInClassLocation() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String classReplaceOrAddPositionName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String classLocationName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String packageLocationName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String methodLocationName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getCompile() {
        return compile;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void addTransformation(ASTTransformation transformation) {
        transformations.add(transformation);
    }
    public void setCompile(boolean b){
        compile = b;
    }
}
