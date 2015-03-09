package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.util.List;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.lang.reflect.Type;

/** 
 * Functional tests that do not fall neatly into any of the existing classification.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class UncategorizedTest extends TestCase {
    private Gson gson = null;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    @Test(timeout = 1000)
    public void testInvalidJsonDeserializationFails_add1455() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidJsonDeserializationFails_add1455");
        try {
            gson.fromJson("adfasdf1112,,,\":", TestTypes.BagOfPrimitives.class);
            gson.fromJson("adfasdf1112,,,\":", TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        try {
            gson.fromJson("{adfasdf1112,,,\":}", TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInvalidJsonDeserializationFails_add1456() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidJsonDeserializationFails_add1456");
        try {
            gson.fromJson("adfasdf1112,,,\":", TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        try {
            gson.fromJson("{adfasdf1112,,,\":}", TestTypes.BagOfPrimitives.class);
            gson.fromJson("{adfasdf1112,,,\":}", TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvalidJsonDeserializationFails() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidJsonDeserializationFails");
        try {
            gson.fromJson("foo", TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        try {
            gson.fromJson("{adfasdf1112,,,\":}", TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvalidJsonDeserializationFails_literalMutation2089() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidJsonDeserializationFails_literalMutation2089");
        try {
            gson.fromJson("adfasdf1112,,,\":", TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        try {
            gson.fromJson("foo", TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectEqualButNotSameSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectEqualButNotSameSerialization");
        TestTypes.ClassOverridingEquals objA = new TestTypes.ClassOverridingEquals();
        TestTypes.ClassOverridingEquals objB = new TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        String json = gson.toJson(objB);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2591,objB,2590,objB.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2592,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStaticFieldsAreNotSerialized() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStaticFieldsAreNotSerialized");
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2600,gson.toJson(target),2599,gson.toJson(target).contains("DEFAULT_VALUE"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGsonInstanceReusableForSerializationAndDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGsonInstanceReusableForSerializationAndDeserialization");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives();
        String json = gson.toJson(bag);
        TestTypes.BagOfPrimitives deserialized = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2588,bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2589,deserialized);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that a custom deserializer is able to return a derived class instance for a
     * base class object. For a motivation for this test, see Issue 37 and
     * http://groups.google.com/group/google-gson/browse_thread/thread/677d56e9976d7761
     */
public void testReturningDerivedClassesDuringDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturningDerivedClassesDuringDeserialization");
        Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new BaseTypeAdapter()).create();
        String json = "foo";
        Base base = gson.fromJson(json, Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2593,(base instanceof com.google.gson.functional.UncategorizedTest.Derived1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2594,com.google.gson.functional.UncategorizedTest.OperationType.OP1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2595,base.opType);
        json = "{\"opType\":\"OP2\"}";
        base = gson.fromJson(json, Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2596,(base instanceof com.google.gson.functional.UncategorizedTest.Derived2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2597,com.google.gson.functional.UncategorizedTest.OperationType.OP2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2598,base.opType);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * This test ensures that a custom deserializer is able to return a derived class instance for a
     * base class object. For a motivation for this test, see Issue 37 and
     * http://groups.google.com/group/google-gson/browse_thread/thread/677d56e9976d7761
     */
public void testReturningDerivedClassesDuringDeserialization_literalMutation2091() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturningDerivedClassesDuringDeserialization_literalMutation2091");
        Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new BaseTypeAdapter()).create();
        String json = "{\"opType\":\"OP1\"}";
        Base base = gson.fromJson(json, Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2593,(base instanceof com.google.gson.functional.UncategorizedTest.Derived1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2594,com.google.gson.functional.UncategorizedTest.OperationType.OP1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2595,base.opType);
        json = "foo";
        base = gson.fromJson(json, Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2596,(base instanceof com.google.gson.functional.UncategorizedTest.Derived2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2597,com.google.gson.functional.UncategorizedTest.OperationType.OP2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2598,base.opType);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that trailing whitespace is ignored.
     * http://code.google.com/p/google-gson/issues/detail?id=302
     */
@Test(timeout = 1000)
    public void testTrailingWhitespace_add1457() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTrailingWhitespace_add1457");
        List<java.lang.Integer> integers = gson.fromJson("[1,2,3]  \n\n  ", new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Integer>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2602,null,2601,java.util.Arrays.asList(1, 2, 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2603,integers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that trailing whitespace is ignored.
     * http://code.google.com/p/google-gson/issues/detail?id=302
     */
public void testTrailingWhitespace() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTrailingWhitespace");
        List<java.lang.Integer> integers = gson.fromJson("foo", new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Integer>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2602,null,2601,java.util.Arrays.asList(1, 2, 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2603,integers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that trailing whitespace is ignored.
     * http://code.google.com/p/google-gson/issues/detail?id=302
     */
@Test(timeout = 1000)
    public void testTrailingWhitespace_remove1205() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTrailingWhitespace_remove1205");
        List<java.lang.Integer> integers = gson.fromJson("[1,2,3]  \n\n  ", new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Integer>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2602,null,2601,java.util.Arrays.asList(1, 2, 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2603,integers);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private enum OperationType {
OP1, OP2;    }

    private static class Base {
        OperationType opType;
    }

    private static class Derived1 extends Base {
        Derived1() {
            opType = OperationType.OP1;
        }
    }

    private static class Derived2 extends Base {
        Derived2() {
            opType = OperationType.OP2;
        }
    }

    private static class BaseTypeAdapter implements JsonDeserializer<Base> {
        public Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            String opTypeStr = json.getAsJsonObject().get("opType").getAsString();
            OperationType opType = OperationType.valueOf(opTypeStr);
            switch (opType) {
                case OP1 :
                    return new Derived1();
                case OP2 :
                    return new Derived2();
            }
            throw new JsonParseException(("unknown type: " + json));
        }
    }
}

