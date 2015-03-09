package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.util.List;
import java.util.Map;
import java.io.StringReader;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Functional tests for that use JsonParser and related Gson methods
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class JsonParserTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    @Test(timeout = 1000)
    public void testParseInvalidJson_add1191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseInvalidJson_add1191");
        try {
            gson.fromJson("[[]", java.lang.Object[].class);
            gson.fromJson("[[]", java.lang.Object[].class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParseInvalidJson() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseInvalidJson");
        try {
            gson.fromJson("foo", java.lang.Object[].class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializingCustomTree_add1186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingCustomTree_add1186");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1697,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializingCustomTree_add1187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingCustomTree_add1187");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        obj.addProperty("intValue", 11);
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1697,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingCustomTree() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingCustomTree");
        JsonObject obj = new JsonObject();
        obj.addProperty("foo", "foo");
        obj.addProperty("intValue", 11);
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1697,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingCustomTree_literalMutation1369() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingCustomTree_literalMutation1369");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1697,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingCustomTree_literalMutation1370() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingCustomTree_literalMutation1370");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("foo", 11);
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1697,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingCustomTree_literalMutation1371() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingCustomTree_literalMutation1371");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 10);
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1697,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializingCustomTree_remove1000() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingCustomTree_remove1000");
        JsonObject obj = new JsonObject();
        obj.addProperty("intValue", 11);
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1697,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializingCustomTree_remove1001() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingCustomTree_remove1001");
        JsonObject obj = new JsonObject();
        obj.addProperty("intValue", 11);
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1697,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadTypeForDeserializingCustomTree_add1180() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadTypeForDeserializingCustomTree_add1180");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        JsonArray array = new JsonArray();
        array.add(obj);
        try {
            gson.fromJson(array, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadTypeForDeserializingCustomTree_add1181() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadTypeForDeserializingCustomTree_add1181");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        obj.addProperty("intValue", 11);
        JsonArray array = new JsonArray();
        array.add(obj);
        try {
            gson.fromJson(array, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadTypeForDeserializingCustomTree_add1182() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadTypeForDeserializingCustomTree_add1182");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        JsonArray array = new JsonArray();
        array.add(obj);
        array.add(obj);
        try {
            gson.fromJson(array, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadTypeForDeserializingCustomTree_add1183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadTypeForDeserializingCustomTree_add1183");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        JsonArray array = new JsonArray();
        array.add(obj);
        try {
            gson.fromJson(array, TestTypes.BagOfPrimitives.class);
            gson.fromJson(array, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadTypeForDeserializingCustomTree() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadTypeForDeserializingCustomTree");
        JsonObject obj = new JsonObject();
        obj.addProperty("foo", "foo");
        obj.addProperty("intValue", 11);
        JsonArray array = new JsonArray();
        array.add(obj);
        try {
            gson.fromJson(array, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadTypeForDeserializingCustomTree_literalMutation1361() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadTypeForDeserializingCustomTree_literalMutation1361");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        JsonArray array = new JsonArray();
        array.add(obj);
        try {
            gson.fromJson(array, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadTypeForDeserializingCustomTree_literalMutation1362() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadTypeForDeserializingCustomTree_literalMutation1362");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("foo", 11);
        JsonArray array = new JsonArray();
        array.add(obj);
        try {
            gson.fromJson(array, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadTypeForDeserializingCustomTree_literalMutation1363() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadTypeForDeserializingCustomTree_literalMutation1363");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 10);
        JsonArray array = new JsonArray();
        array.add(obj);
        try {
            gson.fromJson(array, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadTypeForDeserializingCustomTree_remove995() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadTypeForDeserializingCustomTree_remove995");
        JsonObject obj = new JsonObject();
        obj.addProperty("intValue", 11);
        JsonArray array = new JsonArray();
        array.add(obj);
        try {
            gson.fromJson(array, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadTypeForDeserializingCustomTree_remove996() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadTypeForDeserializingCustomTree_remove996");
        JsonObject obj = new JsonObject();
        obj.addProperty("intValue", 11);
        JsonArray array = new JsonArray();
        array.add(obj);
        try {
            gson.fromJson(array, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadTypeForDeserializingCustomTree_remove997() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadTypeForDeserializingCustomTree_remove997");
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        JsonArray array = new JsonArray();
        try {
            gson.fromJson(array, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForCustomDeserializerCustomTree_add1169() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_add1169");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForCustomDeserializerCustomTree_add1170() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_add1170");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForCustomDeserializerCustomTree_add1171() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_add1171");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        obj.addProperty("intValue", 11);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForCustomDeserializerCustomTree_add1172() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_add1172");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        obj.add("longValue", array);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForCustomDeserializerCustomTree_add1173() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_add1173");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForCustomDeserializerCustomTree() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("foo"));
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForCustomDeserializerCustomTree_literalMutation1348() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_literalMutation1348");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("foo", "foo");
        obj.addProperty("intValue", 11);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForCustomDeserializerCustomTree_literalMutation1349() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_literalMutation1349");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForCustomDeserializerCustomTree_literalMutation1350() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_literalMutation1350");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("foo", 11);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForCustomDeserializerCustomTree_literalMutation1351() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_literalMutation1351");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 10);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForCustomDeserializerCustomTree_literalMutation1352() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_literalMutation1352");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        obj.add("foo", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForCustomDeserializerCustomTree_remove986() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_remove986");
        JsonArray array = new JsonArray();
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForCustomDeserializerCustomTree_remove987() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_remove987");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("intValue", 11);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForCustomDeserializerCustomTree_remove988() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_remove988");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("intValue", 11);
        obj.add("longValue", array);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForCustomDeserializerCustomTree_remove989() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForCustomDeserializerCustomTree_remove989");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject obj = new JsonObject();
        obj.addProperty("stringValue", "foo");
        obj.addProperty("intValue", 11);
        try {
            gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForDeserializingCustomTree_add1174() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_add1174");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForDeserializingCustomTree_add1175() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_add1175");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForDeserializingCustomTree_add1176() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_add1176");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForDeserializingCustomTree_add1177() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_add1177");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForDeserializingCustomTree_add1178() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_add1178");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForDeserializingCustomTree_add1179() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_add1179");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForDeserializingCustomTree() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("foo"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForDeserializingCustomTree_literalMutation1354() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_literalMutation1354");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("foo", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForDeserializingCustomTree_literalMutation1355() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_literalMutation1355");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForDeserializingCustomTree_literalMutation1356() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_literalMutation1356");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("foo", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForDeserializingCustomTree_literalMutation1357() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_literalMutation1357");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 10);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForDeserializingCustomTree_literalMutation1358() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_literalMutation1358");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("foo", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadFieldTypeForDeserializingCustomTree_literalMutation1359() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_literalMutation1359");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("foo", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForDeserializingCustomTree_remove990() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_remove990");
        JsonArray array = new JsonArray();
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForDeserializingCustomTree_remove991() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_remove991");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForDeserializingCustomTree_remove992() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_remove992");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive1", primitive1);
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForDeserializingCustomTree_remove993() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_remove993");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadFieldTypeForDeserializingCustomTree_remove994() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadFieldTypeForDeserializingCustomTree_remove994");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive("blah"));
        JsonObject primitive1 = new JsonObject();
        primitive1.addProperty("string", "foo");
        primitive1.addProperty("intValue", 11);
        JsonObject obj = new JsonObject();
        obj.add("primitive2", array);
        try {
            gson.fromJson(obj, TestTypes.Nested.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testChangingCustomTreeAndDeserializing_add1184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChangingCustomTreeAndDeserializing_add1184");
        StringReader json = new StringReader("{\'stringValue\':\'no message\',\'intValue\':10,\'longValue\':20}");
        JsonObject obj = ((JsonObject)(new JsonParser().parse(json)));
        obj.remove("stringValue");
        obj.remove("stringValue");
        obj.addProperty("stringValue", "fooBar");
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,target.longValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1695,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testChangingCustomTreeAndDeserializing_add1185() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChangingCustomTreeAndDeserializing_add1185");
        StringReader json = new StringReader("{\'stringValue\':\'no message\',\'intValue\':10,\'longValue\':20}");
        JsonObject obj = ((JsonObject)(new JsonParser().parse(json)));
        obj.remove("stringValue");
        obj.addProperty("stringValue", "fooBar");
        obj.addProperty("stringValue", "fooBar");
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,target.longValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1695,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testChangingCustomTreeAndDeserializing() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChangingCustomTreeAndDeserializing");
        StringReader json = new StringReader("foo");
        JsonObject obj = ((JsonObject)(new JsonParser().parse(json)));
        obj.remove("stringValue");
        obj.addProperty("stringValue", "fooBar");
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,target.longValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1695,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testChangingCustomTreeAndDeserializing_literalMutation1365() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChangingCustomTreeAndDeserializing_literalMutation1365");
        StringReader json = new StringReader("{\'stringValue\':\'no message\',\'intValue\':10,\'longValue\':20}");
        JsonObject obj = ((JsonObject)(new JsonParser().parse(json)));
        obj.remove("foo");
        obj.addProperty("stringValue", "fooBar");
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,target.longValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1695,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testChangingCustomTreeAndDeserializing_literalMutation1366() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChangingCustomTreeAndDeserializing_literalMutation1366");
        StringReader json = new StringReader("{\'stringValue\':\'no message\',\'intValue\':10,\'longValue\':20}");
        JsonObject obj = ((JsonObject)(new JsonParser().parse(json)));
        obj.remove("stringValue");
        obj.addProperty("foo", "fooBar");
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,target.longValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1695,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testChangingCustomTreeAndDeserializing_literalMutation1367() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChangingCustomTreeAndDeserializing_literalMutation1367");
        StringReader json = new StringReader("{\'stringValue\':\'no message\',\'intValue\':10,\'longValue\':20}");
        JsonObject obj = ((JsonObject)(new JsonParser().parse(json)));
        obj.remove("stringValue");
        obj.addProperty("stringValue", "foo");
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,target.longValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1695,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testChangingCustomTreeAndDeserializing_remove998() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChangingCustomTreeAndDeserializing_remove998");
        StringReader json = new StringReader("{\'stringValue\':\'no message\',\'intValue\':10,\'longValue\':20}");
        JsonObject obj = ((JsonObject)(new JsonParser().parse(json)));
        obj.addProperty("stringValue", "fooBar");
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,target.longValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1695,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testChangingCustomTreeAndDeserializing_remove999() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testChangingCustomTreeAndDeserializing_remove999");
        StringReader json = new StringReader("{\'stringValue\':\'no message\',\'intValue\':10,\'longValue\':20}");
        JsonObject obj = ((JsonObject)(new JsonParser().parse(json)));
        obj.remove("stringValue");
        TestTypes.BagOfPrimitives target = gson.fromJson(obj, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1693,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,target.longValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1695,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExtraCommasInArrays() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExtraCommasInArrays");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1699,null,1698,list("a", null, "b", null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1701,gson,1700,gson.fromJson("[a,,b,,]", type));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1703,null,1702,list(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,gson,1704,gson.fromJson("[,]", type));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1707,null,1706,list("a", null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1709,gson,1708,gson.fromJson("[a,]", type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExtraCommasInArrays_remove1002() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExtraCommasInArrays_remove1002");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1699,null,1698,list("a", null, "b", null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1701,gson,1700,gson.fromJson("[a,,b,,]", type));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1703,null,1702,list(null, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1705,gson,1704,gson.fromJson("[,]", type));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1707,null,1706,list("a", null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1709,gson,1708,gson.fromJson("[a,]", type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExtraCommasInMaps_add1189() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExtraCommasInMaps_add1189");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        try {
            gson.fromJson("{a:b,}", type);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExtraCommasInMaps_add1190() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExtraCommasInMaps_add1190");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        try {
            gson.fromJson("{a:b,}", type);
            gson.fromJson("{a:b,}", type);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExtraCommasInMaps() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExtraCommasInMaps");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        try {
            gson.fromJson("foo", type);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExtraCommasInMaps_remove1003() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExtraCommasInMaps_remove1003");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        try {
            gson.fromJson("{a:b,}", type);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private <T>List<T> list(T... elements) {
        return java.util.Arrays.asList(elements);
    }
}

