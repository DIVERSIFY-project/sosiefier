package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Test;

/** 
 * Tests the PeekingIterator.
 * 
 * @version $Id$
 */
public class PeekingIteratorTest<E> extends AbstractIteratorTest<E> {
    private String[] testArray = new String[]{ "a" , "b" , "c" };

    private List<E> testList;

    public PeekingIteratorTest(final String testName) {
        super(testName);
    }

    /** 
     * {@inheritDoc}
     */
@SuppressWarnings(value = "unchecked")
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        testList = new ArrayList<E>(java.util.Arrays.asList(((E[])(testArray))));
    }

    @Override
    public Iterator<E> makeEmptyIterator() {
        return PeekingIterator.peekingIterator(java.util.Collections.<E>emptyList().iterator());
    }

    @Override
    public PeekingIterator<E> makeObject() {
        return PeekingIterator.peekingIterator(testList.iterator());
    }

    @Override
    public boolean supportsRemove() {
        return true;
    }

    @Test
    public void testEmpty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmpty");
        Iterator<E> it = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4122,it,4121,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testSinglePeek_add1181() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSinglePeek_add1181");
        PeekingIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4156,it,4155,it.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4158,it,4157,it.element());
        validate(it, ((E[])(testArray)));
        validate(it, ((E[])(testArray)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    @SuppressWarnings(value = "unchecked")
    public void testSinglePeek() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSinglePeek");
        PeekingIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4156,it,4155,it.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4158,it,4157,it.element());
        validate(it, ((E[])(testArray)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    @SuppressWarnings(value = "unchecked")
    public void testSinglePeek_remove872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSinglePeek_remove872");
        PeekingIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4156,it,4155,it.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4158,it,4157,it.element());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void testMultiplePeek() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultiplePeek");
        PeekingIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4132,it,4131,it.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4134,it,4133,it.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4136,it,4135,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4138,it,4137,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4140,it,4139,it.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4142,it,4141,it.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4144,it,4143,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4146,it,4145,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4148,it,4147,it.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4150,it,4149,it.peek());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4152,it,4151,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4154,it,4153,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorExhausted() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorExhausted");
        PeekingIterator<E> it = makeObject();
        it.next();
        it.next();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4128,it,4127,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4130,it,4129,it.peek());
        try {
            it.element();
        } catch (NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorExhausted_add1178() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorExhausted_add1178");
        PeekingIterator<E> it = makeObject();
        it.next();
        it.next();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4128,it,4127,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4130,it,4129,it.peek());
        try {
            it.element();
        } catch (NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorExhausted_add1179() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorExhausted_add1179");
        PeekingIterator<E> it = makeObject();
        it.next();
        it.next();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4128,it,4127,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4130,it,4129,it.peek());
        try {
            it.element();
        } catch (NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorExhausted_add1180() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorExhausted_add1180");
        PeekingIterator<E> it = makeObject();
        it.next();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4128,it,4127,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4130,it,4129,it.peek());
        try {
            it.element();
            it.element();
        } catch (NoSuchElementException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIllegalRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalRemove");
        PeekingIterator<E> it = makeObject();
        it.next();
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4124,it,4123,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4126,it,4125,it.peek());
        try {
            it.remove();
        } catch (IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIllegalRemove_add1175() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalRemove_add1175");
        PeekingIterator<E> it = makeObject();
        it.next();
        it.remove();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4124,it,4123,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4126,it,4125,it.peek());
        try {
            it.remove();
        } catch (IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIllegalRemove_add1176() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalRemove_add1176");
        PeekingIterator<E> it = makeObject();
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4124,it,4123,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4126,it,4125,it.peek());
        try {
            it.remove();
            it.remove();
        } catch (IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIllegalRemove_remove871() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalRemove_remove871");
        PeekingIterator<E> it = makeObject();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4124,it,4123,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4126,it,4125,it.peek());
        try {
            it.remove();
        } catch (IllegalStateException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void validate(Iterator<E> iter, E... items) {
        for (E x : items) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4160,iter,4159,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4161,x);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4163,iter,4162,iter.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4165,iter,4164,iter.hasNext());
    }
}

