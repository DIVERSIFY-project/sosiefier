package fr.inria.diversify.sosie.logger.processor;

import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtMethod;


/**
 * Created by Simon on 04/12/14.
 */
@Deprecated
public abstract class TestProcessor extends AbstractLoggingInstrumenter<CtMethod> {


    public TestProcessor() {
        super(null);
    }

    @Override
    public boolean isToBeProcessed(CtMethod candidate) {
        if(candidate.isImplicit()
                || candidate.getBody() == null
                || candidate.getBody().getStatements().size() == 0) {
            return false;
        }
        for(CtAnnotation<?> annotation: candidate.getAnnotations()) {
            if (annotation.toString().startsWith("@org.junit.Test")) {
                return true;
            }
        }

        if(candidate.getSimpleName().contains("test")) {
            return true;
        }

        return false;
    }
}
