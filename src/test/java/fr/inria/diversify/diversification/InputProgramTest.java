package fr.inria.diversify.diversification;

import fr.inria.diversify.factories.SpoonMetaFactory;
import org.junit.Assert;
import org.junit.Test;
import spoon.reflect.factory.Factory;

/**
 * Created by marodrig on 19/06/2014.
 */
public class InputProgramTest {

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    @Test
    public void testGetCodeFragments() throws Exception {
        Factory factory = new SpoonMetaFactory().buildNewFactory(getResourcePath("commons-collections/src/main"), 5);

        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.setSourceCodeDir(getResourcePath("commons-collections"));

        Assert.assertTrue(inputProgram.getCodeFragments().size() > 0);
    }

}
