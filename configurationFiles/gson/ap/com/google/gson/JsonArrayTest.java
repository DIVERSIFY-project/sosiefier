package com.google.gson;

import org.junit.Test;
import junit.framework.TestCase;

/** 
 * @author Jesse Wilson
 */
public final class JsonArrayTest extends TestCase {
    @Test(timeout = 1000)
    public void testEqualsOnEmptyArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsOnEmptyArray");
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonArray(), new JsonArray());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(new JsonArray(), new JsonArray());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsOnEmptyArray_remove1275() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsOnEmptyArray_remove1275");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyArray");
        JsonArray a = new JsonArray();
        JsonArray b = new JsonArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        a.add(new com.google.gson.JsonObject());
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,a,2790,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,b,2792,b.equals(a));
        b.add(new com.google.gson.JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,a,2794,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,b,2796,b.equals(a));
        b.add(com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2799,a,2798,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,b,2800,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyArray_add1553() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyArray_add1553");
        JsonArray a = new JsonArray();
        JsonArray b = new JsonArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,a,2790,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,b,2792,b.equals(a));
        b.add(new com.google.gson.JsonObject());
        b.add(new com.google.gson.JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,a,2794,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,b,2796,b.equals(a));
        b.add(com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2799,a,2798,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,b,2800,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyArray_add1554() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyArray_add1554");
        JsonArray a = new JsonArray();
        JsonArray b = new JsonArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,a,2790,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,b,2792,b.equals(a));
        b.add(new com.google.gson.JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,a,2794,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,b,2796,b.equals(a));
        b.add(com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2799,a,2798,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,b,2800,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyArray_add1555() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyArray_add1555");
        JsonArray a = new JsonArray();
        JsonArray b = new JsonArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,a,2790,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,b,2792,b.equals(a));
        b.add(new com.google.gson.JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add(new com.google.gson.JsonObject());
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,a,2794,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,b,2796,b.equals(a));
        b.add(com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2799,a,2798,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,b,2800,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyArray_add1556() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyArray_add1556");
        JsonArray a = new JsonArray();
        JsonArray b = new JsonArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,a,2790,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,b,2792,b.equals(a));
        b.add(new com.google.gson.JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,a,2794,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,b,2796,b.equals(a));
        b.add(com.google.gson.JsonNull.INSTANCE);
        b.add(com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2799,a,2798,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,b,2800,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyArray_remove1270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyArray_remove1270");
        JsonArray a = new JsonArray();
        JsonArray b = new JsonArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,a,2790,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,b,2792,b.equals(a));
        b.add(new com.google.gson.JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,a,2794,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,b,2796,b.equals(a));
        b.add(com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2799,a,2798,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,b,2800,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyArray_remove1271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyArray_remove1271");
        JsonArray a = new JsonArray();
        JsonArray b = new JsonArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,a,2790,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,b,2792,b.equals(a));
        b.add(new com.google.gson.JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,a,2794,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,b,2796,b.equals(a));
        b.add(com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2799,a,2798,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,b,2800,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyArray_remove1272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyArray_remove1272");
        JsonArray a = new JsonArray();
        JsonArray b = new JsonArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,a,2790,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,b,2792,b.equals(a));
        b.add(new com.google.gson.JsonObject());
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,a,2794,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,b,2796,b.equals(a));
        b.add(com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2799,a,2798,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,b,2800,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyArray_remove1273() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyArray_remove1273");
        JsonArray a = new JsonArray();
        JsonArray b = new JsonArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,a,2790,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,b,2792,b.equals(a));
        b.add(new com.google.gson.JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,a,2794,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,b,2796,b.equals(a));
        b.add(com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2799,a,2798,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,b,2800,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsNonEmptyArray_remove1274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsNonEmptyArray_remove1274");
        JsonArray a = new JsonArray();
        JsonArray b = new JsonArray();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2789,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,a,2790,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,b,2792,b.equals(a));
        b.add(new com.google.gson.JsonObject());
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(a, b);
        a.add(new com.google.gson.JsonObject());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,a,2794,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,b,2796,b.equals(a));
        b.add(com.google.gson.JsonNull.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2799,a,2798,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,b,2800,b.equals(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add1558() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1558");
        JsonArray array = new JsonArray();
        try {
            array.remove(0);
            array.remove(0);
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,array,2802,array.remove(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,array,2804,array.contains(a));
        array.add(a);
        array.add(new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,array.remove(1),2806,array.remove(1).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,array,2808,array.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2811,array,2810,array.contains(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add1559() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1559");
        JsonArray array = new JsonArray();
        try {
            array.remove(0);
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,array,2802,array.remove(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,array,2804,array.contains(a));
        array.add(a);
        array.add(new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,array.remove(1),2806,array.remove(1).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,array,2808,array.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2811,array,2810,array.contains(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add1560() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1560");
        JsonArray array = new JsonArray();
        try {
            array.remove(0);
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,array,2802,array.remove(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,array,2804,array.contains(a));
        array.add(a);
        array.add(a);
        array.add(new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,array.remove(1),2806,array.remove(1).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,array,2808,array.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2811,array,2810,array.contains(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add1561() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1561");
        JsonArray array = new JsonArray();
        try {
            array.remove(0);
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,array,2802,array.remove(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,array,2804,array.contains(a));
        array.add(a);
        array.add(new JsonPrimitive("b"));
        array.add(new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,array.remove(1),2806,array.remove(1).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,array,2808,array.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2811,array,2810,array.contains(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove");
        JsonArray array = new JsonArray();
        try {
            array.remove(-1);
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,array,2802,array.remove(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,array,2804,array.contains(a));
        array.add(a);
        array.add(new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,array.remove(1),2806,array.remove(1).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,array,2808,array.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2811,array,2810,array.contains(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemove_literalMutation2261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_literalMutation2261");
        JsonArray array = new JsonArray();
        try {
            array.remove(0);
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("foo");
        array.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,array,2802,array.remove(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,array,2804,array.contains(a));
        array.add(a);
        array.add(new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,array.remove(1),2806,array.remove(1).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,array,2808,array.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2811,array,2810,array.contains(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemove_literalMutation2262() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_literalMutation2262");
        JsonArray array = new JsonArray();
        try {
            array.remove(0);
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,array,2802,array.remove(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,array,2804,array.contains(a));
        array.add(a);
        array.add(new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,array.remove(1),2806,array.remove(1).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,array,2808,array.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2811,array,2810,array.contains(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove1276() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove1276");
        JsonArray array = new JsonArray();
        try {
            array.remove(0);
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,array,2802,array.remove(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,array,2804,array.contains(a));
        array.add(a);
        array.add(new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,array.remove(1),2806,array.remove(1).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,array,2808,array.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2811,array,2810,array.contains(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove1277() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove1277");
        JsonArray array = new JsonArray();
        try {
            array.remove(0);
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,array,2802,array.remove(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,array,2804,array.contains(a));
        array.add(a);
        array.add(new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,array.remove(1),2806,array.remove(1).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,array,2808,array.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2811,array,2810,array.contains(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove1278() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove1278");
        JsonArray array = new JsonArray();
        try {
            array.remove(0);
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,array,2802,array.remove(a));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,array,2804,array.contains(a));
        array.add(a);
        array.add(new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,array.remove(1),2806,array.remove(1).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,array,2808,array.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2811,array,2810,array.contains(a));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSet_add1562() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add1562");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.set(0, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSet_add1563() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add1563");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.add(a);
        array.set(0, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSet_add1564() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add1564");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.set(0, new JsonPrimitive("b"));
        array.set(0, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSet_add1565() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add1565");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.set(0, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSet_add1566() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add1566");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.set(0, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet");
        JsonArray array = new JsonArray();
        try {
            array.set(-1, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.set(0, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSet_literalMutation2264() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation2264");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(0));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.set(0, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSet_literalMutation2265() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation2265");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("foo");
        array.add(a);
        array.set(0, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSet_literalMutation2266() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation2266");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.set(1, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSet_literalMutation2267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation2267");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.set(0, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSet_literalMutation2268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation2268");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.set(0, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(-1, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSet_literalMutation2270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation2270");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.set(0, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(1, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSet_literalMutation2271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_literalMutation2271");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        array.set(0, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSet_remove1279() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_remove1279");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.set(0, new JsonPrimitive("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSet_remove1280() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_remove1280");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSet_remove1281() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_remove1281");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testSet_remove1282() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_remove1282");
        JsonArray array = new JsonArray();
        try {
            array.set(0, new JsonPrimitive(1));
        } catch (IndexOutOfBoundsException expected) {
        }
        JsonPrimitive a = new JsonPrimitive("a");
        array.add(a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2813,array.get(0),2812,array.get(0).getAsString());
        array.set(0, null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2815,array,2814,array.get(0));
        array.set(0, new JsonPrimitive("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2817,array.get(0),2816,array.get(0).getAsString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2819,array,2818,array.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepCopy_add1549() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_add1549");
        JsonArray original = new JsonArray();
        JsonArray firstEntry = new JsonArray();
        original.add(firstEntry);
        original.add(firstEntry);
        JsonArray copy = original.deepCopy();
        original.add(new JsonPrimitive("y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,copy,2783,copy.size());
        firstEntry.add(new JsonPrimitive("z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,original.get(0).getAsJsonArray(),2785,original.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,copy.get(0).getAsJsonArray(),2787,copy.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepCopy_add1550() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_add1550");
        JsonArray original = new JsonArray();
        JsonArray firstEntry = new JsonArray();
        original.add(firstEntry);
        JsonArray copy = original.deepCopy();
        original.add(new JsonPrimitive("y"));
        original.add(new JsonPrimitive("y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,copy,2783,copy.size());
        firstEntry.add(new JsonPrimitive("z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,original.get(0).getAsJsonArray(),2785,original.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,copy.get(0).getAsJsonArray(),2787,copy.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepCopy_add1551() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_add1551");
        JsonArray original = new JsonArray();
        JsonArray firstEntry = new JsonArray();
        original.add(firstEntry);
        JsonArray copy = original.deepCopy();
        original.add(new JsonPrimitive("y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,copy,2783,copy.size());
        firstEntry.add(new JsonPrimitive("z"));
        firstEntry.add(new JsonPrimitive("z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,original.get(0).getAsJsonArray(),2785,original.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,copy.get(0).getAsJsonArray(),2787,copy.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepCopy() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy");
        JsonArray original = new JsonArray();
        JsonArray firstEntry = new JsonArray();
        original.add(firstEntry);
        JsonArray copy = original.deepCopy();
        original.add(new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,copy,2783,copy.size());
        firstEntry.add(new JsonPrimitive("z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,original.get(0).getAsJsonArray(),2785,original.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,copy.get(0).getAsJsonArray(),2787,copy.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDeepCopy_literalMutation2259() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_literalMutation2259");
        JsonArray original = new JsonArray();
        JsonArray firstEntry = new JsonArray();
        original.add(firstEntry);
        JsonArray copy = original.deepCopy();
        original.add(new JsonPrimitive("y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,copy,2783,copy.size());
        firstEntry.add(new JsonPrimitive("foo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,original.get(0).getAsJsonArray(),2785,original.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,copy.get(0).getAsJsonArray(),2787,copy.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepCopy_remove1267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_remove1267");
        JsonArray original = new JsonArray();
        JsonArray firstEntry = new JsonArray();
        JsonArray copy = original.deepCopy();
        original.add(new JsonPrimitive("y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,copy,2783,copy.size());
        firstEntry.add(new JsonPrimitive("z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,original.get(0).getAsJsonArray(),2785,original.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,copy.get(0).getAsJsonArray(),2787,copy.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepCopy_remove1268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_remove1268");
        JsonArray original = new JsonArray();
        JsonArray firstEntry = new JsonArray();
        JsonArray copy = original.deepCopy();
        original.add(new JsonPrimitive("y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,copy,2783,copy.size());
        firstEntry.add(new JsonPrimitive("z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,original.get(0).getAsJsonArray(),2785,original.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,copy.get(0).getAsJsonArray(),2787,copy.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDeepCopy_remove1269() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDeepCopy_remove1269");
        JsonArray original = new JsonArray();
        JsonArray firstEntry = new JsonArray();
        JsonArray copy = original.deepCopy();
        original.add(new JsonPrimitive("y"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,copy,2783,copy.size());
        firstEntry.add(new JsonPrimitive("z"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,original.get(0).getAsJsonArray(),2785,original.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,copy.get(0).getAsJsonArray(),2787,copy.get(0).getAsJsonArray().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

