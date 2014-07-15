package fr.inria.diversify.buildSystem;

import fr.inria.diversify.buildSystem.maven.MavenOutputParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marodrig on 03/07/2014.
 */
public class MavenOutputParserTest {

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    private String[] readFile(String fileName) {

        ArrayList<String> results = new ArrayList<>();
        BufferedReader br = null;

        try {
            String line;
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                results.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        String[] list2 = new String[results.size()];
        return results.toArray(list2);
    }

    private void testParse(String fileName, int expectedStatus) throws Exception {
        MavenOutputParser parser = new MavenOutputParser();
        String[] lines = readFile(getResourcePath(fileName));
        Assert.assertEquals(expectedStatus, parser.parse(lines));
    }

    @Test
    public void testParseBuildFailureInclompleteBuild() throws Exception {
        testParse("maven outputs/build error/incompleteBuild.txt", -2);
    }

    @Test
    public void testParseBuildFailure6() throws Exception {
        MavenOutputParser parser = new MavenOutputParser();
        String[] lines = readFile(getResourcePath("maven outputs/build error/1_buidOutput6.txt"));
        Assert.assertEquals(-2, parser.parse(lines));
    }

    @Test
    public void testParseBuildFailure18() throws Exception {
        MavenOutputParser parser = new MavenOutputParser();
        String[] lines = readFile(getResourcePath("maven outputs/build error/1_buidOutput18.txt"));
        Assert.assertEquals(-2, parser.parse(lines));
    }

    @Test
    public void testParseBuildFailure13() throws Exception {
        MavenOutputParser parser = new MavenOutputParser();
        String[] lines = readFile(getResourcePath("maven outputs/build error/1_buidOutput13.txt"));
        Assert.assertEquals(-2, parser.parse(lines));
    }

    @Test
    public void testParseBuildFailure15() throws Exception {
        MavenOutputParser parser = new MavenOutputParser();
        String[] lines = readFile(getResourcePath("maven outputs/build error/1_buidOutput15.txt"));
        Assert.assertEquals(-2, parser.parse(lines));
    }

    public void testParseTest(String fileName, String[] failed) throws Exception {
        MavenOutputParser parser = new MavenOutputParser();
        String[] lines = readFile(getResourcePath(fileName));
        Assert.assertEquals(-1, parser.parse(lines));
        Assert.assertTrue(failed.length <= parser.getFailedTests().size());
        for (int i = 0; i < failed.length; i++) {
            Assert.assertTrue(parser.getFailedTests().get(i).contains(failed[i]));
        }
    }


    @Test
    public void testParseTestFail1() throws Exception {
        String[] failed = {"testEquivalence", "testNonEquivalentAnnotationsOfSameType"};
        try {
            testParseTest("maven outputs/test failed/1_buidOutput1.txt", failed);
        } catch (Exception e) {
            throw e;
        }
    }

    @Test
    public void testParseTestFail2() throws Exception {
        String[] failed = {"testGetPublicMethod"};
        try {
            testParseTest("maven outputs/test failed/1_buidOutput2.txt", failed);
        } catch (Exception e) {
            throw e;
        }
    }

    @Test
    public void testParseTestFail7() throws Exception {
        String[] failed = {
                "test_getInstance", "test_changeDefault_Locale_DateInstance",
                "testTimeDateDefaults", "testDateDefaults", "testCheckDefaults",
                "testCheckDifferingStyles", "test_changeDefault_Locale_DateTimeInstance", "testTimeDefaults",
                "testShortDateStyleWithLocales"};
        try {
            testParseTest("maven outputs/test failed/1_buidOutput7.txt", failed);
        } catch (Exception e) {
            throw e;
        }
    }

    @Test
    public void testParseTestFail16() throws Exception {
        String[] failed = {"testGetPublicMethod"};
        try {
            testParseTest("maven outputs/test failed/1_buidOutput16.txt", failed);
        } catch (Exception e) {
            throw e;
        }
    }

    @Test
    public void testSuccess4() throws Exception {
        MavenOutputParser parser = new MavenOutputParser();
        String[] lines = readFile(getResourcePath("maven outputs/success/1_buidOutput4.txt"));
        Assert.assertEquals(0, parser.parse(lines));
    }

    @Test
    public void testSuccess12() throws Exception {
        MavenOutputParser parser = new MavenOutputParser();
        String[] lines = readFile(getResourcePath("maven outputs/success/1_buidOutput12.txt"));
        Assert.assertEquals(0, parser.parse(lines));
    }

}
