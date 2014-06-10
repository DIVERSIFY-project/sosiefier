package fr.inria.diversify.diversification;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Expression;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.transformation.query.searchStrategy.KnownSosieStrategy;
import fr.inria.diversify.transformation.query.searchStrategy.SearchStrategy;
import fr.inria.diversify.transformation.query.searchStrategy.SimpleRandomStrategy;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Test the InputConfiguration class
 *
 * Created by marcel on 8/06/14.
 */
public class InputConfigurationTest {

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    /**
     * Test the behavior when no statement class is specified
     * @throws Exception
     */
    @Test
    public void testCreationDefaultStatement() throws Exception {
        String res = getResourcePath("testPropertyFile.txt");
        InputConfiguration configuration = new InputConfiguration(res);
        CodeFragment cf = configuration.getNewCodeFragment();
        assertTrue(cf instanceof Statement);
    }

    /**
     * Test the behavior when statement class is specified
     * @throws Exception
     */
    @Test
    public void testCreationStatement() throws Exception {
        String res = getResourcePath("testPropertyFileSpecifiedClasses.txt");
        InputConfiguration configuration = new InputConfiguration(res);
        CodeFragment cf = configuration.getNewCodeFragment();
        assertTrue(cf instanceof Expression);
    }

    /**
     * Test the behavior when no statement class is specified
     * @throws Exception
     */
    @Test
    public void testCreationDefaultTransplantPointStrategy() throws Exception {
        String res = getResourcePath("testPropertyFile.txt");
        InputConfiguration configuration = new InputConfiguration(res);
        SearchStrategy se = configuration.getNewTransplantationPointStrategy();
        assertTrue(se instanceof SimpleRandomStrategy);
    }

    /**
     * Test the behavior when statement class is specified
     * @throws Exception
     */
    @Test
    public void testCreationTransplantPointStrategy() throws Exception {
        String res = getResourcePath("testPropertyFileSpecifiedClasses.txt");
        InputConfiguration configuration = new InputConfiguration(res);
        SearchStrategy se = configuration.getNewTransplantationPointStrategy();
        assertTrue(se instanceof KnownSosieStrategy);
    }

}