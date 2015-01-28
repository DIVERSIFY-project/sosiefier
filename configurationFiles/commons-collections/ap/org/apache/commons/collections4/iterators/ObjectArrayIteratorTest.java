package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.junit.Test;

/** 
 * Tests the ObjectArrayIterator.
 * 
 * @version $Id$
 */
public class ObjectArrayIteratorTest<E> extends AbstractIteratorTest<E> {
    protected String[] testArray = new String[]{ "One" , "Two" , "Three" };

    public ObjectArrayIteratorTest(final String testName) {
        super(testName);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public ObjectArrayIterator<E> makeEmptyIterator() {
        return new ObjectArrayIterator<E>(((E[])(new Object[0])));
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public ObjectArrayIterator<E> makeObject() {
        return new ObjectArrayIterator<E>(((E[])(testArray)));
    }

    @SuppressWarnings(value = "unchecked")
    public ObjectArrayIterator<E> makeArrayIterator() {
        return new ObjectArrayIterator<E>();
    }

    public ObjectArrayIterator<E> makeArrayIterator(final E[] array) {
        return new ObjectArrayIterator<E>(array);
    }

    public ObjectArrayIterator<E> makeArrayIterator(final E[] array, final int index) {
        return new ObjectArrayIterator<E>(array , index);
    }

    public ObjectArrayIterator<E> makeArrayIterator(final E[] array, final int start, final int end) {
        return new ObjectArrayIterator<E>(array , start , end);
    }

    @Override
    public boolean supportsRemove() {
        return false;
    }

    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        final Iterator<E> iter = makeObject();
        for (final String testValue : testArray) {
            final E iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3993,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3994,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3995,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3997,e.getClass(),3996,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterator_add1115() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_add1115");
        final Iterator<E> iter = makeObject();
        for (final String testValue : testArray) {
            final E iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3993,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3994,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3995,!(iter.hasNext()));
        try {
            iter.next();
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3997,e.getClass(),3996,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullArray");
        try {
            makeArrayIterator(null);
            makeArrayIterator(null);
        } catch (final NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testReset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset");
        final ObjectArrayIterator<E> it = makeArrayIterator(((E[])(testArray)));
        it.next();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3999,it,3998,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testReset_add1117() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add1117");
        final ObjectArrayIterator<E> it = makeArrayIterator(((E[])(testArray)));
        it.next();
        it.next();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3999,it,3998,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testReset_add1118() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add1118");
        final ObjectArrayIterator<E> it = makeArrayIterator(((E[])(testArray)));
        it.next();
        it.reset();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3999,it,3998,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testReset_literalMutation1096() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_literalMutation1096");
        final ObjectArrayIterator<E> it = makeArrayIterator(((E[])(testArray)));
        it.next();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3999,it,3998,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testReset_remove835() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove835");
        final ObjectArrayIterator<E> it = makeArrayIterator(((E[])(testArray)));
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3999,it,3998,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

