package com.google.gson;

import java.io.IOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import junit.framework.TestCase;

/** 
 * @author Jesse Wilson
 */
public class OverrideCoreTypeAdaptersTest extends TestCase {
    private static final TypeAdapter<java.lang.Boolean> booleanAsIntAdapter = new TypeAdapter<java.lang.Boolean>() {
        @Override
        public void write(JsonWriter out, Boolean value) throws IOException {
            out.value((value ? 1 : 0));
        }

        @Override
        public Boolean read(JsonReader in) throws IOException {
            int value = in.nextInt();
            return value != 0;
        }
    };

    private static final TypeAdapter<java.lang.String> swapCaseStringAdapter = new TypeAdapter<java.lang.String>() {
        @Override
        public void write(JsonWriter out, String value) throws IOException {
            out.value(value.toUpperCase(java.util.Locale.US));
        }

        @Override
        public String read(JsonReader in) throws IOException {
            return in.nextString().toLowerCase(java.util.Locale.US);
        }
    };

    public void testOverrideWrapperBooleanAdapter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOverrideWrapperBooleanAdapter");
        Gson gson = new GsonBuilder().registerTypeAdapter(Boolean.class, booleanAsIntAdapter).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3207,gson,3206,gson.toJson(true, boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3209,gson,3208,gson.toJson(true, java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3210,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3212,gson,3211,gson.fromJson("true", boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3213,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3215,gson,3214,gson.fromJson("1", java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3216,java.lang.Boolean.FALSE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3218,gson,3217,gson.fromJson("0", java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testOverridePrimitiveBooleanAdapter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOverridePrimitiveBooleanAdapter");
        Gson gson = new GsonBuilder().registerTypeAdapter(boolean.class, booleanAsIntAdapter).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3191,gson,3190,gson.toJson(true, boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3193,gson,3192,gson.toJson(true, java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3194,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3196,gson,3195,gson.fromJson("1", boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3197,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3199,gson,3198,gson.fromJson("true", java.lang.Boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3201,gson,3200,gson.toJson(false, boolean.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testOverrideStringAdapter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOverrideStringAdapter");
        Gson gson = new GsonBuilder().registerTypeAdapter(String.class, swapCaseStringAdapter).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3203,gson,3202,gson.toJson("Hello", java.lang.String.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3205,gson,3204,gson.fromJson("\"Hello\"", java.lang.String.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

