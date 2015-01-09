package fr.inria.diversify.ut.persistence.json;

import fr.inria.diversify.persistence.json.JsonASTSectionOutput;
import fr.inria.diversify.persistence.json.JsonSectionOutput;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by marodrig on 09/01/2015.
 */
public class SectionTestUtils {
    protected static void writeAssertions(JsonSectionOutput d) throws JSONException {
        JSONObject tr = d.getOutputObject().getJSONArray(
                JsonASTSectionOutput.TRANSFORMATIONS).getJSONObject(0).getJSONObject("transplantationPoint");

        assertEquals(tr.get("position"), "org.class:1");
        assertEquals(tr.get("type"), "CtReturn");
        assertEquals(tr.get("sourcecode"), "return 0");

        tr = d.getOutputObject().getJSONArray(
                JsonASTSectionOutput.TRANSFORMATIONS).getJSONObject(0).getJSONObject("transplant");
        assertEquals(tr.get("position"), "org.class:1");
        assertEquals(tr.get("type"), "CtReturn");
        assertEquals(tr.get("sourcecode"), "return 0");
    }

    protected static void writeOnlyAssertions(JsonSectionOutput d) throws JSONException {
        JSONArray array = d.getOutputObject().getJSONArray(JsonASTSectionOutput.TRANSFORMATIONS);
        assertEquals(3, array.length());
        assertTrue(array.getJSONObject(1).has("transplantationPoint"));
        assertFalse(array.getJSONObject(2).has("transplantationPoint"));
        assertFalse(array.getJSONObject(0).has("transplantationPoint"));
        assertTrue(array.getJSONObject(1).has("transplant"));
        assertFalse(array.getJSONObject(2).has("transplant"));
        assertFalse(array.getJSONObject(0).has("transplant"));
    }

    protected static void doTestWriteEmpty(JsonASTSectionOutput d) {
        JSONObject o = new JSONObject();
        d.setOutputObject(o);
        d.write(new ArrayList<>());
        assertTrue(o.has(JsonASTSectionOutput.TRANSFORMATIONS));
    }
}
