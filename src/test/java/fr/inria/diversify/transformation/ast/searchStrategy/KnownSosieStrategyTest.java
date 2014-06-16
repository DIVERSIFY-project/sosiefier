package fr.inria.diversify.transformation.ast.searchStrategy;

import fr.inria.diversify.TestObjectsFactory;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationParser;
import fr.inria.diversify.transformation.query.searchStrategy.KnownSosieStrategy;
import org.junit.Before;
import org.junit.Test;
import spoon.reflect.factory.Factory;

import java.io.File;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marcel on 8/06/14.
 */
public class KnownSosieStrategyTest {

    KnownSosieStrategy st;

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    @Before
    public void setUp() throws Exception {
        Factory factory = new TestObjectsFactory().buildNewFactory(getResourcePath("junit"), 5);

        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.setSourceCodeDir(getResourcePath("junit"));
        inputProgram.setPreviousTransformationsPath(getResourcePath("junit-sosie.json"));
        inputProgram.setTransformationPerRun(5);

        st = new KnownSosieStrategy(inputProgram);
    }

    @Test
    public void testMultipleRetrieval() throws Exception {
        //Set the amount of points we must find
        //So far no check if the sosies can be mixed!
        CodeFragmentList cf = st.findFragments();
        assertEquals(5, cf.size());
    }

    /**
     * Test the sharing of transformations
     * @throws Exception
     */
    @Test
    public void testShareTransformations() throws Exception {
        //Set the amount of points we must find
        List<Transformation> cf1 = st.findTransformations();
        assertEquals(5, cf1.size());
    }

}
