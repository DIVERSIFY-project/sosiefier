package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;

import java.util.List;

/**
 * Created by nharrand on 06/12/16.
 */
public class SwapSubType extends SingleTransformation {

    //CtConstructorCall newCall;
    CtExpression newCall;
    CtConstructorCall tp;
    CtConstructorCall save;
    CtCodeSnippetExpression newCallSnippet;

    public SwapSubType(CtConstructorCall tp, CtConstructorCall newCall) {
        this.tp = tp;
        type = "replace";
        name = "swapSubType";
        Factory factory = tp.getFactory();
        save = factory.Core().clone(tp);

        this.newCall = newCall;
    }

    public SwapSubType() {
        type = "replace";
        name = "swapSubType";
    }

    public void setTpAndNewCall(CtConstructorCall tp, CtCodeSnippetExpression newCall) {
        this.tp = tp;
        Factory factory = tp.getFactory();
        save = factory.Core().clone(tp);

        newCallSnippet = newCall;
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

        CtMethod m = tp.getParent(CtMethod.class);
        String params = "(";
        boolean isFirst = true;
        List<CtParameter> ps = m.getParameters();
        for(CtParameter p : ps) {
            if(isFirst) isFirst = false;
            else params +=", ";
            params += p.getType().getQualifiedName();
        }
        params += ")";
        String method = m.getDeclaringType().getQualifiedName() + "." +
                m.getSimpleName() + params;
        return method;
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
        //if(newCall == null) newCall = (CtConstructorCall) newCallSnippet.compile();
        //tp.replace((CtStatement) newCall);
        if(newCall == null) newCall = newCallSnippet;
        tp.replace(newCall);

        System.out.println("newt stmt: " + newCall.toString());
        printJavaFile(srcDir);
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {
        try {
            newCall.replace((CtStatement) tp);
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new RestoreTransformationException("", e);
        }
    }


    @Override
    public JSONObject toJSONObject() throws JSONException {

        JSONObject object = super.toJSONObject();
        if(newCall != null) object.put("newCall", newCall.toString());
       else object.put("newCall", newCallSnippet.toString());
        JSONObject tpJSON = new JSONObject();
        tpJSON.put("position", tp.getParent(CtType.class).getQualifiedName() + ":" + tp.getPosition().getLine());
        tpJSON.put("type", tp.getClass().getName());
        tpJSON.put("sourcecode", tp.toString());
        object.put("transplantationPoint",tpJSON);
        return object;
    }
}

