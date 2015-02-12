package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Since;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import com.google.gson.annotations.Until;

/** 
 * Functional tests for versioning support in Gson.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class VersioningTest extends TestCase {
    private static final int A = 0;

    private static final int B = 1;

    private static final int C = 2;

    private static final int D = 3;

    private GsonBuilder builder;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        builder = new GsonBuilder();
    }

    public void testVersionedUntilSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedUntilSerialization");
        Version1 target = new Version1();
        Gson gson = builder.setVersion(0.29000000000000004).create();
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2638,json,2637,json.contains(("\"a\":" + (com.google.gson.functional.VersioningTest.A))));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2640,json,2639,json.contains(("\"a\":" + (com.google.gson.functional.VersioningTest.A))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedUntilSerialization_literalMutation2119() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedUntilSerialization_literalMutation2119");
        Version1 target = new Version1();
        Gson gson = builder.setVersion(1.29).create();
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2638,json,2637,json.contains(("\"a\":" + (com.google.gson.functional.VersioningTest.A))));
        gson = builder.setVersion(0.30000000000000004).create();
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2640,json,2639,json.contains(("\"a\":" + (com.google.gson.functional.VersioningTest.A))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedUntilDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedUntilDeserialization");
        Gson gson = builder.setVersion(0.30000000000000004).create();
        String json = "{\"a\":3,\"b\":4,\"c\":5}";
        Version1 version1 = gson.fromJson(json, Version1.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2635,com.google.gson.functional.VersioningTest.A);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,version1.a);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedUntilDeserialization_literalMutation2117() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedUntilDeserialization_literalMutation2117");
        Gson gson = builder.setVersion(1.3).create();
        String json = "foo";
        Version1 version1 = gson.fromJson(json, Version1.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2635,com.google.gson.functional.VersioningTest.A);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2636,version1.a);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedClassesSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedClassesSerialization");
        Gson gson = builder.setVersion(0.0).create();
        String json1 = gson.toJson(new Version1());
        String json2 = gson.toJson(new Version1_1());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2613,json1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,json2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedClassesDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedClassesDeserialization");
        Gson gson = builder.setVersion(0.0).create();
        String json = "{\"a\":3,\"b\":4,\"c\":5}";
        Version1 version1 = gson.fromJson(json, Version1.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2607,version1.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2608,version1.b);
        Version1_1 version1_1 = gson.fromJson(json, Version1_1.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2609,version1_1.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,version1_1.b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2611,com.google.gson.functional.VersioningTest.C);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,version1_1.c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedClassesDeserialization_literalMutation2097() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedClassesDeserialization_literalMutation2097");
        Gson gson = builder.setVersion(1.0).create();
        String json = "foo";
        Version1 version1 = gson.fromJson(json, Version1.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2607,version1.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2608,version1.b);
        Version1_1 version1_1 = gson.fromJson(json, Version1_1.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2609,version1_1.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,version1_1.b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2611,com.google.gson.functional.VersioningTest.C);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,version1_1.c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIgnoreLaterVersionClassSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIgnoreLaterVersionClassSerialization");
        Gson gson = builder.setVersion(0.0).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2606,gson,2605,gson.toJson(new com.google.gson.functional.VersioningTest.Version1_2()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIgnoreLaterVersionClassDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIgnoreLaterVersionClassDeserialization");
        Gson gson = builder.setVersion(2.0).create();
        String json = "{\"a\":3,\"b\":4,\"c\":5,\"d\":6}";
        Version1_2 version1_2 = gson.fromJson(json, Version1_2.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2604,version1_2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIgnoreLaterVersionClassDeserialization_literalMutation2094() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIgnoreLaterVersionClassDeserialization_literalMutation2094");
        Gson gson = builder.setVersion(1.0).create();
        String json = "foo";
        Version1_2 version1_2 = gson.fromJson(json, Version1_2.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2604,version1_2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonWithUnversionedClassesSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonWithUnversionedClassesSerialization");
        Gson gson = builder.setVersion(2.0).create();
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,target,2631,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,gson,2633,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonWithUnversionedClassesSerialization_literalMutation2112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonWithUnversionedClassesSerialization_literalMutation2112");
        Gson gson = builder.setVersion(1.0).create();
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(11 , 20 , false , "stringValue");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,target,2631,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,gson,2633,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonWithUnversionedClassesSerialization_literalMutation2113() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonWithUnversionedClassesSerialization_literalMutation2113");
        Gson gson = builder.setVersion(1.0).create();
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(10 , 21 , false , "stringValue");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,target,2631,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,gson,2633,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonWithUnversionedClassesSerialization_literalMutation2114() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonWithUnversionedClassesSerialization_literalMutation2114");
        Gson gson = builder.setVersion(1.0).create();
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,target,2631,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,gson,2633,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonWithUnversionedClassesSerialization_literalMutation2115() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonWithUnversionedClassesSerialization_literalMutation2115");
        Gson gson = builder.setVersion(1.0).create();
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(10 , 20 , false , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,target,2631,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,gson,2633,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonWithUnversionedClassesDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonWithUnversionedClassesDeserialization");
        Gson gson = builder.setVersion(0.0).create();
        String json = "{\"longValue\":10,\"intValue\":20,\"booleanValue\":false}";
        TestTypes.BagOfPrimitives expected = new TestTypes.BagOfPrimitives();
        expected.longValue = 10;
        expected.intValue = 20;
        expected.booleanValue = false;
        TestTypes.BagOfPrimitives actual = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2629,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonWithUnversionedClassesDeserialization_literalMutation2107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonWithUnversionedClassesDeserialization_literalMutation2107");
        Gson gson = builder.setVersion(1.0).create();
        String json = "foo";
        TestTypes.BagOfPrimitives expected = new TestTypes.BagOfPrimitives();
        expected.longValue = 10;
        expected.intValue = 20;
        expected.booleanValue = false;
        TestTypes.BagOfPrimitives actual = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2629,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonWithUnversionedClassesDeserialization_literalMutation2108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonWithUnversionedClassesDeserialization_literalMutation2108");
        Gson gson = builder.setVersion(1.0).create();
        String json = "{\"longValue\":10,\"intValue\":20,\"booleanValue\":false}";
        TestTypes.BagOfPrimitives expected = new TestTypes.BagOfPrimitives();
        expected.longValue = 11;
        expected.intValue = 20;
        expected.booleanValue = false;
        TestTypes.BagOfPrimitives actual = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2629,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonWithUnversionedClassesDeserialization_literalMutation2109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonWithUnversionedClassesDeserialization_literalMutation2109");
        Gson gson = builder.setVersion(1.0).create();
        String json = "{\"longValue\":10,\"intValue\":20,\"booleanValue\":false}";
        TestTypes.BagOfPrimitives expected = new TestTypes.BagOfPrimitives();
        expected.longValue = 10;
        expected.intValue = 21;
        expected.booleanValue = false;
        TestTypes.BagOfPrimitives actual = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2629,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonWithUnversionedClassesDeserialization_literalMutation2110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonWithUnversionedClassesDeserialization_literalMutation2110");
        Gson gson = builder.setVersion(1.0).create();
        String json = "{\"longValue\":10,\"intValue\":20,\"booleanValue\":false}";
        TestTypes.BagOfPrimitives expected = new TestTypes.BagOfPrimitives();
        expected.longValue = 10;
        expected.intValue = 20;
        expected.booleanValue = false;
        TestTypes.BagOfPrimitives actual = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2629,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,actual);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonMixingSinceAndUntilSerialization");
        Gson gson = builder.setVersion(0.0).create();
        SinceUntilMixing target = new SinceUntilMixing();
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2624,json,2623,json.contains(("\"b\":" + (com.google.gson.functional.VersioningTest.B))));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2626,json,2625,json.contains(("\"b\":" + (com.google.gson.functional.VersioningTest.B))));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2628,json,2627,json.contains(("\"b\":" + (com.google.gson.functional.VersioningTest.B))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_literalMutation2104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonMixingSinceAndUntilSerialization_literalMutation2104");
        Gson gson = builder.setVersion(1.0).create();
        SinceUntilMixing target = new SinceUntilMixing();
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2624,json,2623,json.contains(("\"b\":" + (com.google.gson.functional.VersioningTest.B))));
        gson = builder.setVersion(2.2).create();
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2626,json,2625,json.contains(("\"b\":" + (com.google.gson.functional.VersioningTest.B))));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2628,json,2627,json.contains(("\"b\":" + (com.google.gson.functional.VersioningTest.B))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_literalMutation2105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonMixingSinceAndUntilSerialization_literalMutation2105");
        Gson gson = builder.setVersion(1.0).create();
        SinceUntilMixing target = new SinceUntilMixing();
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2624,json,2623,json.contains(("\"b\":" + (com.google.gson.functional.VersioningTest.B))));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2626,json,2625,json.contains(("\"b\":" + (com.google.gson.functional.VersioningTest.B))));
        gson = builder.setVersion(2.3).create();
        json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2628,json,2627,json.contains(("\"b\":" + (com.google.gson.functional.VersioningTest.B))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonMixingSinceAndUntilDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonMixingSinceAndUntilDeserialization");
        String json = "foo";
        Gson gson = builder.setVersion(1.0).create();
        SinceUntilMixing result = gson.fromJson(json, SinceUntilMixing.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2615,result.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,com.google.gson.functional.VersioningTest.B);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2617,result.b);
        gson = builder.setVersion(1.2).create();
        result = gson.fromJson(json, SinceUntilMixing.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2618,result.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2619,result.b);
        gson = builder.setVersion(1.3).create();
        result = gson.fromJson(json, SinceUntilMixing.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2620,result.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2621,com.google.gson.functional.VersioningTest.B);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2622,result.b);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonMixingSinceAndUntilDeserialization_literalMutation2100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonMixingSinceAndUntilDeserialization_literalMutation2100");
        String json = "{\"a\":5,\"b\":6}";
        Gson gson = builder.setVersion(0.0).create();
        SinceUntilMixing result = gson.fromJson(json, SinceUntilMixing.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2615,result.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,com.google.gson.functional.VersioningTest.B);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2617,result.b);
        gson = builder.setVersion(1.2).create();
        result = gson.fromJson(json, SinceUntilMixing.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2618,result.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2619,result.b);
        gson = builder.setVersion(1.3).create();
        result = gson.fromJson(json, SinceUntilMixing.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2620,result.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2621,com.google.gson.functional.VersioningTest.B);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2622,result.b);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonMixingSinceAndUntilDeserialization_literalMutation2101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonMixingSinceAndUntilDeserialization_literalMutation2101");
        String json = "{\"a\":5,\"b\":6}";
        Gson gson = builder.setVersion(1.0).create();
        SinceUntilMixing result = gson.fromJson(json, SinceUntilMixing.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2615,result.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,com.google.gson.functional.VersioningTest.B);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2617,result.b);
        gson = builder.setVersion(0.19999999999999996).create();
        result = gson.fromJson(json, SinceUntilMixing.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2618,result.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2619,result.b);
        gson = builder.setVersion(1.3).create();
        result = gson.fromJson(json, SinceUntilMixing.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2620,result.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2621,com.google.gson.functional.VersioningTest.B);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2622,result.b);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testVersionedGsonMixingSinceAndUntilDeserialization_literalMutation2102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testVersionedGsonMixingSinceAndUntilDeserialization_literalMutation2102");
        String json = "{\"a\":5,\"b\":6}";
        Gson gson = builder.setVersion(1.0).create();
        SinceUntilMixing result = gson.fromJson(json, SinceUntilMixing.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2615,result.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2616,com.google.gson.functional.VersioningTest.B);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2617,result.b);
        gson = builder.setVersion(1.2).create();
        result = gson.fromJson(json, SinceUntilMixing.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2618,result.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2619,result.b);
        gson = builder.setVersion(2.3).create();
        result = gson.fromJson(json, SinceUntilMixing.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2620,result.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2621,com.google.gson.functional.VersioningTest.B);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2622,result.b);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class Version1 {
        @Until(value = 1.3)
        int a = VersioningTest.A;

        @Since(value = 1.0)
        int b = VersioningTest.B;
    }

    private static class Version1_1 extends Version1 {
        @Since(value = 1.1)
        int c = VersioningTest.C;
    }

    @Since(value = 1.2)
    private static class Version1_2 extends Version1_1 {
        @SuppressWarnings(value = "unused")
        int d = VersioningTest.D;
    }

    private static class SinceUntilMixing {
        int a = VersioningTest.A;

        @Since(value = 1.1)
        @Until(value = 1.3)
        int b = VersioningTest.B;
    }
}

