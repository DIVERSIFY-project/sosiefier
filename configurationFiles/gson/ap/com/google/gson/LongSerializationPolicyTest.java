package com.google.gson;

import junit.framework.TestCase;

/** 
 * Unit test for the {@link LongSerializationPolicy} class.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class LongSerializationPolicyTest extends TestCase {
    public void testDefaultLongSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultLongSerialization");
        JsonElement element = LongSerializationPolicy.DEFAULT.serialize(1557L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3118,element,3117,element.isJsonPrimitive());
        JsonPrimitive jsonPrimitive = element.getAsJsonPrimitive();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3120,jsonPrimitive,3119,jsonPrimitive.isString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3122,jsonPrimitive,3121,jsonPrimitive.isNumber());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3124,element,3123,element.getAsLong());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultLongSerializationIntegration() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultLongSerializationIntegration");
        Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.DEFAULT).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3114,gson,3113,gson.toJson(new long[]{ 1L }, long[].class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3116,gson,3115,gson.toJson(new java.lang.Long[]{ 1L }, java.lang.Long[].class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringLongSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringLongSerialization");
        JsonElement element = LongSerializationPolicy.STRING.serialize(1557L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3130,element,3129,element.isJsonPrimitive());
        JsonPrimitive jsonPrimitive = element.getAsJsonPrimitive();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3132,jsonPrimitive,3131,jsonPrimitive.isNumber());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3134,jsonPrimitive,3133,jsonPrimitive.isString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3136,element,3135,element.getAsString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringLongSerializationIntegration() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringLongSerializationIntegration");
        Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3126,gson,3125,gson.toJson(new long[]{ 1L }, long[].class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3128,gson,3127,gson.toJson(new java.lang.Long[]{ 1L }, java.lang.Long[].class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

