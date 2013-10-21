package fr.inria.diversify.sosie.logger.processor;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtMethod;

/**
 * User: Simon
 * Date: 10/21/13
 * Time: 9:27 AM
 */
public class TestLoggingInstrumenter extends AbstractProcessor<CtMethod> {


    @Override
    public void process(CtMethod element) {

        element.getAnnotation();
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
