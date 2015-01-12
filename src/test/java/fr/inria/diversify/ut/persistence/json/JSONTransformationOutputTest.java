package fr.inria.diversify.ut.persistence.json;

import fr.inria.diversify.persistence.SectionOuput;
import fr.inria.diversify.persistence.json.output.JsonSectionOutput;
import fr.inria.diversify.persistence.json.output.JsonTransformationOutput;
import fr.inria.diversify.transformation.Transformation;
import mockit.Mocked;
import mockit.Verifications;
import org.json.JSONException;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

/**
 * Test for JSON transformation output
 * <p>
 * Created by marodrig on 08/01/2015.
 */
public class JSONTransformationOutputTest {

    private class FakeInitSection extends JsonSectionOutput {
        @Override
        public void write(Collection<Transformation> transformations) {
            assertNotNull(transformations);
            assertNotNull(getOutputObject());
            assertFalse(getOutputObject().has("test"));
            try {
                getOutputObject().put("test", "0");
            } catch (JSONException e) {
                throw new RuntimeException();
            }
        }
    }

    private class FakeSection extends JsonSectionOutput {

        private String before;
        private String after;


        public FakeSection(String before, String after) {
            this.before = before;
            this.after = after;
        }

        @Override
        public void write(Collection<Transformation> transformations) {
            assertNotNull(transformations);
            assertNotNull(getOutputObject());
            try {
                assertTrue(getOutputObject().getString("test").equals(before));
                getOutputObject().put("test", after);
            } catch (JSONException e) {
                throw new RuntimeException();
            }
        }
    }


    /**
     * Verify that all sections are called in order, the JSON file is passed on as well as the transformations array
     * @param anyWriter
     * @throws IOException
     */
    @Test
    public void testWrite(@Mocked FileWriter anyWriter) throws IOException {
        SectionOuput[] sec = new SectionOuput[]{new FakeInitSection(), new FakeSection("0", "1"), new FakeSection("1", "2")};
        List<SectionOuput> sections = Arrays.asList(sec);
        JsonTransformationOutput output = new JsonTransformationOutput(sections, "/test/file", new ArrayList<>());
        output.write();

        new Verifications() {{
            anyWriter.close();
            times = 1;
        }};
    }

}
