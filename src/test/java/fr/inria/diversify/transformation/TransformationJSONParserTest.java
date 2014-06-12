package fr.inria.diversify.transformation;

import fr.inria.diversify.diversification.InputProgram;
import org.junit.Assert;
import org.junit.Test;

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
        InputProgram inputProgram = new InputProgram();
        inputProgram.setSourceCodeDir(getResourcePath("junit"));
        inputProgram.setPreviousTransformationsPath(getResourcePath("transformations.json"));
        TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
        List<Transformation> transf = parser.parseFile(new File(getResourcePath("transformations.json")));
        Assert.assertNotEquals(0, transf.size());
     }
}
