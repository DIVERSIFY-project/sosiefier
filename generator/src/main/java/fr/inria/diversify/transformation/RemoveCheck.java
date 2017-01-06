package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import fr.inria.diversify.util.RandomLiteralFactory;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;

import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nharrand on 19/12/16.
 */
public class RemoveCheck extends SingleTransformation  {

    CtIf tp;
    CtIf save;
    CtIf insert;
    CtInvocation invocation;
    String pattern;

    public RemoveCheck(CtIf tp, CtInvocation invocation, String pattern) {
        this.tp = tp;
        save = tp.getFactory().Core().clone(tp);
        insert = tp.getFactory().Core().clone(tp);
        //insert.setCondition(tp.getFactory().Code().createLiteral(true));
        insert.setCondition(tp.getFactory().Code().createLiteral(false));
        this.invocation = invocation;
        this.pattern = pattern;
    }

    @Override
    public String classLocationName() {
        return getPosition().getCompilationUnit().getMainType().getQualifiedName();
    }

    @Override
    public String packageLocationName() {
        CtPackage p = tp.getParent(CtPackage.class);
        return p.getQualifiedName();
    }

    @Override
    public String methodLocationName() {
        return "unknown";
    }

    @Override
    public SourcePosition getPosition() {
        return tp.getPosition();
    }

    @Override
    public String getTransformationString() throws Exception {
        return null;
    }

    @Override
    public int line() {
        return getPosition().getLine();
    }

    @Override
    public void apply(String srcDir) throws Exception {

        System.out.println("old stmt: " + tp.toString());
        tp.replace(insert);
        System.out.println("newt stmt: " + insert.toString());
        printJavaFile(srcDir);
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {
        try {
            tp.replace(save);
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new RestoreTransformationException("", e);
        }
    }


    @Override
    public JSONObject toJSONObject() throws JSONException {

        JSONObject object = super.toJSONObject();

        JSONObject insertJSON = new JSONObject();
        insertJSON.put("stmt", insert.toString());
        insertJSON.put("pattern", pattern);
        object.put("insert", insertJSON);

        JSONObject tpJSON = new JSONObject();
        tpJSON.put("position", tp.getParent(CtType.class).getQualifiedName() + ":" + tp.getPosition().getLine());
        tpJSON.put("sourcecode", save.toString());
        object.put("transplantationPoint", tpJSON);

        return object;
    }
}
