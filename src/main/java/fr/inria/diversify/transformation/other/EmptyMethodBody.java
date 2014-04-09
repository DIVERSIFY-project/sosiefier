package fr.inria.diversify.transformation.other;

import fr.inria.diversify.transformation.SpoonTransformation;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;

/**
 * Created by Simon on 09/04/14.
 */
public class EmptyMethodBody extends SpoonTransformation<CtExecutable, CtElement> {
    @Override
    public void addSourceCode() throws Exception {

    }
}
