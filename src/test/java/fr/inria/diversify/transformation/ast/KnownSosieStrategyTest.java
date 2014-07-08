package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.KnownSosieQuery;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import spoon.reflect.factory.Factory;

import java.util.ArrayList;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by marcel on 8/06/14.
 */
public class KnownSosieStrategyTest {

    private static InputProgram inputProgram;

    private static ArrayList<Transformation> sosies;

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    @BeforeClass
    public static void setUp() throws Exception {
        Factory factory = new SpoonMetaFactory().buildNewFactory(new KnownSosieStrategyTest().getResourcePath("junit"), 5);
        inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.setSourceCodeDir(new KnownSosieStrategyTest().getResourcePath("junit"));
        inputProgram.setPreviousTransformationsPath(new KnownSosieStrategyTest().getResourcePath("junit-sosie.json"));
        inputProgram.setTransformationPerRun(5);
        KnownSosieQuery st = new KnownSosieQuery(inputProgram);
        sosies = st.getSosies();
    }

    /**
     * Test the sharing of transformations
     * @throws Exception
     */
    @Test
    public void testQuery() throws Exception {
        //Set the amount of points we must find
        KnownSosieQuery st = new KnownSosieQuery(inputProgram, sosies);
        st.query();
        Collection<Transformation> cf1 = st.getTransformations();
        assertEquals(5, cf1.size());
    }

    /**
     * Test the sharing of transformations
     * @throws Exception
     */
    @Test
    public void testMultipleQuery() throws Exception {
        //Set the amount of points we must find
        KnownSosieQuery st = new KnownSosieQuery(inputProgram, sosies);

        //Query three times
        st.query();
        Collection<Transformation> cf1 = st.getTransformations();
        st.query();
        Collection<Transformation> cf2 = st.getTransformations();
        st.query();
        Collection<Transformation> cf3 = st.getTransformations();

        String s1 = "";
        String s2 = "";
        String s3 = "";
        for ( Transformation t : cf1 ) { s1 += t.toString(); }
        for ( Transformation t : cf2 ) { s2 += t.toString(); }
        for ( Transformation t : cf3 ) { s3 += t.toString(); }

        assertFalse(s1.equals(s2));
        assertFalse(s1.equals(s3));
        assertFalse(s3.equals(s2));
    }

}
