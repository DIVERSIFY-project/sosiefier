package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.support.reflect.code.CtBlockImpl;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;


import java.util.*;

/**
 * User: Simon
 * Date: 25/02/14
 * Time: 11:32
 */
public class ErrorLoggingInstrumenter extends AbstractLoggingInstrumenter<CtStatement> {

    public ErrorLoggingInstrumenter(List<Transformation> transformations) {
        super(transformations);
    }

    @Override
    public boolean isToBeProcessed(CtStatement candidate) {
        try {
            if (candidate.getParent(CtCase.class) != null || !classFilterContains(candidate)) return false;

            return CtIf.class.isAssignableFrom(candidate.getClass())
                    || CtTry.class.isAssignableFrom(candidate.getClass())
                    || CtThrow.class.isAssignableFrom(candidate.getClass());
        } catch (Exception e) {
            return false;
        }
    }

    public void process(CtStatement statement) {
        if (CtThrow.class.isAssignableFrom(statement.getClass()))
            instruThrow((CtThrow) statement);
        if (CtTry.class.isAssignableFrom(statement.getClass()))
            instruCatch((CtTry)statement);
    }



    protected void instruThrow(CtThrow throwStmt) {
        Factory factory = throwStmt.getFactory();
        SourcePosition sp = throwStmt.getPosition();

        if(getMethod(throwStmt) == null) {
            return;
        }
        String id = idFor(getClass(throwStmt).getQualifiedName() + "." +getMethod(throwStmt).getSignature()+ ":"+sp.getSourceStart());

        String localVar = "throwable_" + id;
        String snippet = throwStmt.getThrownExpression().getType() + " " + localVar + " = " + throwStmt.getThrownExpression();
        CtCodeSnippetStatement var = new CtCodeSnippetStatementImpl();
        var.setValue(snippet);

        snippet =  getLogName()+".writeException("+id+",Thread.currentThread()," + localVar + ")";
        CtCodeSnippetStatement log = new CtCodeSnippetStatementImpl();
        log.setValue(snippet);

        snippet = "throw " + localVar;
        CtCodeSnippetStatement thro = new CtCodeSnippetStatementImpl();
        thro.setValue(snippet);

        CtBlock block = factory.Core().createBlock();

        block.addStatement(var);
        block.addStatement(log);
        block.addStatement(thro);

        throwStmt.replace(block);
        throwStmt.getParent(CtBlock.class).removeStatement(throwStmt);
    }

    protected void instruCatch(CtTry tryStmt) {
        if(getMethod(tryStmt) == null) {
            return;
        }

//        List<CtCatch> catchList = tryStmt.getCatchers();
//        for (CtCatch catchStmt : catchList) {
//            CtBlock<?> catchBlock = catchStmt.getBody();
//            if(getMethod(tryStmt) != null && !catchBlock.getStatements().isEmpty()) {
//                CtStatement statement = catchBlock.getStatements().get(0);
//                SourcePosition sp = statement.getPosition();
//
//                String id = idFor(getClass(tryStmt).getQualifiedName() + "." +getMethod(tryStmt).getSignature()+ ":"+sp.getSourceStart());
//                String snippet = getLogName() + ".writeCatch("+id+",Thread.currentThread(),\"" +
//                        catchStmt.getParameter().getSimpleName() + ");\n";
//
//                CtCodeSnippetStatement snippetStatement = new CtCodeSnippetStatementImpl();
//                snippetStatement.setValue(snippet);
//
//                tryStmt.insertBefore(snippetStatement);
////                CompilationUnit compileUnit = sp.getCompilationUnit();
////                int index = compileUnit.beginOfLineIndex(sp.getSourceStart());
////                compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));
//
//            }
//        }
    }

    protected int getCount(CtStatement stmt) {
        CtExecutable parent = stmt.getParent(CtExecutable.class);
        if(count.containsKey(parent))
            count.put(parent,count.get(parent) + 1);
        else
            count.put(parent,0);
        return count.get(parent);
    }

    protected CtSimpleType<?> getClass(CtStatement stmt) {
        return stmt.getParent(CtSimpleType.class);
    }

    protected CtExecutable<?> getMethod(CtStatement stmt) {
        CtExecutable<?> ret = stmt.getParent(CtMethod.class);
        if (ret == null)
            ret = stmt.getParent(CtConstructor.class);
        return ret;
    }

}