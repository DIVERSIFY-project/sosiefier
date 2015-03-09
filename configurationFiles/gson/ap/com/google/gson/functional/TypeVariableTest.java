package com.google.gson.functional;

import java.util.ArrayList;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/** 
 * Functional test for Gson serialization and deserialization of
 * classes with type variables.
 * 
 * @author Joel Leitch
 */
public class TypeVariableTest extends TestCase {
    @Test(timeout = 1000)
    public void testAdvancedTypeVariables_add1448() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_add1448");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdvancedTypeVariables_add1449() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_add1449");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdvancedTypeVariables_add1450() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_add1450");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdvancedTypeVariables_add1451() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_add1451");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdvancedTypeVariables_add1452() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_add1452");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAdvancedTypeVariables() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables");
        Gson gson = new Gson();
        Bar bar1 = new Bar("foo" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAdvancedTypeVariables_literalMutation2074() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_literalMutation2074");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 2 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAdvancedTypeVariables_literalMutation2075() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_literalMutation2075");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , false);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAdvancedTypeVariables_literalMutation2076() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_literalMutation2076");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAdvancedTypeVariables_literalMutation2077() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_literalMutation2077");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAdvancedTypeVariables_literalMutation2078() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_literalMutation2078");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAdvancedTypeVariables_literalMutation2079() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_literalMutation2079");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("foo", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAdvancedTypeVariables_literalMutation2080() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_literalMutation2080");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("foo", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdvancedTypeVariables_remove1198() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_remove1198");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdvancedTypeVariables_remove1199() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_remove1199");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdvancedTypeVariables_remove1200() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_remove1200");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key1", arrayList);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdvancedTypeVariables_remove1201() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_remove1201");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAdvancedTypeVariables_remove1202() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdvancedTypeVariables_remove1202");
        Gson gson = new Gson();
        Bar bar1 = new Bar("someString" , 1 , true);
        ArrayList<java.lang.Integer> arrayList = new ArrayList<java.lang.Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        bar1.map.put("key2", new ArrayList<java.lang.Integer>());
        String json = gson.toJson(bar1);
        Bar bar2 = gson.fromJson(json, Bar.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2580,bar1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2581,bar2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypeVariablesViaTypeParameter_add1453() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeVariablesViaTypeParameter_add1453");
        Gson gson = new Gson();
        Foo<java.lang.String, java.lang.Integer> original = new Foo<java.lang.String, java.lang.Integer>("e" , 5 , false);
        original.map.put("f", java.util.Arrays.asList(6, 7));
        original.map.put("f", java.util.Arrays.asList(6, 7));
        Type type = new TypeToken<Foo<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2584,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2585,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,gson,2586,gson.<com.google.gson.functional.TypeVariableTest.Foo<java.lang.String, java.lang.Integer>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypeVariablesViaTypeParameter_add1454() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeVariablesViaTypeParameter_add1454");
        Gson gson = new Gson();
        Foo<java.lang.String, java.lang.Integer> original = new Foo<java.lang.String, java.lang.Integer>("e" , 5 , false);
        original.map.put("f", java.util.Arrays.asList(6, 7));
        Type type = new TypeToken<Foo<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2584,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2585,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,gson,2586,gson.<com.google.gson.functional.TypeVariableTest.Foo<java.lang.String, java.lang.Integer>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeVariablesViaTypeParameter() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeVariablesViaTypeParameter");
        Gson gson = new Gson();
        Foo<java.lang.String, java.lang.Integer> original = new Foo<java.lang.String, java.lang.Integer>("foo" , 5 , false);
        original.map.put("f", java.util.Arrays.asList(6, 7));
        Type type = new TypeToken<Foo<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2584,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2585,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,gson,2586,gson.<com.google.gson.functional.TypeVariableTest.Foo<java.lang.String, java.lang.Integer>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeVariablesViaTypeParameter_literalMutation2083() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeVariablesViaTypeParameter_literalMutation2083");
        Gson gson = new Gson();
        Foo<java.lang.String, java.lang.Integer> original = new Foo<java.lang.String, java.lang.Integer>("e" , 6 , false);
        original.map.put("f", java.util.Arrays.asList(6, 7));
        Type type = new TypeToken<Foo<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2584,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2585,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,gson,2586,gson.<com.google.gson.functional.TypeVariableTest.Foo<java.lang.String, java.lang.Integer>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeVariablesViaTypeParameter_literalMutation2084() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeVariablesViaTypeParameter_literalMutation2084");
        Gson gson = new Gson();
        Foo<java.lang.String, java.lang.Integer> original = new Foo<java.lang.String, java.lang.Integer>("e" , 5 , true);
        original.map.put("f", java.util.Arrays.asList(6, 7));
        Type type = new TypeToken<Foo<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2584,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2585,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,gson,2586,gson.<com.google.gson.functional.TypeVariableTest.Foo<java.lang.String, java.lang.Integer>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeVariablesViaTypeParameter_literalMutation2085() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeVariablesViaTypeParameter_literalMutation2085");
        Gson gson = new Gson();
        Foo<java.lang.String, java.lang.Integer> original = new Foo<java.lang.String, java.lang.Integer>("e" , 5 , false);
        original.map.put("foo", java.util.Arrays.asList(6, 7));
        Type type = new TypeToken<Foo<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2584,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2585,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,gson,2586,gson.<com.google.gson.functional.TypeVariableTest.Foo<java.lang.String, java.lang.Integer>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeVariablesViaTypeParameter_literalMutation2086() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeVariablesViaTypeParameter_literalMutation2086");
        Gson gson = new Gson();
        Foo<java.lang.String, java.lang.Integer> original = new Foo<java.lang.String, java.lang.Integer>("e" , 5 , false);
        original.map.put("f", java.util.Arrays.asList(5, 7));
        Type type = new TypeToken<Foo<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2584,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2585,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,gson,2586,gson.<com.google.gson.functional.TypeVariableTest.Foo<java.lang.String, java.lang.Integer>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTypeVariablesViaTypeParameter_literalMutation2087() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeVariablesViaTypeParameter_literalMutation2087");
        Gson gson = new Gson();
        Foo<java.lang.String, java.lang.Integer> original = new Foo<java.lang.String, java.lang.Integer>("e" , 5 , false);
        original.map.put("f", java.util.Arrays.asList(6, 8));
        Type type = new TypeToken<Foo<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2584,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2585,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,gson,2586,gson.<com.google.gson.functional.TypeVariableTest.Foo<java.lang.String, java.lang.Integer>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypeVariablesViaTypeParameter_remove1203() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeVariablesViaTypeParameter_remove1203");
        Gson gson = new Gson();
        Foo<java.lang.String, java.lang.Integer> original = new Foo<java.lang.String, java.lang.Integer>("e" , 5 , false);
        Type type = new TypeToken<Foo<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2584,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2585,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,gson,2586,gson.<com.google.gson.functional.TypeVariableTest.Foo<java.lang.String, java.lang.Integer>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTypeVariablesViaTypeParameter_remove1204() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTypeVariablesViaTypeParameter_remove1204");
        Gson gson = new Gson();
        Foo<java.lang.String, java.lang.Integer> original = new Foo<java.lang.String, java.lang.Integer>("e" , 5 , false);
        original.map.put("f", java.util.Arrays.asList(6, 7));
        Type type = new TypeToken<Foo<java.lang.String, java.lang.Integer>>() {        }.getType();
        String json = gson.toJson(original, type);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2584,json);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2585,original);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2587,gson,2586,gson.<com.google.gson.functional.TypeVariableTest.Foo<java.lang.String, java.lang.Integer>>fromJson(json, type));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBasicTypeVariables() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBasicTypeVariables");
        Gson gson = new Gson();
        Blue blue1 = new Blue(true);
        String json = gson.toJson(blue1);
        Blue blue2 = gson.fromJson(json, Blue.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2582,blue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2583,blue2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public static class Blue extends Red<java.lang.Boolean> {
        public Blue() {
            super(false);
        }

        public Blue(boolean value) {
            super(value);
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Blue)) {
                return false;
            } 
            Blue blue = ((Blue)(o));
            return redField.equals(blue.redField);
        }
    }

    public static class Red<S> {
        protected S redField;

        public Red() {
        }

        public Red(S redField) {
            this.redField = redField;
        }
    }

    public static class Foo<S, T> extends Red<java.lang.Boolean> {
        private S someSField;

        private T someTField;

        public final Map<S, java.util.List<T>> map = new HashMap<S, java.util.List<T>>();

        public Foo() {
        }

        public Foo(S sValue ,T tValue ,Boolean redField) {
            super(redField);
            this.someSField = sValue;
            this.someTField = tValue;
        }

        @Override
        @SuppressWarnings(value = "unchecked")
        public boolean equals(Object o) {
            if (!(o instanceof Foo<?, ?>)) {
                return false;
            } 
            Foo<S, T> realFoo = ((Foo<S, T>)(o));
            return (((redField.equals(realFoo.redField)) && (someTField.equals(realFoo.someTField))) && (someSField.equals(realFoo.someSField))) && (map.equals(realFoo.map));
        }
    }

    public static class Bar extends Foo<java.lang.String, java.lang.Integer> {
        public Bar() {
            this("", 0, false);
        }

        public Bar(String s ,Integer i ,boolean b) {
            super(s, i, b);
        }
    }
}

