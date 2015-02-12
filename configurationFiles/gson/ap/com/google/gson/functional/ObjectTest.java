package com.google.gson.functional;

import java.util.ArrayList;
import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.util.TimeZone;

/** 
 * Functional tests for Json serialization and deserialization of regular classes.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ObjectTest extends TestCase {
    private Gson gson;

    private TimeZone oldTimeZone = TimeZone.getDefault();

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        java.util.Locale.setDefault(java.util.Locale.US);
    }

    @Override
    protected void tearDown() throws Exception {
        TimeZone.setDefault(oldTimeZone);
        super.tearDown();
    }

    public void testJsonInSingleQuotesDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonInSingleQuotesDeserialization");
        String json = "foo";
        TestTypes.BagOfPrimitives target = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2047,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2048,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2049,target.longValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testJsonInMixedQuotesDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonInMixedQuotesDeserialization");
        String json = "foo";
        TestTypes.BagOfPrimitives target = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2044,target.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2045,target.intValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2046,target.longValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitivesSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitivesSerialization");
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(9 , 20 , false , "stringValue");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,target,2013,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,gson,2015,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitivesSerialization_literalMutation1648() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitivesSerialization_literalMutation1648");
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(10 , 19 , false , "stringValue");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,target,2013,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,gson,2015,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitivesSerialization_literalMutation1649() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitivesSerialization_literalMutation1649");
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,target,2013,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,gson,2015,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitivesSerialization_literalMutation1650() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitivesSerialization_literalMutation1650");
        TestTypes.BagOfPrimitives target = new TestTypes.BagOfPrimitives(10 , 20 , false , "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2014,target,2013,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2016,gson,2015,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitivesDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitivesDeserialization");
        TestTypes.BagOfPrimitives src = new TestTypes.BagOfPrimitives(9 , 20 , false , "stringValue");
        String json = src.getExpectedJson();
        TestTypes.BagOfPrimitives target = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,target,2011,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitivesDeserialization_literalMutation1644() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitivesDeserialization_literalMutation1644");
        TestTypes.BagOfPrimitives src = new TestTypes.BagOfPrimitives(10 , 21 , false , "stringValue");
        String json = src.getExpectedJson();
        TestTypes.BagOfPrimitives target = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,target,2011,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitivesDeserialization_literalMutation1645() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitivesDeserialization_literalMutation1645");
        TestTypes.BagOfPrimitives src = new TestTypes.BagOfPrimitives(10 , 20 , true , "stringValue");
        String json = src.getExpectedJson();
        TestTypes.BagOfPrimitives target = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,target,2011,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitivesDeserialization_literalMutation1646() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitivesDeserialization_literalMutation1646");
        TestTypes.BagOfPrimitives src = new TestTypes.BagOfPrimitives(10 , 20 , false , "foo");
        String json = src.getExpectedJson();
        TestTypes.BagOfPrimitives target = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2010,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2012,target,2011,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitiveWrappersSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitiveWrappersSerialization");
        TestTypes.BagOfPrimitiveWrappers target = new TestTypes.BagOfPrimitiveWrappers(11L , 20 , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,target,2006,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,gson,2008,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitiveWrappersSerialization_literalMutation1641() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitiveWrappersSerialization_literalMutation1641");
        TestTypes.BagOfPrimitiveWrappers target = new TestTypes.BagOfPrimitiveWrappers(10L , 21 , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,target,2006,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,gson,2008,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitiveWrappersSerialization_literalMutation1642() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitiveWrappersSerialization_literalMutation1642");
        TestTypes.BagOfPrimitiveWrappers target = new TestTypes.BagOfPrimitiveWrappers(10L , 20 , false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2007,target,2006,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2009,gson,2008,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitiveWrappersDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitiveWrappersDeserialization");
        TestTypes.BagOfPrimitiveWrappers target = new TestTypes.BagOfPrimitiveWrappers(11L , 20 , false);
        String jsonString = target.getExpectedJson();
        target = gson.fromJson(jsonString, TestTypes.BagOfPrimitiveWrappers.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,jsonString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2005,target,2004,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitiveWrappersDeserialization_literalMutation1638() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitiveWrappersDeserialization_literalMutation1638");
        TestTypes.BagOfPrimitiveWrappers target = new TestTypes.BagOfPrimitiveWrappers(10L , 19 , false);
        String jsonString = target.getExpectedJson();
        target = gson.fromJson(jsonString, TestTypes.BagOfPrimitiveWrappers.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,jsonString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2005,target,2004,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBagOfPrimitiveWrappersDeserialization_literalMutation1639() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagOfPrimitiveWrappersDeserialization_literalMutation1639");
        TestTypes.BagOfPrimitiveWrappers target = new TestTypes.BagOfPrimitiveWrappers(10L , 20 , false);
        String jsonString = target.getExpectedJson();
        target = gson.fromJson(jsonString, TestTypes.BagOfPrimitiveWrappers.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2003,jsonString);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2005,target,2004,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassWithTransientFieldsSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithTransientFieldsSerialization");
        TestTypes.ClassWithTransientFields<java.lang.Long> target = new TestTypes.ClassWithTransientFields<java.lang.Long>(2L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2028,target,2027,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2030,gson,2029,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    public void testClassWithTransientFieldsDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithTransientFieldsDeserialization");
        String json = "{\"longValue\":[1]}";
        TestTypes.ClassWithTransientFields target = gson.fromJson(json, TestTypes.ClassWithTransientFields.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,target,2025,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    public void testClassWithTransientFieldsDeserialization_literalMutation1654() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithTransientFieldsDeserialization_literalMutation1654");
        String json = "foo";
        TestTypes.ClassWithTransientFields target = gson.fromJson(json, TestTypes.ClassWithTransientFields.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2024,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2026,target,2025,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    public void testClassWithTransientFieldsDeserializationTransientFieldsPassedInJsonAreIgnored() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithTransientFieldsDeserializationTransientFieldsPassedInJsonAreIgnored");
        String json = "{\"transientLongValue\":1,\"longValue\":[1]}";
        TestTypes.ClassWithTransientFields target = gson.fromJson(json, TestTypes.ClassWithTransientFields.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,((target.transientLongValue) != 1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "rawtypes")
    public void testClassWithTransientFieldsDeserializationTransientFieldsPassedInJsonAreIgnored_literalMutation1656() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithTransientFieldsDeserializationTransientFieldsPassedInJsonAreIgnored_literalMutation1656");
        String json = "foo";
        TestTypes.ClassWithTransientFields target = gson.fromJson(json, TestTypes.ClassWithTransientFields.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2023,((target.transientLongValue) != 1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassWithNoFieldsSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithNoFieldsSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2020,gson,2019,gson.toJson(new com.google.gson.common.TestTypes.ClassWithNoFields()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClassWithNoFieldsDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithNoFieldsDeserialization");
        String json = "foo";
        TestTypes.ClassWithNoFields target = gson.fromJson(json, TestTypes.ClassWithNoFields.class);
        TestTypes.ClassWithNoFields expected = new TestTypes.ClassWithNoFields();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2017,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2018,target);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedSerialization");
        TestTypes.Nested target = new TestTypes.Nested(new TestTypes.BagOfPrimitives(11 , 20 , false , "stringValue") , new TestTypes.BagOfPrimitives(30 , 40 , true , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2055,target,2054,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2057,gson,2056,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedSerialization_literalMutation1669() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedSerialization_literalMutation1669");
        TestTypes.Nested target = new TestTypes.Nested(new TestTypes.BagOfPrimitives(10 , 19 , false , "stringValue") , new TestTypes.BagOfPrimitives(30 , 40 , true , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2055,target,2054,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2057,gson,2056,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedSerialization_literalMutation1670() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedSerialization_literalMutation1670");
        TestTypes.Nested target = new TestTypes.Nested(new TestTypes.BagOfPrimitives(10 , 20 , true , "stringValue") , new TestTypes.BagOfPrimitives(30 , 40 , true , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2055,target,2054,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2057,gson,2056,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedSerialization_literalMutation1671() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedSerialization_literalMutation1671");
        TestTypes.Nested target = new TestTypes.Nested(new TestTypes.BagOfPrimitives(10 , 20 , false , "foo") , new TestTypes.BagOfPrimitives(30 , 40 , true , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2055,target,2054,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2057,gson,2056,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedSerialization_literalMutation1672() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedSerialization_literalMutation1672");
        TestTypes.Nested target = new TestTypes.Nested(new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue") , new TestTypes.BagOfPrimitives(29 , 40 , true , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2055,target,2054,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2057,gson,2056,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedSerialization_literalMutation1673() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedSerialization_literalMutation1673");
        TestTypes.Nested target = new TestTypes.Nested(new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue") , new TestTypes.BagOfPrimitives(30 , 41 , true , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2055,target,2054,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2057,gson,2056,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedSerialization_literalMutation1674() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedSerialization_literalMutation1674");
        TestTypes.Nested target = new TestTypes.Nested(new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue") , new TestTypes.BagOfPrimitives(30 , 40 , false , "stringValue"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2055,target,2054,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2057,gson,2056,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedSerialization_literalMutation1675() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedSerialization_literalMutation1675");
        TestTypes.Nested target = new TestTypes.Nested(new TestTypes.BagOfPrimitives(10 , 20 , false , "stringValue") , new TestTypes.BagOfPrimitives(30 , 40 , true , "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2055,target,2054,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2057,gson,2056,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedDeserialization");
        String json = "foo" + ("\"stringValue\":\"stringValue\"},\"primitive2\":{\"longValue\":30,\"intValue\":40," + "\"booleanValue\":true,\"stringValue\":\"stringValue\"}}");
        TestTypes.Nested target = gson.fromJson(json, TestTypes.Nested.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2051,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2053,target,2052,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedDeserialization_literalMutation1666() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedDeserialization_literalMutation1666");
        String json = "{\"primitive1\":{\"longValue\":10,\"intValue\":20,\"booleanValue\":false," + ("foo" + "\"booleanValue\":true,\"stringValue\":\"stringValue\"}}");
        TestTypes.Nested target = gson.fromJson(json, TestTypes.Nested.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2051,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2053,target,2052,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNestedDeserialization_literalMutation1667() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNestedDeserialization_literalMutation1667");
        String json = "{\"primitive1\":{\"longValue\":10,\"intValue\":20,\"booleanValue\":false," + ("\"stringValue\":\"stringValue\"},\"primitive2\":{\"longValue\":30,\"intValue\":40," + "foo");
        TestTypes.Nested target = gson.fromJson(json, TestTypes.Nested.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2051,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2053,target,2052,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2071,gson,2070,gson.toJson(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyStringDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyStringDeserialization");
        Object object = gson.fromJson("foo", Object.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2038,object);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTruncatedDeserialization_add1320() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTruncatedDeserialization_add1320");
        try {
            gson.fromJson("[\"a\", \"b\",", new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {            }.getType());
            gson.fromJson("[\"a\", \"b\",", new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {            }.getType());
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTruncatedDeserialization_add1321() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTruncatedDeserialization_add1321");
        try {
            gson.fromJson("[\"a\", \"b\",", new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {            }.getType());
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTruncatedDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTruncatedDeserialization");
        try {
            gson.fromJson("foo", new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {            }.getType());
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullDeserialization");
        String myNullObject = null;
        Object object = gson.fromJson(myNullObject, Object.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2059,object);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullFieldsSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullFieldsSerialization");
        TestTypes.Nested target = new TestTypes.Nested(new TestTypes.BagOfPrimitives(11 , 20 , false , "stringValue") , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2064,target,2063,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2066,gson,2065,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullFieldsSerialization_literalMutation1681() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullFieldsSerialization_literalMutation1681");
        TestTypes.Nested target = new TestTypes.Nested(new TestTypes.BagOfPrimitives(10 , 19 , false , "stringValue") , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2064,target,2063,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2066,gson,2065,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullFieldsSerialization_literalMutation1682() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullFieldsSerialization_literalMutation1682");
        TestTypes.Nested target = new TestTypes.Nested(new TestTypes.BagOfPrimitives(10 , 20 , true , "stringValue") , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2064,target,2063,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2066,gson,2065,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullFieldsSerialization_literalMutation1683() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullFieldsSerialization_literalMutation1683");
        TestTypes.Nested target = new TestTypes.Nested(new TestTypes.BagOfPrimitives(10 , 20 , false , "foo") , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2064,target,2063,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2066,gson,2065,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullFieldsDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullFieldsDeserialization");
        String json = "foo" + ",\"stringValue\":\"stringValue\"}}";
        TestTypes.Nested target = gson.fromJson(json, TestTypes.Nested.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2060,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2062,target,2061,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullFieldsDeserialization_literalMutation1679() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullFieldsDeserialization_literalMutation1679");
        String json = "{\"primitive1\":{\"longValue\":10,\"intValue\":20,\"booleanValue\":false" + "foo";
        TestTypes.Nested target = gson.fromJson(json, TestTypes.Nested.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2060,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2062,target,2061,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfObjectsSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjectsSerialization");
        TestTypes.ArrayOfObjects target = new TestTypes.ArrayOfObjects();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2000,target,1999,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2002,gson,2001,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfObjectsDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjectsDeserialization");
        String json = new TestTypes.ArrayOfObjects().getExpectedJson();
        TestTypes.ArrayOfObjects target = gson.fromJson(json, TestTypes.ArrayOfObjects.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1996,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1998,target,1997,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfArraysSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArraysSerialization");
        ArrayOfArrays target = new ArrayOfArrays();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1989,target,1988,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1354,gson,1353,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfArraysDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfArraysDeserialization");
        String json = new ArrayOfArrays().getExpectedJson();
        ArrayOfArrays target = gson.fromJson(json, ArrayOfArrays.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1985,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1987,target,1986,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayOfObjectsAsFields() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayOfObjectsAsFields");
        TestTypes.ClassWithObjects classWithObjects = new TestTypes.ClassWithObjects();
        TestTypes.BagOfPrimitives bagOfPrimitives = new TestTypes.BagOfPrimitives();
        String stringValue = "foo";
        String classWithObjectsJson = gson.toJson(classWithObjects);
        String bagOfPrimitivesJson = gson.toJson(bagOfPrimitives);
        TestTypes.ClassWithArray classWithArray = new TestTypes.ClassWithArray(new Object[]{ stringValue , classWithObjects , bagOfPrimitives });
        String json = gson.toJson(classWithArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,json,1990,json.contains(classWithObjectsJson));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1993,json,1992,json.contains(bagOfPrimitivesJson));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1995,json,1994,json.contains((("\"" + stringValue) + "\"")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to Issue 14: http://code.google.com/p/google-gson/issues/detail?id=14
     */
public void testNullArraysDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullArraysDeserialization");
        String json = "foo";
        TestTypes.ClassWithArray target = gson.fromJson(json, TestTypes.ClassWithArray.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2058,target.array);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to Issue 14: http://code.google.com/p/google-gson/issues/detail?id=14
     */
public void testNullObjectFieldsDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullObjectFieldsDeserialization");
        String json = "foo";
        TestTypes.ClassWithObjects target = gson.fromJson(json, TestTypes.ClassWithObjects.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2067,target.bag);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyCollectionInAnObjectDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyCollectionInAnObjectDeserialization");
        String json = "foo";
        ClassWithCollectionField target = gson.fromJson(json, ClassWithCollectionField.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2033,target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2035,target.children,2034,target.children.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ClassWithCollectionField {
        Collection<java.lang.String> children = new ArrayList<java.lang.String>();
    }

    public void testPrimitiveArrayInAnObjectDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveArrayInAnObjectDeserialization");
        String json = "foo";
        TestTypes.PrimitiveArray target = gson.fromJson(json, TestTypes.PrimitiveArray.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2079,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2081,target,2080,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to Issue 14: http://code.google.com/p/google-gson/issues/detail?id=14
     */
public void testNullPrimitiveFieldsDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullPrimitiveFieldsDeserialization");
        String json = "foo";
        TestTypes.BagOfPrimitives target = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2068,com.google.gson.common.TestTypes.BagOfPrimitives.DEFAULT_VALUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2069,target.longValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyCollectionInAnObjectSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyCollectionInAnObjectSerialization");
        ClassWithCollectionField target = new ClassWithCollectionField();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2037,gson,2036,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrivateNoArgConstructorDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrivateNoArgConstructorDeserialization");
        ClassWithPrivateNoArgsConstructor target = gson.fromJson("foo", ClassWithPrivateNoArgsConstructor.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2082,target.a);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAnonymousLocalClassesSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnonymousLocalClassesSerialization");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1984,gson,1983,gson.toJson(new com.google.gson.common.TestTypes.ClassWithNoFields() {}));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAnonymousLocalClassesSerialization_remove1115() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnonymousLocalClassesSerialization_remove1115");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1984,gson,1983,gson.toJson(new com.google.gson.common.TestTypes.ClassWithNoFields() {}));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAnonymousLocalClassesCustomSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnonymousLocalClassesCustomSerialization");
        gson = new GsonBuilder().registerTypeHierarchyAdapter(TestTypes.ClassWithNoFields.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithNoFields>() {
            public com.google.gson.JsonElement serialize(TestTypes.ClassWithNoFields src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return new JsonObject();
            }
        }).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,gson,1981,gson.toJson(new com.google.gson.common.TestTypes.ClassWithNoFields() {}));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAnonymousLocalClassesCustomSerialization_add1311() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnonymousLocalClassesCustomSerialization_add1311");
        gson = new GsonBuilder().registerTypeHierarchyAdapter(TestTypes.ClassWithNoFields.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithNoFields>() {
            public com.google.gson.JsonElement serialize(TestTypes.ClassWithNoFields src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return new JsonObject();
            }
        }).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,gson,1981,gson.toJson(new com.google.gson.common.TestTypes.ClassWithNoFields() {}));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAnonymousLocalClassesCustomSerialization_remove1113() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnonymousLocalClassesCustomSerialization_remove1113");
        gson = new GsonBuilder().registerTypeHierarchyAdapter(TestTypes.ClassWithNoFields.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithNoFields>() {
            public com.google.gson.JsonElement serialize(TestTypes.ClassWithNoFields src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return new JsonObject();
            }
        }).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,gson,1981,gson.toJson(new com.google.gson.common.TestTypes.ClassWithNoFields() {}));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAnonymousLocalClassesCustomSerialization_remove1114() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAnonymousLocalClassesCustomSerialization_remove1114");
        gson = new GsonBuilder().registerTypeHierarchyAdapter(TestTypes.ClassWithNoFields.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithNoFields>() {
            public com.google.gson.JsonElement serialize(TestTypes.ClassWithNoFields src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return new JsonObject();
            }
        }).create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1982,gson,1981,gson.toJson(new com.google.gson.common.TestTypes.ClassWithNoFields() {}));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveArrayFieldSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveArrayFieldSerialization");
        TestTypes.PrimitiveArray target = new TestTypes.PrimitiveArray(new long[]{ 0L , 2L , 3L });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2076,target,2075,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2078,gson,2077,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveArrayFieldSerialization_literalMutation1689() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveArrayFieldSerialization_literalMutation1689");
        TestTypes.PrimitiveArray target = new TestTypes.PrimitiveArray(new long[]{ 1L , 3L , 3L });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2076,target,2075,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2078,gson,2077,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPrimitiveArrayFieldSerialization_literalMutation1690() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPrimitiveArrayFieldSerialization_literalMutation1690");
        TestTypes.PrimitiveArray target = new TestTypes.PrimitiveArray(new long[]{ 1L , 2L , 2L });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2076,target,2075,target.getExpectedJson());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2078,gson,2077,gson.toJson(target));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that a class field with type Object can be serialized properly.
     * See issue 54
     */
public void testClassWithObjectFieldSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClassWithObjectFieldSerialization");
        ClassWithObjectField obj = new ClassWithObjectField();
        obj.member = "foo";
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2022,json,2021,json.contains("abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ClassWithObjectField {
        @SuppressWarnings(value = "unused")
        Object member;
    }

    public void testInnerClassSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInnerClassSerialization");
        Parent p = new Parent();
        Parent.Child c = p.new Child();
        String json = gson.toJson(c);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2041,json,2040,json.contains("value2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2043,json,2042,json.contains("value1"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInnerClassDeserialization_add1314() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInnerClassDeserialization_add1314");
        final Parent p = new Parent();
        Gson gson = new GsonBuilder().registerTypeAdapter(Parent.Child.class, new com.google.gson.InstanceCreator<Parent.Child>() {
            public Parent.Child createInstance(java.lang.reflect.Type type) {
                return p.new Child();
            }
        }).create();
        String json = "{\'value2\':3}";
        Parent.Child c = gson.fromJson(json, Parent.Child.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,c.value2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInnerClassDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInnerClassDeserialization");
        final Parent p = new Parent();
        Gson gson = new GsonBuilder().registerTypeAdapter(Parent.Child.class, new com.google.gson.InstanceCreator<Parent.Child>() {
            public Parent.Child createInstance(java.lang.reflect.Type type) {
                return p.new Child();
            }
        }).create();
        String json = "foo";
        Parent.Child c = gson.fromJson(json, Parent.Child.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,c.value2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testInnerClassDeserialization_remove1117() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInnerClassDeserialization_remove1117");
        final Parent p = new Parent();
        Gson gson = new GsonBuilder().registerTypeAdapter(Parent.Child.class, new com.google.gson.InstanceCreator<Parent.Child>() {
            public Parent.Child createInstance(java.lang.reflect.Type type) {
                return p.new Child();
            }
        }).create();
        String json = "{\'value2\':3}";
        Parent.Child c = gson.fromJson(json, Parent.Child.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2039,c.value2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class Parent {
        @SuppressWarnings(value = "unused")
        int value1 = 1;

        private class Child {
            int value2 = 2;
        }
    }

    private static class ArrayOfArrays {
        private final TestTypes.BagOfPrimitives[][] elements;

        public ArrayOfArrays() {
            elements = new TestTypes.BagOfPrimitives[3][2];
            for (int i = 0 ; i < (elements.length) ; ++i) {
                TestTypes.BagOfPrimitives[] row = elements[i];
                for (int j = 0 ; j < (row.length) ; ++j) {
                    row[j] = new TestTypes.BagOfPrimitives((i + j) , (i * j) , false , ((i + "_") + j));
                }
            }
        }

        public String getExpectedJson() {
            StringBuilder sb = new StringBuilder("{\"elements\":[");
            boolean first = true;
            for (TestTypes.BagOfPrimitives[] row : elements) {
                if (first) {
                    first = false;
                } else {
                    sb.append(",");
                }
                boolean firstOfRow = true;
                sb.append("[");
                for (TestTypes.BagOfPrimitives element : row) {
                    if (firstOfRow) {
                        firstOfRow = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(element.getExpectedJson());
                }
                sb.append("]");
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    private static class ClassWithPrivateNoArgsConstructor {
        public int a;

        private ClassWithPrivateNoArgsConstructor() {
            a = 10;
        }
    }

    /** 
     * In response to Issue 41 http://code.google.com/p/google-gson/issues/detail?id=41
     */
public void testObjectFieldNamesWithoutQuotesDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testObjectFieldNamesWithoutQuotesDeserialization");
        String json = "foo";
        TestTypes.BagOfPrimitives bag = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2072,bag.longValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2073,bag.booleanValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2074,bag.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringFieldWithNumberValueDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringFieldWithNumberValueDeserialization");
        String json = "foo";
        TestTypes.BagOfPrimitives bag = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2098,bag.stringValue);
        json = "{\"stringValue\":1.5E+6}";
        bag = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2099,bag.stringValue);
        json = "{\"stringValue\":true}";
        bag = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,bag.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringFieldWithNumberValueDeserialization_literalMutation1697() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringFieldWithNumberValueDeserialization_literalMutation1697");
        String json = "{\"stringValue\":1}";
        TestTypes.BagOfPrimitives bag = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2098,bag.stringValue);
        json = "foo";
        bag = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2099,bag.stringValue);
        json = "{\"stringValue\":true}";
        bag = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,bag.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringFieldWithNumberValueDeserialization_literalMutation1698() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringFieldWithNumberValueDeserialization_literalMutation1698");
        String json = "{\"stringValue\":1}";
        TestTypes.BagOfPrimitives bag = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2098,bag.stringValue);
        json = "{\"stringValue\":1.5E+6}";
        bag = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2099,bag.stringValue);
        json = "foo";
        bag = gson.fromJson(json, TestTypes.BagOfPrimitives.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2100,bag.stringValue);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created to reproduce issue 140
     */
public void testStringFieldWithEmptyValueSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringFieldWithEmptyValueSerialization");
        ClassWithEmptyStringFields target = new ClassWithEmptyStringFields();
        target.a = "foo";
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2093,json,2092,json.contains("\"a\":\"5794749\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2095,json,2094,json.contains("\"b\":\"\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2097,json,2096,json.contains("\"c\":\"\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created to reproduce issue 140
     */
public void testStringFieldWithEmptyValueDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringFieldWithEmptyValueDeserialization");
        String json = "foo";
        ClassWithEmptyStringFields target = gson.fromJson(json, ClassWithEmptyStringFields.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2089,target.a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2090,target.b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2091,target.c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class ClassWithEmptyStringFields {
        String a = "";

        String b = "";

        String c = "";
    }

    public void testJsonObjectSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testJsonObjectSerialization");
        Gson gson = new GsonBuilder().serializeNulls().create();
        JsonObject obj = new JsonObject();
        String json = gson.toJson(obj);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2050,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 215.
     */
@Test(timeout = 1000)
    public void testSingletonLists_add1315() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonLists_add1315");
        Gson gson = new Gson();
        Product product = new Product();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,gson,2083,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        gson.fromJson(gson.toJson(product), Product.class);
        product.departments.add(new Department());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2086,gson,2085,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.attributes.add("456");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2088,gson,2087,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 215.
     */
@Test(timeout = 1000)
    public void testSingletonLists_add1316() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonLists_add1316");
        Gson gson = new Gson();
        Product product = new Product();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,gson,2083,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.departments.add(new Department());
        product.departments.add(new Department());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2086,gson,2085,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.attributes.add("456");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2088,gson,2087,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 215.
     */
@Test(timeout = 1000)
    public void testSingletonLists_add1317() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonLists_add1317");
        Gson gson = new Gson();
        Product product = new Product();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,gson,2083,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.departments.add(new Department());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2086,gson,2085,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        gson.fromJson(gson.toJson(product), Product.class);
        product.attributes.add("456");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2088,gson,2087,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 215.
     */
@Test(timeout = 1000)
    public void testSingletonLists_add1318() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonLists_add1318");
        Gson gson = new Gson();
        Product product = new Product();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,gson,2083,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.departments.add(new Department());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2086,gson,2085,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.attributes.add("456");
        product.attributes.add("456");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2088,gson,2087,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 215.
     */
@Test(timeout = 1000)
    public void testSingletonLists_add1319() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonLists_add1319");
        Gson gson = new Gson();
        Product product = new Product();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,gson,2083,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.departments.add(new Department());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2086,gson,2085,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.attributes.add("456");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2088,gson,2087,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 215.
     */
public void testSingletonLists() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonLists");
        Gson gson = new Gson();
        Product product = new Product();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,gson,2083,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.departments.add(new Department());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2086,gson,2085,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.attributes.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2088,gson,2087,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 215.
     */
@Test(timeout = 1000)
    public void testSingletonLists_remove1118() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonLists_remove1118");
        Gson gson = new Gson();
        Product product = new Product();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,gson,2083,gson.toJson(product));
        product.departments.add(new Department());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2086,gson,2085,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.attributes.add("456");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2088,gson,2087,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 215.
     */
@Test(timeout = 1000)
    public void testSingletonLists_remove1119() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonLists_remove1119");
        Gson gson = new Gson();
        Product product = new Product();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,gson,2083,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2086,gson,2085,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.attributes.add("456");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2088,gson,2087,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 215.
     */
@Test(timeout = 1000)
    public void testSingletonLists_remove1120() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonLists_remove1120");
        Gson gson = new Gson();
        Product product = new Product();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,gson,2083,gson.toJson(product));
        product.departments.add(new Department());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2086,gson,2085,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.attributes.add("456");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2088,gson,2087,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 215.
     */
@Test(timeout = 1000)
    public void testSingletonLists_remove1121() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonLists_remove1121");
        Gson gson = new Gson();
        Product product = new Product();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,gson,2083,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2086,gson,2085,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.attributes.add("456");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2088,gson,2087,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test for issue 215.
     */
@Test(timeout = 1000)
    public void testSingletonLists_remove1122() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonLists_remove1122");
        Gson gson = new Gson();
        Product product = new Product();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2084,gson,2083,gson.toJson(product));
        product.departments.add(new Department());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2086,gson,2085,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        product.attributes.add("456");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2088,gson,2087,gson.toJson(product));
        gson.fromJson(gson.toJson(product), Product.class);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDateAsMapObjectField_add1313() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateAsMapObjectField_add1313");
        HasObjectMap a = new HasObjectMap();
        a.map.put("date", new java.util.Date(0));
        a.map.put("date", new java.util.Date(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,gson,2031,gson.toJson(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDateAsMapObjectField() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateAsMapObjectField");
        HasObjectMap a = new HasObjectMap();
        a.map.put("foo", new java.util.Date(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,gson,2031,gson.toJson(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDateAsMapObjectField_literalMutation1659() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateAsMapObjectField_literalMutation1659");
        HasObjectMap a = new HasObjectMap();
        a.map.put("date", new java.util.Date(-1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,gson,2031,gson.toJson(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDateAsMapObjectField_remove1116() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateAsMapObjectField_remove1116");
        HasObjectMap a = new HasObjectMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2032,gson,2031,gson.toJson(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public class HasObjectMap {
        Map<java.lang.String, java.lang.Object> map = new HashMap<java.lang.String, java.lang.Object>();
    }

    static final class Department {
        public String name = "abc";

        public String code = "123";
    }

    static final class Product {
        private List<java.lang.String> attributes = new ArrayList<java.lang.String>();

        private List<Department> departments = new ArrayList<Department>();
    }
}

