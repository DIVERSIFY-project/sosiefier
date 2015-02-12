package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Unit test for the {@link JsonPrimitive} class.
 * 
 * @author Joel Leitch
 */
public class JsonPrimitiveTest extends TestCase {
    public void testBoolean() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBoolean");
        JsonPrimitive json = new JsonPrimitive(Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2925,json,2924,json.isBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2927,json,2926,json.getAsBoolean());
        json = new JsonPrimitive(0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2929,json,2928,json.getAsBoolean());
        json = new JsonPrimitive("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2931,json,2930,json.getAsBoolean());
        json = new JsonPrimitive("true");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2933,json,2932,json.getAsBoolean());
        json = new JsonPrimitive("TrUe");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2935,json,2934,json.getAsBoolean());
        json = new JsonPrimitive("1.3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2937,json,2936,json.getAsBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBoolean_literalMutation2316() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBoolean_literalMutation2316");
        JsonPrimitive json = new JsonPrimitive(Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2925,json,2924,json.isBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2927,json,2926,json.getAsBoolean());
        json = new JsonPrimitive(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2929,json,2928,json.getAsBoolean());
        json = new JsonPrimitive("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2931,json,2930,json.getAsBoolean());
        json = new JsonPrimitive("true");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2933,json,2932,json.getAsBoolean());
        json = new JsonPrimitive("TrUe");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2935,json,2934,json.getAsBoolean());
        json = new JsonPrimitive("1.3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2937,json,2936,json.getAsBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBoolean_literalMutation2317() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBoolean_literalMutation2317");
        JsonPrimitive json = new JsonPrimitive(Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2925,json,2924,json.isBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2927,json,2926,json.getAsBoolean());
        json = new JsonPrimitive(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2929,json,2928,json.getAsBoolean());
        json = new JsonPrimitive("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2931,json,2930,json.getAsBoolean());
        json = new JsonPrimitive("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2933,json,2932,json.getAsBoolean());
        json = new JsonPrimitive("TrUe");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2935,json,2934,json.getAsBoolean());
        json = new JsonPrimitive("1.3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2937,json,2936,json.getAsBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBoolean_literalMutation2318() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBoolean_literalMutation2318");
        JsonPrimitive json = new JsonPrimitive(Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2925,json,2924,json.isBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2927,json,2926,json.getAsBoolean());
        json = new JsonPrimitive(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2929,json,2928,json.getAsBoolean());
        json = new JsonPrimitive("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2931,json,2930,json.getAsBoolean());
        json = new JsonPrimitive("true");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2933,json,2932,json.getAsBoolean());
        json = new JsonPrimitive("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2935,json,2934,json.getAsBoolean());
        json = new JsonPrimitive("1.3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2937,json,2936,json.getAsBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBoolean_literalMutation2319() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBoolean_literalMutation2319");
        JsonPrimitive json = new JsonPrimitive(Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2925,json,2924,json.isBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2927,json,2926,json.getAsBoolean());
        json = new JsonPrimitive(1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2929,json,2928,json.getAsBoolean());
        json = new JsonPrimitive("1");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2931,json,2930,json.getAsBoolean());
        json = new JsonPrimitive("true");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2933,json,2932,json.getAsBoolean());
        json = new JsonPrimitive("TrUe");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2935,json,2934,json.getAsBoolean());
        json = new JsonPrimitive("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2937,json,2936,json.getAsBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingStringAsBoolean() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingStringAsBoolean");
        JsonPrimitive json = new JsonPrimitive("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3026,json,3025,json.isBoolean());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3028,json,3027,json.getAsBoolean());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingStringAsNumber() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingStringAsNumber");
        JsonPrimitive json = new JsonPrimitive("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3030,json,3029,json.isNumber());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3032,json,3031,json.getAsDouble());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3034,json,3033,json.getAsFloat());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3036,json,3035,json.getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3038,json,3037,json.getAsLong());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3040,json,3039,json.getAsShort());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3042,json,3041,json.getAsByte());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3043,new java.math.BigInteger("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3045,json,3044,json.getAsBigInteger());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3046,new java.math.BigDecimal("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3048,json,3047,json.getAsBigDecimal());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringsAndChar() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringsAndChar");
        JsonPrimitive json = new JsonPrimitive("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3068,json,3067,json.isString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3070,json,3069,json.getAsCharacter());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3072,json,3071,json.getAsString());
        json = new JsonPrimitive('z');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3074,json,3073,json.isString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3076,json,3075,json.getAsCharacter());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3078,json,3077,json.getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExponential_add1608() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExponential_add1608");
        JsonPrimitive json = new JsonPrimitive("1E+7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2986,new java.math.BigDecimal("1E+7"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2988,json,2987,json.getAsBigDecimal());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2989,new java.lang.Double("1E+7"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2991,json,2990,json.getAsDouble());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2992,new java.lang.Float("1E+7"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2994,json,2993,json.getAsDouble());
        try {
            json.getAsInt();
            json.getAsInt();
        } catch (NumberFormatException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExponential() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExponential");
        JsonPrimitive json = new JsonPrimitive("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2986,new java.math.BigDecimal("1E+7"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2988,json,2987,json.getAsBigDecimal());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2989,new java.lang.Double("1E+7"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2991,json,2990,json.getAsDouble());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2992,new java.lang.Float("1E+7"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2994,json,2993,json.getAsDouble());
        try {
            json.getAsInt();
        } catch (NumberFormatException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testByteEqualsShort() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteEqualsShort");
        JsonPrimitive p1 = new JsonPrimitive(new Byte(((byte)(11))));
        JsonPrimitive p2 = new JsonPrimitive(new Short(((short)(10))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2956,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2957,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2959,p1,2958,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2961,p2,2960,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testByteEqualsShort_literalMutation2327() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteEqualsShort_literalMutation2327");
        JsonPrimitive p1 = new JsonPrimitive(new Byte(((byte)(10))));
        JsonPrimitive p2 = new JsonPrimitive(new Short(((short)(11))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2956,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2957,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2959,p1,2958,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2961,p2,2960,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testByteEqualsInteger() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteEqualsInteger");
        JsonPrimitive p1 = new JsonPrimitive(new Byte(((byte)(11))));
        JsonPrimitive p2 = new JsonPrimitive(new Integer(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2944,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2945,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2947,p1,2946,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2949,p2,2948,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testByteEqualsInteger_literalMutation2323() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteEqualsInteger_literalMutation2323");
        JsonPrimitive p1 = new JsonPrimitive(new Byte(((byte)(10))));
        JsonPrimitive p2 = new JsonPrimitive(new Integer(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2944,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2945,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2947,p1,2946,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2949,p2,2948,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testByteEqualsLong() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteEqualsLong");
        JsonPrimitive p1 = new JsonPrimitive(new Byte(((byte)(11))));
        JsonPrimitive p2 = new JsonPrimitive(new Long(10L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2950,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2951,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2953,p1,2952,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2955,p2,2954,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testByteEqualsLong_literalMutation2325() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteEqualsLong_literalMutation2325");
        JsonPrimitive p1 = new JsonPrimitive(new Byte(((byte)(10))));
        JsonPrimitive p2 = new JsonPrimitive(new Long(11L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2950,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2951,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2953,p1,2952,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2955,p2,2954,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testByteEqualsBigInteger() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteEqualsBigInteger");
        JsonPrimitive p1 = new JsonPrimitive(new Byte(((byte)(9))));
        JsonPrimitive p2 = new JsonPrimitive(new BigInteger("10"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2938,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2939,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2941,p1,2940,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2943,p2,2942,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testByteEqualsBigInteger_literalMutation2321() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testByteEqualsBigInteger_literalMutation2321");
        JsonPrimitive p1 = new JsonPrimitive(new Byte(((byte)(10))));
        JsonPrimitive p2 = new JsonPrimitive(new BigInteger("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2938,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2939,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2941,p1,2940,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2943,p2,2942,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testShortEqualsInteger() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShortEqualsInteger");
        JsonPrimitive p1 = new JsonPrimitive(new Short(((short)(11))));
        JsonPrimitive p2 = new JsonPrimitive(new Integer(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3055,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3056,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3058,p1,3057,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3060,p2,3059,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testShortEqualsInteger_literalMutation2365() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShortEqualsInteger_literalMutation2365");
        JsonPrimitive p1 = new JsonPrimitive(new Short(((short)(10))));
        JsonPrimitive p2 = new JsonPrimitive(new Integer(11));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3055,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3056,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3058,p1,3057,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3060,p2,3059,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testShortEqualsLong() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShortEqualsLong");
        JsonPrimitive p1 = new JsonPrimitive(new Short(((short)(9))));
        JsonPrimitive p2 = new JsonPrimitive(new Long(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3061,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3062,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3064,p1,3063,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3066,p2,3065,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testShortEqualsLong_literalMutation2367() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShortEqualsLong_literalMutation2367");
        JsonPrimitive p1 = new JsonPrimitive(new Short(((short)(10))));
        JsonPrimitive p2 = new JsonPrimitive(new Long(11));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3061,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3062,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3064,p1,3063,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3066,p2,3065,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testShortEqualsBigInteger() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShortEqualsBigInteger");
        JsonPrimitive p1 = new JsonPrimitive(new Short(((short)(9))));
        JsonPrimitive p2 = new JsonPrimitive(new BigInteger("10"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3049,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3050,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3052,p1,3051,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3054,p2,3053,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testShortEqualsBigInteger_literalMutation2363() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testShortEqualsBigInteger_literalMutation2363");
        JsonPrimitive p1 = new JsonPrimitive(new Short(((short)(10))));
        JsonPrimitive p2 = new JsonPrimitive(new BigInteger("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3049,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3050,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3052,p1,3051,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3054,p2,3053,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIntegerEqualsLong() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntegerEqualsLong");
        JsonPrimitive p1 = new JsonPrimitive(new Integer(9));
        JsonPrimitive p2 = new JsonPrimitive(new Long(10L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3013,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3014,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3016,p1,3015,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3018,p2,3017,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIntegerEqualsLong_literalMutation2357() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntegerEqualsLong_literalMutation2357");
        JsonPrimitive p1 = new JsonPrimitive(new Integer(10));
        JsonPrimitive p2 = new JsonPrimitive(new Long(11L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3013,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3014,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3016,p1,3015,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3018,p2,3017,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIntegerEqualsBigInteger() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntegerEqualsBigInteger");
        JsonPrimitive p1 = new JsonPrimitive(new Integer(11));
        JsonPrimitive p2 = new JsonPrimitive(new BigInteger("10"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3007,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3008,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3010,p1,3009,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3012,p2,3011,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIntegerEqualsBigInteger_literalMutation2355() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntegerEqualsBigInteger_literalMutation2355");
        JsonPrimitive p1 = new JsonPrimitive(new Integer(10));
        JsonPrimitive p2 = new JsonPrimitive(new BigInteger("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3007,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3008,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3010,p1,3009,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3012,p2,3011,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongEqualsBigInteger() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongEqualsBigInteger");
        JsonPrimitive p1 = new JsonPrimitive(new Long(11L));
        JsonPrimitive p2 = new JsonPrimitive(new BigInteger("10"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3019,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3020,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3022,p1,3021,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3024,p2,3023,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongEqualsBigInteger_literalMutation2359() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongEqualsBigInteger_literalMutation2359");
        JsonPrimitive p1 = new JsonPrimitive(new Long(10L));
        JsonPrimitive p2 = new JsonPrimitive(new BigInteger("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3019,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3020,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3022,p1,3021,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3024,p2,3023,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFloatEqualsDouble() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFloatEqualsDouble");
        JsonPrimitive p1 = new JsonPrimitive(new Float(11.25F));
        JsonPrimitive p2 = new JsonPrimitive(new Double(10.25));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3001,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3002,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3004,p1,3003,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3006,p2,3005,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFloatEqualsDouble_literalMutation2353() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFloatEqualsDouble_literalMutation2353");
        JsonPrimitive p1 = new JsonPrimitive(new Float(10.25F));
        JsonPrimitive p2 = new JsonPrimitive(new Double(11.25));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3001,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3002,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3004,p1,3003,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3006,p2,3005,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFloatEqualsBigDecimal() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFloatEqualsBigDecimal");
        JsonPrimitive p1 = new JsonPrimitive(new Float(9.25F));
        JsonPrimitive p2 = new JsonPrimitive(new BigDecimal("10.25"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2995,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2996,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2998,p1,2997,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3000,p2,2999,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFloatEqualsBigDecimal_literalMutation2351() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFloatEqualsBigDecimal_literalMutation2351");
        JsonPrimitive p1 = new JsonPrimitive(new Float(10.25F));
        JsonPrimitive p2 = new JsonPrimitive(new BigDecimal("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2995,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2996,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2998,p1,2997,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3000,p2,2999,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleEqualsBigDecimal() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleEqualsBigDecimal");
        JsonPrimitive p1 = new JsonPrimitive(new Double(11.25));
        JsonPrimitive p2 = new JsonPrimitive(new BigDecimal("10.25"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2965,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2966,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2968,p1,2967,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2970,p2,2969,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleEqualsBigDecimal_literalMutation2330() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleEqualsBigDecimal_literalMutation2330");
        JsonPrimitive p1 = new JsonPrimitive(new Double(10.25));
        JsonPrimitive p2 = new JsonPrimitive(new BigDecimal("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2965,p1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2966,p2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2968,p1,2967,p1.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2970,p2,2969,p2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testValidJsonOnToString() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidJsonOnToString");
        JsonPrimitive json = new JsonPrimitive("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3080,json,3079,json.toString());
        json = new JsonPrimitive(new BigDecimal("1.333"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3082,json,3081,json.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testValidJsonOnToString_literalMutation2371() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValidJsonOnToString_literalMutation2371");
        JsonPrimitive json = new JsonPrimitive("Some\nEscaped\nValue");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3080,json,3079,json.toString());
        json = new JsonPrimitive(new BigDecimal("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3082,json,3081,json.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_add1593() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_add1593");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_add1594() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_add1594");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_add1595() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_add1595");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_add1596() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_add1596");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_add1597() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_add1597");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_add1598() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_add1598");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_add1599() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_add1599");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_add1600() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_add1600");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_add1601() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_add1601");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_add1602() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_add1602");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("foo"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation2332() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation2332");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("foo"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation2333() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation2333");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation2334() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation2334");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(false));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation2335() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation2335");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(6L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation2336() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation2336");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("A"), new JsonPrimitive("A"));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(4L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_remove1306() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_remove1306");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_remove1307() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_remove1307");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_remove1308() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_remove1308");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_remove1309() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_remove1309");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_remove1310() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_remove1310");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_remove1311() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_remove1311");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_remove1312() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_remove1312");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_remove1313() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_remove1313");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_remove1314() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_remove1314");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEquals_remove1315() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_remove1315");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(true), new JsonPrimitive(true));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(5L), new JsonPrimitive(5L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive('a'), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Float.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NEGATIVE_INFINITY), new JsonPrimitive(Float.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.POSITIVE_INFINITY), new JsonPrimitive(Float.POSITIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.NEGATIVE_INFINITY), new JsonPrimitive(Double.NEGATIVE_INFINITY));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Double.POSITIVE_INFINITY), new JsonPrimitive(Double.POSITIVE_INFINITY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,new com.google.gson.JsonPrimitive("a"),2980,new com.google.gson.JsonPrimitive("a").equals(new com.google.gson.JsonPrimitive("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,new com.google.gson.JsonPrimitive(true),2982,new com.google.gson.JsonPrimitive(true).equals(new com.google.gson.JsonPrimitive(false)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,new com.google.gson.JsonPrimitive(0),2984,new com.google.gson.JsonPrimitive(0).equals(new com.google.gson.JsonPrimitive(1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAcrossTypes_add1603() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_add1603");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("a"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("a"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAcrossTypes_add1604() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_add1604");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("a"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAcrossTypes_add1605() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_add1605");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("a"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAcrossTypes_add1606() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_add1606");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("a"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAcrossTypes_add1607() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_add1607");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("a"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAcrossTypes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("foo"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAcrossTypes_literalMutation2341() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_literalMutation2341");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("a"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("foo")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAcrossTypes_literalMutation2342() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_literalMutation2342");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("a"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(1));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAcrossTypes_literalMutation2343() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_literalMutation2343");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("a"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(-1), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAcrossTypes_literalMutation2344() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_literalMutation2344");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("a"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(1L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAcrossTypes_literalMutation2345() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_literalMutation2345");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("a"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("foo")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAcrossTypes_literalMutation2346() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_literalMutation2346");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive("a"), new JsonPrimitive('a'));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(-1));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAcrossTypes_remove1316() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_remove1316");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAcrossTypes_remove1317() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_remove1317");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAcrossTypes_remove1318() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_remove1318");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAcrossTypes_remove1319() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_remove1319");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAcrossTypes_remove1320() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAcrossTypes_remove1320");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(0), new JsonPrimitive(0L));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(new BigInteger("0")), new JsonPrimitive(0));
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonPrimitive(Float.NaN), new JsonPrimitive(Double.NaN));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsIntegerAndBigInteger() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsIntegerAndBigInteger");
        JsonPrimitive a = new JsonPrimitive(6L);
        JsonPrimitive b = new JsonPrimitive(new BigInteger("18446744073709551621"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2977,((a + " equals ") + b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2979,a,2978,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsIntegerAndBigInteger_literalMutation2348() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsIntegerAndBigInteger_literalMutation2348");
        JsonPrimitive a = new JsonPrimitive(5L);
        JsonPrimitive b = new JsonPrimitive(new BigInteger("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2977,((a + " equals ") + b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2979,a,2978,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsDoesNotEquateStringAndNonStringTypes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsDoesNotEquateStringAndNonStringTypes");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2972,new com.google.gson.JsonPrimitive("true"),2971,new com.google.gson.JsonPrimitive("true").equals(new com.google.gson.JsonPrimitive(true)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2974,new com.google.gson.JsonPrimitive("0"),2973,new com.google.gson.JsonPrimitive("0").equals(new com.google.gson.JsonPrimitive(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2976,new com.google.gson.JsonPrimitive("NaN"),2975,new com.google.gson.JsonPrimitive("NaN").equals(new com.google.gson.JsonPrimitive(java.lang.Float.NaN)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepCopy() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy");
        JsonPrimitive a = new JsonPrimitive("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2962,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2964,a,2963,a.deepCopy());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepCopy_literalMutation2328() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_literalMutation2328");
        JsonPrimitive a = new JsonPrimitive("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2962,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2964,a,2963,a.deepCopy());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

