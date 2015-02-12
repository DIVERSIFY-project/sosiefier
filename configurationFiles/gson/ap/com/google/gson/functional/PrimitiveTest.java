package com.google.gson.functional;

import java.math.BigDecimal;
import java.math.BigInteger;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.Serializable;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Functional tests for Json primitive values: integers, and floating point numbers.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrimitiveTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    public void testPrimitiveIntegerAutoboxedSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveIntegerAutoboxedSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2313,gson,2312,gson.toJson(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveIntegerAutoboxedDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveIntegerAutoboxedDeserialization");
        int expected = 2;
        int actual = gson.fromJson("1", int.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2302,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2303,actual);
        actual = gson.fromJson("1", Integer.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2304,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2305,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveIntegerAutoboxedDeserialization_literalMutation1879() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveIntegerAutoboxedDeserialization_literalMutation1879");
        int expected = 1;
        int actual = gson.fromJson("foo", int.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2302,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2303,actual);
        actual = gson.fromJson("1", Integer.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2304,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2305,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveIntegerAutoboxedDeserialization_literalMutation1880() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveIntegerAutoboxedDeserialization_literalMutation1880");
        int expected = 1;
        int actual = gson.fromJson("1", int.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2302,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2303,actual);
        actual = gson.fromJson("foo", Integer.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2304,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2305,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testByteSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2197,gson,2196,gson.toJson(1, byte.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2199,gson,2198,gson.toJson(1, java.lang.Byte.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testShortSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShortSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2336,gson,2335,gson.toJson(1, short.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2338,gson,2337,gson.toJson(1, java.lang.Short.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testByteDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteDeserialization");
        Byte target = gson.fromJson("foo", Byte.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,((byte)(target)));
        byte primitive = gson.fromJson("1", byte.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,primitive);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testByteDeserialization_literalMutation1829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteDeserialization_literalMutation1829");
        Byte target = gson.fromJson("1", Byte.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2194,((byte)(target)));
        byte primitive = gson.fromJson("foo", byte.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2195,primitive);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveIntegerAutoboxedInASingleElementArraySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveIntegerAutoboxedInASingleElementArraySerialization");
        int[] target = new int[]{ 9331 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2307,gson,2306,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2309,gson,2308,gson.toJson(target, int[].class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2311,gson,2310,gson.toJson(target, java.lang.Integer[].class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReallyLongValuesSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReallyLongValuesSerialization");
        long value = 333961828784580L;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2334,gson,2333,gson.toJson(value));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReallyLongValuesDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReallyLongValuesDeserialization");
        String json = "foo";
        long value = gson.fromJson(json, Long.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2332,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveLongAutoboxedSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveLongAutoboxedSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2325,gson,2324,gson.toJson(1L, long.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2327,gson,2326,gson.toJson(1L, java.lang.Long.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveLongAutoboxedDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveLongAutoboxedDeserialization");
        long expected = 2L;
        long actual = gson.fromJson("1", long.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,actual);
        actual = gson.fromJson("1", Long.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2316,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveLongAutoboxedDeserialization_literalMutation1883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveLongAutoboxedDeserialization_literalMutation1883");
        long expected = 1L;
        long actual = gson.fromJson("foo", long.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,actual);
        actual = gson.fromJson("1", Long.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2316,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveLongAutoboxedDeserialization_literalMutation1884() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveLongAutoboxedDeserialization_literalMutation1884");
        long expected = 1L;
        long actual = gson.fromJson("1", long.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2314,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2315,actual);
        actual = gson.fromJson("foo", Long.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2316,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2317,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveLongAutoboxedInASingleElementArraySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveLongAutoboxedInASingleElementArraySerialization");
        long[] target = new long[]{ 22L };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2319,gson,2318,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2321,gson,2320,gson.toJson(target, long[].class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2323,gson,2322,gson.toJson(target, java.lang.Long[].class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveBooleanAutoboxedSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveBooleanAutoboxedSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2282,gson,2281,gson.toJson(true));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2284,gson,2283,gson.toJson(false));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBooleanDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanDeserialization");
        boolean value = gson.fromJson("foo", boolean.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,value);
        value = gson.fromJson("true", boolean.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBooleanDeserialization_literalMutation1827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanDeserialization_literalMutation1827");
        boolean value = gson.fromJson("false", boolean.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2192,value);
        value = gson.fromJson("foo", boolean.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2193,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveBooleanAutoboxedInASingleElementArraySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveBooleanAutoboxedInASingleElementArraySerialization");
        boolean[] target = new boolean[]{ true };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2276,gson,2275,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2278,gson,2277,gson.toJson(target, boolean[].class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2280,gson,2279,gson.toJson(target, java.lang.Boolean[].class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumberSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberSerialization");
        Number expected = 2L;
        String json = gson.toJson(expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2270,expected,2269,expected.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2271,json);
        json = gson.toJson(expected, Number.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2273,expected,2272,expected.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2274,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumberDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberDeserialization");
        String json = "foo";
        Number expected = new Integer(json);
        Number actual = gson.fromJson(json, Number.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,expected,2259,expected.intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,actual,2261,actual.intValue());
        json = String.valueOf(Long.MAX_VALUE);
        expected = new Long(json);
        actual = gson.fromJson(json, Number.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2264,expected,2263,expected.longValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2266,actual,2265,actual.longValue());
        json = "1.0";
        actual = gson.fromJson(json, Number.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2268,actual,2267,actual.longValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumberDeserialization_literalMutation1872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberDeserialization_literalMutation1872");
        String json = "1";
        Number expected = new Integer(json);
        Number actual = gson.fromJson(json, Number.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2260,expected,2259,expected.intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2262,actual,2261,actual.intValue());
        json = String.valueOf(Long.MAX_VALUE);
        expected = new Long(json);
        actual = gson.fromJson(json, Number.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2264,expected,2263,expected.longValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2266,actual,2265,actual.longValue());
        json = "foo";
        actual = gson.fromJson(json, Number.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2268,actual,2267,actual.longValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveDoubleAutoboxedSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveDoubleAutoboxedSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2299,gson,2298,gson.toJson(-122.08234335));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2301,gson,2300,gson.toJson(new java.lang.Double(122.08112002)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveDoubleAutoboxedDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveDoubleAutoboxedDeserialization");
        double actual = gson.fromJson("foo", double.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2291,-122.08858585);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2292,actual);
        actual = gson.fromJson("122.023900008000", Double.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2293,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveDoubleAutoboxedDeserialization_literalMutation1876() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveDoubleAutoboxedDeserialization_literalMutation1876");
        double actual = gson.fromJson("-122.08858585", double.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2291,-122.08858585);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2292,actual);
        actual = gson.fromJson("foo", Double.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2293,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveDoubleAutoboxedInASingleElementArraySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveDoubleAutoboxedInASingleElementArraySerialization");
        double[] target = new double[]{ 123.08 };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),998,gson,997,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2295,gson,2294,gson.toJson(target, double[].class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2297,gson,2296,gson.toJson(target, java.lang.Double[].class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleAsStringRepresentationDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleAsStringRepresentationDeserialization");
        String doubleValue = "foo";
        Double expected = Double.valueOf(doubleValue);
        Double actual = gson.fromJson(doubleValue, Double.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2210,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2211,actual);
        double actual1 = gson.fromJson(doubleValue, double.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2213,expected,2212,expected.doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2214,actual1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleNoFractAsStringRepresentationDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleNoFractAsStringRepresentationDeserialization");
        String doubleValue = "foo";
        Double expected = Double.valueOf(doubleValue);
        Double actual = gson.fromJson(doubleValue, Double.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2223,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2224,actual);
        double actual1 = gson.fromJson(doubleValue, double.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2226,expected,2225,expected.doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2227,actual1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeDoubleDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeDoubleDeserialization");
        String doubleValue = "foo";
        Double expected = Double.valueOf(doubleValue);
        Double actual = gson.fromJson(doubleValue, Double.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2240,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2241,actual);
        double actual1 = gson.fromJson(doubleValue, double.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2243,expected,2242,expected.doubleValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2244,actual1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalSerialization");
        BigDecimal target = new BigDecimal("foo");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2179,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2180,new java.math.BigDecimal(json));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalDeserialization");
        BigDecimal target = new BigDecimal("foo");
        String json = "-122.0e-21";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2166,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2168,gson,2167,gson.fromJson(json, java.math.BigDecimal.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalDeserialization_literalMutation1814() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalDeserialization_literalMutation1814");
        BigDecimal target = new BigDecimal("-122.0e-21");
        String json = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2166,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2168,gson,2167,gson.fromJson(json, java.math.BigDecimal.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalInASingleElementArraySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalInASingleElementArraySerialization");
        BigDecimal[] target = new BigDecimal[]{ new BigDecimal("foo") };
        String json = gson.toJson(target);
        String actual = extractElementFromArray(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2169,target[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2170,new java.math.BigDecimal(actual));
        json = gson.toJson(target, BigDecimal[].class);
        actual = extractElementFromArray(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2171,target[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2172,new java.math.BigDecimal(actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallValueForBigDecimalSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallValueForBigDecimalSerialization");
        BigDecimal target = new BigDecimal("foo");
        String actual = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2342,target,2341,target.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2343,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallValueForBigDecimalDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallValueForBigDecimalDeserialization");
        BigDecimal expected = new BigDecimal("foo");
        BigDecimal actual = gson.fromJson("1.55", BigDecimal.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallValueForBigDecimalDeserialization_literalMutation1890() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallValueForBigDecimalDeserialization_literalMutation1890");
        BigDecimal expected = new BigDecimal("1.55");
        BigDecimal actual = gson.fromJson("foo", BigDecimal.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2339,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2340,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalPreservePrecisionSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalPreservePrecisionSerialization");
        String expectedValue = "foo";
        BigDecimal obj = new BigDecimal(expectedValue);
        String actualValue = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2177,expectedValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2178,actualValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalPreservePrecisionDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalPreservePrecisionDeserialization");
        String json = "foo";
        BigDecimal expected = new BigDecimal(json);
        BigDecimal actual = gson.fromJson(json, BigDecimal.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2175,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2176,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalAsStringRepresentationDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalAsStringRepresentationDeserialization");
        String doubleValue = "foo";
        BigDecimal expected = new BigDecimal(doubleValue);
        BigDecimal actual = gson.fromJson(doubleValue, BigDecimal.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2164,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2165,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalNoFractAsStringRepresentationDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalNoFractAsStringRepresentationDeserialization");
        String doubleValue = "foo";
        BigDecimal expected = new BigDecimal(doubleValue);
        BigDecimal actual = gson.fromJson(doubleValue, BigDecimal.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2173,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2174,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigIntegerSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigIntegerSerialization");
        BigInteger target = new BigInteger("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2189,target,2188,target.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2191,gson,2190,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigIntegerDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigIntegerDeserialization");
        String json = "foo";
        BigInteger target = new BigInteger(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2181,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2183,gson,2182,gson.fromJson(json, java.math.BigInteger.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigIntegerInASingleElementArraySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigIntegerInASingleElementArraySerialization");
        BigInteger[] target = new BigInteger[]{ new BigInteger("foo") };
        String json = gson.toJson(target);
        String actual = extractElementFromArray(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2184,target[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2185,new java.math.BigInteger(actual));
        json = gson.toJson(target, BigInteger[].class);
        actual = extractElementFromArray(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2186,target[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2187,new java.math.BigInteger(actual));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallValueForBigIntegerSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallValueForBigIntegerSerialization");
        BigInteger target = new BigInteger("foo");
        String actual = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2347,target,2346,target.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2348,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallValueForBigIntegerDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallValueForBigIntegerDeserialization");
        BigInteger expected = new BigInteger("foo");
        BigInteger actual = gson.fromJson("15", BigInteger.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2344,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSmallValueForBigIntegerDeserialization_literalMutation1893() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSmallValueForBigIntegerDeserialization_literalMutation1893");
        BigInteger expected = new BigInteger("15");
        BigInteger actual = gson.fromJson("foo", BigInteger.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2344,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2345,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBadValueForBigIntegerDeserialization_add1357() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadValueForBigIntegerDeserialization_add1357");
        try {
            gson.fromJson("15.099", BigInteger.class);
            gson.fromJson("15.099", BigInteger.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBadValueForBigIntegerDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBadValueForBigIntegerDeserialization");
        try {
            gson.fromJson("foo", BigInteger.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMoreSpecificSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMoreSpecificSerialization");
        Gson gson = new Gson();
        String expected = "foo";
        String expectedJson = gson.toJson(expected);
        Serializable serializableString = expected;
        String actualJson = gson.toJson(serializableString, Serializable.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2250,expectedJson,2249,expectedJson.equals(actualJson));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private String extractElementFromArray(String json) {
        return json.substring(((json.indexOf('[')) + 1), json.indexOf(']'));
    }

    @Test(timeout = 1000)
    public void testDoubleNaNSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleNaNSerialization");
        try {
            double nan = Double.NaN;
            gson.toJson(nan);
            gson.toJson(nan);
        } catch (IllegalArgumentException expected) {
        }
        try {
            gson.toJson(Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleNaNSerializationNotSupportedByDefault() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleNaNSerializationNotSupportedByDefault");
        try {
            double nan = Double.NaN;
            gson.toJson(nan);
        } catch (IllegalArgumentException expected) {
        }
        try {
            gson.toJson(Double.NaN);
            gson.toJson(Double.NaN);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleNaNDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleNaNDeserialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2220,null,2219,java.lang.Double.isNaN(gson.fromJson("NaN", java.lang.Double.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2222,null,2221,java.lang.Double.isNaN(gson.fromJson("NaN", double.class)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFloatNaNSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFloatNaNSerialization");
        try {
            float nan = Float.NaN;
            gson.toJson(nan);
            gson.toJson(nan);
        } catch (IllegalArgumentException expected) {
        }
        try {
            gson.toJson(Float.NaN);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFloatNaNSerializationNotSupportedByDefault() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFloatNaNSerializationNotSupportedByDefault");
        try {
            float nan = Float.NaN;
            gson.toJson(nan);
        } catch (IllegalArgumentException expected) {
        }
        try {
            gson.toJson(Float.NaN);
            gson.toJson(Float.NaN);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFloatNaNDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFloatNaNDeserialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2233,null,2232,java.lang.Float.isNaN(gson.fromJson("NaN", java.lang.Float.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2235,null,2234,java.lang.Float.isNaN(gson.fromJson("NaN", float.class)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBigDecimalNaNDeserializationNotSupported_add1359() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalNaNDeserializationNotSupported_add1359");
        try {
            gson.fromJson("NaN", BigDecimal.class);
            gson.fromJson("NaN", BigDecimal.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalNaNDeserializationNotSupported() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalNaNDeserializationNotSupported");
        try {
            gson.fromJson("foo", BigDecimal.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleInfinitySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleInfinitySerialization");
        try {
            double infinity = Double.POSITIVE_INFINITY;
            gson.toJson(infinity);
            gson.toJson(infinity);
        } catch (IllegalArgumentException expected) {
        }
        try {
            gson.toJson(Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleInfinitySerializationNotSupportedByDefault() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleInfinitySerializationNotSupportedByDefault");
        try {
            double infinity = Double.POSITIVE_INFINITY;
            gson.toJson(infinity);
        } catch (IllegalArgumentException expected) {
        }
        try {
            gson.toJson(Double.POSITIVE_INFINITY);
            gson.toJson(Double.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleInfinityDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleInfinityDeserialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2216,null,2215,java.lang.Double.isInfinite(gson.fromJson("Infinity", java.lang.Double.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2218,null,2217,java.lang.Double.isInfinite(gson.fromJson("Infinity", double.class)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFloatInfinitySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFloatInfinitySerialization");
        try {
            float infinity = Float.POSITIVE_INFINITY;
            gson.toJson(infinity);
            gson.toJson(infinity);
        } catch (IllegalArgumentException expected) {
        }
        try {
            gson.toJson(Float.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFloatInfinitySerializationNotSupportedByDefault() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFloatInfinitySerializationNotSupportedByDefault");
        try {
            float infinity = Float.POSITIVE_INFINITY;
            gson.toJson(infinity);
        } catch (IllegalArgumentException expected) {
        }
        try {
            gson.toJson(Float.POSITIVE_INFINITY);
            gson.toJson(Float.POSITIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFloatInfinityDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFloatInfinityDeserialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2229,null,2228,java.lang.Float.isInfinite(gson.fromJson("Infinity", java.lang.Float.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2231,null,2230,java.lang.Float.isInfinite(gson.fromJson("Infinity", float.class)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBigDecimalInfinityDeserializationNotSupported_add1358() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalInfinityDeserializationNotSupported_add1358");
        try {
            gson.fromJson("Infinity", BigDecimal.class);
            gson.fromJson("Infinity", BigDecimal.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalInfinityDeserializationNotSupported() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalInfinityDeserializationNotSupported");
        try {
            gson.fromJson("foo", BigDecimal.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNegativeInfinitySerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeInfinitySerialization");
        try {
            double negativeInfinity = Double.NEGATIVE_INFINITY;
            gson.toJson(negativeInfinity);
            gson.toJson(negativeInfinity);
        } catch (IllegalArgumentException expected) {
        }
        try {
            gson.toJson(Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNegativeInfinitySerializationNotSupportedByDefault() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeInfinitySerializationNotSupportedByDefault");
        try {
            double negativeInfinity = Double.NEGATIVE_INFINITY;
            gson.toJson(negativeInfinity);
        } catch (IllegalArgumentException expected) {
        }
        try {
            gson.toJson(Double.NEGATIVE_INFINITY);
            gson.toJson(Double.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNegativeInfinityDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeInfinityDeserialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2252,null,2251,java.lang.Double.isInfinite(gson.fromJson("-Infinity", double.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2254,null,2253,java.lang.Double.isInfinite(gson.fromJson("-Infinity", java.lang.Double.class)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNegativeInfinityFloatSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeInfinityFloatSerialization");
        try {
            float negativeInfinity = Float.NEGATIVE_INFINITY;
            gson.toJson(negativeInfinity);
            gson.toJson(negativeInfinity);
        } catch (IllegalArgumentException expected) {
        }
        try {
            gson.toJson(Float.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNegativeInfinityFloatSerializationNotSupportedByDefault() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeInfinityFloatSerializationNotSupportedByDefault");
        try {
            float negativeInfinity = Float.NEGATIVE_INFINITY;
            gson.toJson(negativeInfinity);
        } catch (IllegalArgumentException expected) {
        }
        try {
            gson.toJson(Float.NEGATIVE_INFINITY);
            gson.toJson(Float.NEGATIVE_INFINITY);
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNegativeInfinityFloatDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNegativeInfinityFloatDeserialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2256,null,2255,java.lang.Float.isInfinite(gson.fromJson("-Infinity", float.class)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2258,null,2257,java.lang.Float.isInfinite(gson.fromJson("-Infinity", java.lang.Float.class)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBigDecimalNegativeInfinityDeserializationNotSupported_add1360() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalNegativeInfinityDeserializationNotSupported_add1360");
        try {
            gson.fromJson("-Infinity", BigDecimal.class);
            gson.fromJson("-Infinity", BigDecimal.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBigDecimalNegativeInfinityDeserializationNotSupported() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBigDecimalNegativeInfinityDeserializationNotSupported");
        try {
            gson.fromJson("foo", BigDecimal.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongAsStringSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongAsStringSerialization");
        gson = new GsonBuilder().setLongSerializationPolicy(com.google.gson.LongSerializationPolicy.STRING).create();
        String result = gson.toJson(14L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,result);
        result = gson.toJson(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2248,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongAsStringSerialization_literalMutation1869() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongAsStringSerialization_literalMutation1869");
        gson = new GsonBuilder().setLongSerializationPolicy(com.google.gson.LongSerializationPolicy.STRING).create();
        String result = gson.toJson(15L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2247,result);
        result = gson.toJson(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2248,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongAsStringDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongAsStringDeserialization");
        long value = gson.fromJson("foo", long.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2245,value);
        gson = new GsonBuilder().setLongSerializationPolicy(com.google.gson.LongSerializationPolicy.STRING).create();
        value = gson.fromJson("\"25\"", long.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongAsStringDeserialization_literalMutation1867() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongAsStringDeserialization_literalMutation1867");
        long value = gson.fromJson("\"15\"", long.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2245,value);
        gson = new GsonBuilder().setLongSerializationPolicy(com.google.gson.LongSerializationPolicy.STRING).create();
        value = gson.fromJson("foo", long.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2246,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testQuotedStringSerializationAndDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQuotedStringSerializationAndDeserialization");
        String value = "foo";
        String serializedForm = gson.toJson(value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2328,(("\"" + value) + "\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2329,serializedForm);
        String actual = gson.fromJson(serializedForm, String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2330,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2331,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testUnquotedStringDeserializationFails_add1402() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnquotedStringDeserializationFails_add1402");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,gson,2353,gson.fromJson("UnquotedSingleWord", java.lang.String.class));
        String value = "String Blah Blah Blah...1, 2, 3";
        try {
            gson.fromJson(value, String.class);
            gson.fromJson(value, String.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnquotedStringDeserializationFails() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnquotedStringDeserializationFails");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2354,gson,2353,gson.fromJson("UnquotedSingleWord", java.lang.String.class));
        String value = "foo";
        try {
            gson.fromJson(value, String.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHtmlCharacterSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHtmlCharacterSerialization");
        String target = "foo";
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2237,result,2236,result.equals((('\"' + target) + '\"')));
        gson = new GsonBuilder().disableHtmlEscaping().create();
        result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2239,result,2238,result.equals((('\"' + target) + '\"')));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializePrimitiveWrapperAsObjectField() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializePrimitiveWrapperAsObjectField");
        String json = "foo";
        ClassWithIntegerField target = gson.fromJson(json, ClassWithIntegerField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2201,target.i,2200,target.i.intValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ClassWithIntegerField {
        Integer i;
    }

    public void testPrimitiveClassLiteral() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveClassLiteral");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2286,gson.fromJson("1", int.class),2285,gson.fromJson("1", int.class).intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2288,gson.fromJson(new java.io.StringReader("1"), int.class),2287,gson.fromJson(new java.io.StringReader("1"), int.class).intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2290,gson.fromJson(new com.google.gson.JsonPrimitive(1), int.class),2289,gson.fromJson(new com.google.gson.JsonPrimitive(1), int.class).intValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonObjectAsLongPrimitive_add1378() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsLongPrimitive_add1378");
        try {
            gson.fromJson("{\'abc\':1}", long.class);
            gson.fromJson("{\'abc\':1}", long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonObjectAsLongPrimitive() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsLongPrimitive");
        try {
            gson.fromJson("foo", long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonArrayAsLongWrapper_add1368() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsLongWrapper_add1368");
        try {
            gson.fromJson("[1,2,3]", Long.class);
            gson.fromJson("[1,2,3]", Long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonArrayAsLongWrapper() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsLongWrapper");
        try {
            gson.fromJson("foo", Long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonArrayAsInt_add1367() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsInt_add1367");
        try {
            gson.fromJson("[1, 2, 3, 4]", int.class);
            gson.fromJson("[1, 2, 3, 4]", int.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonArrayAsInt() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsInt");
        try {
            gson.fromJson("foo", int.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonObjectAsInteger_add1377() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsInteger_add1377");
        try {
            gson.fromJson("{}", Integer.class);
            gson.fromJson("{}", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonObjectAsInteger() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsInteger");
        try {
            gson.fromJson("foo", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonObjectAsShortPrimitive_add1380() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsShortPrimitive_add1380");
        try {
            gson.fromJson("{\'abc\':1}", short.class);
            gson.fromJson("{\'abc\':1}", short.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonObjectAsShortPrimitive() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsShortPrimitive");
        try {
            gson.fromJson("foo", short.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonArrayAsShortWrapper_add1370() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsShortWrapper_add1370");
        try {
            gson.fromJson("[\'a\',\'b\']", java.lang.Short.class);
            gson.fromJson("[\'a\',\'b\']", java.lang.Short.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonArrayAsShortWrapper() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsShortWrapper");
        try {
            gson.fromJson("foo", java.lang.Short.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonArrayAsDoublePrimitive_add1365() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsDoublePrimitive_add1365");
        try {
            gson.fromJson("[1,2]", double.class);
            gson.fromJson("[1,2]", double.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonArrayAsDoublePrimitive() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsDoublePrimitive");
        try {
            gson.fromJson("foo", double.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonObjectAsDoubleWrapper_add1375() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsDoubleWrapper_add1375");
        try {
            gson.fromJson("{\'abc\':1}", Double.class);
            gson.fromJson("{\'abc\':1}", Double.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonObjectAsDoubleWrapper() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsDoubleWrapper");
        try {
            gson.fromJson("foo", Double.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonObjectAsFloatPrimitive_add1376() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsFloatPrimitive_add1376");
        try {
            gson.fromJson("{\'abc\':1}", float.class);
            gson.fromJson("{\'abc\':1}", float.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonObjectAsFloatPrimitive() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsFloatPrimitive");
        try {
            gson.fromJson("foo", float.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonArrayAsFloatWrapper_add1366() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsFloatWrapper_add1366");
        try {
            gson.fromJson("[1,2,3]", Float.class);
            gson.fromJson("[1,2,3]", Float.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonArrayAsFloatWrapper() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsFloatWrapper");
        try {
            gson.fromJson("foo", Float.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonObjectAsBytePrimitive_add1374() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsBytePrimitive_add1374");
        try {
            gson.fromJson("{\'abc\':1}", byte.class);
            gson.fromJson("{\'abc\':1}", byte.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonObjectAsBytePrimitive() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsBytePrimitive");
        try {
            gson.fromJson("foo", byte.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonArrayAsByteWrapper_add1364() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsByteWrapper_add1364");
        try {
            gson.fromJson("[1,2,3,4]", Byte.class);
            gson.fromJson("[1,2,3,4]", Byte.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonArrayAsByteWrapper() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsByteWrapper");
        try {
            gson.fromJson("foo", Byte.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonObjectAsBooleanPrimitive_add1373() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsBooleanPrimitive_add1373");
        try {
            gson.fromJson("{\'abc\':1}", boolean.class);
            gson.fromJson("{\'abc\':1}", boolean.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonObjectAsBooleanPrimitive() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsBooleanPrimitive");
        try {
            gson.fromJson("foo", boolean.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonArrayAsBooleanWrapper_add1363() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsBooleanWrapper_add1363");
        try {
            gson.fromJson("[1,2,3,4]", java.lang.Boolean.class);
            gson.fromJson("[1,2,3,4]", java.lang.Boolean.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonArrayAsBooleanWrapper() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsBooleanWrapper");
        try {
            gson.fromJson("foo", java.lang.Boolean.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonArrayAsBigDecimal_add1361() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsBigDecimal_add1361");
        try {
            gson.fromJson("[1,2,3,4]", BigDecimal.class);
            gson.fromJson("[1,2,3,4]", BigDecimal.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonArrayAsBigDecimal() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsBigDecimal");
        try {
            gson.fromJson("foo", BigDecimal.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonObjectAsBigDecimal_add1371() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsBigDecimal_add1371");
        try {
            gson.fromJson("{\'a\':1}", BigDecimal.class);
            gson.fromJson("{\'a\':1}", BigDecimal.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonObjectAsBigDecimal() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsBigDecimal");
        try {
            gson.fromJson("foo", BigDecimal.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonArrayAsBigInteger_add1362() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsBigInteger_add1362");
        try {
            gson.fromJson("[1,2,3,4]", BigInteger.class);
            gson.fromJson("[1,2,3,4]", BigInteger.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonArrayAsBigInteger() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsBigInteger");
        try {
            gson.fromJson("foo", BigInteger.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonObjectAsBigInteger_add1372() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsBigInteger_add1372");
        try {
            gson.fromJson("{\'c\':2}", BigInteger.class);
            gson.fromJson("{\'c\':2}", BigInteger.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonObjectAsBigInteger() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsBigInteger");
        try {
            gson.fromJson("foo", BigInteger.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonArrayAsNumber_add1369() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsNumber_add1369");
        try {
            gson.fromJson("[1,2,3,4]", Number.class);
            gson.fromJson("[1,2,3,4]", Number.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonArrayAsNumber() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonArrayAsNumber");
        try {
            gson.fromJson("foo", Number.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializeJsonObjectAsNumber_add1379() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsNumber_add1379");
        try {
            gson.fromJson("{\'c\':2}", Number.class);
            gson.fromJson("{\'c\':2}", Number.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializeJsonObjectAsNumber() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializeJsonObjectAsNumber");
        try {
            gson.fromJson("foo", Number.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingDecimalPointValueZeroSucceeds() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingDecimalPointValueZeroSucceeds");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2209,gson,2208,((int)(gson.fromJson("1.0", java.lang.Integer.class))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializingNonZeroDecimalPointValuesAsIntegerFails_add1385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingNonZeroDecimalPointValuesAsIntegerFails_add1385");
        try {
            gson.fromJson("1.02", Byte.class);
            gson.fromJson("1.02", Byte.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", java.lang.Short.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializingNonZeroDecimalPointValuesAsIntegerFails_add1386() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingNonZeroDecimalPointValuesAsIntegerFails_add1386");
        try {
            gson.fromJson("1.02", Byte.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", java.lang.Short.class);
            gson.fromJson("1.02", java.lang.Short.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializingNonZeroDecimalPointValuesAsIntegerFails_add1387() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingNonZeroDecimalPointValuesAsIntegerFails_add1387");
        try {
            gson.fromJson("1.02", Byte.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", java.lang.Short.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Integer.class);
            gson.fromJson("1.02", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializingNonZeroDecimalPointValuesAsIntegerFails_add1388() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingNonZeroDecimalPointValuesAsIntegerFails_add1388");
        try {
            gson.fromJson("1.02", Byte.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", java.lang.Short.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Long.class);
            gson.fromJson("1.02", Long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingNonZeroDecimalPointValuesAsIntegerFails() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingNonZeroDecimalPointValuesAsIntegerFails");
        try {
            gson.fromJson("foo", Byte.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", java.lang.Short.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingNonZeroDecimalPointValuesAsIntegerFails_literalMutation1859() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingNonZeroDecimalPointValuesAsIntegerFails_literalMutation1859");
        try {
            gson.fromJson("1.02", Byte.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("foo", java.lang.Short.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingNonZeroDecimalPointValuesAsIntegerFails_literalMutation1860() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingNonZeroDecimalPointValuesAsIntegerFails_literalMutation1860");
        try {
            gson.fromJson("1.02", Byte.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", java.lang.Short.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("foo", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingNonZeroDecimalPointValuesAsIntegerFails_literalMutation1861() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingNonZeroDecimalPointValuesAsIntegerFails_literalMutation1861");
        try {
            gson.fromJson("1.02", Byte.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", java.lang.Short.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("1.02", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        try {
            gson.fromJson("foo", Long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializingBigDecimalAsIntegerFails_add1382() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingBigDecimalAsIntegerFails_add1382");
        try {
            gson.fromJson("-122.08e-213", Integer.class);
            gson.fromJson("-122.08e-213", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingBigDecimalAsIntegerFails() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingBigDecimalAsIntegerFails");
        try {
            gson.fromJson("foo", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializingBigIntegerAsInteger_add1383() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingBigIntegerAsInteger_add1383");
        try {
            gson.fromJson("12121211243123245845384534687435634558945453489543985435", Integer.class);
            gson.fromJson("12121211243123245845384534687435634558945453489543985435", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingBigIntegerAsInteger() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingBigIntegerAsInteger");
        try {
            gson.fromJson("foo", Integer.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializingBigIntegerAsLong_add1384() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingBigIntegerAsLong_add1384");
        try {
            gson.fromJson("12121211243123245845384534687435634558945453489543985435", Long.class);
            gson.fromJson("12121211243123245845384534687435634558945453489543985435", Long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingBigIntegerAsLong() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingBigIntegerAsLong");
        try {
            gson.fromJson("foo", Long.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testValueVeryCloseToZeroIsZero() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValueVeryCloseToZeroIsZero");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2356,gson,2355,((byte)(gson.fromJson("-122.08e-2132", byte.class))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2358,gson,2357,((short)(gson.fromJson("-122.08e-2132", short.class))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2360,gson,2359,((int)(gson.fromJson("-122.08e-2132", int.class))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2362,gson,2361,((long)(gson.fromJson("-122.08e-2132", long.class))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2363,-0.0F);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2365,gson,2364,gson.fromJson("-122.08e-2132", float.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2366,-0.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2368,gson,2367,gson.fromJson("-122.08e-2132", double.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2370,gson,2369,gson.fromJson("122.08e-2132", float.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2372,gson,2371,gson.fromJson("122.08e-2132", double.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingBigDecimalAsFloat() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingBigDecimalAsFloat");
        String json = "foo";
        float actual = gson.fromJson(json, float.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2204,-0.0F);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2205,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingBigDecimalAsDouble() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingBigDecimalAsDouble");
        String json = "foo";
        double actual = gson.fromJson(json, double.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2202,-0.0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2203,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeserializingBigDecimalAsBigIntegerFails_add1381() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingBigDecimalAsBigIntegerFails_add1381");
        try {
            gson.fromJson("-122.08e-213", BigInteger.class);
            gson.fromJson("-122.08e-213", BigInteger.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingBigDecimalAsBigIntegerFails() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingBigDecimalAsBigIntegerFails");
        try {
            gson.fromJson("foo", BigInteger.class);
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeserializingBigIntegerAsBigDecimal() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeserializingBigIntegerAsBigDecimal");
        BigDecimal actual = gson.fromJson("foo", BigDecimal.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2207,actual,2206,actual.toPlainString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStringsAsBooleans_add1401() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsAsBooleans_add1401");
        String json = "[\'true\', \'false\', \'TRUE\', \'yes\', \'1\']";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,null,2349,java.util.Arrays.asList(true, false, true, false, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,gson,2351,gson.<java.util.List<java.lang.Boolean>>fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringsAsBooleans() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsAsBooleans");
        String json = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,null,2349,java.util.Arrays.asList(true, false, true, false, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,gson,2351,gson.<java.util.List<java.lang.Boolean>>fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStringsAsBooleans_remove1158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsAsBooleans_remove1158");
        String json = "[\'true\', \'false\', \'TRUE\', \'yes\', \'1\']";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2350,null,2349,java.util.Arrays.asList(true, false, true, false, false));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2352,gson,2351,gson.<java.util.List<java.lang.Boolean>>fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

