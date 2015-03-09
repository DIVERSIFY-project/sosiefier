package com.google.gson.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.junit.Test;
import junit.framework.TestCase;

public final class LinkedTreeMapTest extends TestCase {
    public void testIterationOrder() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_add218() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_add218");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_add219() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_add219");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_add220() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_add220");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_add221() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_add221");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_add222() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_add222");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation246() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation246");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation247() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation247");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "foo");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation248() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation248");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("foo", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation249() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation249");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "foo");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation250() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation250");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("foo", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation251() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation251");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "foo");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation252() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation252");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "foo", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation253() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation253");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "foo", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation254() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation254");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "foo");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation255() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation255");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "foo", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation256() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation256");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "foo", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterationOrder_literalMutation257() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_literalMutation257");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_remove184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_remove184");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_remove185() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_remove185");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_remove186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_remove186");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet(), "a", "c", "b");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_remove187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_remove187");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterationOrder_remove188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterationOrder_remove188");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.values(), "android", "cola", "bbq");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveRootDoesNotDoubleUnlink() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_add226() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add226");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_add227() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add227");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_add228() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add228");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_add229() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add229");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_add230() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add230");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_add231() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add231");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_add232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add232");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_add233() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_add233");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation268");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation269() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation269");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation270");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation271");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation272");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation273() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation273");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation274");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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

    public void testRemoveRootDoesNotDoubleUnlink_literalMutation275() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_literalMutation275");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_remove190() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_remove190");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_remove191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_remove191");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_remove192() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_remove192");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_remove193() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_remove193");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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
    public void testRemoveRootDoesNotDoubleUnlink_remove194() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveRootDoesNotDoubleUnlink_remove194");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
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

    public void testPutNullKeyFails() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutNullKeyFails");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        try {
            map.put(null, "android");
        } catch (NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPutNullKeyFails_add225() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutNullKeyFails_add225");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        try {
            map.put(null, "android");
            map.put(null, "android");
        } catch (NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutNullKeyFails_literalMutation267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutNullKeyFails_literalMutation267");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        try {
            map.put(null, "foo");
        } catch (NullPointerException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutNonComparableKeyFails() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutNonComparableKeyFails");
        LinkedTreeMap<java.lang.Object, java.lang.String> map = new LinkedTreeMap<java.lang.Object, java.lang.String>();
        try {
            map.put(new Object(), "android");
        } catch (ClassCastException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testPutNonComparableKeyFails_add224() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutNonComparableKeyFails_add224");
        LinkedTreeMap<java.lang.Object, java.lang.String> map = new LinkedTreeMap<java.lang.Object, java.lang.String>();
        try {
            map.put(new Object(), "android");
            map.put(new Object(), "android");
        } catch (ClassCastException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutNonComparableKeyFails_literalMutation265() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutNonComparableKeyFails_literalMutation265");
        LinkedTreeMap<java.lang.Object, java.lang.String> map = new LinkedTreeMap<java.lang.Object, java.lang.String>();
        try {
            map.put(new Object(), "foo");
        } catch (ClassCastException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testContainsNonComparableKeyReturnsFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNonComparableKeyReturnsFalse");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),153,map,152,map.containsKey(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testContainsNonComparableKeyReturnsFalse_add206() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNonComparableKeyReturnsFalse_add206");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("a", "android");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),153,map,152,map.containsKey(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testContainsNonComparableKeyReturnsFalse_literalMutation224() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNonComparableKeyReturnsFalse_literalMutation224");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "android");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),153,map,152,map.containsKey(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testContainsNonComparableKeyReturnsFalse_literalMutation225() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNonComparableKeyReturnsFalse_literalMutation225");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),153,map,152,map.containsKey(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testContainsNonComparableKeyReturnsFalse_remove172() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNonComparableKeyReturnsFalse_remove172");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),153,map,152,map.containsKey(new java.lang.Object()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testContainsNullKeyIsAlwaysFalse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNullKeyIsAlwaysFalse");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,map,154,map.containsKey(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testContainsNullKeyIsAlwaysFalse_add207() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNullKeyIsAlwaysFalse_add207");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("a", "android");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,map,154,map.containsKey(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testContainsNullKeyIsAlwaysFalse_literalMutation226() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNullKeyIsAlwaysFalse_literalMutation226");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "android");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,map,154,map.containsKey(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testContainsNullKeyIsAlwaysFalse_literalMutation227() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNullKeyIsAlwaysFalse_literalMutation227");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,map,154,map.containsKey(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testContainsNullKeyIsAlwaysFalse_remove173() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsNullKeyIsAlwaysFalse_remove173");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),155,map,154,map.containsKey(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPutOverrides() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPutOverrides");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),167,map,166,map.put("d", "donut"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),169,map,168,map.put("e", "eclair"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),171,map,170,map.put("f", "froyo"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),173,map,172,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),175,map,174,map.get("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),177,map,176,map.put("d", "done"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),179,map,178,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyStringValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyStringValues");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,map,157,map.containsKey("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,map,159,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyStringValues_add208() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyStringValues_add208");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "");
        map.put("a", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,map,157,map.containsKey("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,map,159,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyStringValues_literalMutation228() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyStringValues_literalMutation228");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,map,157,map.containsKey("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,map,159,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyStringValues_literalMutation229() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyStringValues_literalMutation229");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,map,157,map.containsKey("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,map,159,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyStringValues_remove174() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyStringValues_remove174");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),158,map,157,map.containsKey("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),160,map,159,map.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLargeSetOfRandomKeys_add223() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeSetOfRandomKeys_add223");
        Random random = new Random(1367593214724L);
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
            map.put(keys[i], ("" + i));
            map.put(keys[i], ("" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),186,map,185,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,map,188,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeSetOfRandomKeys() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeSetOfRandomKeys");
        Random random = new Random(1367593214725L);
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
            map.put(keys[i], ("" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),186,map,185,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,map,188,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeSetOfRandomKeys_literalMutation259() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeSetOfRandomKeys_literalMutation259");
        Random random = new Random(1367593214724L);
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[999];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
            map.put(keys[i], ("" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),186,map,185,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,map,188,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeSetOfRandomKeys_literalMutation260() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeSetOfRandomKeys_literalMutation260");
        Random random = new Random(1367593214724L);
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = -1 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
            map.put(keys[i], ("" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),186,map,185,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,map,188,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeSetOfRandomKeys_literalMutation261() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeSetOfRandomKeys_literalMutation261");
        Random random = new Random(1367593214724L);
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 35)) + "-") + i;
            map.put(keys[i], ("" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),186,map,185,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,map,188,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeSetOfRandomKeys_literalMutation262() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeSetOfRandomKeys_literalMutation262");
        Random random = new Random(1367593214724L);
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "foo") + i;
            map.put(keys[i], ("" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),186,map,185,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,map,188,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeSetOfRandomKeys_literalMutation263() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeSetOfRandomKeys_literalMutation263");
        Random random = new Random(1367593214724L);
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
            map.put(keys[i], ("foo" + i));
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),186,map,185,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,map,188,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLargeSetOfRandomKeys_literalMutation264() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeSetOfRandomKeys_literalMutation264");
        Random random = new Random(1367593214724L);
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
            map.put(keys[i], ("" + i));
        }
        for (int i = 1 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),186,map,185,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,map,188,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testLargeSetOfRandomKeys_remove189() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLargeSetOfRandomKeys_remove189");
        Random random = new Random(1367593214724L);
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        String[] keys = new String[1000];
        for (int i = 0 ; i < (keys.length) ; i++) {
            keys[i] = ((Integer.toString(java.lang.Math.abs(random.nextInt()), 36)) + "-") + i;
        }
        for (int i = 0 ; i < (keys.length) ; i++) {
            String key = keys[i];
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),186,map,185,map.containsKey(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),187,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),189,map,188,map.get(key));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_add201() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add201");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_add202() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add202");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_add203() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add203");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_add204() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add204");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_add205() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_add205");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear_literalMutation218() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation218");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("foo", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear_literalMutation219() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation219");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "foo");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear_literalMutation220() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation220");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("foo", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear_literalMutation221() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation221");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "foo");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear_literalMutation222() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation222");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("foo", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testClear_literalMutation223() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_literalMutation223");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "foo");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_remove167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove167");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_remove168() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove168");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_remove169() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove169");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_remove170() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove170");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        assertIterationOrder(map.keySet());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testClear_remove171() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClear_remove171");
        LinkedTreeMap<java.lang.String, java.lang.String> map = new LinkedTreeMap<java.lang.String, java.lang.String>();
        map.put("a", "android");
        map.put("c", "cola");
        map.put("b", "bbq");
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),184,map,183,map.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add209() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add209");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add210() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add210");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add211() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add211");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add212() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add212");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add213() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add213");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add214() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add214");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add215() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add215");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add216() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add216");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_add217() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_add217");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation230() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation230");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("foo", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation231() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation231");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 2);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation232() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation232");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("foo", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation233() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation233");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 3);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation234() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation234");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("foo", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation235() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation235");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 4);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation236() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation236");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("foo", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation237() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation237");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 5);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation238() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation238");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("foo", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation239() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation239");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 4);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation240() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation240");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("foo", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation241() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation241");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 1);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation242() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation242");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("foo", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation243() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation243");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 3);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation244() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation244");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("foo", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEqualsAndHashCode_literalMutation245() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_literalMutation245");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 0);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove175() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove175");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove176() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove176");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove177() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove177");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove178() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove178");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove179() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove179");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove180() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove180");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove181() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove181");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove182() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove182");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        com.google.gson.common.MoreAsserts.assertEqualsAndHashCode(map1, map2);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEqualsAndHashCode_remove183() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEqualsAndHashCode_remove183");
        LinkedTreeMap<java.lang.String, java.lang.Integer> map1 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        LinkedTreeMap<java.lang.String, java.lang.Integer> map2 = new LinkedTreeMap<java.lang.String, java.lang.Integer>();
        map2.put("C", 3);
        map2.put("B", 2);
        map2.put("D", 4);
        map2.put("A", 1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private <T>void assertIterationOrder(Iterable<T> actual, T... expected) {
        ArrayList<T> actualList = new ArrayList<T>();
        for (T t : actual) {
            actualList.add(t);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),181,null,180,java.util.Arrays.asList(expected));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),182,actualList);
    }
}

