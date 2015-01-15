package fr.inria.diversify.ut.persistence.json;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.json.output.*;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.ut.FakeCodeFragment;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by marodrig on 09/01/2015.
 */
public class SectionTestUtils {


    public static void writeAssertions(JsonSectionOutput d) throws JSONException {

        JSONObject tr = d.getOutputObject().getJSONArray(TRANSFORMATIONS).getJSONObject(0);
        if ( !(d instanceof JsonASTDeleteOutput) ) assertTrue(tr.has(VARIABLE_MAP));

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

    public static void doTestWriteEmpty(JsonASTSectionOutput d, ASTTransformation t) {
        JSONObject o = new JSONObject();
        d.setOutputObject(o);
        d.before(new ArrayList<>());
        d.store(t);
        assertTrue(o.has(TRANSFORMATIONS));
    }


    public static <T> List<T> list(T... data) {
        return Arrays.asList(data);
    }

    /**
     * creates a JSON  object containing a persisted delete transformation
     * @return A JSON object containing the persisted transformation
     * @throws JSONException
     */
    public static JSONObject createDeleteASTTransformationJSON() throws JSONException {
        JsonASTDeleteOutput d = new JsonASTDeleteOutput();
        d.setOutputObject(new JSONObject());
        ASTDelete r = new ASTDelete();
        r.setIndex(1);
        r.setStatus(-1);
        r.setTransplantationPoint(new FakeCodeFragment("org.MyClass:1", "ctReturn", "return 0"));
        d.store(r);

        return d.getOutputObject();
    }

    /**
     * creates a JSON  object containing a persisted delete transformation
     * @return A JSON object containing the persisted transformation
     * @throws JSONException
     */
    public static JSONObject createAddASTTransformationJSON() throws JSONException {
        JsonASTAddOutput d = new JsonASTAddOutput();
        d.setOutputObject(new JSONObject());
        ASTAdd r = new ASTAdd();
        r.setIndex(1);
        r.setStatus(-1);

        r.setTransplantationPoint(new FakeCodeFragment("org.MyClass:1", "ctReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.MyOtherClass:10", "ctIf", "if ( int == 0 ) int = 10"));
        d.store(r);
        return d.getOutputObject();
    }


    public static JSONObject createReplaceASTTransformationJSON() {
        JsonASTReplaceOutput d = new JsonASTReplaceOutput();
        d.setOutputObject(new JSONObject());
        ASTReplace r = new ASTReplace();
        r.setIndex(1);
        r.setStatus(-1);

        r.setTransplantationPoint(new FakeCodeFragment("org.MyClass:1", "ctReturn", "return 0"));
        r.setTransplant(new FakeCodeFragment("org.MyOtherClass:10", "ctIf", "if ( int == 0 ) int = 10"));
        d.store(r);
        return d.getOutputObject();
    }


    /**
     * Creates a collection of transformations that matches the fake fragments of the mock program
     * @return
     * @param p
     */
    public static List<Transformation> createTransformations(InputProgram p) {
        ASTAdd add = new ASTAdd();
        add.setIndex(0);
        add.setStatus(-1);
        add.setTransplantationPoint(p.getCodeFragments().get(0));
        add.setTransplant(p.getCodeFragments().get(1));

        ASTDelete del = new ASTDelete();
        del.setIndex(0);
        del.setStatus(-2);
        del.setTransplantationPoint(p.getCodeFragments().get(2));

        ASTReplace r = new ASTReplace();
        r.setIndex(0);
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

}
