package org.apache.commons.collections4;

import java.util.Queue;
import junit.framework.Test;

/** 
 * Tests for QueueUtils factory methods.
 * 
 * @version $Id$
 */
public class QueueUtilsTest extends BulkTest {
    public QueueUtilsTest(final String name) {
        super(name);
    }

    public static Test suite() {
        return BulkTest.makeSuite(QueueUtilsTest.class);
    }

    protected Class<?> stringClass = getName().getClass();

    protected Predicate<java.lang.Object> truePredicate = org.apache.commons.collections4.functors.TruePredicate.truePredicate();

    protected Transformer<java.lang.Object, java.lang.Object> nopTransformer = org.apache.commons.collections4.TransformerUtils.nopTransformer();

    @org.junit.Test(timeout = 1000)
    public void testUnmodifiableQueue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableQueue");
        Queue<java.lang.Object> queue = org.apache.commons.collections4.QueueUtils.unmodifiableQueue(new java.util.LinkedList<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8161,(queue instanceof org.apache.commons.collections4.queue.UnmodifiableQueue));
        try {
            org.apache.commons.collections4.QueueUtils.unmodifiableQueue(null);
            org.apache.commons.collections4.QueueUtils.unmodifiableQueue(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8162,queue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8164,null,8163,org.apache.commons.collections4.QueueUtils.unmodifiableQueue(queue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testPredicatedQueue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedQueue");
        Queue<java.lang.Object> queue = org.apache.commons.collections4.QueueUtils.predicatedQueue(new java.util.LinkedList<java.lang.Object>(), truePredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8159,(queue instanceof org.apache.commons.collections4.queue.PredicatedQueue));
        try {
            org.apache.commons.collections4.QueueUtils.predicatedQueue(null, truePredicate);
            org.apache.commons.collections4.QueueUtils.predicatedQueue(null, truePredicate);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.QueueUtils.predicatedQueue(new java.util.LinkedList<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testPredicatedQueue_add2922() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedQueue_add2922");
        Queue<java.lang.Object> queue = org.apache.commons.collections4.QueueUtils.predicatedQueue(new java.util.LinkedList<java.lang.Object>(), truePredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8159,(queue instanceof org.apache.commons.collections4.queue.PredicatedQueue));
        try {
            org.apache.commons.collections4.QueueUtils.predicatedQueue(null, truePredicate);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.QueueUtils.predicatedQueue(new java.util.LinkedList<java.lang.Object>(), null);
            org.apache.commons.collections4.QueueUtils.predicatedQueue(new java.util.LinkedList<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedQueue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue");
        Queue<java.lang.Object> queue = org.apache.commons.collections4.QueueUtils.transformingQueue(new java.util.LinkedList<java.lang.Object>(), nopTransformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8160,(queue instanceof org.apache.commons.collections4.queue.TransformedQueue));
        try {
            org.apache.commons.collections4.QueueUtils.transformingQueue(null, nopTransformer);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.QueueUtils.transformingQueue(new java.util.LinkedList<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testTransformedQueue_add2923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_add2923");
        Queue<java.lang.Object> queue = org.apache.commons.collections4.QueueUtils.transformingQueue(new java.util.LinkedList<java.lang.Object>(), nopTransformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8160,(queue instanceof org.apache.commons.collections4.queue.TransformedQueue));
        try {
            org.apache.commons.collections4.QueueUtils.transformingQueue(null, nopTransformer);
            org.apache.commons.collections4.QueueUtils.transformingQueue(null, nopTransformer);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.QueueUtils.transformingQueue(new java.util.LinkedList<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testTransformedQueue_add2924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_add2924");
        Queue<java.lang.Object> queue = org.apache.commons.collections4.QueueUtils.transformingQueue(new java.util.LinkedList<java.lang.Object>(), nopTransformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8160,(queue instanceof org.apache.commons.collections4.queue.TransformedQueue));
        try {
            org.apache.commons.collections4.QueueUtils.transformingQueue(null, nopTransformer);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.QueueUtils.transformingQueue(new java.util.LinkedList<java.lang.Object>(), null);
            org.apache.commons.collections4.QueueUtils.transformingQueue(new java.util.LinkedList<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testEmptyQueue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyQueue");
        Queue<java.lang.Object> queue = org.apache.commons.collections4.QueueUtils.emptyQueue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8156,(queue instanceof org.apache.commons.collections4.queue.UnmodifiableQueue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8158,queue,8157,queue.isEmpty());
        try {
            queue.add(new Object());
            queue.add(new Object());
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

