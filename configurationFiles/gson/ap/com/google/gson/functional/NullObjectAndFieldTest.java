package com.google.gson.functional;

import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.lang.reflect.Type;

/** 
 * Functional tests for the different cases for serializing (or ignoring) null fields and object.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class NullObjectAndFieldTest extends TestCase {
    private GsonBuilder gsonBuilder;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gsonBuilder = new GsonBuilder().serializeNulls();
    }

    public void testTopLevelNullObjectSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelNullObjectSerialization");
        Gson gson = gsonBuilder.create();
        String actual = gson.toJson(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1979,actual);
        actual = gson.toJson(null, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1980,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelNullObjectDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelNullObjectDeserialization");
        Gson gson = gsonBuilder.create();
        String actual = gson.fromJson("foo", String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1978,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExplicitSerializationOfNulls() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExplicitSerializationOfNulls");
        Gson gson = gsonBuilder.create();
        TestTypes.ClassWithObjects target = new TestTypes.ClassWithObjects(null);
        String actual = gson.toJson(target);
        String expected = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1968,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1969,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExplicitDeserializationOfNulls() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExplicitDeserializationOfNulls");
        Gson gson = gsonBuilder.create();
        TestTypes.ClassWithObjects target = gson.fromJson("foo", TestTypes.ClassWithObjects.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1960,target.bag);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExplicitSerializationOfNullArrayMembers() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExplicitSerializationOfNullArrayMembers");
        Gson gson = gsonBuilder.create();
        ClassWithMembers target = new ClassWithMembers();
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1963,json,1962,json.contains("\"array\":null"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Added to verify http://code.google.com/p/google-gson/issues/detail?id=68
     */
public void testNullWrappedPrimitiveMemberSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullWrappedPrimitiveMemberSerialization");
        Gson gson = gsonBuilder.serializeNulls().create();
        ClassWithNullWrappedPrimitive target = new ClassWithNullWrappedPrimitive();
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1972,json,1971,json.contains("\"value\":null"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Added to verify http://code.google.com/p/google-gson/issues/detail?id=68
     */
public void testNullWrappedPrimitiveMemberDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullWrappedPrimitiveMemberDeserialization");
        Gson gson = gsonBuilder.create();
        String json = "foo";
        ClassWithNullWrappedPrimitive target = gson.fromJson(json, ClassWithNullWrappedPrimitive.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1970,target.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExplicitSerializationOfNullCollectionMembers() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExplicitSerializationOfNullCollectionMembers");
        Gson gson = gsonBuilder.create();
        ClassWithMembers target = new ClassWithMembers();
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1965,json,1964,json.contains("\"col\":null"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExplicitSerializationOfNullStringMembers() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExplicitSerializationOfNullStringMembers");
        Gson gson = gsonBuilder.create();
        ClassWithMembers target = new ClassWithMembers();
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1967,json,1966,json.contains("\"str\":null"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializationOfNulls_add1307() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializationOfNulls_add1307");
        gsonBuilder.registerTypeAdapter(TestTypes.ClassWithObjects.class, new ClassWithObjectsSerializer());
        gsonBuilder.registerTypeAdapter(TestTypes.ClassWithObjects.class, new ClassWithObjectsSerializer());
        Gson gson = gsonBuilder.create();
        TestTypes.ClassWithObjects target = new TestTypes.ClassWithObjects(new TestTypes.BagOfPrimitives());
        String actual = gson.toJson(target);
        String expected = "{\"bag\":null}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializationOfNulls() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializationOfNulls");
        gsonBuilder.registerTypeAdapter(TestTypes.ClassWithObjects.class, new ClassWithObjectsSerializer());
        Gson gson = gsonBuilder.create();
        TestTypes.ClassWithObjects target = new TestTypes.ClassWithObjects(new TestTypes.BagOfPrimitives());
        String actual = gson.toJson(target);
        String expected = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializationOfNulls_remove1110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializationOfNulls_remove1110");
        Gson gson = gsonBuilder.create();
        TestTypes.ClassWithObjects target = new TestTypes.ClassWithObjects(new TestTypes.BagOfPrimitives());
        String actual = gson.toJson(target);
        String expected = "{\"bag\":null}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1955,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1956,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrintPrintingObjectWithNulls() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrintPrintingObjectWithNulls");
        gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String result = gson.toJson(new ClassWithMembers());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1975,result);
        gson = gsonBuilder.serializeNulls().create();
        result = gson.toJson(new ClassWithMembers());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1977,result,1976,result.contains("\"str\":null"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrintPrintingArraysWithNulls() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrintPrintingArraysWithNulls");
        gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String result = gson.toJson(new String[]{ "foo" , null , "3" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1973,result);
        gson = gsonBuilder.serializeNulls().create();
        result = gson.toJson(new String[]{ "1" , null , "3" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrintPrintingArraysWithNulls_literalMutation1629() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrintPrintingArraysWithNulls_literalMutation1629");
        gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String result = gson.toJson(new String[]{ "1" , null , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1973,result);
        gson = gsonBuilder.serializeNulls().create();
        result = gson.toJson(new String[]{ "1" , null , "3" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrintPrintingArraysWithNulls_literalMutation1630() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrintPrintingArraysWithNulls_literalMutation1630");
        gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String result = gson.toJson(new String[]{ "1" , null , "3" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1973,result);
        gson = gsonBuilder.serializeNulls().create();
        result = gson.toJson(new String[]{ "foo" , null , "3" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrintPrintingArraysWithNulls_literalMutation1632() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrintPrintingArraysWithNulls_literalMutation1632");
        gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String result = gson.toJson(new String[]{ "1" , null , "3" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1973,result);
        gson = gsonBuilder.serializeNulls().create();
        result = gson.toJson(new String[]{ "1" , null , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1974,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAbsentJsonElementsAreSetToNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAbsentJsonElementsAreSetToNull");
        Gson gson = new Gson();
        ClassWithInitializedMembers target = gson.fromJson("foo", ClassWithInitializedMembers.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1945,(((target.array.length) == 3) && ((target.array[1]) == 2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1946,com.google.gson.functional.NullObjectAndFieldTest.ClassWithInitializedMembers.MY_STRING_DEFAULT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1947,target.str1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1948,target.str2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1949,com.google.gson.functional.NullObjectAndFieldTest.ClassWithInitializedMembers.MY_INT_DEFAULT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1950,target.int1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1951,target.int2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,com.google.gson.functional.NullObjectAndFieldTest.ClassWithInitializedMembers.MY_BOOLEAN_DEFAULT);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1953,target.bool1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1954,target.bool2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public static class ClassWithInitializedMembers {
        public static final String MY_STRING_DEFAULT = "string";

        private static final int MY_INT_DEFAULT = 2;

        private static final boolean MY_BOOLEAN_DEFAULT = true;

        int[] array;

        String str1;

        String str2;

        int int1 = MY_INT_DEFAULT;

        int int2;

        boolean bool1 = MY_BOOLEAN_DEFAULT;

        boolean bool2;

        public ClassWithInitializedMembers() {
            str1 = MY_STRING_DEFAULT;
        }
    }

    private static class ClassWithNullWrappedPrimitive {
        private Long value;
    }

    @SuppressWarnings(value = "unused")
    private static class ClassWithMembers {
        String str;

        int[] array;

        Collection<java.lang.String> col;
    }

    private static class ClassWithObjectsSerializer implements JsonSerializer<com.google.gson.common.TestTypes.ClassWithObjects> {
        public JsonElement serialize(TestTypes.ClassWithObjects src, Type typeOfSrc, JsonSerializationContext context) {
            JsonObject obj = new JsonObject();
            obj.add("bag", com.google.gson.JsonNull.INSTANCE);
            return obj;
        }
    }

    public void testExplicitNullSetsFieldToNullDuringDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExplicitNullSetsFieldToNullDuringDeserialization");
        Gson gson = new Gson();
        String json = "foo";
        ObjectWithField obj = gson.fromJson(json, ObjectWithField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1961,obj.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomTypeAdapterPassesNullSerialization_add1309() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterPassesNullSerialization_add1309");
        Gson gson = new GsonBuilder().registerTypeAdapter(ObjectWithField.class, new JsonSerializer<ObjectWithField>() {
            public JsonElement serialize(ObjectWithField src, Type typeOfSrc, JsonSerializationContext context) {
                return context.serialize(null);
            }
        }).create();
        ObjectWithField target = new ObjectWithField();
        target.value = "value1";
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1959,json,1958,json.contains("value1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomTypeAdapterPassesNullSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterPassesNullSerialization");
        Gson gson = new GsonBuilder().registerTypeAdapter(ObjectWithField.class, new JsonSerializer<ObjectWithField>() {
            public JsonElement serialize(ObjectWithField src, Type typeOfSrc, JsonSerializationContext context) {
                return context.serialize(null);
            }
        }).create();
        ObjectWithField target = new ObjectWithField();
        target.value = "foo";
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1959,json,1958,json.contains("value1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomTypeAdapterPassesNullSerialization_remove1112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterPassesNullSerialization_remove1112");
        Gson gson = new GsonBuilder().registerTypeAdapter(ObjectWithField.class, new JsonSerializer<ObjectWithField>() {
            public JsonElement serialize(ObjectWithField src, Type typeOfSrc, JsonSerializationContext context) {
                return context.serialize(null);
            }
        }).create();
        ObjectWithField target = new ObjectWithField();
        target.value = "value1";
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1959,json,1958,json.contains("value1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomTypeAdapterPassesNullDesrialization_add1308() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterPassesNullDesrialization_add1308");
        Gson gson = new GsonBuilder().registerTypeAdapter(ObjectWithField.class, new com.google.gson.JsonDeserializer<ObjectWithField>() {
            public ObjectWithField deserialize(JsonElement json, Type type, com.google.gson.JsonDeserializationContext context) {
                return context.deserialize(null, type);
            }
        }).create();
        String json = "{value:\'value1\'}";
        ObjectWithField target = gson.fromJson(json, ObjectWithField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomTypeAdapterPassesNullDesrialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterPassesNullDesrialization");
        Gson gson = new GsonBuilder().registerTypeAdapter(ObjectWithField.class, new com.google.gson.JsonDeserializer<ObjectWithField>() {
            public ObjectWithField deserialize(JsonElement json, Type type, com.google.gson.JsonDeserializationContext context) {
                return context.deserialize(null, type);
            }
        }).create();
        String json = "foo";
        ObjectWithField target = gson.fromJson(json, ObjectWithField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomTypeAdapterPassesNullDesrialization_remove1111() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomTypeAdapterPassesNullDesrialization_remove1111");
        Gson gson = new GsonBuilder().registerTypeAdapter(ObjectWithField.class, new com.google.gson.JsonDeserializer<ObjectWithField>() {
            public ObjectWithField deserialize(JsonElement json, Type type, com.google.gson.JsonDeserializationContext context) {
                return context.deserialize(null, type);
            }
        }).create();
        String json = "{value:\'value1\'}";
        ObjectWithField target = gson.fromJson(json, ObjectWithField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1957,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ObjectWithField {
        String value = "";
    }
}

