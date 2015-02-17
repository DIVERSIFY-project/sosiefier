package fr.inria.diversify.ut.json.input;

import com.fasterxml.uuid.UUIDComparator;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.input.JsonHeaderInput;
import fr.inria.diversify.persistence.json.input.JsonSosiesInput;
import fr.inria.diversify.persistence.json.output.JsonHeaderOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.ut.MockInputProgram;
import fr.inria.diversify.ut.json.output.JsonHeaderOutputTest;
import fr.inria.diversify.ut.json.output.JsonSosieOutputForUT;
import mockit.Mocked;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static fr.inria.diversify.ut.json.SectionTestUtils.assertEqualsTransformation;
import static fr.inria.diversify.ut.json.SectionTestUtils.createTransformations;
import static fr.inria.diversify.ut.json.SectionTestUtils.createTransformationsJSONObjectWithErrors;
import static org.junit.Assert.*;

/**
 * Created by marodrig on 14/01/2015.
 */
public class JsonSosiesInputTest {


    private static final String EMPTY_STR = "";

    /**
     * Test that all sections are properly initialized in every constructor
     */
    @Test
    public void testConstructors() {
        InputProgram p = new InputProgram();
        InputStreamReader r = new InputStreamReader(
                new ByteArrayInputStream(EMPTY_STR.getBytes(StandardCharsets.UTF_8)));
        JsonSosiesInput input = new JsonSosiesInput(r, p);
        assertTrue(input.getInputProgram() != null);

        input = new JsonSosiesInput("/uzr/h0m3/my.jzon", p);
        assertTrue(input.getInputProgram() != null);
    }

    /**
     * Test that the json reader propagates errors
     * @throws JSONException
     */
    @Test
    public void testReadPropagateErrors() throws JSONException {

        MockInputProgram p = new MockInputProgram();
        JSONObject out = createTransformationsJSONObjectWithErrors(p);

        //Read the transformations
        InputStreamReader r = new InputStreamReader(
                new ByteArrayInputStream(out.toString().getBytes(StandardCharsets.UTF_8)));
        JsonSosiesInput input = new JsonSosiesInput(r, p);
        //Mock the header section
        input.setSection(JsonHeaderInput.class, new JsonHeaderInputTest.JsonHeaderInputForUT());
        ArrayList<Transformation> result = new ArrayList<>(input.read());

        assertEquals(3, input.getLoadMessages().size());
    }

    /**
     * Test the proper reading of sosies
     */
    @Test
    public void testReadFromSoiesOutput() {
        //Write the transformations
        InputProgram p = new MockInputProgram();
        List<Transformation> t = createTransformations(p);
        JsonSosieOutputForUT out = new JsonSosieOutputForUT(t, "/uzr/h0m3/my.jzon",
                JsonHeaderOutputTest.SRC_POM, InputConfiguration.LATEST_GENERATOR_VERSION);
        out.writeToJsonNow();

        //Read the transformations
        InputStreamReader r = new InputStreamReader(
                new ByteArrayInputStream(out.getJSONObject().toString().getBytes(StandardCharsets.UTF_8)));
        JsonSosiesInput input = new JsonSosiesInput(r, p);

        //Mock the header section
        input.setSection(JsonHeaderInput.class, new JsonHeaderInputTest.JsonHeaderInputForUT());
        ArrayList<Transformation> result = new ArrayList<>(input.read());

        //Assert that the header was properly read
        assertNotNull(input.getHeader());


        //Sort them so we can test pair wise. Sorting by type make sense because
        // there is only Transformation for each type
        //t.sort((o1, o2) -> o1.getIndex() - o2.getIndex());
        //result.sort((o1, o2) -> o1.getIndex() - o2.getIndex());
        final UUIDComparator cuuid = new UUIDComparator();
        Comparator<Transformation> c = new Comparator<Transformation>() {
            @Override
            public int compare(Transformation o1, Transformation o2) {
                return cuuid.compare(o1.getIndex(), o2.getIndex());
            }
        };
        t.sort(c);
        result.sort(c);

        assertEquals(t.size(), result.size());
        assertEqualsTransformation(t.get(0), result.get(0));
        assertEqualsTransformation(t.get(1), result.get(1));
        assertEqualsTransformation(t.get(2), result.get(2));
    }


}
