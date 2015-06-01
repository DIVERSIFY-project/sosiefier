package fr.inria.diversify.processor.test;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtMethod;

/**
 * User: Simon
 * Date: 01/06/15
 * Time: 11:10
 */
public class EvosuiteProcessor extends AbstractProcessor<CtMethod> {

    public boolean isToBeProcessed(CtMethod element) {
        return element.getSimpleName().equals("setSystemProperties");
    }

    @Override
    public void process(CtMethod element) {
        element.setBody(getFactory().Core().createBlock());
    }
}
