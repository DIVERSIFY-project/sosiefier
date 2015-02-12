package com.google.gson.functional;

import java.util.Collection;
import com.google.gson.Gson;
import org.junit.Test;
import junit.framework.TestCase;

/** 
 * Unit tests to validate serialization of parameterized types without explicit types
 * 
 * @author Inderjeet Singh
 */
public class RawSerializationTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    public void testCollectionOfPrimitives() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfPrimitives");
        Collection<java.lang.Integer> ints = java.util.Arrays.asList(2, 2, 3, 4, 5);
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2383,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfPrimitives_literalMutation1910() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfPrimitives_literalMutation1910");
        Collection<java.lang.Integer> ints = java.util.Arrays.asList(1, 3, 3, 4, 5);
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2383,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfPrimitives_literalMutation1911() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfPrimitives_literalMutation1911");
        Collection<java.lang.Integer> ints = java.util.Arrays.asList(1, 2, 2, 4, 5);
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2383,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfPrimitives_literalMutation1912() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfPrimitives_literalMutation1912");
        Collection<java.lang.Integer> ints = java.util.Arrays.asList(1, 2, 3, 5, 5);
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2383,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfPrimitives_literalMutation1913() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfPrimitives_literalMutation1913");
        Collection<java.lang.Integer> ints = java.util.Arrays.asList(1, 2, 3, 4, 4);
        String json = gson.toJson(ints);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2383,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfObjects() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjects");
        Collection<Foo> foos = java.util.Arrays.asList(new Foo(2), new Foo(2));
        String json = gson.toJson(foos);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1558,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollectionOfObjects_literalMutation1908() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollectionOfObjects_literalMutation1908");
        Collection<Foo> foos = java.util.Arrays.asList(new Foo(1), new Foo(1));
        String json = gson.toJson(foos);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1558,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedObject_add1412() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedObject_add1412");
        Bar<Foo> bar = new Bar<Foo>(new Foo(1));
        String expectedJson = "{\"t\":{\"b\":1}}";
        String json = gson.toJson(bar);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<Bar<Foo>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2385,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedObject() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedObject");
        Bar<Foo> bar = new Bar<Foo>(new Foo(0));
        String expectedJson = "{\"t\":{\"b\":1}}";
        String json = gson.toJson(bar);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<Bar<Foo>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2385,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParameterizedObject_literalMutation1915() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedObject_literalMutation1915");
        Bar<Foo> bar = new Bar<Foo>(new Foo(1));
        String expectedJson = "foo";
        String json = gson.toJson(bar);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<Bar<Foo>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2385,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParameterizedObject_remove1168() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParameterizedObject_remove1168");
        Bar<Foo> bar = new Bar<Foo>(new Foo(1));
        String expectedJson = "{\"t\":{\"b\":1}}";
        String json = gson.toJson(bar);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2384,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1895,json);
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<Bar<Foo>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2385,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2386,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTwoLevelParameterizedObject_add1414() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoLevelParameterizedObject_add1414");
        Bar<Bar<Foo>> bar = new Bar<Bar<Foo>>(new Bar<Foo>(new Foo(1)));
        String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        String json = gson.toJson(bar);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2389,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1614,json);
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<Bar<Bar<Foo>>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1687,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTwoLevelParameterizedObject() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoLevelParameterizedObject");
        Bar<Bar<Foo>> bar = new Bar<Bar<Foo>>(new Bar<Foo>(new Foo(0)));
        String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        String json = gson.toJson(bar);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2389,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1614,json);
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<Bar<Bar<Foo>>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1687,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTwoLevelParameterizedObject_literalMutation1919() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoLevelParameterizedObject_literalMutation1919");
        Bar<Bar<Foo>> bar = new Bar<Bar<Foo>>(new Bar<Foo>(new Foo(1)));
        String expectedJson = "foo";
        String json = gson.toJson(bar);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2389,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1614,json);
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<Bar<Bar<Foo>>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1687,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTwoLevelParameterizedObject_remove1170() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTwoLevelParameterizedObject_remove1170");
        Bar<Bar<Foo>> bar = new Bar<Bar<Foo>>(new Bar<Foo>(new Foo(1)));
        String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        String json = gson.toJson(bar);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2389,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1614,json);
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<Bar<Bar<Foo>>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2390,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1687,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testThreeLevelParameterizedObject_add1413() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThreeLevelParameterizedObject_add1413");
        Bar<Bar<Bar<Foo>>> bar = new Bar<Bar<Bar<Foo>>>(new Bar<Bar<Foo>>(new Bar<Foo>(new Foo(1))));
        String expectedJson = "{\"t\":{\"t\":{\"t\":{\"b\":1}}}}";
        String json = gson.toJson(bar);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2387,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,json);
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<Bar<Bar<Bar<Foo>>>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testThreeLevelParameterizedObject() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThreeLevelParameterizedObject");
        Bar<Bar<Bar<Foo>>> bar = new Bar<Bar<Bar<Foo>>>(new Bar<Bar<Foo>>(new Bar<Foo>(new Foo(2))));
        String expectedJson = "{\"t\":{\"t\":{\"t\":{\"b\":1}}}}";
        String json = gson.toJson(bar);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2387,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,json);
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<Bar<Bar<Bar<Foo>>>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testThreeLevelParameterizedObject_literalMutation1917() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThreeLevelParameterizedObject_literalMutation1917");
        Bar<Bar<Bar<Foo>>> bar = new Bar<Bar<Bar<Foo>>>(new Bar<Bar<Foo>>(new Bar<Foo>(new Foo(1))));
        String expectedJson = "foo";
        String json = gson.toJson(bar);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2387,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,json);
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<Bar<Bar<Bar<Foo>>>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testThreeLevelParameterizedObject_remove1169() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testThreeLevelParameterizedObject_remove1169");
        Bar<Bar<Bar<Foo>>> bar = new Bar<Bar<Bar<Foo>>>(new Bar<Bar<Foo>>(new Bar<Foo>(new Foo(1))));
        String expectedJson = "{\"t\":{\"t\":{\"t\":{\"b\":1}}}}";
        String json = gson.toJson(bar);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2387,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1685,json);
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<Bar<Bar<Bar<Foo>>>>() {        }.getType());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2388,expectedJson);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1674,json);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class Foo {
        @SuppressWarnings(value = "unused")
        int b;

        Foo(int b) {
            this.b = b;
        }
    }

    private static class Bar<T> {
        @SuppressWarnings(value = "unused")
        T t;

        Bar(T t) {
            this.t = t;
        }
    }
}

