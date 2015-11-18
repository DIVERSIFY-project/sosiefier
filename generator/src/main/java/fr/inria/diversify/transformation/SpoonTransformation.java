package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;

/**
 * Created by Simon on 02/04/14.
 */

public class SpoonTransformation<P extends CtElement, T extends CtElement> extends SingleTransformation {
    protected P transplantationPoint;
    protected T transplant;
    protected T copyTransplant;

    public void printJavaFile(String directory) throws IOException {
        printJavaFile(directory, null);
    }

    protected void printJavaFile(String directory, CtType<?> cl) throws IOException {
        CtType<?> type;
        if(cl == null) {
            type = getOriginalClass();
        }
        else {
            type = cl;
        }
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new DefaultJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("copy file: " + directory + " " + type.getQualifiedName());
    }

    public CtType<?> getOriginalClass() {
        return transplantationPoint.getPosition().getCompilationUnit().getMainType();
    }

    public String classLocationName() {
        CtType c = transplantationPoint.getParent(CtType.class);
        if(c == null && transplantationPoint instanceof CtType)
            c = (CtType) transplantationPoint;
        if(c == null)
            return "null";

        return c.getQualifiedName();
    }
    public String packageLocationName() {
        CtPackage p = transplantationPoint.getParent(CtPackage.class);
        if(p == null && transplantationPoint instanceof CtPackage)
            p = (CtPackage) transplantationPoint;

        return p.getQualifiedName();
    }
    public String methodLocationName() {
        CtExecutable elem = transplantationPoint.getParent(CtExecutable.class);
        if(elem != null)
            return elem.getSimpleName();

        return "null";
    }

    @Override
    public String getTransformationString() throws Exception {
        return null;
    }

    public void apply(String srcDir) throws Exception {
        applyInfo();
        try {
            copyTransplant = transplantationPoint.getFactory().Core().clone(transplant);
            transplantationPoint.replace(transplant);
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new ApplyTransformationException("", e);
        }
    }

    @Override
    public void restore(String srcDir) throws Exception {
        transplant.replace(copyTransplant);
        printJavaFile(srcDir);
    }

    @Override
    public int line() {
        return transplantationPoint.getPosition().getLine();
    }

    public void setTransplantationPoint(P object) {
        this.transplantationPoint = object;
    }

    public P getTransplantationPoint() {
        return transplantationPoint;
    }

    public void setTransplant(T transplant) {
        this.transplant = transplant;
    }

    public T getTransplant() {
        return transplant;
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = super.toJSONObject();

        json.put("transplantationPoint", getCtElementJSonString(transplantationPoint));

        if(transplant != null)
            json.put("transplant", getCtElementJSonString(transplant));

        return json;
    }

//    @Override
//    public String getTransformationString() throws Exception {
//        return getTransformationString(transplantationPoint);
//    }

    public  int hashCode() {
        return super.hashCode() * transplantationPoint.getPosition().hashCode() *
                transplantationPoint.getPosition().getLine();
    }

    protected String getCtElementJSonString(CtElement element) {
        return element.getParent(CtPackage.class).getQualifiedName()
                + "." + element.getPosition().getCompilationUnit().getMainType().getSimpleName() + ":" + element.getPosition().getLine();
    }

    public boolean equals(Object other) {
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;
        SpoonTransformation otherTransformation = (SpoonTransformation)other;

        return status == otherTransformation.status &&
                failures.equals(otherTransformation.failures) &&
                transplantationPoint.equals(otherTransformation.transplantationPoint) &&
                transplantationPoint.getPosition().equals(otherTransformation.transplantationPoint.getPosition());
    }


    protected void applyInfo() {
        Log.debug("transformation: {}, {}",type,name);
        Log.debug("transplantationPoint:\n {}", transplantationPoint);
        Log.debug("--------------------\nposition: {}", transplantationPoint.getPosition());
        if(transplant != null) {
            Log.debug("transplant:\n {}", transplant);
            Log.debug("--------------------\nposition: {}", transplant.getPosition());
        }
    }

    @Override
    public SourcePosition getPosition() {
        return transplantationPoint.getPosition();
    }
}
