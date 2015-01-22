package org.apache.commons.collections4.iterators;

import java.util.ListIterator;
import org.apache.commons.collections4.ResettableListIterator;

/** 
 * Tests the SingletonListIterator.
 * 
 * @version $Id$
 */
public class SingletonListIteratorTest<E> extends AbstractListIteratorTest<E> {
    private static final Object testValue = "foo";

    public SingletonListIteratorTest(final String testName) {
        super(testName);
    }

    /** 
     * Returns a SingletonListIterator from which
     * the element has already been removed.
     */
@Override
    public SingletonListIterator<E> makeEmptyIterator() {
        final SingletonListIterator<E> iter = makeObject();
        iter.next();
        iter.remove();
        iter.reset();
        return iter;
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public SingletonListIterator<E> makeObject() {
        return new SingletonListIterator<E>(((E)(testValue)));
    }

    @Override
    public boolean supportsAdd() {
        return false;
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
        final ListIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4323,iter,4322,iter.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4324,!(iter.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4326,iter,4325,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4327,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4329,iter,4328,iter.previousIndex());
        Object iterValue = iter.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4330,org.apache.commons.collections4.iterators.SingletonListIteratorTest.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4331,iterValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3388,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4333,iter,4332,iter.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4335,iter,4334,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4337,iter,4336,iter.previousIndex());
        iterValue = iter.previous();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4338,org.apache.commons.collections4.iterators.SingletonListIteratorTest.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4339,iterValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4341,iter,4340,iter.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4342,!(iter.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4344,iter,4343,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4345,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4347,iter,4346,iter.previousIndex());
        iterValue = iter.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4348,org.apache.commons.collections4.iterators.SingletonListIteratorTest.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4349,iterValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4350,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4352,iter,4351,iter.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4354,iter,4353,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4356,iter,4355,iter.previousIndex());
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4358,e.getClass(),4357,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        iter.previous();
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4360,e.getClass(),4359,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset");
        final ResettableListIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4362,it,4361,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4364,it,4363,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4365,org.apache.commons.collections4.iterators.SingletonListIteratorTest.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4367,it,4366,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4215,it,4214,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4369,it,4368,it.hasPrevious());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4371,it,4370,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4373,it,4372,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4374,org.apache.commons.collections4.iterators.SingletonListIteratorTest.testValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4376,it,4375,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4378,it,4377,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4380,it,4379,it.hasPrevious());
        it.reset();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4095,it,4094,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

