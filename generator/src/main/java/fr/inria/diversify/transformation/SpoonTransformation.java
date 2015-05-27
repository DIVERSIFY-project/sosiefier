package fr.inria.diversify.transformation;

import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.compiler.Environment;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.FragmentDrivenJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;

/**
 * Created by Simon on 02/04/14.
 */
public abstract class SpoonTransformation<P extends CtElement, T extends CtElement> extends SourceCodeTransformation {
    protected P transformationPoint;
    protected T transplant;

    public void printJavaFile(String directory) throws IOException {
        printJavaFile(directory, null);
    }

    protected void printJavaFile(String directory, CtSimpleType<?> cl) throws IOException {
        CtSimpleType<?> type;
        if(cl == null)
            type = getOriginalClass();
        else
            type = cl;
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new FragmentDrivenJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("copy file: " + directory + " " + type.getQualifiedName());
    }

    public CtSimpleType<?> getOriginalClass() {
        return transformationPoint.getPosition().getCompilationUnit().getMainType();
    }

    public String classLocationName() {
        CtSimpleType c = transformationPoint.getParent(CtSimpleType.class);
        if(c == null && transformationPoint instanceof CtSimpleType)
            c = (CtSimpleType) transformationPoint;
        if(c == null)
            return "null";

        return c.getQualifiedName();
    }
    public String packageLocationName() {
        CtPackage p = transformationPoint.getParent(CtPackage.class);
        if(p == null && transformationPoint instanceof CtPackage)
            p = (CtPackage) transformationPoint;

        return p.getQualifiedName();
    }
    public String methodLocationName() {
        CtExecutable elem = transformationPoint.getParent(CtExecutable.class);
        if(elem != null)
            return elem.getSimpleName();

        return "null";
    }

    @Override
    public int line() {
        return transformationPoint.getPosition().getLine();
    }

    public void removeSourceCode() {
        CompilationUnit compileUnit = transformationPoint.getPosition().getCompilationUnit();
        if(compileUnit.getSourceCodeFragments() != null)
            compileUnit.getSourceCodeFragments().clear();
    }


    public void setTransformationPoint(P object) {
        this.transformationPoint = object;
    }

    public P getTransformationPoint() {
        return transformationPoint;
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

        json.put("transformationPoint", getCtElementJSonString(transformationPoint));

        if(transplant != null)
            json.put("transplant", getCtElementJSonString(transplant));

        return json;
    }

    @Override
    public String getTransformationString() throws Exception {
        return getTransformationString(transformationPoint);
    }

    public  int hashCode() {
        return super.hashCode() * transformationPoint.getPosition().hashCode() *
                transformationPoint.getPosition().getLine();
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
                transformationPoint.equals(otherTransformation.transformationPoint) &&
                transformationPoint.getPosition().equals(otherTransformation.transformationPoint.getPosition());
    }


    protected void logInfo() {
        Log.debug("transformation: {}, {}",type,name);
        Log.debug("transformationPoint:\n {}", transformationPoint);
        Log.debug("--------------------\nposition: {}", transformationPoint.getPosition());
        if(transplant != null) {
            Log.debug("transplant:\n {}", transplant);
            Log.debug("--------------------\nposition: {}", transplant.getPosition());
        }
    }

    @Override
    public SourcePosition getPosition() {
        return transformationPoint.getPosition();
    }
}
