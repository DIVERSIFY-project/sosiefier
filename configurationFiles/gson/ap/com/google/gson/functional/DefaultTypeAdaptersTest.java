package com.google.gson.functional;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.BitSet;
import java.util.Calendar;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.GregorianCalendar;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashSet;
import java.io.IOException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import org.junit.Test;
import junit.framework.TestCase;
import java.sql.Time;
import java.util.TimeZone;
import java.sql.Timestamp;
import java.util.TreeSet;
import java.lang.reflect.Type;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.net.URI;
import java.net.URL;
import java.util.UUID;

/** 
 * Functional test for Json serialization and deserialization for common classes for which default
 * support is provided in Gson. The tests for Map types are available in {@link MapTest}.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class DefaultTypeAdaptersTest extends TestCase {
    private Gson gson;

    private TimeZone oldTimeZone;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.oldTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        Locale.setDefault(Locale.US);
        gson = new Gson();
    }

    @Override
    protected void tearDown() throws Exception {
        TimeZone.setDefault(oldTimeZone);
        super.tearDown();
    }

    @Test(timeout = 1000)
    public void testClassSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassSerialization");
        try {
            gson.toJson(String.class);
            gson.toJson(String.class);
        } catch (UnsupportedOperationException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Class.class, new MyClassTypeAdapter()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1212,gson,1211,gson.toJson(java.lang.String.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClassDeserialization_add1043() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassDeserialization_add1043");
        try {
            gson.fromJson("String.class", String.class.getClass());
            gson.fromJson("String.class", String.class.getClass());
        } catch (UnsupportedOperationException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Class.class, new MyClassTypeAdapter()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1208,java.lang.String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1210,gson,1209,gson.fromJson("java.lang.String", java.lang.Class.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassDeserialization");
        try {
            gson.fromJson("foo", String.class.getClass());
        } catch (UnsupportedOperationException expected) {
        }
        gson = new GsonBuilder().registerTypeAdapter(Class.class, new MyClassTypeAdapter()).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1208,java.lang.String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1210,gson,1209,gson.fromJson("java.lang.String", java.lang.Class.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUrlSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUrlSerialization");
        String urlValue = "foo";
        URL url = new URL(urlValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1409,gson,1408,gson.toJson(url));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUrlDeserialization_add1111() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUrlDeserialization_add1111");
        String urlValue = "http://google.com/";
        String json = "\'http:\\/\\/google.com\\/\'";
        URL target = gson.fromJson(json, URL.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1399,urlValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1401,target,1400,target.toExternalForm());
        gson.fromJson((('\"' + urlValue) + '\"'), URL.class);
        gson.fromJson((('\"' + urlValue) + '\"'), URL.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1402,urlValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1404,target,1403,target.toExternalForm());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUrlDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUrlDeserialization");
        String urlValue = "foo";
        String json = "\'http:\\/\\/google.com\\/\'";
        URL target = gson.fromJson(json, URL.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1399,urlValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1401,target,1400,target.toExternalForm());
        gson.fromJson((('\"' + urlValue) + '\"'), URL.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1402,urlValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1404,target,1403,target.toExternalForm());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUrlDeserialization_literalMutation1193() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUrlDeserialization_literalMutation1193");
        String urlValue = "http://google.com/";
        String json = "foo";
        URL target = gson.fromJson(json, URL.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1399,urlValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1401,target,1400,target.toExternalForm());
        gson.fromJson((('\"' + urlValue) + '\"'), URL.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1402,urlValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1404,target,1403,target.toExternalForm());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUrlDeserialization_remove928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUrlDeserialization_remove928");
        String urlValue = "http://google.com/";
        String json = "\'http:\\/\\/google.com\\/\'";
        URL target = gson.fromJson(json, URL.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1399,urlValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1401,target,1400,target.toExternalForm());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1402,urlValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1404,target,1403,target.toExternalForm());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUrlNullSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUrlNullSerialization");
        ClassWithUrlField target = new ClassWithUrlField();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1407,gson,1406,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUrlNullDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUrlNullDeserialization");
        String json = "foo";
        ClassWithUrlField target = gson.fromJson(json, ClassWithUrlField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1405,target.url);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ClassWithUrlField {
        URL url;
    }

    public void testUriSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUriSerialization");
        String uriValue = "foo";
        URI uri = new URI(uriValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1398,gson,1397,gson.toJson(uri));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUriDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUriDeserialization");
        String uriValue = "foo";
        String json = ('\"' + uriValue) + '\"';
        URI target = gson.fromJson(json, URI.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1394,uriValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1396,target,1395,target.toASCIIString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1068() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1068");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1069() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1069");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1070() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1070");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1071() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1071");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1072() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1072");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1073() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1073");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1074() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1074");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1075() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1075");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1076() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1076");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1077() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1077");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1078() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1078");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1079() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1079");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1080() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1080");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1081() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1081");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1082() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1082");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1083() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1083");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1084() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1084");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1085() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1085");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1086() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1086");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1087() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1087");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1088() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1088");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1089() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1089");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1090() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1090");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1091() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1091");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1092() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1092");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1093() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1093");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1094() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1094");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1095() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1095");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1096() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1096");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1097() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1097");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_add1098() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_add1098");
        testNullSerializationAndDeserialization(java.lang.Boolean.class);
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove888() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove888");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove889() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove889");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove890() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove890");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove891() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove891");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove892() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove892");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove893() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove893");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove894() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove894");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove895() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove895");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove896() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove896");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove897() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove897");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove898() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove898");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove899() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove899");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove900() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove900");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove901() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove901");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove902() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove902");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove903() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove903");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove904() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove904");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove905() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove905");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove906() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove906");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove907() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove907");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove908() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove908");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove909() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove909");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove910() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove910");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove911() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove911");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove912() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove912");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove913() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove913");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove914() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove914");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove915() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove915");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove916() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove916");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove917() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove917");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove918() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove918");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullSerialization_remove919() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization_remove919");
        testNullSerializationAndDeserialization(java.lang.Byte.class);
        testNullSerializationAndDeserialization(java.lang.Short.class);
        testNullSerializationAndDeserialization(java.lang.Integer.class);
        testNullSerializationAndDeserialization(java.lang.Long.class);
        testNullSerializationAndDeserialization(java.lang.Double.class);
        testNullSerializationAndDeserialization(java.lang.Float.class);
        testNullSerializationAndDeserialization(Number.class);
        testNullSerializationAndDeserialization(java.lang.Character.class);
        testNullSerializationAndDeserialization(String.class);
        testNullSerializationAndDeserialization(StringBuilder.class);
        testNullSerializationAndDeserialization(StringBuffer.class);
        testNullSerializationAndDeserialization(BigDecimal.class);
        testNullSerializationAndDeserialization(BigInteger.class);
        testNullSerializationAndDeserialization(TreeSet.class);
        testNullSerializationAndDeserialization(java.util.ArrayList.class);
        testNullSerializationAndDeserialization(HashSet.class);
        testNullSerializationAndDeserialization(Properties.class);
        testNullSerializationAndDeserialization(URL.class);
        testNullSerializationAndDeserialization(URI.class);
        testNullSerializationAndDeserialization(UUID.class);
        testNullSerializationAndDeserialization(Locale.class);
        testNullSerializationAndDeserialization(java.net.InetAddress.class);
        testNullSerializationAndDeserialization(BitSet.class);
        testNullSerializationAndDeserialization(Date.class);
        testNullSerializationAndDeserialization(GregorianCalendar.class);
        testNullSerializationAndDeserialization(Calendar.class);
        testNullSerializationAndDeserialization(Time.class);
        testNullSerializationAndDeserialization(Timestamp.class);
        testNullSerializationAndDeserialization(java.sql.Date.class);
        testNullSerializationAndDeserialization(java.lang.Enum.class);
        testNullSerializationAndDeserialization(Class.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void testNullSerializationAndDeserialization(Class<?> c) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerializationAndDeserialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1360,gson,1359,gson.toJson(null, c));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1362,gson,1361,gson.fromJson("null", c));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUuidSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUuidSerialization");
        String uuidValue = "foo";
        UUID uuid = UUID.fromString(uuidValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1413,(('\"' + uuidValue) + '\"'));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1415,gson,1414,gson.toJson(uuid));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUuidDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUuidDeserialization");
        String uuidValue = "foo";
        String json = ('\"' + uuidValue) + '\"';
        UUID target = gson.fromJson(json, UUID.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1410,uuidValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1412,target,1411,target.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleSerializationWithLanguage() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleSerializationWithLanguage");
        Locale target = new Locale("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1354,gson,1353,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleDeserializationWithLanguage() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleDeserializationWithLanguage");
        String json = "foo";
        Locale locale = gson.fromJson(json, Locale.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1351,locale,1350,locale.getLanguage());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleDeserializationWithLanguageCountry() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleDeserializationWithLanguageCountry");
        String json = "foo";
        Locale locale = gson.fromJson(json, Locale.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1348,java.util.Locale.CANADA_FRENCH);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1349,locale);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleSerializationWithLanguageCountry() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleSerializationWithLanguageCountry");
        Locale target = new Locale("foo" , "DE" , "EURO");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1352,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleSerializationWithLanguageCountryVariant() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleSerializationWithLanguageCountryVariant");
        Locale target = new Locale("de" , "foo" , "EURO");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1352,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleSerializationWithLanguageCountryVariant_literalMutation1170() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleSerializationWithLanguageCountryVariant_literalMutation1170");
        Locale target = new Locale("de" , "DE" , "foo");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1352,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLocaleDeserializationWithLanguageCountryVariant() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLocaleDeserializationWithLanguageCountryVariant");
        String json = "foo";
        Locale locale = gson.fromJson(json, Locale.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1343,locale,1342,locale.getLanguage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1345,locale,1344,locale.getCountry());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1347,locale,1346,locale.getVariant());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalFieldSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalFieldSerialization");
        ClassWithBigDecimal target = new ClassWithBigDecimal("foo");
        String json = gson.toJson(target);
        String actual = json.substring(((json.indexOf(':')) + 1), json.indexOf('}'));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1188,target.value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1189,new java.math.BigDecimal(actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalFieldSerialization_literalMutation1091() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalFieldSerialization_literalMutation1091");
        ClassWithBigDecimal target = new ClassWithBigDecimal("-122.01e-21");
        String json = gson.toJson(target);
        String actual = json.substring(((json.indexOf(':')) + 0), json.indexOf('}'));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1188,target.value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1189,new java.math.BigDecimal(actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalFieldDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalFieldDeserialization");
        ClassWithBigDecimal expected = new ClassWithBigDecimal("foo");
        String json = expected.getExpectedJson();
        ClassWithBigDecimal actual = gson.fromJson(json, ClassWithBigDecimal.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1186,expected.value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1187,actual.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadValueForBigDecimalDeserialization_add1036() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadValueForBigDecimalDeserialization_add1036");
        try {
            gson.fromJson("{\"value\"=1.5e-1.0031}", ClassWithBigDecimal.class);
            gson.fromJson("{\"value\"=1.5e-1.0031}", ClassWithBigDecimal.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadValueForBigDecimalDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadValueForBigDecimalDeserialization");
        try {
            gson.fromJson("foo", ClassWithBigDecimal.class);
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigIntegerFieldSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigIntegerFieldSerialization");
        ClassWithBigInteger target = new ClassWithBigInteger("foo");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1193,target,1192,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1194,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigIntegerFieldDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigIntegerFieldDeserialization");
        ClassWithBigInteger expected = new ClassWithBigInteger("foo");
        String json = expected.getExpectedJson();
        ClassWithBigInteger actual = gson.fromJson(json, ClassWithBigInteger.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1190,expected.value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1191,actual.value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testOverrideBigIntegerTypeAdapter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOverrideBigIntegerTypeAdapter");
        gson = new GsonBuilder().registerTypeAdapter(BigInteger.class, new NumberAsStringAdapter(BigInteger.class)).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1369,gson,1368,gson.toJson(new java.math.BigInteger("123"), java.math.BigInteger.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1370,new java.math.BigInteger("123"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1372,gson,1371,gson.fromJson("\"123\"", java.math.BigInteger.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testOverrideBigDecimalTypeAdapter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOverrideBigDecimalTypeAdapter");
        gson = new GsonBuilder().registerTypeAdapter(BigDecimal.class, new NumberAsStringAdapter(BigDecimal.class)).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1364,gson,1363,gson.toJson(new java.math.BigDecimal("1.1"), java.math.BigDecimal.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1365,new java.math.BigDecimal("1.1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1367,gson,1366,gson.fromJson("\"1.1\"", java.math.BigDecimal.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSetSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetSerialization");
        Gson gson = new Gson();
        HashSet<java.lang.String> s = new HashSet<java.lang.String>();
        s.add("blah");
        String json = gson.toJson(s);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1377,json);
        json = gson.toJson(s, java.util.Set.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1378,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetSerialization_add1100() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetSerialization_add1100");
        Gson gson = new Gson();
        HashSet<java.lang.String> s = new HashSet<java.lang.String>();
        s.add("blah");
        s.add("blah");
        String json = gson.toJson(s);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1377,json);
        json = gson.toJson(s, java.util.Set.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1378,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSetSerialization_literalMutation1175() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetSerialization_literalMutation1175");
        Gson gson = new Gson();
        HashSet<java.lang.String> s = new HashSet<java.lang.String>();
        s.add("foo");
        String json = gson.toJson(s);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1377,json);
        json = gson.toJson(s, java.util.Set.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1378,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSetSerialization_remove921() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetSerialization_remove921");
        Gson gson = new Gson();
        HashSet<java.lang.String> s = new HashSet<java.lang.String>();
        String json = gson.toJson(s);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1377,json);
        json = gson.toJson(s, java.util.Set.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1378,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBitSetSerialization_add1040() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetSerialization_add1040");
        Gson gson = new Gson();
        BitSet bits = new BitSet();
        bits.set(1);
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        String json = gson.toJson(bits);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1207,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBitSetSerialization_add1041() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetSerialization_add1041");
        Gson gson = new Gson();
        BitSet bits = new BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(3, 6);
        bits.set(9);
        String json = gson.toJson(bits);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1207,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBitSetSerialization_add1042() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetSerialization_add1042");
        Gson gson = new Gson();
        BitSet bits = new BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        bits.set(9);
        String json = gson.toJson(bits);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1207,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBitSetSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetSerialization");
        Gson gson = new Gson();
        BitSet bits = new BitSet();
        bits.set(2);
        bits.set(3, 6);
        bits.set(9);
        String json = gson.toJson(bits);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1207,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBitSetSerialization_literalMutation1103() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetSerialization_literalMutation1103");
        Gson gson = new Gson();
        BitSet bits = new BitSet();
        bits.set(1);
        bits.set(2, 6);
        bits.set(9);
        String json = gson.toJson(bits);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1207,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBitSetSerialization_literalMutation1104() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetSerialization_literalMutation1104");
        Gson gson = new Gson();
        BitSet bits = new BitSet();
        bits.set(1);
        bits.set(3, 7);
        bits.set(9);
        String json = gson.toJson(bits);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1207,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBitSetSerialization_literalMutation1105() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetSerialization_literalMutation1105");
        Gson gson = new Gson();
        BitSet bits = new BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(8);
        String json = gson.toJson(bits);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1207,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBitSetSerialization_remove865() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetSerialization_remove865");
        Gson gson = new Gson();
        BitSet bits = new BitSet();
        bits.set(3, 6);
        bits.set(9);
        String json = gson.toJson(bits);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1207,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBitSetSerialization_remove866() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetSerialization_remove866");
        Gson gson = new Gson();
        BitSet bits = new BitSet();
        bits.set(3, 6);
        bits.set(9);
        String json = gson.toJson(bits);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1207,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBitSetSerialization_remove867() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetSerialization_remove867");
        Gson gson = new Gson();
        BitSet bits = new BitSet();
        bits.set(3, 6);
        bits.set(9);
        String json = gson.toJson(bits);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1207,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBitSetDeserialization_add1037() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization_add1037");
        BitSet expected = new BitSet();
        expected.set(0);
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBitSetDeserialization_add1038() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization_add1038");
        BitSet expected = new BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(2, 6);
        expected.set(8);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBitSetDeserialization_add1039() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization_add1039");
        BitSet expected = new BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        expected.set(8);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBitSetDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization");
        BitSet expected = new BitSet();
        expected.set(-1);
        expected.set(2, 6);
        expected.set(8);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBitSetDeserialization_literalMutation1096() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization_literalMutation1096");
        BitSet expected = new BitSet();
        expected.set(0);
        expected.set(3, 6);
        expected.set(8);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBitSetDeserialization_literalMutation1097() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization_literalMutation1097");
        BitSet expected = new BitSet();
        expected.set(0);
        expected.set(2, 7);
        expected.set(8);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBitSetDeserialization_literalMutation1098() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization_literalMutation1098");
        BitSet expected = new BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(9);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBitSetDeserialization_literalMutation1099() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization_literalMutation1099");
        BitSet expected = new BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBitSetDeserialization_literalMutation1100() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization_literalMutation1100");
        BitSet expected = new BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBitSetDeserialization_literalMutation1101() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization_literalMutation1101");
        BitSet expected = new BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBitSetDeserialization_remove862() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization_remove862");
        BitSet expected = new BitSet();
        expected.set(2, 6);
        expected.set(8);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBitSetDeserialization_remove863() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization_remove863");
        BitSet expected = new BitSet();
        expected.set(2, 6);
        expected.set(8);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBitSetDeserialization_remove864() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBitSetDeserialization_remove864");
        BitSet expected = new BitSet();
        expected.set(2, 6);
        expected.set(8);
        Gson gson = new Gson();
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1195,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1197,gson,1196,gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1198,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1200,gson,1199,gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1201,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1203,gson,1202,gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1204,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1206,gson,1205,gson.fromJson(json, java.util.BitSet.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultDateSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateSerialization");
        Date now = new Date(1315806903104L);
        String json = gson.toJson(now);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1259,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultDateDeserialization_add1051() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserialization_add1051");
        String json = "\'Dec 13, 2009 07:18:02 AM\'";
        Date extracted = gson.fromJson(json, Date.class);
        assertEqualsDate(extracted, 2009, 11, 13);
        assertEqualsDate(extracted, 2009, 11, 13);
        assertEqualsTime(extracted, 7, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultDateDeserialization_add1052() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserialization_add1052");
        String json = "\'Dec 13, 2009 07:18:02 AM\'";
        Date extracted = gson.fromJson(json, Date.class);
        assertEqualsDate(extracted, 2009, 11, 13);
        assertEqualsTime(extracted, 7, 18, 2);
        assertEqualsTime(extracted, 7, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultDateDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserialization");
        String json = "foo";
        Date extracted = gson.fromJson(json, Date.class);
        assertEqualsDate(extracted, 2009, 11, 13);
        assertEqualsTime(extracted, 7, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultDateDeserialization_literalMutation1120() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserialization_literalMutation1120");
        String json = "\'Dec 13, 2009 07:18:02 AM\'";
        Date extracted = gson.fromJson(json, Date.class);
        assertEqualsDate(extracted, 2008, 11, 13);
        assertEqualsTime(extracted, 7, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultDateDeserialization_literalMutation1121() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserialization_literalMutation1121");
        String json = "\'Dec 13, 2009 07:18:02 AM\'";
        Date extracted = gson.fromJson(json, Date.class);
        assertEqualsDate(extracted, 2009, 12, 13);
        assertEqualsTime(extracted, 7, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultDateDeserialization_literalMutation1122() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserialization_literalMutation1122");
        String json = "\'Dec 13, 2009 07:18:02 AM\'";
        Date extracted = gson.fromJson(json, Date.class);
        assertEqualsDate(extracted, 2009, 11, 12);
        assertEqualsTime(extracted, 7, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultDateDeserialization_literalMutation1123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserialization_literalMutation1123");
        String json = "\'Dec 13, 2009 07:18:02 AM\'";
        Date extracted = gson.fromJson(json, Date.class);
        assertEqualsDate(extracted, 2009, 11, 13);
        assertEqualsTime(extracted, 8, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultDateDeserialization_literalMutation1124() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserialization_literalMutation1124");
        String json = "\'Dec 13, 2009 07:18:02 AM\'";
        Date extracted = gson.fromJson(json, Date.class);
        assertEqualsDate(extracted, 2009, 11, 13);
        assertEqualsTime(extracted, 7, 17, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultDateDeserialization_literalMutation1125() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserialization_literalMutation1125");
        String json = "\'Dec 13, 2009 07:18:02 AM\'";
        Date extracted = gson.fromJson(json, Date.class);
        assertEqualsDate(extracted, 2009, 11, 13);
        assertEqualsTime(extracted, 7, 18, 1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultDateDeserialization_remove872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserialization_remove872");
        String json = "\'Dec 13, 2009 07:18:02 AM\'";
        Date extracted = gson.fromJson(json, Date.class);
        assertEqualsTime(extracted, 7, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultDateDeserialization_remove873() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserialization_remove873");
        String json = "\'Dec 13, 2009 07:18:02 AM\'";
        Date extracted = gson.fromJson(json, Date.class);
        assertEqualsDate(extracted, 2009, 11, 13);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    private void assertEqualsDate(Date date, int year, int month, int day) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1168,(year - 1900));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1170,date,1169,date.getYear());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1171,month);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1173,date,1172,date.getMonth());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1174,day);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1176,date,1175,date.getDate());
    }

    @SuppressWarnings(value = "deprecation")
    private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1177,hours);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1179,date,1178,date.getHours());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1180,minutes);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1182,date,1181,date.getMinutes());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1183,seconds);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1185,date,1184,date.getSeconds());
    }

    public void testDefaultJavaSqlDateSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlDateSerialization");
        java.sql.Date instant = new java.sql.Date(1259875082001L);
        String json = gson.toJson(instant);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1284,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultJavaSqlDateDeserialization_add1053() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlDateDeserialization_add1053");
        String json = "\'Dec 3, 2009\'";
        java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class);
        assertEqualsDate(extracted, 2009, 11, 3);
        assertEqualsDate(extracted, 2009, 11, 3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlDateDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlDateDeserialization");
        String json = "foo";
        java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class);
        assertEqualsDate(extracted, 2009, 11, 3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlDateDeserialization_literalMutation1131() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlDateDeserialization_literalMutation1131");
        String json = "\'Dec 3, 2009\'";
        java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class);
        assertEqualsDate(extracted, 2008, 11, 3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlDateDeserialization_literalMutation1132() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlDateDeserialization_literalMutation1132");
        String json = "\'Dec 3, 2009\'";
        java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class);
        assertEqualsDate(extracted, 2009, 12, 3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlDateDeserialization_literalMutation1133() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlDateDeserialization_literalMutation1133");
        String json = "\'Dec 3, 2009\'";
        java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class);
        assertEqualsDate(extracted, 2009, 11, 4);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultJavaSqlDateDeserialization_remove874() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlDateDeserialization_remove874");
        String json = "\'Dec 3, 2009\'";
        java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimestampSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimestampSerialization");
        Timestamp now = new Timestamp(1259875082001L);
        String json = gson.toJson(now);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1285,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultJavaSqlTimestampDeserialization_add1055() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimestampDeserialization_add1055");
        String json = "\'Dec 3, 2009 1:18:02 PM\'";
        Timestamp extracted = gson.fromJson(json, Timestamp.class);
        assertEqualsDate(extracted, 2009, 11, 3);
        assertEqualsDate(extracted, 2009, 11, 3);
        assertEqualsTime(extracted, 13, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultJavaSqlTimestampDeserialization_add1056() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimestampDeserialization_add1056");
        String json = "\'Dec 3, 2009 1:18:02 PM\'";
        Timestamp extracted = gson.fromJson(json, Timestamp.class);
        assertEqualsDate(extracted, 2009, 11, 3);
        assertEqualsTime(extracted, 13, 18, 2);
        assertEqualsTime(extracted, 13, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimestampDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimestampDeserialization");
        String json = "foo";
        Timestamp extracted = gson.fromJson(json, Timestamp.class);
        assertEqualsDate(extracted, 2009, 11, 3);
        assertEqualsTime(extracted, 13, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimestampDeserialization_literalMutation1141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimestampDeserialization_literalMutation1141");
        String json = "\'Dec 3, 2009 1:18:02 PM\'";
        Timestamp extracted = gson.fromJson(json, Timestamp.class);
        assertEqualsDate(extracted, 2008, 11, 3);
        assertEqualsTime(extracted, 13, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimestampDeserialization_literalMutation1142() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimestampDeserialization_literalMutation1142");
        String json = "\'Dec 3, 2009 1:18:02 PM\'";
        Timestamp extracted = gson.fromJson(json, Timestamp.class);
        assertEqualsDate(extracted, 2009, 12, 3);
        assertEqualsTime(extracted, 13, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimestampDeserialization_literalMutation1143() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimestampDeserialization_literalMutation1143");
        String json = "\'Dec 3, 2009 1:18:02 PM\'";
        Timestamp extracted = gson.fromJson(json, Timestamp.class);
        assertEqualsDate(extracted, 2009, 11, 2);
        assertEqualsTime(extracted, 13, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimestampDeserialization_literalMutation1144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimestampDeserialization_literalMutation1144");
        String json = "\'Dec 3, 2009 1:18:02 PM\'";
        Timestamp extracted = gson.fromJson(json, Timestamp.class);
        assertEqualsDate(extracted, 2009, 11, 3);
        assertEqualsTime(extracted, 14, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimestampDeserialization_literalMutation1145() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimestampDeserialization_literalMutation1145");
        String json = "\'Dec 3, 2009 1:18:02 PM\'";
        Timestamp extracted = gson.fromJson(json, Timestamp.class);
        assertEqualsDate(extracted, 2009, 11, 3);
        assertEqualsTime(extracted, 13, 19, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimestampDeserialization_literalMutation1146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimestampDeserialization_literalMutation1146");
        String json = "\'Dec 3, 2009 1:18:02 PM\'";
        Timestamp extracted = gson.fromJson(json, Timestamp.class);
        assertEqualsDate(extracted, 2009, 11, 3);
        assertEqualsTime(extracted, 13, 18, 1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultJavaSqlTimestampDeserialization_remove876() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimestampDeserialization_remove876");
        String json = "\'Dec 3, 2009 1:18:02 PM\'";
        Timestamp extracted = gson.fromJson(json, Timestamp.class);
        assertEqualsTime(extracted, 13, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultJavaSqlTimestampDeserialization_remove877() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimestampDeserialization_remove877");
        String json = "\'Dec 3, 2009 1:18:02 PM\'";
        Timestamp extracted = gson.fromJson(json, Timestamp.class);
        assertEqualsDate(extracted, 2009, 11, 3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimeSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimeSerialization");
        Time now = new Time(1259875082001L);
        String json = gson.toJson(now);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1157,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultJavaSqlTimeDeserialization_add1054() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimeDeserialization_add1054");
        String json = "\'1:18:02 PM\'";
        Time extracted = gson.fromJson(json, Time.class);
        assertEqualsTime(extracted, 13, 18, 2);
        assertEqualsTime(extracted, 13, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimeDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimeDeserialization");
        String json = "foo";
        Time extracted = gson.fromJson(json, Time.class);
        assertEqualsTime(extracted, 13, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimeDeserialization_literalMutation1136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimeDeserialization_literalMutation1136");
        String json = "\'1:18:02 PM\'";
        Time extracted = gson.fromJson(json, Time.class);
        assertEqualsTime(extracted, 12, 18, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimeDeserialization_literalMutation1137() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimeDeserialization_literalMutation1137");
        String json = "\'1:18:02 PM\'";
        Time extracted = gson.fromJson(json, Time.class);
        assertEqualsTime(extracted, 13, 17, 2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultJavaSqlTimeDeserialization_literalMutation1138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimeDeserialization_literalMutation1138");
        String json = "\'1:18:02 PM\'";
        Time extracted = gson.fromJson(json, Time.class);
        assertEqualsTime(extracted, 13, 18, 1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDefaultJavaSqlTimeDeserialization_remove875() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultJavaSqlTimeDeserialization_remove875");
        String json = "\'1:18:02 PM\'";
        Time extracted = gson.fromJson(json, Time.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultDateSerializationUsingBuilder() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateSerializationUsingBuilder");
        Gson gson = new GsonBuilder().create();
        Date now = new Date(1315806903102L);
        String json = gson.toJson(now);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1258,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultDateDeserializationUsingBuilder() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserializationUsingBuilder");
        Gson gson = new GsonBuilder().create();
        Date now = new Date(1315806903103L);
        String json = gson.toJson(now);
        Date extracted = gson.fromJson(json, Date.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1255,now,1254,now.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1257,extracted,1256,extracted.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultDateDeserializationUsingBuilder_literalMutation1126() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultDateDeserializationUsingBuilder_literalMutation1126");
        Gson gson = new GsonBuilder().create();
        Date now = new Date(1315806903104L);
        String json = gson.toJson(now);
        Date extracted = gson.fromJson(json, Date.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1255,now,1254,now.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1257,extracted,1256,extracted.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultCalendarSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultCalendarSerialization");
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(Calendar.getInstance());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1243,json,1242,json.contains("year"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1245,json,1244,json.contains("month"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1247,json,1246,json.contains("dayOfMonth"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1249,json,1248,json.contains("hourOfDay"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1251,json,1250,json.contains("minute"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1253,json,1252,json.contains("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultCalendarDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultCalendarDeserialization");
        Gson gson = new GsonBuilder().create();
        String json = "foo";
        Calendar cal = gson.fromJson(json, Calendar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1231,cal,1230,cal.get(java.util.Calendar.YEAR));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1233,cal,1232,cal.get(java.util.Calendar.MONTH));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1235,cal,1234,cal.get(java.util.Calendar.DAY_OF_MONTH));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1237,cal,1236,cal.get(java.util.Calendar.HOUR_OF_DAY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1239,cal,1238,cal.get(java.util.Calendar.MINUTE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1241,cal,1240,cal.get(java.util.Calendar.SECOND));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultGregorianCalendarSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultGregorianCalendarSerialization");
        Gson gson = new GsonBuilder().create();
        GregorianCalendar cal = new GregorianCalendar();
        String json = gson.toJson(cal);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1273,json,1272,json.contains("year"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1275,json,1274,json.contains("month"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1277,json,1276,json.contains("dayOfMonth"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1279,json,1278,json.contains("hourOfDay"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1281,json,1280,json.contains("minute"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1283,json,1282,json.contains("second"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultGregorianCalendarDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultGregorianCalendarDeserialization");
        Gson gson = new GsonBuilder().create();
        String json = "foo";
        GregorianCalendar cal = gson.fromJson(json, GregorianCalendar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1261,cal,1260,cal.get(java.util.Calendar.YEAR));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1263,cal,1262,cal.get(java.util.Calendar.MONTH));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1265,cal,1264,cal.get(java.util.Calendar.DAY_OF_MONTH));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1267,cal,1266,cal.get(java.util.Calendar.HOUR_OF_DAY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1269,cal,1268,cal.get(java.util.Calendar.MINUTE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1271,cal,1270,cal.get(java.util.Calendar.SECOND));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDateSerializationWithPattern() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationWithPattern");
        String pattern = "foo";
        Gson gson = new GsonBuilder().setDateFormat(java.text.DateFormat.FULL).setDateFormat(pattern).create();
        Date now = new Date(1315806903103L);
        String json = gson.toJson(now);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1229,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDateSerializationWithPattern_literalMutation1114() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationWithPattern_literalMutation1114");
        String pattern = "yyyy-MM-dd";
        Gson gson = new GsonBuilder().setDateFormat(java.text.DateFormat.FULL).setDateFormat(pattern).create();
        Date now = new Date(1315806903102L);
        String json = gson.toJson(now);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1229,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    public void testDateDeserializationWithPattern() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateDeserializationWithPattern");
        String pattern = "yyyy-MM-dd";
        Gson gson = new GsonBuilder().setDateFormat(java.text.DateFormat.FULL).setDateFormat(pattern).create();
        Date now = new Date(1315806903103L);
        String json = gson.toJson(now);
        Date extracted = gson.fromJson(json, Date.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,now,1213,now.getYear());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1216,extracted,1215,extracted.getYear());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1218,now,1217,now.getMonth());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1220,extracted,1219,extracted.getMonth());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1222,now,1221,now.getDay());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1224,extracted,1223,extracted.getDay());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    public void testDateDeserializationWithPattern_literalMutation1108() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateDeserializationWithPattern_literalMutation1108");
        String pattern = "foo";
        Gson gson = new GsonBuilder().setDateFormat(java.text.DateFormat.FULL).setDateFormat(pattern).create();
        Date now = new Date(1315806903103L);
        String json = gson.toJson(now);
        Date extracted = gson.fromJson(json, Date.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,now,1213,now.getYear());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1216,extracted,1215,extracted.getYear());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1218,now,1217,now.getMonth());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1220,extracted,1219,extracted.getMonth());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1222,now,1221,now.getDay());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1224,extracted,1223,extracted.getDay());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    public void testDateDeserializationWithPattern_literalMutation1109() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateDeserializationWithPattern_literalMutation1109");
        String pattern = "yyyy-MM-dd";
        Gson gson = new GsonBuilder().setDateFormat(java.text.DateFormat.FULL).setDateFormat(pattern).create();
        Date now = new Date(1315806903102L);
        String json = gson.toJson(now);
        Date extracted = gson.fromJson(json, Date.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1214,now,1213,now.getYear());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1216,extracted,1215,extracted.getYear());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1218,now,1217,now.getMonth());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1220,extracted,1219,extracted.getMonth());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1222,now,1221,now.getDay());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1224,extracted,1223,extracted.getDay());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDateSerializationWithPatternNotOverridenByTypeAdapter_add1050() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationWithPatternNotOverridenByTypeAdapter_add1050");
        String pattern = "yyyy-MM-dd";
        Gson gson = new GsonBuilder().setDateFormat(pattern).registerTypeAdapter(Date.class, new com.google.gson.JsonDeserializer<java.util.Date>() {
            public Date deserialize(JsonElement json, Type typeOfT, com.google.gson.JsonDeserializationContext context) throws JsonParseException {
                return new Date(1315806903103L);
            }
        }).create();
        Date now = new Date(1315806903103L);
        String json = gson.toJson(now);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1228,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDateSerializationWithPatternNotOverridenByTypeAdapter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationWithPatternNotOverridenByTypeAdapter");
        String pattern = "foo";
        Gson gson = new GsonBuilder().setDateFormat(pattern).registerTypeAdapter(Date.class, new com.google.gson.JsonDeserializer<java.util.Date>() {
            public Date deserialize(JsonElement json, Type typeOfT, com.google.gson.JsonDeserializationContext context) throws JsonParseException {
                return new Date(1315806903103L);
            }
        }).create();
        Date now = new Date(1315806903103L);
        String json = gson.toJson(now);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1228,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDateSerializationWithPatternNotOverridenByTypeAdapter_literalMutation1116() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationWithPatternNotOverridenByTypeAdapter_literalMutation1116");
        String pattern = "yyyy-MM-dd";
        Gson gson = new GsonBuilder().setDateFormat(pattern).registerTypeAdapter(Date.class, new com.google.gson.JsonDeserializer<java.util.Date>() {
            public Date deserialize(JsonElement json, Type typeOfT, com.google.gson.JsonDeserializationContext context) throws JsonParseException {
                return new Date(1315806903102L);
            }
        }).create();
        Date now = new Date(1315806903103L);
        String json = gson.toJson(now);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1228,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDateSerializationWithPatternNotOverridenByTypeAdapter_literalMutation1117() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationWithPatternNotOverridenByTypeAdapter_literalMutation1117");
        String pattern = "yyyy-MM-dd";
        Gson gson = new GsonBuilder().setDateFormat(pattern).registerTypeAdapter(Date.class, new com.google.gson.JsonDeserializer<java.util.Date>() {
            public Date deserialize(JsonElement json, Type typeOfT, com.google.gson.JsonDeserializationContext context) throws JsonParseException {
                return new Date(1315806903103L);
            }
        }).create();
        Date now = new Date(1315806903104L);
        String json = gson.toJson(now);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1228,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDateSerializationWithPatternNotOverridenByTypeAdapter_remove871() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationWithPatternNotOverridenByTypeAdapter_remove871");
        String pattern = "yyyy-MM-dd";
        Gson gson = new GsonBuilder().setDateFormat(pattern).registerTypeAdapter(Date.class, new com.google.gson.JsonDeserializer<java.util.Date>() {
            public Date deserialize(JsonElement json, Type typeOfT, com.google.gson.JsonDeserializationContext context) throws JsonParseException {
                return new Date(1315806903103L);
            }
        }).create();
        Date now = new Date(1315806903103L);
        String json = gson.toJson(now);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1228,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDateSerializationInCollection_add1045() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationInCollection_add1045");
        Type listOfDates = new TypeToken<java.util.List<java.util.Date>>() {        }.getType();
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            List<java.util.Date> dates = java.util.Arrays.asList(new Date(0));
            String json = gson.toJson(dates, listOfDates);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1225,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1227,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0),1226,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDateSerializationInCollection_add1046() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationInCollection_add1046");
        Type listOfDates = new TypeToken<java.util.List<java.util.Date>>() {        }.getType();
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            List<java.util.Date> dates = java.util.Arrays.asList(new Date(0));
            String json = gson.toJson(dates, listOfDates);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1225,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1227,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0),1226,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDateSerializationInCollection_add1047() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationInCollection_add1047");
        Type listOfDates = new TypeToken<java.util.List<java.util.Date>>() {        }.getType();
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.US);
        try {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            List<java.util.Date> dates = java.util.Arrays.asList(new Date(0));
            String json = gson.toJson(dates, listOfDates);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1225,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1227,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0),1226,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDateSerializationInCollection_add1048() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationInCollection_add1048");
        Type listOfDates = new TypeToken<java.util.List<java.util.Date>>() {        }.getType();
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            List<java.util.Date> dates = java.util.Arrays.asList(new Date(0));
            String json = gson.toJson(dates, listOfDates);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1225,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1227,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0),1226,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDateSerializationInCollection_add1049() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationInCollection_add1049");
        Type listOfDates = new TypeToken<java.util.List<java.util.Date>>() {        }.getType();
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            List<java.util.Date> dates = java.util.Arrays.asList(new Date(0));
            String json = gson.toJson(dates, listOfDates);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1225,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1227,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0),1226,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDateSerializationInCollection() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationInCollection");
        Type listOfDates = new TypeToken<java.util.List<java.util.Date>>() {        }.getType();
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("foo"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            List<java.util.Date> dates = java.util.Arrays.asList(new Date(0));
            String json = gson.toJson(dates, listOfDates);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1225,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1227,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0),1226,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDateSerializationInCollection_literalMutation1111() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationInCollection_literalMutation1111");
        Type listOfDates = new TypeToken<java.util.List<java.util.Date>>() {        }.getType();
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Gson gson = new GsonBuilder().setDateFormat("foo").create();
            List<java.util.Date> dates = java.util.Arrays.asList(new Date(0));
            String json = gson.toJson(dates, listOfDates);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1225,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1227,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0),1226,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDateSerializationInCollection_literalMutation1112() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationInCollection_literalMutation1112");
        Type listOfDates = new TypeToken<java.util.List<java.util.Date>>() {        }.getType();
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            List<java.util.Date> dates = java.util.Arrays.asList(new Date(1));
            String json = gson.toJson(dates, listOfDates);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1225,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1227,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0),1226,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDateSerializationInCollection_remove868() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationInCollection_remove868");
        Type listOfDates = new TypeToken<java.util.List<java.util.Date>>() {        }.getType();
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            List<java.util.Date> dates = java.util.Arrays.asList(new Date(0));
            String json = gson.toJson(dates, listOfDates);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1225,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1227,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0),1226,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDateSerializationInCollection_remove869() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationInCollection_remove869");
        Type listOfDates = new TypeToken<java.util.List<java.util.Date>>() {        }.getType();
        TimeZone defaultTimeZone = TimeZone.getDefault();
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            List<java.util.Date> dates = java.util.Arrays.asList(new Date(0));
            String json = gson.toJson(dates, listOfDates);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1225,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1227,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0),1226,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDateSerializationInCollection_remove870() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerializationInCollection_remove870");
        Type listOfDates = new TypeToken<java.util.List<java.util.Date>>() {        }.getType();
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        try {
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            List<java.util.Date> dates = java.util.Arrays.asList(new Date(0));
            String json = gson.toJson(dates, listOfDates);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1225,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1227,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0),1226,gson.<java.util.List<java.util.Date>>fromJson("[\"1970-01-01\"]", listOfDates).get(0).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTimestampSerialization_add1105() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimestampSerialization_add1105");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Timestamp timestamp = new Timestamp(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(timestamp, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1390,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class),1389,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTimestampSerialization_add1106() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimestampSerialization_add1106");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.US);
        try {
            Timestamp timestamp = new Timestamp(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(timestamp, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1390,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class),1389,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTimestampSerialization_add1107() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimestampSerialization_add1107");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Timestamp timestamp = new Timestamp(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(timestamp, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1390,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class),1389,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTimestampSerialization_add1108() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimestampSerialization_add1108");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Timestamp timestamp = new Timestamp(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(timestamp, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1390,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class),1389,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTimestampSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimestampSerialization");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("foo"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Timestamp timestamp = new Timestamp(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(timestamp, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1390,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class),1389,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTimestampSerialization_literalMutation1184() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimestampSerialization_literalMutation1184");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Timestamp timestamp = new Timestamp(-1L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(timestamp, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1390,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class),1389,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTimestampSerialization_literalMutation1185() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimestampSerialization_literalMutation1185");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Timestamp timestamp = new Timestamp(0L);
            Gson gson = new GsonBuilder().setDateFormat("foo").create();
            String json = gson.toJson(timestamp, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1390,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class),1389,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTimestampSerialization_remove924() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimestampSerialization_remove924");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            Timestamp timestamp = new Timestamp(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(timestamp, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1390,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class),1389,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTimestampSerialization_remove925() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTimestampSerialization_remove925");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        try {
            Timestamp timestamp = new Timestamp(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(timestamp, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1388,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1390,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class),1389,gson.fromJson("\"1970-01-01\"", java.sql.Timestamp.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSqlDateSerialization_add1101() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSqlDateSerialization_add1101");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            java.sql.Date sqlDate = new java.sql.Date(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(sqlDate, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1379,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,gson.fromJson("\"1970-01-01\"", java.sql.Date.class),1380,gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSqlDateSerialization_add1102() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSqlDateSerialization_add1102");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.US);
        try {
            java.sql.Date sqlDate = new java.sql.Date(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(sqlDate, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1379,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,gson.fromJson("\"1970-01-01\"", java.sql.Date.class),1380,gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSqlDateSerialization_add1103() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSqlDateSerialization_add1103");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            java.sql.Date sqlDate = new java.sql.Date(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(sqlDate, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1379,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,gson.fromJson("\"1970-01-01\"", java.sql.Date.class),1380,gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSqlDateSerialization_add1104() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSqlDateSerialization_add1104");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            java.sql.Date sqlDate = new java.sql.Date(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(sqlDate, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1379,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,gson.fromJson("\"1970-01-01\"", java.sql.Date.class),1380,gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSqlDateSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSqlDateSerialization");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("foo"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            java.sql.Date sqlDate = new java.sql.Date(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(sqlDate, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1379,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,gson.fromJson("\"1970-01-01\"", java.sql.Date.class),1380,gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSqlDateSerialization_literalMutation1177() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSqlDateSerialization_literalMutation1177");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            java.sql.Date sqlDate = new java.sql.Date(-1L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(sqlDate, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1379,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,gson.fromJson("\"1970-01-01\"", java.sql.Date.class),1380,gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSqlDateSerialization_literalMutation1178() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSqlDateSerialization_literalMutation1178");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            java.sql.Date sqlDate = new java.sql.Date(0L);
            Gson gson = new GsonBuilder().setDateFormat("foo").create();
            String json = gson.toJson(sqlDate, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1379,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,gson.fromJson("\"1970-01-01\"", java.sql.Date.class),1380,gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSqlDateSerialization_remove922() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSqlDateSerialization_remove922");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            java.sql.Date sqlDate = new java.sql.Date(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(sqlDate, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1379,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,gson.fromJson("\"1970-01-01\"", java.sql.Date.class),1380,gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSqlDateSerialization_remove923() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSqlDateSerialization_remove923");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        try {
            java.sql.Date sqlDate = new java.sql.Date(0L);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String json = gson.toJson(sqlDate, Timestamp.class);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1379,json);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1381,gson.fromJson("\"1970-01-01\"", java.sql.Date.class),1380,gson.fromJson("\"1970-01-01\"", java.sql.Date.class).getTime());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonPrimitiveSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonPrimitiveSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1335,gson,1334,gson.toJson(new com.google.gson.JsonPrimitive(5), com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1337,gson,1336,gson.toJson(new com.google.gson.JsonPrimitive(true), com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1339,gson,1338,gson.toJson(new com.google.gson.JsonPrimitive("foo"), com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1341,gson,1340,gson.toJson(new com.google.gson.JsonPrimitive('a'), com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonPrimitiveDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonPrimitiveDeserialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1310,new com.google.gson.JsonPrimitive(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1312,gson,1311,gson.fromJson("5", com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1313,new com.google.gson.JsonPrimitive(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1315,gson,1314,gson.fromJson("5", com.google.gson.JsonPrimitive.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1316,new com.google.gson.JsonPrimitive(true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1318,gson,1317,gson.fromJson("true", com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1319,new com.google.gson.JsonPrimitive(true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1321,gson,1320,gson.fromJson("true", com.google.gson.JsonPrimitive.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1322,new com.google.gson.JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1324,gson,1323,gson.fromJson("\"foo\"", com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1325,new com.google.gson.JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1327,gson,1326,gson.fromJson("\"foo\"", com.google.gson.JsonPrimitive.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1328,new com.google.gson.JsonPrimitive('a'));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1330,gson,1329,gson.fromJson("\"a\"", com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1331,new com.google.gson.JsonPrimitive('a'));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1333,gson,1332,gson.fromJson("\"a\"", com.google.gson.JsonPrimitive.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonNullSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonNullSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1301,gson,1300,gson.toJson(com.google.gson.JsonNull.INSTANCE, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1303,gson,1302,gson.toJson(com.google.gson.JsonNull.INSTANCE, com.google.gson.JsonNull.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullJsonElementSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullJsonElementSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1356,gson,1355,gson.toJson(null, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1358,gson,1357,gson.toJson(null, com.google.gson.JsonNull.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonArraySerialization_add1060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArraySerialization_add1060");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1293,gson,1292,gson.toJson(array, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonArraySerialization_add1061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArraySerialization_add1061");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1293,gson,1292,gson.toJson(array, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonArraySerialization_add1062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArraySerialization_add1062");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        array.add(new com.google.gson.JsonPrimitive(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1293,gson,1292,gson.toJson(array, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonArraySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArraySerialization");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1293,gson,1292,gson.toJson(array, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonArraySerialization_literalMutation1153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArraySerialization_literalMutation1153");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(3));
        array.add(new com.google.gson.JsonPrimitive(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1293,gson,1292,gson.toJson(array, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonArraySerialization_literalMutation1154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArraySerialization_literalMutation1154");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1293,gson,1292,gson.toJson(array, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonArraySerialization_remove881() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArraySerialization_remove881");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1293,gson,1292,gson.toJson(array, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonArraySerialization_remove882() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArraySerialization_remove882");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1293,gson,1292,gson.toJson(array, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonArraySerialization_remove883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArraySerialization_remove883");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1293,gson,1292,gson.toJson(array, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonArrayDeserialization_add1057() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArrayDeserialization_add1057");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        String json = "[1,2,3]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1286,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1288,gson,1287,gson.fromJson(json, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1289,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,gson,1290,gson.fromJson(json, com.google.gson.JsonArray.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonArrayDeserialization_add1058() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArrayDeserialization_add1058");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        String json = "[1,2,3]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1286,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1288,gson,1287,gson.fromJson(json, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1289,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,gson,1290,gson.fromJson(json, com.google.gson.JsonArray.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonArrayDeserialization_add1059() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArrayDeserialization_add1059");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        array.add(new com.google.gson.JsonPrimitive(3));
        String json = "[1,2,3]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1286,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1288,gson,1287,gson.fromJson(json, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1289,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,gson,1290,gson.fromJson(json, com.google.gson.JsonArray.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonArrayDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArrayDeserialization");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(0));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        String json = "[1,2,3]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1286,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1288,gson,1287,gson.fromJson(json, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1289,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,gson,1290,gson.fromJson(json, com.google.gson.JsonArray.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonArrayDeserialization_literalMutation1149() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArrayDeserialization_literalMutation1149");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(3));
        array.add(new com.google.gson.JsonPrimitive(3));
        String json = "[1,2,3]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1286,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1288,gson,1287,gson.fromJson(json, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1289,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,gson,1290,gson.fromJson(json, com.google.gson.JsonArray.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonArrayDeserialization_literalMutation1150() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArrayDeserialization_literalMutation1150");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(4));
        String json = "[1,2,3]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1286,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1288,gson,1287,gson.fromJson(json, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1289,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,gson,1290,gson.fromJson(json, com.google.gson.JsonArray.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonArrayDeserialization_literalMutation1151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArrayDeserialization_literalMutation1151");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(1));
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        String json = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1286,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1288,gson,1287,gson.fromJson(json, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1289,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,gson,1290,gson.fromJson(json, com.google.gson.JsonArray.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonArrayDeserialization_remove878() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArrayDeserialization_remove878");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        String json = "[1,2,3]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1286,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1288,gson,1287,gson.fromJson(json, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1289,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,gson,1290,gson.fromJson(json, com.google.gson.JsonArray.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonArrayDeserialization_remove879() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArrayDeserialization_remove879");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        String json = "[1,2,3]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1286,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1288,gson,1287,gson.fromJson(json, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1289,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,gson,1290,gson.fromJson(json, com.google.gson.JsonArray.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonArrayDeserialization_remove880() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonArrayDeserialization_remove880");
        JsonArray array = new JsonArray();
        array.add(new com.google.gson.JsonPrimitive(2));
        array.add(new com.google.gson.JsonPrimitive(3));
        String json = "[1,2,3]";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1286,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1288,gson,1287,gson.fromJson(json, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1289,array);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1291,gson,1290,gson.fromJson(json, com.google.gson.JsonArray.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectSerialization_add1065() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectSerialization_add1065");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,gson,1308,gson.toJson(object, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectSerialization_add1066() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectSerialization_add1066");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,gson,1308,gson.toJson(object, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectSerialization");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,gson,1308,gson.toJson(object, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectSerialization_literalMutation1161() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectSerialization_literalMutation1161");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(2));
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,gson,1308,gson.toJson(object, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectSerialization_literalMutation1162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectSerialization_literalMutation1162");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("foo", new com.google.gson.JsonPrimitive(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,gson,1308,gson.toJson(object, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectSerialization_literalMutation1163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectSerialization_literalMutation1163");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("bar", new com.google.gson.JsonPrimitive(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,gson,1308,gson.toJson(object, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectSerialization_remove886() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectSerialization_remove886");
        JsonObject object = new JsonObject();
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,gson,1308,gson.toJson(object, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectSerialization_remove887() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectSerialization_remove887");
        JsonObject object = new JsonObject();
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1309,gson,1308,gson.toJson(object, com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectDeserialization_add1063() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectDeserialization_add1063");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        String json = "{\"foo\":1,\"bar\":2}";
        JsonElement actual = gson.fromJson(json, JsonElement.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1304,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,actual);
        JsonObject actualObj = gson.fromJson(json, JsonObject.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,actualObj);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectDeserialization_add1064() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectDeserialization_add1064");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        String json = "{\"foo\":1,\"bar\":2}";
        JsonElement actual = gson.fromJson(json, JsonElement.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1304,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,actual);
        JsonObject actualObj = gson.fromJson(json, JsonObject.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,actualObj);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectDeserialization");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        String json = "{\"foo\":1,\"bar\":2}";
        JsonElement actual = gson.fromJson(json, JsonElement.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1304,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,actual);
        JsonObject actualObj = gson.fromJson(json, JsonObject.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,actualObj);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectDeserialization_literalMutation1156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectDeserialization_literalMutation1156");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(2));
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        String json = "{\"foo\":1,\"bar\":2}";
        JsonElement actual = gson.fromJson(json, JsonElement.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1304,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,actual);
        JsonObject actualObj = gson.fromJson(json, JsonObject.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,actualObj);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectDeserialization_literalMutation1157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectDeserialization_literalMutation1157");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("foo", new com.google.gson.JsonPrimitive(2));
        String json = "{\"foo\":1,\"bar\":2}";
        JsonElement actual = gson.fromJson(json, JsonElement.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1304,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,actual);
        JsonObject actualObj = gson.fromJson(json, JsonObject.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,actualObj);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectDeserialization_literalMutation1158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectDeserialization_literalMutation1158");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("bar", new com.google.gson.JsonPrimitive(1));
        String json = "{\"foo\":1,\"bar\":2}";
        JsonElement actual = gson.fromJson(json, JsonElement.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1304,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,actual);
        JsonObject actualObj = gson.fromJson(json, JsonObject.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,actualObj);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonObjectDeserialization_literalMutation1159() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectDeserialization_literalMutation1159");
        JsonObject object = new JsonObject();
        object.add("foo", new com.google.gson.JsonPrimitive(1));
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        String json = "foo";
        JsonElement actual = gson.fromJson(json, JsonElement.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1304,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,actual);
        JsonObject actualObj = gson.fromJson(json, JsonObject.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,actualObj);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectDeserialization_remove884() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectDeserialization_remove884");
        JsonObject object = new JsonObject();
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        String json = "{\"foo\":1,\"bar\":2}";
        JsonElement actual = gson.fromJson(json, JsonElement.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1304,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,actual);
        JsonObject actualObj = gson.fromJson(json, JsonObject.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,actualObj);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testJsonObjectDeserialization_remove885() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectDeserialization_remove885");
        JsonObject object = new JsonObject();
        object.add("bar", new com.google.gson.JsonPrimitive(2));
        String json = "{\"foo\":1,\"bar\":2}";
        JsonElement actual = gson.fromJson(json, JsonElement.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1304,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1305,actual);
        JsonObject actualObj = gson.fromJson(json, JsonObject.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1306,object);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1307,actualObj);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonNullDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonNullDeserialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1294,com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1296,gson,1295,gson.fromJson("null", com.google.gson.JsonElement.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1297,com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1299,gson,1298,gson.fromJson("null", com.google.gson.JsonNull.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ClassWithBigDecimal {
        BigDecimal value;

        ClassWithBigDecimal(String value) {
            this.value = new BigDecimal(value);
        }

        String getExpectedJson() {
            return ("{\"value\":" + (value.toEngineeringString())) + "}";
        }
    }

    private static class ClassWithBigInteger {
        BigInteger value;

        ClassWithBigInteger(String value) {
            this.value = new BigInteger(value);
        }

        String getExpectedJson() {
            return ("{\"value\":" + (value)) + "}";
        }
    }

    @Test(timeout = 1000)
    public void testPropertiesSerialization_add1099() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPropertiesSerialization_add1099");
        Properties props = new Properties();
        props.setProperty("foo", "bar");
        props.setProperty("foo", "bar");
        String json = gson.toJson(props);
        String expected = "{\"foo\":\"bar\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1375,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPropertiesSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPropertiesSerialization");
        Properties props = new Properties();
        props.setProperty("foo", "bar");
        String json = gson.toJson(props);
        String expected = "{\"foo\":\"bar\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1375,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPropertiesSerialization_literalMutation1173() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPropertiesSerialization_literalMutation1173");
        Properties props = new Properties();
        props.setProperty("foo", "foo");
        String json = gson.toJson(props);
        String expected = "{\"foo\":\"bar\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1375,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPropertiesSerialization_literalMutation1174() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPropertiesSerialization_literalMutation1174");
        Properties props = new Properties();
        props.setProperty("foo", "bar");
        String json = gson.toJson(props);
        String expected = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1375,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPropertiesSerialization_remove920() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPropertiesSerialization_remove920");
        Properties props = new Properties();
        String json = gson.toJson(props);
        String expected = "{\"foo\":\"bar\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1375,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1376,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPropertiesDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPropertiesDeserialization");
        String json = "foo";
        Properties props = gson.fromJson(json, Properties.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1374,props,1373,props.getProperty("foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTreeSetSerialization_add1110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTreeSetSerialization_add1110");
        TreeSet<java.lang.String> treeSet = new TreeSet<java.lang.String>();
        treeSet.add("Value1");
        treeSet.add("Value1");
        String json = gson.toJson(treeSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1393,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTreeSetSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTreeSetSerialization");
        TreeSet<java.lang.String> treeSet = new TreeSet<java.lang.String>();
        treeSet.add("foo");
        String json = gson.toJson(treeSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1393,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTreeSetSerialization_remove927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTreeSetSerialization_remove927");
        TreeSet<java.lang.String> treeSet = new TreeSet<java.lang.String>();
        String json = gson.toJson(treeSet);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1393,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTreeSetDeserialization_add1109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTreeSetDeserialization_add1109");
        String json = "[\'Value1\']";
        Type type = new TypeToken<java.util.TreeSet<java.lang.String>>() {        }.getType();
        TreeSet<java.lang.String> treeSet = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,treeSet,1391,treeSet.contains("Value1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTreeSetDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTreeSetDeserialization");
        String json = "foo";
        Type type = new TypeToken<java.util.TreeSet<java.lang.String>>() {        }.getType();
        TreeSet<java.lang.String> treeSet = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,treeSet,1391,treeSet.contains("Value1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTreeSetDeserialization_remove926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTreeSetDeserialization_remove926");
        String json = "[\'Value1\']";
        Type type = new TypeToken<java.util.TreeSet<java.lang.String>>() {        }.getType();
        TreeSet<java.lang.String> treeSet = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1392,treeSet,1391,treeSet.contains("Value1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringBuilderSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringBuilderSerialization");
        StringBuilder sb = new StringBuilder("foo");
        String json = gson.toJson(sb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1387,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringBuilderDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringBuilderDeserialization");
        StringBuilder sb = gson.fromJson("foo", StringBuilder.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1386,sb,1385,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringBufferSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringBufferSerialization");
        StringBuffer sb = new StringBuffer("foo");
        String json = gson.toJson(sb);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1384,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringBufferDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringBufferDeserialization");
        StringBuffer sb = gson.fromJson("foo", StringBuffer.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1383,sb,1382,sb.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    private static class MyClassTypeAdapter extends TypeAdapter<java.lang.Class> {
        @Override
        public void write(JsonWriter out, Class value) throws IOException {
            out.value(value.getName());
        }

        @Override
        public Class read(JsonReader in) throws IOException {
            String className = in.nextString();
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException e) {
                throw new IOException(e);
            }
        }
    }

    static class NumberAsStringAdapter extends TypeAdapter<java.lang.Number> {
        private final Constructor<? extends java.lang.Number> constructor;

        NumberAsStringAdapter(Class<? extends java.lang.Number> type) throws Exception {
            this.constructor = type.getConstructor(String.class);
        }

        @Override
        public void write(JsonWriter out, Number value) throws IOException {
            out.value(value.toString());
        }

        @Override
        public Number read(JsonReader in) throws IOException {
            try {
                return constructor.newInstance(in.nextString());
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        }
    }
}

