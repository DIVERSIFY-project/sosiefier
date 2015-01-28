package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.junit.Test;

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
@Test(timeout = 1000)
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
     * Test that the empty list iterator contract is correct.
     */
@Test(timeout = 1000)
    public void testEmptyListIteratorIsIndeedEmpty_add900() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListIteratorIsIndeedEmpty_add900");
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
            it.previous();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test navigation through the iterator.
     */
@Test(timeout = 1000)
    public void testWalkForwardAndBack_add909() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWalkForwardAndBack_add909");
        final ArrayList<E> list = new ArrayList<E>();
        final ListIterator<E> it = makeObject();
        while (it.hasNext()) {
            list.add(it.next());
            list.add(it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2619,it,2618,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2621,it,2620,it.hasPrevious());
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        for (int i = (list.size()) - 1 ; i >= 0 ; i--) {
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
@Test(timeout = 1000)
    public void testWalkForwardAndBack_add910() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWalkForwardAndBack_add910");
        final ArrayList<E> list = new ArrayList<E>();
        final ListIterator<E> it = makeObject();
        while (it.hasNext()) {
            list.add(it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2619,it,2618,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2621,it,2620,it.hasPrevious());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException e) {
        }
        for (int i = (list.size()) - 1 ; i >= 0 ; i--) {
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
@Test(timeout = 1000)
    public void testWalkForwardAndBack_add911() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWalkForwardAndBack_add911");
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
        for (int i = (list.size()) - 1 ; i >= 0 ; i--) {
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
        for (int i = (list.size()) - 0 ; i >= 0 ; i--) {
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
@Test(timeout = 1000)
    public void testAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd");
        ListIterator<E> it = makeObject();
        final E addValue = addSetValue();
        if (!(supportsAdd())) {
            try {
                it.add(addValue);
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
     * Test add behaviour.
     */
@Test(timeout = 1000)
    public void testAdd_add888() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add888");
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
     * Test add behaviour.
     */
@Test(timeout = 1000)
    public void testAdd_add889() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add889");
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
     * Test add behaviour.
     */
@Test(timeout = 1000)
    public void testAdd_add890() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add890");
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
            it.next();
            it.add(addValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2606,addValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2608,it,2607,it.previous());
            it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test add behaviour.
     */
@Test(timeout = 1000)
    public void testAdd_add891() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add891");
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
            it.add(addValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2606,addValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2608,it,2607,it.previous());
            it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test add behaviour.
     */
@Test(timeout = 1000)
    public void testAdd_add892() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_add892");
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
            it.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test add behaviour.
     */
@Test(timeout = 1000)
    public void testAdd_remove689() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove689");
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
     * Test add behaviour.
     */
@Test(timeout = 1000)
    public void testAdd_remove690() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAdd_remove690");
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
@Test(timeout = 1000)
    public void testSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet");
        final ListIterator<E> it = makeObject();
        if (!(supportsSet())) {
            try {
                it.set(addSetValue());
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

    /** 
     * Test set behaviour.
     */
@Test(timeout = 1000)
    public void testSet_add905() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add905");
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
            it.set(addSetValue());
        } catch (final IllegalStateException ex) {
        }
        it.next();
        it.set(addSetValue());
        it.set(addSetValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test set behaviour.
     */
@Test(timeout = 1000)
    public void testSet_add906() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add906");
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
        it.next();
        it.set(addSetValue());
        it.set(addSetValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test set behaviour.
     */
@Test(timeout = 1000)
    public void testSet_add907() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add907");
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
        it.set(addSetValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test set behaviour.
     */
@Test(timeout = 1000)
    public void testSet_add908() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_add908");
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
        it.set(addSetValue());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test set behaviour.
     */
@Test(timeout = 1000)
    public void testSet_remove694() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_remove694");
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
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test set behaviour.
     */
@Test(timeout = 1000)
    public void testSet_remove695() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSet_remove695");
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
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveThenSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveThenSet");
        final ListIterator<E> it = makeObject();
        if ((supportsRemove()) && (supportsSet())) {
            it.next();
            it.next();
            it.remove();
            try {
                it.set(addSetValue());
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveThenSet_add902() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveThenSet_add902");
        final ListIterator<E> it = makeObject();
        if ((supportsRemove()) && (supportsSet())) {
            it.next();
            it.remove();
            it.remove();
            try {
                it.set(addSetValue());
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveThenSet_add903() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveThenSet_add903");
        final ListIterator<E> it = makeObject();
        if ((supportsRemove()) && (supportsSet())) {
            it.next();
            it.remove();
            try {
                it.set(addSetValue());
                it.set(addSetValue());
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveThenSet_remove693() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveThenSet_remove693");
        final ListIterator<E> it = makeObject();
        if ((supportsRemove()) && (supportsSet())) {
            it.next();
            try {
                it.set(addSetValue());
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddThenSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddThenSet");
        final ListIterator<E> it = makeObject();
        if ((supportsAdd()) && (supportsSet())) {
            it.next();
            it.next();
            it.add(addSetValue());
            try {
                it.set(addSetValue());
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddThenSet_add897() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddThenSet_add897");
        final ListIterator<E> it = makeObject();
        if ((supportsAdd()) && (supportsSet())) {
            it.next();
            it.add(addSetValue());
            it.add(addSetValue());
            try {
                it.set(addSetValue());
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddThenSet_add898() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddThenSet_add898");
        final ListIterator<E> it = makeObject();
        if ((supportsAdd()) && (supportsSet())) {
            it.next();
            it.add(addSetValue());
            try {
                it.set(addSetValue());
                it.set(addSetValue());
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testAddThenSet_remove692() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddThenSet_remove692");
        final ListIterator<E> it = makeObject();
        if ((supportsAdd()) && (supportsSet())) {
            it.next();
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
@Test(timeout = 1000)
    public void testAddThenRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddThenRemove");
        final ListIterator<E> it = makeObject();
        if ((supportsAdd()) && (supportsRemove())) {
            it.next();
            it.next();
            it.add(addSetValue());
            try {
                it.remove();
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove after add behaviour.
     */
@Test(timeout = 1000)
    public void testAddThenRemove_add894() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddThenRemove_add894");
        final ListIterator<E> it = makeObject();
        if ((supportsAdd()) && (supportsRemove())) {
            it.next();
            it.add(addSetValue());
            it.add(addSetValue());
            try {
                it.remove();
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove after add behaviour.
     */
@Test(timeout = 1000)
    public void testAddThenRemove_add895() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddThenRemove_add895");
        final ListIterator<E> it = makeObject();
        if ((supportsAdd()) && (supportsRemove())) {
            it.next();
            it.add(addSetValue());
            try {
                it.remove();
                it.remove();
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove after add behaviour.
     */
@Test(timeout = 1000)
    public void testAddThenRemove_remove691() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAddThenRemove_remove691");
        final ListIterator<E> it = makeObject();
        if ((supportsAdd()) && (supportsRemove())) {
            it.next();
            try {
                it.remove();
            } catch (final IllegalStateException e) {
            }
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

