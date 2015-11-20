package fr.inria.diversify.ut.diversification;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Expression;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.runner.InputConfiguration;
import mockit.Expectations;
import mockit.Mocked;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test the InputConfiguration class
 * <p>
 * Created by marcel on 8/06/14.
 */
public class InputConfigurationTest {

    /**
     * Test the behavior when no statement class is specified
     *
     * @throws Exception
     */
    @Test
    public void testCreationDefaultStatement() throws Exception {
        String s = " project=C:/MarcelStuff/projects/DIVERSE/programs to sosiefy/junit";
        InputConfiguration configuration = new InputConfiguration(new ByteArrayInputStream(s.getBytes("UTF-8")));
        CodeFragment cf = configuration.getNewCodeFragment();
        assertTrue(cf instanceof Statement);
    }

    /**
     * Test the behavior when statement class is specified
     *
     * @throws Exception
     */
    @Test
    public void testCreationStatement() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("processor=fr.inria.diversify.codeFragmentProcessor.ExpressionProcessor\n")
                .append("transplant.point.search.strategy=fr.inria.diversify.transformation.query.KnownSosieStrategy");
        InputConfiguration configuration = new InputConfiguration(new ByteArrayInputStream(sb.toString().getBytes("UTF-8")));
        CodeFragment cf = configuration.getNewCodeFragment();
        assertTrue(cf instanceof Expression);
    }

    /**
     * Return some crazy path to test with
     * @return
     */
    public StringBuilder crazyPaths() {
        //Some crazy paths so the posibility that they exists gets reduced
        StringBuilder sb = new StringBuilder();
        sb.append("project=../pr0j3cts/kily009\n")
                .append("transformations=../tr4nsf0r/kily009.json\n")
                .append("root.path=/uzr/h0me");
        return sb;
    }

    /**
     * Test checking. Path are invalid
     * <p>
     * In this case for project with stupid name Kili009
     *
     * @throws IOException
     */
    @Test
    public void testCheckInvalidPaths() throws IOException {
        InputConfiguration configuration =
                new InputConfiguration(new ByteArrayInputStream(crazyPaths().toString().getBytes("UTF-8")));
        assertFalse(configuration.validate());
    }

    /**
     * Test turning relative path to absolute using configuration file absolute path as root
     *
     * @throws IOException
     */
    @Test()
    public void testValidationPasses(@Mocked final File anyFile) throws IOException {

        new Expectations() {{
            anyFile.exists(); result = true;
        }};

        InputConfiguration configuration =
                new InputConfiguration(new ByteArrayInputStream(crazyPaths().toString().getBytes("UTF-8")));
        assertTrue(configuration.validate());
    }

    /**
     * Test turning relative path to absolute using root given by params
     */
    @Test
    public void testRelativePathsToAbsolute_SetRoot() throws IOException {
        InputConfiguration configuration =
                new InputConfiguration(new ByteArrayInputStream(crazyPaths().toString().getBytes("UTF-8")));
        assertEquals("/uzr/pr0j3cts/kily009", configuration.getProjectPath());
    }

}
