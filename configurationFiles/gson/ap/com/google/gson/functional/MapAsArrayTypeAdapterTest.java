package com.google.gson.functional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import com.google.gson.JsonSyntaxException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

public class MapAsArrayTypeAdapterTest extends TestCase {
    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_add1210() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_add1210");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_add1211() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_add1211");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_add1212() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_add1212");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_add1213() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_add1213");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_add1214() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_add1214");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_add1215() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_add1215");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_add1216() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_add1216");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeComplexMapWithTypeAdapter() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(4 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeComplexMapWithTypeAdapter_literalMutation1416() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_literalMutation1416");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 4), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeComplexMapWithTypeAdapter_literalMutation1417() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_literalMutation1417");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "foo");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeComplexMapWithTypeAdapter_literalMutation1418() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_literalMutation1418");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(7 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeComplexMapWithTypeAdapter_literalMutation1419() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_literalMutation1419");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 9), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeComplexMapWithTypeAdapter_literalMutation1420() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_literalMutation1420");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "foo");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeComplexMapWithTypeAdapter_literalMutation1421() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_literalMutation1421");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("foo", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeComplexMapWithTypeAdapter_literalMutation1422() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_literalMutation1422");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", false);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeComplexMapWithTypeAdapter_literalMutation1423() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_literalMutation1423");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("foo", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerializeComplexMapWithTypeAdapter_literalMutation1424() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_literalMutation1424");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", true);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_remove1020() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_remove1020");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_remove1021() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_remove1021");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_remove1022() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_remove1022");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_remove1023() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_remove1023");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_remove1024() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_remove1024");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_remove1025() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_remove1025");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSerializeComplexMapWithTypeAdapter_remove1026() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeComplexMapWithTypeAdapter_remove1026");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(5 , 5), "a");
        original.put(new Point(8 , 8), "b");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1731,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,gson,1733,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        Map<java.lang.String, java.lang.Boolean> otherMap = new LinkedHashMap<java.lang.String, java.lang.Boolean>();
        otherMap.put("t", true);
        otherMap.put("f", false);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,gson,1735,gson.toJson(otherMap, java.util.Map.class));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,gson,1737,gson.toJson(otherMap, new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1739,otherMap);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1741,gson,1740,gson.<java.lang.Object>fromJson("{\"t\":true,\"f\":false}", new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Boolean>>() {}.getType()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testTwoTypesCollapseToOneSerialize_add1200() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testTwoTypesCollapseToOneSerialize_add1200");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<java.lang.Number, java.lang.String> original = new LinkedHashMap<java.lang.Number, java.lang.String>();
        original.put(new java.lang.Double(1.0), "a");
        original.put(new java.lang.Double(1.0), "a");
        original.put(new java.lang.Float(1.0), "b");
        try {
            gson.toJson(original, new TypeToken<java.util.Map<java.lang.Number, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testTwoTypesCollapseToOneSerialize_add1201() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testTwoTypesCollapseToOneSerialize_add1201");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<java.lang.Number, java.lang.String> original = new LinkedHashMap<java.lang.Number, java.lang.String>();
        original.put(new java.lang.Double(1.0), "a");
        original.put(new java.lang.Float(1.0), "b");
        original.put(new java.lang.Float(1.0), "b");
        try {
            gson.toJson(original, new TypeToken<java.util.Map<java.lang.Number, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testTwoTypesCollapseToOneSerialize_add1202() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testTwoTypesCollapseToOneSerialize_add1202");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<java.lang.Number, java.lang.String> original = new LinkedHashMap<java.lang.Number, java.lang.String>();
        original.put(new java.lang.Double(1.0), "a");
        original.put(new java.lang.Float(1.0), "b");
        try {
            gson.toJson(original, new TypeToken<java.util.Map<java.lang.Number, java.lang.String>>() {            }.getType());
            gson.toJson(original, new TypeToken<java.util.Map<java.lang.Number, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testTwoTypesCollapseToOneSerialize_add1203() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testTwoTypesCollapseToOneSerialize_add1203");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<java.lang.Number, java.lang.String> original = new LinkedHashMap<java.lang.Number, java.lang.String>();
        original.put(new java.lang.Double(1.0), "a");
        original.put(new java.lang.Float(1.0), "b");
        try {
            gson.toJson(original, new TypeToken<java.util.Map<java.lang.Number, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testTwoTypesCollapseToOneSerialize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testTwoTypesCollapseToOneSerialize");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<java.lang.Number, java.lang.String> original = new LinkedHashMap<java.lang.Number, java.lang.String>();
        original.put(new java.lang.Double(0.0), "a");
        original.put(new java.lang.Float(1.0), "b");
        try {
            gson.toJson(original, new TypeToken<java.util.Map<java.lang.Number, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testTwoTypesCollapseToOneSerialize_literalMutation1401() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testTwoTypesCollapseToOneSerialize_literalMutation1401");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<java.lang.Number, java.lang.String> original = new LinkedHashMap<java.lang.Number, java.lang.String>();
        original.put(new java.lang.Double(1.0), "foo");
        original.put(new java.lang.Float(1.0), "b");
        try {
            gson.toJson(original, new TypeToken<java.util.Map<java.lang.Number, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testTwoTypesCollapseToOneSerialize_literalMutation1402() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testTwoTypesCollapseToOneSerialize_literalMutation1402");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<java.lang.Number, java.lang.String> original = new LinkedHashMap<java.lang.Number, java.lang.String>();
        original.put(new java.lang.Double(1.0), "a");
        original.put(new java.lang.Float(0.0), "b");
        try {
            gson.toJson(original, new TypeToken<java.util.Map<java.lang.Number, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void disabled_testTwoTypesCollapseToOneSerialize_literalMutation1403() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testTwoTypesCollapseToOneSerialize_literalMutation1403");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<java.lang.Number, java.lang.String> original = new LinkedHashMap<java.lang.Number, java.lang.String>();
        original.put(new java.lang.Double(1.0), "a");
        original.put(new java.lang.Float(1.0), "foo");
        try {
            gson.toJson(original, new TypeToken<java.util.Map<java.lang.Number, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testTwoTypesCollapseToOneSerialize_remove1012() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testTwoTypesCollapseToOneSerialize_remove1012");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<java.lang.Number, java.lang.String> original = new LinkedHashMap<java.lang.Number, java.lang.String>();
        original.put(new java.lang.Float(1.0), "b");
        try {
            gson.toJson(original, new TypeToken<java.util.Map<java.lang.Number, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void disabled_testTwoTypesCollapseToOneSerialize_remove1013() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "disabled_testTwoTypesCollapseToOneSerialize_remove1013");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<java.lang.Number, java.lang.String> original = new LinkedHashMap<java.lang.Number, java.lang.String>();
        original.put(new java.lang.Float(1.0), "b");
        try {
            gson.toJson(original, new TypeToken<java.util.Map<java.lang.Number, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTwoTypesCollapseToOneDeserialize_add1217() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoTypesCollapseToOneDeserialize_add1217");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        String s = "[[\"1.00\",\"a\"],[\"1.0\",\"b\"]]";
        try {
            gson.fromJson(s, new TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {            }.getType());
            gson.fromJson(s, new TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTwoTypesCollapseToOneDeserialize_add1218() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoTypesCollapseToOneDeserialize_add1218");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        String s = "[[\"1.00\",\"a\"],[\"1.0\",\"b\"]]";
        try {
            gson.fromJson(s, new TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTwoTypesCollapseToOneDeserialize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoTypesCollapseToOneDeserialize");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        String s = "foo";
        try {
            gson.fromJson(s, new TypeToken<java.util.Map<java.lang.Double, java.lang.String>>() {            }.getType());
        } catch (JsonSyntaxException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleEnableComplexKeyRegistrationHasNoEffect_add1207() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleEnableComplexKeyRegistrationHasNoEffect_add1207");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(6 , 5), "abc");
        original.put(new Point(1 , 8), "def");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,gson,1729,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleEnableComplexKeyRegistrationHasNoEffect_add1208() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleEnableComplexKeyRegistrationHasNoEffect_add1208");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(6 , 5), "abc");
        original.put(new Point(6 , 5), "abc");
        original.put(new Point(1 , 8), "def");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,gson,1729,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleEnableComplexKeyRegistrationHasNoEffect_add1209() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleEnableComplexKeyRegistrationHasNoEffect_add1209");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(6 , 5), "abc");
        original.put(new Point(1 , 8), "def");
        original.put(new Point(1 , 8), "def");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,gson,1729,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultipleEnableComplexKeyRegistrationHasNoEffect() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleEnableComplexKeyRegistrationHasNoEffect");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(7 , 5), "abc");
        original.put(new Point(1 , 8), "def");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,gson,1729,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultipleEnableComplexKeyRegistrationHasNoEffect_literalMutation1410() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleEnableComplexKeyRegistrationHasNoEffect_literalMutation1410");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(6 , 6), "abc");
        original.put(new Point(1 , 8), "def");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,gson,1729,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultipleEnableComplexKeyRegistrationHasNoEffect_literalMutation1411() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleEnableComplexKeyRegistrationHasNoEffect_literalMutation1411");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(6 , 5), "foo");
        original.put(new Point(1 , 8), "def");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,gson,1729,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultipleEnableComplexKeyRegistrationHasNoEffect_literalMutation1412() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleEnableComplexKeyRegistrationHasNoEffect_literalMutation1412");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(6 , 5), "abc");
        original.put(new Point(0 , 8), "def");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,gson,1729,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultipleEnableComplexKeyRegistrationHasNoEffect_literalMutation1413() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleEnableComplexKeyRegistrationHasNoEffect_literalMutation1413");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(6 , 5), "abc");
        original.put(new Point(1 , 7), "def");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,gson,1729,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultipleEnableComplexKeyRegistrationHasNoEffect_literalMutation1414() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleEnableComplexKeyRegistrationHasNoEffect_literalMutation1414");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(6 , 5), "abc");
        original.put(new Point(1 , 8), "foo");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,gson,1729,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleEnableComplexKeyRegistrationHasNoEffect_remove1017() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleEnableComplexKeyRegistrationHasNoEffect_remove1017");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(6 , 5), "abc");
        original.put(new Point(1 , 8), "def");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,gson,1729,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleEnableComplexKeyRegistrationHasNoEffect_remove1018() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleEnableComplexKeyRegistrationHasNoEffect_remove1018");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(1 , 8), "def");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,gson,1729,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMultipleEnableComplexKeyRegistrationHasNoEffect_remove1019() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleEnableComplexKeyRegistrationHasNoEffect_remove1019");
        Type type = new TypeToken<java.util.Map<Point, java.lang.String>>() {        }.getType();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().enableComplexMapKeySerialization().create();
        Map<Point, java.lang.String> original = new LinkedHashMap<Point, java.lang.String>();
        original.put(new Point(1 , 8), "def");
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,gson,1729,gson.<java.util.Map<com.google.gson.functional.MapAsArrayTypeAdapterTest.Point, java.lang.String>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapWithTypeVariableSerialization_add1205() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithTypeVariableSerialization_add1205");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        PointWithProperty<Point> map = new PointWithProperty<Point>();
        map.map.put(new Point(2 , 3), new Point(4 , 5));
        map.map.put(new Point(2 , 3), new Point(4 , 5));
        Type type = new TypeToken<PointWithProperty<Point>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapWithTypeVariableSerialization_add1206() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithTypeVariableSerialization_add1206");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        PointWithProperty<Point> map = new PointWithProperty<Point>();
        map.map.put(new Point(2 , 3), new Point(4 , 5));
        Type type = new TypeToken<PointWithProperty<Point>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapWithTypeVariableSerialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithTypeVariableSerialization");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        PointWithProperty<Point> map = new PointWithProperty<Point>();
        map.map.put(new Point(3 , 3), new Point(4 , 5));
        Type type = new TypeToken<PointWithProperty<Point>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapWithTypeVariableSerialization_literalMutation1406() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithTypeVariableSerialization_literalMutation1406");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        PointWithProperty<Point> map = new PointWithProperty<Point>();
        map.map.put(new Point(2 , 2), new Point(4 , 5));
        Type type = new TypeToken<PointWithProperty<Point>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapWithTypeVariableSerialization_literalMutation1407() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithTypeVariableSerialization_literalMutation1407");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        PointWithProperty<Point> map = new PointWithProperty<Point>();
        map.map.put(new Point(2 , 3), new Point(5 , 5));
        Type type = new TypeToken<PointWithProperty<Point>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapWithTypeVariableSerialization_literalMutation1408() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithTypeVariableSerialization_literalMutation1408");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        PointWithProperty<Point> map = new PointWithProperty<Point>();
        map.map.put(new Point(2 , 3), new Point(4 , 4));
        Type type = new TypeToken<PointWithProperty<Point>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapWithTypeVariableSerialization_remove1015() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithTypeVariableSerialization_remove1015");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        PointWithProperty<Point> map = new PointWithProperty<Point>();
        Type type = new TypeToken<PointWithProperty<Point>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapWithTypeVariableSerialization_remove1016() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithTypeVariableSerialization_remove1016");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        PointWithProperty<Point> map = new PointWithProperty<Point>();
        map.map.put(new Point(2 , 3), new Point(4 , 5));
        Type type = new TypeToken<PointWithProperty<Point>>() {        }.getType();
        String json = gson.toJson(map, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapWithTypeVariableDeserialization_add1204() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithTypeVariableDeserialization_add1204");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = "{map:[[{x:2,y:3},{x:4,y:5}]]}";
        Type type = new TypeToken<PointWithProperty<Point>>() {        }.getType();
        PointWithProperty<Point> map = gson.fromJson(json, type);
        Point key = map.map.keySet().iterator().next();
        Point value = map.map.values().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,new com.google.gson.functional.MapAsArrayTypeAdapterTest.Point(2 , 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1723,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,new com.google.gson.functional.MapAsArrayTypeAdapterTest.Point(4 , 5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1725,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapWithTypeVariableDeserialization() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithTypeVariableDeserialization");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = "foo";
        Type type = new TypeToken<PointWithProperty<Point>>() {        }.getType();
        PointWithProperty<Point> map = gson.fromJson(json, type);
        Point key = map.map.keySet().iterator().next();
        Point value = map.map.values().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,new com.google.gson.functional.MapAsArrayTypeAdapterTest.Point(2 , 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1723,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,new com.google.gson.functional.MapAsArrayTypeAdapterTest.Point(4 , 5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1725,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapWithTypeVariableDeserialization_remove1014() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapWithTypeVariableDeserialization_remove1014");
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
        String json = "{map:[[{x:2,y:3},{x:4,y:5}]]}";
        Type type = new TypeToken<PointWithProperty<Point>>() {        }.getType();
        PointWithProperty<Point> map = gson.fromJson(json, type);
        Point key = map.map.keySet().iterator().next();
        Point value = map.map.values().iterator().next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,new com.google.gson.functional.MapAsArrayTypeAdapterTest.Point(2 , 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1723,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,new com.google.gson.functional.MapAsArrayTypeAdapterTest.Point(4 , 5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1725,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    static class Point {
        int x;

        int y;

        Point(int x ,int y) {
            this.x = x;
            this.y = y;
        }

        Point() {
        }

        @Override
        public boolean equals(Object o) {
            return ((o instanceof Point) && ((((Point)(o)).x) == (x))) && ((((Point)(o)).y) == (y));
        }

        @Override
        public int hashCode() {
            return ((x) * 37) + (y);
        }

        @Override
        public String toString() {
            return ((("(" + (x)) + ",") + (y)) + ")";
        }
    }

    static class PointWithProperty<T> {
        Map<Point, T> map = new HashMap<Point, T>();
    }
}

