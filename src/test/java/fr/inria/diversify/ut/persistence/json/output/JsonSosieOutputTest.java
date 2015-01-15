package fr.inria.diversify.ut.persistence.json.output;

import fr.inria.diversify.ut.MockInputProgram;
import mockit.Mocked;
import mockit.Verifications;
import org.json.JSONException;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSFORMATIONS;
import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.createTransformations;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonSosieOutputTest {

    @Test
    public void testSosieOutput(@Mocked FileWriter anyWriter) throws IOException, JSONException {
        JsonSosieOutputForUT out = new JsonSosieOutputForUT(
                createTransformations(new MockInputProgram()), "/uzr/h0m3/my.jzon");
        out.write();

        assertEquals(2, out.getJSONObject().length());
        assertEquals(3, out.getJSONObject().getJSONArray(TRANSFORMATIONS).length());

        new Verifications() {{
            anyWriter.close();
            times = 1;
        }};
    }

}
