package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.AbstractObjectTest;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.Test;

/** 
 * Abstract class for testing the Iterator interface.
 * <p/>
 * This class provides a framework for testing an implementation of Iterator.
 * Concrete subclasses must provide the iterator to be tested.
 * They must also specify certain details of how the iterator operates by
 * overriding the supportsXxx() methods if necessary.
 * 
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractIteratorTest<E> extends AbstractObjectTest {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test class name
     */
public AbstractIteratorTest(final String testName) {
        super(testName);
    }

    /** 
     * Implement this method to return an iterator over an empty collection.
     * 
     * @return an empty iterator
     */
public abstract Iterator<E> makeEmptyIterator();

    /** 
     * Implements the abstract superclass method to return the full iterator.
     * 
     * @return a full iterator
     */
@Override
    public abstract Iterator<E> makeObject();

    /** 
     * Whether or not we are testing an iterator that can be empty.
     * Default is true.
     * 
     * @return true if Iterator can be empty
     */
public boolean supportsEmptyIterator() {
        return true;
    }

    /** 
     * Whether or not we are testing an iterator that can contain elements.
     * Default is true.
     * 
     * @return true if Iterator can be full
     */
public boolean supportsFullIterator() {
        return true;
    }

    /** 
     * Whether or not we are testing an iterator that supports remove().
     * Default is true.
     * 
     * @return true if Iterator supports remove
     */
public boolean supportsRemove() {
        return true;
    }

    /** 
     * Allows subclasses to add complex cross verification
     */
public void verify() {
    }

    /** 
     * Test the empty iterator.
     */
@Test(timeout = 1000)
    public void testEmptyIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIterator");
        if (!(supportsEmptyIterator())) {
            return ;
        } 
        final Iterator<E> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2595,it,2594,it.hasNext());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2597,it,2596,it.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the empty iterator.
     */
@Test(timeout = 1000)
    public void testEmptyIterator_add876() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIterator_add876");
        if (!(supportsEmptyIterator())) {
            return ;
        } 
        final Iterator<E> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2595,it,2594,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        verify();
        verify();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2597,it,2596,it.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the empty iterator.
     */
@Test(timeout = 1000)
    public void testEmptyIterator_remove686() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIterator_remove686");
        if (!(supportsEmptyIterator())) {
            return ;
        } 
        final Iterator<E> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2595,it,2594,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2597,it,2596,it.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test normal iteration behaviour.
     */
@Test(timeout = 1000)
    public void testFullIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullIterator");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final Iterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2599,it,2598,it.hasNext());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException e) {
        }
        while (it.hasNext()) {
            it.next();
            verify();
        }
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2601,it,2600,it.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test normal iteration behaviour.
     */
@Test(timeout = 1000)
    public void testFullIterator_add878() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullIterator_add878");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final Iterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2599,it,2598,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        while (it.hasNext()) {
            it.next();
            it.next();
            verify();
        }
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2601,it,2600,it.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test normal iteration behaviour.
     */
@Test(timeout = 1000)
    public void testFullIterator_add879() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullIterator_add879");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final Iterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2599,it,2598,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        while (it.hasNext()) {
            it.next();
            verify();
            verify();
        }
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2601,it,2600,it.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test normal iteration behaviour.
     */
@Test(timeout = 1000)
    public void testFullIterator_add880() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullIterator_add880");
        if (!(supportsFullIterator())) {
            return ;
        } 
        final Iterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2599,it,2598,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        while (it.hasNext()) {
            it.next();
            verify();
        }
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2601,it,2600,it.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove behaviour.
     */
@Test(timeout = 1000)
    public void testRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove");
        final Iterator<E> it = makeObject();
        if (!(supportsRemove())) {
            try {
                it.remove();
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        it.next();
        it.remove();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove behaviour.
     */
@Test(timeout = 1000)
    public void testRemove_add882() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add882");
        final Iterator<E> it = makeObject();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        try {
            it.remove();
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        it.next();
        it.remove();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove behaviour.
     */
@Test(timeout = 1000)
    public void testRemove_add883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add883");
        final Iterator<E> it = makeObject();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        verify();
        it.next();
        it.remove();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove behaviour.
     */
@Test(timeout = 1000)
    public void testRemove_add884() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add884");
        final Iterator<E> it = makeObject();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        it.next();
        it.next();
        it.remove();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove behaviour.
     */
@Test(timeout = 1000)
    public void testRemove_add885() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add885");
        final Iterator<E> it = makeObject();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        it.next();
        it.remove();
        it.remove();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove behaviour.
     */
@Test(timeout = 1000)
    public void testRemove_add886() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add886");
        final Iterator<E> it = makeObject();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        it.next();
        it.remove();
        try {
            it.remove();
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove behaviour.
     */
@Test(timeout = 1000)
    public void testRemove_remove687() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove687");
        final Iterator<E> it = makeObject();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        it.next();
        it.remove();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove behaviour.
     */
@Test(timeout = 1000)
    public void testRemove_remove688() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove688");
        final Iterator<E> it = makeObject();
        if (!(supportsRemove())) {
            try {
                it.remove();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        verify();
        it.next();
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

