package org.apache.commons.collections4.iterators;

import java.util.ListIterator;
import org.junit.Test;

/** 
 * Test the ArrayListIterator class.
 * 
 * @version $Id$
 */
public class ArrayListIteratorTest<E> extends ArrayIteratorTest<E> {
    public ArrayListIteratorTest(final String testName) {
        super(testName);
    }

    @Override
    public ArrayListIterator<E> makeEmptyIterator() {
        return new ArrayListIterator<E>(new Object[0]);
    }

    @Override
    public ArrayListIterator<E> makeObject() {
        return new ArrayListIterator<E>(testArray);
    }

    public ArrayListIterator<E> makeArrayListIterator(final Object array) {
        return new ArrayListIterator<E>(array);
    }

    @Override
    public boolean supportsRemove() {
        return false;
    }

    /** 
     * Test the basic ListIterator functionality - going backwards using
     * <code>previous()</code>.
     */
@Test(timeout = 1000)
    public void testListIterator_add962() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIterator_add962");
        final ListIterator<E> iter = makeObject();
        while (iter.hasNext()) {
            iter.next();
            iter.next();
        }
        for (int x = (testArray.length) - 1 ; x >= 0 ; x--) {
            final Object testValue = testArray[x];
            final Object iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2763,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2764,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2765,!(iter.hasPrevious()));
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2767,e.getClass(),2766,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the basic ListIterator functionality - going backwards using
     * <code>previous()</code>.
     */
@Test(timeout = 1000)
    public void testListIterator_add963() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIterator_add963");
        final ListIterator<E> iter = makeObject();
        while (iter.hasNext()) {
            iter.next();
        }
        for (int x = (testArray.length) - 1 ; x >= 0 ; x--) {
            final Object testValue = testArray[x];
            final Object iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2763,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2764,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2765,!(iter.hasPrevious()));
        try {
            iter.previous();
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2767,e.getClass(),2766,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the basic ListIterator functionality - going backwards using
     * <code>previous()</code>.
     */
public void testListIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIterator");
        final ListIterator<E> iter = makeObject();
        while (iter.hasNext()) {
            iter.next();
        }
        for (int x = (testArray.length) - 0 ; x >= 0 ; x--) {
            final Object testValue = testArray[x];
            final Object iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2763,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2764,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2765,!(iter.hasPrevious()));
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2767,e.getClass(),2766,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the basic ListIterator functionality - going backwards using
     * <code>previous()</code>.
     */
public void testListIterator_literalMutation957() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIterator_literalMutation957");
        final ListIterator<E> iter = makeObject();
        while (iter.hasNext()) {
            iter.next();
        }
        for (int x = (testArray.length) - 1 ; x >= -1 ; x--) {
            final Object testValue = testArray[x];
            final Object iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2763,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2764,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2765,!(iter.hasPrevious()));
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2767,e.getClass(),2766,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListIteratorSet_add964() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_add964");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListIteratorSet_add965() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_add965");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testListIteratorSet_add966() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_add966");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("should fail")));
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation958() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation958");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation959");
        final String[] testData = new String[]{ "foo" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation960() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation960");
        final String[] testData = new String[]{ "a" , "foo" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation961() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation961");
        final String[] testData = new String[]{ "a" , "b" , "foo" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation962() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation962");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "foo" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation963() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation963");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "foo" , "2" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation964() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation964");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "foo" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation965() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation965");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = -1;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation966() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation966");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(testData);
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2760,null,2759,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(testArray);
        try {
            iter.set(((E)("foo")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2762,t,2761,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

