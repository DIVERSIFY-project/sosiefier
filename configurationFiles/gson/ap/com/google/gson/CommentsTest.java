package com.google.gson;

import java.util.List;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * @author Jesse Wilson
 */
public final class CommentsTest extends TestCase {
    /** 
     * Test for issue 212.
     */
@Test(timeout = 1000)
    public void testParseComments_add1492() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseComments_add1492");
        String json = "[\n" + ("  // this is a comment\n" + ("  \"a\",\n" + ("  /* this is another comment */\n" + ("  \"b\",\n" + ("  # this is yet another comment\n" + ("  \"c\"\n" + "]"))))));
        List<java.lang.String> abc = new Gson().fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.asList("a", "b", "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,abc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 212.
     */
public void testParseComments() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseComments");
        String json = "foo" + ("  // this is a comment\n" + ("  \"a\",\n" + ("  /* this is another comment */\n" + ("  \"b\",\n" + ("  # this is yet another comment\n" + ("  \"c\"\n" + "]"))))));
        List<java.lang.String> abc = new Gson().fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.asList("a", "b", "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,abc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 212.
     */
public void testParseComments_literalMutation2182() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseComments_literalMutation2182");
        String json = "[\n" + ("foo" + ("  \"a\",\n" + ("  /* this is another comment */\n" + ("  \"b\",\n" + ("  # this is yet another comment\n" + ("  \"c\"\n" + "]"))))));
        List<java.lang.String> abc = new Gson().fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.asList("a", "b", "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,abc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 212.
     */
public void testParseComments_literalMutation2183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseComments_literalMutation2183");
        String json = "[\n" + ("  // this is a comment\n" + ("foo" + ("  /* this is another comment */\n" + ("  \"b\",\n" + ("  # this is yet another comment\n" + ("  \"c\"\n" + "]"))))));
        List<java.lang.String> abc = new Gson().fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.asList("a", "b", "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,abc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 212.
     */
public void testParseComments_literalMutation2184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseComments_literalMutation2184");
        String json = "[\n" + ("  // this is a comment\n" + ("  \"a\",\n" + ("foo" + ("  \"b\",\n" + ("  # this is yet another comment\n" + ("  \"c\"\n" + "]"))))));
        List<java.lang.String> abc = new Gson().fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.asList("a", "b", "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,abc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 212.
     */
public void testParseComments_literalMutation2185() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseComments_literalMutation2185");
        String json = "[\n" + ("  // this is a comment\n" + ("  \"a\",\n" + ("  /* this is another comment */\n" + ("foo" + ("  # this is yet another comment\n" + ("  \"c\"\n" + "]"))))));
        List<java.lang.String> abc = new Gson().fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.asList("a", "b", "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,abc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 212.
     */
public void testParseComments_literalMutation2186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseComments_literalMutation2186");
        String json = "[\n" + ("  // this is a comment\n" + ("  \"a\",\n" + ("  /* this is another comment */\n" + ("  \"b\",\n" + ("foo" + ("  \"c\"\n" + "]"))))));
        List<java.lang.String> abc = new Gson().fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.asList("a", "b", "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,abc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 212.
     */
public void testParseComments_literalMutation2187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseComments_literalMutation2187");
        String json = "[\n" + ("  // this is a comment\n" + ("  \"a\",\n" + ("  /* this is another comment */\n" + ("  \"b\",\n" + ("  # this is yet another comment\n" + ("foo" + "]"))))));
        List<java.lang.String> abc = new Gson().fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.asList("a", "b", "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,abc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 212.
     */
public void testParseComments_literalMutation2188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseComments_literalMutation2188");
        String json = "[\n" + ("  // this is a comment\n" + ("  \"a\",\n" + ("  /* this is another comment */\n" + ("  \"b\",\n" + ("  # this is yet another comment\n" + ("  \"c\"\n" + "foo"))))));
        List<java.lang.String> abc = new Gson().fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.asList("a", "b", "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,abc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 212.
     */
@Test(timeout = 1000)
    public void testParseComments_remove1237() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParseComments_remove1237");
        String json = "[\n" + ("  // this is a comment\n" + ("  \"a\",\n" + ("  /* this is another comment */\n" + ("  \"b\",\n" + ("  # this is yet another comment\n" + ("  \"c\"\n" + "]"))))));
        List<java.lang.String> abc = new Gson().fromJson(json, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2649,null,2648,java.util.Arrays.asList("a", "b", "c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2650,abc);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

