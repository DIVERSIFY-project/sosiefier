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
            while ( (line = br.readLine()) != null ) {
                results.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        String[] list2 = new String[results.size()];
        return results.toArray(list2);
    }

    @Test
    public void testParseBuildFailure() throws Exception {
        MavenOutputParser parser = new MavenOutputParser();
        String[] lines = readFile(getResourcePath("maven outputs/build error/1_buidOutput6.txt"));
        Assert.assertEquals(-2, parser.parse(lines));

        lines = readFile(getResourcePath("maven outputs/build error/1_buidOutput18.txt"));
        Assert.assertEquals(-2, parser.parse(lines));

        lines = readFile(getResourcePath("maven outputs/build error/1_buidOutput13.txt"));
        Assert.assertEquals(-2, parser.parse(lines));

        lines = readFile(getResourcePath("maven outputs/build error/1_buidOutput15.txt"));
        Assert.assertEquals(-2, parser.parse(lines));
    }

    @Test
    public void testParseTestFail() throws Exception {
        MavenOutputParser parser = new MavenOutputParser();
        String[] lines = readFile(getResourcePath("maven outputs/test failed/1_buidOutput1.txt"));
        Assert.assertEquals(-1, parser.parse(lines));

        lines = readFile(getResourcePath("maven outputs/test failed/1_buidOutput7.txt"));
        Assert.assertEquals(-1, parser.parse(lines));

        lines = readFile(getResourcePath("maven outputs/test failed/1_buidOutput16.txt"));
        Assert.assertEquals(-1, parser.parse(lines));
    }

    @Test
    public void testSuccess() throws Exception {
        MavenOutputParser parser = new MavenOutputParser();
        String[] lines = readFile(getResourcePath("maven outputs/success/1_buidOutput4.txt"));
        Assert.assertEquals(0, parser.parse(lines));

        lines = readFile(getResourcePath("maven outputs/success/1_buidOutput12.txt"));
        Assert.assertEquals(0, parser.parse(lines));

        lines = readFile(getResourcePath("maven outputs/success/1_buidOutput20.txt"));
        Assert.assertEquals(0, parser.parse(lines));
    }
}
