package com.google.gson;

import java.io.IOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.List;
import java.io.StringReader;
import java.io.StringWriter;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

public final class MixedStreamTest extends TestCase {
    private static final Car BLUE_MUSTANG = new Car("mustang" , 255);

    private static final Car BLACK_BMW = new Car("bmw" , 0);

    private static final Car RED_MIATA = new Car("miata" , 16711680);

    private static final String CARS_JSON = "[\n" + ("  {\n" + ("    \"name\": \"mustang\",\n" + ("    \"color\": 255\n" + ("  },\n" + ("  {\n" + ("    \"name\": \"bmw\",\n" + ("    \"color\": 0\n" + ("  },\n" + ("  {\n" + ("    \"name\": \"miata\",\n" + ("    \"color\": 16711680\n" + ("  }\n" + "]"))))))))))));

    @Test(timeout = 1000)
    public void testWriteMixedStreamed_add1646() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed_add1646");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.setIndent("  ");
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteMixedStreamed_add1647() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed_add1647");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.setIndent("  ");
        jsonWriter.setIndent("  ");
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteMixedStreamed_add1648() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed_add1648");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.setIndent("  ");
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteMixedStreamed_add1649() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed_add1649");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.setIndent("  ");
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteMixedStreamed_add1650() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed_add1650");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.setIndent("  ");
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteMixedStreamed_add1651() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed_add1651");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.setIndent("  ");
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        jsonWriter.endArray();
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteMixedStreamed() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.setIndent("foo");
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteMixedStreamed_remove1347() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed_remove1347");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("  ");
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteMixedStreamed_remove1348() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed_remove1348");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteMixedStreamed_remove1349() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed_remove1349");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.setIndent("  ");
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteMixedStreamed_remove1350() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed_remove1350");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.setIndent("  ");
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteMixedStreamed_remove1351() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed_remove1351");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.setIndent("  ");
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        jsonWriter.endArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteMixedStreamed_remove1352() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMixedStreamed_remove1352");
        Gson gson = new Gson();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.beginArray();
        jsonWriter.setIndent("  ");
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLACK_BMW, Car.class, jsonWriter);
        gson.toJson(RED_MIATA, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3164,com.google.gson.MixedStreamTest.CARS_JSON);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3166,stringWriter,3165,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadMixedStreamed() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadMixedStreamed");
        Gson gson = new Gson();
        StringReader stringReader = new StringReader(CARS_JSON);
        JsonReader jsonReader = new JsonReader(stringReader);
        jsonReader.beginArray();
        jsonReader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3137,com.google.gson.MixedStreamTest.BLUE_MUSTANG);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3139,gson,3138,gson.fromJson(jsonReader, com.google.gson.MixedStreamTest.Car.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3140,com.google.gson.MixedStreamTest.BLACK_BMW);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3142,gson,3141,gson.fromJson(jsonReader, com.google.gson.MixedStreamTest.Car.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3143,com.google.gson.MixedStreamTest.RED_MIATA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3145,gson,3144,gson.fromJson(jsonReader, com.google.gson.MixedStreamTest.Car.class));
        jsonReader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadMixedStreamed_add1619() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadMixedStreamed_add1619");
        Gson gson = new Gson();
        StringReader stringReader = new StringReader(CARS_JSON);
        JsonReader jsonReader = new JsonReader(stringReader);
        jsonReader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3137,com.google.gson.MixedStreamTest.BLUE_MUSTANG);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3139,gson,3138,gson.fromJson(jsonReader, com.google.gson.MixedStreamTest.Car.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3140,com.google.gson.MixedStreamTest.BLACK_BMW);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3142,gson,3141,gson.fromJson(jsonReader, com.google.gson.MixedStreamTest.Car.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3143,com.google.gson.MixedStreamTest.RED_MIATA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3145,gson,3144,gson.fromJson(jsonReader, com.google.gson.MixedStreamTest.Car.class));
        jsonReader.endArray();
        jsonReader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadMixedStreamed_remove1324() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadMixedStreamed_remove1324");
        Gson gson = new Gson();
        StringReader stringReader = new StringReader(CARS_JSON);
        JsonReader jsonReader = new JsonReader(stringReader);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3137,com.google.gson.MixedStreamTest.BLUE_MUSTANG);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3139,gson,3138,gson.fromJson(jsonReader, com.google.gson.MixedStreamTest.Car.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3140,com.google.gson.MixedStreamTest.BLACK_BMW);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3142,gson,3141,gson.fromJson(jsonReader, com.google.gson.MixedStreamTest.Car.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3143,com.google.gson.MixedStreamTest.RED_MIATA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3145,gson,3144,gson.fromJson(jsonReader, com.google.gson.MixedStreamTest.Car.class));
        jsonReader.endArray();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadMixedStreamed_remove1325() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadMixedStreamed_remove1325");
        Gson gson = new Gson();
        StringReader stringReader = new StringReader(CARS_JSON);
        JsonReader jsonReader = new JsonReader(stringReader);
        jsonReader.beginArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3137,com.google.gson.MixedStreamTest.BLUE_MUSTANG);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3139,gson,3138,gson.fromJson(jsonReader, com.google.gson.MixedStreamTest.Car.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3140,com.google.gson.MixedStreamTest.BLACK_BMW);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3142,gson,3141,gson.fromJson(jsonReader, com.google.gson.MixedStreamTest.Car.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3143,com.google.gson.MixedStreamTest.RED_MIATA);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3145,gson,3144,gson.fromJson(jsonReader, com.google.gson.MixedStreamTest.Car.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReaderDoesNotMutateState_add1622() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderDoesNotMutateState_add1622");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        jsonReader.beginArray();
        jsonReader.setLenient(false);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,jsonReader,3146,jsonReader.isLenient());
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,jsonReader,3148,jsonReader.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReaderDoesNotMutateState_add1623() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderDoesNotMutateState_add1623");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        jsonReader.setLenient(false);
        jsonReader.setLenient(false);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,jsonReader,3146,jsonReader.isLenient());
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,jsonReader,3148,jsonReader.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReaderDoesNotMutateState_add1624() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderDoesNotMutateState_add1624");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        jsonReader.setLenient(false);
        gson.fromJson(jsonReader, Car.class);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,jsonReader,3146,jsonReader.isLenient());
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,jsonReader,3148,jsonReader.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReaderDoesNotMutateState_add1625() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderDoesNotMutateState_add1625");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        jsonReader.setLenient(false);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,jsonReader,3146,jsonReader.isLenient());
        jsonReader.setLenient(true);
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,jsonReader,3148,jsonReader.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReaderDoesNotMutateState_add1626() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderDoesNotMutateState_add1626");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        jsonReader.setLenient(false);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,jsonReader,3146,jsonReader.isLenient());
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,jsonReader,3148,jsonReader.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReaderDoesNotMutateState() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderDoesNotMutateState");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,jsonReader,3146,jsonReader.isLenient());
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,jsonReader,3148,jsonReader.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReaderDoesNotMutateState_literalMutation2378() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderDoesNotMutateState_literalMutation2378");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        jsonReader.setLenient(false);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,jsonReader,3146,jsonReader.isLenient());
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,jsonReader,3148,jsonReader.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReaderDoesNotMutateState_remove1326() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderDoesNotMutateState_remove1326");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.setLenient(false);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,jsonReader,3146,jsonReader.isLenient());
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,jsonReader,3148,jsonReader.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReaderDoesNotMutateState_remove1327() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderDoesNotMutateState_remove1327");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,jsonReader,3146,jsonReader.isLenient());
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,jsonReader,3148,jsonReader.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReaderDoesNotMutateState_remove1328() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderDoesNotMutateState_remove1328");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        jsonReader.setLenient(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,jsonReader,3146,jsonReader.isLenient());
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,jsonReader,3148,jsonReader.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReaderDoesNotMutateState_remove1329() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderDoesNotMutateState_remove1329");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,jsonReader,3146,jsonReader.isLenient());
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,jsonReader,3148,jsonReader.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReaderDoesNotMutateState_remove1330() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReaderDoesNotMutateState_remove1330");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        jsonReader.setLenient(false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3147,jsonReader,3146,jsonReader.isLenient());
        jsonReader.setLenient(true);
        gson.fromJson(jsonReader, Car.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3149,jsonReader,3148,jsonReader.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_add1631() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_add1631");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_add1632() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_add1632");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_add1633() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_add1633");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_add1634() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_add1634");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_add1635() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_add1635");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_add1636() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_add1636");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_add1637() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_add1637");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteDoesNotMutateState() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteDoesNotMutateState_literalMutation2380() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_literalMutation2380");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteDoesNotMutateState_literalMutation2381() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_literalMutation2381");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteDoesNotMutateState_literalMutation2382() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_literalMutation2382");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_remove1334() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_remove1334");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_remove1335() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_remove1335");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_remove1336() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_remove1336");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_remove1337() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_remove1337");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_remove1338() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_remove1338");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setLenient(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_remove1339() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_remove1339");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteDoesNotMutateState_remove1340() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteDoesNotMutateState_remove1340");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3151,jsonWriter,3150,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3153,jsonWriter,3152,jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3155,jsonWriter,3154,jsonWriter.isHtmlSafe());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3157,jsonWriter,3156,jsonWriter.isLenient());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadInvalidState() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadInvalidState");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        jsonReader.beginArray();
        jsonReader.beginObject();
        try {
            gson.fromJson(jsonReader, String.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadInvalidState_add1616() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadInvalidState_add1616");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        jsonReader.beginObject();
        jsonReader.beginObject();
        try {
            gson.fromJson(jsonReader, String.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadInvalidState_add1617() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadInvalidState_add1617");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        jsonReader.beginObject();
        try {
            gson.fromJson(jsonReader, String.class);
            gson.fromJson(jsonReader, String.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadInvalidState_remove1322() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadInvalidState_remove1322");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginObject();
        try {
            gson.fromJson(jsonReader, String.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadInvalidState_remove1323() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadInvalidState_remove1323");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.beginArray();
        try {
            gson.fromJson(jsonReader, String.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadClosed() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadClosed");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.close();
        jsonReader.close();
        try {
            gson.fromJson(jsonReader, new TypeToken<java.util.List<Car>>() {            }.getType());
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadClosed_add1613() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadClosed_add1613");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.close();
        try {
            gson.fromJson(jsonReader, new TypeToken<java.util.List<Car>>() {            }.getType());
            gson.fromJson(jsonReader, new TypeToken<java.util.List<Car>>() {            }.getType());
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadClosed_add1614() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadClosed_add1614");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        jsonReader.close();
        try {
            gson.fromJson(jsonReader, new TypeToken<java.util.List<Car>>() {            }.getType());
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadClosed_remove1321() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadClosed_remove1321");
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new StringReader(CARS_JSON));
        try {
            gson.fromJson(jsonReader, new TypeToken<java.util.List<Car>>() {            }.getType());
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteInvalidState() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteInvalidState");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginObject();
        jsonWriter.beginObject();
        try {
            gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteInvalidState_add1642() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteInvalidState_add1642");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginObject();
        try {
            gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
            gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteInvalidState_remove1344() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteInvalidState_remove1344");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        try {
            gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteClosed() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteClosed");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.beginArray();
        jsonWriter.endArray();
        jsonWriter.close();
        try {
            gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteClosed_add1628() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteClosed_add1628");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.endArray();
        jsonWriter.endArray();
        jsonWriter.close();
        try {
            gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteClosed_add1629() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteClosed_add1629");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.endArray();
        jsonWriter.close();
        jsonWriter.close();
        try {
            gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteClosed_add1630() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteClosed_add1630");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.endArray();
        jsonWriter.close();
        try {
            gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
            gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteClosed_remove1331() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteClosed_remove1331");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.endArray();
        jsonWriter.close();
        try {
            gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteClosed_remove1332() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteClosed_remove1332");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.close();
        try {
            gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteClosed_remove1333() throws IOException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteClosed_remove1333");
        Gson gson = new Gson();
        JsonWriter jsonWriter = new JsonWriter(new StringWriter());
        jsonWriter.beginArray();
        jsonWriter.endArray();
        try {
            gson.toJson(BLUE_MUSTANG, Car.class, jsonWriter);
        } catch (IllegalStateException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteNulls_add1652() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteNulls_add1652");
        Gson gson = new Gson();
        try {
            gson.toJson(new com.google.gson.JsonPrimitive("hello"), ((JsonWriter)(null)));
            gson.toJson(new com.google.gson.JsonPrimitive("hello"), ((JsonWriter)(null)));
        } catch (NullPointerException expected) {
        }
        StringWriter stringWriter = new StringWriter();
        gson.toJson(null, new JsonWriter(stringWriter));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3168,stringWriter,3167,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteNulls_add1653() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteNulls_add1653");
        Gson gson = new Gson();
        try {
            gson.toJson(new com.google.gson.JsonPrimitive("hello"), ((JsonWriter)(null)));
        } catch (NullPointerException expected) {
        }
        StringWriter stringWriter = new StringWriter();
        gson.toJson(null, new JsonWriter(stringWriter));
        gson.toJson(null, new JsonWriter(stringWriter));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3168,stringWriter,3167,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteNulls() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteNulls");
        Gson gson = new Gson();
        try {
            gson.toJson(new com.google.gson.JsonPrimitive("foo"), ((JsonWriter)(null)));
        } catch (NullPointerException expected) {
        }
        StringWriter stringWriter = new StringWriter();
        gson.toJson(null, new JsonWriter(stringWriter));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3168,stringWriter,3167,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteNulls_remove1353() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteNulls_remove1353");
        Gson gson = new Gson();
        try {
            gson.toJson(new com.google.gson.JsonPrimitive("hello"), ((JsonWriter)(null)));
        } catch (NullPointerException expected) {
        }
        StringWriter stringWriter = new StringWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3168,stringWriter,3167,stringWriter.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadNulls_add1620() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNulls_add1620");
        Gson gson = new Gson();
        try {
            gson.fromJson(((JsonReader)(null)), java.lang.Integer.class);
            gson.fromJson(((JsonReader)(null)), java.lang.Integer.class);
        } catch (NullPointerException expected) {
        }
        try {
            gson.fromJson(new JsonReader(new StringReader("true")), null);
        } catch (NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadNulls_add1621() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNulls_add1621");
        Gson gson = new Gson();
        try {
            gson.fromJson(((JsonReader)(null)), java.lang.Integer.class);
        } catch (NullPointerException expected) {
        }
        try {
            gson.fromJson(new JsonReader(new StringReader("true")), null);
            gson.fromJson(new JsonReader(new StringReader("true")), null);
        } catch (NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadNulls() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadNulls");
        Gson gson = new Gson();
        try {
            gson.fromJson(((JsonReader)(null)), java.lang.Integer.class);
        } catch (NullPointerException expected) {
        }
        try {
            gson.fromJson(new JsonReader(new StringReader("foo")), null);
        } catch (NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteHtmlSafe_add1638() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteHtmlSafe_add1638");
        List<java.lang.String> contents = java.util.Arrays.asList("<", ">", "&", "=", "\'");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        StringWriter writer = new StringWriter();
        new Gson().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3159,writer,3158,writer.toString());
        writer = new StringWriter();
        new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3161,writer,3160,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteHtmlSafe_add1639() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteHtmlSafe_add1639");
        List<java.lang.String> contents = java.util.Arrays.asList("<", ">", "&", "=", "\'");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        StringWriter writer = new StringWriter();
        new Gson().toJson(contents, type, new JsonWriter(writer));
        new Gson().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3159,writer,3158,writer.toString());
        writer = new StringWriter();
        new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3161,writer,3160,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteHtmlSafe_add1640() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteHtmlSafe_add1640");
        List<java.lang.String> contents = java.util.Arrays.asList("<", ">", "&", "=", "\'");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        StringWriter writer = new StringWriter();
        new Gson().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3159,writer,3158,writer.toString());
        writer = new StringWriter();
        new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer));
        new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3161,writer,3160,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteHtmlSafe() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteHtmlSafe");
        List<java.lang.String> contents = java.util.Arrays.asList("foo", ">", "&", "=", "\'");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        StringWriter writer = new StringWriter();
        new Gson().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3159,writer,3158,writer.toString());
        writer = new StringWriter();
        new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3161,writer,3160,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteHtmlSafe_literalMutation2384() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteHtmlSafe_literalMutation2384");
        List<java.lang.String> contents = java.util.Arrays.asList("<", "foo", "&", "=", "\'");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        StringWriter writer = new StringWriter();
        new Gson().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3159,writer,3158,writer.toString());
        writer = new StringWriter();
        new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3161,writer,3160,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteHtmlSafe_literalMutation2385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteHtmlSafe_literalMutation2385");
        List<java.lang.String> contents = java.util.Arrays.asList("<", ">", "foo", "=", "\'");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        StringWriter writer = new StringWriter();
        new Gson().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3159,writer,3158,writer.toString());
        writer = new StringWriter();
        new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3161,writer,3160,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteHtmlSafe_literalMutation2386() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteHtmlSafe_literalMutation2386");
        List<java.lang.String> contents = java.util.Arrays.asList("<", ">", "&", "foo", "\'");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        StringWriter writer = new StringWriter();
        new Gson().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3159,writer,3158,writer.toString());
        writer = new StringWriter();
        new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3161,writer,3160,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteHtmlSafe_literalMutation2387() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteHtmlSafe_literalMutation2387");
        List<java.lang.String> contents = java.util.Arrays.asList("<", ">", "&", "=", "foo");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        StringWriter writer = new StringWriter();
        new Gson().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3159,writer,3158,writer.toString());
        writer = new StringWriter();
        new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3161,writer,3160,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteHtmlSafe_remove1341() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteHtmlSafe_remove1341");
        List<java.lang.String> contents = java.util.Arrays.asList("<", ">", "&", "=", "\'");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        StringWriter writer = new StringWriter();
        new Gson().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3159,writer,3158,writer.toString());
        writer = new StringWriter();
        new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3161,writer,3160,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteHtmlSafe_remove1342() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteHtmlSafe_remove1342");
        List<java.lang.String> contents = java.util.Arrays.asList("<", ">", "&", "=", "\'");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        StringWriter writer = new StringWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3159,writer,3158,writer.toString());
        writer = new StringWriter();
        new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3161,writer,3160,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteHtmlSafe_remove1343() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteHtmlSafe_remove1343");
        List<java.lang.String> contents = java.util.Arrays.asList("<", ">", "&", "=", "\'");
        Type type = new TypeToken<java.util.List<java.lang.String>>() {        }.getType();
        StringWriter writer = new StringWriter();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3159,writer,3158,writer.toString());
        writer = new StringWriter();
        new GsonBuilder().disableHtmlEscaping().create().toJson(contents, type, new JsonWriter(writer));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3161,writer,3160,writer.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLenient_add1643() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLenient_add1643");
        List<java.lang.Double> doubles = java.util.Arrays.asList(Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        Type type = new TypeToken<java.util.List<java.lang.Double>>() {        }.getType();
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3163,writer,3162,writer.toString());
        try {
            new Gson().toJson(doubles, type, new JsonWriter(new StringWriter()));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLenient_add1644() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLenient_add1644");
        List<java.lang.Double> doubles = java.util.Arrays.asList(Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        Type type = new TypeToken<java.util.List<java.lang.Double>>() {        }.getType();
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3163,writer,3162,writer.toString());
        try {
            new Gson().toJson(doubles, type, new JsonWriter(new StringWriter()));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLenient_add1645() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLenient_add1645");
        List<java.lang.Double> doubles = java.util.Arrays.asList(Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        Type type = new TypeToken<java.util.List<java.lang.Double>>() {        }.getType();
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3163,writer,3162,writer.toString());
        try {
            new Gson().toJson(doubles, type, new JsonWriter(new StringWriter()));
            new Gson().toJson(doubles, type, new JsonWriter(new StringWriter()));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLenient() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLenient");
        List<java.lang.Double> doubles = java.util.Arrays.asList(Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, -1.0, 0.5, 0.0);
        Type type = new TypeToken<java.util.List<java.lang.Double>>() {        }.getType();
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3163,writer,3162,writer.toString());
        try {
            new Gson().toJson(doubles, type, new JsonWriter(new StringWriter()));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLenient_literalMutation2389() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLenient_literalMutation2389");
        List<java.lang.Double> doubles = java.util.Arrays.asList(Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, -0.0, -0.5, 0.0);
        Type type = new TypeToken<java.util.List<java.lang.Double>>() {        }.getType();
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3163,writer,3162,writer.toString());
        try {
            new Gson().toJson(doubles, type, new JsonWriter(new StringWriter()));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWriteLenient_literalMutation2390() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLenient_literalMutation2390");
        List<java.lang.Double> doubles = java.util.Arrays.asList(Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, -0.0, 0.5, 1.0);
        Type type = new TypeToken<java.util.List<java.lang.Double>>() {        }.getType();
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3163,writer,3162,writer.toString());
        try {
            new Gson().toJson(doubles, type, new JsonWriter(new StringWriter()));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLenient_remove1345() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLenient_remove1345");
        List<java.lang.Double> doubles = java.util.Arrays.asList(Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        Type type = new TypeToken<java.util.List<java.lang.Double>>() {        }.getType();
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3163,writer,3162,writer.toString());
        try {
            new Gson().toJson(doubles, type, new JsonWriter(new StringWriter()));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testWriteLenient_remove1346() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteLenient_remove1346");
        List<java.lang.Double> doubles = java.util.Arrays.asList(Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        Type type = new TypeToken<java.util.List<java.lang.Double>>() {        }.getType();
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3163,writer,3162,writer.toString());
        try {
            new Gson().toJson(doubles, type, new JsonWriter(new StringWriter()));
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    static final class Car {
        String name;

        int color;

        Car(String name ,int color) {
            this.name = name;
            this.color = color;
        }

        Car() {
        }

        @Override
        public int hashCode() {
            return (name.hashCode()) ^ (color);
        }

        @Override
        public boolean equals(Object o) {
            return ((o instanceof Car) && (((Car)(o)).name.equals(name))) && ((((Car)(o)).color) == (color));
        }
    }
}

