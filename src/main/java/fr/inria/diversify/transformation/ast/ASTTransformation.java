package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.util.Log;
import spoon.compiler.Environment;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.FragmentDrivenJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;

/**
 * User: Simon
 * Date: 7/11/13
 * Time: 4:15 PM
 */
public abstract class ASTTransformation extends AbstractTransformation {
    protected CodeFragment transplantationPoint;

    public ASTTransformation() {}

//    public void apply(String srcDir) throws Exception {
//        addSourceCode();
//
//        printJavaFile(srcDir);
//        removeSourceCode();
//    }

//    protected abstract void addSourceCode() throws Exception;

    public void applyWithParent(String srcDir) throws Exception {
        addSourceCode();
        printJavaFile(srcDir);

        if(parent != null) {
            parent.addSourceCode();
            parent.printJavaFile(srcDir);
            parent.removeSourceCode();
        }
        removeSourceCode();
    }

    public void restore(String srcDir) throws Exception {
        if(parent != null) {
            parent.removeSourceCode();
            parent.printJavaFile(srcDir);
        }
        removeSourceCode();
        printJavaFile(srcDir);
    }

    public void printJavaFile(String directory) throws IOException {
        CtSimpleType<?> type = getOriginalClass(transplantationPoint);
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new FragmentDrivenJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("copy file: " + directory + " " + type.getQualifiedName());
    }

    public void removeSourceCode() {
        CtSimpleType<?> type = getOriginalClass(transplantationPoint);
        CompilationUnit compileUnit = type.getPosition().getCompilationUnit();
        compileUnit.getSourceCodeFraments().clear();
    }

    public CtSimpleType<?> getOriginalClass(CodeFragment cf) {
        return cf.getCompilationUnit().getMainType();
    }

    public CodeFragment getTransplantationPoint() {
        return transplantationPoint;
    }

    public void setTransplantationPoint(CodeFragment transplantationPoint) {
        this.transplantationPoint = transplantationPoint;
    }


    public String classLocationName() {
        return transplantationPoint.getSourceClass().getQualifiedName();
    }
    public String packageLocationName() {
        return transplantationPoint.getSourcePackage().getQualifiedName();
    }
    public String methodLocationName() {
        CtExecutable elem = transplantationPoint.getCtCodeFragment().getParent(CtExecutable.class);
        if(elem != null)
            return elem.getSimpleName();
        return "field";
    }


    @Override
    public String getLevel() {
        CtCodeElement stmt = transplantationPoint.getCtCodeFragment();
        if(stmt instanceof CtLocalVariable
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

    @Override
    public String stmtType() {
        return transplantationPoint.getCtCodeFragment().getClass().getSimpleName();
    }

    public int line() {
        return transplantationPoint.getStartLine();
    }

    //far stupid transformation
    public void setName(String type) {
        name = type;
    }
}
