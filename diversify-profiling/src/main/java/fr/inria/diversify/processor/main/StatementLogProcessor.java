package fr.inria.diversify.processor.main;

import fr.inria.diversify.processor.ProcessorUtil;
import fr.inria.diversify.runner.InputProgram;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtExecutable;


/**
 * User: Simon
 * Date: 21/04/16
 * Time: 16:14
 */
public class StatementLogProcessor extends AbstractLoggingInstrumenter<CtStatement> {


    public StatementLogProcessor(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public boolean isToBeProcessed(CtStatement stmt) {
        return stmt.getParent(CtExecutable.class) != null
                && stmt.getParent() instanceof CtBlock
                && !stmt.toString().startsWith(logger)
                && !(stmt.toString().startsWith("this(") || stmt.toString().startsWith("super("));
    }

    @Override
    public void process(CtStatement stmt) {
        int id = ProcessorUtil.idFor(stmt.getPosition().getCompilationUnit().getMainType().getQualifiedName() + ":" + stmt.getPosition().getLine());
        String snippet = getLogger() + ".stmtLog(Thread.currentThread(),\"" + id + "\")";

        stmt.insertBefore(getFactory().Code().createCodeSnippetStatement(snippet));
    }
}
