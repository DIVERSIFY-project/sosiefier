package fr.inria.diversify.ut.json.output;

import fr.inria.diversify.persistence.json.output.JsonHeaderOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.ut.MockInputProgram;
import mockit.Mocked;
import mockit.Verifications;
import org.json.JSONException;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSFORMATIONS;
import static fr.inria.diversify.ut.json.SectionTestUtils.createTransformations;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonSosieOutputTest {

    @Test
    public void testSosiesUniqueId(@Mocked FileWriter anyWriter) throws IOException, JSONException {
        List<Transformation> transfs = createTransformations(new MockInputProgram());
        JsonSosieOutputForUT out = new JsonSosieOutputForUT(transfs, "/uzr/h0m3/my.jzon",
                "mySrc/pom.xml", "sosie-generator/pom.xml");
        out.write();

        assertEquals(transfs.get(0).getIndex(), 0);
        assertEquals(transfs.get(1).getIndex(), 1);
        assertEquals(transfs.get(2).getIndex(), 2);
    }

    @Test
    public void testSosieOutput(@Mocked final FileWriter anyWriter) throws IOException, JSONException {

        //Get the transformations
        List<Transformation> transfs = createTransformations(new MockInputProgram());

        //JsonSosieOutputForUT only for Unit TEST!!!!!!
        //Use JsonSosiesOutput intead
        JsonSosieOutputForUT out = new JsonSosieOutputForUT(transfs, "/uzr/h0m3/my.jzon",
                "mySrc/pom.xml", "sosie-generator/pom.xml");
        out.write();

        assertEquals(3, out.getJSONObject().length());
        assertEquals(3, out.getJSONObject().getJSONArray(TRANSFORMATIONS).length());

        new Verifications() {{
            anyWriter.close();
            times = 1;
        }};
    }
}
