package fr.inria.diversify.ut.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.input.JsonSosiesInput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.ut.MockInputProgram;
import fr.inria.diversify.ut.persistence.json.output.JsonSosieOutputForUT;
import mockit.Mocked;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.assertEqualsTransformation;
import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.createTransformations;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testReadFromSoiesOutput(@Mocked FileWriter anyWriter) {
        //Write the transformations
        InputProgram p = new MockInputProgram();
        List<Transformation> t = createTransformations(p);
        JsonSosieOutputForUT out = new JsonSosieOutputForUT(t, "/uzr/h0m3/my.jzon");
        out.write(); //We need to mock the File writer so no writing to file is done

        //Read the transformations
        InputStreamReader r = new InputStreamReader(
                new ByteArrayInputStream(out.getJSONObject().toString().getBytes(StandardCharsets.UTF_8)));
        JsonSosiesInput input = new JsonSosiesInput(r, p);
        ArrayList<Transformation> result = new ArrayList<>(input.read());


        //Sort them so we can test pair wise. Sorting by type make sense because
        // there is only Transformation for each type
        t.sort((o1, o2) -> o1.getIndex() - o2.getIndex());
        result.sort((o1, o2) -> o1.getIndex() - o2.getIndex());

        assertEquals(t.size(), result.size());
        assertEqualsTransformation(t.get(0), result.get(0));
        assertEqualsTransformation(t.get(1), result.get(1));
        assertEqualsTransformation(t.get(2), result.get(2));
    }


}
