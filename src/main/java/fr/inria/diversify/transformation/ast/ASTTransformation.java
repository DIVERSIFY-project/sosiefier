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
    protected CodeFragment position;

    public ASTTransformation() {}

    public void apply(String srcDir) throws Exception {
        addSourceCode();

        printJavaFile(srcDir);
        removeSourceCode();
    }

    protected abstract void addSourceCode() throws Exception;

    public void restore(String srcDir) throws Exception {
        printJavaFile(srcDir);
    }

    protected void printJavaFile(String directory) throws IOException {
        CtSimpleType<?> type = getOriginalClass(position);
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new FragmentDrivenJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("copy file: " + directory + " " + type.getQualifiedName());
    }

    protected void removeSourceCode() {
        CtSimpleType<?> type = getOriginalClass(position);
        CompilationUnit compileUnit = type.getPosition().getCompilationUnit();
        compileUnit.getSourceCodeFraments().clear();
    }

    public CtSimpleType<?> getOriginalClass(CodeFragment cf) {
        return cf.getCompilationUnit().getMainType();
    }

    public CodeFragment getPosition() {
        return position;
    }

    public void setPosition(CodeFragment position) {
        this.position = position;
    }


    public String classLocationName() {
        return position.getSourceClass().getQualifiedName();
    }
    public String packageLocationName() {
        return position.getSourcePackage().getQualifiedName();
    }
    public String methodLocationName() {
        CtExecutable elem = position.getCtCodeFragment().getParent(CtExecutable.class);
        if(elem != null)
            return elem.getSimpleName();
        return "field";
    }


    @Override
    public String getLevel() {
        CtCodeElement stmt = position.getCtCodeFragment();
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
        return position.getCtCodeFragment().getClass().getSimpleName();
    }

    public int line() {
        return position.getStartLine();
    }
}
