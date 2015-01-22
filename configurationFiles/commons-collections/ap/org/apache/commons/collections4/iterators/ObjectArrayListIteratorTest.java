package org.apache.commons.collections4.iterators;

import java.util.ListIterator;

/** 
 * Tests the ObjectArrayListIterator class.
 * 
 * @version $Id$
 */
public class ObjectArrayListIteratorTest<E> extends ObjectArrayIteratorTest<E> {
    public ObjectArrayListIteratorTest(final String testName) {
        super(testName);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public ObjectArrayListIterator<E> makeEmptyIterator() {
        return new ObjectArrayListIterator<E>(((E[])(new Object[0])));
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public ObjectArrayListIterator<E> makeObject() {
        return new ObjectArrayListIterator<E>(((E[])(testArray)));
    }

    public ObjectArrayListIterator<E> makeArrayListIterator(final E[] array) {
        return new ObjectArrayListIterator<E>(array);
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
        for (int x = (testArray.length) - 1 ; x >= 0 ; x--) {
            final Object testValue = testArray[x];
            final Object iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3446,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3447,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4000,!(iter.hasPrevious()));
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3450,e.getClass(),3449,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the basic ListIterator functionality - going backwards using
     * <code>previous()</code>.
     */
public void testListIterator_literalMutation1097() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIterator_literalMutation1097");
        final ListIterator<E> iter = makeObject();
        while (iter.hasNext()) {
            iter.next();
        }
        for (int x = (testArray.length) - 0 ; x >= 0 ; x--) {
            final Object testValue = testArray[x];
            final Object iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3446,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3447,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4000,!(iter.hasPrevious()));
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3450,e.getClass(),3449,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test the basic ListIterator functionality - going backwards using
     * <code>previous()</code>.
     */
public void testListIterator_literalMutation1098() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIterator_literalMutation1098");
        final ListIterator<E> iter = makeObject();
        while (iter.hasNext()) {
            iter.next();
        }
        for (int x = (testArray.length) - 1 ; x >= 1 ; x--) {
            final Object testValue = testArray[x];
            final Object iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3446,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3447,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4000,!(iter.hasPrevious()));
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3450,e.getClass(),3449,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
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
        ListIterator<E> iter = makeArrayListIterator(((E[])(testData)));
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4002,null,4001,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(((E[])(testArray)));
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4004,t,4003,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation1099() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation1099");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(((E[])(testData)));
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4002,null,4001,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(((E[])(testArray)));
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4004,t,4003,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation1100() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation1100");
        final String[] testData = new String[]{ "foo" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(((E[])(testData)));
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4002,null,4001,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(((E[])(testArray)));
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4004,t,4003,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation1101() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation1101");
        final String[] testData = new String[]{ "a" , "foo" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(((E[])(testData)));
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4002,null,4001,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(((E[])(testArray)));
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4004,t,4003,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation1102() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation1102");
        final String[] testData = new String[]{ "a" , "b" , "foo" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(((E[])(testData)));
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4002,null,4001,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(((E[])(testArray)));
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4004,t,4003,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation1103() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation1103");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "foo" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(((E[])(testData)));
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4002,null,4001,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(((E[])(testArray)));
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4004,t,4003,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation1104() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation1104");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "foo" , "2" };
        ListIterator<E> iter = makeArrayListIterator(((E[])(testData)));
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4002,null,4001,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(((E[])(testArray)));
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4004,t,4003,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation1105() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation1105");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "foo" };
        ListIterator<E> iter = makeArrayListIterator(((E[])(testData)));
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4002,null,4001,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(((E[])(testArray)));
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4004,t,4003,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation1106() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation1106");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(((E[])(testData)));
        int x = 1;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4002,null,4001,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(((E[])(testArray)));
        try {
            iter.set(((E)("should fail")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4004,t,4003,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the {@link java.util.ListIterator#set} operation.
     */
@SuppressWarnings(value = "unchecked")
    public void testListIteratorSet_literalMutation1107() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIteratorSet_literalMutation1107");
        final String[] testData = new String[]{ "a" , "b" , "c" };
        final String[] result = new String[]{ "0" , "1" , "2" };
        ListIterator<E> iter = makeArrayListIterator(((E[])(testData)));
        int x = 0;
        while (iter.hasNext()) {
            iter.next();
            iter.set(((E)(java.lang.Integer.toString(x))));
            x++;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4002,null,4001,java.util.Arrays.equals(testData, result));
        iter = makeArrayListIterator(((E[])(testArray)));
        try {
            iter.set(((E)("foo")));
        } catch (final IllegalStateException e) {
        } catch (final Throwable t) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4004,t,4003,t.toString());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

