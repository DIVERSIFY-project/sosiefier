package fr.inria.diversify.buildSystem;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by marodrig on 18/06/2014.
 */
public class MavenBuilder {

    @Test
    public void testParseTracer() {
        Pattern pattern = Pattern.compile("Tests run:(\\s*)(\\d+),(\\s*)Failures:(\\s*)(\\d+),(\\s*)Errors:(\\s*)(\\d+),(\\s*)Skipped:(\\s*)(\\d+)");
        Matcher m = pattern.matcher("Tests run: 829, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.084 sec - in org.junit.tests.AllTests\n");
        Assert.assertTrue(m.find());
    }

    @Test
    public void testParseError() {
        Pattern pattern = Pattern.compile("(\\w+)\\(((\\w+\\.)*\\w+)\\)\\s+Time elapsed:\\s+((\\d+\\.)?\\d+)\\s+sec\\s+<<<\\s+((FAILURE)|(ERROR))!");
        Matcher m = pattern.matcher("Tests run: 829, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 9.075 sec <<< FAILURE! - in org.junit.tests.AllTests");
        Matcher m2 = pattern.matcher("testFail(junit.tests.framework.AssertTest)  Time elapsed: 0.005 sec  <<< ERROR!");

        Assert.assertTrue(m.find() && m2.find());
    }
}
