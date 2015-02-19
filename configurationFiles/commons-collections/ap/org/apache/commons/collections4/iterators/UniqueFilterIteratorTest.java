package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;

/** 
 * Tests the UniqueFilterIterator class.
 * 
 * @version $Id$
 */
public class UniqueFilterIteratorTest<E> extends AbstractIteratorTest<E> {
    protected String[] testArray = new String[]{ "One" , "Two" , "Three" , "Four" , "Five" , "Six" };

    protected List<E> list1 = null;

    public UniqueFilterIteratorTest(final String testName) {
        super(testName);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public void setUp() {
        list1 = new ArrayList<E>();
        list1.add(((E)("One")));
        list1.add(((E)("Two")));
        list1.add(((E)("Three")));
        list1.add(((E)("Two")));
        list1.add(((E)("One")));
        list1.add(((E)("Four")));
        list1.add(((E)("Five")));
        list1.add(((E)("Five")));
        list1.add(((E)("Six")));
        list1.add(((E)("Five")));
    }

    @Override
    public UniqueFilterIterator<E> makeEmptyIterator() {
        final ArrayList<E> list = new ArrayList<E>();
        return new UniqueFilterIterator<E>(list.iterator());
    }

    @Override
    public UniqueFilterIterator<E> makeObject() {
        final Iterator<E> i = list1.iterator();
        return new UniqueFilterIterator<E>(i);
    }

    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        final Iterator<E> iter = makeObject();
        for (final String testValue : testArray) {
            final E iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2763,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2764,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4381,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2767,e.getClass(),2766,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterator_add1213() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_add1213");
        final Iterator<E> iter = makeObject();
        for (final String testValue : testArray) {
            final E iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2763,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2764,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4381,!(iter.hasNext()));
        try {
            iter.next();
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2767,e.getClass(),2766,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

