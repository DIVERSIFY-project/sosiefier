package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.apache.commons.collections4.ResettableIterator;
import org.junit.Test;

/** 
 * Tests the SingletonIterator to ensure that the next() method will actually
 * perform the iteration rather than the hasNext() method.
 * 
 * @version $Id$
 */
public class SingletonIterator2Test<E> extends AbstractIteratorTest<E> {
    private static final Object testValue = "foo";

    public SingletonIterator2Test(final String testName) {
        super(testName);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public SingletonIterator<E> makeEmptyIterator() {
        final SingletonIterator<E> iter = new SingletonIterator<E>(((E)(testValue)));
        iter.next();
        iter.remove();
        iter.reset();
        return iter;
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public SingletonIterator<E> makeObject() {
        return new SingletonIterator<E>(((E)(testValue)) , false);
    }

    @Override
    public boolean supportsRemove() {
        return false;
    }

    @Override
    public boolean supportsEmptyIterator() {
        return false;
    }

    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        final Iterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4286,iter,4285,iter.hasNext());
        final E iterValue = iter.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4287,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4288,iterValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3546,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3548,e.getClass(),3547,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterator_add1197() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_add1197");
        final Iterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4286,iter,4285,iter.hasNext());
        final E iterValue = iter.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4287,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4288,iterValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3546,!(iter.hasNext()));
        try {
            iter.next();
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3548,e.getClass(),3547,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset");
        final ResettableIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4290,it,4289,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4291,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4293,it,4292,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4268,it,4267,it.hasNext());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4295,it,4294,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4296,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4136,it,4135,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4138,it,4137,it.hasNext());
        it.reset();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4298,it,4297,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReset_add1198() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add1198");
        final ResettableIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4290,it,4289,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4291,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4293,it,4292,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4268,it,4267,it.hasNext());
        it.reset();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4295,it,4294,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4296,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4136,it,4135,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4138,it,4137,it.hasNext());
        it.reset();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4298,it,4297,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReset_add1199() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add1199");
        final ResettableIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4290,it,4289,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4291,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4293,it,4292,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4268,it,4267,it.hasNext());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4295,it,4294,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4296,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4136,it,4135,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4138,it,4137,it.hasNext());
        it.reset();
        it.reset();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4298,it,4297,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReset_add1200() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_add1200");
        final ResettableIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4290,it,4289,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4291,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4293,it,4292,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4268,it,4267,it.hasNext());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4295,it,4294,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4296,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4136,it,4135,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4138,it,4137,it.hasNext());
        it.reset();
        it.reset();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4298,it,4297,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReset_remove882() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove882");
        final ResettableIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4290,it,4289,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4291,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4293,it,4292,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4268,it,4267,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4295,it,4294,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4296,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4136,it,4135,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4138,it,4137,it.hasNext());
        it.reset();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4298,it,4297,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReset_remove883() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove883");
        final ResettableIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4290,it,4289,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4291,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4293,it,4292,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4268,it,4267,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4295,it,4294,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4296,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4136,it,4135,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4138,it,4137,it.hasNext());
        it.reset();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4298,it,4297,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testReset_remove884() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_remove884");
        final ResettableIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4290,it,4289,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4291,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4293,it,4292,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4268,it,4267,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4295,it,4294,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4296,org.apache.commons.collections4.iterators.SingletonIterator2Test.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4136,it,4135,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4138,it,4137,it.hasNext());
        it.reset();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4298,it,4297,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

