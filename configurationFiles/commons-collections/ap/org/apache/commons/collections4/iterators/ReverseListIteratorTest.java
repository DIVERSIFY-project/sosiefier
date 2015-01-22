package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.ResettableListIterator;

/** 
 * Tests the ReverseListIterator.
 * 
 * @version $Id$
 */
public class ReverseListIteratorTest<E> extends AbstractListIteratorTest<E> {
    protected String[] testArray = new String[]{ "One" , "Two" , "Three" , "Four" };

    public ReverseListIteratorTest(final String testName) {
        super(testName);
    }

    @Override
    public ListIterator<E> makeEmptyIterator() {
        return new ReverseListIterator<E>(new ArrayList<E>());
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public ReverseListIterator<E> makeObject() {
        final List<E> list = new ArrayList<E>(java.util.Arrays.asList(((E[])(testArray))));
        return new ReverseListIterator<E>(list);
    }

    @Override
    public void testEmptyListIteratorIsIndeedEmpty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListIteratorIsIndeedEmpty");
        final ListIterator<E> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4200,it,4199,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4201,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4203,it,4202,it.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4205,it,4204,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4207,it,4206,it.previousIndex());
        try {
            it.next();
        } catch (final NoSuchElementException e) {
        }
        try {
            it.previous();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public void testWalkForwardAndBack() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWalkForwardAndBack");
        final ArrayList<E> list = new ArrayList<E>();
        final ListIterator<E> it = makeObject();
        while (it.hasNext()) {
            list.add(it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4268,it,4267,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4270,it,4269,it.hasPrevious());
        for (int i = (list.size()) - 1 ; i >= 0 ; i--) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4271,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4272,(((list.size()) - i) - 2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4274,it,4273,it.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4275,(((list.size()) - i) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4277,it,4276,it.previousIndex());
            final Object obj = list.get(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4278,obj);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4280,it,4279,it.previous());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4282,it,4281,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4284,it,4283,it.hasPrevious());
        try {
            it.previous();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWalkForwardAndBack_literalMutation1150() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWalkForwardAndBack_literalMutation1150");
        final ArrayList<E> list = new ArrayList<E>();
        final ListIterator<E> it = makeObject();
        while (it.hasNext()) {
            list.add(it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4268,it,4267,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4270,it,4269,it.hasPrevious());
        for (int i = (list.size()) - 0 ; i >= 0 ; i--) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4271,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4272,(((list.size()) - i) - 2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4274,it,4273,it.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4275,(((list.size()) - i) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4277,it,4276,it.previousIndex());
            final Object obj = list.get(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4278,obj);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4280,it,4279,it.previous());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4282,it,4281,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4284,it,4283,it.hasPrevious());
        try {
            it.previous();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testWalkForwardAndBack_literalMutation1151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testWalkForwardAndBack_literalMutation1151");
        final ArrayList<E> list = new ArrayList<E>();
        final ListIterator<E> it = makeObject();
        while (it.hasNext()) {
            list.add(it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4268,it,4267,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4270,it,4269,it.hasPrevious());
        for (int i = (list.size()) - 1 ; i >= 1 ; i--) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4271,("" + i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4272,(((list.size()) - i) - 2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4274,it,4273,it.nextIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4275,(((list.size()) - i) - 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4277,it,4276,it.previousIndex());
            final Object obj = list.get(i);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4278,obj);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4280,it,4279,it.previous());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4282,it,4281,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4284,it,4283,it.hasPrevious());
        try {
            it.previous();
        } catch (final NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReverse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReverse");
        final ListIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4215,it,4214,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4217,it,4216,it.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4219,it,4218,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4221,it,4220,it.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4223,it,4222,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4225,it,4224,it.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4124,it,4123,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4227,it,4226,it.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4229,it,4228,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4231,it,4230,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4233,it,4232,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4235,it,4234,it.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4237,it,4236,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4239,it,4238,it.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4241,it,4240,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4243,it,4242,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4245,it,4244,it.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4247,it,4246,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4249,it,4248,it.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4251,it,4250,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4253,it,4252,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4254,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4256,it,4255,it.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4258,it,4257,it.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4260,it,4259,it.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4262,it,4261,it.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4264,it,4263,it.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4266,it,4265,it.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2630,it,2629,it.previous());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReset");
        final ResettableListIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4209,it,4208,it.next());
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4211,it,4210,it.next());
        it.next();
        it.next();
        it.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4213,it,4212,it.next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

