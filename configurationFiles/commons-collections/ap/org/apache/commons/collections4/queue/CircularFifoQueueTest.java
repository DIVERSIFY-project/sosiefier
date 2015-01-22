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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6059,iterator1,6058,iterator1.hasNext());
            final Object o1 = iterator1.next();
            final Object o2 = e;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6060,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6061,o2);
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
    public void testCircularFifoQueueCircular() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCircularFifoQueueCircular");
        final List<E> list = new ArrayList<E>();
        list.add(((E)("A")));
        list.add(((E)("B")));
        list.add(((E)("C")));
        final Queue<E> queue = new CircularFifoQueue<E>(list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5955,queue,5954,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5957,queue,5956,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5959,queue,5958,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5961,queue,5960,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5963,queue,5962,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5965,queue,5964,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5967,queue,5966,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5969,queue,5968,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5971,queue,5970,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5973,queue,5972,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5975,queue,5974,queue.remove());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5955,queue,5954,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5957,queue,5956,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5959,queue,5958,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5961,queue,5960,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5963,queue,5962,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5965,queue,5964,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5967,queue,5966,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5969,queue,5968,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5971,queue,5970,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5973,queue,5972,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5975,queue,5974,queue.remove());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5955,queue,5954,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5957,queue,5956,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5959,queue,5958,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5961,queue,5960,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5963,queue,5962,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5965,queue,5964,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5967,queue,5966,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5969,queue,5968,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5971,queue,5970,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5973,queue,5972,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5975,queue,5974,queue.remove());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5955,queue,5954,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5957,queue,5956,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5959,queue,5958,queue.contains("C"));
        queue.add(((E)("D")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5961,queue,5960,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5963,queue,5962,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5965,queue,5964,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5967,queue,5966,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5969,queue,5968,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5971,queue,5970,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5973,queue,5972,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5975,queue,5974,queue.remove());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5955,queue,5954,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5957,queue,5956,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5959,queue,5958,queue.contains("C"));
        queue.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5961,queue,5960,queue.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5963,queue,5962,queue.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5965,queue,5964,queue.contains("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5967,queue,5966,queue.contains("D"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5969,queue,5968,queue.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5971,queue,5970,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5973,queue,5972,queue.remove());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5975,queue,5974,queue.remove());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5977,o2);
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5976,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5977,o2);
            verify();
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
            new CircularFifoQueue<E>(1);
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
    public void testRemoveError1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError1");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(5);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5987,fifo,5986,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5989,fifo,5988,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5991,fifo,5990,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5987,fifo,5986,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5989,fifo,5988,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5991,fifo,5990,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5987,fifo,5986,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5989,fifo,5988,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5991,fifo,5990,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5987,fifo,5986,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5989,fifo,5988,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5991,fifo,5990,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5987,fifo,5986,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5989,fifo,5988,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5991,fifo,5990,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5987,fifo,5986,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5989,fifo,5988,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5991,fifo,5990,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5987,fifo,5986,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5989,fifo,5988,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5991,fifo,5990,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5987,fifo,5986,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5989,fifo,5988,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5991,fifo,5990,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5987,fifo,5986,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5989,fifo,5988,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5991,fifo,5990,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5993,fifo,5992,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5995,fifo,5994,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5997,fifo,5996,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5999,fifo,5998,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError2_literalMutation1684() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError2_literalMutation1684");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(6);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5993,fifo,5992,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5995,fifo,5994,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5997,fifo,5996,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5999,fifo,5998,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5993,fifo,5992,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5995,fifo,5994,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5997,fifo,5996,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5999,fifo,5998,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5993,fifo,5992,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5995,fifo,5994,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5997,fifo,5996,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5999,fifo,5998,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5993,fifo,5992,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5995,fifo,5994,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5997,fifo,5996,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5999,fifo,5998,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5993,fifo,5992,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5995,fifo,5994,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5997,fifo,5996,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5999,fifo,5998,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5993,fifo,5992,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5995,fifo,5994,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5997,fifo,5996,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5999,fifo,5998,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5993,fifo,5992,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5995,fifo,5994,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5997,fifo,5996,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5999,fifo,5998,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5993,fifo,5992,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5995,fifo,5994,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5997,fifo,5996,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5999,fifo,5998,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5993,fifo,5992,fifo.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5995,fifo,5994,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5997,fifo,5996,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5999,fifo,5998,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6001,fifo,6000,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6003,fifo,6002,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6005,fifo,6004,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6007,fifo,6006,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6001,fifo,6000,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6003,fifo,6002,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6005,fifo,6004,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6007,fifo,6006,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6001,fifo,6000,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6003,fifo,6002,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6005,fifo,6004,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6007,fifo,6006,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6001,fifo,6000,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6003,fifo,6002,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6005,fifo,6004,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6007,fifo,6006,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6001,fifo,6000,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6003,fifo,6002,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6005,fifo,6004,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6007,fifo,6006,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6001,fifo,6000,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6003,fifo,6002,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6005,fifo,6004,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6007,fifo,6006,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6001,fifo,6000,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6003,fifo,6002,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6005,fifo,6004,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6007,fifo,6006,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6001,fifo,6000,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6003,fifo,6002,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6005,fifo,6004,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6007,fifo,6006,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6001,fifo,6000,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6003,fifo,6002,fifo.toString());
        fifo.add(((E)("foo")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6005,fifo,6004,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6007,fifo,6006,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6001,fifo,6000,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6003,fifo,6002,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6005,fifo,6004,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6007,fifo,6006,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6001,fifo,6000,fifo.toString());
        fifo.remove("3");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6003,fifo,6002,fifo.toString());
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6005,fifo,6004,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6007,fifo,6006,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6009,fifo,6008,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6011,fifo,6010,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6009,fifo,6008,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6011,fifo,6010,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6009,fifo,6008,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6011,fifo,6010,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6009,fifo,6008,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6011,fifo,6010,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6009,fifo,6008,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6011,fifo,6010,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6009,fifo,6008,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6011,fifo,6010,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6009,fifo,6008,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6011,fifo,6010,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6009,fifo,6008,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6011,fifo,6010,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6009,fifo,6008,fifo.toString());
        fifo.remove("4");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6011,fifo,6010,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6009,fifo,6008,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6011,fifo,6010,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6013,fifo,6012,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6015,fifo,6014,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6013,fifo,6012,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6015,fifo,6014,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6013,fifo,6012,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6015,fifo,6014,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6013,fifo,6012,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6015,fifo,6014,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6013,fifo,6012,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6015,fifo,6014,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6013,fifo,6012,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6015,fifo,6014,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6013,fifo,6012,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6015,fifo,6014,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6013,fifo,6012,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6015,fifo,6014,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6013,fifo,6012,fifo.toString());
        fifo.remove("5");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6015,fifo,6014,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6013,fifo,6012,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6015,fifo,6014,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6017,fifo,6016,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6019,fifo,6018,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6017,fifo,6016,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6019,fifo,6018,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6017,fifo,6016,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6019,fifo,6018,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6017,fifo,6016,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6019,fifo,6018,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6017,fifo,6016,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6019,fifo,6018,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6017,fifo,6016,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6019,fifo,6018,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6017,fifo,6016,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6019,fifo,6018,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6017,fifo,6016,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6019,fifo,6018,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6017,fifo,6016,fifo.toString());
        fifo.remove("6");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6019,fifo,6018,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6017,fifo,6016,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6019,fifo,6018,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6021,fifo,6020,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6023,fifo,6022,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError7_literalMutation1735() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError7_literalMutation1735");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(6);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6021,fifo,6020,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6023,fifo,6022,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6021,fifo,6020,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6023,fifo,6022,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6021,fifo,6020,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6023,fifo,6022,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6021,fifo,6020,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6023,fifo,6022,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6021,fifo,6020,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6023,fifo,6022,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6021,fifo,6020,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6023,fifo,6022,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6021,fifo,6020,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6023,fifo,6022,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6021,fifo,6020,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6023,fifo,6022,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6021,fifo,6020,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6023,fifo,6022,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6025,fifo,6024,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6027,fifo,6026,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRemoveError8_literalMutation1745() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveError8_literalMutation1745");
        final CircularFifoQueue<E> fifo = new CircularFifoQueue<E>(6);
        fifo.add(((E)("1")));
        fifo.add(((E)("2")));
        fifo.add(((E)("3")));
        fifo.add(((E)("4")));
        fifo.add(((E)("5")));
        fifo.add(((E)("6")));
        fifo.add(((E)("7")));
        fifo.add(((E)("8")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6025,fifo,6024,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6027,fifo,6026,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6025,fifo,6024,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6027,fifo,6026,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6025,fifo,6024,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6027,fifo,6026,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6025,fifo,6024,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6027,fifo,6026,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6025,fifo,6024,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6027,fifo,6026,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6025,fifo,6024,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6027,fifo,6026,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6025,fifo,6024,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6027,fifo,6026,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6025,fifo,6024,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6027,fifo,6026,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6025,fifo,6024,fifo.toString());
        fifo.remove("7");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6027,fifo,6026,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6025,fifo,6024,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6027,fifo,6026,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6029,fifo,6028,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6031,fifo,6030,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6029,fifo,6028,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6031,fifo,6030,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6029,fifo,6028,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6031,fifo,6030,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6029,fifo,6028,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6031,fifo,6030,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6029,fifo,6028,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6031,fifo,6030,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6029,fifo,6028,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6031,fifo,6030,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6029,fifo,6028,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6031,fifo,6030,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6029,fifo,6028,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6031,fifo,6030,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6029,fifo,6028,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6031,fifo,6030,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6029,fifo,6028,fifo.toString());
        fifo.remove("8");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6031,fifo,6030,fifo.toString());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6029,fifo,6028,fifo.toString());
        fifo.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6031,fifo,6030,fifo.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRepeatedSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,b,6032,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,b,6034,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,b2,6036,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,b2,6038,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,b2,6040,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,b2,6042,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6045,b2,6044,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6047,b3,6046,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6049,b3,6048,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6051,b3,6050,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6053,b3,6052,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6055,b3,6054,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6057,b3,6056,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRepeatedSerialization_literalMutation1767() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_literalMutation1767");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(1);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,b,6032,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,b,6034,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,b2,6036,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,b2,6038,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,b2,6040,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,b2,6042,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6045,b2,6044,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6047,b3,6046,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6049,b3,6048,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6051,b3,6050,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6053,b3,6052,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6055,b3,6054,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6057,b3,6056,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRepeatedSerialization_literalMutation1768() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_literalMutation1768");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,b,6032,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,b,6034,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,b2,6036,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,b2,6038,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,b2,6040,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,b2,6042,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6045,b2,6044,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6047,b3,6046,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6049,b3,6048,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6051,b3,6050,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6053,b3,6052,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6055,b3,6054,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6057,b3,6056,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRepeatedSerialization_literalMutation1769() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_literalMutation1769");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,b,6032,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,b,6034,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,b2,6036,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,b2,6038,b2.contains("a"));
        b2.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,b2,6040,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,b2,6042,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6045,b2,6044,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6047,b3,6046,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6049,b3,6048,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6051,b3,6050,b3.contains("b"));
        b3.add(((E)("c")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6053,b3,6052,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6055,b3,6054,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6057,b3,6056,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testRepeatedSerialization_literalMutation1770() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedSerialization_literalMutation1770");
        final CircularFifoQueue<E> b = new CircularFifoQueue<E>(2);
        b.add(((E)("a")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6033,b,6032,b.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6035,b,6034,b.contains("a"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b);
        final CircularFifoQueue<E> b2 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6037,b2,6036,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6039,b2,6038,b2.contains("a"));
        b2.add(((E)("b")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6041,b2,6040,b2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6043,b2,6042,b2.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6045,b2,6044,b2.contains("b"));
        bos = new ByteArrayOutputStream();
        new ObjectOutputStream(bos).writeObject(b2);
        final CircularFifoQueue<E> b3 = ((CircularFifoQueue<E>)(new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray())).readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6047,b3,6046,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6049,b3,6048,b3.contains("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6051,b3,6050,b3.contains("b"));
        b3.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6053,b3,6052,b3.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6055,b3,6054,b3.contains("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6057,b3,6056,b3.contains("c"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetIndex() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndex");
        resetFull();
        final CircularFifoQueue<E> queue = getCollection();
        final List<E> confirmed = ((List<E>)(getConfirmed()));
        for (int i = -1 ; i < (confirmed.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5979,confirmed,5978,confirmed.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5981,queue,5980,queue.get(i));
        }
        queue.remove();
        queue.remove();
        for (int i = 0 ; i < (queue.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5983,confirmed,5982,confirmed.get((i + 2)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5985,queue,5984,queue.get(i));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGetIndex_literalMutation1673() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetIndex_literalMutation1673");
        resetFull();
        final CircularFifoQueue<E> queue = getCollection();
        final List<E> confirmed = ((List<E>)(getConfirmed()));
        for (int i = 0 ; i < (confirmed.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5979,confirmed,5978,confirmed.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5981,queue,5980,queue.get(i));
        }
        queue.remove();
        queue.remove();
        for (int i = -1 ; i < (queue.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5983,confirmed,5982,confirmed.get((i + 2)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5985,queue,5984,queue.get(i));
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

