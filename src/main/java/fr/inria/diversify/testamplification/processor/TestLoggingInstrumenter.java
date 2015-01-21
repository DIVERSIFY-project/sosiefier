package fr.inria.diversify.testamplification.processor;


import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.ModifierKind;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;

import java.util.List;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 10/21/13
 * Time: 9:27 AM
 */
public class TestLoggingInstrumenter extends TestProcessor {

    @Override
    public boolean isToBeProcessed(CtMethod candidate) {

        if(candidate.isImplicit()
                || candidate.getBody() == null) {
            return false;
        }

        return candidate.getSimpleName().contains("test")
                || candidate.getAnnotations().stream()
                            .map(annotation -> annotation.toString())
                            .anyMatch(annotation -> annotation.startsWith("@org.junit.Test"));
    }

    @Override
    public void process(CtMethod element) {
        String snippet;
        if(element.getModifiers().contains(ModifierKind.STATIC)) {
            String testName = element.getPosition().getCompilationUnit().getMainType().getQualifiedName() + "." + element.getSimpleName();
            snippet = getLogName() + ".writeTestStart(Thread.currentThread(), \"" + testName + "\")";
        } else {
            String testName = element.getSimpleName();
//            idFor(testName, "TEST"); //Save the id of the test to be able to count all processed tests
           snippet = getLogName() + ".writeTestStart(Thread.currentThread(),this, \"" + testName + "\")";
        }



        CtCodeSnippetStatement snippetStatement = new CtCodeSnippetStatementImpl();
        snippetStatement.setValue(snippet);
        element.getBody().insertBegin(snippetStatement);

        snippet = getLogName() + ".writeTestFinish(Thread.currentThread())";
        CtCodeSnippetStatement snippetFinish = new CtCodeSnippetStatementImpl();
        snippetFinish.setValue(snippet);

        //Search the return statement
        List<CtStatement> sts = element.getBody().getStatements();

        List<CtStatement> insert = sts.stream()
                .filter(st -> st instanceof CtReturn)
                .collect(Collectors.toList());

        if(insert.isEmpty()) {
            element.getBody().insertEnd(snippetFinish);
        } else {
            insert.stream()
                  .forEach(st -> st.insertBefore(snippetFinish));
        }
    }
}
