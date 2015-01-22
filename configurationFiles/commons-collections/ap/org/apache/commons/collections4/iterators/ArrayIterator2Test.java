package org.apache.commons.collections4.iterators;

import java.util.Iterator;

/** 
 * Tests the ArrayIterator with primitive type arrays.
 * 
 * @version $Id$
 */
public class ArrayIterator2Test<E> extends AbstractIteratorTest<E> {
    protected int[] testArray = new int[]{ 2 , 4 , 6 , 8 };

    public ArrayIterator2Test(final String testName) {
        super(testName);
    }

    @Override
    public ArrayIterator<E> makeEmptyIterator() {
        return new ArrayIterator<E>(new int[0]);
    }

    @Override
    public ArrayIterator<E> makeObject() {
        return new ArrayIterator<E>(testArray);
    }

    public ArrayIterator<E> makeArrayIterator(final Object array) {
        return new ArrayIterator<E>(array);
    }

    public ArrayIterator<E> makeArrayIterator(final Object array, final int index) {
        return new ArrayIterator<E>(array , index);
    }

    public ArrayIterator<E> makeArrayIterator(final Object array, final int start, final int end) {
        return new ArrayIterator<E>(array , start , end);
    }

    @Override
    public boolean supportsRemove() {
        return false;
    }

    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        final Iterator<E> iter = makeObject();
        for (final int element : testArray) {
            final Integer testValue = Integer.valueOf(element);
            final Number iterValue = ((Number)(iter.next()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2747,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2748,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2749,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2751,e.getClass(),2750,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray");
        Iterator<E> iter = makeArrayIterator(testArray, 1);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation941");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 1;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation942");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 2, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation943");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 0));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation944");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 1;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation945");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, 0);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation946");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 2));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation947() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation947");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation948() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation948");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, 2);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation949() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation949");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation950() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation950");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 2));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation951() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation951");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 2, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation952() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation952");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 0);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation953() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation953");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 2), ((testArray.length) - 2));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIndexedArray_literalMutation954() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexedArray_literalMutation954");
        Iterator<E> iter = makeArrayIterator(testArray, 2);
        int count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2742,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2743,((testArray.length) - 2));
        iter = makeArrayIterator(testArray, 1, ((testArray.length) - 1));
        count = 0;
        while (iter.hasNext()) {
            ++count;
            iter.next();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2744,(("the count should be right using ArrayIterator(Object,1," + ((testArray.length) - 1)) + ") "));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2745,count);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2746,((testArray.length) - 2));
        try {
            iter = makeArrayIterator(testArray, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, -1);
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 0, ((testArray.length) + 1));
        } catch (final ArrayIndexOutOfBoundsException aioobe) {
        }
        try {
            iter = makeArrayIterator(testArray, 1, 1);
        } catch (final IllegalArgumentException iae) {
        }
        try {
            iter = makeArrayIterator(testArray, ((testArray.length) - 1), ((testArray.length) - 3));
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

