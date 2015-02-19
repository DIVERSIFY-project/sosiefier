package com.google.gson.functional;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import com.google.gson.JsonStreamParser;
import com.google.gson.JsonSyntaxException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.io.Writer;

/** 
 * Functional tests for the support of {@link Reader}s and {@link Writer}s.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ReadersWritersTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    @Test(timeout = 1000)
    public void testWriterForSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriterForSerialization");
        Writer writer = new StringWriter();
        TestTypes.BagOfPrimitives src = new TestTypes.BagOfPrimitives();
        gson.toJson(src, writer);
        gson.toJson(src, writer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,src,2405,src.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,writer,2407,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriterForSerialization_remove1177() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriterForSerialization_remove1177");
        Writer writer = new StringWriter();
        TestTypes.BagOfPrimitives src = new TestTypes.BagOfPrimitives();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2406,src,2405,src.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2408,writer,2407,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReaderForDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderForDeserialization");
        TestTypes.BagOfPrimitives expected = new TestTypes.BagOfPrimitives();
        Reader json = new StringReader(expected.getExpectedJson());
        TestTypes.BagOfPrimitives actual = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2397,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2398,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelNullObjectSerializationWithWriter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelNullObjectSerializationWithWriter");
        StringWriter writer = new StringWriter();
        gson.toJson(null, writer);
        gson.toJson(null, writer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,writer,2403,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelNullObjectSerializationWithWriter_remove1175() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelNullObjectSerializationWithWriter_remove1175");
        StringWriter writer = new StringWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2404,writer,2403,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelNullObjectDeserializationWithReader() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelNullObjectDeserializationWithReader");
        StringReader reader = new StringReader("foo");
        Integer nullIntObject = gson.fromJson(reader, Integer.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2400,nullIntObject);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelNullObjectSerializationWithWriterAndSerializeNulls() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelNullObjectSerializationWithWriterAndSerializeNulls");
        Gson gson = new GsonBuilder().serializeNulls().create();
        StringWriter writer = new StringWriter();
        gson.toJson(null, writer);
        gson.toJson(null, writer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,writer,2401,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTopLevelNullObjectSerializationWithWriterAndSerializeNulls_remove1176() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelNullObjectSerializationWithWriterAndSerializeNulls_remove1176");
        Gson gson = new GsonBuilder().serializeNulls().create();
        StringWriter writer = new StringWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2402,writer,2401,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTopLevelNullObjectDeserializationWithReaderAndSerializeNulls() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTopLevelNullObjectDeserializationWithReaderAndSerializeNulls");
        Gson gson = new GsonBuilder().serializeNulls().create();
        StringReader reader = new StringReader("foo");
        Integer nullIntObject = gson.fromJson(reader, Integer.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2399,nullIntObject);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoStrings_add1417() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoStrings_add1417");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        writer.write(gson.toJson("one").toCharArray());
        writer.write(gson.toJson("one").toCharArray());
        writer.write(gson.toJson("two").toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        String actualOne = gson.fromJson(parser.next(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2395,actualOne);
        String actualTwo = gson.fromJson(parser.next(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,actualTwo);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoStrings_add1418() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoStrings_add1418");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        writer.write(gson.toJson("one").toCharArray());
        writer.write(gson.toJson("two").toCharArray());
        writer.write(gson.toJson("two").toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        String actualOne = gson.fromJson(parser.next(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2395,actualOne);
        String actualTwo = gson.fromJson(parser.next(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,actualTwo);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoStrings() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoStrings");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        writer.write(gson.toJson("foo").toCharArray());
        writer.write(gson.toJson("two").toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        String actualOne = gson.fromJson(parser.next(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2395,actualOne);
        String actualTwo = gson.fromJson(parser.next(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,actualTwo);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoStrings_literalMutation1929() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoStrings_literalMutation1929");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        writer.write(gson.toJson("one").toCharArray());
        writer.write(gson.toJson("foo").toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        String actualOne = gson.fromJson(parser.next(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2395,actualOne);
        String actualTwo = gson.fromJson(parser.next(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,actualTwo);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoStrings_remove1173() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoStrings_remove1173");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        writer.write(gson.toJson("two").toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        String actualOne = gson.fromJson(parser.next(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2395,actualOne);
        String actualTwo = gson.fromJson(parser.next(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,actualTwo);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoStrings_remove1174() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoStrings_remove1174");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        writer.write(gson.toJson("two").toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        String actualOne = gson.fromJson(parser.next(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2395,actualOne);
        String actualTwo = gson.fromJson(parser.next(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2396,actualTwo);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoObjects_add1415() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_add1415");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,parser,2393,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoObjects_add1416() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_add1416");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,parser,2393,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(2 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,parser,2393,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation1921() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation1921");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 0 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,parser,2393,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation1922() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation1922");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , false , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,parser,2393,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation1923() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation1923");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "foo");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,parser,2393,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation1924() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation1924");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(1 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,parser,2393,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation1925() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation1925");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 1 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,parser,2393,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation1926() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation1926");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , true , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,parser,2393,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadWriteTwoObjects_literalMutation1927() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_literalMutation1927");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "foo");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,parser,2393,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoObjects_remove1171() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_remove1171");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,parser,2393,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadWriteTwoObjects_remove1172() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadWriteTwoObjects_remove1172");
        Gson gson = new Gson();
        CharArrayWriter writer = new CharArrayWriter();
        TestTypes.BagOfPrimitives expectedOne = new TestTypes.BagOfPrimitives(1 , 1 , true , "one");
        TestTypes.BagOfPrimitives expectedTwo = new TestTypes.BagOfPrimitives(2 , 2 , false , "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        CharArrayReader reader = new CharArrayReader(writer.toCharArray());
        JsonStreamParser parser = new JsonStreamParser(reader);
        TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2391,actualOne.stringValue);
        TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2392,actualTwo.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2394,parser,2393,parser.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypeMismatchThrowsJsonSyntaxExceptionForStrings_add1423() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeMismatchThrowsJsonSyntaxExceptionForStrings_add1423");
        try {
            gson.fromJson("true", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {            }.getType());
            gson.fromJson("true", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypeMismatchThrowsJsonSyntaxExceptionForStrings_add1424() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeMismatchThrowsJsonSyntaxExceptionForStrings_add1424");
        try {
            gson.fromJson("true", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeMismatchThrowsJsonSyntaxExceptionForStrings() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeMismatchThrowsJsonSyntaxExceptionForStrings");
        try {
            gson.fromJson("foo", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypeMismatchThrowsJsonSyntaxExceptionForReaders_add1421() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeMismatchThrowsJsonSyntaxExceptionForReaders_add1421");
        try {
            gson.fromJson(new StringReader("true"), new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {            }.getType());
            gson.fromJson(new StringReader("true"), new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypeMismatchThrowsJsonSyntaxExceptionForReaders_add1422() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeMismatchThrowsJsonSyntaxExceptionForReaders_add1422");
        try {
            gson.fromJson(new StringReader("true"), new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeMismatchThrowsJsonSyntaxExceptionForReaders() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeMismatchThrowsJsonSyntaxExceptionForReaders");
        try {
            gson.fromJson(new StringReader("foo"), new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

