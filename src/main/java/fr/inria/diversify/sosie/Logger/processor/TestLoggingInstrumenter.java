package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.util.Log;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtSimpleType;

/**
 * User: Simon
 * Date: 10/21/13
 * Time: 9:27 AM
 */
public class TestLoggingInstrumenter extends AbstractProcessor<CtMethod> {
    protected static int count;

    @Override
    public void process(CtMethod element) {

        for(CtAnnotation<?> annotation: element.getAnnotations()) {
            if(annotation.toString().startsWith("@org.junit.Test")) {
                Log.info(element.getParent(CtSimpleType.class).getQualifiedName()+" "+element.getSignature());
                if(!element.getBody().getStatements().isEmpty()) {
                    CtStatement firstStmt = (CtStatement) element.getBody().getStatements().get(0);
                    String snippet = "\t\tfr.inria.diversify.sosie.logger.LogWriter.writeTestStart(" + count
                        + ",\"" + element.getParent(CtSimpleType.class).getQualifiedName() +"."+element.getSimpleName() + "\");\n";
                    SourcePosition sp = firstStmt.getPosition();
                    CompilationUnit compileUnit = sp.getCompilationUnit();
                    int index = compileUnit.beginOfLineIndex(sp.getSourceStart());
                    compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));
                }
                count++;
            }
        }
    }
}
