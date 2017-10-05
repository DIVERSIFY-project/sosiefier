package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import fr.inria.diversify.util.PrimitiveUtil;
import fr.inria.diversify.util.RandomLiteralFactory;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;

/**
 * Created by nharrand on 08/08/17.
 */
public class RemoveInvocation extends SingleTransformation {

    boolean verbose = true;

    CtInvocation tp;
    CtInvocation save;
    CtStatement rep;
    CtExpression defaultValue = null;
    SourcePosition position;

    public RemoveInvocation(CtInvocation tp) {
        this.type = "del";
        this.name = "removeInvocation";
        setTp(tp);
    }

    public RemoveInvocation() {
        this.type = "del";
        this.name = "removeInvocation";
    }

    public void setTp(CtInvocation tp) {
        this.tp = tp;
        position = tp.getPosition();
        Factory f = tp.getFactory();
        save = f.Core().clone(tp);
        if(!(tp.getParent() instanceof CtBlock)) {
            defaultValue = RandomLiteralFactory.defaultValue(tp.getType());
        } else {
            rep = f.Code().createCodeSnippetStatement("");
        }
        if(verbose) {
            System.out.println("del: " + tp);
            System.out.println("in: " + tp.getParent());
            if(defaultValue != null) System.out.println("replace with: (" + defaultValue.getType().getSimpleName() + ") " + defaultValue);
        }

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
        return position;
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
        try {
            if (defaultValue != null) tp.replace(defaultValue);// replace with try catch finally
            else tp.replace(rep);
        } catch (java.lang.ClassCastException c) {
            defaultValue = null;
            rep = save.getFactory().Code().createCodeSnippetStatement("");
            tp.replace(rep);
        }

        printJavaFile(srcDir);
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {
        try {
            if(defaultValue != null) defaultValue.replace(save);
            else rep.replace(save);
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new RestoreTransformationException("", e);
        }
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {

        JSONObject object = super.toJSONObject();
        JSONObject tpJSON = new JSONObject();
        tpJSON.put("position", tp.getParent(CtType.class).getQualifiedName() + ":" + position.getLine());
        tpJSON.put("sourcecode", save.toString());
        object.put("transplantationPoint", tpJSON);
        object.put("replace", (defaultValue == null) ? "null" : defaultValue.getType().getSimpleName());

        return object;
    }
}
