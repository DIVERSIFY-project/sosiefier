package fr.inria.diversify.testamplification.processor;


import spoon.reflect.code.*;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.Factory;
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
        return isTest(candidate);
    }

    @Override
    public void process(CtMethod element) {
        Factory factory = element.getFactory();
        CtTry ctTry = factory.Core().createTry();
        ctTry.setBody(element.getBody());

        String snippet;
        if(element.getModifiers().contains(ModifierKind.STATIC)) {
            String testName = element.getPosition().getCompilationUnit().getMainType().getQualifiedName() + "." + element.getSimpleName();
            snippet = getLogName() + ".writeTestStart(Thread.currentThread(), \"" + testName + "\")";
        } else {
            String testName = element.getSimpleName();
           snippet = getLogName() + ".writeTestStart(Thread.currentThread(),this, \"" + testName + "\")";
        }

        CtCodeSnippetStatement snippetStatement = new CtCodeSnippetStatementImpl();
        snippetStatement.setValue(snippet);
        element.getBody().insertBegin(snippetStatement);

        snippet = getLogName() + ".writeTestFinish(Thread.currentThread())";
        CtCodeSnippetStatement snippetFinish = new CtCodeSnippetStatementImpl();
        snippetFinish.setValue(snippet);

        CtBlock finalizerBlock = factory.Core().createBlock();
        finalizerBlock.addStatement(snippetFinish);
        ctTry.setFinalizer(finalizerBlock);

        CtBlock methodBlock = factory.Core().createBlock();
        methodBlock.addStatement(ctTry);
        element.setBody(methodBlock);
    }
}
