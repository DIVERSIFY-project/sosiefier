package fr.inria.diversify.testMutation;

import org.junit.Test;
import spoon.processing.AbstractAnnotationProcessor;
import spoon.reflect.declaration.CtMethod;

/**
 * Created by marodrig on 24/07/2014.
 */
public class TestMutator extends AbstractAnnotationProcessor<org.junit.Test, CtMethod> {

    @Override
    public void process(Test test, CtMethod ctMethod) {

    }
}
