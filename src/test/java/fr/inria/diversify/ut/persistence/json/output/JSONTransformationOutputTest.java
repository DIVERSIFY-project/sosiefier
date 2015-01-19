package fr.inria.diversify.ut.persistence.json.output;

import fr.inria.diversify.persistence.SectionOutput;
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
import java.util.Collection;
import java.util.List;

import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.list;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

/**
 * Test for JSON transformation output
 * <p>
 * Created by marodrig on 08/01/2015.
 */
public class JSONTransformationOutputTest {

    private class MockSection1 extends JsonSectionOutput {
        public boolean flagBeforeAfter = false;
        @Override
        public void before(Collection<Transformation> transformations) {
            assertNotNull(getOutputObject());
            flagBeforeAfter = true;
        }

        @Override
        public void after() {
            assertTrue(flagBeforeAfter);
            flagBeforeAfter = false;
        }
        @Override
        public void write(Transformation transformations) {
            assertNotNull(transformations);

            assertFalse(getOutputObject().has("test"));
            try {
                getOutputObject().put("test", "0");
            } catch (JSONException e) {
                throw new RuntimeException();
            }
        }

    }

    private class MockSection2 extends MockSection1 {

        private String before;
        private String after;

        public MockSection2(String before, String after) {
            this.before = before;
            this.after = after;
        }

        @Override
        public void write(Transformation transformations) {
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

        //Mock sections take care of checking the correct order of calling
        List<SectionOutput> sections = list(new MockSection1(), new MockSection2("0", "1"), new MockSection2("1", "2"));
        JsonTransformationOutput output = new JsonTransformationOutput(new ArrayList<>(), "/test/file", sections);
        output.write();

        //Test that file writer methods where called
        new Verifications() {{
            anyWriter.close();
            times = 1;
        }};

        //Test that after method was called. Before method is asserted in after method
        for ( SectionOutput s : sections ) assertFalse(((MockSection1)s).flagBeforeAfter);
    }
}
