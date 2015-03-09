package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;

/** 
 * Tests for security-related aspects of Gson
 * 
 * @author Inderjeet Singh
 */
public class SecurityTest extends TestCase {
    /** 
     * Keep this in sync with Gson.JSON_NON_EXECUTABLE_PREFIX
     */
private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}\'\n";

    private GsonBuilder gsonBuilder;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gsonBuilder = new GsonBuilder();
    }

    public void testNonExecutableJsonSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonExecutableJsonSerialization");
        Gson gson = gsonBuilder.generateNonExecutableJson().create();
        String json = gson.toJson(new TestTypes.BagOfPrimitives());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2418,json,2417,json.startsWith(com.google.gson.functional.SecurityTest.JSON_NON_EXECUTABLE_PREFIX));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNonExecutableJsonDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonExecutableJsonDeserialization");
        String json = (JSON_NON_EXECUTABLE_PREFIX) + "foo";
        Gson gson = gsonBuilder.create();
        TestTypes.BagOfPrimitives target = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2416,target.longValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonWithNonExectuableTokenSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonWithNonExectuableTokenSerialization");
        Gson gson = gsonBuilder.generateNonExecutableJson().create();
        String json = gson.toJson(JSON_NON_EXECUTABLE_PREFIX);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2414,json,2413,json.contains(")]}\'\n"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Gson should be able to deserialize a stream with non-exectuable token even if it is created
     * without {@link GsonBuilder#generateNonExecutableJson()}.
     */
public void testJsonWithNonExectuableTokenWithRegularGsonDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonWithNonExectuableTokenWithRegularGsonDeserialization");
        Gson gson = gsonBuilder.create();
        String json = (JSON_NON_EXECUTABLE_PREFIX) + "foo";
        TestTypes.BagOfPrimitives target = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2415,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Gson should be able to deserialize a stream with non-exectuable token if it is created
     * with {@link GsonBuilder#generateNonExecutableJson()}.
     */
public void testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization");
        Gson gson = gsonBuilder.generateNonExecutableJson().create();
        String json = (JSON_NON_EXECUTABLE_PREFIX) + "foo";
        TestTypes.BagOfPrimitives target = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

