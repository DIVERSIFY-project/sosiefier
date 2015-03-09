package com.google.gson.functional;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import com.google.gson.ParameterizedTypeFixtures;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.io.Writer;

/** 
 * Functional tests for the serialization and deserialization of parameterized types in Gson.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ParameterizedTypesTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    @Test(timeout = 1000)
    public void testParameterizedTypesSerialization_add1336() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesSerialization_add1336");
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        Type typeOfSrc = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(src, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,src,2123,src.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedTypesSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesSerialization");
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(9);
        Type typeOfSrc = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(src, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,src,2123,src.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypesSerialization_remove1137() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesSerialization_remove1137");
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        Type typeOfSrc = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(src, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2124,src,2123,src.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeDeserialization");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives();
        ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives> expected = new ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives>(bag);
        Type expectedType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        TestTypes.BagOfPrimitives bagDefaultInstance = new TestTypes.BagOfPrimitives();
        Gson gson = new GsonBuilder().registerTypeAdapter(expectedType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<com.google.gson.common.TestTypes.BagOfPrimitives>(bagDefaultInstance)).create();
        String json = expected.getExpectedJson();
        ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives> actual = gson.fromJson(json, expectedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeDeserialization_remove1124() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeDeserialization_remove1124");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives();
        ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives> expected = new ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives>(bag);
        Type expectedType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        TestTypes.BagOfPrimitives bagDefaultInstance = new TestTypes.BagOfPrimitives();
        Gson gson = new GsonBuilder().registerTypeAdapter(expectedType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<com.google.gson.common.TestTypes.BagOfPrimitives>(bagDefaultInstance)).create();
        String json = expected.getExpectedJson();
        ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives> actual = gson.fromJson(json, expectedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2106,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2107,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypesWithMultipleParametersSerialization_add1342() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersSerialization_add1342");
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> src = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 1.0F , 2.1 , "abc" , new TestTypes.BagOfPrimitives());
        Type typeOfSrc = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(src, typeOfSrc);
        String expected = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2134,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypesWithMultipleParametersSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersSerialization");
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> src = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(9 , 1.0F , 2.1 , "abc" , new TestTypes.BagOfPrimitives());
        Type typeOfSrc = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(src, typeOfSrc);
        String expected = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2134,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypesWithMultipleParametersSerialization_literalMutation1739() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersSerialization_literalMutation1739");
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> src = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 0.0F , 2.1 , "abc" , new TestTypes.BagOfPrimitives());
        Type typeOfSrc = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(src, typeOfSrc);
        String expected = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2134,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypesWithMultipleParametersSerialization_literalMutation1740() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersSerialization_literalMutation1740");
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> src = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 1.0F , 3.1 , "abc" , new TestTypes.BagOfPrimitives());
        Type typeOfSrc = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(src, typeOfSrc);
        String expected = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2134,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypesWithMultipleParametersSerialization_literalMutation1741() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersSerialization_literalMutation1741");
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> src = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 1.0F , 2.1 , "foo" , new TestTypes.BagOfPrimitives());
        Type typeOfSrc = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(src, typeOfSrc);
        String expected = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2134,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypesWithMultipleParametersSerialization_literalMutation1742() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersSerialization_literalMutation1742");
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> src = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 1.0F , 2.1 , "abc" , new TestTypes.BagOfPrimitives());
        Type typeOfSrc = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(src, typeOfSrc);
        String expected = "foo" + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2134,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypesWithMultipleParametersSerialization_literalMutation1743() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersSerialization_literalMutation1743");
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> src = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 1.0F , 2.1 , "abc" , new TestTypes.BagOfPrimitives());
        Type typeOfSrc = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(src, typeOfSrc);
        String expected = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2134,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypesWithMultipleParametersSerialization_remove1143() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersSerialization_remove1143");
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> src = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 1.0F , 2.1 , "abc" , new TestTypes.BagOfPrimitives());
        Type typeOfSrc = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = gson.toJson(src, typeOfSrc);
        String expected = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2134,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2135,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypesWithMultipleParametersDeserialization_add1341() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersDeserialization_add1341");
        Type typeOfTarget = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> target = gson.fromJson(json, typeOfTarget);
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> expected = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 1.0F , 2.1 , "abc" , new TestTypes.BagOfPrimitives());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2132,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypesWithMultipleParametersDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersDeserialization");
        Type typeOfTarget = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = "foo" + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> target = gson.fromJson(json, typeOfTarget);
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> expected = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 1.0F , 2.1 , "abc" , new TestTypes.BagOfPrimitives());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2132,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypesWithMultipleParametersDeserialization_literalMutation1733() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersDeserialization_literalMutation1733");
        Type typeOfTarget = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "foo";
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> target = gson.fromJson(json, typeOfTarget);
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> expected = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 1.0F , 2.1 , "abc" , new TestTypes.BagOfPrimitives());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2132,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypesWithMultipleParametersDeserialization_literalMutation1734() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersDeserialization_literalMutation1734");
        Type typeOfTarget = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> target = gson.fromJson(json, typeOfTarget);
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> expected = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(9 , 1.0F , 2.1 , "abc" , new TestTypes.BagOfPrimitives());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2132,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypesWithMultipleParametersDeserialization_literalMutation1735() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersDeserialization_literalMutation1735");
        Type typeOfTarget = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> target = gson.fromJson(json, typeOfTarget);
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> expected = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 2.0F , 2.1 , "abc" , new TestTypes.BagOfPrimitives());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2132,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypesWithMultipleParametersDeserialization_literalMutation1736() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersDeserialization_literalMutation1736");
        Type typeOfTarget = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> target = gson.fromJson(json, typeOfTarget);
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> expected = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 1.0F , 3.1 , "abc" , new TestTypes.BagOfPrimitives());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2132,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypesWithMultipleParametersDeserialization_literalMutation1737() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersDeserialization_literalMutation1737");
        Type typeOfTarget = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> target = gson.fromJson(json, typeOfTarget);
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> expected = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 1.0F , 2.1 , "foo" , new TestTypes.BagOfPrimitives());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2132,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypesWithMultipleParametersDeserialization_remove1142() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypesWithMultipleParametersDeserialization_remove1142");
        Type typeOfTarget = new TypeToken<MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        String json = "{\"a\":10,\"b\":1.0,\"c\":2.1,\"d\":\"abc\"," + "\"e\":{\"longValue\":0,\"intValue\":0,\"booleanValue\":false,\"stringValue\":\"\"}}";
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> target = gson.fromJson(json, typeOfTarget);
        MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives> expected = new MultiParameters<java.lang.Integer, java.lang.Float, java.lang.Double, java.lang.String, com.google.gson.common.TestTypes.BagOfPrimitives>(10 , 1.0F , 2.1 , "abc" , new TestTypes.BagOfPrimitives());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2132,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2133,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeWithCustomSerializer_add1330() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithCustomSerializer_add1330");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        String json = gson.toJson(intTarget, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,null,2112,com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<java.lang.Integer>getExpectedJson(intTarget));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2114,json);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("abc");
        json = gson.toJson(stringTarget, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,null,2115,com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<java.lang.String>getExpectedJson(stringTarget));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeWithCustomSerializer_add1331() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithCustomSerializer_add1331");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        String json = gson.toJson(intTarget, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,null,2112,com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<java.lang.Integer>getExpectedJson(intTarget));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2114,json);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("abc");
        json = gson.toJson(stringTarget, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,null,2115,com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<java.lang.String>getExpectedJson(stringTarget));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedTypeWithCustomSerializer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithCustomSerializer");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(9);
        String json = gson.toJson(intTarget, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,null,2112,com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<java.lang.Integer>getExpectedJson(intTarget));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2114,json);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("abc");
        json = gson.toJson(stringTarget, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,null,2115,com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<java.lang.String>getExpectedJson(stringTarget));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedTypeWithCustomSerializer_literalMutation1718() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithCustomSerializer_literalMutation1718");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        String json = gson.toJson(intTarget, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,null,2112,com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<java.lang.Integer>getExpectedJson(intTarget));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2114,json);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("foo");
        json = gson.toJson(stringTarget, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,null,2115,com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<java.lang.String>getExpectedJson(stringTarget));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeWithCustomSerializer_remove1131() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithCustomSerializer_remove1131");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        String json = gson.toJson(intTarget, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,null,2112,com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<java.lang.Integer>getExpectedJson(intTarget));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2114,json);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("abc");
        json = gson.toJson(stringTarget, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,null,2115,com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<java.lang.String>getExpectedJson(stringTarget));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeWithCustomSerializer_remove1132() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithCustomSerializer_remove1132");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        String json = gson.toJson(intTarget, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2113,null,2112,com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<java.lang.Integer>getExpectedJson(intTarget));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2114,json);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("abc");
        json = gson.toJson(stringTarget, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2116,null,2115,com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<java.lang.String>getExpectedJson(stringTarget));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2117,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypesWithCustomDeserializer_add1337() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithCustomDeserializer_add1337");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.String>("")).registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.Integer>(new Integer(0))).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        String json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<Integer>getExpectedJson(src);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = gson.fromJson(json, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,intTarget.value,2125,intTarget.value.intValue());
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> srcStr = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("abc");
        json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<String>getExpectedJson(srcStr);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = gson.fromJson(json, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,stringTarget.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypesWithCustomDeserializer_add1338() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithCustomDeserializer_add1338");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.String>("")).registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.Integer>(new Integer(0))).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        String json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<Integer>getExpectedJson(src);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = gson.fromJson(json, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,intTarget.value,2125,intTarget.value.intValue());
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> srcStr = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("abc");
        json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<String>getExpectedJson(srcStr);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = gson.fromJson(json, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,stringTarget.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedTypesWithCustomDeserializer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithCustomDeserializer");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.String>("foo")).registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.Integer>(new Integer(0))).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        String json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<Integer>getExpectedJson(src);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = gson.fromJson(json, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,intTarget.value,2125,intTarget.value.intValue());
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> srcStr = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("abc");
        json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<String>getExpectedJson(srcStr);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = gson.fromJson(json, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,stringTarget.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedTypesWithCustomDeserializer_literalMutation1728() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithCustomDeserializer_literalMutation1728");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.String>("")).registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.Integer>(new Integer(1))).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        String json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<Integer>getExpectedJson(src);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = gson.fromJson(json, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,intTarget.value,2125,intTarget.value.intValue());
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> srcStr = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("abc");
        json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<String>getExpectedJson(srcStr);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = gson.fromJson(json, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,stringTarget.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedTypesWithCustomDeserializer_literalMutation1729() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithCustomDeserializer_literalMutation1729");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.String>("")).registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.Integer>(new Integer(0))).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(9);
        String json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<Integer>getExpectedJson(src);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = gson.fromJson(json, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,intTarget.value,2125,intTarget.value.intValue());
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> srcStr = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("abc");
        json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<String>getExpectedJson(srcStr);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = gson.fromJson(json, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,stringTarget.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedTypesWithCustomDeserializer_literalMutation1730() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithCustomDeserializer_literalMutation1730");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.String>("")).registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.Integer>(new Integer(0))).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        String json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<Integer>getExpectedJson(src);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = gson.fromJson(json, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,intTarget.value,2125,intTarget.value.intValue());
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> srcStr = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("foo");
        json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<String>getExpectedJson(srcStr);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = gson.fromJson(json, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,stringTarget.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypesWithCustomDeserializer_remove1138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithCustomDeserializer_remove1138");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.String>("")).registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.Integer>(new Integer(0))).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        String json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<Integer>getExpectedJson(src);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = gson.fromJson(json, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,intTarget.value,2125,intTarget.value.intValue());
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> srcStr = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("abc");
        json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<String>getExpectedJson(srcStr);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = gson.fromJson(json, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,stringTarget.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypesWithCustomDeserializer_remove1139() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithCustomDeserializer_remove1139");
        Type ptIntegerType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        Type ptStringType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.Integer>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeAdapter<java.lang.String>()).registerTypeAdapter(ptStringType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.String>("")).registerTypeAdapter(ptIntegerType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<java.lang.Integer>(new Integer(0))).create();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        String json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<Integer>getExpectedJson(src);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> intTarget = gson.fromJson(json, ptIntegerType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2126,intTarget.value,2125,intTarget.value.intValue());
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> srcStr = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.String>("abc");
        json = ParameterizedTypeFixtures.MyParameterizedTypeAdapter.<String>getExpectedJson(srcStr);
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.String> stringTarget = gson.fromJson(json, ptStringType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2127,stringTarget.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypesWithWriterSerialization_add1339() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithWriterSerialization_add1339");
        Writer writer = new StringWriter();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        Type typeOfSrc = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        gson.toJson(src, typeOfSrc, writer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,src,2128,src.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,writer,2130,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypesWithWriterSerialization_add1340() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithWriterSerialization_add1340");
        Writer writer = new StringWriter();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        Type typeOfSrc = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        gson.toJson(src, typeOfSrc, writer);
        gson.toJson(src, typeOfSrc, writer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,src,2128,src.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,writer,2130,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedTypesWithWriterSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithWriterSerialization");
        Writer writer = new StringWriter();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(9);
        Type typeOfSrc = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        gson.toJson(src, typeOfSrc, writer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,src,2128,src.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,writer,2130,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypesWithWriterSerialization_remove1140() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithWriterSerialization_remove1140");
        Writer writer = new StringWriter();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        Type typeOfSrc = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        gson.toJson(src, typeOfSrc, writer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,src,2128,src.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,writer,2130,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypesWithWriterSerialization_remove1141() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypesWithWriterSerialization_remove1141");
        Writer writer = new StringWriter();
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        Type typeOfSrc = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {        }.getType();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2129,src,2128,src.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2131,writer,2130,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeWithReaderDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithReaderDeserialization");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives();
        ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives> expected = new ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives>(bag);
        Type expectedType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        TestTypes.BagOfPrimitives bagDefaultInstance = new TestTypes.BagOfPrimitives();
        Gson gson = new GsonBuilder().registerTypeAdapter(expectedType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<com.google.gson.common.TestTypes.BagOfPrimitives>(bagDefaultInstance)).create();
        Reader json = new StringReader(expected.getExpectedJson());
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> actual = gson.fromJson(json, expectedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2119,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeWithReaderDeserialization_remove1133() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithReaderDeserialization_remove1133");
        TestTypes.BagOfPrimitives bag = new TestTypes.BagOfPrimitives();
        ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives> expected = new ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives>(bag);
        Type expectedType = new TypeToken<com.google.gson.ParameterizedTypeFixtures.MyParameterizedType<com.google.gson.common.TestTypes.BagOfPrimitives>>() {        }.getType();
        TestTypes.BagOfPrimitives bagDefaultInstance = new TestTypes.BagOfPrimitives();
        Gson gson = new GsonBuilder().registerTypeAdapter(expectedType, new ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator<com.google.gson.common.TestTypes.BagOfPrimitives>(bagDefaultInstance)).create();
        Reader json = new StringReader(expected.getExpectedJson());
        ParameterizedTypeFixtures.MyParameterizedType<java.lang.Integer> actual = gson.fromJson(json, expectedType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2118,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2119,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testVariableTypeFieldsAndGenericArraysSerialization_add1348() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization_add1348");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testVariableTypeFieldsAndGenericArraysSerialization_add1349() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization_add1349");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testVariableTypeFieldsAndGenericArraysSerialization_add1350() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization_add1350");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysSerialization_literalMutation1766() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization_literalMutation1766");
        Integer obj = 1;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysSerialization_literalMutation1767() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization_literalMutation1767");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 0 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysSerialization_literalMutation1768() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization_literalMutation1768");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 1 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysSerialization_literalMutation1769() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization_literalMutation1769");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 2 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysSerialization_literalMutation1770() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization_literalMutation1770");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(5);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysSerialization_literalMutation1771() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization_literalMutation1771");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(4);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testVariableTypeFieldsAndGenericArraysSerialization_remove1149() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization_remove1149");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testVariableTypeFieldsAndGenericArraysSerialization_remove1150() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization_remove1150");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testVariableTypeFieldsAndGenericArraysSerialization_remove1151() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysSerialization_remove1151");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2145,objToSerialize,2144,objToSerialize.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2146,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testVariableTypeFieldsAndGenericArraysDeserialization_add1345() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization_add1345");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testVariableTypeFieldsAndGenericArraysDeserialization_add1346() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization_add1346");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testVariableTypeFieldsAndGenericArraysDeserialization_add1347() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization_add1347");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysDeserialization_literalMutation1759() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization_literalMutation1759");
        Integer obj = 1;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysDeserialization_literalMutation1760() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization_literalMutation1760");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 2 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysDeserialization_literalMutation1761() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization_literalMutation1761");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 3 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysDeserialization_literalMutation1762() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization_literalMutation1762");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 2 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysDeserialization_literalMutation1763() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization_literalMutation1763");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(5);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testVariableTypeFieldsAndGenericArraysDeserialization_literalMutation1764() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization_literalMutation1764");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(4);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testVariableTypeFieldsAndGenericArraysDeserialization_remove1146() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization_remove1146");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testVariableTypeFieldsAndGenericArraysDeserialization_remove1147() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization_remove1147");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testVariableTypeFieldsAndGenericArraysDeserialization_remove1148() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeFieldsAndGenericArraysDeserialization_remove1148");
        Integer obj = 0;
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(obj , array , list , arrayOfLists , list , arrayOfLists);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2142,objAfterDeserialization,2141,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2143,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testVariableTypeDeserialization_add1344() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeDeserialization_add1344");
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(0 , null , null , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,objAfterDeserialization,2138,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2140,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVariableTypeDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeDeserialization");
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(-1 , null , null , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,objAfterDeserialization,2138,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2140,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testVariableTypeDeserialization_remove1145() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeDeserialization_remove1145");
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(0 , null , null , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2139,objAfterDeserialization,2138,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2140,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testVariableTypeArrayDeserialization_add1343() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeArrayDeserialization_add1343");
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , array , null , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,objAfterDeserialization,2136,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVariableTypeArrayDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeArrayDeserialization");
        Integer[] array = new Integer[]{ 2 , 2 , 3 };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , array , null , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,objAfterDeserialization,2136,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVariableTypeArrayDeserialization_literalMutation1745() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeArrayDeserialization_literalMutation1745");
        Integer[] array = new Integer[]{ 1 , 3 , 3 };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , array , null , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,objAfterDeserialization,2136,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVariableTypeArrayDeserialization_literalMutation1746() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeArrayDeserialization_literalMutation1746");
        Integer[] array = new Integer[]{ 1 , 2 , 2 };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , array , null , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,objAfterDeserialization,2136,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testVariableTypeArrayDeserialization_remove1144() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVariableTypeArrayDeserialization_remove1144");
        Integer[] array = new Integer[]{ 1 , 2 , 3 };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , array , null , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2137,objAfterDeserialization,2136,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),920,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeWithVariableTypeDeserialization_add1333() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithVariableTypeDeserialization_add1333");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(4);
        list.add(5);
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , list , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,objAfterDeserialization,2120,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeWithVariableTypeDeserialization_add1334() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithVariableTypeDeserialization_add1334");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        list.add(5);
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , list , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,objAfterDeserialization,2120,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeWithVariableTypeDeserialization_add1335() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithVariableTypeDeserialization_add1335");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , list , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,objAfterDeserialization,2120,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedTypeWithVariableTypeDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithVariableTypeDeserialization");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(3);
        list.add(5);
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , list , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,objAfterDeserialization,2120,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedTypeWithVariableTypeDeserialization_literalMutation1720() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithVariableTypeDeserialization_literalMutation1720");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(6);
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , list , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,objAfterDeserialization,2120,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeWithVariableTypeDeserialization_remove1134() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithVariableTypeDeserialization_remove1134");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(5);
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , list , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,objAfterDeserialization,2120,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeWithVariableTypeDeserialization_remove1135() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithVariableTypeDeserialization_remove1135");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(5);
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , list , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,objAfterDeserialization,2120,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedTypeWithVariableTypeDeserialization_remove1136() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeWithVariableTypeDeserialization_remove1136");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(4);
        list.add(5);
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , list , null , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2121,objAfterDeserialization,2120,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2122,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testParameterizedTypeGenericArraysSerialization_add1327() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysSerialization_add1327");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2111,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testParameterizedTypeGenericArraysSerialization_add1328() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysSerialization_add1328");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2111,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testParameterizedTypeGenericArraysSerialization_add1329() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysSerialization_add1329");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2111,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testParameterizedTypeGenericArraysSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysSerialization");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2111,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testParameterizedTypeGenericArraysSerialization_literalMutation1710() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysSerialization_literalMutation1710");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(0);
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2111,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testParameterizedTypeGenericArraysSerialization_literalMutation1711() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysSerialization_literalMutation1711");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(1);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2111,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testParameterizedTypeGenericArraysSerialization_remove1128() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysSerialization_remove1128");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2111,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testParameterizedTypeGenericArraysSerialization_remove1129() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysSerialization_remove1129");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2111,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testParameterizedTypeGenericArraysSerialization_remove1130() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysSerialization_remove1130");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2111,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testParameterizedTypeGenericArraysDeserialization_add1324() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysDeserialization_add1324");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,objAfterDeserialization,2108,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testParameterizedTypeGenericArraysDeserialization_add1325() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysDeserialization_add1325");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,objAfterDeserialization,2108,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testParameterizedTypeGenericArraysDeserialization_add1326() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysDeserialization_add1326");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,objAfterDeserialization,2108,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testParameterizedTypeGenericArraysDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysDeserialization");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,objAfterDeserialization,2108,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testParameterizedTypeGenericArraysDeserialization_literalMutation1702() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysDeserialization_literalMutation1702");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(2);
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,objAfterDeserialization,2108,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testParameterizedTypeGenericArraysDeserialization_literalMutation1703() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysDeserialization_literalMutation1703");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(3);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,objAfterDeserialization,2108,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testParameterizedTypeGenericArraysDeserialization_remove1125() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysDeserialization_remove1125");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,objAfterDeserialization,2108,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testParameterizedTypeGenericArraysDeserialization_remove1126() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysDeserialization_remove1126");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,objAfterDeserialization,2108,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testParameterizedTypeGenericArraysDeserialization_remove1127() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedTypeGenericArraysDeserialization_remove1127");
        List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        List<java.lang.Integer>[] arrayOfLists = new List[]{ list , list };
        Type typeOfSrc = new TypeToken<ObjectWithTypeVariables<java.lang.Integer>>() {        }.getType();
        ObjectWithTypeVariables<java.lang.Integer> objToSerialize = new ObjectWithTypeVariables<java.lang.Integer>(null , null , null , arrayOfLists , null , null);
        String json = gson.toJson(objToSerialize, typeOfSrc);
        ObjectWithTypeVariables<java.lang.Integer> objAfterDeserialization = gson.fromJson(json, typeOfSrc);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2109,objAfterDeserialization,2108,objAfterDeserialization.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2110,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * An test object that has fields that are type variables.
     * 
     * @param <T> Enforce T to be a string to make writing the "toExpectedJson" method easier.
     */
private static class ObjectWithTypeVariables<T extends java.lang.Number> {
        private final T typeParameterObj;

        private final T[] typeParameterArray;

        private final List<T> listOfTypeParameters;

        private final List<T>[] arrayOfListOfTypeParameters;

        private final List<? extends T> listOfWildcardTypeParameters;

        private final List<? extends T>[] arrayOfListOfWildcardTypeParameters;

        @SuppressWarnings(value = "unused")
        private ObjectWithTypeVariables() {
            this(null, null, null, null, null, null);
        }

        public ObjectWithTypeVariables(T obj ,T[] array ,List<T> list ,List<T>[] arrayOfList ,List<? extends T> wildcardList ,List<? extends T>[] arrayOfWildcardList) {
            this.typeParameterObj = obj;
            this.typeParameterArray = array;
            this.listOfTypeParameters = list;
            this.arrayOfListOfTypeParameters = arrayOfList;
            this.listOfWildcardTypeParameters = wildcardList;
            this.arrayOfListOfWildcardTypeParameters = arrayOfWildcardList;
        }

        public String getExpectedJson() {
            StringBuilder sb = new StringBuilder().append("{");
            boolean needsComma = false;
            if ((typeParameterObj) != null) {
                sb.append("\"typeParameterObj\":").append(toString(typeParameterObj));
                needsComma = true;
            } 
            if ((typeParameterArray) != null) {
                if (needsComma) {
                    sb.append(',');
                } 
                sb.append("\"typeParameterArray\":[");
                appendObjectsToBuilder(sb, java.util.Arrays.asList(typeParameterArray));
                sb.append(']');
                needsComma = true;
            } 
            if ((listOfTypeParameters) != null) {
                if (needsComma) {
                    sb.append(',');
                } 
                sb.append("\"listOfTypeParameters\":[");
                appendObjectsToBuilder(sb, listOfTypeParameters);
                sb.append(']');
                needsComma = true;
            } 
            if ((arrayOfListOfTypeParameters) != null) {
                if (needsComma) {
                    sb.append(',');
                } 
                sb.append("\"arrayOfListOfTypeParameters\":[");
                appendObjectsToBuilder(sb, arrayOfListOfTypeParameters);
                sb.append(']');
                needsComma = true;
            } 
            if ((listOfWildcardTypeParameters) != null) {
                if (needsComma) {
                    sb.append(',');
                } 
                sb.append("\"listOfWildcardTypeParameters\":[");
                appendObjectsToBuilder(sb, listOfWildcardTypeParameters);
                sb.append(']');
                needsComma = true;
            } 
            if ((arrayOfListOfWildcardTypeParameters) != null) {
                if (needsComma) {
                    sb.append(',');
                } 
                sb.append("\"arrayOfListOfWildcardTypeParameters\":[");
                appendObjectsToBuilder(sb, arrayOfListOfWildcardTypeParameters);
                sb.append(']');
                needsComma = true;
            } 
            sb.append('}');
            return sb.toString();
        }

        private void appendObjectsToBuilder(StringBuilder sb, Iterable<? extends T> iterable) {
            boolean isFirst = true;
            for (T obj : iterable) {
                if (!isFirst) {
                    sb.append(',');
                } 
                isFirst = false;
                sb.append(toString(obj));
            }
        }

        private void appendObjectsToBuilder(StringBuilder sb, List<? extends T>[] arrayOfList) {
            boolean isFirst = true;
            for (List<? extends T> list : arrayOfList) {
                if (!isFirst) {
                    sb.append(',');
                } 
                isFirst = false;
                if (list != null) {
                    sb.append('[');
                    appendObjectsToBuilder(sb, list);
                    sb.append(']');
                } else {
                    sb.append("null");
                }
            }
        }

        public String toString(T obj) {
            return obj.toString();
        }
    }

    private static class MultiParameters<A, B, C, D, E> {
        A a;

        B b;

        C c;

        D d;

        E e;

        @SuppressWarnings(value = "unused")
        private MultiParameters() {
        }

        MultiParameters(A a ,B b ,C c ,D d ,E e) {
            super();
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = (prime * result) + ((a) == null ? 0 : a.hashCode());
            result = (prime * result) + ((b) == null ? 0 : b.hashCode());
            result = (prime * result) + ((c) == null ? 0 : c.hashCode());
            result = (prime * result) + ((d) == null ? 0 : d.hashCode());
            result = (prime * result) + ((e) == null ? 0 : e.hashCode());
            return result;
        }

        @Override
        @SuppressWarnings(value = "unchecked")
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            } 
            if (obj == null) {
                return false;
            } 
            if ((getClass()) != (obj.getClass())) {
                return false;
            } 
            MultiParameters<A, B, C, D, E> other = ((MultiParameters<A, B, C, D, E>)(obj));
            if ((a) == null) {
                if ((other.a) != null) {
                    return false;
                } 
            } else if (!(a.equals(other.a))) {
                return false;
            } 
            if ((b) == null) {
                if ((other.b) != null) {
                    return false;
                } 
            } else if (!(b.equals(other.b))) {
                return false;
            } 
            if ((c) == null) {
                if ((other.c) != null) {
                    return false;
                } 
            } else if (!(c.equals(other.c))) {
                return false;
            } 
            if ((d) == null) {
                if ((other.d) != null) {
                    return false;
                } 
            } else if (!(d.equals(other.d))) {
                return false;
            } 
            if ((e) == null) {
                if ((other.e) != null) {
                    return false;
                } 
            } else if (!(e.equals(other.e))) {
                return false;
            } 
            return true;
        }
    }

    private static class Quantity {
        @SuppressWarnings(value = "unused")
        int q = 10;
    }

    private static class MyQuantity extends Quantity {
        @SuppressWarnings(value = "unused")
        int q2 = 20;
    }

    private interface Measurable<T> {    }

    private interface Field<T> {    }

    private interface Immutable {    }

    public static final class Amount<Q extends Quantity> implements Field<Amount<?>> , Immutable , Measurable<Q> , Serializable {
        private static final long serialVersionUID = -7560491093120970437L;

        int value = 30;
    }

    public void testDeepParameterizedTypeSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepParameterizedTypeSerialization");
        Amount<MyQuantity> amount = new Amount<MyQuantity>();
        String json = gson.toJson(amount);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2103,json,2102,json.contains("value"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2105,json,2104,json.contains("30"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepParameterizedTypeDeserialization_add1322() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepParameterizedTypeDeserialization_add1322");
        String json = "{value:30}";
        Type type = new TypeToken<Amount<MyQuantity>>() {        }.getType();
        Amount<MyQuantity> amount = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,amount.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepParameterizedTypeDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepParameterizedTypeDeserialization");
        String json = "foo";
        Type type = new TypeToken<Amount<MyQuantity>>() {        }.getType();
        Amount<MyQuantity> amount = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,amount.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepParameterizedTypeDeserialization_remove1123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepParameterizedTypeDeserialization_remove1123");
        String json = "{value:30}";
        Type type = new TypeToken<Amount<MyQuantity>>() {        }.getType();
        Amount<MyQuantity> amount = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2101,amount.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

