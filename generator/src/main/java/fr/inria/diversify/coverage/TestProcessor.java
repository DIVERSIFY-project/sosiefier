package fr.inria.diversify.coverage;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtSimpleType;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * User: Simon
 * Date: 10/21/13
 * Time: 9:27 AM
 */
public class TestProcessor extends AbstractProcessor<CtMethod> {
    BufferedWriter bw;

    public TestProcessor(String fileName) throws IOException {
        File file = new File(fileName);
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        bw = new BufferedWriter(fw);
    }

    @Override
    public boolean isToBeProcessed(CtMethod candidate) {
        if(candidate.isImplicit()
                || candidate.getBody() == null
                || candidate.getBody().getStatements().size() == 0)
            return false;

        for(CtAnnotation<?> annotation: candidate.getAnnotations())
            if(annotation.toString().startsWith("@org.junit.Test"))
                return true;

        if(candidate.getSimpleName().contains(" test"))
            return true;

        return false;
    }

    @Override
    public void process(CtMethod element) {
        CtSimpleType<?> cl = element.getPosition().getCompilationUnit().getMainType();
        try {
            bw.write(cl.getQualifiedName()+"#"+element.getSimpleName()+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processingDone() {
        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
