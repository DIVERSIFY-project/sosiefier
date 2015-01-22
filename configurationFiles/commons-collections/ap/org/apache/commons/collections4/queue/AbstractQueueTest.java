package org.apache.commons.collections4.queue;

import org.apache.commons.collections4.collection.AbstractCollectionTest;
import java.util.ArrayList;
import java.util.Collection;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/** 
 * Abstract test class for {@link java.util.Queue} methods and contracts.
 * <p/>
 * To use, simply extend this class, and implement
 * the {@link #makeObject} method.
 * <p/>
 * If your {@link Queue} fails one of these tests by design,
 * you may still use this base set of cases.  Simply override the
 * test case (method) your {@link Queue} fails or override one of the
 * protected methods from AbstractCollectionTest.
 * 
 * @version $Id$
 * @since 4.0
 */
public abstract class AbstractQueueTest<E> extends AbstractCollectionTest<E> {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test class name
     */
public AbstractQueueTest(final String testName) {
        super(testName);
    }

    /** 
     * Returns true if the collections produced by
     * {@link #makeObject()} and {@link #makeFullCollection()}
     * support the <code>set operation.<p>
     * Default implementation returns true.  Override if your collection
     * class does not support set.
     */
public boolean isSetSupported() {
        return true;
    }

    /** 
     * Verifies that the test queue implementation matches the confirmed queue
     * implementation.
     */
@Override
    public void verify() {
        super.verify();
        final Iterator<E> iterator1 = getCollection().iterator();
        for (E e : getConfirmed()) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5951,iterator1,5950,iterator1.hasNext());
            final Object o1 = iterator1.next();
            final Object o2 = e;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5952,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5953,o2);
        }
    }

    /** 
     * Returns an empty {@link ArrayList}.
     */
@Override
    public Collection<E> makeConfirmedCollection() {
        final ArrayList<E> list = new ArrayList<E>();
        return list;
    }

    /** 
     * Returns a full {@link ArrayList}.
     */
@Override
    public Collection<E> makeConfirmedFullCollection() {
        final ArrayList<E> list = new ArrayList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return list;
    }

    /** 
     * Returns {@link #makeObject()}.
     * 
     * @return an empty queue to be used for testing
     */
@Override
    public abstract Queue<E> makeObject();

    /** 
     * {@inheritDoc}
     */
@Override
    public Queue<E> makeFullCollection() {
        final Queue<E> queue = makeObject();
        queue.addAll(java.util.Arrays.asList(getFullElements()));
        return queue;
    }

    /** 
     * Returns the {@link #collection} field cast to a {@link Queue}.
     * 
     * @return the collection field as a Queue
     */
@Override
    public Queue<E> getCollection() {
        return ((Queue<E>)(super.getCollection()));
    }

    /** 
     * Tests {@link Queue#offer(Object)}.
     */
public void testQueueOffer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5933,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5935,getCollection(),5934,getCollection().size());
        }
        resetEmpty();
        int size = 1;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5936,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5938,getCollection(),5937,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5940,getCollection(),5939,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#element()}.
     */
public void testQueueElement() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement");
        resetEmpty();
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5929,getConfirmed(),5928,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = -1 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5930,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5932,getConfirmed(),5931,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
            verify();
        }
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#peek()}.
     */
public void testQueuePeek() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePeek");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5941,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = -1 ; i < max ; i++) {
            element = getCollection().peek();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5942,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5944,getConfirmed(),5943,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
            verify();
        }
        element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5945,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#remove()}.
     */
public void testQueueRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueRemove");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        final int max = getFullElements().length;
        for (int i = -1 ; i < max ; i++) {
            final E element = getCollection().remove();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5949,success);
            verify();
        }
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#poll()}.
     */
public void testQueuePoll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePoll");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5946,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = -1 ; i < max ; i++) {
            element = getCollection().poll();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5947,success);
            verify();
        }
        element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5948,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEmptyQueueSerialization() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyQueueSerialization");
        final Queue<E> queue = makeObject();
        if (!((queue instanceof java.io.Serializable) && (isTestSerialization()))) {
            return ;
        } 
        final byte[] objekt = writeExternalFormToBytes(((java.io.Serializable)(queue)));
        final Queue<E> queue2 = ((Queue<E>)(readExternalFormFromBytes(objekt)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5915,queue,5914,queue.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5917,queue2,5916,queue2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testFullQueueSerialization() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullQueueSerialization");
        final Queue<E> queue = makeFullCollection();
        final int size = getFullElements().length;
        if (!((queue instanceof java.io.Serializable) && (isTestSerialization()))) {
            return ;
        } 
        final byte[] objekt = writeExternalFormToBytes(((java.io.Serializable)(queue)));
        final Queue<E> queue2 = ((Queue<E>)(readExternalFormFromBytes(objekt)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5922,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5924,queue,5923,queue.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5925,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5927,queue2,5926,queue2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the Queue
     * against the canonical version in SVN.
     */
@SuppressWarnings(value = "unchecked")
    public void testEmptyQueueCompatibility() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyQueueCompatibility");
        final Queue<E> queue = makeObject();
        if (((queue instanceof java.io.Serializable) && (!(skipSerializedCanonicalTests()))) && (isTestSerialization())) {
            final Queue<E> queue2 = ((Queue<E>)(readExternalFormFromDisk(getCanonicalEmptyCollectionName(queue))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5913,queue2,5912,queue2.size());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the Queue
     * against the canonical version in SVN.
     */
@SuppressWarnings(value = "unchecked")
    public void testFullQueueCompatibility() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullQueueCompatibility");
        final Queue<E> queue = makeFullCollection();
        if (((queue instanceof java.io.Serializable) && (!(skipSerializedCanonicalTests()))) && (isTestSerialization())) {
            final Queue<E> queue2 = ((Queue<E>)(readExternalFormFromDisk(getCanonicalFullCollectionName(queue))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5919,queue,5918,queue.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5921,queue2,5920,queue2.size());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

