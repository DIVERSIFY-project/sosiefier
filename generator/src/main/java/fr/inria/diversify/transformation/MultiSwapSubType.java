package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by nharrand on 09/10/17.
 */
public class MultiSwapSubType extends Transformation {
    Set<SwapSubType> transformations;

    public MultiSwapSubType(Set<SwapSubType> transformations) {
        this.transformations = transformations;
    }

    @Override
    public String getTransformationString() throws Exception {
        return null;
    }

    @Override
    public void apply(String srcDir) throws Exception {
        try {
            for(SwapSubType t : transformations) {
                if(t.newCall == null) t.newCall = t.newCallSnippet;
                t.tp.replace(t.newCall);
            }
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new RestoreTransformationException("", e);
        }
    }

    @Override
    public void applyWithParent(String srcDir) throws Exception {

    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {

        try {
            transformations.stream()
                    .forEach(t -> t.newCall.replace((CtStatement) t.tp));
            printJavaFile(srcDir);

        } catch (Exception e) {
            throw new RestoreTransformationException("", e);
        }
    }

    @Override
    public List<SourcePosition> getPositions() {
        return transformations.stream().map(t -> t.getPosition()).collect(Collectors.toList());
    }

    public void printJavaFile(String directory) throws IOException {
        if(!transformations.isEmpty()) {

            Factory factory = transformations.iterator().next().getPosition().getCompilationUnit().getMainType().getFactory();
            Environment env = factory.getEnvironment();

            JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new DefaultJavaPrettyPrinter(env));
            processor.setFactory(factory);
            transformations.stream()
                    .map(t -> t.getPosition().getCompilationUnit().getMainType())
                    .distinct()
                    .forEach(t -> processor.createJavaFile(t));
        }
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject res = super.toJSONObject();
        JSONArray list = new JSONArray();
        for(SwapSubType t : transformations) {
            JSONObject object = super.toJSONObject();
            if (t.newCall != null) object.put("newCall", t.newCall.toString());
            else object.put("newCall", t.newCallSnippet.toString());
            JSONObject tpJSON = new JSONObject();
            tpJSON.put("position", t.tp.getParent(CtType.class).getQualifiedName() + ":" + t.tp.getPosition().getLine());
            tpJSON.put("type", t.tp.getClass().getName());
            tpJSON.put("sourcecode", t.tp.toString());
            object.put("transplantationPoint", tpJSON);
        }
        res.put("type", "MultiSwapSubType");
        res.put("transformations", list);
        return res;
    }
}
