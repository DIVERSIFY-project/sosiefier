package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections4.ResettableListIterator;

/** 
 * Tests the ListIteratorWrapper to insure that it behaves as expected when wrapping a ListIterator.
 * 
 * @version $Id$
 */
public class ListIteratorWrapper2Test<E> extends AbstractIteratorTest<E> {
    protected String[] testArray = new String[]{ "One" , "Two" , "Three" , "Four" , "Five" , "Six" };

    protected List<E> list1 = null;

    public ListIteratorWrapper2Test(final String testName) {
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
        return new ListIteratorWrapper<E>(list.listIterator());
    }

    @Override
    public ResettableListIterator<E> makeObject() {
        return new ListIteratorWrapper<E>(list1.listIterator());
    }

    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        final ListIterator<E> iter = makeObject();
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3446,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3447,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3448,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3450,e.getClass(),3449,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        for (int i = (testArray.length) - 1 ; i > (-1) ; --i) {
            final Object testValue = testArray[i];
            final E iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3451,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3452,iterValue);
        }
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3454,e.getClass(),3453,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3455,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3456,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterator_literalMutation1032() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_literalMutation1032");
        final ListIterator<E> iter = makeObject();
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3446,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3447,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3448,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3450,e.getClass(),3449,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        for (int i = (testArray.length) - 0 ; i > (-1) ; --i) {
            final Object testValue = testArray[i];
            final E iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3451,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3452,iterValue);
        }
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3454,e.getClass(),3453,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3455,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3456,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterator_literalMutation1033() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_literalMutation1033");
        final ListIterator<E> iter = makeObject();
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3446,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3447,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3448,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3450,e.getClass(),3449,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        for (int i = (testArray.length) - 1 ; i > 0 ; --i) {
            final Object testValue = testArray[i];
            final E iterValue = iter.previous();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3451,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3452,iterValue);
        }
        try {
            iter.previous();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3454,e.getClass(),3453,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3455,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3456,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public void testRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove");
        final ListIterator<E> iter = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3457,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3459,iter,3458,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3461,iter,3460,iter.nextIndex());
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3462,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3464,iter,3463,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3466,iter,3465,iter.nextIndex());
        int sz = list1.size();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3468,list1,3467,list1.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3470,iter,3469,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3472,iter,3471,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3474,iter,3473,iter.nextIndex());
        iter.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3475,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3477,list1,3476,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3478,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3480,iter,3479,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3482,iter,3481,iter.nextIndex());
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3483,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3485,iter,3484,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3487,iter,3486,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3489,list1,3488,list1.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3491,iter,3490,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3493,iter,3492,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3495,iter,3494,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3497,list1,3496,list1.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3499,iter,3498,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3501,iter,3500,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3503,iter,3502,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3505,list1,3504,list1.get(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3507,iter,3506,iter.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3509,iter,3508,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3511,iter,3510,iter.nextIndex());
        iter.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3512,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3514,list1,3513,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3516,iter,3515,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3518,iter,3517,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3520,list1,3519,list1.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3522,iter,3521,iter.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3523,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3525,iter,3524,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3527,iter,3526,iter.nextIndex());
        iter.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3528,--sz);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3530,list1,3529,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3531,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3533,iter,3532,iter.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3535,iter,3534,iter.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset");
        final ResettableListIterator<E> iter = makeObject();
        final E first = iter.next();
        final E second = iter.next();
        iter.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3537,iter,3536,iter.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3538,first);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3540,iter,3539,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3541,second);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2940,iter,2939,iter.next());
        for (int i = 2 ; i < (testArray.length) ; i++) {
            final Object testValue = testArray[i];
            final E iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3542,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3543,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReset_literalMutation1034() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset_literalMutation1034");
        final ResettableListIterator<E> iter = makeObject();
        final E first = iter.next();
        final E second = iter.next();
        iter.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3537,iter,3536,iter.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3538,first);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3540,iter,3539,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3541,second);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2940,iter,2939,iter.next());
        for (int i = 3 ; i < (testArray.length) ; i++) {
            final Object testValue = testArray[i];
            final E iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3542,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3543,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

