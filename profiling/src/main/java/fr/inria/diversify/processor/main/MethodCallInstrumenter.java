package fr.inria.diversify.processor.main;


import fr.inria.diversify.diversification.InputProgram;;
import fr.inria.diversify.processor.ProcessorUtil;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtTry;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;


/**
 * User: Simon
 * Date: 06/01/14
 * Time: 10:04
 */
public class MethodCallInstrumenter extends AbstractLoggingInstrumenter<CtMethod> {

    public MethodCallInstrumenter(InputProgram inputProgram) {
        super(inputProgram);
    }


    @Override
    public boolean isToBeProcessed(CtMethod candidate) {

        return !candidate.isImplicit()
                && candidate.getBody() != null
                && candidate.getBody().getStatements().size() != 0
                && hasCall(candidate)
                && !containsGoto(candidate);
    }

    @Override
    public void process(CtMethod candidate) {
        int methodId = methodId(candidate);
        Factory factory = candidate.getFactory();

        CtTry ctTry = factory.Core().createTry();
        ctTry.setBody(candidate.getBody());

        String snippet = getLogger() + ".methodIn(Thread.currentThread(),\"" + methodId + "\")";
        CtCodeSnippetStatement beginStmt = getFactory().Code().createCodeSnippetStatement(snippet);

        ctTry.getBody().insertBegin(beginStmt);

        snippet = getLogger() + ".methodOut(Thread.currentThread(),\"" + methodId + "\")";
        CtCodeSnippetStatement endStmt = getFactory().Code().createCodeSnippetStatement(snippet);

        CtBlock finalizerBlock = factory.Core().createBlock();
        finalizerBlock.addStatement(endStmt);
        ctTry.setFinalizer(finalizerBlock);

        CtBlock methodBlock = factory.Core().createBlock();
        methodBlock.addStatement(ctTry);
        candidate.setBody(methodBlock);
    }

    protected boolean hasCall(CtMethod method) {
        QueryVisitor query = new QueryVisitor(new TypeFilter(CtInvocation.class));
        method.accept(query);

        for(Object o : query.getResult()) {
            CtInvocation target = (CtInvocation) o;
            if(target.getExecutable() != null && target.getExecutable().getDeclaration() != null)
                if (inputProgram.getAllElement(CtMethod.class).contains(target.getExecutable().getDeclaration())) {
                    return true;
                }
        }
        return false;
    }
}
