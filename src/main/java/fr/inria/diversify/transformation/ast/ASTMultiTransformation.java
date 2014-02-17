package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.transformation.AbstractTransformation;
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
public class ASTMultiTransformation extends AbstractTransformation {
    protected List<ASTTransformation> transformations;

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

    @Override
    public String getType() {
        return "ASTMulti";
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
    public String level() {
        return "multi";
    }

    @Override
    public String stmtType() {
        return "multi";
    }

    @Override
    public int line() {
        return 0;
    }
}
