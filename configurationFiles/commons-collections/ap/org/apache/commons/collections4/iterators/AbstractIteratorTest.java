package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.AbstractObjectTest;
import java.util.Iterator;
import java.util.NoSuchElementException;

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
public void testEmptyIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIterator");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2597,it,2596,it.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test normal iteration behaviour.
     */
public void testFullIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullIterator");
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
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2601,it,2600,it.toString());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove behaviour.
     */
public void testRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove");
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
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

