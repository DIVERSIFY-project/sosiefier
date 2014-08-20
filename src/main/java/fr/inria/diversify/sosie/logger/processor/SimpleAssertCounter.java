package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.Transformation;
import org.eclipse.jdt.internal.compiler.batch.CompilationUnit;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.cu.SourceCodeFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marodrig on 18/08/2014.
 */
public class SimpleAssertCounter extends AbstractLoggingInstrumenter<CtInvocation<?>> {


    public SimpleAssertCounter() {
        super(new ArrayList<>());
    }

    @Override
    public boolean isToBeProcessed(CtInvocation<?> candidate) {
        try {
            return candidate.getExecutable().getSimpleName().startsWith("assert");
        } catch (NullPointerException e) {
            return false;
        }
    }

    @Override
    public void process(CtInvocation ctInvocation) {
        spoon.reflect.cu.CompilationUnit cu = ctInvocation.getPosition().getCompilationUnit();
        int b = cu.beginOfLineIndex(ctInvocation.getPosition().getSourceStart());
        cu.addSourceCodeFragment(new SourceCodeFragment(b,
                getLogName() + ".countAssert();", 0));

    }
}
