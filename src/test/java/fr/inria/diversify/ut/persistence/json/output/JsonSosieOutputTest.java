package fr.inria.diversify.ut.persistence.json.output;

import fr.inria.diversify.persistence.json.output.JsonSosiesOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.ut.FakeCodeFragment;
import mockit.Mocked;
import mockit.Verifications;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSFORMATIONS;
import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.list;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonSosieOutputTest {

    public class JsonSosiesOutputForTest extends JsonSosiesOutput {

        public JsonSosiesOutputForTest(Collection<Transformation> transformations, String uri) {
            super(transformations, uri);
        }

        public JSONObject getJSONObject() {
            return outputObject;
        }
    }

    @Test
    public void testSosieOutput(@Mocked FileWriter anyWriter) throws IOException, JSONException {
        ASTAdd add = new ASTAdd();
        add.setIndex(0);
        add.setStatus(-1);
        add.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 1"));
        add.setTransplant(new FakeCodeFragment("org.class:10", "CtReturn", "return 2"));

        ASTDelete del = new ASTDelete();
        del.setStatus(-1);
        del.setIndex(1);
        del.setTransplantationPoint(new FakeCodeFragment("org.class:2", "CtReturn", "return 30"));

        ASTReplace r = new ASTReplace();
        r.setStatus(-1);
        r.setIndex(1);
        r.setTransplantationPoint(new FakeCodeFragment("org.class:3", "CtReturn", "return 40"));
        r.setTransplant(new FakeCodeFragment("org.class:4", "CtReturn", "return 50"));

        JsonSosiesOutputForTest out = new JsonSosiesOutputForTest(list(add, del, r), "/uzr/h0m3/my.jzon");
        out.write();

        assertEquals(2, out.getJSONObject().length());
        assertEquals(3, out.getJSONObject().getJSONArray(TRANSFORMATIONS).length());

        new Verifications() {{
            anyWriter.close();
            times = 1;
        }};
    }

}
