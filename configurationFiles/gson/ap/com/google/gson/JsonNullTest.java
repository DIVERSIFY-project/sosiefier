package com.google.gson;

import org.junit.Test;
import junit.framework.TestCase;

/** 
 * @author Jesse Wilson
 */
public final class JsonNullTest extends TestCase {
    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testEqualsAndHashcode_add1567() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashcode_add1567");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), new JsonNull());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), new JsonNull());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), JsonNull.INSTANCE);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(JsonNull.INSTANCE, JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testEqualsAndHashcode_add1568() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashcode_add1568");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), new JsonNull());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), JsonNull.INSTANCE);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), JsonNull.INSTANCE);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(JsonNull.INSTANCE, JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testEqualsAndHashcode_add1569() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashcode_add1569");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), new JsonNull());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), JsonNull.INSTANCE);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(JsonNull.INSTANCE, JsonNull.INSTANCE);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(JsonNull.INSTANCE, JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    public void testEqualsAndHashcode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashcode");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), new JsonNull());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), JsonNull.INSTANCE);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(JsonNull.INSTANCE, JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testEqualsAndHashcode_remove1283() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashcode_remove1283");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), JsonNull.INSTANCE);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(JsonNull.INSTANCE, JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testEqualsAndHashcode_remove1284() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashcode_remove1284");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), JsonNull.INSTANCE);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(JsonNull.INSTANCE, JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "deprecation")
    @Test(timeout = 1000)
    public void testEqualsAndHashcode_remove1285() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashcode_remove1285");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonNull(), JsonNull.INSTANCE);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(JsonNull.INSTANCE, JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepCopy() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy");
        @SuppressWarnings(value = "deprecation")
        JsonNull a = new JsonNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2820,com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2822,a,2821,a.deepCopy());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2823,com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2825,com.google.gson.JsonNull.INSTANCE,2824,com.google.gson.JsonNull.INSTANCE.deepCopy());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepCopy_literalMutation2272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_literalMutation2272");
        @SuppressWarnings(value = "deprecation")
        JsonNull a = new JsonNull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2820,com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2822,a,2821,a.deepCopy());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2823,com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2825,com.google.gson.JsonNull.INSTANCE,2824,com.google.gson.JsonNull.INSTANCE.deepCopy());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

