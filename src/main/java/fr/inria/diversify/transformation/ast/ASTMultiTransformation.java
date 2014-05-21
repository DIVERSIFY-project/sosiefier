package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

/**
 * User: Simon
 * Date: 15/11/13
 * Time: 13:38
 */
public class ASTMultiTransformation extends AbstractTransformation {
    protected List<Transformation> transformations;

    public ASTMultiTransformation(List<Transformation> transformations) {
        name = "multi";
        type = "adrStmt";
        this.transformations = transformations;
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject object = super.toJSONObject();
        JSONArray array = new JSONArray();
        object.put("transformation",array);
        for (Transformation t : transformations)
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
    public String getLevel() {
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

    @Override
    public void addSourceCode() throws Exception {
        for(Transformation trans : transformations)
            trans.addSourceCode();
    }

    @Override
    public void printJavaFile(String srcDir) throws IOException {
        for(Transformation trans : transformations)
            trans.printJavaFile(srcDir);
    }

    @Override
    public void removeSourceCode() {
        for(Transformation trans : transformations)
            trans.removeSourceCode();
    }
}
