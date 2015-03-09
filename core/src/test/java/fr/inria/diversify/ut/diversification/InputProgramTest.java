package fr.inria.diversify.ut.diversification;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.diversification.accessors.SourceAccesor;
import fr.inria.diversify.ut.MockInputProgram;
import fr.inria.diversify.ut.SpoonMetaFactoryTest;
import org.junit.Test;
import spoon.reflect.factory.Factory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URISyntaxException;

import static fr.inria.diversify.ut.SpoonMetaFactoryTest.PROBABLE_FAIL_CAUSE;
import static org.junit.Assert.*;

/**
 * Created by marodrig on 19/01/2015.
 */
public class InputProgramTest {

    /**
     * Test the getCodeFragment method with different levels of threshold by line or value
     */
    @Test
    public void testGetCodeFragment() {

        //*********************************************************************************
        //REMEMBER: MockInput program extract the fragments from FakeFragmentProcessor!!!!!
        //*********************************************************************************

        InputProgram inputProgram = new MockInputProgram();
        inputProgram.processCodeFragments();

        //All fragments are extracted from the FakeFragmentProcessor:

        //Test exact match
        assertEquals("Exact match failed",
                inputProgram.getCodeFragment("org.MyClass:1", "return 0"),
                inputProgram.getCodeFragments().get(0));

        //Test soft match by lines
        assertEquals("Exact soft match by lines failed",
                inputProgram.getCodeFragments().get(0),
                inputProgram.getCodeFragment("org.MyClass:3", "return 0"));

        //Test soft match by search value
        assertEquals("Exact soft match by value failed",
                inputProgram.getCodeFragments().get(1),
                inputProgram.getCodeFragment("org.MyOtherClass:10", "if ( int == 0 )\n int = 10"));

        //Test soft match by search value and lines
        assertEquals("Exact soft match by value and lines failed",
                inputProgram.getCodeFragments().get(1),
                inputProgram.getCodeFragment("org.MyOtherClass:7", "if ( int == 0 )\n int = 10"));

        //Test soft match by search value and lines
        assertNull("Nothing found by lines failed",
                inputProgram.getCodeFragment("org.MyOtherClass:23", "if ( int == 0 )\n int = 10"));

        //Test soft match by search value and lines
        assertNull("Nothing found by value failed",
                inputProgram.getCodeFragment("org.MyClass:1", "someOtherThing = 0"));
    }


    @Test
    public void testFindFragment() {

        //*********************************************************************************
        //REMEMBER: MockInput program extract the fragments from FakeFragmentProcessor!!!!!
        //*********************************************************************************

        InputProgram inputProgram = new MockInputProgram();
        inputProgram.processCodeFragments();

        //Find without line threshold
        assertEquals("Find without line threshold failed",
                inputProgram.getCodeFragments().get(1),
                inputProgram.findCodeFragment("org.MyOtherClass:23", "if ( int == 0 )\n int = 10",
                new SourceAccesor(), Integer.MAX_VALUE, 0.85));

        //Find without value threshold
        assertEquals("Find without value threshold failed",
                inputProgram.getCodeFragments().get(1),
                inputProgram.findCodeFragment("org.MyOtherClass:10", "booFarMar()",
                        new SourceAccesor(), 5, 0));

        //Find without value and line threshold. He will find... something:
        assertNotNull("Find without value and line threshold failed",
                inputProgram.findCodeFragment("org.MyOtherClass:500", "booFarMar()",
                        new SourceAccesor(), Integer.MAX_VALUE, 0));
    }

    /**
     *  Test the proper configuration of the input program
     */
    @Test
    public void testConfigure() throws IOException {

        //Input paths to test proper configuration
        String s = new InputConfigurationTest().crazyPaths().toString();
        InputConfiguration configuration = new InputConfiguration(new ByteArrayInputStream(s.getBytes("UTF-8")));

        InputProgram p = new InputProgram();
        p.configure(configuration);

        assertEquals(p.getRelativeSourceCodeDir(), configuration.getRelativeSourceCodeDir());
        assertEquals(p.getPreviousTransformationsPath(), configuration.getPreviousTransformationPath());
        assertEquals(p.getClassesDir(), configuration.getClassesDir());
        assertEquals(p.getCoverageDir(), configuration.getCoverageDir());
    }

    /**
     * Test the real processing of statements.
     *
     * This is a regression test to check that the default processing of statements does not change
     */
    @Test
    public void testDefaultStatementProcessor() throws IllegalAccessException, InstantiationException, ClassNotFoundException, URISyntaxException {
        Factory f = new SpoonMetaFactoryTest().build();
        InputProgram p = new InputProgram();
        p.setFactory(f);
        p.processCodeFragments();

        //I don't know how many valid statements are really there.
        // This is just a regression test to know when something change!!!!
        assertEquals(PROBABLE_FAIL_CAUSE, 18, p.getCodeFragments().size());
    }

    /**
     * Regression test for p.getRoots()
     *
     * This is a regression test to check that the default processing of statements does not change
     */
    @Test
    public void testGetRoots() throws Exception {
        Factory f = new SpoonMetaFactoryTest().build();
        InputProgram p = new InputProgram();
        p.setFactory(f);
        p.processCodeFragments();
        assertEquals(PROBABLE_FAIL_CAUSE, 1, p.getRoots().size());
    }

    /**
     * Regression test for p.getRoots()
     *
     * This is a regression test to check that the default processing of statements does not change
     */
    /*
    @Test
    public void testInlineConstant() throws IllegalAccessException, InstantiationException, ClassNotFoundException, URISyntaxException {
        Factory f = new SpoonMetaFactoryTest().build();
        InputProgram p = new InputProgram();
        p.setFactory(f);
        p.processCodeFragments();
        assertEquals(1, p.getInlineConstant().size());
    }*/


}
