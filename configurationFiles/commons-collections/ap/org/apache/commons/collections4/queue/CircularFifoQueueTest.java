package org.apache.commons.collections4.queue;

import java.util.ArrayList;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Queue;
import org.junit.Test;

/** 
 * Test cases for CircularFifoQueue.
 * 
 * @version $Id$
 * @since 4.0
 */
public class CircularFifoQueueTest<E> extends AbstractQueueTest<E> {
    public CircularFifoQueueTest(final String testName) {
        super(testName);
    }

    /** 
     * Runs through the regular verifications, but also verifies that
     * the buffer contains the same elements in the same sequence as the
     * list.
     */
@Override
    public void verify() {
        super.verify();
        final Iterator<E> iterator1 = getCollection().iterator();
        for (E e : getConfirmed()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6020,iterator1,6019,iterator1.hasNext());
            final Object o1 = iterator1.next();
            final Object o2 = e;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6021,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6022,o2);
        }
    }

    /** 
     * Overridden because CircularFifoQueue doesn't allow null elements.
     * 
     * @return false
     */
@Override
    public boolean isNullSupported() {
        return false;
    }

    /** 
     * Overridden because CircularFifoQueue isn't fail fast.
     * 
     * @return false
     */
@Override
    public boolean isFailFastSupported() {
        return false;
    }

    /** 
     * Returns an empty ArrayList.
     * 
     * @return an empty ArrayList
     */
@Override
    public Collection<E> makeConfirmedCollection() {
        return new ArrayList<E>();
    }

    /** 
     * Returns a full ArrayList.
     * 
     * @return a full ArrayList
     */
@Override
    public Collection<E> makeConfirmedFullCollection() {
        final Collection<E> c = makeConfirmedCollection();
        c.addAll(java.util.Arrays.asList(getFullElements()));
        return c;
    }

    /** 
     * Returns an empty CircularFifoQueue that won't overflow.
     * 
     * @return an empty CircularFifoQueue
     */
@Override
    public Queue<E> makeObject() {
        return new CircularFifoQueue<E>(100);
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCircularFifoQueueCircular_add1821() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular_add1821");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("A")));
        list.add(((E)("A")));
        list.add(((E)("B")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCircularFifoQueueCircular_add1822() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular_add1822");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("A")));
        list.add(((E)("B")));
        list.add(((E)("B")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCircularFifoQueueCircular_add1823() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular_add1823");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("A")));
        list.add(((E)("B")));
        list.add(((E)("C")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCircularFifoQueueCircular_add1824() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular_add1824");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("A")));
        list.add(((E)("B")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        queue.add(((E)("D")));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    public void testCircularFifoQueueCircular() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("A")));
        list.add(((E)("B")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    public void testCircularFifoQueueCircular_literalMutation1663() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular_literalMutation1663");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("foo")));
        list.add(((E)("B")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    public void testCircularFifoQueueCircular_literalMutation1664() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular_literalMutation1664");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("A")));
        list.add(((E)("foo")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    public void testCircularFifoQueueCircular_literalMutation1665() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular_literalMutation1665");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("A")));
        list.add(((E)("B")));
        list.add(((E)("foo")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    public void testCircularFifoQueueCircular_literalMutation1666() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular_literalMutation1666");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("A")));
        list.add(((E)("B")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        queue.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCircularFifoQueueCircular_remove1394() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular_remove1394");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("B")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCircularFifoQueueCircular_remove1395() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular_remove1395");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("B")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCircularFifoQueueCircular_remove1396() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular_remove1396");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("B")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testCircularFifoQueueCircular_remove1397() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular_remove1397");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("A")));
        list.add(((E)("B")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5916,queue,5915,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5918,queue,5917,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5920,queue,5919,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,queue,5921,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5926,queue,5925,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5928,queue,5927,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,queue,5929,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,queue,5931,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5934,queue,5933,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,queue,5935,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@Test(timeout = 1000)
    public void testCircularFifoQueueRemove_add1825() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueRemove_add1825");
        resetFull();
        resetFull();
        final int size = getConfirmed().size();
        for (int i = 0 ; i < size ; i++) {
            final Object o1 = getCollection().remove();
            final Object o2 = ((List<?>)(getConfirmed())).remove(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5937,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5938,o2);
            verify();
        }
        try {
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@Test(timeout = 1000)
    public void testCircularFifoQueueRemove_add1826() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueRemove_add1826");
        resetFull();
        final int size = getConfirmed().size();
        for (int i = 0 ; i < size ; i++) {
            final Object o1 = getCollection().remove();
            final Object o2 = ((List<?>)(getConfirmed())).remove(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5937,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5938,o2);
            verify();
            verify();
        }
        try {
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@Test(timeout = 1000)
    public void testCircularFifoQueueRemove_add1827() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueRemove_add1827");
        resetFull();
        final int size = getConfirmed().size();
        for (int i = 0 ; i < size ; i++) {
            final Object o1 = getCollection().remove();
            final Object o2 = ((List<?>)(getConfirmed())).remove(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5937,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5938,o2);
            verify();
        }
        try {
            getCollection().remove();
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
public void testCircularFifoQueueRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueRemove");
        resetFull();
        final int size = getConfirmed().size();
        for (int i = -1 ; i < size ; i++) {
            final Object o1 = getCollection().remove();
            final Object o2 = ((List<?>)(getConfirmed())).remove(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5937,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5938,o2);
            verify();
        }
        try {
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
public void testCircularFifoQueueRemove_literalMutation1668() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueRemove_literalMutation1668");
        resetFull();
        final int size = getConfirmed().size();
        for (int i = 0 ; i < size ; i++) {
            final Object o1 = getCollection().remove();
            final Object o2 = ((List<?>)(getConfirmed())).remove(-1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5937,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5938,o2);
            verify();
        }
        try {
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@Test(timeout = 1000)
    public void testCircularFifoQueueRemove_remove1398() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueRemove_remove1398");
        final int size = getConfirmed().size();
        for (int i = 0 ; i < size ; i++) {
            final Object o1 = getCollection().remove();
            final Object o2 = ((List<?>)(getConfirmed())).remove(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5937,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5938,o2);
            verify();
        }
        try {
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the removal operation actually removes the first element.
     */
@Test(timeout = 1000)
    public void testCircularFifoQueueRemove_remove1399() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueRemove_remove1399");
        resetFull();
        final int size = getConfirmed().size();
        for (int i = 0 ; i < size ; i++) {
            final Object o1 = getCollection().remove();
            final Object o2 = ((List<?>)(getConfirmed())).remove(0);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5937,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5938,o2);
        }
        try {
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the constructor correctly throws an exception.
     */
public void testConstructorException1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorException1");
        try {
            new CircularFifoQueue<E>(-1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the constructor correctly throws an exception.
     */
public void testConstructorException2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorException2");
        try {
            new CircularFifoQueue<E>(21);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests that the constructor correctly throws an exception.
     */
public void testConstructorException3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructorException3");
        try {
            new CircularFifoQueue<E>(null);
        } catch (final NullPointerException ex) {
            return ;
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_add1831() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_add1831");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_add1832() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_add1832");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_add1833() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_add1833");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_add1834() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_add1834");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_add1835() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_add1835");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_add1836() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_add1836");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_add1837() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_add1837");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError1_literalMutation1675() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_literalMutation1675");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(4);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError1_literalMutation1676() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_literalMutation1676");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("foo")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError1_literalMutation1677() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_literalMutation1677");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError1_literalMutation1678() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_literalMutation1678");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError1_literalMutation1679() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_literalMutation1679");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError1_literalMutation1680() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_literalMutation1680");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError1_literalMutation1681() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_literalMutation1681");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError1_literalMutation1682() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_literalMutation1682");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_remove1403() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_remove1403");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_remove1404() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_remove1404");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_remove1405() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_remove1405");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_remove1406() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_remove1406");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_remove1407() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_remove1407");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_remove1408() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_remove1408");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError1_remove1409() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1_remove1409");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,fifo,5947,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5950,fifo,5949,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,fifo,5951,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_add1838() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_add1838");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_add1839() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_add1839");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_add1840() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_add1840");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_add1841() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_add1841");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_add1842() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_add1842");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_add1843() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_add1843");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_add1844() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_add1844");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_add1845() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_add1845");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError2() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError2_literalMutation1684() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_literalMutation1684");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(4);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError2_literalMutation1685() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_literalMutation1685");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("foo")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError2_literalMutation1686() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_literalMutation1686");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError2_literalMutation1687() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_literalMutation1687");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError2_literalMutation1688() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_literalMutation1688");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError2_literalMutation1689() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_literalMutation1689");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError2_literalMutation1690() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_literalMutation1690");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError2_literalMutation1691() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_literalMutation1691");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError2_literalMutation1692() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_literalMutation1692");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_remove1410() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_remove1410");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_remove1411() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_remove1411");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_remove1412() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_remove1412");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_remove1413() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_remove1413");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_remove1414() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_remove1414");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_remove1415() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_remove1415");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_remove1416() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_remove1416");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError2_remove1417() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_remove1417");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5954,fifo,5953,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5956,fifo,5955,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5958,fifo,5957,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5960,fifo,5959,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_add1846() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_add1846");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_add1847() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_add1847");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_add1848() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_add1848");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_add1849() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_add1849");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_add1850() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_add1850");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_add1851() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_add1851");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_add1852() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_add1852");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_add1853() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_add1853");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_add1854() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_add1854");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError3() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError3_literalMutation1694() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_literalMutation1694");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(6);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError3_literalMutation1695() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_literalMutation1695");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("foo")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError3_literalMutation1696() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_literalMutation1696");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError3_literalMutation1697() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_literalMutation1697");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError3_literalMutation1698() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_literalMutation1698");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError3_literalMutation1699() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_literalMutation1699");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError3_literalMutation1700() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_literalMutation1700");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError3_literalMutation1701() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_literalMutation1701");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("foo")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError3_literalMutation1702() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_literalMutation1702");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError3_literalMutation1703() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_literalMutation1703");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_remove1418() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_remove1418");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_remove1419() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_remove1419");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_remove1420() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_remove1420");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_remove1421() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_remove1421");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_remove1422() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_remove1422");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_remove1423() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_remove1423");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_remove1424() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_remove1424");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_remove1425() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_remove1425");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError3_remove1426() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError3_remove1426");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5962,fifo,5961,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5964,fifo,5963,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5966,fifo,5965,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5968,fifo,5967,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_add1855() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_add1855");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_add1856() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_add1856");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_add1857() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_add1857");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_add1858() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_add1858");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_add1859() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_add1859");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_add1860() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_add1860");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_add1861() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_add1861");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_add1862() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_add1862");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError4() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError4_literalMutation1705() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_literalMutation1705");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(6);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError4_literalMutation1706() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_literalMutation1706");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("foo")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError4_literalMutation1707() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_literalMutation1707");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError4_literalMutation1708() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_literalMutation1708");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError4_literalMutation1709() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_literalMutation1709");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError4_literalMutation1710() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_literalMutation1710");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError4_literalMutation1711() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_literalMutation1711");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError4_literalMutation1712() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_literalMutation1712");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError4_literalMutation1713() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_literalMutation1713");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_remove1427() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_remove1427");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_remove1428() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_remove1428");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_remove1429() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_remove1429");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_remove1430() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_remove1430");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_remove1431() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_remove1431");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_remove1432() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_remove1432");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_remove1433() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_remove1433");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError4_remove1434() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError4_remove1434");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5970,fifo,5969,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5972,fifo,5971,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_add1863() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_add1863");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_add1864() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_add1864");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_add1865() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_add1865");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_add1866() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_add1866");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_add1867() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_add1867");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_add1868() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_add1868");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_add1869() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_add1869");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_add1870() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_add1870");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError5() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError5_literalMutation1715() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_literalMutation1715");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(6);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError5_literalMutation1716() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_literalMutation1716");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("foo")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError5_literalMutation1717() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_literalMutation1717");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError5_literalMutation1718() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_literalMutation1718");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError5_literalMutation1719() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_literalMutation1719");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError5_literalMutation1720() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_literalMutation1720");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError5_literalMutation1721() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_literalMutation1721");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError5_literalMutation1722() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_literalMutation1722");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError5_literalMutation1723() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_literalMutation1723");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_remove1435() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_remove1435");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_remove1436() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_remove1436");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_remove1437() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_remove1437");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_remove1438() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_remove1438");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_remove1439() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_remove1439");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_remove1440() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_remove1440");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_remove1441() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_remove1441");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError5_remove1442() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError5_remove1442");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5974,fifo,5973,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,fifo,5975,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_add1871() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_add1871");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_add1872() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_add1872");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_add1873() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_add1873");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_add1874() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_add1874");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_add1875() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_add1875");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_add1876() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_add1876");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_add1877() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_add1877");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_add1878() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_add1878");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError6() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError6_literalMutation1725() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_literalMutation1725");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(4);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError6_literalMutation1726() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_literalMutation1726");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("foo")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError6_literalMutation1727() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_literalMutation1727");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError6_literalMutation1728() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_literalMutation1728");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError6_literalMutation1729() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_literalMutation1729");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError6_literalMutation1730() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_literalMutation1730");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError6_literalMutation1731() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_literalMutation1731");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError6_literalMutation1732() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_literalMutation1732");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError6_literalMutation1733() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_literalMutation1733");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_remove1443() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_remove1443");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_remove1444() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_remove1444");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_remove1445() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_remove1445");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_remove1446() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_remove1446");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_remove1447() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_remove1447");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_remove1448() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_remove1448");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_remove1449() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_remove1449");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError6_remove1450() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError6_remove1450");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5978,fifo,5977,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5980,fifo,5979,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_add1879() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_add1879");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_add1880() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_add1880");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_add1881() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_add1881");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_add1882() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_add1882");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_add1883() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_add1883");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_add1884() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_add1884");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_add1885() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_add1885");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_add1886() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_add1886");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError7() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError7_literalMutation1735() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_literalMutation1735");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(4);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError7_literalMutation1736() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_literalMutation1736");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("foo")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError7_literalMutation1737() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_literalMutation1737");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError7_literalMutation1738() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_literalMutation1738");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError7_literalMutation1739() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_literalMutation1739");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError7_literalMutation1740() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_literalMutation1740");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError7_literalMutation1741() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_literalMutation1741");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError7_literalMutation1742() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_literalMutation1742");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError7_literalMutation1743() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_literalMutation1743");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_remove1451() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_remove1451");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_remove1452() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_remove1452");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_remove1453() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_remove1453");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_remove1454() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_remove1454");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_remove1455() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_remove1455");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_remove1456() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_remove1456");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_remove1457() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_remove1457");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError7_remove1458() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_remove1458");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5982,fifo,5981,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5984,fifo,5983,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_add1887() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_add1887");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_add1888() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_add1888");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_add1889() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_add1889");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_add1890() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_add1890");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_add1891() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_add1891");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_add1892() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_add1892");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_add1893() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_add1893");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_add1894() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_add1894");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_add1895() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_add1895");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError8() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError8_literalMutation1745() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_literalMutation1745");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(4);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError8_literalMutation1746() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_literalMutation1746");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("foo")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError8_literalMutation1747() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_literalMutation1747");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError8_literalMutation1748() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_literalMutation1748");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError8_literalMutation1749() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_literalMutation1749");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError8_literalMutation1750() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_literalMutation1750");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError8_literalMutation1751() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_literalMutation1751");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError8_literalMutation1752() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_literalMutation1752");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError8_literalMutation1753() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_literalMutation1753");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError8_literalMutation1754() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_literalMutation1754");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_remove1459() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_remove1459");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_remove1460() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_remove1460");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_remove1461() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_remove1461");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_remove1462() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_remove1462");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_remove1463() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_remove1463");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_remove1464() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_remove1464");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_remove1465() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_remove1465");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_remove1466() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_remove1466");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError8_remove1467() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_remove1467");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5986,fifo,5985,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5988,fifo,5987,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_add1896() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_add1896");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_add1897() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_add1897");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_add1898() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_add1898");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_add1899() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_add1899");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_add1900() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_add1900");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_add1901() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_add1901");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_add1902() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_add1902");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_add1903() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_add1903");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_add1904() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_add1904");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError9() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError9_literalMutation1756() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_literalMutation1756");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(6);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError9_literalMutation1757() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_literalMutation1757");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("foo")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError9_literalMutation1758() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_literalMutation1758");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError9_literalMutation1759() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_literalMutation1759");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError9_literalMutation1760() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_literalMutation1760");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError9_literalMutation1761() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_literalMutation1761");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError9_literalMutation1762() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_literalMutation1762");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError9_literalMutation1763() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_literalMutation1763");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("foo")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError9_literalMutation1764() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_literalMutation1764");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError9_literalMutation1765() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_literalMutation1765");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_remove1468() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_remove1468");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_remove1469() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_remove1469");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_remove1470() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_remove1470");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_remove1471() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_remove1471");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_remove1472() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_remove1472");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_remove1473() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_remove1473");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_remove1474() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_remove1474");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_remove1475() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_remove1475");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRemoveError9_remove1476() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError9_remove1476");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5990,fifo,5989,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5992,fifo,5991,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRepeatedSerialization_add1905() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_add1905");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRepeatedSerialization_add1906() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_add1906");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRepeatedSerialization_add1907() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_add1907");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRepeatedSerialization_add1908() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_add1908");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRepeatedSerialization_add1909() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_add1909");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRepeatedSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRepeatedSerialization_literalMutation1767() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_literalMutation1767");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(3);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRepeatedSerialization_literalMutation1768() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_literalMutation1768");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRepeatedSerialization_literalMutation1769() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_literalMutation1769");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRepeatedSerialization_literalMutation1770() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_literalMutation1770");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRepeatedSerialization_remove1477() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_remove1477");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRepeatedSerialization_remove1478() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_remove1478");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRepeatedSerialization_remove1479() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_remove1479");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRepeatedSerialization_remove1480() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_remove1480");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testRepeatedSerialization_remove1481() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_remove1481");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5994,b,5993,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5996,b,5995,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5998,b2,5997,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6000,b2,5999,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6002,b2,6001,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6004,b2,6003,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6006,b2,6005,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6008,b3,6007,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6010,b3,6009,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6012,b3,6011,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6014,b3,6013,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6016,b3,6015,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6018,b3,6017,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetIndex_add1828() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndex_add1828");
        resetFull();
        resetFull();
        final CircularFifoQueue<E> queue = getCollection();
        final List<E> confirmed = ((List<E>)(getConfirmed()));
        for (int i = 0 ; i < (confirmed.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5940,confirmed,5939,confirmed.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5942,queue,5941,queue.get(i));
        }
        queue.remove();
        queue.remove();
        for (int i = 0 ; i < (queue.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5944,confirmed,5943,confirmed.get((i + 2)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5946,queue,5945,queue.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetIndex_add1829() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndex_add1829");
        resetFull();
        final CircularFifoQueue<E> queue = getCollection();
        final List<E> confirmed = ((List<E>)(getConfirmed()));
        for (int i = 0 ; i < (confirmed.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5940,confirmed,5939,confirmed.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5942,queue,5941,queue.get(i));
        }
        queue.remove();
        queue.remove();
        queue.remove();
        for (int i = 0 ; i < (queue.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5944,confirmed,5943,confirmed.get((i + 2)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5946,queue,5945,queue.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetIndex_add1830() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndex_add1830");
        resetFull();
        final CircularFifoQueue<E> queue = getCollection();
        final List<E> confirmed = ((List<E>)(getConfirmed()));
        for (int i = 0 ; i < (confirmed.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5940,confirmed,5939,confirmed.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5942,queue,5941,queue.get(i));
        }
        queue.remove();
        queue.remove();
        queue.remove();
        for (int i = 0 ; i < (queue.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5944,confirmed,5943,confirmed.get((i + 2)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5946,queue,5945,queue.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndex");
        resetFull();
        final CircularFifoQueue<E> queue = getCollection();
        final List<E> confirmed = ((List<E>)(getConfirmed()));
        for (int i = -1 ; i < (confirmed.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5940,confirmed,5939,confirmed.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5942,queue,5941,queue.get(i));
        }
        queue.remove();
        queue.remove();
        for (int i = 0 ; i < (queue.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5944,confirmed,5943,confirmed.get((i + 2)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5946,queue,5945,queue.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetIndex_literalMutation1673() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndex_literalMutation1673");
        resetFull();
        final CircularFifoQueue<E> queue = getCollection();
        final List<E> confirmed = ((List<E>)(getConfirmed()));
        for (int i = 0 ; i < (confirmed.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5940,confirmed,5939,confirmed.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5942,queue,5941,queue.get(i));
        }
        queue.remove();
        queue.remove();
        for (int i = -1 ; i < (queue.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5944,confirmed,5943,confirmed.get((i + 2)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5946,queue,5945,queue.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetIndex_remove1400() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndex_remove1400");
        final CircularFifoQueue<E> queue = getCollection();
        final List<E> confirmed = ((List<E>)(getConfirmed()));
        for (int i = 0 ; i < (confirmed.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5940,confirmed,5939,confirmed.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5942,queue,5941,queue.get(i));
        }
        queue.remove();
        queue.remove();
        for (int i = 0 ; i < (queue.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5944,confirmed,5943,confirmed.get((i + 2)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5946,queue,5945,queue.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetIndex_remove1401() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndex_remove1401");
        resetFull();
        final CircularFifoQueue<E> queue = getCollection();
        final List<E> confirmed = ((List<E>)(getConfirmed()));
        for (int i = 0 ; i < (confirmed.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5940,confirmed,5939,confirmed.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5942,queue,5941,queue.get(i));
        }
        queue.remove();
        for (int i = 0 ; i < (queue.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5944,confirmed,5943,confirmed.get((i + 2)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5946,queue,5945,queue.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetIndex_remove1402() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndex_remove1402");
        resetFull();
        final CircularFifoQueue<E> queue = getCollection();
        final List<E> confirmed = ((List<E>)(getConfirmed()));
        for (int i = 0 ; i < (confirmed.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5940,confirmed,5939,confirmed.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5942,queue,5941,queue.get(i));
        }
        queue.remove();
        for (int i = 0 ; i < (queue.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5944,confirmed,5943,confirmed.get((i + 2)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5946,queue,5945,queue.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public CircularFifoQueue<E> getCollection() {
        return ((CircularFifoQueue<E>)(super.getCollection()));
    }
}

