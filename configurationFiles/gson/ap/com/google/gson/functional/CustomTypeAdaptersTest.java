package com.google.gson.functional;

import java.util.Date;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.HashSet;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.util.Map;
import java.util.Set;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Functional tests for the support of custom serializer and deserializers.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CustomTypeAdaptersTest extends TestCase {
    private GsonBuilder builder;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        builder = new GsonBuilder();
    }

    @Test(timeout = 1000)
    public void testCustomSerializers_add1029() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializers_add1029");
        Gson gson = builder.registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public JsonElement serialize(TestTypes.ClassWithCustomTypeConverter src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,gson,1144,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializers_add1030() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializers_add1030");
        Gson gson = builder.registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public JsonElement serialize(TestTypes.ClassWithCustomTypeConverter src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,gson,1144,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializers_add1031() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializers_add1031");
        Gson gson = builder.registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public JsonElement serialize(TestTypes.ClassWithCustomTypeConverter src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,gson,1144,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializers() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializers");
        Gson gson = builder.registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public JsonElement serialize(TestTypes.ClassWithCustomTypeConverter src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("foo", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,gson,1144,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializers_literalMutation1080() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializers_literalMutation1080");
        Gson gson = builder.registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public JsonElement serialize(TestTypes.ClassWithCustomTypeConverter src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("bag", 6);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,gson,1144,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializers_literalMutation1081() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializers_literalMutation1081");
        Gson gson = builder.registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public JsonElement serialize(TestTypes.ClassWithCustomTypeConverter src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("foo", 25);
                return json;
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,gson,1144,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializers_literalMutation1082() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializers_literalMutation1082");
        Gson gson = builder.registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public JsonElement serialize(TestTypes.ClassWithCustomTypeConverter src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 24);
                return json;
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,gson,1144,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializers_remove855() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializers_remove855");
        Gson gson = builder.registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public JsonElement serialize(TestTypes.ClassWithCustomTypeConverter src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,gson,1144,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializers_remove856() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializers_remove856");
        Gson gson = builder.registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public JsonElement serialize(TestTypes.ClassWithCustomTypeConverter src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,gson,1144,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializers_remove857() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializers_remove857");
        Gson gson = builder.registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public JsonElement serialize(TestTypes.ClassWithCustomTypeConverter src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1145,gson,1144,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomDeserializers_add1025() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializers_add1025");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonDeserializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public TestTypes.ClassWithCustomTypeConverter deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
                JsonObject jsonObject = json.getAsJsonObject();
                int value = jsonObject.get("bag").getAsInt();
                return new TestTypes.ClassWithCustomTypeConverter(new TestTypes.BagOfPrimitives(value , value , false , "") , value);
            }
        }).create();
        String json = "{\"bag\":5,\"value\":25}";
        TestTypes.ClassWithCustomTypeConverter target = gson.fromJson(json, TestTypes.ClassWithCustomTypeConverter.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,target.getBag(),1134,target.getBag().getIntValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomDeserializers() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializers");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonDeserializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public TestTypes.ClassWithCustomTypeConverter deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
                JsonObject jsonObject = json.getAsJsonObject();
                int value = jsonObject.get("foo").getAsInt();
                return new TestTypes.ClassWithCustomTypeConverter(new TestTypes.BagOfPrimitives(value , value , false , "") , value);
            }
        }).create();
        String json = "{\"bag\":5,\"value\":25}";
        TestTypes.ClassWithCustomTypeConverter target = gson.fromJson(json, TestTypes.ClassWithCustomTypeConverter.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,target.getBag(),1134,target.getBag().getIntValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomDeserializers_literalMutation1070() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializers_literalMutation1070");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonDeserializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public TestTypes.ClassWithCustomTypeConverter deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
                JsonObject jsonObject = json.getAsJsonObject();
                int value = jsonObject.get("bag").getAsInt();
                return new TestTypes.ClassWithCustomTypeConverter(new TestTypes.BagOfPrimitives(value , value , false , "") , value);
            }
        }).create();
        String json = "{\"bag\":5,\"value\":25}";
        TestTypes.ClassWithCustomTypeConverter target = gson.fromJson(json, TestTypes.ClassWithCustomTypeConverter.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,target.getBag(),1134,target.getBag().getIntValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomDeserializers_literalMutation1071() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializers_literalMutation1071");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonDeserializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public TestTypes.ClassWithCustomTypeConverter deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
                JsonObject jsonObject = json.getAsJsonObject();
                int value = jsonObject.get("bag").getAsInt();
                return new TestTypes.ClassWithCustomTypeConverter(new TestTypes.BagOfPrimitives(value , value , false , "foo") , value);
            }
        }).create();
        String json = "{\"bag\":5,\"value\":25}";
        TestTypes.ClassWithCustomTypeConverter target = gson.fromJson(json, TestTypes.ClassWithCustomTypeConverter.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,target.getBag(),1134,target.getBag().getIntValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomDeserializers_literalMutation1072() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializers_literalMutation1072");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonDeserializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public TestTypes.ClassWithCustomTypeConverter deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
                JsonObject jsonObject = json.getAsJsonObject();
                int value = jsonObject.get("bag").getAsInt();
                return new TestTypes.ClassWithCustomTypeConverter(new TestTypes.BagOfPrimitives(value , value , false , "") , value);
            }
        }).create();
        String json = "foo";
        TestTypes.ClassWithCustomTypeConverter target = gson.fromJson(json, TestTypes.ClassWithCustomTypeConverter.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,target.getBag(),1134,target.getBag().getIntValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomDeserializers_remove851() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializers_remove851");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.ClassWithCustomTypeConverter.class, new JsonDeserializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public TestTypes.ClassWithCustomTypeConverter deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
                JsonObject jsonObject = json.getAsJsonObject();
                int value = jsonObject.get("bag").getAsInt();
                return new TestTypes.ClassWithCustomTypeConverter(new TestTypes.BagOfPrimitives(value , value , false , "") , value);
            }
        }).create();
        String json = "{\"bag\":5,\"value\":25}";
        TestTypes.ClassWithCustomTypeConverter target = gson.fromJson(json, TestTypes.ClassWithCustomTypeConverter.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1135,target.getBag(),1134,target.getBag().getIntValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disable_testCustomSerializersOfSelf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testCustomSerializersOfSelf");
        Gson gson = createGsonObjectWithFooTypeAdapter();
        Gson basicGson = new Gson();
        Foo newFooObject = new Foo(0 , 2L);
        String jsonFromCustomSerializer = gson.toJson(newFooObject);
        String jsonFromGson = basicGson.toJson(newFooObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1107,jsonFromGson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1108,jsonFromCustomSerializer);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disable_testCustomSerializersOfSelf_literalMutation1029() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testCustomSerializersOfSelf_literalMutation1029");
        Gson gson = createGsonObjectWithFooTypeAdapter();
        Gson basicGson = new Gson();
        Foo newFooObject = new Foo(1 , 3L);
        String jsonFromCustomSerializer = gson.toJson(newFooObject);
        String jsonFromGson = basicGson.toJson(newFooObject);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1107,jsonFromGson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1108,jsonFromCustomSerializer);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disable_testCustomDeserializersOfSelf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testCustomDeserializersOfSelf");
        Gson gson = createGsonObjectWithFooTypeAdapter();
        Gson basicGson = new Gson();
        Foo expectedFoo = new Foo(2 , 2L);
        String json = basicGson.toJson(expectedFoo);
        Foo newFooObject = gson.fromJson(json, Foo.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1103,expectedFoo.key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1104,newFooObject.key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1105,expectedFoo.value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1106,newFooObject.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disable_testCustomDeserializersOfSelf_literalMutation1027() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disable_testCustomDeserializersOfSelf_literalMutation1027");
        Gson gson = createGsonObjectWithFooTypeAdapter();
        Gson basicGson = new Gson();
        Foo expectedFoo = new Foo(1 , 3L);
        String json = basicGson.toJson(expectedFoo);
        Foo newFooObject = gson.fromJson(json, Foo.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1103,expectedFoo.key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1104,newFooObject.key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1105,expectedFoo.value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1106,newFooObject.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomNestedSerializers_add1027() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomNestedSerializers_add1027");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.BagOfPrimitives.class, new JsonSerializer<com.google.gson.common.TestTypes.BagOfPrimitives>() {
            public JsonElement serialize(TestTypes.BagOfPrimitives src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive(6);
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1139,gson,1138,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomNestedSerializers() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomNestedSerializers");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.BagOfPrimitives.class, new JsonSerializer<com.google.gson.common.TestTypes.BagOfPrimitives>() {
            public JsonElement serialize(TestTypes.BagOfPrimitives src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive(5);
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1139,gson,1138,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomNestedSerializers_remove853() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomNestedSerializers_remove853");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.BagOfPrimitives.class, new JsonSerializer<com.google.gson.common.TestTypes.BagOfPrimitives>() {
            public JsonElement serialize(TestTypes.BagOfPrimitives src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive(6);
            }
        }).create();
        TestTypes.ClassWithCustomTypeConverter target = new TestTypes.ClassWithCustomTypeConverter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1139,gson,1138,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomNestedDeserializers_add1026() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomNestedDeserializers_add1026");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.BagOfPrimitives.class, new JsonDeserializer<com.google.gson.common.TestTypes.BagOfPrimitives>() {
            public TestTypes.BagOfPrimitives deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                int value = json.getAsInt();
                return new TestTypes.BagOfPrimitives(value , value , false , "");
            }
        }).create();
        String json = "{\"bag\":7,\"value\":25}";
        TestTypes.ClassWithCustomTypeConverter target = gson.fromJson(json, TestTypes.ClassWithCustomTypeConverter.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1137,target.getBag(),1136,target.getBag().getIntValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomNestedDeserializers() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomNestedDeserializers");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.BagOfPrimitives.class, new JsonDeserializer<com.google.gson.common.TestTypes.BagOfPrimitives>() {
            public TestTypes.BagOfPrimitives deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                int value = json.getAsInt();
                return new TestTypes.BagOfPrimitives(value , value , false , "");
            }
        }).create();
        String json = "{\"bag\":7,\"value\":25}";
        TestTypes.ClassWithCustomTypeConverter target = gson.fromJson(json, TestTypes.ClassWithCustomTypeConverter.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1137,target.getBag(),1136,target.getBag().getIntValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomNestedDeserializers_literalMutation1074() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomNestedDeserializers_literalMutation1074");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.BagOfPrimitives.class, new JsonDeserializer<com.google.gson.common.TestTypes.BagOfPrimitives>() {
            public TestTypes.BagOfPrimitives deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                int value = json.getAsInt();
                return new TestTypes.BagOfPrimitives(value , value , false , "foo");
            }
        }).create();
        String json = "{\"bag\":7,\"value\":25}";
        TestTypes.ClassWithCustomTypeConverter target = gson.fromJson(json, TestTypes.ClassWithCustomTypeConverter.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1137,target.getBag(),1136,target.getBag().getIntValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomNestedDeserializers_literalMutation1075() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomNestedDeserializers_literalMutation1075");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.BagOfPrimitives.class, new JsonDeserializer<com.google.gson.common.TestTypes.BagOfPrimitives>() {
            public TestTypes.BagOfPrimitives deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                int value = json.getAsInt();
                return new TestTypes.BagOfPrimitives(value , value , false , "");
            }
        }).create();
        String json = "foo";
        TestTypes.ClassWithCustomTypeConverter target = gson.fromJson(json, TestTypes.ClassWithCustomTypeConverter.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1137,target.getBag(),1136,target.getBag().getIntValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomNestedDeserializers_remove852() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomNestedDeserializers_remove852");
        Gson gson = new GsonBuilder().registerTypeAdapter(TestTypes.BagOfPrimitives.class, new JsonDeserializer<com.google.gson.common.TestTypes.BagOfPrimitives>() {
            public TestTypes.BagOfPrimitives deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                int value = json.getAsInt();
                return new TestTypes.BagOfPrimitives(value , value , false , "");
            }
        }).create();
        String json = "{\"bag\":7,\"value\":25}";
        TestTypes.ClassWithCustomTypeConverter target = gson.fromJson(json, TestTypes.ClassWithCustomTypeConverter.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1137,target.getBag(),1136,target.getBag().getIntValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomTypeAdapterDoesNotAppliesToSubClasses_add1034() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterDoesNotAppliesToSubClasses_add1034");
        Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base>() {
            public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("value", src.baseValue);
                return json;
            }
        }).create();
        Base b = new Base();
        String json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1153,json,1152,json.contains("value"));
        b = new Derived();
        json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1155,json,1154,json.contains("derivedValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomTypeAdapterDoesNotAppliesToSubClasses_add1035() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterDoesNotAppliesToSubClasses_add1035");
        Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base>() {
            public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("value", src.baseValue);
                json.addProperty("value", src.baseValue);
                return json;
            }
        }).create();
        Base b = new Base();
        String json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1153,json,1152,json.contains("value"));
        b = new Derived();
        json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1155,json,1154,json.contains("derivedValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomTypeAdapterDoesNotAppliesToSubClasses() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterDoesNotAppliesToSubClasses");
        Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base>() {
            public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("foo", src.baseValue);
                return json;
            }
        }).create();
        Base b = new Base();
        String json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1153,json,1152,json.contains("value"));
        b = new Derived();
        json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1155,json,1154,json.contains("derivedValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomTypeAdapterDoesNotAppliesToSubClasses_remove860() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterDoesNotAppliesToSubClasses_remove860");
        Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base>() {
            public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("value", src.baseValue);
                return json;
            }
        }).create();
        Base b = new Base();
        String json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1153,json,1152,json.contains("value"));
        b = new Derived();
        json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1155,json,1154,json.contains("derivedValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomTypeAdapterDoesNotAppliesToSubClasses_remove861() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterDoesNotAppliesToSubClasses_remove861");
        Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base>() {
            public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                return json;
            }
        }).create();
        Base b = new Base();
        String json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1153,json,1152,json.contains("value"));
        b = new Derived();
        json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1155,json,1154,json.contains("derivedValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass_add1032() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass_add1032");
        Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base>() {
            public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("value", src.baseValue);
                return json;
            }
        }).create();
        Base b = new Base();
        String json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,json,1146,json.contains("value"));
        b = new Derived();
        json = gson.toJson(b, Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,json,1148,json.contains("value"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1151,json,1150,json.contains("derivedValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass_add1033() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass_add1033");
        Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base>() {
            public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("value", src.baseValue);
                json.addProperty("value", src.baseValue);
                return json;
            }
        }).create();
        Base b = new Base();
        String json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,json,1146,json.contains("value"));
        b = new Derived();
        json = gson.toJson(b, Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,json,1148,json.contains("value"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1151,json,1150,json.contains("derivedValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass");
        Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base>() {
            public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("foo", src.baseValue);
                return json;
            }
        }).create();
        Base b = new Base();
        String json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,json,1146,json.contains("value"));
        b = new Derived();
        json = gson.toJson(b, Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,json,1148,json.contains("value"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1151,json,1150,json.contains("derivedValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass_remove858() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass_remove858");
        Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base>() {
            public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                json.addProperty("value", src.baseValue);
                return json;
            }
        }).create();
        Base b = new Base();
        String json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,json,1146,json.contains("value"));
        b = new Derived();
        json = gson.toJson(b, Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,json,1148,json.contains("value"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1151,json,1150,json.contains("derivedValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass_remove859() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass_remove859");
        Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new JsonSerializer<Base>() {
            public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject json = new JsonObject();
                return json;
            }
        }).create();
        Base b = new Base();
        String json = gson.toJson(b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1147,json,1146,json.contains("value"));
        b = new Derived();
        json = gson.toJson(b, Base.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1149,json,1148,json.contains("value"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1151,json,1150,json.contains("derivedValue"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class Base {
        int baseValue = 2;
    }

    private static class Derived extends Base {
        @SuppressWarnings(value = "unused")
        int derivedValue = 3;
    }

    private Gson createGsonObjectWithFooTypeAdapter() {
        return new GsonBuilder().registerTypeAdapter(Foo.class, new FooTypeAdapter()).create();
    }

    public static class Foo {
        private final int key;

        private final long value;

        public Foo() {
            this(0, 0L);
        }

        public Foo(int key ,long value) {
            this.key = key;
            this.value = value;
        }
    }

    public static class FooTypeAdapter implements JsonDeserializer<Foo> , JsonSerializer<Foo> {
        public Foo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            return context.deserialize(json, typeOfT);
        }

        public JsonElement serialize(Foo src, Type typeOfSrc, JsonSerializationContext context) {
            return context.serialize(src, typeOfSrc);
        }
    }

    @Test(timeout = 1000)
    public void testCustomSerializerInvokedForPrimitives_add1028() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerInvokedForPrimitives_add1028");
        Gson gson = new GsonBuilder().registerTypeAdapter(boolean.class, new JsonSerializer<java.lang.Boolean>() {
            public JsonElement serialize(java.lang.Boolean s, Type t, JsonSerializationContext c) {
                return new JsonPrimitive((s ? 1 : 0));
            }
        }).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,gson,1140,gson.toJson(true, boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,gson,1142,gson.toJson(true, java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializerInvokedForPrimitives() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerInvokedForPrimitives");
        Gson gson = new GsonBuilder().registerTypeAdapter(boolean.class, new JsonSerializer<java.lang.Boolean>() {
            public JsonElement serialize(java.lang.Boolean s, Type t, JsonSerializationContext c) {
                return new JsonPrimitive((s ? 2 : 0));
            }
        }).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,gson,1140,gson.toJson(true, boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,gson,1142,gson.toJson(true, java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializerInvokedForPrimitives_literalMutation1078() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerInvokedForPrimitives_literalMutation1078");
        Gson gson = new GsonBuilder().registerTypeAdapter(boolean.class, new JsonSerializer<java.lang.Boolean>() {
            public JsonElement serialize(java.lang.Boolean s, Type t, JsonSerializationContext c) {
                return new JsonPrimitive((s ? 1 : -1));
            }
        }).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,gson,1140,gson.toJson(true, boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,gson,1142,gson.toJson(true, java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializerInvokedForPrimitives_remove854() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerInvokedForPrimitives_remove854");
        Gson gson = new GsonBuilder().registerTypeAdapter(boolean.class, new JsonSerializer<java.lang.Boolean>() {
            public JsonElement serialize(java.lang.Boolean s, Type t, JsonSerializationContext c) {
                return new JsonPrimitive((s ? 1 : 0));
            }
        }).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1141,gson,1140,gson.toJson(true, boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1143,gson,1142,gson.toJson(true, java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    @Test(timeout = 1000)
    public void testCustomDeserializerInvokedForPrimitives_add1024() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerInvokedForPrimitives_add1024");
        Gson gson = new GsonBuilder().registerTypeAdapter(boolean.class, new JsonDeserializer() {
            public java.lang.Object deserialize(JsonElement json, Type t, JsonDeserializationContext context) {
                return (json.getAsInt()) != 0;
            }
        }).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1128,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1130,gson,1129,gson.fromJson("1", boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1131,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1133,gson,1132,gson.fromJson("true", java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    public void testCustomDeserializerInvokedForPrimitives() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerInvokedForPrimitives");
        Gson gson = new GsonBuilder().registerTypeAdapter(boolean.class, new JsonDeserializer() {
            public java.lang.Object deserialize(JsonElement json, Type t, JsonDeserializationContext context) {
                return (json.getAsInt()) != 0;
            }
        }).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1128,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1130,gson,1129,gson.fromJson("1", boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1131,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1133,gson,1132,gson.fromJson("true", java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    public void testCustomDeserializerInvokedForPrimitives_literalMutation1068() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerInvokedForPrimitives_literalMutation1068");
        Gson gson = new GsonBuilder().registerTypeAdapter(boolean.class, new JsonDeserializer() {
            public java.lang.Object deserialize(JsonElement json, Type t, JsonDeserializationContext context) {
                return (json.getAsInt()) != -1;
            }
        }).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1128,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1130,gson,1129,gson.fromJson("1", boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1131,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1133,gson,1132,gson.fromJson("true", java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    @Test(timeout = 1000)
    public void testCustomDeserializerInvokedForPrimitives_remove850() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomDeserializerInvokedForPrimitives_remove850");
        Gson gson = new GsonBuilder().registerTypeAdapter(boolean.class, new JsonDeserializer() {
            public java.lang.Object deserialize(JsonElement json, Type t, JsonDeserializationContext context) {
                return (json.getAsInt()) != 0;
            }
        }).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1128,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1130,gson,1129,gson.fromJson("1", boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1131,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1133,gson,1132,gson.fromJson("true", java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomByteArraySerializer_add1022() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_add1022");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomByteArraySerializer_add1023() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_add1023");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArraySerializer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ -1 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArraySerializer_literalMutation1058() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_literalMutation1058");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 0 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArraySerializer_literalMutation1059() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_literalMutation1059");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 1 , 3 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArraySerializer_literalMutation1060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_literalMutation1060");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 1 , 2 , 2 , 4 , 5 , 6 , 7 , 8 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArraySerializer_literalMutation1061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_literalMutation1061");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 1 , 2 , 3 , 5 , 5 , 6 , 7 , 8 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArraySerializer_literalMutation1062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_literalMutation1062");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 1 , 2 , 3 , 4 , 6 , 6 , 7 , 8 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArraySerializer_literalMutation1063() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_literalMutation1063");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 5 , 7 , 8 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArraySerializer_literalMutation1064() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_literalMutation1064");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 8 , 8 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArraySerializer_literalMutation1065() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_literalMutation1065");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 7 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArraySerializer_literalMutation1066() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_literalMutation1066");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 10 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomByteArraySerializer_remove848() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_remove848");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                    sb.append(b);
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomByteArraySerializer_remove849() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArraySerializer_remove849");
        Gson gson = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonSerializer<byte[]>() {
            public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(src.length);
                for (byte b : src) {
                }
                return new JsonPrimitive(sb.toString());
            }
        }).create();
        byte[] data = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        String json = gson.toJson(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1127,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomByteArrayDeserializerAndInstanceCreator_add1021() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_add1021");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = -1 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1044() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1044");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("foo" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1045() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1045");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "foo";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1046() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1046");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 1 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1047() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1047");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 2 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1048() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1048");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 3 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1049() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1049");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 2 , 4 , 5 , 6 , 7 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1050() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1050");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 3 , 3 , 5 , 6 , 7 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1051() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1051");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 3 , 4 , 4 , 6 , 7 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1052() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1052");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 5 , 7 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1053() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1053");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 6 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1054() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1054");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 7 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1055() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1055");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 10 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1056() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_literalMutation1056");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        for (int i = 1 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomByteArrayDeserializerAndInstanceCreator_remove847() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomByteArrayDeserializerAndInstanceCreator_remove847");
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(byte[].class, new JsonDeserializer<byte[]>() {
            public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                String str = json.getAsString();
                byte[] data = new byte[str.length()];
                for (int i = 0 ; i < (data.length) ; ++i) {
                    data[i] = java.lang.Byte.parseByte(("" + (str.charAt(i))));
                }
                return data;
            }
        });
        Gson gson = gsonBuilder.create();
        String json = "\'0123456789\'";
        byte[] actual = gson.fromJson(json, byte[].class);
        byte[] expected = new byte[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        for (int i = 0 ; i < (actual.length) ; ++i) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1125,expected[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1126,actual[i]);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class StringHolder {
        String part1;

        String part2;

        public StringHolder(String string) {
            String[] parts = string.split(":");
            part1 = parts[0];
            part2 = parts[1];
        }

        public StringHolder(String part1 ,String part2) {
            this.part1 = part1;
            this.part2 = part2;
        }
    }

    private static class StringHolderTypeAdapter implements InstanceCreator<StringHolder> , JsonDeserializer<StringHolder> , JsonSerializer<StringHolder> {
        public StringHolder createInstance(Type type) {
            return new StringHolder("unknown:thing");
        }

        public StringHolder deserialize(JsonElement src, Type type, JsonDeserializationContext context) {
            return new StringHolder(src.getAsString());
        }

        public JsonElement serialize(StringHolder src, Type typeOfSrc, JsonSerializationContext context) {
            String contents = ((src.part1) + ':') + (src.part2);
            return new JsonPrimitive(contents);
        }
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForCollectionElementSerializationWithType_add1015() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementSerializationWithType_add1015");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type setType = new TypeToken<java.util.Set<StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Set<StringHolder> setOfHolders = new HashSet<StringHolder>();
        setOfHolders.add(holder);
        String json = gson.toJson(setOfHolders, setType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1114,json,1113,json.contains("Jacob:Tomaw"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForCollectionElementSerializationWithType_add1016() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementSerializationWithType_add1016");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type setType = new TypeToken<java.util.Set<StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Set<StringHolder> setOfHolders = new HashSet<StringHolder>();
        setOfHolders.add(holder);
        setOfHolders.add(holder);
        String json = gson.toJson(setOfHolders, setType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1114,json,1113,json.contains("Jacob:Tomaw"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForCollectionElementSerializationWithType() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementSerializationWithType");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type setType = new TypeToken<java.util.Set<StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("foo" , "Tomaw");
        Set<StringHolder> setOfHolders = new HashSet<StringHolder>();
        setOfHolders.add(holder);
        String json = gson.toJson(setOfHolders, setType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1114,json,1113,json.contains("Jacob:Tomaw"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForCollectionElementSerializationWithType_literalMutation1034() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementSerializationWithType_literalMutation1034");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type setType = new TypeToken<java.util.Set<StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("Jacob" , "foo");
        Set<StringHolder> setOfHolders = new HashSet<StringHolder>();
        setOfHolders.add(holder);
        String json = gson.toJson(setOfHolders, setType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1114,json,1113,json.contains("Jacob:Tomaw"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForCollectionElementSerializationWithType_remove841() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementSerializationWithType_remove841");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type setType = new TypeToken<java.util.Set<StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Set<StringHolder> setOfHolders = new HashSet<StringHolder>();
        setOfHolders.add(holder);
        String json = gson.toJson(setOfHolders, setType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1114,json,1113,json.contains("Jacob:Tomaw"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForCollectionElementSerializationWithType_remove842() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementSerializationWithType_remove842");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type setType = new TypeToken<java.util.Set<StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Set<StringHolder> setOfHolders = new HashSet<StringHolder>();
        String json = gson.toJson(setOfHolders, setType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1114,json,1113,json.contains("Jacob:Tomaw"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForCollectionElementSerialization_add1014() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementSerialization_add1014");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Set<StringHolder> setOfHolders = new HashSet<StringHolder>();
        setOfHolders.add(holder);
        setOfHolders.add(holder);
        String json = gson.toJson(setOfHolders);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1116,json,1115,json.contains("Jacob:Tomaw"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForCollectionElementSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementSerialization");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        StringHolder holder = new StringHolder("foo" , "Tomaw");
        Set<StringHolder> setOfHolders = new HashSet<StringHolder>();
        setOfHolders.add(holder);
        String json = gson.toJson(setOfHolders);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1116,json,1115,json.contains("Jacob:Tomaw"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForCollectionElementSerialization_literalMutation1032() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementSerialization_literalMutation1032");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        StringHolder holder = new StringHolder("Jacob" , "foo");
        Set<StringHolder> setOfHolders = new HashSet<StringHolder>();
        setOfHolders.add(holder);
        String json = gson.toJson(setOfHolders);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1116,json,1115,json.contains("Jacob:Tomaw"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForCollectionElementSerialization_remove840() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementSerialization_remove840");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Set<StringHolder> setOfHolders = new HashSet<StringHolder>();
        String json = gson.toJson(setOfHolders);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1116,json,1115,json.contains("Jacob:Tomaw"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForCollectionElementDeserialization_add1013() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementDeserialization_add1013");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type setType = new TypeToken<java.util.Set<StringHolder>>() {        }.getType();
        Set<StringHolder> setOfHolders = gson.fromJson("[\'Jacob:Tomaw\']", setType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1110,setOfHolders,1109,setOfHolders.size());
        StringHolder foo = setOfHolders.iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1111,foo.part1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1112,foo.part2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForCollectionElementDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementDeserialization");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type setType = new TypeToken<java.util.Set<StringHolder>>() {        }.getType();
        Set<StringHolder> setOfHolders = gson.fromJson("foo", setType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1110,setOfHolders,1109,setOfHolders.size());
        StringHolder foo = setOfHolders.iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1111,foo.part1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1112,foo.part2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForCollectionElementDeserialization_remove839() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForCollectionElementDeserialization_remove839");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type setType = new TypeToken<java.util.Set<StringHolder>>() {        }.getType();
        Set<StringHolder> setOfHolders = gson.fromJson("[\'Jacob:Tomaw\']", setType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1110,setOfHolders,1109,setOfHolders.size());
        StringHolder foo = setOfHolders.iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1111,foo.part1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1112,foo.part2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForMapElementSerializationWithType_add1019() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementSerializationWithType_add1019");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type mapType = new TypeToken<java.util.Map<java.lang.String, StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Map<java.lang.String, StringHolder> mapOfHolders = new HashMap<java.lang.String, StringHolder>();
        mapOfHolders.put("foo", holder);
        String json = gson.toJson(mapOfHolders, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1122,json,1121,json.contains("\"foo\":\"Jacob:Tomaw\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForMapElementSerializationWithType_add1020() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementSerializationWithType_add1020");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type mapType = new TypeToken<java.util.Map<java.lang.String, StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Map<java.lang.String, StringHolder> mapOfHolders = new HashMap<java.lang.String, StringHolder>();
        mapOfHolders.put("foo", holder);
        mapOfHolders.put("foo", holder);
        String json = gson.toJson(mapOfHolders, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1122,json,1121,json.contains("\"foo\":\"Jacob:Tomaw\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForMapElementSerializationWithType() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementSerializationWithType");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type mapType = new TypeToken<java.util.Map<java.lang.String, StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("foo" , "Tomaw");
        Map<java.lang.String, StringHolder> mapOfHolders = new HashMap<java.lang.String, StringHolder>();
        mapOfHolders.put("foo", holder);
        String json = gson.toJson(mapOfHolders, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1122,json,1121,json.contains("\"foo\":\"Jacob:Tomaw\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForMapElementSerializationWithType_literalMutation1041() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementSerializationWithType_literalMutation1041");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type mapType = new TypeToken<java.util.Map<java.lang.String, StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("Jacob" , "foo");
        Map<java.lang.String, StringHolder> mapOfHolders = new HashMap<java.lang.String, StringHolder>();
        mapOfHolders.put("foo", holder);
        String json = gson.toJson(mapOfHolders, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1122,json,1121,json.contains("\"foo\":\"Jacob:Tomaw\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForMapElementSerializationWithType_literalMutation1042() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementSerializationWithType_literalMutation1042");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type mapType = new TypeToken<java.util.Map<java.lang.String, StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Map<java.lang.String, StringHolder> mapOfHolders = new HashMap<java.lang.String, StringHolder>();
        mapOfHolders.put("foo", holder);
        String json = gson.toJson(mapOfHolders, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1122,json,1121,json.contains("\"foo\":\"Jacob:Tomaw\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForMapElementSerializationWithType_remove845() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementSerializationWithType_remove845");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type mapType = new TypeToken<java.util.Map<java.lang.String, StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Map<java.lang.String, StringHolder> mapOfHolders = new HashMap<java.lang.String, StringHolder>();
        mapOfHolders.put("foo", holder);
        String json = gson.toJson(mapOfHolders, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1122,json,1121,json.contains("\"foo\":\"Jacob:Tomaw\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForMapElementSerializationWithType_remove846() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementSerializationWithType_remove846");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type mapType = new TypeToken<java.util.Map<java.lang.String, StringHolder>>() {        }.getType();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Map<java.lang.String, StringHolder> mapOfHolders = new HashMap<java.lang.String, StringHolder>();
        String json = gson.toJson(mapOfHolders, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1122,json,1121,json.contains("\"foo\":\"Jacob:Tomaw\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForMapElementSerialization_add1018() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementSerialization_add1018");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Map<java.lang.String, StringHolder> mapOfHolders = new HashMap<java.lang.String, StringHolder>();
        mapOfHolders.put("foo", holder);
        mapOfHolders.put("foo", holder);
        String json = gson.toJson(mapOfHolders);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1124,json,1123,json.contains("\"foo\":\"Jacob:Tomaw\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForMapElementSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementSerialization");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        StringHolder holder = new StringHolder("foo" , "Tomaw");
        Map<java.lang.String, StringHolder> mapOfHolders = new HashMap<java.lang.String, StringHolder>();
        mapOfHolders.put("foo", holder);
        String json = gson.toJson(mapOfHolders);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1124,json,1123,json.contains("\"foo\":\"Jacob:Tomaw\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForMapElementSerialization_literalMutation1038() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementSerialization_literalMutation1038");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        StringHolder holder = new StringHolder("Jacob" , "foo");
        Map<java.lang.String, StringHolder> mapOfHolders = new HashMap<java.lang.String, StringHolder>();
        mapOfHolders.put("foo", holder);
        String json = gson.toJson(mapOfHolders);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1124,json,1123,json.contains("\"foo\":\"Jacob:Tomaw\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForMapElementSerialization_literalMutation1039() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementSerialization_literalMutation1039");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Map<java.lang.String, StringHolder> mapOfHolders = new HashMap<java.lang.String, StringHolder>();
        mapOfHolders.put("foo", holder);
        String json = gson.toJson(mapOfHolders);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1124,json,1123,json.contains("\"foo\":\"Jacob:Tomaw\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForMapElementSerialization_remove844() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementSerialization_remove844");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        StringHolder holder = new StringHolder("Jacob" , "Tomaw");
        Map<java.lang.String, StringHolder> mapOfHolders = new HashMap<java.lang.String, StringHolder>();
        String json = gson.toJson(mapOfHolders);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1124,json,1123,json.contains("\"foo\":\"Jacob:Tomaw\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForMapElementDeserialization_add1017() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementDeserialization_add1017");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type mapType = new TypeToken<java.util.Map<java.lang.String, StringHolder>>() {        }.getType();
        Map<java.lang.String, StringHolder> mapOfFoo = gson.fromJson("{\'foo\':\'Jacob:Tomaw\'}", mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1118,mapOfFoo,1117,mapOfFoo.size());
        StringHolder foo = mapOfFoo.get("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1119,foo.part1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1120,foo.part2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForMapElementDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementDeserialization");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type mapType = new TypeToken<java.util.Map<java.lang.String, StringHolder>>() {        }.getType();
        Map<java.lang.String, StringHolder> mapOfFoo = gson.fromJson("foo", mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1118,mapOfFoo,1117,mapOfFoo.size());
        StringHolder foo = mapOfFoo.get("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1119,foo.part1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1120,foo.part2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomAdapterInvokedForMapElementDeserialization_literalMutation1036() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementDeserialization_literalMutation1036");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type mapType = new TypeToken<java.util.Map<java.lang.String, StringHolder>>() {        }.getType();
        Map<java.lang.String, StringHolder> mapOfFoo = gson.fromJson("{\'foo\':\'Jacob:Tomaw\'}", mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1118,mapOfFoo,1117,mapOfFoo.size());
        StringHolder foo = mapOfFoo.get("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1119,foo.part1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1120,foo.part2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomAdapterInvokedForMapElementDeserialization_remove843() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomAdapterInvokedForMapElementDeserialization_remove843");
        Gson gson = new GsonBuilder().registerTypeAdapter(StringHolder.class, new StringHolderTypeAdapter()).create();
        Type mapType = new TypeToken<java.util.Map<java.lang.String, StringHolder>>() {        }.getType();
        Map<java.lang.String, StringHolder> mapOfFoo = gson.fromJson("{\'foo\':\'Jacob:Tomaw\'}", mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1118,mapOfFoo,1117,mapOfFoo.size());
        StringHolder foo = mapOfFoo.get("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1119,foo.part1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1120,foo.part2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEnsureCustomSerializerNotInvokedForNullValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnsureCustomSerializerNotInvokedForNullValues");
        Gson gson = new GsonBuilder().registerTypeAdapter(DataHolder.class, new DataHolderSerializer()).create();
        DataHolderWrapper target = new DataHolderWrapper(new DataHolder("foo"));
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1157,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEnsureCustomDeserializerNotInvokedForNullValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEnsureCustomDeserializerNotInvokedForNullValues");
        Gson gson = new GsonBuilder().registerTypeAdapter(DataHolder.class, new DataHolderDeserializer()).create();
        String json = "foo";
        DataHolderWrapper actual = gson.fromJson(json, DataHolderWrapper.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1156,actual.wrappedData);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRegisterHierarchyAdapterForDate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRegisterHierarchyAdapterForDate");
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(Date.class, new DateTypeAdapter()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1159,gson,1158,gson.toJson(new java.util.Date(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1161,gson,1160,gson.toJson(new java.sql.Date(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1162,new java.util.Date(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1164,gson,1163,gson.fromJson("0", java.util.Date.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1165,new java.sql.Date(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1167,gson,1166,gson.fromJson("0", java.sql.Date.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class DataHolder {
        final String data;

        public DataHolder(String data) {
            this.data = data;
        }
    }

    private static class DataHolderWrapper {
        final DataHolder wrappedData;

        public DataHolderWrapper(DataHolder data) {
            this.wrappedData = data;
        }
    }

    private static class DataHolderSerializer implements JsonSerializer<DataHolder> {
        public JsonElement serialize(DataHolder src, Type typeOfSrc, JsonSerializationContext context) {
            JsonObject obj = new JsonObject();
            obj.addProperty("myData", src.data);
            return obj;
        }
    }

    private static class DataHolderDeserializer implements JsonDeserializer<DataHolder> {
        public DataHolder deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonObject jsonObj = json.getAsJsonObject();
            JsonElement jsonElement = jsonObj.get("data");
            if ((jsonElement == null) || (jsonElement.isJsonNull())) {
                return new DataHolder(null);
            } 
            return new DataHolder(jsonElement.getAsString());
        }
    }

    private static class DateTypeAdapter implements JsonDeserializer<java.util.Date> , JsonSerializer<java.util.Date> {
        public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            return typeOfT == (Date.class) ? new Date(json.getAsLong()) : new java.sql.Date(json.getAsLong());
        }

        public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.getTime());
        }
    }
}

