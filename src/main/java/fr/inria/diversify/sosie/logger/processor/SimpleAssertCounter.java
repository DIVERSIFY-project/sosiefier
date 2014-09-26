package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.CtAssert;
import spoon.reflect.cu.SourceCodeFragment;

import java.util.ArrayList;

/**
 * Instrument the code to counts asserts
 *
 * Created by marodrig on 18/08/2014.
 */
public class SimpleAssertCounter extends AbstractLoggingInstrumenter<CtAssert<?>> {

    public SimpleAssertCounter() {
        super(new ArrayList<Transformation>());
    }

    @Override
    public boolean isToBeProcessed(CtAssert<?> candidate) {
        return true;
    }

    @Override
    public void process(CtAssert ctAssert) {
        spoon.reflect.cu.CompilationUnit cu = ctAssert.getPosition().getCompilationUnit();
        int b = ctAssert.getPosition().getSourceEnd() + 2;
        String pos = ctAssert.getPosition().getCompilationUnit().getMainType().getQualifiedName() + ":" +
                ctAssert.getPosition().getLine();

        pos = idFor(pos, "ASSERT"); //Save the position string
        cu.addSourceCodeFragment(new SourceCodeFragment(b,
                getLogName() + ".countAssert(\"" + pos + "\");", 0));
    }
}
