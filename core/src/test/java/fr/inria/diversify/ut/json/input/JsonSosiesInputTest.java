package fr.inria.diversify.ut.json.input;

import com.fasterxml.uuid.UUIDComparator;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.input.JsonHeaderInput;
import fr.inria.diversify.persistence.json.input.JsonSectionInput;
import fr.inria.diversify.persistence.json.input.JsonSosiesInput;
import fr.inria.diversify.persistence.json.output.JsonHeaderOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.ut.MockInputProgram;
import fr.inria.diversify.ut.json.output.JsonHeaderOutputTest;
import fr.inria.diversify.ut.json.output.JsonSosieOutputForUT;
import fr.inria.diversify.ut.json.output.JsonSosieOutputTest;
import mockit.Mocked;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static fr.inria.diversify.ut.json.SectionTestUtils.*;
import static fr.inria.diversify.ut.json.SectionTestUtils.getReaderFromJson;
import static fr.inria.diversify.ut.json.output.JsonSosieOutputTest.*;
import static org.junit.Assert.*;

/**
 * Created by marodrig on 14/01/2015.
 */
public class JsonSosiesInputTest {


    private static final String EMPTY_STR = "";

    public static class CustomSectionInput1 extends JsonSectionInput {
        @Override
        public void read(HashMap<UUID, Transformation> transformations) {     }
    }
    public static class CustomSectionInput extends JsonSectionInput {

        public boolean gotHere;

        @Override
        public void read(HashMap<UUID, Transformation> transformations) {
            gotHere = getJsonObject().has("theObjectName") && getJsonObject().has("theObjectName11");
        }
    }

    /**
     * Test the proper reading of custom sections
     */
    @Test
    public void testReadCustomSections() {
        List<Transformation> transfs = createTransformations(new MockInputProgram());

        JsonSosieOutputForUT out = new JsonSosieOutputForUT(transfs, "/uzr/h0m3/my.jzon",
                "mySrc/pom.xml", "sosie-generator/pom.xml");
        out.setSection(CustomSection.class, new CustomSection("theObjectName"));
        out.setSection(CustomSection1.class, new CustomSection("theObjectName11"));
        out.writeToJsonNow();

        MockInputProgram p = new MockInputProgram();
        //Mock the header section
        JsonSosiesInput input = new JsonSosiesInputForUT(getReaderFromJson(out.getJSONObject()), p);

        //Set two custom sections
        CustomSectionInput a = new CustomSectionInput();
        CustomSectionInput b = new CustomSectionInput();
        input.setSection(CustomSectionInput.class, a);
        input.setSection(CustomSectionInput1.class, b);

        //Read
        input.read();

        //Assert
        assertTrue(a.gotHere);
        assertTrue(b.gotHere);
    }


    /**
     * Test that all sections are properly initialized in every constructor
     */
    @Test
    public void testConstructors() {
        InputProgram p = new InputProgram();
        JsonSosiesInput input = new JsonSosiesInput(getReaderFromJson(new JSONObject()), p);
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
        JsonSosiesInput input = new JsonSosiesInputForUT(getReaderFromJson(out), p); //JsonHeader Mocked
        input.read();

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
        JsonSosiesInput input = new JsonSosiesInputForUT(getReaderFromJson(out.getJSONObject()), p); //Mock the header section

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
