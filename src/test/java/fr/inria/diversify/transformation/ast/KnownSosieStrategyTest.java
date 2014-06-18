package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.TestObjectsFactory;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.KnownSosieQuery;
import org.junit.Before;
import org.junit.Test;
import spoon.reflect.factory.Factory;

import java.util.Collection;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marcel on 8/06/14.
 */
public class KnownSosieStrategyTest {

    KnownSosieQuery st;

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

        st = new KnownSosieQuery(inputProgram);
    }

    /**
     * Test the sharing of transformations
     * @throws Exception
     */
    @Test
    public void testQuery() throws Exception {
        //Set the amount of points we must find
        st.query();
        Collection<Transformation> cf1 = st.getTransformations();
        assertEquals(5, cf1.size());
    }

}
