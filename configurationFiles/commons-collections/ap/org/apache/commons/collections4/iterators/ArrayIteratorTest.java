package org.apache.commons.collections4.iterators;

import java.util.Iterator;

/** 
 * Tests the ArrayIterator to ensure that the next() method will actually
 * perform the iteration rather than the hasNext() method.
 * The code of this test was supplied by Mauricio S. Moura.
 * 
 * @version $Id$
 */
public class ArrayIteratorTest<E> extends AbstractIteratorTest<E> {
    protected String[] testArray = new String[]{ "One" , "Two" , "Three" };

    public ArrayIteratorTest(final String testName) {
        super(testName);
    }

    @Override
    public ArrayIterator<E> makeEmptyIterator() {
        return new ArrayIterator<E>(new Object[0]);
    }

    @Override
    public ArrayIterator<E> makeObject() {
        return new ArrayIterator<E>(testArray);
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2752,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2753,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2754,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2756,e.getClass(),2755,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullArray");
        try {
            new ArrayIterator<java.lang.Object>(null);
        } catch (final NullPointerException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset");
        final ArrayIterator<E> it = makeObject();
        it.next();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2758,it,2757,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

