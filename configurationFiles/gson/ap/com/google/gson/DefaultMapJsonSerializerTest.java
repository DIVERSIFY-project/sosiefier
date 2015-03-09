package com.google.gson;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Unit test for the default JSON map serialization object located in the
 * {@link DefaultTypeAdapters} class.
 * 
 * @author Joel Leitch
 */
public class DefaultMapJsonSerializerTest extends TestCase {
    private Gson gson = new Gson();

    public void testEmptyMapNoTypeSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapNoTypeSerialization");
        Map<java.lang.String, java.lang.String> emptyMap = new HashMap<java.lang.String, java.lang.String>();
        JsonElement element = gson.toJsonTree(emptyMap, emptyMap.getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2671,(element instanceof com.google.gson.JsonObject));
        JsonObject emptyMapJsonObject = ((JsonObject)(element));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2673,emptyMapJsonObject.entrySet(),2672,emptyMapJsonObject.entrySet().isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyMapSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapSerialization");
        Type mapType = new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        Map<java.lang.String, java.lang.String> emptyMap = new HashMap<java.lang.String, java.lang.String>();
        JsonElement element = gson.toJsonTree(emptyMap, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,(element instanceof com.google.gson.JsonObject));
        JsonObject emptyMapJsonObject = ((JsonObject)(element));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,emptyMapJsonObject.entrySet(),2675,emptyMapJsonObject.entrySet().isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyMapSerialization_remove1246() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapSerialization_remove1246");
        Type mapType = new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        Map<java.lang.String, java.lang.String> emptyMap = new HashMap<java.lang.String, java.lang.String>();
        JsonElement element = gson.toJsonTree(emptyMap, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2674,(element instanceof com.google.gson.JsonObject));
        JsonObject emptyMapJsonObject = ((JsonObject)(element));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2676,emptyMapJsonObject.entrySet(),2675,emptyMapJsonObject.entrySet().isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonEmptyMapSerialization_add1526() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonEmptyMapSerialization_add1526");
        Type mapType = new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        Map<java.lang.String, java.lang.String> myMap = new HashMap<java.lang.String, java.lang.String>();
        String key = "key1";
        myMap.put(key, "value1");
        Gson gson = new Gson();
        JsonElement element = gson.toJsonTree(myMap, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2678,element,2677,element.isJsonObject());
        JsonObject mapJsonObject = element.getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,mapJsonObject,2679,mapJsonObject.has(key));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonEmptyMapSerialization_add1527() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonEmptyMapSerialization_add1527");
        Type mapType = new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        Map<java.lang.String, java.lang.String> myMap = new HashMap<java.lang.String, java.lang.String>();
        String key = "key1";
        myMap.put(key, "value1");
        myMap.put(key, "value1");
        Gson gson = new Gson();
        JsonElement element = gson.toJsonTree(myMap, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2678,element,2677,element.isJsonObject());
        JsonObject mapJsonObject = element.getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,mapJsonObject,2679,mapJsonObject.has(key));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNonEmptyMapSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonEmptyMapSerialization");
        Type mapType = new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        Map<java.lang.String, java.lang.String> myMap = new HashMap<java.lang.String, java.lang.String>();
        String key = "foo";
        myMap.put(key, "value1");
        Gson gson = new Gson();
        JsonElement element = gson.toJsonTree(myMap, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2678,element,2677,element.isJsonObject());
        JsonObject mapJsonObject = element.getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,mapJsonObject,2679,mapJsonObject.has(key));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNonEmptyMapSerialization_literalMutation2215() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonEmptyMapSerialization_literalMutation2215");
        Type mapType = new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        Map<java.lang.String, java.lang.String> myMap = new HashMap<java.lang.String, java.lang.String>();
        String key = "key1";
        myMap.put(key, "foo");
        Gson gson = new Gson();
        JsonElement element = gson.toJsonTree(myMap, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2678,element,2677,element.isJsonObject());
        JsonObject mapJsonObject = element.getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,mapJsonObject,2679,mapJsonObject.has(key));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonEmptyMapSerialization_remove1247() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonEmptyMapSerialization_remove1247");
        Type mapType = new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        Map<java.lang.String, java.lang.String> myMap = new HashMap<java.lang.String, java.lang.String>();
        String key = "key1";
        myMap.put(key, "value1");
        Gson gson = new Gson();
        JsonElement element = gson.toJsonTree(myMap, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2678,element,2677,element.isJsonObject());
        JsonObject mapJsonObject = element.getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,mapJsonObject,2679,mapJsonObject.has(key));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNonEmptyMapSerialization_remove1248() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNonEmptyMapSerialization_remove1248");
        Type mapType = new TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        Map<java.lang.String, java.lang.String> myMap = new HashMap<java.lang.String, java.lang.String>();
        String key = "key1";
        Gson gson = new Gson();
        JsonElement element = gson.toJsonTree(myMap, mapType);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2678,element,2677,element.isJsonObject());
        JsonObject mapJsonObject = element.getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2680,mapJsonObject,2679,mapJsonObject.has(key));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

