package fr.inria.diversify.transformation;

import fr.inria.diversify.ReplaceHelper;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.util.Log;
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
 * User: Simon
 * Date: 27/05/15
 * Time: 14:34
 */
public abstract class SpoonTransformation<P extends CtElement, T extends CtElement> extends SingleTransformation {
    protected P transplantationPoint;
    protected T transplant;
    protected T copyTransplant;

    /**
     * Apply the transformation. After the transformation is performed, the result will be copied to the output directory
     *
     * @param srcDir Path of the output directory
     * @throws Exception
     */
    public void apply(String srcDir) throws Exception {
        applyInfo();
        try {
            copyTransplant = buildReplacementElement();
            ReplaceHelper.replace(transplantationPoint, copyTransplant);
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new ApplyTransformationException("", e);
        }

    }

    protected  T buildReplacementElement() {
        T clone = transplant.getFactory().Core().clone(transplant);

        return clone;
    }

    /**
     * Applies the transformation having into consideration the parent transformation
     *
     * @param srcDir Path of the output directory
     * @throws Exception
     */
    @Override
    public void applyWithParent(String srcDir) throws Exception {
        if (parent != null) parent.apply(srcDir);
        apply(srcDir);
    }

    /**
     * Undo the transformation. After the transformation is restored, the result will be copy to the output directory
     *
     * @param srcDir Path of the output directory
     * @throws Exception
     */
    public void restore(String srcDir) throws Exception {
        if (parent != null) {
            parent.restore(srcDir);
        }
        try {
            ReplaceHelper.replace(copyTransplant, transplantationPoint);
        } catch (Throwable e) {
            e.printStackTrace();
            Log.debug("");
        }
        printJavaFile(srcDir);
    }


    /**
     * Prints the modified java file. When the transformation is done a new java file is created. This method performs a
     * pretty print of it
     *
     * @param directory Directory where the java file is going to be placed
     * @throws IOException
     */
    public void printJavaFile(String directory) throws IOException {
        CtType<?> type = getOriginalClass(transplantationPoint);
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new DefaultJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("write type {} in directory {}", type.getQualifiedName(), directory);
    }

    public CtType<?> getOriginalClass(CtElement element) {
        return element.getPosition().getCompilationUnit().getMainType();
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
    public int line() {
        return transplantationPoint.getPosition().getLine();
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

    public void setTransplantationPoint(P object) {
        this.transplantationPoint = object;
    }

    public P setTransplantationPoint() {
        return transplantationPoint;
    }

    public void setTransplant(T transplant) {
        this.transplant = transplant;
    }

    public T getTransplant() {
        return transplant;
    }

    public String getTransformationString() throws Exception {
        copyTransplant = buildReplacementElement();
        ReplaceHelper.replace(transplantationPoint, copyTransplant);

        String ret = transplantationPoint.getParent().toString();

        ReplaceHelper.replace(copyTransplant, transplantationPoint);

        return ret;
    }

}
