package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/** 
 * Abstract class for testing the ListIterator interface.
 * <p/>
 * This class provides a framework for testing an implementation of ListIterator.
 * Concrete subclasses must provide the list iterator to be tested.
 * They must also specify certain details of how the list iterator operates by
 * overriding the supportsXxx() methods if necessary.
 * 
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractListIteratorTest<E> extends AbstractIteratorTest<E> {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test class name
     */
public AbstractListIteratorTest(final String testName) {
        super(testName);
    }

    /** 
     * Implements the abstract superclass method to return the list iterator.
     * 
     * @return an empty iterator
     */
@Override
    public abstract ListIterator<E> makeEmptyIterator();

    /** 
     * Implements the abstract superclass method to return the list iterator.
     * 
     * @return a full iterator
     */
@Override
    public abstract ListIterator<E> makeObject();

    /** 
     * Whether or not we are testing an iterator that supports add().
     * Default is true.
     * 
     * @return true if Iterator supports add
     */
public boolean supportsAdd() {
        return true;
    }

    /** 
     * Whether or not we are testing an iterator that supports set().
     * Default is true.
     * 
     * @return true if Iterator supports set
     */
public boolean supportsSet() {
        return true;
    }

    /** 
     * The value to be used in the add and set tests.
     * Default is null.
     */
public E addSetValue() {
        return null;
    }

    /** 
     * Test that the empty list iterator contract is correct.
     */
public void testEmptyListIteratorIsIndeedEmpty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListIteratorIsIndeedEmpty");
        if (!(supportsEmptyIterator())) {
            return ;
        } 
        final ListIterator<E> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2610,it,2609,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2612,it,2611,it.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2614,it,2613,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2615,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2617,it,2616,it.previousIndex());
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        try {
            it.previous();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test navigation through the iterator.
     */
public void testWalkForwardAndBack() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWalkForwardAndBack");
        final ArrayList<E> list = new ArrayList<E>();
        final ListIterator<E> it = makeObject();
        while (it.hasNext()) {
            list.add(it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2619,it,2618,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2621,it,2620,it.hasPrevious());
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        for (int i = (list.size()) - 2 ; i >= 0 ; i--) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2622,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2624,it,2623,it.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2625,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2627,it,2626,it.previousIndex());
            final Object obj = list.get(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2628,obj);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,it,2629,it.previous());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,it,2631,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,it,2633,it.hasPrevious());
        try {
            it.previous();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test navigation through the iterator.
     */
public void testWalkForwardAndBack_literalMutation931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWalkForwardAndBack_literalMutation931");
        final ArrayList<E> list = new ArrayList<E>();
        final ListIterator<E> it = makeObject();
        while (it.hasNext()) {
            list.add(it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2619,it,2618,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2621,it,2620,it.hasPrevious());
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        for (int i = (list.size()) - 1 ; i >= 1 ; i--) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2622,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2624,it,2623,it.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2625,i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2627,it,2626,it.previousIndex());
            final Object obj = list.get(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2628,obj);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,it,2629,it.previous());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2632,it,2631,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2634,it,2633,it.hasPrevious());
        try {
            it.previous();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test add behaviour.
     */
public void testAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd");
        ListIterator<E> it = makeObject();
        final E addValue = addSetValue();
        if (!(supportsAdd())) {
            try {
                it.add(addValue);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it = makeObject();
        it.add(addValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2602,addValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2604,it,2603,it.previous());
        it = makeObject();
        it.add(addValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2605,(addValue != (it.next())));
        it = makeObject();
        while (it.hasNext()) {
            it.next();
            it.add(addValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2606,addValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2608,it,2607,it.previous());
            it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test set behaviour.
     */
public void testSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet");
        final ListIterator<E> it = makeObject();
        if (!(supportsSet())) {
            try {
                it.set(addSetValue());
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        try {
            it.set(addSetValue());
        } catch (final IllegalStateException ex) {
        }
        it.next();
        it.set(addSetValue());
        it.set(addSetValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveThenSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveThenSet");
        final ListIterator<E> it = makeObject();
        if ((supportsRemove()) && (supportsSet())) {
            it.next();
            it.remove();
            try {
                it.set(addSetValue());
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAddThenSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddThenSet");
        final ListIterator<E> it = makeObject();
        if ((supportsAdd()) && (supportsSet())) {
            it.next();
            it.add(addSetValue());
            try {
                it.set(addSetValue());
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove after add behaviour.
     */
public void testAddThenRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddThenRemove");
        final ListIterator<E> it = makeObject();
        if ((supportsAdd()) && (supportsRemove())) {
            it.next();
            it.add(addSetValue());
            try {
                it.remove();
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

