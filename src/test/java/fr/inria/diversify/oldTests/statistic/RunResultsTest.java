package fr.inria.diversify.oldTests.statistic;

import fr.inria.diversify.statistic.RunResults;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by marcel on 22/06/14.
 */
public class RunResultsTest {

    protected RunResults createTestResult() {
        RunResults r1 = new RunResults();
        r1.setId(1);
        r1.setStatus(-2);
        ArrayList<String> failedTests = new ArrayList<>();
        failedTests.add("first test");
        failedTests.add("second test");
        r1.setFailedTests(failedTests);

        //A fake json transformations to test the JSON
        JSONArray array = new JSONArray();
        array.put("Foo");
        array.put("Bar");
        r1.setTransformations(array);
        return r1;
    }

    protected void AssertEqual(RunResults r1, RunResults r2) {
        //Test are equal
        Assert.assertEquals(r1.getId(), r2.getId());
        Assert.assertEquals(r1.getStatus(), r2.getStatus());
        Assert.assertEquals(
                r1.getTransformationJSON().toString(),
                r2.getTransformationJSON().toString());
        Assert.assertEquals(
                r1.getFailedTests().size(),
                r2.getFailedTests().size());
    }

    @Test
    public void testToAndFromJson() throws Exception {
        RunResults r1 = createTestResult();

        //To JSON Object
        JSONObject ro = r1.toJSONObject();

        //Back from JSON object
        RunResults r2 = new RunResults();
        r2.fromJSONObject(ro);

        //Test are equal
        AssertEqual(r1, r2);
    }

    @Test
    public void testToAndFromFile() throws Exception {
        RunResults r1 = createTestResult();

        //To JSON Object
        r1.saveToFile("testResult.json");

        //Back from JSON object
        RunResults r2 = new RunResults();
        r2.loadFromFile("testResult.json");

        //Test are equal
        AssertEqual(r1, r2);

        //Clean up
        File f = new File("testResult.json");
        f.delete();
    }

}
