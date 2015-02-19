package com.google.gson.functional;

import java.util.ArrayList;
import java.util.Collection;
import com.google.gson.Gson;
import java.util.HashMap;
import com.google.gson.JsonObject;
import java.util.Map;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Tests for Gson serialization of a sub-class object while encountering a base-class type
 * 
 * @author Inderjeet Singh
 */
@SuppressWarnings(value = "unused")
public class MoreSpecificTypeSerializationTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    public void testSubclassFields() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubclassFields");
        ClassWithBaseFields target = new ClassWithBaseFields(new Sub(2 , 2));
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,json,1914,json.contains("\"b\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,json,1916,json.contains("\"s\":2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubclassFields_literalMutation1599() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubclassFields_literalMutation1599");
        ClassWithBaseFields target = new ClassWithBaseFields(new Sub(1 , 3));
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1915,json,1914,json.contains("\"b\":1"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1917,json,1916,json.contains("\"s\":2"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testListOfSubclassFields_add1300() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfSubclassFields_add1300");
        Collection<Base> list = new ArrayList<Base>();
        list.add(new Base(1));
        list.add(new Base(1));
        list.add(new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,json,1893,json.contains("{\"b\":1}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,json,1896,json.contains("{\"s\":3,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testListOfSubclassFields_add1301() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfSubclassFields_add1301");
        Collection<Base> list = new ArrayList<Base>();
        list.add(new Base(1));
        list.add(new Sub(2 , 3));
        list.add(new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,json,1893,json.contains("{\"b\":1}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,json,1896,json.contains("{\"s\":3,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testListOfSubclassFields() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfSubclassFields");
        Collection<Base> list = new ArrayList<Base>();
        list.add(new Base(0));
        list.add(new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,json,1893,json.contains("{\"b\":1}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,json,1896,json.contains("{\"s\":3,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testListOfSubclassFields_literalMutation1577() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfSubclassFields_literalMutation1577");
        Collection<Base> list = new ArrayList<Base>();
        list.add(new Base(1));
        list.add(new Sub(1 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,json,1893,json.contains("{\"b\":1}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,json,1896,json.contains("{\"s\":3,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testListOfSubclassFields_literalMutation1578() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfSubclassFields_literalMutation1578");
        Collection<Base> list = new ArrayList<Base>();
        list.add(new Base(1));
        list.add(new Sub(2 , 2));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,json,1893,json.contains("{\"b\":1}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,json,1896,json.contains("{\"s\":3,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testListOfSubclassFields_remove1104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfSubclassFields_remove1104");
        Collection<Base> list = new ArrayList<Base>();
        list.add(new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,json,1893,json.contains("{\"b\":1}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,json,1896,json.contains("{\"s\":3,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testListOfSubclassFields_remove1105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfSubclassFields_remove1105");
        Collection<Base> list = new ArrayList<Base>();
        list.add(new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1664,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1894,json,1893,json.contains("{\"b\":1}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1897,json,1896,json.contains("{\"s\":3,\"b\":2}"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapOfSubclassFields_add1304() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfSubclassFields_add1304");
        Map<java.lang.String, Base> map = new HashMap<java.lang.String, Base>();
        map.put("base", new Base(1));
        map.put("base", new Base(1));
        map.put("sub", new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1905,json.get("base").getAsJsonObject().get("b"),1904,json.get("base").getAsJsonObject().get("b").getAsInt());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,sub.get("b"),1906,sub.get("b").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,sub.get("s"),1908,sub.get("s").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapOfSubclassFields_add1305() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfSubclassFields_add1305");
        Map<java.lang.String, Base> map = new HashMap<java.lang.String, Base>();
        map.put("base", new Base(1));
        map.put("sub", new Sub(2 , 3));
        map.put("sub", new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1905,json.get("base").getAsJsonObject().get("b"),1904,json.get("base").getAsJsonObject().get("b").getAsInt());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,sub.get("b"),1906,sub.get("b").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,sub.get("s"),1908,sub.get("s").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapOfSubclassFields() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfSubclassFields");
        Map<java.lang.String, Base> map = new HashMap<java.lang.String, Base>();
        map.put("foo", new Base(1));
        map.put("sub", new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1905,json.get("base").getAsJsonObject().get("b"),1904,json.get("base").getAsJsonObject().get("b").getAsInt());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,sub.get("b"),1906,sub.get("b").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,sub.get("s"),1908,sub.get("s").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapOfSubclassFields_literalMutation1589() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfSubclassFields_literalMutation1589");
        Map<java.lang.String, Base> map = new HashMap<java.lang.String, Base>();
        map.put("base", new Base(2));
        map.put("sub", new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1905,json.get("base").getAsJsonObject().get("b"),1904,json.get("base").getAsJsonObject().get("b").getAsInt());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,sub.get("b"),1906,sub.get("b").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,sub.get("s"),1908,sub.get("s").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapOfSubclassFields_literalMutation1590() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfSubclassFields_literalMutation1590");
        Map<java.lang.String, Base> map = new HashMap<java.lang.String, Base>();
        map.put("base", new Base(1));
        map.put("foo", new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1905,json.get("base").getAsJsonObject().get("b"),1904,json.get("base").getAsJsonObject().get("b").getAsInt());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,sub.get("b"),1906,sub.get("b").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,sub.get("s"),1908,sub.get("s").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapOfSubclassFields_literalMutation1591() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfSubclassFields_literalMutation1591");
        Map<java.lang.String, Base> map = new HashMap<java.lang.String, Base>();
        map.put("base", new Base(1));
        map.put("sub", new Sub(1 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1905,json.get("base").getAsJsonObject().get("b"),1904,json.get("base").getAsJsonObject().get("b").getAsInt());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,sub.get("b"),1906,sub.get("b").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,sub.get("s"),1908,sub.get("s").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapOfSubclassFields_literalMutation1592() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfSubclassFields_literalMutation1592");
        Map<java.lang.String, Base> map = new HashMap<java.lang.String, Base>();
        map.put("base", new Base(1));
        map.put("sub", new Sub(2 , 2));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1905,json.get("base").getAsJsonObject().get("b"),1904,json.get("base").getAsJsonObject().get("b").getAsInt());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,sub.get("b"),1906,sub.get("b").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,sub.get("s"),1908,sub.get("s").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapOfSubclassFields_literalMutation1594() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfSubclassFields_literalMutation1594");
        Map<java.lang.String, Base> map = new HashMap<java.lang.String, Base>();
        map.put("base", new Base(1));
        map.put("sub", new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("foo").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1905,json.get("base").getAsJsonObject().get("b"),1904,json.get("base").getAsJsonObject().get("b").getAsInt());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,sub.get("b"),1906,sub.get("b").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,sub.get("s"),1908,sub.get("s").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMapOfSubclassFields_literalMutation1595() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfSubclassFields_literalMutation1595");
        Map<java.lang.String, Base> map = new HashMap<java.lang.String, Base>();
        map.put("base", new Base(1));
        map.put("sub", new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1905,json.get("base").getAsJsonObject().get("b"),1904,json.get("base").getAsJsonObject().get("b").getAsInt());
        JsonObject sub = json.get("foo").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,sub.get("b"),1906,sub.get("b").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,sub.get("s"),1908,sub.get("s").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapOfSubclassFields_remove1108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfSubclassFields_remove1108");
        Map<java.lang.String, Base> map = new HashMap<java.lang.String, Base>();
        map.put("sub", new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1905,json.get("base").getAsJsonObject().get("b"),1904,json.get("base").getAsJsonObject().get("b").getAsInt());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,sub.get("b"),1906,sub.get("b").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,sub.get("s"),1908,sub.get("s").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testMapOfSubclassFields_remove1109() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfSubclassFields_remove1109");
        Map<java.lang.String, Base> map = new HashMap<java.lang.String, Base>();
        map.put("sub", new Sub(2 , 3));
        ClassWithContainersOfBaseFields target = new ClassWithContainersOfBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1905,json.get("base").getAsJsonObject().get("b"),1904,json.get("base").getAsJsonObject().get("b").getAsInt());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1907,sub.get("b"),1906,sub.get("b").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1909,sub.get("s"),1908,sub.get("s").getAsInt());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type, Gson ignores the more-specific type and sticks to the declared type
     */
public void testParameterizedSubclassFields() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedSubclassFields");
        ClassWithParameterizedBaseFields target = new ClassWithParameterizedBaseFields(new ParameterizedSub<java.lang.String>("foo" , "two"));
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,json,1910,json.contains("\"t\":\"one\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1913,json,1912,json.contains("\"s\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type, Gson ignores the more-specific type and sticks to the declared type
     */
public void testParameterizedSubclassFields_literalMutation1597() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedSubclassFields_literalMutation1597");
        ClassWithParameterizedBaseFields target = new ClassWithParameterizedBaseFields(new ParameterizedSub<java.lang.String>("one" , "foo"));
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1911,json,1910,json.contains("\"t\":\"one\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1913,json,1912,json.contains("\"s\""));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a List, Gson ignores the more-specific type and sticks to
     * the declared type
     */
@Test(timeout = 1000)
    public void testListOfParameterizedSubclassFields_add1298() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfParameterizedSubclassFields_add1298");
        Collection<ParameterizedBase<java.lang.String>> list = new ArrayList<ParameterizedBase<java.lang.String>>();
        list.add(new ParameterizedBase<java.lang.String>("one"));
        list.add(new ParameterizedBase<java.lang.String>("one"));
        list.add(new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,json,1888,json.contains("{\"t\":\"one\"}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,json,1891,json.contains("\"s\":"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a List, Gson ignores the more-specific type and sticks to
     * the declared type
     */
@Test(timeout = 1000)
    public void testListOfParameterizedSubclassFields_add1299() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfParameterizedSubclassFields_add1299");
        Collection<ParameterizedBase<java.lang.String>> list = new ArrayList<ParameterizedBase<java.lang.String>>();
        list.add(new ParameterizedBase<java.lang.String>("one"));
        list.add(new ParameterizedSub<java.lang.String>("two" , "three"));
        list.add(new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,json,1888,json.contains("{\"t\":\"one\"}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,json,1891,json.contains("\"s\":"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a List, Gson ignores the more-specific type and sticks to
     * the declared type
     */
public void testListOfParameterizedSubclassFields() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfParameterizedSubclassFields");
        Collection<ParameterizedBase<java.lang.String>> list = new ArrayList<ParameterizedBase<java.lang.String>>();
        list.add(new ParameterizedBase<java.lang.String>("foo"));
        list.add(new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,json,1888,json.contains("{\"t\":\"one\"}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,json,1891,json.contains("\"s\":"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a List, Gson ignores the more-specific type and sticks to
     * the declared type
     */
public void testListOfParameterizedSubclassFields_literalMutation1573() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfParameterizedSubclassFields_literalMutation1573");
        Collection<ParameterizedBase<java.lang.String>> list = new ArrayList<ParameterizedBase<java.lang.String>>();
        list.add(new ParameterizedBase<java.lang.String>("one"));
        list.add(new ParameterizedSub<java.lang.String>("foo" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,json,1888,json.contains("{\"t\":\"one\"}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,json,1891,json.contains("\"s\":"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a List, Gson ignores the more-specific type and sticks to
     * the declared type
     */
public void testListOfParameterizedSubclassFields_literalMutation1574() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfParameterizedSubclassFields_literalMutation1574");
        Collection<ParameterizedBase<java.lang.String>> list = new ArrayList<ParameterizedBase<java.lang.String>>();
        list.add(new ParameterizedBase<java.lang.String>("one"));
        list.add(new ParameterizedSub<java.lang.String>("two" , "foo"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,json,1888,json.contains("{\"t\":\"one\"}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,json,1891,json.contains("\"s\":"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a List, Gson ignores the more-specific type and sticks to
     * the declared type
     */
@Test(timeout = 1000)
    public void testListOfParameterizedSubclassFields_remove1102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfParameterizedSubclassFields_remove1102");
        Collection<ParameterizedBase<java.lang.String>> list = new ArrayList<ParameterizedBase<java.lang.String>>();
        list.add(new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,json,1888,json.contains("{\"t\":\"one\"}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,json,1891,json.contains("\"s\":"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a List, Gson ignores the more-specific type and sticks to
     * the declared type
     */
@Test(timeout = 1000)
    public void testListOfParameterizedSubclassFields_remove1103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListOfParameterizedSubclassFields_remove1103");
        Collection<ParameterizedBase<java.lang.String>> list = new ArrayList<ParameterizedBase<java.lang.String>>();
        list.add(new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(list , null);
        String json = gson.toJson(target);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1727,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1889,json,1888,json.contains("{\"t\":\"one\"}"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1890,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1892,json,1891,json.contains("\"s\":"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a map, Gson ignores the more-specific type and sticks to the
     * declared type
     */
@Test(timeout = 1000)
    public void testMapOfParameterizedSubclassFields_add1302() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfParameterizedSubclassFields_add1302");
        Map<java.lang.String, ParameterizedBase<java.lang.String>> map = new HashMap<java.lang.String, ParameterizedBase<java.lang.String>>();
        map.put("base", new ParameterizedBase<java.lang.String>("one"));
        map.put("base", new ParameterizedBase<java.lang.String>("one"));
        map.put("sub", new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,json.get("base").getAsJsonObject().get("t"),1898,json.get("base").getAsJsonObject().get("t").getAsString());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,sub.get("t"),1900,sub.get("t").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,sub,1902,sub.get("s"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a map, Gson ignores the more-specific type and sticks to the
     * declared type
     */
@Test(timeout = 1000)
    public void testMapOfParameterizedSubclassFields_add1303() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfParameterizedSubclassFields_add1303");
        Map<java.lang.String, ParameterizedBase<java.lang.String>> map = new HashMap<java.lang.String, ParameterizedBase<java.lang.String>>();
        map.put("base", new ParameterizedBase<java.lang.String>("one"));
        map.put("sub", new ParameterizedSub<java.lang.String>("two" , "three"));
        map.put("sub", new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,json.get("base").getAsJsonObject().get("t"),1898,json.get("base").getAsJsonObject().get("t").getAsString());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,sub.get("t"),1900,sub.get("t").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,sub,1902,sub.get("s"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a map, Gson ignores the more-specific type and sticks to the
     * declared type
     */
public void testMapOfParameterizedSubclassFields() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfParameterizedSubclassFields");
        Map<java.lang.String, ParameterizedBase<java.lang.String>> map = new HashMap<java.lang.String, ParameterizedBase<java.lang.String>>();
        map.put("foo", new ParameterizedBase<java.lang.String>("one"));
        map.put("sub", new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,json.get("base").getAsJsonObject().get("t"),1898,json.get("base").getAsJsonObject().get("t").getAsString());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,sub.get("t"),1900,sub.get("t").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,sub,1902,sub.get("s"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a map, Gson ignores the more-specific type and sticks to the
     * declared type
     */
public void testMapOfParameterizedSubclassFields_literalMutation1581() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfParameterizedSubclassFields_literalMutation1581");
        Map<java.lang.String, ParameterizedBase<java.lang.String>> map = new HashMap<java.lang.String, ParameterizedBase<java.lang.String>>();
        map.put("base", new ParameterizedBase<java.lang.String>("foo"));
        map.put("sub", new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,json.get("base").getAsJsonObject().get("t"),1898,json.get("base").getAsJsonObject().get("t").getAsString());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,sub.get("t"),1900,sub.get("t").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,sub,1902,sub.get("s"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a map, Gson ignores the more-specific type and sticks to the
     * declared type
     */
public void testMapOfParameterizedSubclassFields_literalMutation1582() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfParameterizedSubclassFields_literalMutation1582");
        Map<java.lang.String, ParameterizedBase<java.lang.String>> map = new HashMap<java.lang.String, ParameterizedBase<java.lang.String>>();
        map.put("base", new ParameterizedBase<java.lang.String>("one"));
        map.put("foo", new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,json.get("base").getAsJsonObject().get("t"),1898,json.get("base").getAsJsonObject().get("t").getAsString());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,sub.get("t"),1900,sub.get("t").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,sub,1902,sub.get("s"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a map, Gson ignores the more-specific type and sticks to the
     * declared type
     */
public void testMapOfParameterizedSubclassFields_literalMutation1583() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfParameterizedSubclassFields_literalMutation1583");
        Map<java.lang.String, ParameterizedBase<java.lang.String>> map = new HashMap<java.lang.String, ParameterizedBase<java.lang.String>>();
        map.put("base", new ParameterizedBase<java.lang.String>("one"));
        map.put("sub", new ParameterizedSub<java.lang.String>("foo" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,json.get("base").getAsJsonObject().get("t"),1898,json.get("base").getAsJsonObject().get("t").getAsString());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,sub.get("t"),1900,sub.get("t").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,sub,1902,sub.get("s"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a map, Gson ignores the more-specific type and sticks to the
     * declared type
     */
public void testMapOfParameterizedSubclassFields_literalMutation1584() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfParameterizedSubclassFields_literalMutation1584");
        Map<java.lang.String, ParameterizedBase<java.lang.String>> map = new HashMap<java.lang.String, ParameterizedBase<java.lang.String>>();
        map.put("base", new ParameterizedBase<java.lang.String>("one"));
        map.put("sub", new ParameterizedSub<java.lang.String>("two" , "foo"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,json.get("base").getAsJsonObject().get("t"),1898,json.get("base").getAsJsonObject().get("t").getAsString());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,sub.get("t"),1900,sub.get("t").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,sub,1902,sub.get("s"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a map, Gson ignores the more-specific type and sticks to the
     * declared type
     */
public void testMapOfParameterizedSubclassFields_literalMutation1586() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfParameterizedSubclassFields_literalMutation1586");
        Map<java.lang.String, ParameterizedBase<java.lang.String>> map = new HashMap<java.lang.String, ParameterizedBase<java.lang.String>>();
        map.put("base", new ParameterizedBase<java.lang.String>("one"));
        map.put("sub", new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("foo").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,json.get("base").getAsJsonObject().get("t"),1898,json.get("base").getAsJsonObject().get("t").getAsString());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,sub.get("t"),1900,sub.get("t").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,sub,1902,sub.get("s"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a map, Gson ignores the more-specific type and sticks to the
     * declared type
     */
public void testMapOfParameterizedSubclassFields_literalMutation1587() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfParameterizedSubclassFields_literalMutation1587");
        Map<java.lang.String, ParameterizedBase<java.lang.String>> map = new HashMap<java.lang.String, ParameterizedBase<java.lang.String>>();
        map.put("base", new ParameterizedBase<java.lang.String>("one"));
        map.put("sub", new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,json.get("base").getAsJsonObject().get("t"),1898,json.get("base").getAsJsonObject().get("t").getAsString());
        JsonObject sub = json.get("foo").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,sub.get("t"),1900,sub.get("t").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,sub,1902,sub.get("s"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a map, Gson ignores the more-specific type and sticks to the
     * declared type
     */
@Test(timeout = 1000)
    public void testMapOfParameterizedSubclassFields_remove1106() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfParameterizedSubclassFields_remove1106");
        Map<java.lang.String, ParameterizedBase<java.lang.String>> map = new HashMap<java.lang.String, ParameterizedBase<java.lang.String>>();
        map.put("sub", new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,json.get("base").getAsJsonObject().get("t"),1898,json.get("base").getAsJsonObject().get("t").getAsString());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,sub.get("t"),1900,sub.get("t").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,sub,1902,sub.get("s"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * For parameterized type in a map, Gson ignores the more-specific type and sticks to the
     * declared type
     */
@Test(timeout = 1000)
    public void testMapOfParameterizedSubclassFields_remove1107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapOfParameterizedSubclassFields_remove1107");
        Map<java.lang.String, ParameterizedBase<java.lang.String>> map = new HashMap<java.lang.String, ParameterizedBase<java.lang.String>>();
        map.put("sub", new ParameterizedSub<java.lang.String>("two" , "three"));
        ClassWithContainersOfParameterizedBaseFields target = new ClassWithContainersOfParameterizedBaseFields(null , map);
        JsonObject json = gson.toJsonTree(target).getAsJsonObject().get("map").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1899,json.get("base").getAsJsonObject().get("t"),1898,json.get("base").getAsJsonObject().get("t").getAsString());
        JsonObject sub = json.get("sub").getAsJsonObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1901,sub.get("t"),1900,sub.get("t").getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1903,sub,1902,sub.get("s"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class Base {
        int b;

        Base(int b) {
            this.b = b;
        }
    }

    private static class Sub extends Base {
        int s;

        Sub(int b ,int s) {
            super(b);
            this.s = s;
        }
    }

    private static class ClassWithBaseFields {
        Base b;

        ClassWithBaseFields(Base b) {
            this.b = b;
        }
    }

    private static class ClassWithContainersOfBaseFields {
        Collection<Base> collection;

        Map<java.lang.String, Base> map;

        ClassWithContainersOfBaseFields(Collection<Base> collection ,Map<java.lang.String, Base> map) {
            this.collection = collection;
            this.map = map;
        }
    }

    private static class ParameterizedBase<T> {
        T t;

        ParameterizedBase(T t) {
            this.t = t;
        }
    }

    private static class ParameterizedSub<T> extends ParameterizedBase<T> {
        T s;

        ParameterizedSub(T t ,T s) {
            super(t);
            this.s = s;
        }
    }

    private static class ClassWithParameterizedBaseFields {
        ParameterizedBase<java.lang.String> b;

        ClassWithParameterizedBaseFields(ParameterizedBase<java.lang.String> b) {
            this.b = b;
        }
    }

    private static class ClassWithContainersOfParameterizedBaseFields {
        Collection<ParameterizedBase<java.lang.String>> collection;

        Map<java.lang.String, ParameterizedBase<java.lang.String>> map;

        ClassWithContainersOfParameterizedBaseFields(Collection<ParameterizedBase<java.lang.String>> collection ,Map<java.lang.String, ParameterizedBase<java.lang.String>> map) {
            this.collection = collection;
            this.map = map;
        }
    }
}

