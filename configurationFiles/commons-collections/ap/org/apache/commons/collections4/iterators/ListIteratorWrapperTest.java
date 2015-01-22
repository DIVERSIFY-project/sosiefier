package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections4.ResettableListIterator;

/** 
 * Tests the ListIteratorWrapper to insure that it simulates
 * a ListIterator correctly.
 * 
 * @version $Id$
 */
public class ListIteratorWrapperTest<E> extends AbstractIteratorTest<E> {
    protected String[] testArray = new String[]{ "One" , "Two" , "Three" , "Four" , "Five" , "Six" };

    protected List<E> list1 = null;

    public ListIteratorWrapperTest(final String testName) {
        super(testName);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public void setUp() {
        list1 = new ArrayList<E>();
        list1.add(((E)("One")));
        list1.add(((E)("Two")));
        list1.add(((E)("Three")));
        list1.add(((E)("Four")));
        list1.add(((E)("Five")));
        list1.add(((E)("Six")));
    }

    @Override
    public ResettableListIterator<E> makeEmptyIterator() {
        final ArrayList<E> list = new ArrayList<E>();
        return new ListIteratorWrapper<E>(list.iterator());
    }

    @Override
    public ResettableListIterator<E> makeObject() {
        return new ListIteratorWrapper<E>(list1.iterator());
    }

    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        final ListIterator<E> iter = makeObject();
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3544,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3545,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3546,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3548,e.getClass(),3547,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        for (int i = (testArray.length) - 1 ; i > (-1) ; --i) {
            final Object testValue = testArray[i];
            final E iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3549,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3550,iterValue);
        }
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3552,e.getClass(),3551,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3553,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3554,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterator_literalMutation1035() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_literalMutation1035");
        final ListIterator<E> iter = makeObject();
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3544,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3545,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3546,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3548,e.getClass(),3547,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        for (int i = (testArray.length) - 2 ; i > (-1) ; --i) {
            final Object testValue = testArray[i];
            final E iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3549,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3550,iterValue);
        }
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3552,e.getClass(),3551,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3553,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3554,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterator_literalMutation1036() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_literalMutation1036");
        final ListIterator<E> iter = makeObject();
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3544,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3545,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3546,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3548,e.getClass(),3547,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        for (int i = (testArray.length) - 1 ; i > 0 ; --i) {
            final Object testValue = testArray[i];
            final E iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3549,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3550,iterValue);
        }
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3552,e.getClass(),3551,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3553,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3554,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public void testRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove");
        final ListIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3555,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3557,iter,3556,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3559,iter,3558,iter.nextIndex());
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3560,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3562,iter,3561,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3564,iter,3563,iter.nextIndex());
        int sz = list1.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3566,list1,3565,list1.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3568,iter,3567,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3570,iter,3569,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3572,iter,3571,iter.nextIndex());
        iter.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3573,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3575,list1,3574,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3576,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3578,iter,3577,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3580,iter,3579,iter.nextIndex());
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3581,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3583,iter,3582,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3585,iter,3584,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3587,list1,3586,list1.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3589,iter,3588,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3591,iter,3590,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3593,iter,3592,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3595,list1,3594,list1.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2820,iter,2819,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3597,iter,3596,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3599,iter,3598,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3601,list1,3600,list1.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3603,iter,3602,iter.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3605,iter,3604,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3607,iter,3606,iter.nextIndex());
        iter.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3608,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3610,list1,3609,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3612,iter,3611,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3614,iter,3613,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3616,list1,3615,list1.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3618,iter,3617,iter.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3619,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3621,iter,3620,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3623,iter,3622,iter.nextIndex());
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3624,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3626,iter,3625,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3628,iter,3627,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3630,list1,3629,list1.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3632,iter,3631,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3634,iter,3633,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3636,iter,3635,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3638,list1,3637,list1.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3640,iter,3639,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3642,iter,3641,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3644,iter,3643,iter.nextIndex());
        iter.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3645,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3647,list1,3646,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3649,iter,3648,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3651,iter,3650,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3653,list1,3652,list1.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3655,iter,3654,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3657,iter,3656,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3659,iter,3658,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset");
        final ResettableListIterator<E> iter = makeObject();
        final E first = iter.next();
        final E second = iter.next();
        iter.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3661,iter,3660,iter.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3662,first);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3664,iter,3663,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3665,second);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3667,iter,3666,iter.next());
        for (int i = 2 ; i < (testArray.length) ; i++) {
            final Object testValue = testArray[i];
            final E iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3668,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3669,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReset_literalMutation1037() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_literalMutation1037");
        final ResettableListIterator<E> iter = makeObject();
        final E first = iter.next();
        final E second = iter.next();
        iter.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3661,iter,3660,iter.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3662,first);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3664,iter,3663,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3665,second);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3667,iter,3666,iter.next());
        for (int i = 1 ; i < (testArray.length) ; i++) {
            final Object testValue = testArray[i];
            final E iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3668,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3669,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

