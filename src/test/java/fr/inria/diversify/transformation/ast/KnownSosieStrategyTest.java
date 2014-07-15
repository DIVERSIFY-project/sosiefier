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
import static junit.framework.Assert.assertTrue;

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
     * Test that the transformations are taken without reposition
     * @throws Exception
     */
    @Test
    public void testMultipleQueryWithoutReposition() throws Exception {
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


    /**
     * Test that the transformations are taken incrementally, simple case
     * @throws Exception
     */
    @Test
    public void testIncrementalMultiSosieQuery() throws Exception {
        //Set the amount of points we must find
        KnownSosieQuery st = new KnownSosieQuery(inputProgram, sosies);

        //Query three times
        inputProgram.setTransformationPerRun(5);
        st.query();
        Collection<Transformation> cf1 = st.getTransformations();
        inputProgram.setTransformationPerRun(6);
        st.query();
        Collection<Transformation> cf2 = st.getTransformations();
        inputProgram.setTransformationPerRun(5);

        String s1 = "";
        String s2 = "";
        for ( Transformation t : cf1 ) { s1 += t.toString(); }
        for ( Transformation t : cf2 ) { s2 += t.toString(); }
        assertTrue(s2.contains(s1));
    }

    /**
     * Test that the transformations are taken incrementally
     * @throws Exception
     */
    @Test
    public void testIncrementalMultiSosieQuery2() throws Exception {
        //Set the amount of points we must find
        KnownSosieQuery st = new KnownSosieQuery(inputProgram, sosies);

        //Query three times
        inputProgram.setTransformationPerRun(5);
        st.query();
        Collection<Transformation> cf51 = st.getTransformations();
        st.query();
        Collection<Transformation> cf52 = st.getTransformations();

        inputProgram.setTransformationPerRun(6);
        st.query();
        Collection<Transformation> cf62 = st.getTransformations();
        st.query();
        Collection<Transformation> cf61 = st.getTransformations();
        inputProgram.setTransformationPerRun(5);

        String s51 = "";
        String s52 = "";
        String s61 = "";
        String s62 = "";
        for ( Transformation t : cf51 ) { s51 += t.toString(); }
        for ( Transformation t : cf52 ) { s52 += t.toString(); }
        for ( Transformation t : cf61 ) { s61 += t.toString(); }
        for ( Transformation t : cf62 ) { s62 += t.toString(); }

        assertTrue(s62.contains(s52));
        assertTrue(s61.contains(s51));
    }
}
