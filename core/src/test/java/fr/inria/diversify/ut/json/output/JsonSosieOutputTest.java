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
import static org.junit.Assert.*;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonSosieOutputTest {

    /**
     * Test that sosies are given an unique ID
     * @param anyWriter
     * @throws IOException
     * @throws JSONException
     */
    @Test
    public void testSosiesUniqueId(@Mocked FileWriter anyWriter) throws IOException, JSONException {
        List<Transformation> transfs = createTransformations(new MockInputProgram());
        JsonSosieOutputForUT out = new JsonSosieOutputForUT(transfs, "/uzr/h0m3/my.jzon",
                "mySrc/pom.xml", "sosie-generator/pom.xml");
        out.write();

        assertNotEquals(transfs.get(0).getIndex(), transfs.get(1).getIndex());
        assertNotEquals(transfs.get(0).getIndex(), transfs.get(2).getIndex());
        assertNotEquals(transfs.get(1).getIndex(), transfs.get(2).getIndex());
    }

    @Test
    public void testCustomSections() {

    }

    /**
     * Test the writing of sosies normally
     * @param anyWriter A mock for the FileWrite class
     * @throws IOException
     * @throws JSONException
     */
    @Test
    public void testSosieOutput(@Mocked final FileWriter anyWriter) throws IOException, JSONException {

        //Get the transformations
        List<Transformation> transfs = createTransformations(new MockInputProgram());

        //JsonSosieOutputForUT only for Unit TEST!!!!!!
        //Use JsonSosiesOutput intead
        JsonSosieOutputForUT out = new JsonSosieOutputForUT(
                transfs, //Transformations
                "/uzr/h0m3/my.jzon", //Output path for the JSON
                "mySrc/pom.xml",  //POM file of the source project
                "1.0-SNAPSHOT" //Version of the generator
                );
        out.write();

        assertEquals(3, out.getJSONObject().length());
        assertEquals(3, out.getJSONObject().getJSONArray(TRANSFORMATIONS).length());

        new Verifications() {{
            anyWriter.close();
            times = 1;
        }};
    }
}
