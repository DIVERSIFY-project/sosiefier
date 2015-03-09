package org.apache.commons.collections4.queue;

import org.apache.commons.collections4.collection.AbstractCollectionTest;
import java.util.ArrayList;
import java.util.Collection;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.junit.Test;

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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5912,iterator1,5911,iterator1.hasNext());
            final Object o1 = iterator1.next();
            final Object o2 = e;
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5913,o1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5914,o2);
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
@Test(timeout = 1000)
    public void testQueueOffer_add1802() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer_add1802");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            resetEmpty();
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#offer(Object)}.
     */
@Test(timeout = 1000)
    public void testQueueOffer_add1803() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer_add1803");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#offer(Object)}.
     */
@Test(timeout = 1000)
    public void testQueueOffer_add1804() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer_add1804");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#offer(Object)}.
     */
@Test(timeout = 1000)
    public void testQueueOffer_add1805() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer_add1805");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        resetEmpty();
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#offer(Object)}.
     */
@Test(timeout = 1000)
    public void testQueueOffer_add1806() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer_add1806");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#offer(Object)}.
     */
@Test(timeout = 1000)
    public void testQueueOffer_add1807() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer_add1807");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        resetEmpty();
        int size = -1;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#offer(Object)}.
     */
@Test(timeout = 1000)
    public void testQueueOffer_remove1377() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer_remove1377");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#offer(Object)}.
     */
@Test(timeout = 1000)
    public void testQueueOffer_remove1378() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer_remove1378");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().offer(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#offer(Object)}.
     */
@Test(timeout = 1000)
    public void testQueueOffer_remove1379() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer_remove1379");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#offer(Object)}.
     */
@Test(timeout = 1000)
    public void testQueueOffer_remove1380() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer_remove1380");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#offer(Object)}.
     */
@Test(timeout = 1000)
    public void testQueueOffer_remove1381() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer_remove1381");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            verify();
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#offer(Object)}.
     */
@Test(timeout = 1000)
    public void testQueueOffer_remove1382() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueOffer_remove1382");
        if (!(isAddSupported())) {
            return ;
        } 
        final E[] elements = getFullElements();
        for (final E element : elements) {
            resetEmpty();
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            verify();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5894,r);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5896,getCollection(),5895,getCollection().size());
        }
        resetEmpty();
        int size = 0;
        for (final E element : elements) {
            final boolean r = getCollection().offer(element);
            getConfirmed().add(element);
            if (r) {
                size++;
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5897,size);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,getCollection(),5898,getCollection().size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5901,getCollection(),5900,getCollection().contains(element));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#element()}.
     */
@Test(timeout = 1000)
    public void testQueueElement_add1795() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement_add1795");
        resetEmpty();
        resetEmpty();
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
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
     * Tests {@link Queue#element()}.
     */
@Test(timeout = 1000)
    public void testQueueElement_add1796() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement_add1796");
        resetEmpty();
        try {
            getCollection().element();
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
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
     * Tests {@link Queue#element()}.
     */
@Test(timeout = 1000)
    public void testQueueElement_add1797() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement_add1797");
        resetEmpty();
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
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
     * Tests {@link Queue#element()}.
     */
@Test(timeout = 1000)
    public void testQueueElement_add1798() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement_add1798");
        resetEmpty();
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
            getCollection().remove(element);
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
     * Tests {@link Queue#element()}.
     */
@Test(timeout = 1000)
    public void testQueueElement_add1799() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement_add1799");
        resetEmpty();
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
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
     * Tests {@link Queue#element()}.
     */
@Test(timeout = 1000)
    public void testQueueElement_add1800() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement_add1800");
        resetEmpty();
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
            verify();
            verify();
        }
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#element()}.
     */
@Test(timeout = 1000)
    public void testQueueElement_add1801() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement_add1801");
        resetEmpty();
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
            verify();
        }
        try {
            getCollection().element();
            getCollection().element();
        } catch (final NoSuchElementException e) {
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 1 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
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
     * Tests {@link Queue#element()}.
     */
@Test(timeout = 1000)
    public void testQueueElement_remove1372() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement_remove1372");
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
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
     * Tests {@link Queue#element()}.
     */
@Test(timeout = 1000)
    public void testQueueElement_remove1373() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement_remove1373");
        resetEmpty();
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
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
     * Tests {@link Queue#element()}.
     */
@Test(timeout = 1000)
    public void testQueueElement_remove1374() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement_remove1374");
        resetEmpty();
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
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
     * Tests {@link Queue#element()}.
     */
@Test(timeout = 1000)
    public void testQueueElement_remove1375() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement_remove1375");
        resetEmpty();
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
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
     * Tests {@link Queue#element()}.
     */
@Test(timeout = 1000)
    public void testQueueElement_remove1376() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueElement_remove1376");
        resetEmpty();
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5890,getConfirmed(),5889,getConfirmed().contains(getCollection().element()));
        if (!(isRemoveSupported())) {
            return ;
        } 
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().element();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5891,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5893,getConfirmed(),5892,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
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
@Test(timeout = 1000)
    public void testQueuePeek_add1808() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePeek_add1808");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        E element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5902,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().peek();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5903,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5905,getConfirmed(),5904,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
            verify();
        }
        element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5906,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#peek()}.
     */
@Test(timeout = 1000)
    public void testQueuePeek_add1809() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePeek_add1809");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5902,element);
        resetFull();
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().peek();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5903,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5905,getConfirmed(),5904,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
            verify();
        }
        element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5906,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#peek()}.
     */
@Test(timeout = 1000)
    public void testQueuePeek_add1810() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePeek_add1810");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5902,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().peek();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5903,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5905,getConfirmed(),5904,getConfirmed().contains(element));
            getCollection().remove(element);
            getCollection().remove(element);
            getConfirmed().remove(element);
            verify();
        }
        element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5906,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#peek()}.
     */
@Test(timeout = 1000)
    public void testQueuePeek_add1811() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePeek_add1811");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5902,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().peek();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5903,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5905,getConfirmed(),5904,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
            getConfirmed().remove(element);
            verify();
        }
        element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5906,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#peek()}.
     */
@Test(timeout = 1000)
    public void testQueuePeek_add1812() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePeek_add1812");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5902,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().peek();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5903,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5905,getConfirmed(),5904,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
            verify();
            verify();
        }
        element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5906,element);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5902,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 1 ; i < max ; i++) {
            element = getCollection().peek();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5903,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5905,getConfirmed(),5904,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
            verify();
        }
        element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5906,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#peek()}.
     */
@Test(timeout = 1000)
    public void testQueuePeek_remove1383() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePeek_remove1383");
        if (!(isRemoveSupported())) {
            return ;
        } 
        E element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5902,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().peek();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5903,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5905,getConfirmed(),5904,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
            verify();
        }
        element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5906,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#peek()}.
     */
@Test(timeout = 1000)
    public void testQueuePeek_remove1384() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePeek_remove1384");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5902,element);
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().peek();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5903,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5905,getConfirmed(),5904,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
            verify();
        }
        element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5906,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#peek()}.
     */
@Test(timeout = 1000)
    public void testQueuePeek_remove1385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePeek_remove1385");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5902,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().peek();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5903,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5905,getConfirmed(),5904,getConfirmed().contains(element));
            getConfirmed().remove(element);
            verify();
        }
        element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5906,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#peek()}.
     */
@Test(timeout = 1000)
    public void testQueuePeek_remove1386() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePeek_remove1386");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5902,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().peek();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5903,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5905,getConfirmed(),5904,getConfirmed().contains(element));
            getConfirmed().remove(element);
            verify();
        }
        element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5906,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#peek()}.
     */
@Test(timeout = 1000)
    public void testQueuePeek_remove1387() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePeek_remove1387");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5902,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().peek();
            if (!(isNullSupported())) {
                fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5903,element);
            } 
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5905,getConfirmed(),5904,getConfirmed().contains(element));
            getCollection().remove(element);
            getConfirmed().remove(element);
        }
        element = getCollection().peek();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5906,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#remove()}.
     */
@Test(timeout = 1000)
    public void testQueueRemove_add1816() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueRemove_add1816");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        try {
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().remove();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5910,success);
            verify();
        }
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#remove()}.
     */
@Test(timeout = 1000)
    public void testQueueRemove_add1817() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueRemove_add1817");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().remove();
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().remove();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5910,success);
            verify();
        }
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#remove()}.
     */
@Test(timeout = 1000)
    public void testQueueRemove_add1818() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueRemove_add1818");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().remove();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5910,success);
            verify();
        }
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#remove()}.
     */
@Test(timeout = 1000)
    public void testQueueRemove_add1819() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueRemove_add1819");
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
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().remove();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5910,success);
            verify();
            verify();
        }
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#remove()}.
     */
@Test(timeout = 1000)
    public void testQueueRemove_add1820() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueRemove_add1820");
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
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().remove();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5910,success);
            verify();
        }
        try {
            getCollection().element();
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
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
        for (int i = 1 ; i < max ; i++) {
            final E element = getCollection().remove();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5910,success);
            verify();
        }
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#remove()}.
     */
@Test(timeout = 1000)
    public void testQueueRemove_remove1391() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueRemove_remove1391");
        if (!(isRemoveSupported())) {
            return ;
        } 
        try {
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().remove();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5910,success);
            verify();
        }
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#remove()}.
     */
@Test(timeout = 1000)
    public void testQueueRemove_remove1392() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueRemove_remove1392");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        try {
            getCollection().remove();
        } catch (final NoSuchElementException e) {
        }
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().remove();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5910,success);
            verify();
        }
        try {
            getCollection().element();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#remove()}.
     */
@Test(timeout = 1000)
    public void testQueueRemove_remove1393() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueueRemove_remove1393");
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
        for (int i = 0 ; i < max ; i++) {
            final E element = getCollection().remove();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5910,success);
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
@Test(timeout = 1000)
    public void testQueuePoll_add1813() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePoll_add1813");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        resetEmpty();
        E element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5907,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().poll();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5908,success);
            verify();
        }
        element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5909,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#poll()}.
     */
@Test(timeout = 1000)
    public void testQueuePoll_add1814() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePoll_add1814");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5907,element);
        resetFull();
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().poll();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5908,success);
            verify();
        }
        element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5909,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#poll()}.
     */
@Test(timeout = 1000)
    public void testQueuePoll_add1815() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePoll_add1815");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5907,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().poll();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5908,success);
            verify();
            verify();
        }
        element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5909,element);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5907,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 1 ; i < max ; i++) {
            element = getCollection().poll();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5908,success);
            verify();
        }
        element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5909,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#poll()}.
     */
@Test(timeout = 1000)
    public void testQueuePoll_remove1388() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePoll_remove1388");
        if (!(isRemoveSupported())) {
            return ;
        } 
        E element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5907,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().poll();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5908,success);
            verify();
        }
        element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5909,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#poll()}.
     */
@Test(timeout = 1000)
    public void testQueuePoll_remove1389() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePoll_remove1389");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5907,element);
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().poll();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5908,success);
            verify();
        }
        element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5909,element);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests {@link Queue#poll()}.
     */
@Test(timeout = 1000)
    public void testQueuePoll_remove1390() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testQueuePoll_remove1390");
        if (!(isRemoveSupported())) {
            return ;
        } 
        resetEmpty();
        E element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5907,element);
        resetFull();
        final int max = getFullElements().length;
        for (int i = 0 ; i < max ; i++) {
            element = getCollection().poll();
            final boolean success = getConfirmed().remove(element);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5908,success);
        }
        element = getCollection().poll();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5909,element);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5876,queue,5875,queue.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5878,queue2,5877,queue2.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5883,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5885,queue,5884,queue.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5886,size);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5888,queue2,5887,queue2.size());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5874,queue2,5873,queue2.size());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5880,queue,5879,queue.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5882,queue2,5881,queue2.size());
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

