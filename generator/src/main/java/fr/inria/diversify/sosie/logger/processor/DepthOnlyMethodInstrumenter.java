package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.SingleTransformation;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtExecutable;

import java.util.List;

/**
 * Created by marodrig on 25/11/2014.
 */
public class DepthOnlyMethodInstrumenter extends AbstractLoggingInstrumenter<CtExecutable> {

    public DepthOnlyMethodInstrumenter(List<SingleTransformation> transformations) {
        super(transformations);
    }

    /*
    @Override
    public boolean isToBeProcessed(CtExecutable candidate) {
        return candidate instanceof CtMethod || candidate instanceof CtConstructor;

    }*/

    @Override
    public void process(CtExecutable candidate) {
        CtBlock body = candidate.getBody();
        if ( body == null ) return;
        int bodySize = body.getStatements().size();
        if ( bodySize == 0 || (candidate instanceof CtConstructor && bodySize <= 1) ) return;
        CtStatement stmt;
        stmt = candidate instanceof CtConstructor ? body.getStatement(1) : body.getStatement(0);
        if ( stmt == null ) return;

        String id = idFor(getClass(stmt).getQualifiedName() + "." + candidate.getSignature());

        String snippet= "\ttry{\n\t" + getLogName() + ".depthOnlyMethodCall(Thread.currentThread());\n";
        SourcePosition sp = stmt.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        int index;
        if(stmt.getPosition().getLine() == candidate.getPosition().getLine()) {
            index = sp.getSourceStart();
        } else {
            index = compileUnit.beginOfLineIndex(sp.getSourceStart());
        }
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));

        sp = body.getLastStatement().getPosition();
        compileUnit = sp.getCompilationUnit();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+2 ,
                "\n" + "\t}\n\tfinally{"+getLogName()+".methodOut(Thread.currentThread()); }", 0));
    }
}
