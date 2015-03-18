package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.*;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 10/21/13
 * Time: 9:27 AM
 */
public class TestLoggingInstrumenter extends AbstractLoggingInstrumenter<CtMethod> {

    public TestLoggingInstrumenter() {
        super(new ArrayList<Transformation>());
    }

    @Override
    public boolean isToBeProcessed(CtMethod candidate) {
        if(candidate.isImplicit()
                || candidate.getBody() == null
                || candidate.getBody().getStatements().size() == 0)
            return false;

        if(candidate.getSimpleName().contains("test")) {
            return true;
        }

        return candidate.getAnnotations().stream()
                 .map(annotation -> annotation.toString())
                 .anyMatch(annotation -> annotation.startsWith("@org.junit.Test")
                         || annotation.startsWith("@org.junit.Before")
                         || annotation.startsWith("@org.junit.After"));

//        for(CtAnnotation<?> annotation: candidate.getAnnotations())
//            if(annotation.toString().startsWith("@org.junit.Test") ||
//               annotation.toString().startsWith("@org.junit.Before") ||
//               annotation.toString().startsWith("@org.junit.After"))
//                return true;
//
//        return false;
    }

    @Override
    public void process(CtMethod element) {
        String testName =  element.getPosition().getCompilationUnit().getMainType().getQualifiedName()
                + "." + element.getSimpleName();
        idFor(testName, "TEST"); //Save the id of the test to be able to staticCount all processed tests

        String snippet = getLogName() + ".writeTestStart(Thread.currentThread(),\"" + testName + "\")";
        CtCodeSnippetStatement snippetStatement = new CtCodeSnippetStatementImpl();
        snippetStatement.setValue(snippet);
        element.getBody().insertBegin(snippetStatement);

        snippet = getLogName() + ".writeTestFinish(Thread.currentThread())";
        snippetStatement = new CtCodeSnippetStatementImpl();
        snippetStatement.setValue(snippet);
        //Search the return statement
        boolean returnSt = false;
        List<CtStatement> sts = element.getBody().getStatements();
        List<CtStatement> insert = new ArrayList<>();

        for ( CtStatement st :  sts ) {
            if  ( st instanceof CtReturn ) {

                insert.add(st);

                returnSt = true;
            }
        }
        for (CtStatement stmt : insert) {
            stmt.insertBefore(snippetStatement);
        }

        if ( returnSt == false ) {
            element.getBody().insertEnd(snippetStatement);
        }

    }
}
