package com.google.gson.functional;

import com.google.gson.Gson;
import java.io.IOException;
import com.google.gson.annotations.SerializedName;
import junit.framework.TestCase;

@SuppressWarnings(value = "serial")
public final class ThrowableFunctionalTest extends TestCase {
    private final Gson gson = new Gson();

    public void testExceptionWithoutCause() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionWithoutCause");
        RuntimeException e = new RuntimeException("foo");
        String json = gson.toJson(e);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,json,2518,json.contains("hello"));
        e = gson.fromJson("{\'detailMessage\':\'hello\'}", RuntimeException.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,e,2520,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExceptionWithoutCause_literalMutation2028() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionWithoutCause_literalMutation2028");
        RuntimeException e = new RuntimeException("hello");
        String json = gson.toJson(e);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2519,json,2518,json.contains("hello"));
        e = gson.fromJson("foo", RuntimeException.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2521,e,2520,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExceptionWithCause() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionWithCause");
        Exception e = new Exception("foo" , new IOException("io error"));
        String json = gson.toJson(e);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2512,json,2511,json.contains("{\"detailMessage\":\"top level\",\"cause\":{\"detailMessage\":\"io error\""));
        e = gson.fromJson("{\'detailMessage\':\'top level\',\'cause\':{\'detailMessage\':\'io error\'}}", Exception.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,e,2513,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2515,((e.getCause()) instanceof java.lang.Throwable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,e.getCause(),2516,e.getCause().getMessage());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExceptionWithCause_literalMutation2025() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionWithCause_literalMutation2025");
        Exception e = new Exception("top level" , new IOException("foo"));
        String json = gson.toJson(e);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2512,json,2511,json.contains("{\"detailMessage\":\"top level\",\"cause\":{\"detailMessage\":\"io error\""));
        e = gson.fromJson("{\'detailMessage\':\'top level\',\'cause\':{\'detailMessage\':\'io error\'}}", Exception.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,e,2513,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2515,((e.getCause()) instanceof java.lang.Throwable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,e.getCause(),2516,e.getCause().getMessage());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExceptionWithCause_literalMutation2026() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExceptionWithCause_literalMutation2026");
        Exception e = new Exception("top level" , new IOException("io error"));
        String json = gson.toJson(e);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2512,json,2511,json.contains("{\"detailMessage\":\"top level\",\"cause\":{\"detailMessage\":\"io error\""));
        e = gson.fromJson("foo", Exception.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2514,e,2513,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2515,((e.getCause()) instanceof java.lang.Throwable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2517,e.getCause(),2516,e.getCause().getMessage());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializedNameOnExceptionFields() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializedNameOnExceptionFields");
        MyException e = new MyException();
        String json = gson.toJson(e);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2523,json,2522,json.contains("{\"my_custom_name\":\"myCustomMessageValue\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testErrorWithoutCause() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrorWithoutCause");
        OutOfMemoryError e = new OutOfMemoryError("foo");
        String json = gson.toJson(e);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2499,json,2498,json.contains("hello"));
        e = gson.fromJson("{\'detailMessage\':\'hello\'}", OutOfMemoryError.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2501,e,2500,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testErrorWithoutCause_literalMutation2020() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrorWithoutCause_literalMutation2020");
        OutOfMemoryError e = new OutOfMemoryError("hello");
        String json = gson.toJson(e);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2499,json,2498,json.contains("hello"));
        e = gson.fromJson("foo", OutOfMemoryError.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2501,e,2500,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testErrornWithCause() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrornWithCause");
        Error e = new Error("foo" , new IOException("io error"));
        String json = gson.toJson(e);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,json,2502,json.contains("top level"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,json,2504,json.contains("io error"));
        e = gson.fromJson("{\'detailMessage\':\'top level\',\'cause\':{\'detailMessage\':\'io error\'}}", Error.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,e,2506,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,((e.getCause()) instanceof java.lang.Throwable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2510,e.getCause(),2509,e.getCause().getMessage());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testErrornWithCause_literalMutation2022() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrornWithCause_literalMutation2022");
        Error e = new Error("top level" , new IOException("foo"));
        String json = gson.toJson(e);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,json,2502,json.contains("top level"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,json,2504,json.contains("io error"));
        e = gson.fromJson("{\'detailMessage\':\'top level\',\'cause\':{\'detailMessage\':\'io error\'}}", Error.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,e,2506,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,((e.getCause()) instanceof java.lang.Throwable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2510,e.getCause(),2509,e.getCause().getMessage());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testErrornWithCause_literalMutation2023() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testErrornWithCause_literalMutation2023");
        Error e = new Error("top level" , new IOException("io error"));
        String json = gson.toJson(e);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2503,json,2502,json.contains("top level"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2505,json,2504,json.contains("io error"));
        e = gson.fromJson("foo", Error.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2507,e,2506,e.getMessage());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2508,((e.getCause()) instanceof java.lang.Throwable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2510,e.getCause(),2509,e.getCause().getMessage());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static final class MyException extends Throwable {
        @SerializedName(value = "my_custom_name")
        String myCustomMessage = "myCustomMessageValue";
    }
}

