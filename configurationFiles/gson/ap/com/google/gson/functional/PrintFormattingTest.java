package com.google.gson.functional;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.util.List;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Functional tests for print formatting.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrintFormattingTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testCompactFormattingLeavesNoWhiteSpace_add1403() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompactFormattingLeavesNoWhiteSpace_add1403");
        List list = new ArrayList();
        list.add(new com.google.gson.common.TestTypes.BagOfPrimitives());
        list.add(new com.google.gson.common.TestTypes.BagOfPrimitives());
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        String json = gson.toJson(list);
        PrintFormattingTest.assertContainsNoWhiteSpace(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testCompactFormattingLeavesNoWhiteSpace_add1404() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompactFormattingLeavesNoWhiteSpace_add1404");
        List list = new ArrayList();
        list.add(new com.google.gson.common.TestTypes.BagOfPrimitives());
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        String json = gson.toJson(list);
        PrintFormattingTest.assertContainsNoWhiteSpace(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testCompactFormattingLeavesNoWhiteSpace_add1405() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompactFormattingLeavesNoWhiteSpace_add1405");
        List list = new ArrayList();
        list.add(new com.google.gson.common.TestTypes.BagOfPrimitives());
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        String json = gson.toJson(list);
        PrintFormattingTest.assertContainsNoWhiteSpace(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testCompactFormattingLeavesNoWhiteSpace_add1406() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompactFormattingLeavesNoWhiteSpace_add1406");
        List list = new ArrayList();
        list.add(new com.google.gson.common.TestTypes.BagOfPrimitives());
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        String json = gson.toJson(list);
        PrintFormattingTest.assertContainsNoWhiteSpace(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testCompactFormattingLeavesNoWhiteSpace_add1407() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompactFormattingLeavesNoWhiteSpace_add1407");
        List list = new ArrayList();
        list.add(new com.google.gson.common.TestTypes.BagOfPrimitives());
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        String json = gson.toJson(list);
        PrintFormattingTest.assertContainsNoWhiteSpace(json);
        PrintFormattingTest.assertContainsNoWhiteSpace(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "foo" , "rawtypes" })
    public void testCompactFormattingLeavesNoWhiteSpace() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompactFormattingLeavesNoWhiteSpace");
        List list = new ArrayList();
        list.add(new com.google.gson.common.TestTypes.BagOfPrimitives());
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        String json = gson.toJson(list);
        PrintFormattingTest.assertContainsNoWhiteSpace(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "foo" })
    public void testCompactFormattingLeavesNoWhiteSpace_literalMutation1898() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompactFormattingLeavesNoWhiteSpace_literalMutation1898");
        List list = new ArrayList();
        list.add(new com.google.gson.common.TestTypes.BagOfPrimitives());
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        String json = gson.toJson(list);
        PrintFormattingTest.assertContainsNoWhiteSpace(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testCompactFormattingLeavesNoWhiteSpace_remove1159() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompactFormattingLeavesNoWhiteSpace_remove1159");
        List list = new ArrayList();
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        String json = gson.toJson(list);
        PrintFormattingTest.assertContainsNoWhiteSpace(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testCompactFormattingLeavesNoWhiteSpace_remove1160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompactFormattingLeavesNoWhiteSpace_remove1160");
        List list = new ArrayList();
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        String json = gson.toJson(list);
        PrintFormattingTest.assertContainsNoWhiteSpace(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testCompactFormattingLeavesNoWhiteSpace_remove1161() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompactFormattingLeavesNoWhiteSpace_remove1161");
        List list = new ArrayList();
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        String json = gson.toJson(list);
        PrintFormattingTest.assertContainsNoWhiteSpace(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testCompactFormattingLeavesNoWhiteSpace_remove1162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompactFormattingLeavesNoWhiteSpace_remove1162");
        List list = new ArrayList();
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        String json = gson.toJson(list);
        PrintFormattingTest.assertContainsNoWhiteSpace(json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testCompactFormattingLeavesNoWhiteSpace_remove1163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCompactFormattingLeavesNoWhiteSpace_remove1163");
        List list = new ArrayList();
        list.add(new com.google.gson.common.TestTypes.BagOfPrimitives());
        list.add(new com.google.gson.common.TestTypes.Nested());
        list.add(new com.google.gson.common.TestTypes.PrimitiveArray());
        list.add(new com.google.gson.common.TestTypes.ClassWithTransientFields());
        String json = gson.toJson(list);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectWithNullValues_add1408() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValues_add1408");
        JsonObject obj = new JsonObject();
        obj.addProperty("field1", "value1");
        obj.addProperty("field1", "value1");
        obj.addProperty("field2", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,json,2379,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,json,2381,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectWithNullValues_add1409() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValues_add1409");
        JsonObject obj = new JsonObject();
        obj.addProperty("field1", "value1");
        obj.addProperty("field2", ((String)(null)));
        obj.addProperty("field2", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,json,2379,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,json,2381,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectWithNullValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValues");
        JsonObject obj = new JsonObject();
        obj.addProperty("foo", "value1");
        obj.addProperty("field2", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,json,2379,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,json,2381,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectWithNullValues_literalMutation1900() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValues_literalMutation1900");
        JsonObject obj = new JsonObject();
        obj.addProperty("field1", "foo");
        obj.addProperty("field2", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,json,2379,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,json,2381,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectWithNullValues_literalMutation1901() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValues_literalMutation1901");
        JsonObject obj = new JsonObject();
        obj.addProperty("field1", "value1");
        obj.addProperty("foo", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,json,2379,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,json,2381,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectWithNullValues_remove1164() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValues_remove1164");
        JsonObject obj = new JsonObject();
        obj.addProperty("field2", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,json,2379,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,json,2381,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectWithNullValues_remove1165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValues_remove1165");
        JsonObject obj = new JsonObject();
        obj.addProperty("field2", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2380,json,2379,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2382,json,2381,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectWithNullValuesSerialized_add1410() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValuesSerialized_add1410");
        gson = new GsonBuilder().serializeNulls().create();
        JsonObject obj = new JsonObject();
        obj.addProperty("field1", "value1");
        obj.addProperty("field1", "value1");
        obj.addProperty("field2", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,json,2375,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,json,2377,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectWithNullValuesSerialized_add1411() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValuesSerialized_add1411");
        gson = new GsonBuilder().serializeNulls().create();
        JsonObject obj = new JsonObject();
        obj.addProperty("field1", "value1");
        obj.addProperty("field2", ((String)(null)));
        obj.addProperty("field2", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,json,2375,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,json,2377,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectWithNullValuesSerialized() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValuesSerialized");
        gson = new GsonBuilder().serializeNulls().create();
        JsonObject obj = new JsonObject();
        obj.addProperty("foo", "value1");
        obj.addProperty("field2", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,json,2375,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,json,2377,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectWithNullValuesSerialized_literalMutation1904() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValuesSerialized_literalMutation1904");
        gson = new GsonBuilder().serializeNulls().create();
        JsonObject obj = new JsonObject();
        obj.addProperty("field1", "foo");
        obj.addProperty("field2", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,json,2375,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,json,2377,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectWithNullValuesSerialized_literalMutation1905() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValuesSerialized_literalMutation1905");
        gson = new GsonBuilder().serializeNulls().create();
        JsonObject obj = new JsonObject();
        obj.addProperty("field1", "value1");
        obj.addProperty("foo", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,json,2375,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,json,2377,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectWithNullValuesSerialized_remove1166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValuesSerialized_remove1166");
        gson = new GsonBuilder().serializeNulls().create();
        JsonObject obj = new JsonObject();
        obj.addProperty("field2", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,json,2375,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,json,2377,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectWithNullValuesSerialized_remove1167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectWithNullValuesSerialized_remove1167");
        gson = new GsonBuilder().serializeNulls().create();
        JsonObject obj = new JsonObject();
        obj.addProperty("field2", ((String)(null)));
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2376,json,2375,json.contains("field1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2378,json,2377,json.contains("field2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void assertContainsNoWhiteSpace(String str) {
        for (char c : str.toCharArray()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2374,null,2373,java.lang.Character.isWhitespace(c));
        }
    }
}

