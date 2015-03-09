package com.google.gson.functional;

import java.lang.annotation.ElementType;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Performs some functional tests when Gson is instantiated with some common user defined
 * {@link ExclusionStrategy} objects.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ExclusionStrategyFunctionalTest extends TestCase {
    private static final ExclusionStrategy EXCLUDE_SAMPLE_OBJECT_FOR_TEST = new ExclusionStrategy() {
        public boolean shouldSkipField(FieldAttributes f) {
            return false;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return clazz == (SampleObjectForTest.class);
        }
    };

    private SampleObjectForTest src;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        src = new SampleObjectForTest();
    }

    public void testExclusionStrategySerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategySerialization");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        String json = gson.toJson(src);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1521,json,1520,json.contains("\"stringField\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1523,json,1522,json.contains("\"annotatedField\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1525,json,1524,json.contains("\"longField\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategySerializationDoesNotImpactDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategySerializationDoesNotImpactDeserialization");
        String json = "foo";
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), true);
        SampleObjectForTest value = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,value.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1512,value.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,value.longField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategySerializationDoesNotImpactDeserialization_literalMutation1245() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategySerializationDoesNotImpactDeserialization_literalMutation1245");
        String json = "{\"annotatedField\":1,\"stringField\":\"x\",\"longField\":2}";
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), true);
        SampleObjectForTest value = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1511,value.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1512,value.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1513,value.longField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExclusionStrategyDeserialization_add1134() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization_add1134");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("annotatedField", new com.google.gson.JsonPrimitive(((src.annotatedField) + 5)));
        json.add("annotatedField", new com.google.gson.JsonPrimitive(((src.annotatedField) + 5)));
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("longField", new com.google.gson.JsonPrimitive(1212311L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExclusionStrategyDeserialization_add1135() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization_add1135");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("annotatedField", new com.google.gson.JsonPrimitive(((src.annotatedField) + 5)));
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("longField", new com.google.gson.JsonPrimitive(1212311L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExclusionStrategyDeserialization_add1136() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization_add1136");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("annotatedField", new com.google.gson.JsonPrimitive(((src.annotatedField) + 5)));
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("longField", new com.google.gson.JsonPrimitive(1212311L));
        json.add("longField", new com.google.gson.JsonPrimitive(1212311L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategyDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("annotatedField", new com.google.gson.JsonPrimitive(((src.annotatedField) + 5)));
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("longField", new com.google.gson.JsonPrimitive(1212311L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategyDeserialization_literalMutation1237() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization_literalMutation1237");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("foo", new com.google.gson.JsonPrimitive(((src.annotatedField) + 5)));
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("longField", new com.google.gson.JsonPrimitive(1212311L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategyDeserialization_literalMutation1238() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization_literalMutation1238");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("annotatedField", new com.google.gson.JsonPrimitive(((src.annotatedField) + 6)));
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("longField", new com.google.gson.JsonPrimitive(1212311L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategyDeserialization_literalMutation1239() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization_literalMutation1239");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("annotatedField", new com.google.gson.JsonPrimitive(((src.annotatedField) + 5)));
        json.add("foo", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("longField", new com.google.gson.JsonPrimitive(1212311L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategyDeserialization_literalMutation1240() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization_literalMutation1240");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("annotatedField", new com.google.gson.JsonPrimitive(((src.annotatedField) + 5)));
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "foo")));
        json.add("longField", new com.google.gson.JsonPrimitive(1212311L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategyDeserialization_literalMutation1241() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization_literalMutation1241");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("annotatedField", new com.google.gson.JsonPrimitive(((src.annotatedField) + 5)));
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("foo", new com.google.gson.JsonPrimitive(1212311L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategyDeserialization_literalMutation1242() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization_literalMutation1242");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("annotatedField", new com.google.gson.JsonPrimitive(((src.annotatedField) + 5)));
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("longField", new com.google.gson.JsonPrimitive(1212312L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExclusionStrategyDeserialization_remove951() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization_remove951");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("longField", new com.google.gson.JsonPrimitive(1212311L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExclusionStrategyDeserialization_remove952() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization_remove952");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("longField", new com.google.gson.JsonPrimitive(1212311L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testExclusionStrategyDeserialization_remove953() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyDeserialization_remove953");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = new JsonObject();
        json.add("stringField", new com.google.gson.JsonPrimitive(((src.stringField) + "blah,blah")));
        json.add("longField", new com.google.gson.JsonPrimitive(1212311L));
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1506,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1507,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1508,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1509,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1510,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategySerializationDoesNotImpactSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategySerializationDoesNotImpactSerialization");
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        String json = gson.toJson(src);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1515,json,1514,json.contains("\"stringField\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1517,json,1516,json.contains("\"annotatedField\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1519,json,1518,json.contains("\"longField\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategyWithMode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyWithMode");
        SampleObjectForTest testObj = new SampleObjectForTest(((src.annotatedField) + 4) , ((src.stringField) + "blah,blah") , ((src.longField) + 655L));
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = gson.toJsonTree(testObj).getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1526,testObj.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,json.get("annotatedField"),1527,json.get("annotatedField").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,testObj.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1531,json.get("stringField"),1530,json.get("stringField").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,testObj.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,json.get("longField"),1533,json.get("longField").getAsLong());
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1535,testObj.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1537,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1539,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategyWithMode_literalMutation1248() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyWithMode_literalMutation1248");
        SampleObjectForTest testObj = new SampleObjectForTest(((src.annotatedField) + 5) , ((src.stringField) + "foo") , ((src.longField) + 655L));
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = gson.toJsonTree(testObj).getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1526,testObj.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,json.get("annotatedField"),1527,json.get("annotatedField").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,testObj.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1531,json.get("stringField"),1530,json.get("stringField").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,testObj.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,json.get("longField"),1533,json.get("longField").getAsLong());
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1535,testObj.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1537,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1539,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategyWithMode_literalMutation1249() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyWithMode_literalMutation1249");
        SampleObjectForTest testObj = new SampleObjectForTest(((src.annotatedField) + 5) , ((src.stringField) + "blah,blah") , ((src.longField) + 654L));
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), false);
        JsonObject json = gson.toJsonTree(testObj).getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1526,testObj.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,json.get("annotatedField"),1527,json.get("annotatedField").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,testObj.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1531,json.get("stringField"),1530,json.get("stringField").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,testObj.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,json.get("longField"),1533,json.get("longField").getAsLong());
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1535,testObj.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1537,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1539,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExclusionStrategyWithMode_literalMutation1250() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExclusionStrategyWithMode_literalMutation1250");
        SampleObjectForTest testObj = new SampleObjectForTest(((src.annotatedField) + 5) , ((src.stringField) + "blah,blah") , ((src.longField) + 655L));
        Gson gson = ExclusionStrategyFunctionalTest.createGson(new MyExclusionStrategy(String.class), true);
        JsonObject json = gson.toJsonTree(testObj).getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1526,testObj.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1528,json.get("annotatedField"),1527,json.get("annotatedField").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1529,testObj.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1531,json.get("stringField"),1530,json.get("stringField").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1532,testObj.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1534,json.get("longField"),1533,json.get("longField").getAsLong());
        SampleObjectForTest target = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1535,testObj.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1536,target.longField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1537,src.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1538,target.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1539,src.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1540,target.stringField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExcludeTopLevelClassSerializationDoesNotImpactDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExcludeTopLevelClassSerializationDoesNotImpactDeserialization");
        Gson gson = new GsonBuilder().addSerializationExclusionStrategy(EXCLUDE_SAMPLE_OBJECT_FOR_TEST).create();
        String json = "{\"annotatedField\":1,\"stringField\":\"x\",\"longField\":2}";
        SampleObjectForTest value = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,value.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1504,value.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,value.longField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExcludeTopLevelClassSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExcludeTopLevelClassSerialization");
        Gson gson = new GsonBuilder().addSerializationExclusionStrategy(EXCLUDE_SAMPLE_OBJECT_FOR_TEST).create();
        String json = "foo";
        SampleObjectForTest value = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1503,value.annotatedField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1504,value.stringField);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1505,value.longField);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExcludeTopLevelClassDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExcludeTopLevelClassDeserialization");
        Gson gson = new GsonBuilder().addDeserializationExclusionStrategy(EXCLUDE_SAMPLE_OBJECT_FOR_TEST).create();
        String json = "foo";
        SampleObjectForTest value = gson.fromJson(json, SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1502,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExcludeTopLevelClassDeserializationDoesNotImpactSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExcludeTopLevelClassDeserializationDoesNotImpactSerialization");
        Gson gson = new GsonBuilder().addDeserializationExclusionStrategy(EXCLUDE_SAMPLE_OBJECT_FOR_TEST).create();
        String json = gson.toJson(new SampleObjectForTest(), SampleObjectForTest.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1497,json,1496,json.contains("\"stringField\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1499,json,1498,json.contains("\"annotatedField\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1501,json,1500,json.contains("\"longField\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static Gson createGson(ExclusionStrategy exclusionStrategy, boolean serialization) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        if (serialization) {
            gsonBuilder.addSerializationExclusionStrategy(exclusionStrategy);
        } else {
            gsonBuilder.addDeserializationExclusionStrategy(exclusionStrategy);
        }
        return gsonBuilder.serializeNulls().create();
    }

    @Retention(value = RetentionPolicy.RUNTIME)
    @Target(value = { ElementType.FIELD })
    private static @interface Foo {    }

    private static class SampleObjectForTest {
        @Foo
        private final int annotatedField;

        private final String stringField;

        private final long longField;

        public SampleObjectForTest() {
            this(5, "someDefaultValue", 12345L);
        }

        public SampleObjectForTest(int annotatedField ,String stringField ,long longField) {
            this.annotatedField = annotatedField;
            this.stringField = stringField;
            this.longField = longField;
        }
    }

    private static class MyExclusionStrategy implements ExclusionStrategy {
        private final Class<?> typeToSkip;

        private MyExclusionStrategy(Class<?> typeToSkip) {
            this.typeToSkip = typeToSkip;
        }

        public boolean shouldSkipClass(Class<?> clazz) {
            return clazz == (typeToSkip);
        }

        public boolean shouldSkipField(FieldAttributes f) {
            return (f.getAnnotation(Foo.class)) != null;
        }
    }
}

