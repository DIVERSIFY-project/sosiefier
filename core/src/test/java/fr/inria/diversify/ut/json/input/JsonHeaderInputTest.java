package fr.inria.diversify.ut.json.input;

import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.persistence.Header;
import fr.inria.diversify.persistence.MavenHeader;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.input.JsonHeaderInput;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.input.JsonSosiesInput.ERROR;
import static fr.inria.diversify.ut.json.output.JsonHeaderOutputTest.generatePOM;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by marodrig on 23/01/2015.
 */
public class JsonHeaderInputTest {

    public static class JsonHeaderInputForUT extends JsonHeaderInput {

        public JsonHeaderInputForUT(InputProgram inputProgram, JSONObject jsonObject) {
            super(inputProgram, jsonObject);
        }

        public JsonHeaderInputForUT() {
            super(null, null);
        }

        @Override
        protected Reader getReader(String pom) {
            return new InputStreamReader(new ByteArrayInputStream(generatePOM(pom).getBytes(StandardCharsets.UTF_8)));
        }
    }

    /**
     * Creates a Good JSON object to read as header
     * @return A JSON object containing a well formed header
     * @throws JSONException
     */
    private JSONObject getGoodJson() throws JSONException {
        JSONObject h = new JSONObject();
        JSONObject o = new JSONObject();

        o.put(Header.TRANSF_COUNT, 2);
        o.put(Header.PROJECT_TYPE, "maven");
        o.put(MavenHeader.GROUP_ID, "fr.irisa.diversify");
        o.put(MavenHeader.ARTIFACT_ID,"generator");
        o.put(MavenHeader.VERSION, "1.2.1");
        o.put(MavenHeader.GENERATOR_VERSION, InputConfiguration.LATEST_GENERATOR_VERSION);
        h.put(Header.HEADER, o);

        return h;
    }

    /**
     * Test that we can read a well formed header without problems of version mismatch
     * @throws JSONException
     */
    @Test
    public void testRead_AllOK() throws JSONException {
        JsonHeaderInputForUT t = new JsonHeaderInputForUT(new InputProgram(), getGoodJson());
        t.read(new HashMap<UUID, Transformation>());
        assertEquals(0, t.getLoadMessages().size());
    }

    /**
     * Test that errors are reported
     * @throws JSONException
     */
    @Test
    public void testRead_Got1Errors() throws JSONException {
        JSONObject o = getGoodJson();
        o.getJSONObject(Header.HEADER).put(MavenHeader.GROUP_ID, "diversify");

        JsonHeaderInputForUT t = new JsonHeaderInputForUT(new InputProgram(), o);
        try {
            t.read(new HashMap<UUID, Transformation>());
        } catch (PersistenceException e) {
            //Do nothing we are testing the proper logging of errors
        }
        assertEquals(2, t.getLoadMessages().size());
        assertEquals(ERROR + " " + JsonHeaderInput.GROUP_ID_DONT_MATCH + ". ", t.getLoadMessages().get(0));
    }

    /**
     * Test that many errors are reported
     * @throws JSONException
     */
    @Test
    public void testRead_Got3Errors() throws JSONException {
        JSONObject o = getGoodJson();
        o.getJSONObject(Header.HEADER).put(MavenHeader.GROUP_ID, "diversify");
        o.getJSONObject(Header.HEADER).put(MavenHeader.ARTIFACT_ID,"generator__");
        o.getJSONObject(Header.HEADER).put(MavenHeader.VERSION, "1.0-SNAPSHOT___");

        JsonHeaderInputForUT t = new JsonHeaderInputForUT(new InputProgram(), o);
        try {
            t.read(new HashMap<UUID, Transformation>());
            fail("should have raised an exception");
        } catch (PersistenceException e) {
            //Yeah!! it raises it!
        }
        assertEquals(4, t.getLoadMessages().size());
        assertEquals(ERROR + " " + JsonHeaderInput.GROUP_ID_DONT_MATCH + ". ", t.getLoadMessages().get(0));
        assertEquals(ERROR + " " + JsonHeaderInput.ARTIFACT_DONT_MATCH + ". ", t.getLoadMessages().get(1));
        assertEquals("WARNING: This project version don't match with the one of the sosies!. " +
                "Expected 1.2.1. Got 1.0-SNAPSHOT___ ", t.getLoadMessages().get(2));
    }

    /**
     * Test that Major versions differences raises an error
     */
    @Test(expected = PersistenceException.class)
    public void testMajorVersionNumberError() throws JSONException {
        JSONObject o = getGoodJson();
        o.getJSONObject(Header.HEADER).put(MavenHeader.VERSION, "2.0-SNAPSHOT");
        JsonHeaderInputForUT t = new JsonHeaderInputForUT(new InputProgram(), o);
        t.read(new HashMap<UUID, Transformation>());
    }

    /**
     * Test that Major versions differences raises an error
     */
    @Test
    public void testMinorVersionNumberWarning() throws JSONException {
        JSONObject o = getGoodJson();
        o.getJSONObject(Header.HEADER).put(MavenHeader.VERSION, "1.0-SNAPSHOT");
        JsonHeaderInputForUT t = new JsonHeaderInputForUT(new InputProgram(), o);
        t.read(new HashMap<UUID, Transformation>());
        assertEquals("WARNING: This project version don't match with the one of the sosies!. " +
                "Expected 1.2.1. Got 1.0-SNAPSHOT", t.getLoadMessages().get(0).trim());
    }
}
