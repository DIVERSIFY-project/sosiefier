package fr.inria.diversify.transformation.other;

import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.util.Log;
import spoon.compiler.Environment;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.FragmentDrivenJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;

/**
 * Created by Simon on 19/03/14.
 */
public class ReplaceLiteral extends AbstractTransformation {
    protected CtLiteral transplant;
    protected CtLiteral transplantationPoint;

    @Override
    public String getTransformationString() throws Exception {
        return "";
    }

    public void restore(String srcDir) throws Exception {
        if (parent != null) {
            parent.removeSourceCode();
            parent.printJavaFile(srcDir);
        }
        removeSourceCode();
        printJavaFile(srcDir);
    }

    public void printJavaFile(String directory) throws IOException {
        CtSimpleType<?> type = transplantationPoint.getPosition().getCompilationUnit().getMainType();
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new FragmentDrivenJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("copy file: " + directory + " " + type.getQualifiedName());
    }

    public String classLocationName() {
        return transplantationPoint.getParent(CtSimpleType.class).getQualifiedName();
    }

    public String packageLocationName() {
        return transplantationPoint.getParent(CtPackage.class).getQualifiedName();
    }

    public String methodLocationName() {
        CtExecutable elem = transplantationPoint.getParent(CtExecutable.class);
        if (elem != null)
            return elem.getSimpleName();
        return "field";
    }

    @Override
    public int line() {
        return transplantationPoint.getPosition().getLine();
    }

    @Override
    public String getLevel() {
        return "AST";
    }

    @Override
    public String stmtType() {
        return "other";
    }

    public void addSourceCode() {
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("transplant:\n {}", transplant);
        Log.debug("--------------------\npostion:\n{}", transplantationPoint.getPosition());
        SourcePosition sp = transplantationPoint.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd() + 1, "**/" + transplant.toString(), 0));
    }

    public void removeSourceCode() {
        CompilationUnit compileUnit = transplantationPoint.getPosition().getCompilationUnit();
        compileUnit.getSourceCodeFragments().clear();
    }

    public void setTransplantationPoint(CtLiteral transplantationPoint) {
        this.transplantationPoint = transplantationPoint;
    }

    public void setTransplant(CtLiteral transplant) {
        this.transplant = transplant;
    }

    public CtLiteral getTransplant() {
        return transplant;
    }
}
