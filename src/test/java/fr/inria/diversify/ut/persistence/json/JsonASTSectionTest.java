package fr.inria.diversify.ut.persistence.json;

import fr.inria.diversify.persistence.json.output.JsonASTSectionOutput;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by marodrig on 09/01/2015.
 */
public class JsonASTSectionTest {



    /**
     * Test that creates a "transformation" inside the global object
     */
    @Test
    public void testWriteEmpty() {
        SectionTestUtils.doTestWriteEmpty(new JsonASTSectionOutput());
    }

    /**
     * Test that writes values properly to json
     */
    @Test
    public void testWrite() throws JSONException {
        JsonASTSectionOutput d = new JsonASTSectionOutput();
        d.setOutputObject(new JSONObject());
        ASTReplace r = new ASTReplace();
        r.setIndex(10);
        r.setType("adrStmt");
        r.setStatus(-1);
        r.setName("replaceWitgestein");
        d.write(Arrays.asList(new ASTTransformation[]{r}));
        JSONObject tr = d.getOutputObject().getJSONArray(JsonASTSectionOutput.TRANSFORMATIONS).getJSONObject(0);

        assertEquals(tr.get("type"), "adrStmt");
        assertEquals(tr.get("name"), "replaceWitgestein");
        assertEquals((int)tr.get("tindex"), 10);
        assertEquals((int)tr.get("status"), -1);
    }

    /**
     * Test that writes values properly to json
     */
    @Test
    public void testWriteMany() throws JSONException {
        JsonASTSectionOutput d = new JsonASTSectionOutput();
        d.setOutputObject(new JSONObject());
        d.write(Arrays.asList(new ASTTransformation[]{new ASTReplace(), new ASTDelete(), new ASTAdd()}));
        assertEquals(3, d.getOutputObject().getJSONArray(JsonASTSectionOutput.TRANSFORMATIONS).length());
    }


}
