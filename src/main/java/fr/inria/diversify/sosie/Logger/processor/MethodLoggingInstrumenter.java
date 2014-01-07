package fr.inria.diversify.sosie.logger.processor;


import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtSimpleType;

/**
 * User: Simon
 * Date: 06/01/14
 * Time: 10:04
 */
public class MethodLoggingInstrumenter extends AbstractProcessor<CtMethod> {
    @Override
    public boolean isToBeProcessed(CtMethod candidate) {
        return !candidate.isImplicit()
                && candidate.getBody() != null
                && candidate.getBody().getStatements().size() != 0;
    }

    @Override
    public void process(CtMethod candidate) {
        CtBlock body = candidate.getBody();
        CtStatement stmt = body.getStatement(0);

        String snippet = "\tfr.inria.diversify.sosie.logger.LogWriter.methodCall(Thread.currentThread(),\"" +
                getClass(stmt).getQualifiedName() + "\",\"" + candidate.getSignature() + "\");\n";
        SourcePosition sp = stmt.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        int index;
        if(stmt.getPosition().getLine() == candidate.getPosition().getLine()) {
            index = sp.getSourceStart();

        }
            else {

            index = compileUnit.beginOfLineIndex(sp.getSourceStart());
        }


        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));
    }

    private CtSimpleType<?> getClass(CtStatement stmt) {
        return stmt.getParent(CtSimpleType.class);
    }


}
