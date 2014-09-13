package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.reference.CtTypeReference;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 10/21/13
 * Time: 9:27 AM
 */
public class TestLoggingInstrumenter extends AbstractLoggingInstrumenter<CtMethod> {

    public TestLoggingInstrumenter() {
        super(new ArrayList<>());
    }

    @Override
    public boolean isToBeProcessed(CtMethod candidate) {
        if(!(isTestClass(candidate.getDeclaringType().getReference())))
            return false;

        if(candidate.isImplicit()
                || candidate.getBody() == null
                || candidate.getBody().getStatements().size() == 0)
            return false;

        for(CtAnnotation<?> annotation: candidate.getAnnotations())
            if(annotation.toString().startsWith("@org.junit.Test") ||
               annotation.toString().startsWith("@org.junit.Before") ||
               annotation.toString().startsWith("@org.junit.After"))
                return true;

        if(candidate.getSimpleName().contains("test"))
            return true;

        return false;
    }

    protected boolean isTestClass(CtTypeReference<?> type) {
        if(type.getSimpleName().endsWith("Test") || type.getSimpleName().endsWith("Behaviour")) // Behaviour for jbehave
            return true;
        else {
            try {
                if (type.getSuperclass() != null) return isTestClass(type.getSuperclass());
            } catch (Exception e) {}
        }
        return false;
    }

    @Override
    public void process(CtMethod element) {
        CtStatement firstStmt = element.getBody().getStatement(0);
        String snippet = "\t\t"+
                getLogName()+ ".writeTestStart(Thread.currentThread(),\""
                + element.getPosition().getCompilationUnit().getMainType().getQualifiedName() +"."+element.getSimpleName() + "\");\n";
        SourcePosition sp = firstStmt.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        int index;
        if(firstStmt.getPosition().getLine() == element.getPosition().getLine())
            index = sp.getSourceStart();
        else
            index = compileUnit.beginOfLineIndex(sp.getSourceStart());

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));

        CompilationUnit cu = element.getPosition().getCompilationUnit();
        int pos = element.getBody().getPosition().getSourceEnd();
        cu.addSourceCodeFragment(new SourceCodeFragment(pos, getLogName() + ".writeTestFinish();\n", 0));
    }
}
