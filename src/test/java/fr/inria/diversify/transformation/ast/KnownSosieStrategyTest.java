package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.AbstractTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.KnownSosieQuery;
import fr.inria.diversify.transformation.query.QueryException;
import fr.inria.diversify.transformation.query.SeveralTriesUnsuccessful;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import spoon.reflect.factory.Factory;

import java.util.ArrayList;
import java.util.Collection;

import static junit.framework.Assert.*;

/**
 * Created by marcel on 8/06/14.
 */
public class KnownSosieStrategyTest {

    private static InputProgram inputProgram = null;

    private static ArrayList<Transformation> sosies;

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    @Before
    public void setUp() throws Exception {
        if (inputProgram == null) {
            MavenDependencyResolver dr = new MavenDependencyResolver();
            dr.DependencyResolver(getResourcePath("easymock-light-3.2/pom.xml"));
            Factory factory = new SpoonMetaFactory().buildNewFactory(getResourcePath("easymock-light-3.2"), 5);
            inputProgram = new InputProgram();
            inputProgram.setFactory(factory);
            inputProgram.setSourceCodeDir(getResourcePath("easymock-light-3.2"));
            inputProgram.setPreviousTransformationsPath(getResourcePath("easymock3.2-non-rep-index.json"));
            inputProgram.setTransformationPerRun(5);
            inputProgram.processCodeFragments();
            KnownSosieQuery st = new KnownSosieQuery(inputProgram);
            sosies = st.getSosies();
        }
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

    /**
     * Test incremental sosies with bad status. Arrangement 1
     * @throws Exception
     */
    @Test
    public void testIncrementalSeriesBad1() throws Exception {

        //Expected search graph
        // 5   6   7
        // O   0 - 0  0
        // |   |   |
        // x   x   x  1
        // |   |   |
        // O - x   x  2

        //Set the amount of points we must find
        KnownSosieQuery st = new KnownSosieQuery(inputProgram, sosies);
        st.setCleanSeriesOnly(true);

        //Query three times
        inputProgram.setTransformationPerRun(5);

        //51
        st.query();
        Collection<Transformation> cf51 = st.getTransformations();
        assertEquals(0, st.getLastIncrementalSeries());

        //52
        st.query();
        st.setLastTransformationStatus(AbstractTransformation.COMPILED_FAIL);
        assertEquals(1, st.getLastIncrementalSeries());

        //53
        st.query();
        Collection<Transformation> cf53 = st.getTransformations();
        assertEquals(2, st.getLastIncrementalSeries());


        //63
        inputProgram.setTransformationPerRun(6);
        st.query();
        Collection<Transformation> cf63 = st.getTransformations();
        st.setLastTransformationStatus(AbstractTransformation.COMPILED_FAIL);
        assertEquals(2, st.getLastIncrementalSeries());

        //62 is bad blood

        //61
        st.query();
        Collection<Transformation> cf61 = st.getTransformations();
        assertEquals(0, st.getLastIncrementalSeries());

        try {
            //Query again to simulate that we din't get all the sosies we wanted
            st.query();
            fail();
        } catch (SeveralTriesUnsuccessful e) {
            assertTrue(((QueryException)e.getCauses()[0]).getReason().equals(
                    QueryException.Reasons.UNABLE_TO_FIND_SOSIE_PARENT));
        }

        //71
        inputProgram.setTransformationPerRun(7);
        st.query();
        Collection<Transformation> cf71 = st.getTransformations();
        assertEquals(0, st.getLastIncrementalSeries());

        // 71 and 72 are bad blood

        try {
            st.query();
            fail();
        } catch (SeveralTriesUnsuccessful e) {
            assertTrue(((QueryException)e.getCauses()[0]).getReason().equals(
                    QueryException.Reasons.UNABLE_TO_FIND_SOSIE_PARENT));
        }

        String s51 = "";
        String s61 = "";
        String s71 = "";
        String s53 = "";
        String s63 = "";

        for ( Transformation t : cf51 ) { s51 += t.toString(); }
        for ( Transformation t : cf61 ) { s61 += t.toString(); }
        for ( Transformation t : cf71 ) { s71 += t.toString(); }
        assertTrue(s61.contains(s51));
        assertTrue(s71.contains(s61));

        for ( Transformation t : cf53 ) { s53 += t.toString(); }
        for ( Transformation t : cf63 ) { s63 += t.toString(); }
        assertTrue(s63.contains(s53));
    }

    /**
     * Test incremental sosies with bad status. Arrangement 2
     * @throws Exception
     */
    @Test
    @Ignore
    public void testIncrementalSeriesBad2() throws Exception {

        //Expected search graph
        // 5   6   7
        // O   x - x  0
        // |   |   |
        // x   x   x  1
        // |   |   |
        // O - O   O  2

        //Set the amount of points we must find
        KnownSosieQuery st = new KnownSosieQuery(inputProgram, sosies);
        st.setCleanSeriesOnly(true);

        //Query three times
        inputProgram.setTransformationPerRun(5);

        //51
        st.query();
        Collection<Transformation> cf51 = st.getTransformations();
        assertEquals(0, st.getLastIncrementalSeries());

        //52
        st.query();
        st.setLastTransformationStatus(AbstractTransformation.COMPILED_FAIL);
        assertEquals(1, st.getLastIncrementalSeries());

        //53
        st.query();
        Collection<Transformation> cf53 = st.getTransformations();
        assertEquals(2, st.getLastIncrementalSeries());


        //63
        inputProgram.setTransformationPerRun(6);
        st.query();
        Collection<Transformation> cf63 = st.getTransformations();
        assertEquals(2, st.getLastIncrementalSeries());

        //62 is bad blood

        //61
        st.query();
        Collection<Transformation> cf61 = st.getTransformations();
        st.setLastTransformationStatus(-1);
        assertEquals(0, st.getLastIncrementalSeries());


        //71 and 72 are bad blood

        inputProgram.setTransformationPerRun(7);
        st.query();
        Collection<Transformation> cf73 = st.getTransformations();
        assertEquals(2, st.getLastIncrementalSeries());

        String s51 = "";
        String s53 = "";
        String s61 = "";
        String s63 = "";
        String s73 = "";
        for ( Transformation t : cf51 ) { s51 += t.toString(); }
        for ( Transformation t : cf53 ) { s53 += t.toString(); }
        for ( Transformation t : cf61 ) { s61 += t.toString(); }
        for ( Transformation t : cf63 ) { s63 += t.toString(); }
        for ( Transformation t : cf73 ) { s73 += t.toString(); }

        assertTrue(s63.contains(s53));
        assertTrue(s73.contains(s63));
        assertTrue(s61.contains(s51));
    }
}
