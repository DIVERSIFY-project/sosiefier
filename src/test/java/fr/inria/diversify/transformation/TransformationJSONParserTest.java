package fr.inria.diversify.transformation;

import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.diversification.InputProgram;
import org.junit.Assert;
import org.junit.Test;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.util.List;

/**
 * Created by marodrig on 12/06/2014.
 */
public class TransformationJSONParserTest {

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    @Test
    public void testTransformationJSONParser() throws Exception {
        Factory factory = new SpoonMetaFactory().buildNewFactory(getResourcePath("easymock-light-3.2"), 5);

        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.setSourceCodeDir(getResourcePath("easymock-light-3.2"));
        inputProgram.setPreviousTransformationsPath(getResourcePath("easymock3.2-non-rep-index.json"));
        inputProgram.processCodeFragments();

        TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
        List<Transformation> transf = parser.parseFile(new File(inputProgram.getPreviousTransformationsPath()));

        Assert.assertTrue(0 < transf.size());
     }
}
