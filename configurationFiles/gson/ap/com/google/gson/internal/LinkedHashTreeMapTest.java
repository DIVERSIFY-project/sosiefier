package com.google.gson.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.junit.Test;
import junit.framework.TestCase;

public final class LinkedHashTreeMapTest extends TestCase {
    @Test(timeout = 1000)
    public void testIterationOrder_add186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_add186");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_add187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_add187");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_add188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_add188");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_add189() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_add189");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_add190() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_add190");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation196() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation196");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "foo");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation197() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation197");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("foo", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation198() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation198");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "foo");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation199() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation199");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("foo", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation200() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation200");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "foo");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation201() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation201");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "foo", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation202() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation202");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "foo", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation203() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation203");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "foo");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation204() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation204");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "foo", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation205() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation205");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "foo", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation206() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation206");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_remove157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_remove157");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_remove158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_remove158");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_remove159() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_remove159");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_remove160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_remove160");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_remove161() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_remove161");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_add193() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add193");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_add194() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add194");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_add195() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add195");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_add196() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add196");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_add197() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add197");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_add198() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add198");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_add199() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add199");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_add200() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add200");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveRootDoesNotDoubleUnlink() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation211() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation211");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "foo");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation212() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation212");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("foo", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation213() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation213");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "foo");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation214() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation214");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("foo", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation215() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation215");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "foo");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation216() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation216");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "foo", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation217() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation217");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_remove162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_remove162");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_remove163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_remove163");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_remove164() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_remove164");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_remove165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_remove165");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        assertIterationOrder(map.keySet(), "a", "c");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveRootDoesNotDoubleUnlink_remove166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_remove166");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPutNullKeyFails_add192() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutNullKeyFails_add192");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        try {
            map.put(null, "android");
            map.put(null, "android");
        } catch (NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutNullKeyFails() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutNullKeyFails");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        try {
            map.put(null, "foo");
        } catch (NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPutNonComparableKeyFails_add191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutNonComparableKeyFails_add191");
        LinkedHashTreeMap<java.lang.Object, java.lang.String> map = new LinkedHashTreeMap<java.lang.Object, java.lang.String>();
        try {
            map.put(new Object(), "android");
            map.put(new Object(), "android");
        } catch (ClassCastException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutNonComparableKeyFails() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutNonComparableKeyFails");
        LinkedHashTreeMap<java.lang.Object, java.lang.String> map = new LinkedHashTreeMap<java.lang.Object, java.lang.String>();
        try {
            map.put(new Object(), "foo");
        } catch (ClassCastException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testContainsNonComparableKeyReturnsFalse_add169() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNonComparableKeyReturnsFalse_add169");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("a", "android");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),153,map,152,map.containsKey(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testContainsNonComparableKeyReturnsFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNonComparableKeyReturnsFalse");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "android");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),153,map,152,map.containsKey(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testContainsNonComparableKeyReturnsFalse_literalMutation144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNonComparableKeyReturnsFalse_literalMutation144");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),153,map,152,map.containsKey(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testContainsNonComparableKeyReturnsFalse_remove140() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNonComparableKeyReturnsFalse_remove140");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),153,map,152,map.containsKey(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testContainsNullKeyIsAlwaysFalse_add170() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNullKeyIsAlwaysFalse_add170");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("a", "android");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,map,154,map.containsKey(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testContainsNullKeyIsAlwaysFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNullKeyIsAlwaysFalse");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "android");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,map,154,map.containsKey(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testContainsNullKeyIsAlwaysFalse_literalMutation146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNullKeyIsAlwaysFalse_literalMutation146");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,map,154,map.containsKey(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testContainsNullKeyIsAlwaysFalse_remove141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNullKeyIsAlwaysFalse_remove141");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,map,154,map.containsKey(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutOverrides() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutOverrides");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),167,map,166,map.put("d", "donut"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),169,map,168,map.put("e", "eclair"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),171,map,170,map.put("f", "froyo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),173,map,172,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),175,map,174,map.get("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),177,map,176,map.put("d", "done"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),179,map,178,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyStringValues_add175() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyStringValues_add175");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "");
        map.put("a", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,map,157,map.containsKey("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,map,159,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyStringValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyStringValues");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,map,157,map.containsKey("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,map,159,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyStringValues_literalMutation171() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyStringValues_literalMutation171");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,map,157,map.containsKey("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,map,159,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyStringValues_remove146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyStringValues_remove146");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,map,157,map.containsKey("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,map,159,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testForceDoublingAndRehash_add185() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForceDoublingAndRehash_add185");
        Random random = new Random(1367593214724L);
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
            map.put(keys[i], ("" + i));
            map.put(keys[i], ("" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,map,161,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,map,164,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testForceDoublingAndRehash() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForceDoublingAndRehash");
        Random random = new Random(1367593214725L);
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
            map.put(keys[i], ("" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,map,161,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,map,164,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testForceDoublingAndRehash_literalMutation189() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForceDoublingAndRehash_literalMutation189");
        Random random = new Random(1367593214724L);
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1001];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
            map.put(keys[i], ("" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,map,161,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,map,164,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testForceDoublingAndRehash_literalMutation190() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForceDoublingAndRehash_literalMutation190");
        Random random = new Random(1367593214724L);
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 1 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
            map.put(keys[i], ("" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,map,161,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,map,164,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testForceDoublingAndRehash_literalMutation191() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForceDoublingAndRehash_literalMutation191");
        Random random = new Random(1367593214724L);
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 35)) + "-") + i;
            map.put(keys[i], ("" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,map,161,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,map,164,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testForceDoublingAndRehash_literalMutation192() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForceDoublingAndRehash_literalMutation192");
        Random random = new Random(1367593214724L);
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "foo") + i;
            map.put(keys[i], ("" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,map,161,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,map,164,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testForceDoublingAndRehash_literalMutation193() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForceDoublingAndRehash_literalMutation193");
        Random random = new Random(1367593214724L);
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
            map.put(keys[i], ("foo" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,map,161,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,map,164,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testForceDoublingAndRehash_literalMutation194() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForceDoublingAndRehash_literalMutation194");
        Random random = new Random(1367593214724L);
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
            map.put(keys[i], ("" + i));
        }
        for (int i = 1 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,map,161,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,map,164,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testForceDoublingAndRehash_remove156() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testForceDoublingAndRehash_remove156");
        Random random = new Random(1367593214724L);
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),162,map,161,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),163,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),165,map,164,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_add164() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add164");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_add165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add165");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_add166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add166");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_add167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add167");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_add168() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add168");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear_literalMutation138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation138");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "foo");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear_literalMutation139() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation139");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("foo", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear_literalMutation140() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation140");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "foo");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear_literalMutation141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation141");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("foo", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear_literalMutation142() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation142");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "foo");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_remove135() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove135");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_remove136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove136");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_remove137() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove137");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_remove138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove138");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_remove139() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove139");
        LinkedHashTreeMap<java.lang.String, java.lang.String> map = new LinkedHashTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),151,map,150,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add176() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add176");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add177() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add177");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add178() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add178");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add179() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add179");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add180() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add180");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add181() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add181");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add182() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add182");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add183() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add183");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add184() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add184");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("foo", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation173() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation173");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 0);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation174() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation174");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("foo", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation175() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation175");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 1);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation176() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation176");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("foo", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation177() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation177");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 2);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation178() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation178");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("foo", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation179() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation179");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 5);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation180() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation180");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("foo", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation181() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation181");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 2);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation182() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation182");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("foo", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation183() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation183");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 3);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation184() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation184");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("foo", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation185() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation185");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 5);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation186() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation186");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("foo", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation187() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation187");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 0);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove147() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove147");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove148() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove148");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove149() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove149");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove150() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove150");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove151() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove151");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove152() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove152");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove153() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove153");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove154() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove154");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove155() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove155");
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedHashTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedHashTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlWalker_add159() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_add159");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlWalker_add160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_add160");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlWalker_add161() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_add161");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlWalker_add162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_add162");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlWalker_add163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_add163");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation100");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "foo", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation101");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "foo", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation102");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "foo");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation104");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "foo", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation105");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("foo")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation106() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation106");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "foo", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation107");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("foo"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation108() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation108");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "foo", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation110");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "foo", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation111() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation111");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "foo", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation112");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "foo", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation113() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation113");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "foo", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation114() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation114");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "foo");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation116() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation116");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "foo", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation118() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation118");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "foo", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation120() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation120");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "foo", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation121() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation121");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("foo")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation122() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation122");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "foo", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation123");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "foo", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation124() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation124");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "foo", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation125() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation125");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "foo");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation126() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation126");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("foo"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation127() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation127");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "foo", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation129() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation129");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "foo", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation131() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation131");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "foo", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation133() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation133");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "foo", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation134() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation134");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "foo", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation135() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation135");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "foo", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation136");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker");
        assertAvlWalker(node(node("foo"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation84() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation84");
        assertAvlWalker(node(node("a"), "foo", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation85() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation85");
        assertAvlWalker(node(node("a"), "b", node("foo")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation86() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation86");
        assertAvlWalker(node(node("a"), "b", node("c")), "foo", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation87() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation87");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "foo", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation88() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation88");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "foo");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation89() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation89");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("foo"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation90() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation90");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "foo", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation91() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation91");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("foo")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation92() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation92");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "foo", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation93() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation93");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("foo"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation94() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation94");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "foo", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation95() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation95");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("foo"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation96() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation96");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "foo", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation97() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation97");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "foo", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation98() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation98");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "foo", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlWalker_literalMutation99() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_literalMutation99");
        assertAvlWalker(node(node("a"), "b", node("c")), "a", "b", "c");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "foo", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlWalker_remove130() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_remove130");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlWalker_remove131() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_remove131");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlWalker_remove132() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_remove132");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlWalker_remove133() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_remove133");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlWalker_remove134() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlWalker_remove134");
        assertAvlWalker(node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g"))), "a", "b", "c", "d", "e", "f", "g");
        assertAvlWalker(node(node(null, "a", node("b")), "c", node(node("d"), "e", null)), "a", "b", "c", "d", "e");
        assertAvlWalker(node(null, "a", node(null, "b", node(null, "c", node("d")))), "a", "b", "c", "d");
        assertAvlWalker(node(node(node(node("a"), "b", null), "c", null), "d", null), "a", "b", "c", "d");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void assertAvlWalker(LinkedHashTreeMap.Node<java.lang.String, java.lang.String> root, String... values) {
        LinkedHashTreeMap.AvlIterator<java.lang.String, java.lang.String> iterator = new LinkedHashTreeMap.AvlIterator<java.lang.String, java.lang.String>();
        iterator.reset(root);
        for (String value : values) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),137,value);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),139,iterator.next(),138,iterator.next().getKey());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),141,iterator,140,iterator.next());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add141");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add142() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add142");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add143() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add143");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add144");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add145() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add145");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add146");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add147() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add147");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add148() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add148");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add149() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add149");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add150() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add150");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add151");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add152() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add152");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add153");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add154");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add155");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add156");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add157");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_add158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_add158");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder");
        assertAvlBuilder(2, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation46() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation46");
        assertAvlBuilder(1, "foo");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation47() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation47");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(3, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation48() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation48");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "foo");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation49() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation49");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(2, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation50() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation50");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "foo");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation51() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation51");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(5, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation52() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation52");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "foo");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation53() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation53");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(6, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation54() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation54");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "foo");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation55() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation55");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(7, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation56() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation56");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "foo");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation57() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation57");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(6, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation58() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation58");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "foo");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation59() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation59");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(9, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation60() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation60");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "foo");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation61() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation61");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(8, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation62() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation62");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "foo");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation63() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation63");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(9, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation64() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation64");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "foo");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation65() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation65");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(10, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation66() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation66");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "foo");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation67() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation67");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(11, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation68() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation68");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "foo");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation69() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation69");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(14, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation70() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation70");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "foo");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation71() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation71");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(13, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation72() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation72");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "foo");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation73() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation73");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation74() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation74");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "foo");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation75() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation75");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation76() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation76");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "foo");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation77() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation77");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(31, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation78() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation78");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("foo" + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation79() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation79");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "foo"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation80() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation80");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(32, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation81() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation81");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("foo" + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAvlBuilder_literalMutation82() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_literalMutation82");
        assertAvlBuilder(1, "a");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "foo"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove112() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove112");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove113() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove113");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove114() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove114");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove115() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove115");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove116() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove116");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove117() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove117");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove118() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove118");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove119() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove119");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove120() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove120");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove121() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove121");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove122() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove122");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove123");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove124() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove124");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove125() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove125");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove126() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove126");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove127() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove127");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove128() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove128");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAvlBuilder_remove129() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAvlBuilder_remove129");
        assertAvlBuilder(2, "(. a b)");
        assertAvlBuilder(3, "(a b c)");
        assertAvlBuilder(4, "(a b (. c d))");
        assertAvlBuilder(5, "(a b (c d e))");
        assertAvlBuilder(6, "((. a b) c (d e f))");
        assertAvlBuilder(7, "((a b c) d (e f g))");
        assertAvlBuilder(8, "((a b c) d (e f (. g h)))");
        assertAvlBuilder(9, "((a b c) d (e f (g h i)))");
        assertAvlBuilder(10, "((a b c) d ((. e f) g (h i j)))");
        assertAvlBuilder(11, "((a b c) d ((e f g) h (i j k)))");
        assertAvlBuilder(12, "((a b (. c d)) e ((f g h) i (j k l)))");
        assertAvlBuilder(13, "((a b (c d e)) f ((g h i) j (k l m)))");
        assertAvlBuilder(14, "(((. a b) c (d e f)) g ((h i j) k (l m n)))");
        assertAvlBuilder(15, "(((a b c) d (e f g)) h ((i j k) l (m n o)))");
        assertAvlBuilder(16, "(((a b c) d (e f g)) h ((i j k) l (m n (. o p))))");
        assertAvlBuilder(30, ("((((. a b) c (d e f)) g ((h i j) k (l m n))) o " + "(((p q r) s (t u v)) w ((x y z) A (B C D))))"));
        assertAvlBuilder(31, ("((((a b c) d (e f g)) h ((i j k) l (m n o))) p " + "(((q r s) t (u v w)) x ((y z A) B (C D E))))"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void assertAvlBuilder(int size, String expected) {
        char[] values = "abcdefghijklmnopqrstuvwxyzABCDE".toCharArray();
        LinkedHashTreeMap.AvlBuilder<java.lang.String, java.lang.String> avlBuilder = new LinkedHashTreeMap.AvlBuilder<java.lang.String, java.lang.String>();
        avlBuilder.reset(size);
        for (int i = 0 ; i < size ; i++) {
            avlBuilder.add(node(java.lang.Character.toString(values[i])));
        }
        assertTree(expected, avlBuilder.root());
    }

    @Test(timeout = 1000)
    public void testDoubleCapacity_add171() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_add171");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleCapacity_add172() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_add172");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation148() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation148");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[0];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation149() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation149");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[1] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation150() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation150");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("foo"), "b", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation151");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "foo", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation152() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation152");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("foo")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation153");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "foo", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation154");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("foo"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation155");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "foo", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation156");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("foo")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation157");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("foo", newTable[0]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation158");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[1]);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation159() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation159");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("foo", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacity_literalMutation160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_literalMutation160");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(a c (. e g))", newTable[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleCapacity_remove142() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_remove142");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleCapacity_remove143() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacity_remove143");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node(node("a"), "b", node("c")), "d", node(node("e"), "f", node("g")));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(a c (. e g))", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleCapacityAllNodesOnLeft_add173() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacityAllNodesOnLeft_add173");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node("b"), "d", node("f"));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        assertTree("(b d f)", newTable[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,newTable[1]);
        for (LinkedHashTreeMap.Node<?, ?> node : newTable) {
            if (node != null) {
                assertConsistent(node);
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleCapacityAllNodesOnLeft_add174() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacityAllNodesOnLeft_add174");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node("b"), "d", node("f"));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,newTable[1]);
        for (LinkedHashTreeMap.Node<?, ?> node : newTable) {
            if (node != null) {
                assertConsistent(node);
                assertConsistent(node);
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacityAllNodesOnLeft() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacityAllNodesOnLeft");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node("b"), "d", node("f"));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,newTable[1]);
        for (LinkedHashTreeMap.Node<?, ?> node : newTable) {
            if (node != null) {
                assertConsistent(node);
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacityAllNodesOnLeft_literalMutation162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacityAllNodesOnLeft_literalMutation162");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[0];
        oldTable[0] = node(node("b"), "d", node("f"));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,newTable[1]);
        for (LinkedHashTreeMap.Node<?, ?> node : newTable) {
            if (node != null) {
                assertConsistent(node);
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacityAllNodesOnLeft_literalMutation163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacityAllNodesOnLeft_literalMutation163");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[1] = node(node("b"), "d", node("f"));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,newTable[1]);
        for (LinkedHashTreeMap.Node<?, ?> node : newTable) {
            if (node != null) {
                assertConsistent(node);
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacityAllNodesOnLeft_literalMutation164() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacityAllNodesOnLeft_literalMutation164");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node("foo"), "d", node("f"));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,newTable[1]);
        for (LinkedHashTreeMap.Node<?, ?> node : newTable) {
            if (node != null) {
                assertConsistent(node);
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacityAllNodesOnLeft_literalMutation165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacityAllNodesOnLeft_literalMutation165");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node("b"), "foo", node("f"));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,newTable[1]);
        for (LinkedHashTreeMap.Node<?, ?> node : newTable) {
            if (node != null) {
                assertConsistent(node);
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacityAllNodesOnLeft_literalMutation166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacityAllNodesOnLeft_literalMutation166");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node("b"), "d", node("foo"));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,newTable[1]);
        for (LinkedHashTreeMap.Node<?, ?> node : newTable) {
            if (node != null) {
                assertConsistent(node);
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacityAllNodesOnLeft_literalMutation167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacityAllNodesOnLeft_literalMutation167");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node("b"), "d", node("f"));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("foo", newTable[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,newTable[1]);
        for (LinkedHashTreeMap.Node<?, ?> node : newTable) {
            if (node != null) {
                assertConsistent(node);
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDoubleCapacityAllNodesOnLeft_literalMutation168() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacityAllNodesOnLeft_literalMutation168");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node("b"), "d", node("f"));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,newTable[1]);
        for (LinkedHashTreeMap.Node<?, ?> node : newTable) {
            if (node != null) {
                assertConsistent(node);
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleCapacityAllNodesOnLeft_remove144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacityAllNodesOnLeft_remove144");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node("b"), "d", node("f"));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,newTable[1]);
        for (LinkedHashTreeMap.Node<?, ?> node : newTable) {
            if (node != null) {
                assertConsistent(node);
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDoubleCapacityAllNodesOnLeft_remove145() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDoubleCapacityAllNodesOnLeft_remove145");
        @SuppressWarnings(value = "unchecked")
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] oldTable = new LinkedHashTreeMap.Node[1];
        oldTable[0] = node(node("b"), "d", node("f"));
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String>[] newTable = LinkedHashTreeMap.doubleCapacity(oldTable);
        assertTree("(b d f)", newTable[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),156,newTable[1]);
        for (LinkedHashTreeMap.Node<?, ?> node : newTable) {
            if (node != null) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static final LinkedHashTreeMap.Node<java.lang.String, java.lang.String> head = new LinkedHashTreeMap.Node<java.lang.String, java.lang.String>();

    private LinkedHashTreeMap.Node<java.lang.String, java.lang.String> node(String value) {
        return new LinkedHashTreeMap.Node<java.lang.String, java.lang.String>(null , value , value.hashCode() , head , head);
    }

    private LinkedHashTreeMap.Node<java.lang.String, java.lang.String> node(LinkedHashTreeMap.Node<java.lang.String, java.lang.String> left, String value, LinkedHashTreeMap.Node<java.lang.String, java.lang.String> right) {
        LinkedHashTreeMap.Node<java.lang.String, java.lang.String> result = node(value);
        if (left != null) {
            result.left = left;
            left.parent = result;
        } 
        if (right != null) {
            result.right = right;
            right.parent = result;
        } 
        return result;
    }

    private void assertTree(String expected, LinkedHashTreeMap.Node<?, ?> root) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),147,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),149,null,148,toString(root));
        assertConsistent(root);
    }

    private void assertConsistent(LinkedHashTreeMap.Node<?, ?> node) {
        int leftHeight = 0;
        if ((node.left) != null) {
            assertConsistent(node.left);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),142,node);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),143,node.left.parent);
            leftHeight = node.left.height;
        } 
        int rightHeight = 0;
        if ((node.right) != null) {
            assertConsistent(node.right);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),144,node);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),145,node.right.parent);
            rightHeight = node.right.height;
        } 
        if ((node.parent) != null) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),146,(((node.parent.left) == node) || ((node.parent.right) == node)));
        } 
        if (((java.lang.Math.max(leftHeight, rightHeight)) + 1) != (node.height)) {
        } 
    }

    private String toString(LinkedHashTreeMap.Node<?, ?> root) {
        if (root == null) {
            return ".";
        } else if (((root.left) == null) && ((root.right) == null)) {
            return String.valueOf(root.key);
        } else {
            return String.format("(%s %s %s)", toString(root.left), root.key, toString(root.right));
        }
    }

    private <T>void assertIterationOrder(Iterable<T> actual, T... expected) {
        ArrayList<T> actualList = new ArrayList<T>();
        for (T t : actual) {
            actualList.add(t);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),135,null,134,java.util.Arrays.asList(expected));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),136,actualList);
    }
}

