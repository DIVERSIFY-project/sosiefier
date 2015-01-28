package org.apache.commons.collections4.queue;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

/** 
 * Extension of {@link AbstractCollectionTest} for exercising the
 * {@link TransformedQueue} implementation.
 * 
 * @version $Id$
 * @since 4.0
 */
public class TransformedQueueTest<E> extends AbstractQueueTest<E> {
    public TransformedQueueTest(final String testName) {
        super(testName);
    }

    @Override
    public Queue<E> makeConfirmedCollection() {
        return new LinkedList<E>();
    }

    @Override
    public Queue<E> makeConfirmedFullCollection() {
        final Queue<E> list = new LinkedList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return list;
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public Queue<E> makeObject() {
        return org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(new LinkedList<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.NOOP_TRANSFORMER)));
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public Queue<E> makeFullCollection() {
        final Queue<E> list = new LinkedList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(list, ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.NOOP_TRANSFORMER)));
    }

    @Test(timeout = 1000)
    public void testTransformedQueue_add1914() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_add1914");
        final Queue<java.lang.Object> queue = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(new LinkedList<java.lang.Object>(), org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6032,queue,6031,queue.size());
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (elements.length) ; i++) {
            queue.add(elements[i]);
            queue.add(elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,queue,6034,queue.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,queue,6036,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,queue,6038,queue.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,queue,6040,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,queue,6042,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedQueue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue");
        final Queue<java.lang.Object> queue = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(new LinkedList<java.lang.Object>(), org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6032,queue,6031,queue.size());
        final Object[] elements = new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (elements.length) ; i++) {
            queue.add(elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,queue,6034,queue.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,queue,6036,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,queue,6038,queue.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,queue,6040,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,queue,6042,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedQueue_literalMutation1778() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_literalMutation1778");
        final Queue<java.lang.Object> queue = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(new LinkedList<java.lang.Object>(), org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6032,queue,6031,queue.size());
        final Object[] elements = new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (elements.length) ; i++) {
            queue.add(elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,queue,6034,queue.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,queue,6036,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,queue,6038,queue.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,queue,6040,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,queue,6042,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedQueue_literalMutation1779() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_literalMutation1779");
        final Queue<java.lang.Object> queue = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(new LinkedList<java.lang.Object>(), org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6032,queue,6031,queue.size());
        final Object[] elements = new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (elements.length) ; i++) {
            queue.add(elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,queue,6034,queue.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,queue,6036,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,queue,6038,queue.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,queue,6040,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,queue,6042,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedQueue_literalMutation1780() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_literalMutation1780");
        final Queue<java.lang.Object> queue = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(new LinkedList<java.lang.Object>(), org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6032,queue,6031,queue.size());
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" };
        for (int i = 0 ; i < (elements.length) ; i++) {
            queue.add(elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,queue,6034,queue.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,queue,6036,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,queue,6038,queue.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,queue,6040,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,queue,6042,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedQueue_literalMutation1781() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_literalMutation1781");
        final Queue<java.lang.Object> queue = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(new LinkedList<java.lang.Object>(), org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6032,queue,6031,queue.size());
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" };
        for (int i = 0 ; i < (elements.length) ; i++) {
            queue.add(elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,queue,6034,queue.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,queue,6036,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,queue,6038,queue.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,queue,6040,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,queue,6042,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedQueue_literalMutation1782() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_literalMutation1782");
        final Queue<java.lang.Object> queue = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(new LinkedList<java.lang.Object>(), org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6032,queue,6031,queue.size());
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" };
        for (int i = 0 ; i < (elements.length) ; i++) {
            queue.add(elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,queue,6034,queue.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,queue,6036,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,queue,6038,queue.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,queue,6040,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,queue,6042,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedQueue_literalMutation1783() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_literalMutation1783");
        final Queue<java.lang.Object> queue = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(new LinkedList<java.lang.Object>(), org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6032,queue,6031,queue.size());
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" };
        for (int i = 0 ; i < (elements.length) ; i++) {
            queue.add(elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,queue,6034,queue.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,queue,6036,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,queue,6038,queue.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,queue,6040,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,queue,6042,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedQueue_literalMutation1784() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_literalMutation1784");
        final Queue<java.lang.Object> queue = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(new LinkedList<java.lang.Object>(), org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6032,queue,6031,queue.size());
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = -1 ; i < (elements.length) ; i++) {
            queue.add(elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,queue,6034,queue.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,queue,6036,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,queue,6038,queue.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,queue,6040,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,queue,6042,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testTransformedQueue_remove1486() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_remove1486");
        final Queue<java.lang.Object> queue = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(new LinkedList<java.lang.Object>(), org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6032,queue,6031,queue.size());
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (elements.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,queue,6034,queue.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,queue,6036,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(elements[i])))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,queue,6038,queue.contains(elements[i]));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,queue,6040,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,queue,6042,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    @Test(timeout = 1000)
    public void testTransformedQueue_decorateTransform_add1915() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_decorateTransform_add1915");
        final Queue originalQueue = new LinkedList();
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalQueue, elements);
        java.util.Collections.addAll(originalQueue, elements);
        final Queue<?> queue = org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(originalQueue, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6044,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6046,queue,6045,queue.size());
        for (final Object el : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6048,queue,6047,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6050,queue,6049,queue.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6052,queue,6051,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6054,queue,6053,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "foo" , "unchecked" })
    public void testTransformedQueue_decorateTransform() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_decorateTransform");
        final Queue originalQueue = new LinkedList();
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalQueue, elements);
        final Queue<?> queue = org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(originalQueue, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6044,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6046,queue,6045,queue.size());
        for (final Object el : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6048,queue,6047,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6050,queue,6049,queue.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6052,queue,6051,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6054,queue,6053,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "foo" })
    public void testTransformedQueue_decorateTransform_literalMutation1786() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_decorateTransform_literalMutation1786");
        final Queue originalQueue = new LinkedList();
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalQueue, elements);
        final Queue<?> queue = org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(originalQueue, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6044,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6046,queue,6045,queue.size());
        for (final Object el : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6048,queue,6047,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6050,queue,6049,queue.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6052,queue,6051,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6054,queue,6053,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    public void testTransformedQueue_decorateTransform_literalMutation1787() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_decorateTransform_literalMutation1787");
        final Queue originalQueue = new LinkedList();
        final Object[] elements = new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalQueue, elements);
        final Queue<?> queue = org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(originalQueue, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6044,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6046,queue,6045,queue.size());
        for (final Object el : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6048,queue,6047,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6050,queue,6049,queue.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6052,queue,6051,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6054,queue,6053,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    public void testTransformedQueue_decorateTransform_literalMutation1788() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_decorateTransform_literalMutation1788");
        final Queue originalQueue = new LinkedList();
        final Object[] elements = new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalQueue, elements);
        final Queue<?> queue = org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(originalQueue, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6044,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6046,queue,6045,queue.size());
        for (final Object el : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6048,queue,6047,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6050,queue,6049,queue.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6052,queue,6051,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6054,queue,6053,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    public void testTransformedQueue_decorateTransform_literalMutation1789() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_decorateTransform_literalMutation1789");
        final Queue originalQueue = new LinkedList();
        final Object[] elements = new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalQueue, elements);
        final Queue<?> queue = org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(originalQueue, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6044,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6046,queue,6045,queue.size());
        for (final Object el : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6048,queue,6047,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6050,queue,6049,queue.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6052,queue,6051,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6054,queue,6053,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    public void testTransformedQueue_decorateTransform_literalMutation1790() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_decorateTransform_literalMutation1790");
        final Queue originalQueue = new LinkedList();
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalQueue, elements);
        final Queue<?> queue = org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(originalQueue, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6044,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6046,queue,6045,queue.size());
        for (final Object el : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6048,queue,6047,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6050,queue,6049,queue.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6052,queue,6051,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6054,queue,6053,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    public void testTransformedQueue_decorateTransform_literalMutation1791() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_decorateTransform_literalMutation1791");
        final Queue originalQueue = new LinkedList();
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" };
        java.util.Collections.addAll(originalQueue, elements);
        final Queue<?> queue = org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(originalQueue, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6044,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6046,queue,6045,queue.size());
        for (final Object el : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6048,queue,6047,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6050,queue,6049,queue.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6052,queue,6051,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6054,queue,6053,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    public void testTransformedQueue_decorateTransform_literalMutation1792() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_decorateTransform_literalMutation1792");
        final Queue originalQueue = new LinkedList();
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" };
        java.util.Collections.addAll(originalQueue, elements);
        final Queue<?> queue = org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(originalQueue, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6044,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6046,queue,6045,queue.size());
        for (final Object el : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6048,queue,6047,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6050,queue,6049,queue.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6052,queue,6051,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6054,queue,6053,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    public void testTransformedQueue_decorateTransform_literalMutation1793() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_decorateTransform_literalMutation1793");
        final Queue originalQueue = new LinkedList();
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" };
        java.util.Collections.addAll(originalQueue, elements);
        final Queue<?> queue = org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(originalQueue, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6044,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6046,queue,6045,queue.size());
        for (final Object el : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6048,queue,6047,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6050,queue,6049,queue.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6052,queue,6051,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6054,queue,6053,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = { "rawtypes" , "unchecked" })
    @Test(timeout = 1000)
    public void testTransformedQueue_decorateTransform_remove1487() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedQueue_decorateTransform_remove1487");
        final Queue originalQueue = new LinkedList();
        final Object[] elements = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        final Queue<?> queue = org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(originalQueue, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6044,elements.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6046,queue,6045,queue.size());
        for (final Object el : elements) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6048,queue,6047,queue.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6050,queue,6049,queue.contains(el));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6052,queue,6051,queue.remove(elements[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6054,queue,6053,queue.remove(java.lang.Integer.valueOf(((java.lang.String)(elements[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

