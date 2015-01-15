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

import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.createTransformations;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by marodrig on 14/01/2015.
 */
public class JsonSosiesInputTest {


    private static final String EMPTY_STR = "";

    @Test(expected = PersistenceException.class)
    public void testReadEmpty() {
        JsonSosiesInput input = new JsonSosiesInput(
                new InputStreamReader(new ByteArrayInputStream(EMPTY_STR.getBytes())));
        input.read();
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
        t.sort((o1, o2) -> o1.getType().compareTo(o2.getType()));
        result.sort((o1, o2) -> o1.getType().compareTo(o2.getType()));

        assertEquals(t.size(), result.size());
        assertEqualsTransformation(t.get(0), result.get(0));
        assertEqualsTransformation(t.get(1), result.get(1));
        assertEqualsTransformation(t.get(2), result.get(2));
    }

    private void assertEqualsTransformation(Transformation tt, Transformation tt2) {
        ASTTransformation t1 = (ASTTransformation) tt;
        ASTTransformation t2 = (ASTTransformation) tt2;

        assertEquals(t1.getStatus(), t2.getStatus());
        assertEquals(t1.getIndex(), t2.getIndex());
        assertEquals(t1.getTransplantationPoint().equalString(), t2.getTransplantationPoint().equalString());
        assertEquals(t1.getClass(), t2.getClass());
        if ( t1 instanceof ASTAdd ) {
            assertEquals(
                    ((ASTAdd)t1).getTransplant().equalString(),
                    ((ASTAdd)t2).getTransplant().equalString());
            assertEquals(
                    ((ASTAdd)t1).getTransplant(),
                    ((ASTAdd)t2).getTransplant());

        } else if ( t1 instanceof ASTReplace) {
            assertEquals(
                    ((ASTReplace)t1).getTransplant().equalString(),
                    ((ASTReplace)t2).getTransplant().equalString());
            assertEquals(
                    ((ASTReplace)t1).getTransplant(),
                    ((ASTReplace)t2).getTransplant());
        }
    }
}
