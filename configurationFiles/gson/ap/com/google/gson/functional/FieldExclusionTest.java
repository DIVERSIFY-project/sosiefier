package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import junit.framework.TestCase;

/** 
 * Performs some functional testing to ensure GSON infrastructure properly serializes/deserializes
 * fields that either should or should not be included in the output based on the GSON
 * configuration.
 * 
 * @author Joel Leitch
 */
public class FieldExclusionTest extends TestCase {
    private static final String VALUE = "blah_1234";

    private Outer outer;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        outer = new Outer();
    }

    public void testDefaultInnerClassExclusion() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultInnerClassExclusion");
        Gson gson = new Gson();
        Outer.Inner target = outer.new Inner(VALUE);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1560,target,1559,target.toJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1561,result);
        gson = new GsonBuilder().create();
        target = outer.new Inner(VALUE);
        result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1563,target,1562,target.toJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1564,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInnerClassExclusion() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInnerClassExclusion");
        Gson gson = new GsonBuilder().disableInnerClassSerialization().create();
        Outer.Inner target = outer.new Inner(VALUE);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1471,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultNestedStaticClassIncluded() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultNestedStaticClassIncluded");
        Gson gson = new Gson();
        Outer.Inner target = outer.new Inner(VALUE);
        String result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1566,target,1565,target.toJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1567,result);
        gson = new GsonBuilder().create();
        target = outer.new Inner(VALUE);
        result = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1569,target,1568,target.toJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1570,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class Outer {
        private class Inner extends NestedClass {
            public Inner(String value) {
                super(value);
            }
        }
    }

    private static class NestedClass {
        private final String value;

        public NestedClass(String value) {
            this.value = value;
        }

        public String toJson() {
            return ("{\"value\":\"" + (value)) + "\"}";
        }
    }
}

