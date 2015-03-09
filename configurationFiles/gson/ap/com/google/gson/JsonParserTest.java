package com.google.gson;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import com.google.gson.stream.JsonReader;
import java.io.StringReader;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;

/** 
 * Unit test for {@link JsonParser}
 * 
 * @author Inderjeet Singh
 */
public class JsonParserTest extends TestCase {
    private JsonParser parser;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        parser = new JsonParser();
    }

    public void testParseInvalidJson() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseInvalidJson");
        try {
            parser.parse("[[]");
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParseInvalidJson_add1588() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseInvalidJson_add1588");
        try {
            parser.parse("[[]");
            parser.parse("[[]");
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParseInvalidJson_literalMutation2300() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseInvalidJson_literalMutation2300");
        try {
            parser.parse("foo");
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParseUnquotedStringArrayFails() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseUnquotedStringArrayFails");
        JsonElement element = parser.parse("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2915,element.getAsJsonArray().get(0),2914,element.getAsJsonArray().get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2917,element.getAsJsonArray().get(1),2916,element.getAsJsonArray().get(1).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2919,element.getAsJsonArray().get(2),2918,element.getAsJsonArray().get(2).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2921,element.getAsJsonArray(),2920,element.getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParseString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseString");
        String json = "foo";
        JsonElement e = parser.parse(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2907,e,2906,e.isJsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2909,e.getAsJsonObject().get("a"),2908,e.getAsJsonObject().get("a").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2911,e.getAsJsonObject().get("b"),2910,e.getAsJsonObject().get("b").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParseEmptyString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseEmptyString");
        JsonElement e = parser.parse("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2887,e,2886,e.isJsonPrimitive());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2889,e,2888,e.getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParseEmptyWhitespaceInput() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseEmptyWhitespaceInput");
        JsonElement e = parser.parse("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2891,e,2890,e.isJsonNull());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParseUnquotedSingleWordStringFails() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseUnquotedSingleWordStringFails");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2913,parser.parse("Test"),2912,parser.parse("Test").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParseUnquotedMultiWordStringFails_add1589() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseUnquotedMultiWordStringFails_add1589");
        String unquotedSentence = "Test is a test..blah blah";
        try {
            parser.parse(unquotedSentence);
            parser.parse(unquotedSentence);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParseUnquotedMultiWordStringFails() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseUnquotedMultiWordStringFails");
        String unquotedSentence = "foo";
        try {
            parser.parse(unquotedSentence);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParseMixedArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseMixedArray");
        String json = "foo";
        JsonElement e = parser.parse(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2893,e,2892,e.isJsonArray());
        JsonArray array = e.getAsJsonArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2895,array.get(0),2894,array.get(0).toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2897,array.get(1),2896,array.get(1).getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2899,array.get(2),2898,array.get(2).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParseReader() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseReader");
        StringReader reader = new StringReader("foo");
        JsonElement e = parser.parse(reader);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2901,e,2900,e.isJsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2903,e.getAsJsonObject().get("a"),2902,e.getAsJsonObject().get("a").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2905,e.getAsJsonObject().get("b"),2904,e.getAsJsonObject().get("b").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoObjects_add1590() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_add1590");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoObjects_add1591() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_add1591");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoObjects_add1592() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_add1592");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation2306() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation2306");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(0 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation2307() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation2307");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 0 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation2308() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation2308");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation2309() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation2309");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "foo");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation2310() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation2310");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(1 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation2311() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation2311");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 1 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation2312() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation2312");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , true , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation2313() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation2313");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "foo");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation2314() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation2314");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(false);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoObjects_remove1303() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_remove1303");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoObjects_remove1304() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_remove1304");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        parser.setLenient(true);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoObjects_remove1305() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_remove1305");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonReader parser = new JsonReader(reader);
        JsonElement element1 = com.google.gson.internal.Streams.parse(parser);
        JsonElement element2 = com.google.gson.internal.Streams.parse(parser);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(element1, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(element2, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2923,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

