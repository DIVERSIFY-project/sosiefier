package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.apache.commons.collections4.ResettableIterator;

/** 
 * Tests the SingletonIterator to ensure that the next() method will actually
 * perform the iteration rather than the hasNext() method.
 * 
 * @version $Id$
 */
public class SingletonIteratorTest<E> extends AbstractIteratorTest<E> {
    private static final Object testValue = "foo";

    public SingletonIteratorTest(final String testName) {
        super(testName);
    }

    /** 
     * Returns a SingletonIterator from which
     * the element has already been removed.
     */
@Override
    public SingletonIterator<E> makeEmptyIterator() {
        final SingletonIterator<E> iter = makeObject();
        iter.next();
        iter.remove();
        iter.reset();
        return iter;
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public SingletonIterator<E> makeObject() {
        return new SingletonIterator<E>(((E)(testValue)));
    }

    @Override
    public boolean supportsRemove() {
        return true;
    }

    @Override
    public boolean supportsEmptyIterator() {
        return true;
    }

    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        final Iterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4300,iter,4299,iter.hasNext());
        final E iterValue = iter.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4301,org.apache.commons.collections4.iterators.SingletonIteratorTest.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2764,iterValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4302,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4304,e.getClass(),4303,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSingletonIteratorRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonIteratorRemove");
        final ResettableIterator<E> iter = new SingletonIterator<E>(((E)("xyzzy")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4318,iter,4317,iter.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4320,iter,4319,iter.next());
        iter.remove();
        iter.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4321,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSingletonIteratorRemove_literalMutation1153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSingletonIteratorRemove_literalMutation1153");
        final ResettableIterator<E> iter = new SingletonIterator<E>(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4318,iter,4317,iter.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4320,iter,4319,iter.next());
        iter.remove();
        iter.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4321,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset");
        final ResettableIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4306,it,4305,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4307,org.apache.commons.collections4.iterators.SingletonIteratorTest.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4309,it,4308,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4298,it,4297,it.hasNext());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4311,it,4310,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4312,org.apache.commons.collections4.iterators.SingletonIteratorTest.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4314,it,4313,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4316,it,4315,it.hasNext());
        it.reset();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4282,it,4281,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

