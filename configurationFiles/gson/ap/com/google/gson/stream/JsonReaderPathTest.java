package com.google.gson.stream;

import java.io.IOException;
import java.io.StringReader;
import org.junit.Test;
import junit.framework.TestCase;

@SuppressWarnings(value = "resource")
public class JsonReaderPathTest extends TestCase {
    @Test(timeout = 1000)
    public void testPath_add279() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add279");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add280() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add280");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add281() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add281");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add282() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add282");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add283() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add283");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add284() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add284");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add285() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add285");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add286() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add286");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add287() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add287");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add288() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add288");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add289() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add289");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add290() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add290");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add291() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add291");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add292() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add292");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add293() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add293");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add294() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add294");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_add295() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_add295");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPath() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath");
        JsonReader reader = new JsonReader(new StringReader("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove240() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove240");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove241() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove241");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove242() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove242");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove243() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove243");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove244() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove244");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove245() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove245");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove246() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove246");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove247() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove247");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove248() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove248");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove249() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove249");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove250() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove250");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove251() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove251");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove252() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove252");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove253() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove253");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove254() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove254");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove255() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove255");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPath_remove256() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPath_remove256");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":[2,true,false,null,\"b\",{\"c\":\"d\"},[3]]}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),309,reader,308,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),311,reader,310,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),313,reader,312,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),315,reader,314,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),317,reader,316,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),319,reader,318,reader.getPath());
        reader.nextBoolean();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),321,reader,320,reader.getPath());
        reader.nextNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),323,reader,322,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),325,reader,324,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),327,reader,326,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),329,reader,328,reader.getPath());
        reader.nextString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),331,reader,330,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),333,reader,332,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),335,reader,334,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),337,reader,336,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),339,reader,338,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),341,reader,340,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),343,reader,342,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add265() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add265");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add266() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add266");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add267() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add267");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add268() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add268");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add269() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add269");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add270() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add270");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add271() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add271");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add272() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add272");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add273() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add273");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add274() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add274");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add275() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add275");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add276() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add276");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add277() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add277");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_add278() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_add278");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testObjectPath() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath");
        JsonReader reader = new JsonReader(new StringReader("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove226() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove226");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove227() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove227");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove228() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove228");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove229() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove229");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove230() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove230");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove231() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove231");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove232() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove232");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove233() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove233");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove234() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove234");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove235() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove235");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove236() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove236");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove237() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove237");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove238() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove238");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testObjectPath_remove239() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectPath_remove239");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),279,reader,278,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),281,reader,280,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),283,reader,282,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),285,reader,284,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),287,reader,286,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),289,reader,288,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),291,reader,290,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),293,reader,292,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),295,reader,294,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),297,reader,296,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),299,reader,298,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),301,reader,300,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),303,reader,302,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),305,reader,304,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),307,reader,306,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_add250() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_add250");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_add251() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_add251");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_add252() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_add252");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_add253() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_add253");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_add254() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_add254");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_add255() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_add255");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_add256() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_add256");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_add257() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_add257");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_add258() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_add258");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_add259() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_add259");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayPath() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath");
        JsonReader reader = new JsonReader(new StringReader("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_remove211() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_remove211");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_remove212() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_remove212");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_remove213() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_remove213");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_remove214() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_remove214");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_remove215() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_remove215");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_remove216() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_remove216");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_remove217() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_remove217");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_remove218() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_remove218");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_remove219() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_remove219");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        reader.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayPath_remove220() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayPath_remove220");
        JsonReader reader = new JsonReader(new StringReader("[1,2]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),253,reader,252,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),255,reader,254,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),257,reader,256,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),259,reader,258,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),261,reader,260,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),263,reader,262,reader.getPath());
        reader.nextInt();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),265,reader,264,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),267,reader,266,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),269,reader,268,reader.getPath());
        reader.peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),271,reader,270,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),273,reader,272,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValuesInOneDocument_add260() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValuesInOneDocument_add260");
        JsonReader reader = new JsonReader(new StringReader("[][]"));
        reader.setLenient(true);
        reader.setLenient(true);
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,reader,274,reader.getPath());
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,reader,276,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValuesInOneDocument_add261() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValuesInOneDocument_add261");
        JsonReader reader = new JsonReader(new StringReader("[][]"));
        reader.setLenient(true);
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,reader,274,reader.getPath());
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,reader,276,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValuesInOneDocument_add262() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValuesInOneDocument_add262");
        JsonReader reader = new JsonReader(new StringReader("[][]"));
        reader.setLenient(true);
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,reader,274,reader.getPath());
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,reader,276,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValuesInOneDocument_add263() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValuesInOneDocument_add263");
        JsonReader reader = new JsonReader(new StringReader("[][]"));
        reader.setLenient(true);
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,reader,274,reader.getPath());
        reader.beginArray();
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,reader,276,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValuesInOneDocument_add264() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValuesInOneDocument_add264");
        JsonReader reader = new JsonReader(new StringReader("[][]"));
        reader.setLenient(true);
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,reader,274,reader.getPath());
        reader.beginArray();
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,reader,276,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultipleTopLevelValuesInOneDocument() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValuesInOneDocument");
        JsonReader reader = new JsonReader(new StringReader("foo"));
        reader.setLenient(true);
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,reader,274,reader.getPath());
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,reader,276,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultipleTopLevelValuesInOneDocument_literalMutation286() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValuesInOneDocument_literalMutation286");
        JsonReader reader = new JsonReader(new StringReader("[][]"));
        reader.setLenient(true);
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,reader,274,reader.getPath());
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,reader,276,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValuesInOneDocument_remove221() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValuesInOneDocument_remove221");
        JsonReader reader = new JsonReader(new StringReader("[][]"));
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,reader,274,reader.getPath());
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,reader,276,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValuesInOneDocument_remove222() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValuesInOneDocument_remove222");
        JsonReader reader = new JsonReader(new StringReader("[][]"));
        reader.setLenient(true);
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,reader,274,reader.getPath());
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,reader,276,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValuesInOneDocument_remove223() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValuesInOneDocument_remove223");
        JsonReader reader = new JsonReader(new StringReader("[][]"));
        reader.setLenient(true);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,reader,274,reader.getPath());
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,reader,276,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValuesInOneDocument_remove224() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValuesInOneDocument_remove224");
        JsonReader reader = new JsonReader(new StringReader("[][]"));
        reader.setLenient(true);
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,reader,274,reader.getPath());
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,reader,276,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleTopLevelValuesInOneDocument_remove225() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleTopLevelValuesInOneDocument_remove225");
        JsonReader reader = new JsonReader(new StringReader("[][]"));
        reader.setLenient(true);
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),275,reader,274,reader.getPath());
        reader.beginArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),277,reader,276,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipArrayElements_add296() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipArrayElements_add296");
        JsonReader reader = new JsonReader(new StringReader("[1,2,3]"));
        reader.beginArray();
        reader.beginArray();
        reader.skipValue();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,reader,344,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipArrayElements_add297() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipArrayElements_add297");
        JsonReader reader = new JsonReader(new StringReader("[1,2,3]"));
        reader.beginArray();
        reader.skipValue();
        reader.skipValue();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,reader,344,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipArrayElements_add298() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipArrayElements_add298");
        JsonReader reader = new JsonReader(new StringReader("[1,2,3]"));
        reader.beginArray();
        reader.skipValue();
        reader.skipValue();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,reader,344,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipArrayElements() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipArrayElements");
        JsonReader reader = new JsonReader(new StringReader("foo"));
        reader.beginArray();
        reader.skipValue();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,reader,344,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipArrayElements_remove257() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipArrayElements_remove257");
        JsonReader reader = new JsonReader(new StringReader("[1,2,3]"));
        reader.skipValue();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,reader,344,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipArrayElements_remove258() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipArrayElements_remove258");
        JsonReader reader = new JsonReader(new StringReader("[1,2,3]"));
        reader.beginArray();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,reader,344,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipArrayElements_remove259() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipArrayElements_remove259");
        JsonReader reader = new JsonReader(new StringReader("[1,2,3]"));
        reader.beginArray();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),345,reader,344,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipObjectNames_add301() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectNames_add301");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1}"));
        reader.beginObject();
        reader.beginObject();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,reader,348,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipObjectNames_add302() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectNames_add302");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1}"));
        reader.beginObject();
        reader.skipValue();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,reader,348,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipObjectNames() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectNames");
        JsonReader reader = new JsonReader(new StringReader("foo"));
        reader.beginObject();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,reader,348,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipObjectNames_remove262() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectNames_remove262");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1}"));
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,reader,348,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipObjectNames_remove263() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectNames_remove263");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1}"));
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),349,reader,348,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipObjectValues_add303() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectValues_add303");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        reader.beginObject();
        reader.beginObject();
        reader.nextName();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,reader,350,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),353,reader,352,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipObjectValues_add304() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectValues_add304");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        reader.beginObject();
        reader.nextName();
        reader.nextName();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,reader,350,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),353,reader,352,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipObjectValues_add305() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectValues_add305");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        reader.beginObject();
        reader.nextName();
        reader.skipValue();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,reader,350,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),353,reader,352,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipObjectValues_add306() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectValues_add306");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        reader.beginObject();
        reader.nextName();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,reader,350,reader.getPath());
        reader.nextName();
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),353,reader,352,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipObjectValues() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectValues");
        JsonReader reader = new JsonReader(new StringReader("foo"));
        reader.beginObject();
        reader.nextName();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,reader,350,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),353,reader,352,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipObjectValues_remove264() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectValues_remove264");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        reader.nextName();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,reader,350,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),353,reader,352,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipObjectValues_remove265() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectValues_remove265");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        reader.beginObject();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,reader,350,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),353,reader,352,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipObjectValues_remove266() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectValues_remove266");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        reader.beginObject();
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,reader,350,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),353,reader,352,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipObjectValues_remove267() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipObjectValues_remove267");
        JsonReader reader = new JsonReader(new StringReader("{\"a\":1,\"b\":2}"));
        reader.beginObject();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),351,reader,350,reader.getPath());
        reader.nextName();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),353,reader,352,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipNestedStructures_add299() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNestedStructures_add299");
        JsonReader reader = new JsonReader(new StringReader("[[1,2,3],4]"));
        reader.beginArray();
        reader.beginArray();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,reader,346,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipNestedStructures_add300() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNestedStructures_add300");
        JsonReader reader = new JsonReader(new StringReader("[[1,2,3],4]"));
        reader.beginArray();
        reader.skipValue();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,reader,346,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSkipNestedStructures() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNestedStructures");
        JsonReader reader = new JsonReader(new StringReader("foo"));
        reader.beginArray();
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,reader,346,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipNestedStructures_remove260() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNestedStructures_remove260");
        JsonReader reader = new JsonReader(new StringReader("[[1,2,3],4]"));
        reader.skipValue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,reader,346,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSkipNestedStructures_remove261() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSkipNestedStructures_remove261");
        JsonReader reader = new JsonReader(new StringReader("[[1,2,3],4]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),347,reader,346,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_add242() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_add242");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_add243() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_add243");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_add244() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_add244");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_add245() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_add245");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_add246() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_add246");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_add247() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_add247");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_add248() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_add248");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_add249() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_add249");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfObjects() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects");
        JsonReader reader = new JsonReader(new StringReader("foo"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_remove203() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_remove203");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_remove204() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_remove204");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_remove205() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_remove205");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_remove206() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_remove206");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_remove207() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_remove207");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_remove208() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_remove208");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_remove209() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_remove209");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfObjects_remove210() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjects_remove210");
        JsonReader reader = new JsonReader(new StringReader("[{},{},{}]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),237,reader,236,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),239,reader,238,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),241,reader,240,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),243,reader,242,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),245,reader,244,reader.getPath());
        reader.beginObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),247,reader,246,reader.getPath());
        reader.endObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),249,reader,248,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),251,reader,250,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_add234() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_add234");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_add235() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_add235");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_add236() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_add236");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_add237() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_add237");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_add238() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_add238");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_add239() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_add239");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_add240() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_add240");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_add241() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_add241");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfArrays() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays");
        JsonReader reader = new JsonReader(new StringReader("foo"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_remove195() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_remove195");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_remove196() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_remove196");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_remove197() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_remove197");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_remove198() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_remove198");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_remove199() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_remove199");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_remove200() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_remove200");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_remove201() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_remove201");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testArrayOfArrays_remove202() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArrays_remove202");
        JsonReader reader = new JsonReader(new StringReader("[[],[],[]]"));
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),221,reader,220,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),223,reader,222,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),225,reader,224,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),227,reader,226,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),229,reader,228,reader.getPath());
        reader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),231,reader,230,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),233,reader,232,reader.getPath());
        reader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),235,reader,234,reader.getPath());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

