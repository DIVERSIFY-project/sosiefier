package fr.inria.diversify.ut.json;

import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.persistence.json.output.*;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.ut.FakeCodeFragment;
import fr.inria.diversify.ut.json.output.JsonHeaderOutputTest;
import fr.inria.diversify.ut.json.output.JsonSosieOutputForUT;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by marodrig on 09/01/2015.
 */
public class SectionTestUtils {

    public static final UUID TEST_ID_1 = UUID.fromString("de305d54-75b4-431b-adb2-eb6b9e546011"); //From wikipedia
    public static final UUID TEST_ID_2 = UUID.fromString("de305d54-75b4-431b-adb2-eb6b9e546012"); //From wikipedia
    public static final UUID TEST_ID_3 = UUID.fromString("de305d54-75b4-431b-adb2-eb6b9e546013"); //From wikipedia
    public static final UUID TEST_ID_4 = UUID.fromString("de305d54-75b4-431b-adb2-eb6b9e546014"); //From wikipedia

    public static InputStreamReader getReaderFromJson(JSONObject o) {
        return new InputStreamReader(
                new ByteArrayInputStream(o.toString().getBytes(StandardCharsets.UTF_8)));
    }

    public static void writeAssertions(JsonSectionOutput d) throws JSONException {

        JSONObject tr = d.getOutputObject().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        if ( !(d instanceof JsonAstDeleteOutput) ) assertTrue(tr.has(VARIABLE_MAP));

        tr = tr.getJSONObject("transplantationPoint");
        assertEquals(tr.get("position"), "org.class:1");
        assertEquals(tr.get("type"), "CtReturn");
        assertEquals(tr.get("sourcecode"), "return 0");

        tr = d.getOutputObject().getJSONArray(TRANSFORMATIONS).getJSONObject(0).getJSONObject("transplant");
        assertEquals(tr.get("position"), "org.class:1");
        assertEquals(tr.get("type"), "CtReturn");
        assertEquals(tr.get("sourcecode"), "return 0");
    }

    public static void writeOnlyAssertions(JsonSectionOutput d) throws JSONException {
        JSONArray array = d.getOutputObject().getJSONArray(TRANSFORMATIONS);
        assertEquals(1, array.length());
        assertTrue(array.getJSONObject(0).has(TRANSPLANT_POINT));
        assertTrue(array.getJSONObject(0).has(TRANSPLANT));
    }

    public static void doTestWriteEmpty(JsonAstTransformationOutput d, ASTTransformation t) {
        JSONObject o = new JSONObject();
        d.setTransformations(list(t));
        d.write(o);
        assertTrue(o.has(TRANSFORMATIONS));
    }


    public static List<Transformation> list(Transformation... data) {
        return Arrays.asList(data);
    }

    public static List<String> strList(String... data) {
        return Arrays.asList(data);
    }

    /**
     * creates a JSON  object containing a persisted delete transformation
     * @return A JSON object containing the persisted transformation
     * @throws JSONException
     */
    public static JSONObject createDeleteASTTransformationJSON() throws JSONException {
        ASTDelete r = new ASTDelete();
        r.setIndex(TEST_ID_1); //From wikipedia
        r.setStatus(-1);
        r.setTransplantationPoint(new FakeCodeFragment("org.MyClass:1", "ctReturn", "return 0"));
        JsonAstDeleteOutput d = new JsonAstDeleteOutput();
        d.setTransformations(list(r));
        d.write(new JSONObject());
        return d.getOutputObject();
    }

    /**
     * creates a JSON  object containing a persisted delete transformation
     * @return A JSON object containing the persisted transformation
     * @throws JSONException
     */
    public static JSONObject createAddASTTransformationJSON() throws JSONException {
        ASTAdd r = new ASTAdd();
        r.setIndex(TEST_ID_1);
        r.setStatus(-1);
        r.setTransplantationPoint(new FakeCodeFragment("org.MyClass:1", "ctReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.MyOtherClass:10", "ctIf", "if ( int == 0 ) int = 10"));

        JsonAstAddOutput d = new JsonAstAddOutput();
        d.setTransformations(list(r));
        d.write(new JSONObject());
        return d.getOutputObject();
    }


    public static JSONObject createReplaceASTTransformationJSON() {
        ASTReplace r = new ASTReplace();
        r.setIndex(TEST_ID_1);
        r.setStatus(-1);

        r.setTransplantationPoint(new FakeCodeFragment("org.MyClass:1", "ctReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.MyOtherClass:10", "ctIf", "if ( int == 0 ) int = 10"));
        JsonAstReplaceOutput d = new JsonAstReplaceOutput();
        d.setTransformations(list(r));
        d.write(new JSONObject());
        return d.getOutputObject();
    }

    /**
     * Creates a JsonObjec from the JsonSosiesOutput with errors
     *
     * @return
     */
    public static JSONObject createTransformationsJSONObjectWithErrors(InputProgram p) throws JSONException {
        List<Transformation> t = createTransformations(p);
        JsonSosieOutputForUT out = new JsonSosieOutputForUT(t, "/uzr/h0m3/my.jzon",
                JsonHeaderOutputTest.SRC_POM, InputConfiguration.LATEST_GENERATOR_VERSION);
        out.writeToJsonNow(); //We need to mock the File writer so no writing to file is done


        //Introduce some errors
        JSONArray o = out.getJSONObject().getJSONArray(TRANSFORMATIONS);
        o.getJSONObject(0).getJSONObject(TRANSPLANT).put(POSITION, "my.NonExistingClass:90"); //<-error
        o.getJSONObject(1).getJSONObject(TRANSPLANT_POINT).put(SOURCE_CODE, "return   0"); //<- warning


        return out.getJSONObject();
    }

    /**
     * Creates a JsonObjec from the JsonSosiesOutput
     *
     * @return
     */
    public static JSONObject createTransformationsJSONObject(InputProgram p) {
        List<Transformation> t = createTransformations(p);
        JsonSosieOutputForUT out = new JsonSosieOutputForUT(t, "/uzr/h0m3/my.jzon",
                JsonHeaderOutputTest.SRC_POM, InputConfiguration.LATEST_GENERATOR_VERSION);
        out.writeToJsonNow(); //We need to mock the File writer so no writing to file is done
        return out.getJSONObject();
    }

    /**
     * Creates a collection of transformations that matches the fake fragments of the mock program
     * @return
     * @param p
     */
    public static List<Transformation> createTransformations(InputProgram p) {
        ASTAdd add = new ASTAdd();
        add.setIndex(TEST_ID_1);
        add.setStatus(-1);
        add.setTransplantationPoint(p.getCodeFragments().get(0));
        add.setTransplant(p.getCodeFragments().get(1));

        ASTDelete del = new ASTDelete();
        del.setIndex(TEST_ID_2);
        del.setStatus(-2);
        del.setTransplantationPoint(p.getCodeFragments().get(2));

        ASTReplace r = new ASTReplace();
        r.setIndex(TEST_ID_3);
        r.setStatus(0);
        r.setTransplantationPoint(p.getCodeFragments().get(1));
        r.setTransplant(p.getCodeFragments().get(2));

        return list(add, del, r);
    }

    public static void assertEqualsTransformation(Transformation tt, Transformation tt2) {
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

    public static ASTReplace getExample(String param1, String param2) {
        ASTReplace r = new ASTReplace();
        r.setTransplant(new FakeCodeFragment("myOrg.pos:1", "CtTest", "test"));
        r.setTransplantationPoint(new FakeCodeFragment("myOrg.pos:1", "CtTest", "test"));
        r.setFailures(strList(param1, param2));
        return r;
    }

    /**
     * Test the proper creation of the failure dictionary
     * @throws JSONException
     */
    public static void testFailureWrite(JsonAstTransformationOutput ouput) throws JSONException {
        ASTReplace r = SectionTestUtils.getExample("Failure 1", "Failure 2");
        ASTReplace r2 = SectionTestUtils.getExample("Failure 3", "Failure 2");

        JsonFailuresOutput sectionOutput = new JsonFailuresOutput();
        sectionOutput.setTransformations(list(r, r2));
        sectionOutput.write(new JSONObject());

        ouput.setTransformations(list(r, r2));
        ouput.setFailuresDict(sectionOutput.getFailuresDict());
        ouput.write(sectionOutput.getOutputObject());

        JSONArray array = ouput.getOutputObject().getJSONArray(JsonAstTransformationOutput.TRANSFORMATIONS);
        assertEquals(array.getJSONObject(0).getJSONArray(JsonFailuresOutput.FAILURES).get(0), 0);
        assertEquals(array.getJSONObject(0).getJSONArray(JsonFailuresOutput.FAILURES).get(1), 1);
        assertEquals(array.getJSONObject(1).getJSONArray(JsonFailuresOutput.FAILURES).get(0), 2);
        assertEquals(array.getJSONObject(1).getJSONArray(JsonFailuresOutput.FAILURES).get(1), 1);
    }

}
