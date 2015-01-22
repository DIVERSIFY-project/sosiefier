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

    public void testUnmodifiableQueue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableQueue");
        Queue<java.lang.Object> queue = org.apache.commons.collections4.QueueUtils.unmodifiableQueue(new java.util.LinkedList<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8236,(queue instanceof org.apache.commons.collections4.queue.UnmodifiableQueue));
        try {
            org.apache.commons.collections4.QueueUtils.unmodifiableQueue(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8237,queue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8239,null,8238,org.apache.commons.collections4.QueueUtils.unmodifiableQueue(queue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPredicatedQueue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedQueue");
        Queue<java.lang.Object> queue = org.apache.commons.collections4.QueueUtils.predicatedQueue(new java.util.LinkedList<java.lang.Object>(), truePredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8234,(queue instanceof org.apache.commons.collections4.queue.PredicatedQueue));
        try {
            org.apache.commons.collections4.QueueUtils.predicatedQueue(null, truePredicate);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.QueueUtils.predicatedQueue(new java.util.LinkedList<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedQueue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue");
        Queue<java.lang.Object> queue = org.apache.commons.collections4.QueueUtils.transformingQueue(new java.util.LinkedList<java.lang.Object>(), nopTransformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8235,(queue instanceof org.apache.commons.collections4.queue.TransformedQueue));
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

    public void testEmptyQueue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyQueue");
        Queue<java.lang.Object> queue = org.apache.commons.collections4.QueueUtils.emptyQueue();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8231,(queue instanceof org.apache.commons.collections4.queue.UnmodifiableQueue));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),8233,queue,8232,queue.isEmpty());
        try {
            queue.add(new Object());
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

