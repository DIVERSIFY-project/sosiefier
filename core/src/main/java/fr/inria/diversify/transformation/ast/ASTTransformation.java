package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.util.Log;
import spoon.compiler.Environment;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;

/**
 * User: Simon
 * Date: 7/11/13
 * Time: 4:15 PM
 */
public abstract class ASTTransformation extends SingleTransformation {

    protected boolean subType;

    /**
     * Transplantation point that is going to be modified, either by an Add, Replace or Delete transformation
     */
    protected CodeFragment transplantationPoint;

    CtCodeElement copyTransplant;

    public ASTTransformation() {
    }

    /**
     * String describing the level of the transformation, it may be at the statement, or block level.
     *
     * @return a string describing the level.
     */
    public String getLevel() {
        CtCodeElement stmt = transplantationPoint.getCtCodeFragment();
        if (stmt instanceof CtLocalVariable
                || stmt instanceof CtNewClass
                || stmt instanceof CtBreak
                || stmt instanceof CtUnaryOperator
                || stmt instanceof CtAssignment
                || stmt instanceof CtReturn
                || stmt instanceof CtOperatorAssignment
                || stmt instanceof CtContinue
                || stmt instanceof CtInvocation)
            return "statement";
        return "block";
    }

    /**
     * @return
     * @throws Exception
     */
    public String getTransformationString() throws Exception {
        copyTransplant = buildReplacementElement();
        transplantationPoint.getCtCodeFragment().replace(copyTransplant);

        String ret = transplantationPoint.getCtCodeFragment().getParent().toString();

        copyTransplant.replace(transplantationPoint.getCtCodeFragment());

        return ret;
    }

    /**
     * Prints the modified java file. When the transformation is done a new java file is created. This method performs a
     * pretty print of it
     *
     * @param directory Directory where the java file is going to be placed
     * @throws IOException
     */
    public void printJavaFile(String directory) throws IOException {
        CtSimpleType<?> type = getOriginalClass(transplantationPoint);
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new DefaultJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("write type {} in directory {}", type.getQualifiedName(), directory);
    }


    public abstract boolean usedOfSubType();

    /**
     * Logs description of the transformation that is going to be perform
     */
    protected abstract void applyInfo();

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
            transplantationPoint.getCtCodeFragment().replace(copyTransplant);
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new ApplyTransformationException("", e);
        }

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
     * All AST transformations takes the transplantation point (TP) and replaces it by :
     * 1. The TP + transplant (add operation)
     * 2. The transplant (replace operation)
     * 3. And empty statement (delete operation)
     * <p/>
     * This method builds the such replacement element
     *
     * @return The resulting CtElement after the transformation
     * @throws Exception
     * @Note: Renamed after buildCopyElement.
     */
    protected abstract CtCodeElement buildReplacementElement();

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
            copyTransplant.replace(transplantationPoint.getCtCodeFragment());
        } catch (Throwable e) {
            e.printStackTrace();
            Log.debug("");
        }
        printJavaFile(srcDir);
    }

    public abstract void updateStatementList();

    public CtSimpleType<?> getOriginalClass(CodeFragment cf) {
        return cf.getCompilationUnit().getMainType();
    }

    /**
     * Returns the transplantation point of the transformation
     *
     * @return A code fragment representing the transplantation point
     */
    public CodeFragment getTransplantationPoint() {
        return transplantationPoint;
    }

    public void setTransplantationPoint(CodeFragment transplantationPoint) {
        this.transplantationPoint = transplantationPoint;
    }


    /**
     * Returns the qualified name of the source class of the transplantation point
     *
     * @return
     */
    public String classLocationName() {
        return transplantationPoint.getSourceClass().getQualifiedName();
    }

    /**
     * Returns the qualified name of the package of the transplantation points
     *
     * @return
     */
    public String packageLocationName() {
        return transplantationPoint.getSourcePackage().getQualifiedName();
    }

    /**
     * Starting line number at wish  the transplantation point is located
     *
     * @return An integer describing the starting line number
     */
    public int line() {
        return transplantationPoint.getStartLine();
    }

    /**
     * Subtype of the transformation, add, delete, replace, replaceWitgestein, addSteroid, etc.
     *
     * @param type
     */
    //for stupid transformation
    public void setName(String type) {
        name = type;
    }

    public String methodLocationName() {
        CtExecutable elem = transplantationPoint.getCtCodeFragment().getParent(CtExecutable.class);
        if (elem != null) return elem.getSimpleName();
        return "field";
    }

    public void setSubType(boolean subType) {
        this.subType = subType;
    }


}


