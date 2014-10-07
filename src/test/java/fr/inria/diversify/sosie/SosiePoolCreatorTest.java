package fr.inria.diversify.sosie;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import spoon.reflect.factory.Factory;

import java.io.File;

/**
 * Created by marodrig on 19/06/2014.
 */
public class SosiePoolCreatorTest
{

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    @Test
    public void testCreate() throws Exception {

        Factory factory = new SpoonMetaFactory().buildNewFactory(getResourcePath("easymock-light-3.2/src/main"), 5);

        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.setPreviousTransformationsPath(getResourcePath("easymock3.2-non-rep-index.json"));
        SosiePoolCreator creator = new SosiePoolCreator(inputProgram);

        creator.create("testCreate.json");

        File f = new File("testCreate.json");
        Assert.assertTrue(f.exists());

    }

}
