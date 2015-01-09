package fr.inria.diversify.ut.persistence.json;

import fr.inria.diversify.persistence.json.JsonASTDeleteSection;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Created by marodrig on 08/01/2015.
 */
public class JSONASTDeleteTest {

    private static final String TRANSFORMATIONS = "transformations";

    /**
     * Test that creates a "transformation" inside the global object
     */
    @Test
    public void testWriteEmpty() {
        JSONObject o = new JSONObject();
        JsonASTDeleteSection d = new JsonASTDeleteSection();
        d.setOutputObject(o);
        d.write(new ArrayList<>());
        assertTrue(o.has(TRANSFORMATIONS));
    }

    /**
     * Test that writes ASTDelete only and that persist right
     */
    public void testWrite() {

    }


}
