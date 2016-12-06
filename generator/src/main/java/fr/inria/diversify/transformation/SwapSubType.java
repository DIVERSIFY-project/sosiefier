package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;

/**
 * Created by nharrand on 06/12/16.
 */
public class SwapSubType extends SingleTransformation {

    CtAssignment newAssignment;
    CtAssignment tp;
    CtAssignment save;

    public SwapSubType(CtAssignment tp, CtAssignment newAssignment) {
        this.tp = tp;
        type = "replace";
        name = "swapSubType";
        Factory factory = tp.getFactory();
        save = factory.Core().clone(tp);

        this.newAssignment = newAssignment;
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
        tp.replace((CtStatement) newAssignment);

        System.out.println("newt stmt: " + newAssignment.toString());
        printJavaFile(srcDir);
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {
        try {
            tp.replace((CtStatement) save);
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new RestoreTransformationException("", e);
        }
    }


    @Override
    public JSONObject toJSONObject() throws JSONException {

        JSONObject object = super.toJSONObject();
        object.put("newAssignement", newAssignment.toString());
        JSONObject tpJSON = new JSONObject();
        tpJSON.put("position", tp.getParent(CtType.class).getQualifiedName() + ":" + tp.getPosition().getLine());
        tpJSON.put("type", tp.getClass().getName());
        tpJSON.put("sourcecode", tp.toString());
        object.put("transplantationPoint",tpJSON);
        return object;
    }
}

