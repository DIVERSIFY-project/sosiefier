package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.util.Log;
import spoon.compiler.Environment;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.FragmentDrivenJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 7/11/13
 * Time: 4:15 PM
 */
public abstract class ASTTransformation extends AbstractTransformation {
    protected CodeFragment transplantationPoint;

    public ASTTransformation() {}

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
        if(compileUnit.getSourceCodeFraments() != null)
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

    //for stupid transformation
    public void setName(String type) {
        name = type;
    }

//    public String getParentBeforeTransformation() {
//        SourcePosition sp = transplantationPoint.getCtCodeFragment().getPosition();
//        CompilationUnit compileUnit = sp.getCompilationUnit();
//
//        Environment env = compileUnit.getFactory().getEnvironment();
//
////        int begin = compileUnit.beginOfLineIndex(sp.getSourceEnd()) - 3;
////        int end = compileUnit.nextLineIndex(sp.getSourceEnd()) + 3;
//        int begin = sp.getLine();
//        int end = sp.getEndLine()+1;
//        FragmentDrivenJavaPrettyPrinter printer = new FragmentDrivenJavaPrettyPrinter(env);
//        printer.calculate(compileUnit,null);
//        return Arrays.stream(printer.getResult().split("\n"), begin, end)
//                .collect(Collectors.joining("\n"));
//    }

    @Override
    public String getTransformationString() throws Exception {
        CtElement parentMethod = getParentMethod(transplantationPoint.getCtCodeFragment());
        SourcePosition sp = parentMethod.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        Environment env = compileUnit.getFactory().getEnvironment();
        addSourceCode();

        FragmentDrivenJavaPrettyPrinter printer = new FragmentDrivenJavaPrettyPrinter(env);
        printer.calculate(compileUnit,null);
        String[] code = printer.getResult().split("\n");
        removeSourceCode();

        int begin = sp.getLine() - 1;
        int end = getLineEnd(parentMethod) + code.length - printer.getResult().split("\n").length;


        return Arrays.stream(code, begin, end)
                .collect(Collectors.joining("\n"));
    }

    protected CtElement getParentMethod(CtElement son) {
       CtElement parent = son.getParent();

       while(parent != null && !(parent instanceof CtExecutable)) {
           parent = parent.getParent();
       }
        if(parent == null)
            return son.getParent();
        else
            return parent;
    }

    protected int getLineEnd(CtElement exe) {
        if(exe instanceof CtExecutable)
            return ((CtExecutable)exe).getBody().getPosition().getEndLine();
        else
            return exe.getPosition().getEndLine()+1;
    }

}


