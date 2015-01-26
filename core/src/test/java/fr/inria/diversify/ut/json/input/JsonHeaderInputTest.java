package fr.inria.diversify.ut.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.Header;
import fr.inria.diversify.persistence.MavenHeader;
import fr.inria.diversify.persistence.json.input.JsonHeaderInput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.ut.json.output.JsonHeaderOutputTest;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import static fr.inria.diversify.ut.json.output.JsonHeaderOutputTest.generatePOM;
import static org.junit.Assert.assertEquals;

/**
 * Created by marodrig on 23/01/2015.
 */
public class JsonHeaderInputTest {

    public class JsonHeaderInputForTest extends JsonHeaderInput {

        public JsonHeaderInputForTest(InputProgram inputProgram, JSONObject jsonObject) {
            super(inputProgram, jsonObject);
        }

        @Override
        protected Reader getReader(String pom) {
            return new InputStreamReader(new ByteArrayInputStream(generatePOM().getBytes(StandardCharsets.UTF_8)));
        }
    }

    private JSONObject getGoodJson() throws JSONException {
        JSONObject h = new JSONObject();
        JSONObject o = new JSONObject();

        o.put(Header.TRANSF_COUNT, 2);
        o.put(Header.PROJECT_TYPE, "maven");
        o.put(MavenHeader.GROUP_ID, "fr.irisa.diversify");
        o.put(MavenHeader.ARTIFACT_ID,"generator");
        o.put(MavenHeader.VERSION, "1.0-SNAPSHOT");
        h.put(Header.HEADER, o);

        return h;
    }

    @Test
    public void testRead_AllOK() throws JSONException {
        JsonHeaderInputForTest t = new JsonHeaderInputForTest(new InputProgram(), getGoodJson());
        t.read(new HashMap<Integer, Transformation>());
        assertEquals(0, t.getErrors().size());
    }

    @Test
    public void testRead_Got1Errors() throws JSONException {
        JSONObject o = getGoodJson();
        o.getJSONObject(Header.HEADER).put(MavenHeader.GROUP_ID, "diversify");

        JsonHeaderInputForTest t = new JsonHeaderInputForTest(new InputProgram(), o);
        t.read(new HashMap<Integer, Transformation>());
        assertEquals(1, t.getErrors().size());
        assertEquals(JsonHeaderInput.GROUP_ID_DONT_MATCH, ((List<String>) t.getErrors()).get(0));
    }

    @Test
    public void testRead_Got3Errors() throws JSONException {
        JSONObject o = getGoodJson();
        o.getJSONObject(Header.HEADER).put(MavenHeader.GROUP_ID, "diversify");
        o.getJSONObject(Header.HEADER).put(MavenHeader.ARTIFACT_ID,"generator__");
        o.getJSONObject(Header.HEADER).put(MavenHeader.VERSION, "1.0-SNAPSHOT___");

        JsonHeaderInputForTest t = new JsonHeaderInputForTest(new InputProgram(), o);
        t.read(new HashMap<Integer, Transformation>());
        assertEquals(3, t.getErrors().size());
        assertEquals(JsonHeaderInput.GROUP_ID_DONT_MATCH, ((List<String>) t.getErrors()).get(0));
        assertEquals(JsonHeaderInput.ARTIFACT_DONT_MATCH, ((List<String>) t.getErrors()).get(1));
        assertEquals(JsonHeaderInput.VERSION_DONT_MATCH, ((List<String>) t.getErrors()).get(2));
    }
}
