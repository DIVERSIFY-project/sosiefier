package com.google.gson.functional;

import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import org.junit.Test;
import junit.framework.TestCase;
import com.google.gson.common.TestTypes;
import java.util.TreeMap;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Functional test for Json serialization and deserialization for Maps
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class MapTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    @Test(timeout = 1000)
    public void testMapSerialization_add1256() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerialization_add1256");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("a", 1);
        map.put("a", 1);
        map.put("b", 2);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,json,1836,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,json,1838,json.contains("\"b\":2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerialization_add1257() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerialization_add1257");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("b", 2);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,json,1836,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,json,1838,json.contains("\"b\":2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerialization_add1258() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerialization_add1258");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("a", 1);
        map.put("b", 2);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,json,1836,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,json,1838,json.contains("\"b\":2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerialization");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("foo", 1);
        map.put("b", 2);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,json,1836,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,json,1838,json.contains("\"b\":2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerialization_literalMutation1500() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerialization_literalMutation1500");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("a", 0);
        map.put("b", 2);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,json,1836,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,json,1838,json.contains("\"b\":2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerialization_literalMutation1501() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerialization_literalMutation1501");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("a", 1);
        map.put("foo", 2);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,json,1836,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,json,1838,json.contains("\"b\":2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerialization_literalMutation1502() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerialization_literalMutation1502");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("a", 1);
        map.put("b", 3);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,json,1836,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,json,1838,json.contains("\"b\":2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerialization_remove1060() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerialization_remove1060");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("b", 2);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,json,1836,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,json,1838,json.contains("\"b\":2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerialization_remove1061() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerialization_remove1061");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("b", 2);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,json,1836,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,json,1838,json.contains("\"b\":2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerialization_remove1062() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerialization_remove1062");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("a", 1);
        map.put("b", 2);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1837,json,1836,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1839,json,1838,json.contains("\"b\":2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserialization_add1242() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserialization_add1242");
        String json = "{\"a\":1,\"b\":2}";
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> target = gson.fromJson(json, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1806,target.get("a"),1805,target.get("a").intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1808,target.get("b"),1807,target.get("b").intValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserialization");
        String json = "foo";
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> target = gson.fromJson(json, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1806,target.get("a"),1805,target.get("a").intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1808,target.get("b"),1807,target.get("b").intValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserialization_remove1048() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserialization_remove1048");
        String json = "{\"a\":1,\"b\":2}";
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> target = gson.fromJson(json, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1806,target.get("a"),1805,target.get("a").intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1808,target.get("b"),1807,target.get("b").intValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testRawMapSerialization_add1283() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawMapSerialization_add1283");
        Map map = new LinkedHashMap();
        map.put("a", 1);
        map.put("a", 1);
        map.put("b", "string");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,json,1856,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,json,1858,json.contains("\"b\":\"string\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testRawMapSerialization_add1284() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawMapSerialization_add1284");
        Map map = new LinkedHashMap();
        map.put("a", 1);
        map.put("b", "string");
        map.put("b", "string");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,json,1856,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,json,1858,json.contains("\"b\":\"string\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "foo" , "rawtypes" })
    public void testRawMapSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawMapSerialization");
        Map map = new LinkedHashMap();
        map.put("a", 1);
        map.put("b", "string");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,json,1856,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,json,1858,json.contains("\"b\":\"string\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "foo" })
    public void testRawMapSerialization_literalMutation1536() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawMapSerialization_literalMutation1536");
        Map map = new LinkedHashMap();
        map.put("a", 1);
        map.put("b", "string");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,json,1856,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,json,1858,json.contains("\"b\":\"string\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testRawMapSerialization_literalMutation1537() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawMapSerialization_literalMutation1537");
        Map map = new LinkedHashMap();
        map.put("foo", 1);
        map.put("b", "string");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,json,1856,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,json,1858,json.contains("\"b\":\"string\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testRawMapSerialization_literalMutation1538() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawMapSerialization_literalMutation1538");
        Map map = new LinkedHashMap();
        map.put("a", 2);
        map.put("b", "string");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,json,1856,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,json,1858,json.contains("\"b\":\"string\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testRawMapSerialization_literalMutation1539() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawMapSerialization_literalMutation1539");
        Map map = new LinkedHashMap();
        map.put("a", 1);
        map.put("foo", "string");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,json,1856,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,json,1858,json.contains("\"b\":\"string\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    public void testRawMapSerialization_literalMutation1540() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawMapSerialization_literalMutation1540");
        Map map = new LinkedHashMap();
        map.put("a", 1);
        map.put("b", "foo");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,json,1856,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,json,1858,json.contains("\"b\":\"string\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testRawMapSerialization_remove1087() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawMapSerialization_remove1087");
        Map map = new LinkedHashMap();
        map.put("b", "string");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,json,1856,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,json,1858,json.contains("\"b\":\"string\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unchecked" , "rawtypes" })
    @Test(timeout = 1000)
    public void testRawMapSerialization_remove1088() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRawMapSerialization_remove1088");
        Map map = new LinkedHashMap();
        map.put("b", "string");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1857,json,1856,json.contains("\"a\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1859,json,1858,json.contains("\"b\":\"string\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationEmpty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationEmpty");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1822,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationEmpty_remove1063() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationEmpty_remove1063");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1822,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserializationEmpty_add1243() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationEmpty_add1243");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("{}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1777,map,1776,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapDeserializationEmpty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationEmpty");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("foo", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1777,map,1776,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserializationEmpty_remove1049() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationEmpty_remove1049");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("{}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1777,map,1776,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerializationWithNullValue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValue");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithNullValue_add1264() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValue_add1264");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", null);
        map.put("abc", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithNullValue_add1265() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValue_add1265");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerializationWithNullValue_literalMutation1507() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValue_literalMutation1507");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("foo", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithNullValue_remove1068() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValue_remove1068");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithNullValue_remove1069() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValue_remove1069");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1825,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserializationWithNullValue_add1248() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithNullValue_add1248");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("{\"abc\":null}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1797,map,1796,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1799,map,1798,map.get("abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapDeserializationWithNullValue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithNullValue");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("foo", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1797,map,1796,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1799,map,1798,map.get("abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserializationWithNullValue_remove1052() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithNullValue_remove1052");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("{\"abc\":null}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1797,map,1796,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1799,map,1798,map.get("abc"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerializationWithNullValueButSerializeNulls() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValueButSerializeNulls");
        gson = new GsonBuilder().serializeNulls().create();
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithNullValueButSerializeNulls_add1266() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValueButSerializeNulls_add1266");
        gson = new GsonBuilder().serializeNulls().create();
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", null);
        map.put("abc", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithNullValueButSerializeNulls_add1267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValueButSerializeNulls_add1267");
        gson = new GsonBuilder().serializeNulls().create();
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerializationWithNullValueButSerializeNulls_literalMutation1509() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValueButSerializeNulls_literalMutation1509");
        gson = new GsonBuilder().serializeNulls().create();
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("foo", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithNullValueButSerializeNulls_remove1070() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValueButSerializeNulls_remove1070");
        gson = new GsonBuilder().serializeNulls().create();
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithNullValueButSerializeNulls_remove1071() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValueButSerializeNulls_remove1071");
        gson = new GsonBuilder().serializeNulls().create();
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1826,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerializationWithNullKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullKey");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put(null, 123);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1824,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithNullKey_add1262() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullKey_add1262");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put(null, 123);
        map.put(null, 123);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1824,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithNullKey_add1263() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullKey_add1263");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put(null, 123);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1824,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerializationWithNullKey_literalMutation1506() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullKey_literalMutation1506");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put(null, 122);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1824,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithNullKey_remove1066() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullKey_remove1066");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1824,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithNullKey_remove1067() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullKey_remove1067");
        Map<java.lang.String, java.lang.Integer> map = new LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put(null, 123);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1824,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserializationWithNullKey_add1247() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithNullKey_add1247");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("{\"null\":123}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,map,1784,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1787,map.get("null"),1786,map.get("null").intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1789,map,1788,map.get(null));
        map = gson.fromJson("{null:123}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1791,map,1790,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1793,map.get("null"),1792,map.get("null").intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1795,map,1794,map.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapDeserializationWithNullKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithNullKey");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("foo", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,map,1784,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1787,map.get("null"),1786,map.get("null").intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1789,map,1788,map.get(null));
        map = gson.fromJson("{null:123}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1791,map,1790,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1793,map.get("null"),1792,map.get("null").intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1795,map,1794,map.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapDeserializationWithNullKey_literalMutation1486() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithNullKey_literalMutation1486");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("{\"null\":123}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,map,1784,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1787,map.get("null"),1786,map.get("null").intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1789,map,1788,map.get(null));
        map = gson.fromJson("foo", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1791,map,1790,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1793,map.get("null"),1792,map.get("null").intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1795,map,1794,map.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserializationWithNullKey_remove1051() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithNullKey_remove1051");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {        }.getType();
        Map<java.lang.String, java.lang.Integer> map = gson.fromJson("{\"null\":123}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1785,map,1784,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1787,map.get("null"),1786,map.get("null").intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1789,map,1788,map.get(null));
        map = gson.fromJson("{null:123}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1791,map,1790,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1793,map.get("null"),1792,map.get("null").intValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1795,map,1794,map.get(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerializationWithIntegerKeys() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithIntegerKeys");
        Map<java.lang.Integer, java.lang.String> map = new LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1823,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithIntegerKeys_add1260() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithIntegerKeys_add1260");
        Map<java.lang.Integer, java.lang.String> map = new LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        map.put(123, "456");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1823,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithIntegerKeys_add1261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithIntegerKeys_add1261");
        Map<java.lang.Integer, java.lang.String> map = new LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1823,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerializationWithIntegerKeys_literalMutation1503() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithIntegerKeys_literalMutation1503");
        Map<java.lang.Integer, java.lang.String> map = new LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(124, "456");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1823,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerializationWithIntegerKeys_literalMutation1504() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithIntegerKeys_literalMutation1504");
        Map<java.lang.Integer, java.lang.String> map = new LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "foo");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1823,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithIntegerKeys_remove1064() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithIntegerKeys_remove1064");
        Map<java.lang.Integer, java.lang.String> map = new LinkedHashMap<java.lang.Integer, java.lang.String>();
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1823,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithIntegerKeys_remove1065() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithIntegerKeys_remove1065");
        Map<java.lang.Integer, java.lang.String> map = new LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1823,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserializationWithIntegerKeys_add1246() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithIntegerKeys_add1246");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {        }.getType();
        Map<java.lang.Integer, java.lang.String> map = gson.fromJson("{\"123\":\"456\"}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1779,map,1778,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1781,map,1780,map.containsKey(123));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1783,map,1782,map.get(123));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapDeserializationWithIntegerKeys() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithIntegerKeys");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {        }.getType();
        Map<java.lang.Integer, java.lang.String> map = gson.fromJson("foo", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1779,map,1778,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1781,map,1780,map.containsKey(123));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1783,map,1782,map.get(123));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserializationWithIntegerKeys_remove1050() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithIntegerKeys_remove1050");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {        }.getType();
        Map<java.lang.Integer, java.lang.String> map = gson.fromJson("{\"123\":\"456\"}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1779,map,1778,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1781,map,1780,map.containsKey(123));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1783,map,1782,map.get(123));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHashMapDeserialization_add1236() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashMapDeserialization_add1236");
        Type typeOfMap = new TypeToken<java.util.HashMap<java.lang.Integer, java.lang.String>>() {        }.getType();
        HashMap<java.lang.Integer, java.lang.String> map = gson.fromJson("{\"123\":\"456\"}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,map,1762,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1765,map,1764,map.containsKey(123));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1767,map,1766,map.get(123));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashMapDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashMapDeserialization");
        Type typeOfMap = new TypeToken<java.util.HashMap<java.lang.Integer, java.lang.String>>() {        }.getType();
        HashMap<java.lang.Integer, java.lang.String> map = gson.fromJson("foo", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,map,1762,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1765,map,1764,map.containsKey(123));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1767,map,1766,map.get(123));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testHashMapDeserialization_remove1042() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashMapDeserialization_remove1042");
        Type typeOfMap = new TypeToken<java.util.HashMap<java.lang.Integer, java.lang.String>>() {        }.getType();
        HashMap<java.lang.Integer, java.lang.String> map = gson.fromJson("{\"123\":\"456\"}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1763,map,1762,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1765,map,1764,map.containsKey(123));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1767,map,1766,map.get(123));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSortedMap_add1293() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortedMap_add1293");
        Type typeOfMap = new TypeToken<java.util.SortedMap<java.lang.Integer, java.lang.String>>() {        }.getType();
        SortedMap<java.lang.Integer, java.lang.String> map = gson.fromJson("{\"123\":\"456\"}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsKey(123));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.get(123));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSortedMap() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortedMap");
        Type typeOfMap = new TypeToken<java.util.SortedMap<java.lang.Integer, java.lang.String>>() {        }.getType();
        SortedMap<java.lang.Integer, java.lang.String> map = gson.fromJson("foo", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsKey(123));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.get(123));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSortedMap_remove1097() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortedMap_remove1097");
        Type typeOfMap = new TypeToken<java.util.SortedMap<java.lang.Integer, java.lang.String>>() {        }.getType();
        SortedMap<java.lang.Integer, java.lang.String> map = gson.fromJson("{\"123\":\"456\"}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1878,map,1877,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1880,map,1879,map.containsKey(123));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1882,map,1881,map.get(123));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedMapSubclassSerialization_add1281() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedMapSubclassSerialization_add1281");
        MyParameterizedMap<java.lang.String, java.lang.String> map = new MyParameterizedMap<java.lang.String, java.lang.String>(10);
        map.put("a", "b");
        map.put("a", "b");
        Type type = new TypeToken<MyParameterizedMap<java.lang.String, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,json,1854,json.contains("\"a\":\"b\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedMapSubclassSerialization_add1282() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedMapSubclassSerialization_add1282");
        MyParameterizedMap<java.lang.String, java.lang.String> map = new MyParameterizedMap<java.lang.String, java.lang.String>(10);
        map.put("a", "b");
        Type type = new TypeToken<MyParameterizedMap<java.lang.String, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,json,1854,json.contains("\"a\":\"b\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedMapSubclassSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedMapSubclassSerialization");
        MyParameterizedMap<java.lang.String, java.lang.String> map = new MyParameterizedMap<java.lang.String, java.lang.String>(9);
        map.put("a", "b");
        Type type = new TypeToken<MyParameterizedMap<java.lang.String, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,json,1854,json.contains("\"a\":\"b\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedMapSubclassSerialization_literalMutation1533() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedMapSubclassSerialization_literalMutation1533");
        MyParameterizedMap<java.lang.String, java.lang.String> map = new MyParameterizedMap<java.lang.String, java.lang.String>(10);
        map.put("foo", "b");
        Type type = new TypeToken<MyParameterizedMap<java.lang.String, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,json,1854,json.contains("\"a\":\"b\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedMapSubclassSerialization_literalMutation1534() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedMapSubclassSerialization_literalMutation1534");
        MyParameterizedMap<java.lang.String, java.lang.String> map = new MyParameterizedMap<java.lang.String, java.lang.String>(10);
        map.put("a", "foo");
        Type type = new TypeToken<MyParameterizedMap<java.lang.String, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,json,1854,json.contains("\"a\":\"b\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedMapSubclassSerialization_remove1085() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedMapSubclassSerialization_remove1085");
        MyParameterizedMap<java.lang.String, java.lang.String> map = new MyParameterizedMap<java.lang.String, java.lang.String>(10);
        Type type = new TypeToken<MyParameterizedMap<java.lang.String, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,json,1854,json.contains("\"a\":\"b\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedMapSubclassSerialization_remove1086() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedMapSubclassSerialization_remove1086");
        MyParameterizedMap<java.lang.String, java.lang.String> map = new MyParameterizedMap<java.lang.String, java.lang.String>(10);
        map.put("a", "b");
        Type type = new TypeToken<MyParameterizedMap<java.lang.String, java.lang.String>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1855,json,1854,json.contains("\"a\":\"b\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "unused" , "serial" })
    private static class MyParameterizedMap<K, V> extends LinkedHashMap<K, V> {
        final int foo;

        MyParameterizedMap(int foo) {
            this.foo = foo;
        }
    }

    @Test(timeout = 1000)
    public void testMapSubclassSerialization_add1276() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSubclassSerialization_add1276");
        MyMap map = new MyMap();
        map.put("a", "b");
        map.put("a", "b");
        String json = gson.toJson(map, MyMap.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1849,json,1848,json.contains("\"a\":\"b\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSubclassSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSubclassSerialization");
        MyMap map = new MyMap();
        map.put("foo", "b");
        String json = gson.toJson(map, MyMap.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1849,json,1848,json.contains("\"a\":\"b\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSubclassSerialization_literalMutation1524() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSubclassSerialization_literalMutation1524");
        MyMap map = new MyMap();
        map.put("a", "foo");
        String json = gson.toJson(map, MyMap.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1849,json,1848,json.contains("\"a\":\"b\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSubclassSerialization_remove1080() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSubclassSerialization_remove1080");
        MyMap map = new MyMap();
        String json = gson.toJson(map, MyMap.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1849,json,1848,json.contains("\"a\":\"b\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapStandardSubclassDeserialization_add1274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapStandardSubclassDeserialization_add1274");
        String json = "{a:\'1\',b:\'2\'}";
        Type type = new TypeToken<java.util.LinkedHashMap<java.lang.String, java.lang.String>>() {        }.getType();
        LinkedHashMap<java.lang.String, java.lang.Integer> map = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1841,map,1840,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1843,map,1842,map.get("b"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapStandardSubclassDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapStandardSubclassDeserialization");
        String json = "foo";
        Type type = new TypeToken<java.util.LinkedHashMap<java.lang.String, java.lang.String>>() {        }.getType();
        LinkedHashMap<java.lang.String, java.lang.Integer> map = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1841,map,1840,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1843,map,1842,map.get("b"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapStandardSubclassDeserialization_remove1078() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapStandardSubclassDeserialization_remove1078");
        String json = "{a:\'1\',b:\'2\'}";
        Type type = new TypeToken<java.util.LinkedHashMap<java.lang.String, java.lang.String>>() {        }.getType();
        LinkedHashMap<java.lang.String, java.lang.Integer> map = gson.fromJson(json, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1841,map,1840,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1843,map,1842,map.get("b"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSubclassDeserialization_add1275() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSubclassDeserialization_add1275");
        Gson gson = new GsonBuilder().registerTypeAdapter(MyMap.class, new com.google.gson.InstanceCreator<MyMap>() {
            public MyMap createInstance(Type type) {
                return new MyMap();
            }
        }).create();
        String json = "{\"a\":1,\"b\":2}";
        MyMap map = gson.fromJson(json, MyMap.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1845,map,1844,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1847,map,1846,map.get("b"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSubclassDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSubclassDeserialization");
        Gson gson = new GsonBuilder().registerTypeAdapter(MyMap.class, new com.google.gson.InstanceCreator<MyMap>() {
            public MyMap createInstance(Type type) {
                return new MyMap();
            }
        }).create();
        String json = "foo";
        MyMap map = gson.fromJson(json, MyMap.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1845,map,1844,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1847,map,1846,map.get("b"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSubclassDeserialization_remove1079() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSubclassDeserialization_remove1079");
        Gson gson = new GsonBuilder().registerTypeAdapter(MyMap.class, new com.google.gson.InstanceCreator<MyMap>() {
            public MyMap createInstance(Type type) {
                return new MyMap();
            }
        }).create();
        String json = "{\"a\":1,\"b\":2}";
        MyMap map = gson.fromJson(json, MyMap.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1845,map,1844,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1847,map,1846,map.get("b"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializerForSpecificMapType_add1227() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_add1227");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("one", 1L);
        src.put("two", 2L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializerForSpecificMapType_add1228() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_add1228");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("one", 1L);
        src.put("two", 2L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializerForSpecificMapType_add1229() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_add1229");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("one", 1L);
        src.put("one", 1L);
        src.put("two", 2L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializerForSpecificMapType_add1230() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_add1230");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("one", 1L);
        src.put("two", 2L);
        src.put("two", 2L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializerForSpecificMapType_add1231() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_add1231");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("one", 1L);
        src.put("two", 2L);
        src.put("three", 3L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializerForSpecificMapType() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("foo", 1L);
        src.put("two", 2L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializerForSpecificMapType_literalMutation1441() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_literalMutation1441");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("one", 0L);
        src.put("two", 2L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializerForSpecificMapType_literalMutation1442() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_literalMutation1442");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("one", 1L);
        src.put("foo", 2L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializerForSpecificMapType_literalMutation1443() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_literalMutation1443");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("one", 1L);
        src.put("two", 1L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializerForSpecificMapType_literalMutation1444() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_literalMutation1444");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("one", 1L);
        src.put("two", 2L);
        src.put("foo", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCustomSerializerForSpecificMapType_literalMutation1445() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_literalMutation1445");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("one", 1L);
        src.put("two", 2L);
        src.put("three", 2L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializerForSpecificMapType_remove1033() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_remove1033");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("one", 1L);
        src.put("two", 2L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializerForSpecificMapType_remove1034() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_remove1034");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("one", 1L);
        src.put("two", 2L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializerForSpecificMapType_remove1035() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_remove1035");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("two", 2L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializerForSpecificMapType_remove1036() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_remove1036");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("two", 2L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testCustomSerializerForSpecificMapType_remove1037() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCustomSerializerForSpecificMapType_remove1037");
        Type type = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Long.class);
        Gson gson = new GsonBuilder().registerTypeAdapter(type, new JsonSerializer<java.util.Map<java.lang.String, java.lang.Long>>() {
            public JsonElement serialize(Map<java.lang.String, java.lang.Long> src, Type typeOfSrc, JsonSerializationContext context) {
                com.google.gson.JsonArray array = new com.google.gson.JsonArray();
                for (long value : src.values()) {
                    array.add(new com.google.gson.JsonPrimitive(value));
                }
                return array;
            }
        }).create();
        Map<java.lang.String, java.lang.Long> src = new LinkedHashMap<java.lang.String, java.lang.Long>();
        src.put("two", 2L);
        src.put("three", 3L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,gson,1751,gson.toJson(src, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
private static class ClassWithAMap {
        Map<java.lang.String, java.lang.String> map = new TreeMap<java.lang.String, java.lang.String>();
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
public void testMapSerializationWithNullValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValues");
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name1", null);
        target.map.put("name2", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,json,1827,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,json,1829,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
@Test(timeout = 1000)
    public void testMapSerializationWithNullValues_add1268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValues_add1268");
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name1", null);
        target.map.put("name1", null);
        target.map.put("name2", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,json,1827,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,json,1829,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
@Test(timeout = 1000)
    public void testMapSerializationWithNullValues_add1269() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValues_add1269");
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name1", null);
        target.map.put("name2", "value2");
        target.map.put("name2", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,json,1827,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,json,1829,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
public void testMapSerializationWithNullValues_literalMutation1511() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValues_literalMutation1511");
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("foo", null);
        target.map.put("name2", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,json,1827,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,json,1829,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
public void testMapSerializationWithNullValues_literalMutation1513() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValues_literalMutation1513");
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name1", null);
        target.map.put("foo", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,json,1827,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,json,1829,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
public void testMapSerializationWithNullValues_literalMutation1514() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValues_literalMutation1514");
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name1", null);
        target.map.put("name2", "foo");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,json,1827,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,json,1829,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
@Test(timeout = 1000)
    public void testMapSerializationWithNullValues_remove1072() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValues_remove1072");
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name2", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,json,1827,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,json,1829,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
@Test(timeout = 1000)
    public void testMapSerializationWithNullValues_remove1073() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValues_remove1073");
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name2", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1828,json,1827,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1830,json,1829,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
public void testMapSerializationWithNullValuesSerialized() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValuesSerialized");
        Gson gson = new GsonBuilder().serializeNulls().create();
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name1", null);
        target.map.put("name2", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,json,1831,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,json,1833,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
@Test(timeout = 1000)
    public void testMapSerializationWithNullValuesSerialized_add1270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValuesSerialized_add1270");
        Gson gson = new GsonBuilder().serializeNulls().create();
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name1", null);
        target.map.put("name1", null);
        target.map.put("name2", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,json,1831,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,json,1833,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
@Test(timeout = 1000)
    public void testMapSerializationWithNullValuesSerialized_add1271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValuesSerialized_add1271");
        Gson gson = new GsonBuilder().serializeNulls().create();
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name1", null);
        target.map.put("name2", "value2");
        target.map.put("name2", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,json,1831,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,json,1833,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
public void testMapSerializationWithNullValuesSerialized_literalMutation1515() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValuesSerialized_literalMutation1515");
        Gson gson = new GsonBuilder().serializeNulls().create();
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("foo", null);
        target.map.put("name2", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,json,1831,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,json,1833,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
public void testMapSerializationWithNullValuesSerialized_literalMutation1517() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValuesSerialized_literalMutation1517");
        Gson gson = new GsonBuilder().serializeNulls().create();
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name1", null);
        target.map.put("foo", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,json,1831,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,json,1833,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
public void testMapSerializationWithNullValuesSerialized_literalMutation1518() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValuesSerialized_literalMutation1518");
        Gson gson = new GsonBuilder().serializeNulls().create();
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name1", null);
        target.map.put("name2", "foo");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,json,1831,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,json,1833,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
@Test(timeout = 1000)
    public void testMapSerializationWithNullValuesSerialized_remove1074() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValuesSerialized_remove1074");
        Gson gson = new GsonBuilder().serializeNulls().create();
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name2", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,json,1831,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,json,1833,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
@Test(timeout = 1000)
    public void testMapSerializationWithNullValuesSerialized_remove1075() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithNullValuesSerialized_remove1075");
        Gson gson = new GsonBuilder().serializeNulls().create();
        ClassWithAMap target = new ClassWithAMap();
        target.map.put("name2", "value2");
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1832,json,1831,json.contains("name1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1834,json,1833,json.contains("name2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerializationWithWildcardValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithWildcardValues");
        Map<java.lang.String, ? extends java.util.Collection<? extends java.lang.Integer>> map = new LinkedHashMap<java.lang.String, java.util.Collection<java.lang.Integer>>();
        map.put("test", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, ? extends java.util.Collection<? extends java.lang.Integer>>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1835,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithWildcardValues_add1272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithWildcardValues_add1272");
        Map<java.lang.String, ? extends java.util.Collection<? extends java.lang.Integer>> map = new LinkedHashMap<java.lang.String, java.util.Collection<java.lang.Integer>>();
        map.put("test", null);
        map.put("test", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, ? extends java.util.Collection<? extends java.lang.Integer>>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1835,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithWildcardValues_add1273() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithWildcardValues_add1273");
        Map<java.lang.String, ? extends java.util.Collection<? extends java.lang.Integer>> map = new LinkedHashMap<java.lang.String, java.util.Collection<java.lang.Integer>>();
        map.put("test", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, ? extends java.util.Collection<? extends java.lang.Integer>>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1835,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapSerializationWithWildcardValues_literalMutation1519() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithWildcardValues_literalMutation1519");
        Map<java.lang.String, ? extends java.util.Collection<? extends java.lang.Integer>> map = new LinkedHashMap<java.lang.String, java.util.Collection<java.lang.Integer>>();
        map.put("foo", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, ? extends java.util.Collection<? extends java.lang.Integer>>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1835,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithWildcardValues_remove1076() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithWildcardValues_remove1076");
        Map<java.lang.String, ? extends java.util.Collection<? extends java.lang.Integer>> map = new LinkedHashMap<java.lang.String, java.util.Collection<java.lang.Integer>>();
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, ? extends java.util.Collection<? extends java.lang.Integer>>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1835,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapSerializationWithWildcardValues_remove1077() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapSerializationWithWildcardValues_remove1077");
        Map<java.lang.String, ? extends java.util.Collection<? extends java.lang.Integer>> map = new LinkedHashMap<java.lang.String, java.util.Collection<java.lang.Integer>>();
        map.put("test", null);
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, ? extends java.util.Collection<? extends java.lang.Integer>>>() {        }.getType();
        String json = gson.toJson(map, typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1835,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserializationWithWildcardValues_add1249() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithWildcardValues_add1249");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, ? extends java.lang.Long>>() {        }.getType();
        Map<java.lang.String, ? extends java.lang.Long> map = gson.fromJson("{\"test\":123}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1801,map,1800,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,new java.lang.Long(123L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1804,map,1803,map.get("test"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapDeserializationWithWildcardValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithWildcardValues");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, ? extends java.lang.Long>>() {        }.getType();
        Map<java.lang.String, ? extends java.lang.Long> map = gson.fromJson("foo", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1801,map,1800,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,new java.lang.Long(123L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1804,map,1803,map.get("test"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserializationWithWildcardValues_remove1053() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithWildcardValues_remove1053");
        Type typeOfMap = new TypeToken<java.util.Map<java.lang.String, ? extends java.lang.Long>>() {        }.getType();
        Map<java.lang.String, ? extends java.lang.Long> map = gson.fromJson("{\"test\":123}", typeOfMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1801,map,1800,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,new java.lang.Long(123L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1804,map,1803,map.get("test"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class MyMap extends LinkedHashMap<java.lang.String, java.lang.String> {
        private static final long serialVersionUID = 1L;

        @SuppressWarnings(value = "unused")
        int foo = 10;
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
@Test(timeout = 1000)
    public void testMapOfMapSerialization_add1253() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapSerialization_add1253");
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>();
        Map<java.lang.String, java.lang.String> nestedMap = new HashMap<java.lang.String, java.lang.String>();
        nestedMap.put("1", "1");
        nestedMap.put("1", "1");
        nestedMap.put("2", "2");
        map.put("nestedMap", nestedMap);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,json,1816,json.contains("nestedMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,json,1818,json.contains("\"1\":\"1\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,json,1820,json.contains("\"2\":\"2\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
@Test(timeout = 1000)
    public void testMapOfMapSerialization_add1254() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapSerialization_add1254");
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>();
        Map<java.lang.String, java.lang.String> nestedMap = new HashMap<java.lang.String, java.lang.String>();
        nestedMap.put("1", "1");
        nestedMap.put("2", "2");
        nestedMap.put("2", "2");
        map.put("nestedMap", nestedMap);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,json,1816,json.contains("nestedMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,json,1818,json.contains("\"1\":\"1\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,json,1820,json.contains("\"2\":\"2\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
@Test(timeout = 1000)
    public void testMapOfMapSerialization_add1255() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapSerialization_add1255");
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>();
        Map<java.lang.String, java.lang.String> nestedMap = new HashMap<java.lang.String, java.lang.String>();
        nestedMap.put("1", "1");
        nestedMap.put("2", "2");
        map.put("nestedMap", nestedMap);
        map.put("nestedMap", nestedMap);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,json,1816,json.contains("nestedMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,json,1818,json.contains("\"1\":\"1\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,json,1820,json.contains("\"2\":\"2\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
public void testMapOfMapSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapSerialization");
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>();
        Map<java.lang.String, java.lang.String> nestedMap = new HashMap<java.lang.String, java.lang.String>();
        nestedMap.put("foo", "1");
        nestedMap.put("2", "2");
        map.put("nestedMap", nestedMap);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,json,1816,json.contains("nestedMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,json,1818,json.contains("\"1\":\"1\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,json,1820,json.contains("\"2\":\"2\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
public void testMapOfMapSerialization_literalMutation1495() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapSerialization_literalMutation1495");
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>();
        Map<java.lang.String, java.lang.String> nestedMap = new HashMap<java.lang.String, java.lang.String>();
        nestedMap.put("1", "foo");
        nestedMap.put("2", "2");
        map.put("nestedMap", nestedMap);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,json,1816,json.contains("nestedMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,json,1818,json.contains("\"1\":\"1\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,json,1820,json.contains("\"2\":\"2\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
public void testMapOfMapSerialization_literalMutation1496() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapSerialization_literalMutation1496");
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>();
        Map<java.lang.String, java.lang.String> nestedMap = new HashMap<java.lang.String, java.lang.String>();
        nestedMap.put("1", "1");
        nestedMap.put("foo", "2");
        map.put("nestedMap", nestedMap);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,json,1816,json.contains("nestedMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,json,1818,json.contains("\"1\":\"1\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,json,1820,json.contains("\"2\":\"2\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
public void testMapOfMapSerialization_literalMutation1497() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapSerialization_literalMutation1497");
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>();
        Map<java.lang.String, java.lang.String> nestedMap = new HashMap<java.lang.String, java.lang.String>();
        nestedMap.put("1", "1");
        nestedMap.put("2", "foo");
        map.put("nestedMap", nestedMap);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,json,1816,json.contains("nestedMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,json,1818,json.contains("\"1\":\"1\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,json,1820,json.contains("\"2\":\"2\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
public void testMapOfMapSerialization_literalMutation1498() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapSerialization_literalMutation1498");
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>();
        Map<java.lang.String, java.lang.String> nestedMap = new HashMap<java.lang.String, java.lang.String>();
        nestedMap.put("1", "1");
        nestedMap.put("2", "2");
        map.put("foo", nestedMap);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,json,1816,json.contains("nestedMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,json,1818,json.contains("\"1\":\"1\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,json,1820,json.contains("\"2\":\"2\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
@Test(timeout = 1000)
    public void testMapOfMapSerialization_remove1057() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapSerialization_remove1057");
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>();
        Map<java.lang.String, java.lang.String> nestedMap = new HashMap<java.lang.String, java.lang.String>();
        nestedMap.put("2", "2");
        map.put("nestedMap", nestedMap);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,json,1816,json.contains("nestedMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,json,1818,json.contains("\"1\":\"1\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,json,1820,json.contains("\"2\":\"2\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
@Test(timeout = 1000)
    public void testMapOfMapSerialization_remove1058() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapSerialization_remove1058");
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>();
        Map<java.lang.String, java.lang.String> nestedMap = new HashMap<java.lang.String, java.lang.String>();
        nestedMap.put("2", "2");
        map.put("nestedMap", nestedMap);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,json,1816,json.contains("nestedMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,json,1818,json.contains("\"1\":\"1\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,json,1820,json.contains("\"2\":\"2\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
@Test(timeout = 1000)
    public void testMapOfMapSerialization_remove1059() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapSerialization_remove1059");
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = new HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>();
        Map<java.lang.String, java.lang.String> nestedMap = new HashMap<java.lang.String, java.lang.String>();
        nestedMap.put("2", "2");
        map.put("nestedMap", nestedMap);
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,json,1816,json.contains("nestedMap"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,json,1818,json.contains("\"1\":\"1\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,json,1820,json.contains("\"2\":\"2\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
@Test(timeout = 1000)
    public void testMapOfMapDeserialization_add1252() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapDeserialization_add1252");
        String json = "{nestedMap:{\'2\':\'2\',\'1\':\'1\'}}";
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = gson.fromJson(json, type);
        Map<java.lang.String, java.lang.String> nested = map.get("nestedMap");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1813,nested,1812,nested.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1815,nested,1814,nested.get("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
public void testMapOfMapDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapDeserialization");
        String json = "foo";
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = gson.fromJson(json, type);
        Map<java.lang.String, java.lang.String> nested = map.get("nestedMap");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1813,nested,1812,nested.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1815,nested,1814,nested.get("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
public void testMapOfMapDeserialization_literalMutation1493() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapDeserialization_literalMutation1493");
        String json = "{nestedMap:{\'2\':\'2\',\'1\':\'1\'}}";
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = gson.fromJson(json, type);
        Map<java.lang.String, java.lang.String> nested = map.get("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1813,nested,1812,nested.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1815,nested,1814,nested.get("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=95
     */
@Test(timeout = 1000)
    public void testMapOfMapDeserialization_remove1056() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfMapDeserialization_remove1056");
        String json = "{nestedMap:{\'2\':\'2\',\'1\':\'1\'}}";
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = gson.fromJson(json, type);
        Map<java.lang.String, java.lang.String> nested = map.get("nestedMap");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1813,nested,1812,nested.get("1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1815,nested,1814,nested.get("2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=178
     */
@Test(timeout = 1000)
    public void testMapWithQuotes_add1277() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithQuotes_add1277");
        Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("a\"b", "c\"d");
        map.put("a\"b", "c\"d");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=178
     */
public void testMapWithQuotes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithQuotes");
        Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("foo", "c\"d");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=178
     */
public void testMapWithQuotes_literalMutation1526() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithQuotes_literalMutation1526");
        Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        map.put("a\"b", "foo");
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=178
     */
@Test(timeout = 1000)
    public void testMapWithQuotes_remove1081() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithQuotes_remove1081");
        Map<java.lang.String, java.lang.String> map = new HashMap<java.lang.String, java.lang.String>();
        String json = gson.toJson(map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1850,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From issue 227.
     */
@Test(timeout = 1000)
    public void testWriteMapsWithEmptyStringKey_add1297() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMapsWithEmptyStringKey_add1297");
        Map<java.lang.String, java.lang.Boolean> map = new HashMap<java.lang.String, java.lang.Boolean>();
        map.put("", true);
        map.put("", true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1887,gson,1886,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From issue 227.
     */
public void testWriteMapsWithEmptyStringKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMapsWithEmptyStringKey");
        Map<java.lang.String, java.lang.Boolean> map = new HashMap<java.lang.String, java.lang.Boolean>();
        map.put("foo", true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1887,gson,1886,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From issue 227.
     */
public void testWriteMapsWithEmptyStringKey_literalMutation1571() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMapsWithEmptyStringKey_literalMutation1571");
        Map<java.lang.String, java.lang.Boolean> map = new HashMap<java.lang.String, java.lang.Boolean>();
        map.put("", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1887,gson,1886,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From issue 227.
     */
@Test(timeout = 1000)
    public void testWriteMapsWithEmptyStringKey_remove1101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWriteMapsWithEmptyStringKey_remove1101");
        Map<java.lang.String, java.lang.Boolean> map = new HashMap<java.lang.String, java.lang.Boolean>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1887,gson,1886,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadMapsWithEmptyStringKey_add1285() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadMapsWithEmptyStringKey_add1285");
        Map<java.lang.String, java.lang.Boolean> map = gson.fromJson("{\"\":true}", new TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1860,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1862,map,1861,map.get(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReadMapsWithEmptyStringKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadMapsWithEmptyStringKey");
        Map<java.lang.String, java.lang.Boolean> map = gson.fromJson("foo", new TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1860,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1862,map,1861,map.get(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReadMapsWithEmptyStringKey_remove1089() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReadMapsWithEmptyStringKey_remove1089");
        Map<java.lang.String, java.lang.Boolean> map = gson.fromJson("{\"\":true}", new TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1860,java.lang.Boolean.TRUE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1862,map,1861,map.get(""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
@Test(timeout = 1000)
    public void testSerializeMaps_add1287() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_add1287");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
@Test(timeout = 1000)
    public void testSerializeMaps_add1288() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_add1288");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
@Test(timeout = 1000)
    public void testSerializeMaps_add1289() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_add1289");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
@Test(timeout = 1000)
    public void testSerializeMaps_add1290() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_add1290");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
@Test(timeout = 1000)
    public void testSerializeMaps_add1291() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_add1291");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
@Test(timeout = 1000)
    public void testSerializeMaps_add1292() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_add1292");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
public void testSerializeMaps() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("foo", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
public void testSerializeMaps_literalMutation1553() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_literalMutation1553");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 11);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
public void testSerializeMaps_literalMutation1554() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_literalMutation1554");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("foo", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
public void testSerializeMaps_literalMutation1556() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_literalMutation1556");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("foo", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
public void testSerializeMaps_literalMutation1557() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_literalMutation1557");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 2);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
public void testSerializeMaps_literalMutation1558() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_literalMutation1558");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("foo", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
public void testSerializeMaps_literalMutation1559() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_literalMutation1559");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "foo" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
public void testSerializeMaps_literalMutation1560() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_literalMutation1560");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "foo" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
public void testSerializeMaps_literalMutation1561() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_literalMutation1561");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("foo", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
public void testSerializeMaps_literalMutation1562() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_literalMutation1562");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("foo", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
public void testSerializeMaps_literalMutation1563() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_literalMutation1563");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
@Test(timeout = 1000)
    public void testSerializeMaps_remove1091() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_remove1091");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
@Test(timeout = 1000)
    public void testSerializeMaps_remove1092() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_remove1092");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
@Test(timeout = 1000)
    public void testSerializeMaps_remove1093() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_remove1093");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
@Test(timeout = 1000)
    public void testSerializeMaps_remove1094() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_remove1094");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
@Test(timeout = 1000)
    public void testSerializeMaps_remove1095() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_remove1095");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("test", 1);
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * From bug report http://code.google.com/p/google-gson/issues/detail?id=204
     */
@Test(timeout = 1000)
    public void testSerializeMaps_remove1096() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMaps_remove1096");
        Map<java.lang.String, java.lang.Object> map = new LinkedHashMap<java.lang.String, java.lang.Object>();
        map.put("a", 12);
        map.put("b", null);
        LinkedHashMap<java.lang.String, java.lang.Object> innerMap = new LinkedHashMap<java.lang.String, java.lang.Object>();
        innerMap.put("TestStringArray", new String[]{ "one" , "two" });
        map.put("c", innerMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1866,new com.google.gson.GsonBuilder().serializeNulls().create(),1865,new com.google.gson.GsonBuilder().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1867,("{\n  \"a\": 12,\n  \"b\": null,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1869,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create(),1868,new com.google.gson.GsonBuilder().setPrettyPrinting().serializeNulls().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1871,new com.google.gson.GsonBuilder().create(),1870,new com.google.gson.GsonBuilder().create().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1872,("{\n  \"a\": 12,\n  \"c\": " + ("{\n    \"test\": 1,\n    \"TestStringArray\": " + "[\n      \"one\",\n      \"two\"\n    ]\n  }\n}")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1874,new com.google.gson.GsonBuilder().setPrettyPrinting().create(),1873,new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(map));
        innerMap.put("d", "e");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1876,new com.google.gson.Gson(),1875,new com.google.gson.Gson().toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public final void testInterfaceTypeMap_add1237() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMap_add1237");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        String subTypeJson = new Gson().toJson(subType);
        String expected = (((("{\"bases\":{\"Test\":" + subTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        Gson gsonWithComplexKeys = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = gsonWithComplexKeys.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,json);
        Gson gson = new Gson();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1775,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public final void testInterfaceTypeMap_add1238() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMap_add1238");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        element.addSub("Test", subType);
        String subTypeJson = new Gson().toJson(subType);
        String expected = (((("{\"bases\":{\"Test\":" + subTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        Gson gsonWithComplexKeys = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = gsonWithComplexKeys.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,json);
        Gson gson = new Gson();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1775,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public final void testInterfaceTypeMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMap");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("foo", subType);
        element.addSub("Test", subType);
        String subTypeJson = new Gson().toJson(subType);
        String expected = (((("{\"bases\":{\"Test\":" + subTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        Gson gsonWithComplexKeys = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = gsonWithComplexKeys.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,json);
        Gson gson = new Gson();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1775,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public final void testInterfaceTypeMap_literalMutation1470() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMap_literalMutation1470");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("foo", subType);
        String subTypeJson = new Gson().toJson(subType);
        String expected = (((("{\"bases\":{\"Test\":" + subTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        Gson gsonWithComplexKeys = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = gsonWithComplexKeys.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,json);
        Gson gson = new Gson();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1775,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public final void testInterfaceTypeMap_literalMutation1471() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMap_literalMutation1471");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        String subTypeJson = new Gson().toJson(subType);
        String expected = (((("foo" + subTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        Gson gsonWithComplexKeys = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = gsonWithComplexKeys.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,json);
        Gson gson = new Gson();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1775,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public final void testInterfaceTypeMap_literalMutation1472() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMap_literalMutation1472");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        String subTypeJson = new Gson().toJson(subType);
        String expected = (((("{\"bases\":{\"Test\":" + subTypeJson) + "foo") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        Gson gsonWithComplexKeys = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = gsonWithComplexKeys.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,json);
        Gson gson = new Gson();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1775,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public final void testInterfaceTypeMap_literalMutation1473() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMap_literalMutation1473");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        String subTypeJson = new Gson().toJson(subType);
        String expected = (((("{\"bases\":{\"Test\":" + subTypeJson) + "},") + "foo") + subTypeJson) + "}}";
        Gson gsonWithComplexKeys = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = gsonWithComplexKeys.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,json);
        Gson gson = new Gson();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1775,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public final void testInterfaceTypeMap_literalMutation1474() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMap_literalMutation1474");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        String subTypeJson = new Gson().toJson(subType);
        String expected = (((("{\"bases\":{\"Test\":" + subTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "foo";
        Gson gsonWithComplexKeys = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = gsonWithComplexKeys.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,json);
        Gson gson = new Gson();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1775,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public final void testInterfaceTypeMap_remove1043() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMap_remove1043");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addSub("Test", subType);
        String subTypeJson = new Gson().toJson(subType);
        String expected = (((("{\"bases\":{\"Test\":" + subTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        Gson gsonWithComplexKeys = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = gsonWithComplexKeys.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,json);
        Gson gson = new Gson();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1775,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public final void testInterfaceTypeMap_remove1044() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMap_remove1044");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        String subTypeJson = new Gson().toJson(subType);
        String expected = (((("{\"bases\":{\"Test\":" + subTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        Gson gsonWithComplexKeys = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = gsonWithComplexKeys.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1772,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1773,json);
        Gson gson = new Gson();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1775,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public final void testInterfaceTypeMapWithSerializer_add1239() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMapWithSerializer_add1239");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        Gson tempGson = new Gson();
        String subTypeJson = tempGson.toJson(subType);
        final JsonElement baseTypeJsonElement = tempGson.toJsonTree(subType, TestTypes.Base.class);
        String baseTypeJson = tempGson.toJson(baseTypeJsonElement);
        String expected = (((("{\"bases\":{\"Test\":" + baseTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        JsonSerializer<com.google.gson.common.TestTypes.Base> baseTypeAdapter = new JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, Type typeOfSrc, JsonSerializationContext context) {
                return baseTypeJsonElement;
            }
        };
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        String json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,json);
        gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public final void testInterfaceTypeMapWithSerializer_add1240() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMapWithSerializer_add1240");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        element.addSub("Test", subType);
        Gson tempGson = new Gson();
        String subTypeJson = tempGson.toJson(subType);
        final JsonElement baseTypeJsonElement = tempGson.toJsonTree(subType, TestTypes.Base.class);
        String baseTypeJson = tempGson.toJson(baseTypeJsonElement);
        String expected = (((("{\"bases\":{\"Test\":" + baseTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        JsonSerializer<com.google.gson.common.TestTypes.Base> baseTypeAdapter = new JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, Type typeOfSrc, JsonSerializationContext context) {
                return baseTypeJsonElement;
            }
        };
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        String json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,json);
        gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public final void testInterfaceTypeMapWithSerializer_add1241() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMapWithSerializer_add1241");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        Gson tempGson = new Gson();
        String subTypeJson = tempGson.toJson(subType);
        final JsonElement baseTypeJsonElement = tempGson.toJsonTree(subType, TestTypes.Base.class);
        String baseTypeJson = tempGson.toJson(baseTypeJsonElement);
        String expected = (((("{\"bases\":{\"Test\":" + baseTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        JsonSerializer<com.google.gson.common.TestTypes.Base> baseTypeAdapter = new JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, Type typeOfSrc, JsonSerializationContext context) {
                return baseTypeJsonElement;
            }
        };
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        String json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,json);
        gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public final void testInterfaceTypeMapWithSerializer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMapWithSerializer");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("foo", subType);
        element.addSub("Test", subType);
        Gson tempGson = new Gson();
        String subTypeJson = tempGson.toJson(subType);
        final JsonElement baseTypeJsonElement = tempGson.toJsonTree(subType, TestTypes.Base.class);
        String baseTypeJson = tempGson.toJson(baseTypeJsonElement);
        String expected = (((("{\"bases\":{\"Test\":" + baseTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        JsonSerializer<com.google.gson.common.TestTypes.Base> baseTypeAdapter = new JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, Type typeOfSrc, JsonSerializationContext context) {
                return baseTypeJsonElement;
            }
        };
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        String json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,json);
        gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public final void testInterfaceTypeMapWithSerializer_literalMutation1476() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMapWithSerializer_literalMutation1476");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("foo", subType);
        Gson tempGson = new Gson();
        String subTypeJson = tempGson.toJson(subType);
        final JsonElement baseTypeJsonElement = tempGson.toJsonTree(subType, TestTypes.Base.class);
        String baseTypeJson = tempGson.toJson(baseTypeJsonElement);
        String expected = (((("{\"bases\":{\"Test\":" + baseTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        JsonSerializer<com.google.gson.common.TestTypes.Base> baseTypeAdapter = new JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, Type typeOfSrc, JsonSerializationContext context) {
                return baseTypeJsonElement;
            }
        };
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        String json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,json);
        gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public final void testInterfaceTypeMapWithSerializer_literalMutation1477() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMapWithSerializer_literalMutation1477");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        Gson tempGson = new Gson();
        String subTypeJson = tempGson.toJson(subType);
        final JsonElement baseTypeJsonElement = tempGson.toJsonTree(subType, TestTypes.Base.class);
        String baseTypeJson = tempGson.toJson(baseTypeJsonElement);
        String expected = (((("foo" + baseTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        JsonSerializer<com.google.gson.common.TestTypes.Base> baseTypeAdapter = new JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, Type typeOfSrc, JsonSerializationContext context) {
                return baseTypeJsonElement;
            }
        };
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        String json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,json);
        gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public final void testInterfaceTypeMapWithSerializer_literalMutation1478() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMapWithSerializer_literalMutation1478");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        Gson tempGson = new Gson();
        String subTypeJson = tempGson.toJson(subType);
        final JsonElement baseTypeJsonElement = tempGson.toJsonTree(subType, TestTypes.Base.class);
        String baseTypeJson = tempGson.toJson(baseTypeJsonElement);
        String expected = (((("{\"bases\":{\"Test\":" + baseTypeJson) + "foo") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        JsonSerializer<com.google.gson.common.TestTypes.Base> baseTypeAdapter = new JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, Type typeOfSrc, JsonSerializationContext context) {
                return baseTypeJsonElement;
            }
        };
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        String json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,json);
        gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public final void testInterfaceTypeMapWithSerializer_literalMutation1479() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMapWithSerializer_literalMutation1479");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        Gson tempGson = new Gson();
        String subTypeJson = tempGson.toJson(subType);
        final JsonElement baseTypeJsonElement = tempGson.toJsonTree(subType, TestTypes.Base.class);
        String baseTypeJson = tempGson.toJson(baseTypeJsonElement);
        String expected = (((("{\"bases\":{\"Test\":" + baseTypeJson) + "},") + "foo") + subTypeJson) + "}}";
        JsonSerializer<com.google.gson.common.TestTypes.Base> baseTypeAdapter = new JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, Type typeOfSrc, JsonSerializationContext context) {
                return baseTypeJsonElement;
            }
        };
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        String json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,json);
        gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public final void testInterfaceTypeMapWithSerializer_literalMutation1480() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMapWithSerializer_literalMutation1480");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        Gson tempGson = new Gson();
        String subTypeJson = tempGson.toJson(subType);
        final JsonElement baseTypeJsonElement = tempGson.toJsonTree(subType, TestTypes.Base.class);
        String baseTypeJson = tempGson.toJson(baseTypeJsonElement);
        String expected = (((("{\"bases\":{\"Test\":" + baseTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "foo";
        JsonSerializer<com.google.gson.common.TestTypes.Base> baseTypeAdapter = new JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, Type typeOfSrc, JsonSerializationContext context) {
                return baseTypeJsonElement;
            }
        };
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        String json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,json);
        gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public final void testInterfaceTypeMapWithSerializer_remove1045() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMapWithSerializer_remove1045");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addSub("Test", subType);
        Gson tempGson = new Gson();
        String subTypeJson = tempGson.toJson(subType);
        final JsonElement baseTypeJsonElement = tempGson.toJsonTree(subType, TestTypes.Base.class);
        String baseTypeJson = tempGson.toJson(baseTypeJsonElement);
        String expected = (((("{\"bases\":{\"Test\":" + baseTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        JsonSerializer<com.google.gson.common.TestTypes.Base> baseTypeAdapter = new JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, Type typeOfSrc, JsonSerializationContext context) {
                return baseTypeJsonElement;
            }
        };
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        String json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,json);
        gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public final void testInterfaceTypeMapWithSerializer_remove1046() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMapWithSerializer_remove1046");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        Gson tempGson = new Gson();
        String subTypeJson = tempGson.toJson(subType);
        final JsonElement baseTypeJsonElement = tempGson.toJsonTree(subType, TestTypes.Base.class);
        String baseTypeJson = tempGson.toJson(baseTypeJsonElement);
        String expected = (((("{\"bases\":{\"Test\":" + baseTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        JsonSerializer<com.google.gson.common.TestTypes.Base> baseTypeAdapter = new JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, Type typeOfSrc, JsonSerializationContext context) {
                return baseTypeJsonElement;
            }
        };
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        String json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,json);
        gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public final void testInterfaceTypeMapWithSerializer_remove1047() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInterfaceTypeMapWithSerializer_remove1047");
        MapClass element = new MapClass();
        TestTypes.Sub subType = new TestTypes.Sub();
        element.addBase("Test", subType);
        element.addSub("Test", subType);
        Gson tempGson = new Gson();
        String subTypeJson = tempGson.toJson(subType);
        final JsonElement baseTypeJsonElement = tempGson.toJsonTree(subType, TestTypes.Base.class);
        String baseTypeJson = tempGson.toJson(baseTypeJsonElement);
        String expected = (((("{\"bases\":{\"Test\":" + baseTypeJson) + "},") + "\"subs\":{\"Test\":") + subTypeJson) + "}}";
        JsonSerializer<com.google.gson.common.TestTypes.Base> baseTypeAdapter = new JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public JsonElement serialize(TestTypes.Base src, Type typeOfSrc, JsonSerializationContext context) {
                return baseTypeJsonElement;
            }
        };
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        String json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1768,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1769,json);
        gson = new GsonBuilder().registerTypeAdapter(TestTypes.Base.class, baseTypeAdapter).create();
        json = gson.toJson(element);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1770,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1771,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGeneralMapField_add1233() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_add1233");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("string", "testString");
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGeneralMapField_add1234() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_add1234");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGeneralMapField_add1235() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_add1235");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGeneralMapField() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("foo", "testString");
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGeneralMapField_literalMutation1458() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_literalMutation1458");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "foo");
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGeneralMapField_literalMutation1459() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_literalMutation1459");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("foo", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGeneralMapField_literalMutation1460() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_literalMutation1460");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new String[]{ "foo" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGeneralMapField_literalMutation1461() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_literalMutation1461");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new String[]{ "one" , "foo" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGeneralMapField_literalMutation1462() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_literalMutation1462");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("foo", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGeneralMapField_literalMutation1463() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_literalMutation1463");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 2 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGeneralMapField_literalMutation1464() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_literalMutation1464");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 3L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGeneralMapField_literalMutation1465() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_literalMutation1465");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "foo" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGeneralMapField_literalMutation1466() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_literalMutation1466");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "foo" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGeneralMapField_literalMutation1467() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_literalMutation1467");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGeneralMapField_remove1039() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_remove1039");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGeneralMapField_remove1040() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_remove1040");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGeneralMapField_remove1041() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGeneralMapField_remove1041");
        MapWithGeneralMapParameters map = new MapWithGeneralMapParameters();
        map.map.put("stringArray", new String[]{ "one" , "two" });
        map.map.put("objectArray", new Object[]{ 1 , 2L , "three" });
        String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,gson,1757,gson.toJson(map));
        gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1759,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1761,gson,1760,gson.toJson(map));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComplexKeysSerialization_add1224() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization_add1224");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(2 , 3), "a");
        map.put(new Point(2 , 3), "a");
        map.put(new Point(5 , 7), "b");
        String json = "{\"2,3\":\"a\",\"5,7\":\"b\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComplexKeysSerialization_add1225() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization_add1225");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(2 , 3), "a");
        map.put(new Point(5 , 7), "b");
        map.put(new Point(5 , 7), "b");
        String json = "{\"2,3\":\"a\",\"5,7\":\"b\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComplexKeysSerialization_add1226() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization_add1226");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(2 , 3), "a");
        map.put(new Point(5 , 7), "b");
        String json = "{\"2,3\":\"a\",\"5,7\":\"b\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComplexKeysSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(3 , 3), "a");
        map.put(new Point(5 , 7), "b");
        String json = "{\"2,3\":\"a\",\"5,7\":\"b\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComplexKeysSerialization_literalMutation1433() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization_literalMutation1433");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(2 , 2), "a");
        map.put(new Point(5 , 7), "b");
        String json = "{\"2,3\":\"a\",\"5,7\":\"b\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComplexKeysSerialization_literalMutation1434() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization_literalMutation1434");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(2 , 3), "foo");
        map.put(new Point(5 , 7), "b");
        String json = "{\"2,3\":\"a\",\"5,7\":\"b\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComplexKeysSerialization_literalMutation1435() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization_literalMutation1435");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(2 , 3), "a");
        map.put(new Point(6 , 7), "b");
        String json = "{\"2,3\":\"a\",\"5,7\":\"b\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComplexKeysSerialization_literalMutation1436() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization_literalMutation1436");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(2 , 3), "a");
        map.put(new Point(5 , 8), "b");
        String json = "{\"2,3\":\"a\",\"5,7\":\"b\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComplexKeysSerialization_literalMutation1437() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization_literalMutation1437");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(2 , 3), "a");
        map.put(new Point(5 , 7), "foo");
        String json = "{\"2,3\":\"a\",\"5,7\":\"b\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComplexKeysSerialization_literalMutation1438() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization_literalMutation1438");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(2 , 3), "a");
        map.put(new Point(5 , 7), "b");
        String json = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComplexKeysSerialization_remove1030() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization_remove1030");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(5 , 7), "b");
        String json = "{\"2,3\":\"a\",\"5,7\":\"b\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComplexKeysSerialization_remove1031() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization_remove1031");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(5 , 7), "b");
        String json = "{\"2,3\":\"a\",\"5,7\":\"b\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComplexKeysSerialization_remove1032() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysSerialization_remove1032");
        Map<Point, java.lang.String> map = new LinkedHashMap<Point, java.lang.String>();
        map.put(new Point(2 , 3), "a");
        map.put(new Point(5 , 7), "b");
        String json = "{\"2,3\":\"a\",\"5,7\":\"b\"}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1745,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1747,gson,1746,gson.toJson(map, new com.google.gson.reflect.TypeToken<java.util.Map<com.google.gson.functional.MapTest.Point, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,gson,1749,gson.toJson(map, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComplexKeysDeserialization_add1222() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysDeserialization_add1222");
        String json = "{\'2,3\':\'a\',\'5,7\':\'b\'}";
        try {
            gson.fromJson(json, new TypeToken<java.util.Map<Point, java.lang.String>>() {            }.getType());
            gson.fromJson(json, new TypeToken<java.util.Map<Point, java.lang.String>>() {            }.getType());
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testComplexKeysDeserialization_add1223() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysDeserialization_add1223");
        String json = "{\'2,3\':\'a\',\'5,7\':\'b\'}";
        try {
            gson.fromJson(json, new TypeToken<java.util.Map<Point, java.lang.String>>() {            }.getType());
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComplexKeysDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComplexKeysDeserialization");
        String json = "foo";
        try {
            gson.fromJson(json, new TypeToken<java.util.Map<Point, java.lang.String>>() {            }.getType());
        } catch (JsonParseException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStringKeyDeserialization_add1294() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringKeyDeserialization_add1294");
        String json = "{\'2,3\':\'a\',\'5,7\':\'b\'}";
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<java.lang.String, java.lang.String>();
        map.put("2,3", "a");
        map.put("2,3", "a");
        map.put("5,7", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,gson,1884,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStringKeyDeserialization_add1295() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringKeyDeserialization_add1295");
        String json = "{\'2,3\':\'a\',\'5,7\':\'b\'}";
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<java.lang.String, java.lang.String>();
        map.put("2,3", "a");
        map.put("5,7", "b");
        map.put("5,7", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,gson,1884,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStringKeyDeserialization_add1296() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringKeyDeserialization_add1296");
        String json = "{\'2,3\':\'a\',\'5,7\':\'b\'}";
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<java.lang.String, java.lang.String>();
        map.put("2,3", "a");
        map.put("5,7", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,gson,1884,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringKeyDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringKeyDeserialization");
        String json = "foo";
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<java.lang.String, java.lang.String>();
        map.put("2,3", "a");
        map.put("5,7", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,gson,1884,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringKeyDeserialization_literalMutation1566() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringKeyDeserialization_literalMutation1566");
        String json = "{\'2,3\':\'a\',\'5,7\':\'b\'}";
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<java.lang.String, java.lang.String>();
        map.put("foo", "a");
        map.put("5,7", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,gson,1884,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringKeyDeserialization_literalMutation1567() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringKeyDeserialization_literalMutation1567");
        String json = "{\'2,3\':\'a\',\'5,7\':\'b\'}";
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<java.lang.String, java.lang.String>();
        map.put("2,3", "foo");
        map.put("5,7", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,gson,1884,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringKeyDeserialization_literalMutation1568() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringKeyDeserialization_literalMutation1568");
        String json = "{\'2,3\':\'a\',\'5,7\':\'b\'}";
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<java.lang.String, java.lang.String>();
        map.put("2,3", "a");
        map.put("foo", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,gson,1884,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testStringKeyDeserialization_literalMutation1569() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringKeyDeserialization_literalMutation1569");
        String json = "{\'2,3\':\'a\',\'5,7\':\'b\'}";
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<java.lang.String, java.lang.String>();
        map.put("2,3", "a");
        map.put("5,7", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,gson,1884,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStringKeyDeserialization_remove1098() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringKeyDeserialization_remove1098");
        String json = "{\'2,3\':\'a\',\'5,7\':\'b\'}";
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<java.lang.String, java.lang.String>();
        map.put("5,7", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,gson,1884,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStringKeyDeserialization_remove1099() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringKeyDeserialization_remove1099");
        String json = "{\'2,3\':\'a\',\'5,7\':\'b\'}";
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<java.lang.String, java.lang.String>();
        map.put("5,7", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,gson,1884,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testStringKeyDeserialization_remove1100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testStringKeyDeserialization_remove1100");
        String json = "{\'2,3\':\'a\',\'5,7\':\'b\'}";
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<java.lang.String, java.lang.String>();
        map.put("2,3", "a");
        map.put("5,7", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1883,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1885,gson,1884,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumberKeyDeserialization_add1278() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberKeyDeserialization_add1278");
        String json = "{\'2.3\':\'a\',\'5.7\':\'b\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "a");
        map.put(2.3, "a");
        map.put(5.7, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1851,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1853,gson,1852,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumberKeyDeserialization_add1279() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberKeyDeserialization_add1279");
        String json = "{\'2.3\':\'a\',\'5.7\':\'b\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "a");
        map.put(5.7, "b");
        map.put(5.7, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1851,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1853,gson,1852,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumberKeyDeserialization_add1280() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberKeyDeserialization_add1280");
        String json = "{\'2.3\':\'a\',\'5.7\':\'b\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "a");
        map.put(5.7, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1851,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1853,gson,1852,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumberKeyDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberKeyDeserialization");
        String json = "foo";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "a");
        map.put(5.7, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1851,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1853,gson,1852,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumberKeyDeserialization_literalMutation1528() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberKeyDeserialization_literalMutation1528");
        String json = "{\'2.3\':\'a\',\'5.7\':\'b\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(3.3, "a");
        map.put(5.7, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1851,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1853,gson,1852,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumberKeyDeserialization_literalMutation1529() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberKeyDeserialization_literalMutation1529");
        String json = "{\'2.3\':\'a\',\'5.7\':\'b\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "foo");
        map.put(5.7, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1851,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1853,gson,1852,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumberKeyDeserialization_literalMutation1530() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberKeyDeserialization_literalMutation1530");
        String json = "{\'2.3\':\'a\',\'5.7\':\'b\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "a");
        map.put(6.7, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1851,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1853,gson,1852,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNumberKeyDeserialization_literalMutation1531() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberKeyDeserialization_literalMutation1531");
        String json = "{\'2.3\':\'a\',\'5.7\':\'b\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "a");
        map.put(5.7, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1851,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1853,gson,1852,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumberKeyDeserialization_remove1082() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberKeyDeserialization_remove1082");
        String json = "{\'2.3\':\'a\',\'5.7\':\'b\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(5.7, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1851,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1853,gson,1852,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumberKeyDeserialization_remove1083() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberKeyDeserialization_remove1083");
        String json = "{\'2.3\':\'a\',\'5.7\':\'b\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(5.7, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1851,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1853,gson,1852,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNumberKeyDeserialization_remove1084() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNumberKeyDeserialization_remove1084");
        String json = "{\'2.3\':\'a\',\'5.7\':\'b\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "a");
        map.put(5.7, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1851,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1853,gson,1852,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleanKeyDeserialization_add1219() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanKeyDeserialization_add1219");
        String json = "{\'true\':\'a\',\'false\':\'b\'}";
        Map<java.lang.Boolean, java.lang.String> map = new LinkedHashMap<java.lang.Boolean, java.lang.String>();
        map.put(true, "a");
        map.put(true, "a");
        map.put(false, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,gson,1743,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Boolean, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleanKeyDeserialization_add1220() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanKeyDeserialization_add1220");
        String json = "{\'true\':\'a\',\'false\':\'b\'}";
        Map<java.lang.Boolean, java.lang.String> map = new LinkedHashMap<java.lang.Boolean, java.lang.String>();
        map.put(true, "a");
        map.put(false, "b");
        map.put(false, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,gson,1743,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Boolean, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleanKeyDeserialization_add1221() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanKeyDeserialization_add1221");
        String json = "{\'true\':\'a\',\'false\':\'b\'}";
        Map<java.lang.Boolean, java.lang.String> map = new LinkedHashMap<java.lang.Boolean, java.lang.String>();
        map.put(true, "a");
        map.put(false, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,gson,1743,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Boolean, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBooleanKeyDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanKeyDeserialization");
        String json = "foo";
        Map<java.lang.Boolean, java.lang.String> map = new LinkedHashMap<java.lang.Boolean, java.lang.String>();
        map.put(true, "a");
        map.put(false, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,gson,1743,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Boolean, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBooleanKeyDeserialization_literalMutation1427() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanKeyDeserialization_literalMutation1427");
        String json = "{\'true\':\'a\',\'false\':\'b\'}";
        Map<java.lang.Boolean, java.lang.String> map = new LinkedHashMap<java.lang.Boolean, java.lang.String>();
        map.put(false, "a");
        map.put(false, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,gson,1743,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Boolean, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBooleanKeyDeserialization_literalMutation1428() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanKeyDeserialization_literalMutation1428");
        String json = "{\'true\':\'a\',\'false\':\'b\'}";
        Map<java.lang.Boolean, java.lang.String> map = new LinkedHashMap<java.lang.Boolean, java.lang.String>();
        map.put(true, "foo");
        map.put(false, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,gson,1743,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Boolean, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBooleanKeyDeserialization_literalMutation1429() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanKeyDeserialization_literalMutation1429");
        String json = "{\'true\':\'a\',\'false\':\'b\'}";
        Map<java.lang.Boolean, java.lang.String> map = new LinkedHashMap<java.lang.Boolean, java.lang.String>();
        map.put(true, "a");
        map.put(true, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,gson,1743,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Boolean, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBooleanKeyDeserialization_literalMutation1430() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanKeyDeserialization_literalMutation1430");
        String json = "{\'true\':\'a\',\'false\':\'b\'}";
        Map<java.lang.Boolean, java.lang.String> map = new LinkedHashMap<java.lang.Boolean, java.lang.String>();
        map.put(true, "a");
        map.put(false, "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,gson,1743,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Boolean, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleanKeyDeserialization_remove1027() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanKeyDeserialization_remove1027");
        String json = "{\'true\':\'a\',\'false\':\'b\'}";
        Map<java.lang.Boolean, java.lang.String> map = new LinkedHashMap<java.lang.Boolean, java.lang.String>();
        map.put(false, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,gson,1743,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Boolean, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleanKeyDeserialization_remove1028() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanKeyDeserialization_remove1028");
        String json = "{\'true\':\'a\',\'false\':\'b\'}";
        Map<java.lang.Boolean, java.lang.String> map = new LinkedHashMap<java.lang.Boolean, java.lang.String>();
        map.put(false, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,gson,1743,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Boolean, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBooleanKeyDeserialization_remove1029() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBooleanKeyDeserialization_remove1029");
        String json = "{\'true\':\'a\',\'false\':\'b\'}";
        Map<java.lang.Boolean, java.lang.String> map = new LinkedHashMap<java.lang.Boolean, java.lang.String>();
        map.put(true, "a");
        map.put(false, "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,gson,1743,gson.fromJson(json, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Boolean, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserializationWithDuplicateKeys_add1244() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithDuplicateKeys_add1244");
        try {
            gson.fromJson("{\'a\':1,\'a\':2}", new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {            }.getType());
            gson.fromJson("{\'a\':1,\'a\':2}", new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapDeserializationWithDuplicateKeys_add1245() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithDuplicateKeys_add1245");
        try {
            gson.fromJson("{\'a\':1,\'a\':2}", new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapDeserializationWithDuplicateKeys() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapDeserializationWithDuplicateKeys");
        try {
            gson.fromJson("foo", new TypeToken<java.util.Map<java.lang.String, java.lang.Integer>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeMapOfMaps_add1286() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMapOfMaps_add1286");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,gson.toJson(map, type),1863,gson.toJson(map, type).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMapOfMaps() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMapOfMaps");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("foo", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,gson.toJson(map, type),1863,gson.toJson(map, type).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMapOfMaps_literalMutation1543() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMapOfMaps_literalMutation1543");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("foo", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,gson.toJson(map, type),1863,gson.toJson(map, type).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMapOfMaps_literalMutation1544() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMapOfMaps_literalMutation1544");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "foo", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,gson.toJson(map, type),1863,gson.toJson(map, type).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMapOfMaps_literalMutation1545() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMapOfMaps_literalMutation1545");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "foo", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,gson.toJson(map, type),1863,gson.toJson(map, type).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMapOfMaps_literalMutation1546() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMapOfMaps_literalMutation1546");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "foo"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,gson.toJson(map, type),1863,gson.toJson(map, type).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMapOfMaps_literalMutation1547() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMapOfMaps_literalMutation1547");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "foo", newMap("kb1", "vb1", "kb2", "vb2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,gson.toJson(map, type),1863,gson.toJson(map, type).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMapOfMaps_literalMutation1548() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMapOfMaps_literalMutation1548");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("foo", "vb1", "kb2", "vb2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,gson.toJson(map, type),1863,gson.toJson(map, type).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMapOfMaps_literalMutation1549() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMapOfMaps_literalMutation1549");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "foo", "kb2", "vb2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,gson.toJson(map, type),1863,gson.toJson(map, type).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMapOfMaps_literalMutation1550() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMapOfMaps_literalMutation1550");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "foo", "vb2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,gson.toJson(map, type),1863,gson.toJson(map, type).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeMapOfMaps_literalMutation1551() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMapOfMaps_literalMutation1551");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,gson.toJson(map, type),1863,gson.toJson(map, type).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeMapOfMaps_remove1090() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeMapOfMaps_remove1090");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1864,gson.toJson(map, type),1863,gson.toJson(map, type).replace('\"', '\''));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeerializeMapOfMaps_add1232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps_add1232");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        String json = "{\'a\':{\'ka1\':\'va1\',\'ka2\':\'va2\'},\'b\':{\'kb1\':\'vb1\',\'kb2\':\'vb2\'}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeerializeMapOfMaps() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("foo", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        String json = "{\'a\':{\'ka1\':\'va1\',\'ka2\':\'va2\'},\'b\':{\'kb1\':\'vb1\',\'kb2\':\'vb2\'}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeerializeMapOfMaps_literalMutation1447() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps_literalMutation1447");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("foo", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        String json = "{\'a\':{\'ka1\':\'va1\',\'ka2\':\'va2\'},\'b\':{\'kb1\':\'vb1\',\'kb2\':\'vb2\'}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeerializeMapOfMaps_literalMutation1448() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps_literalMutation1448");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "foo", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        String json = "{\'a\':{\'ka1\':\'va1\',\'ka2\':\'va2\'},\'b\':{\'kb1\':\'vb1\',\'kb2\':\'vb2\'}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeerializeMapOfMaps_literalMutation1449() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps_literalMutation1449");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "foo", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        String json = "{\'a\':{\'ka1\':\'va1\',\'ka2\':\'va2\'},\'b\':{\'kb1\':\'vb1\',\'kb2\':\'vb2\'}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeerializeMapOfMaps_literalMutation1450() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps_literalMutation1450");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "foo"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        String json = "{\'a\':{\'ka1\':\'va1\',\'ka2\':\'va2\'},\'b\':{\'kb1\':\'vb1\',\'kb2\':\'vb2\'}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeerializeMapOfMaps_literalMutation1451() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps_literalMutation1451");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "foo", newMap("kb1", "vb1", "kb2", "vb2"));
        String json = "{\'a\':{\'ka1\':\'va1\',\'ka2\':\'va2\'},\'b\':{\'kb1\':\'vb1\',\'kb2\':\'vb2\'}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeerializeMapOfMaps_literalMutation1452() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps_literalMutation1452");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("foo", "vb1", "kb2", "vb2"));
        String json = "{\'a\':{\'ka1\':\'va1\',\'ka2\':\'va2\'},\'b\':{\'kb1\':\'vb1\',\'kb2\':\'vb2\'}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeerializeMapOfMaps_literalMutation1453() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps_literalMutation1453");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "foo", "kb2", "vb2"));
        String json = "{\'a\':{\'ka1\':\'va1\',\'ka2\':\'va2\'},\'b\':{\'kb1\':\'vb1\',\'kb2\':\'vb2\'}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeerializeMapOfMaps_literalMutation1454() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps_literalMutation1454");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "foo", "vb2"));
        String json = "{\'a\':{\'ka1\':\'va1\',\'ka2\':\'va2\'},\'b\':{\'kb1\':\'vb1\',\'kb2\':\'vb2\'}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeerializeMapOfMaps_literalMutation1455() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps_literalMutation1455");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "foo"));
        String json = "{\'a\':{\'ka1\':\'va1\',\'ka2\':\'va2\'},\'b\':{\'kb1\':\'vb1\',\'kb2\':\'vb2\'}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeerializeMapOfMaps_literalMutation1456() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps_literalMutation1456");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        String json = "foo";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeerializeMapOfMaps_remove1038() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeerializeMapOfMaps_remove1038");
        Type type = new TypeToken<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>>() {        }.getType();
        Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map = newMap("a", newMap("ka1", "va1", "ka2", "va2"), "b", newMap("kb1", "vb1", "kb2", "vb2"));
        String json = "{\'a\':{\'ka1\':\'va1\',\'ka2\':\'va2\'},\'b\':{\'kb1\':\'vb1\',\'kb2\':\'vb2\'}}";
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1753,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1755,gson,1754,gson.fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private <K, V>Map<K, V> newMap(K key1, V value1, K key2, V value2) {
        Map<K, V> result = new LinkedHashMap<K, V>();
        result.put(key1, value1);
        result.put(key2, value2);
        return result;
    }

    @Test(timeout = 1000)
    public void testMapNamePromotionWithJsonElementReader_add1250() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapNamePromotionWithJsonElementReader_add1250");
        String json = "{\'2.3\':\'a\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "a");
        map.put(2.3, "a");
        JsonElement tree = new JsonParser().parse(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,gson,1810,gson.fromJson(tree, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapNamePromotionWithJsonElementReader_add1251() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapNamePromotionWithJsonElementReader_add1251");
        String json = "{\'2.3\':\'a\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "a");
        JsonElement tree = new JsonParser().parse(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,gson,1810,gson.fromJson(tree, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapNamePromotionWithJsonElementReader() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapNamePromotionWithJsonElementReader");
        String json = "foo";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "a");
        JsonElement tree = new JsonParser().parse(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,gson,1810,gson.fromJson(tree, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapNamePromotionWithJsonElementReader_literalMutation1490() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapNamePromotionWithJsonElementReader_literalMutation1490");
        String json = "{\'2.3\':\'a\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(1.2999999999999998, "a");
        JsonElement tree = new JsonParser().parse(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,gson,1810,gson.fromJson(tree, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapNamePromotionWithJsonElementReader_literalMutation1491() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapNamePromotionWithJsonElementReader_literalMutation1491");
        String json = "{\'2.3\':\'a\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "foo");
        JsonElement tree = new JsonParser().parse(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,gson,1810,gson.fromJson(tree, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapNamePromotionWithJsonElementReader_remove1054() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapNamePromotionWithJsonElementReader_remove1054");
        String json = "{\'2.3\':\'a\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        JsonElement tree = new JsonParser().parse(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,gson,1810,gson.fromJson(tree, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapNamePromotionWithJsonElementReader_remove1055() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapNamePromotionWithJsonElementReader_remove1055");
        String json = "{\'2.3\':\'a\'}";
        Map<java.lang.Double, java.lang.String> map = new LinkedHashMap<java.lang.Double, java.lang.String>();
        map.put(2.3, "a");
        JsonElement tree = new JsonParser().parse(json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,gson,1810,gson.fromJson(tree, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    static class Point {
        private final int x;

        private final int y;

        Point(int x ,int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            return ((o instanceof Point) && ((x) == (((Point)(o)).x))) && ((y) == (((Point)(o)).y));
        }

        @Override
        public int hashCode() {
            return ((x) * 37) + (y);
        }

        @Override
        public String toString() {
            return ((x) + ",") + (y);
        }
    }

    static final class MapClass {
        private final Map<java.lang.String, com.google.gson.common.TestTypes.Base> bases = new HashMap<java.lang.String, com.google.gson.common.TestTypes.Base>();

        private final Map<java.lang.String, com.google.gson.common.TestTypes.Sub> subs = new HashMap<java.lang.String, com.google.gson.common.TestTypes.Sub>();

        public final void addBase(String name, TestTypes.Base value) {
            bases.put(name, value);
        }

        public final void addSub(String name, TestTypes.Sub value) {
            subs.put(name, value);
        }
    }

    static final class MapWithGeneralMapParameters {
        @SuppressWarnings(value = { "rawtypes" , "unchecked" })
        final Map<java.lang.String, java.lang.Object> map = new LinkedHashMap();
    }
}

