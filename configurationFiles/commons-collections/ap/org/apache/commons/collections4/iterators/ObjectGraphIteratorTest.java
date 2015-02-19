package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Test;
import org.apache.commons.collections4.Transformer;

/** 
 * Testcase.
 * 
 * @version $Id$
 */
public class ObjectGraphIteratorTest extends AbstractIteratorTest<java.lang.Object> {
    protected String[] testArray = new String[]{ "One" , "Two" , "Three" , "Four" , "Five" , "Six" };

    protected List<java.lang.String> list1 = null;

    protected List<java.lang.String> list2 = null;

    protected List<java.lang.String> list3 = null;

    protected List<java.util.Iterator<java.lang.String>> iteratorList = null;

    public ObjectGraphIteratorTest(final String testName) {
        super(testName);
    }

    @Override
    public void setUp() {
        list1 = new ArrayList<java.lang.String>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list2 = new ArrayList<java.lang.String>();
        list2.add("Four");
        list3 = new ArrayList<java.lang.String>();
        list3.add("Five");
        list3.add("Six");
        iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
    }

    @Override
    public ObjectGraphIterator<java.lang.Object> makeEmptyIterator() {
        final ArrayList<java.lang.Object> list = new ArrayList<java.lang.Object>();
        return new ObjectGraphIterator<java.lang.Object>(list.iterator());
    }

    @Override
    public ObjectGraphIterator<java.lang.Object> makeObject() {
        return new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructor_null1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructor_null1");
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4120,it,4119,it.hasNext());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructor_null1_add1171() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructor_null1_add1171");
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4120,it,4119,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.remove();
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructor_null_next() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructor_null_next");
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(null);
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructor_null_remove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructor_null_remove");
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(null);
        try {
            it.remove();
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_Empty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_Empty");
        final List<java.util.Iterator<java.lang.Object>> iteratorList = new ArrayList<java.util.Iterator<java.lang.Object>>();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4090,it,4089,it.hasNext());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_Empty_add1149() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_Empty_add1149");
        final List<java.util.Iterator<java.lang.Object>> iteratorList = new ArrayList<java.util.Iterator<java.lang.Object>>();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4090,it,4089,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.remove();
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_Simple_add1150() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_Simple_add1150");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4095,it,4094,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4096,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4098,it,4097,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4100,it,4099,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_Simple_add1151() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_Simple_add1151");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4095,it,4094,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4096,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4098,it,4097,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4100,it,4099,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_Simple_add1152() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_Simple_add1152");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4095,it,4094,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4096,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4098,it,4097,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4100,it,4099,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_Simple_add1153() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_Simple_add1153");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4095,it,4094,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4096,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4098,it,4097,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4100,it,4099,it.hasNext());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteratorConstructorIteration_Simple() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_Simple");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = -1 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4095,it,4094,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4096,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4098,it,4097,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4100,it,4099,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteratorConstructorIteration_Simple_literalMutation1128() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_Simple_literalMutation1128");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 7 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4095,it,4094,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4096,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4098,it,4097,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4100,it,4099,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_Simple_remove854() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_Simple_remove854");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4095,it,4094,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4096,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4098,it,4097,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4100,it,4099,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_Simple_remove855() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_Simple_remove855");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4095,it,4094,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4096,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4098,it,4097,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4100,it,4099,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_Simple_remove856() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_Simple_remove856");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4095,it,4094,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4096,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4098,it,4097,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4100,it,4099,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_SimpleNoHasNext_add1154() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_SimpleNoHasNext_add1154");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4091,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4093,it,4092,it.next());
        }
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_SimpleNoHasNext_add1155() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_SimpleNoHasNext_add1155");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4091,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4093,it,4092,it.next());
        }
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_SimpleNoHasNext_add1156() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_SimpleNoHasNext_add1156");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4091,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4093,it,4092,it.next());
        }
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_SimpleNoHasNext_add1157() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_SimpleNoHasNext_add1157");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4091,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4093,it,4092,it.next());
        }
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteratorConstructorIteration_SimpleNoHasNext() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_SimpleNoHasNext");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 1 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4091,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4093,it,4092,it.next());
        }
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteratorConstructorIteration_SimpleNoHasNext_literalMutation1130() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_SimpleNoHasNext_literalMutation1130");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 5 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4091,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4093,it,4092,it.next());
        }
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_SimpleNoHasNext_remove857() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_SimpleNoHasNext_remove857");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4091,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4093,it,4092,it.next());
        }
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_SimpleNoHasNext_remove858() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_SimpleNoHasNext_remove858");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4091,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4093,it,4092,it.next());
        }
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_SimpleNoHasNext_remove859() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_SimpleNoHasNext_remove859");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4091,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4093,it,4092,it.next());
        }
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_add1158() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_add1158");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_add1159() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_add1159");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_add1160() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_add1160");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_add1161() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_add1161");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_add1162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_add1162");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_add1163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_add1163");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_add1164() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_add1164");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_add1165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_add1165");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteratorConstructorIteration_WithEmptyIterators() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = -1 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteratorConstructorIteration_WithEmptyIterators_literalMutation1132() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_literalMutation1132");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 5 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_remove860() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_remove860");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_remove861() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_remove861");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_remove862() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_remove862");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_remove863() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_remove863");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_remove864() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_remove864");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_remove865() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_remove865");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorIteration_WithEmptyIterators_remove866() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorIteration_WithEmptyIterators_remove866");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4102,it,4101,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4103,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4105,it,4104,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4107,it,4106,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorRemove_add1166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorRemove_add1166");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4108,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4110,it,4109,it.next());
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4112,it,4111,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4114,list1,4113,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4116,list2,4115,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4118,list3,4117,list3.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorRemove_add1167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorRemove_add1167");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4108,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4110,it,4109,it.next());
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4112,it,4111,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4114,list1,4113,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4116,list2,4115,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4118,list3,4117,list3.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorRemove_add1168() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorRemove_add1168");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4108,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4110,it,4109,it.next());
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4112,it,4111,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4114,list1,4113,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4116,list2,4115,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4118,list3,4117,list3.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorRemove_add1169() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorRemove_add1169");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4108,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4110,it,4109,it.next());
            it.remove();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4112,it,4111,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4114,list1,4113,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4116,list2,4115,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4118,list3,4117,list3.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteratorConstructorRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorRemove");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = -1 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4108,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4110,it,4109,it.next());
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4112,it,4111,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4114,list1,4113,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4116,list2,4115,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4118,list3,4117,list3.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteratorConstructorRemove_literalMutation1134() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorRemove_literalMutation1134");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 5 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4108,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4110,it,4109,it.next());
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4112,it,4111,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4114,list1,4113,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4116,list2,4115,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4118,list3,4117,list3.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorRemove_remove867() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorRemove_remove867");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4108,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4110,it,4109,it.next());
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4112,it,4111,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4114,list1,4113,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4116,list2,4115,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4118,list3,4117,list3.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorRemove_remove868() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorRemove_remove868");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4108,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4110,it,4109,it.next());
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4112,it,4111,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4114,list1,4113,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4116,list2,4115,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4118,list3,4117,list3.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorRemove_remove869() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorRemove_remove869");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4108,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4110,it,4109,it.next());
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4112,it,4111,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4114,list1,4113,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4116,list2,4115,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4118,list3,4117,list3.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteratorConstructorRemove_remove870() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteratorConstructorRemove_remove870");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator());
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4108,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4110,it,4109,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4112,it,4111,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4114,list1,4113,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4116,list2,4115,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4118,list3,4117,list3.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIterators_add1124() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIterators_add1124");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4013,it,4012,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4014,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4016,it,4015,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4018,it,4017,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIterators_add1125() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIterators_add1125");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4013,it,4012,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4014,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4016,it,4015,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4018,it,4017,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIterators_add1126() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIterators_add1126");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4013,it,4012,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4014,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4016,it,4015,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4018,it,4017,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_IteratorOfIterators() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIterators");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = -1 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4013,it,4012,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4014,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4016,it,4015,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4018,it,4017,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_IteratorOfIterators_literalMutation1110() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIterators_literalMutation1110");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 5 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4013,it,4012,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4014,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4016,it,4015,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4018,it,4017,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIterators_remove836() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIterators_remove836");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4013,it,4012,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4014,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4016,it,4015,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4018,it,4017,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIterators_remove837() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIterators_remove837");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4013,it,4012,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4014,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4016,it,4015,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4018,it,4017,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIterators_remove838() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIterators_remove838");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list2.iterator());
        iteratorList.add(list3.iterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4013,it,4012,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4014,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4016,it,4015,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4018,it,4017,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_add1127() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_add1127");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_add1128() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_add1128");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_add1129() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_add1129");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_add1130() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_add1130");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_add1131() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_add1131");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_add1132() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_add1132");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_add1133() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_add1133");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_IteratorOfIteratorsWithEmptyIterators() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = -1 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_IteratorOfIteratorsWithEmptyIterators_literalMutation1113() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_literalMutation1113");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 7 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_remove839() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_remove839");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_remove840() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_remove840");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_remove841() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_remove841");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_remove842() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_remove842");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_remove843() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_remove843");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_remove844() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_remove844");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_IteratorOfIteratorsWithEmptyIterators_remove845() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_IteratorOfIteratorsWithEmptyIterators_remove845");
        final List<java.util.Iterator<java.lang.String>> iteratorList = new ArrayList<java.util.Iterator<java.lang.String>>();
        iteratorList.add(list1.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list2.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        iteratorList.add(list3.iterator());
        iteratorList.add(org.apache.commons.collections4.IteratorUtils.<String>emptyIterator());
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(iteratorList.iterator() , null);
        for (int i = 0 ; i < 6 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4006,it,4005,it.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4007,testArray[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4009,it,4008,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4011,it,4010,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_RootNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_RootNull");
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(null , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4027,it,4026,it.hasNext());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_RootNull_add1136() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_RootNull_add1136");
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(null , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4027,it,4026,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            it.remove();
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_RootNoTransformer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_RootNoTransformer");
        final Forest forest = new Forest();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4020,it,4019,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4021,forest);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4023,it,4022,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4025,it,4024,it.hasNext());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed1");
        final Forest forest = new Forest();
        final Leaf l1 = forest.addTree().addBranch().addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4029,it,4028,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4030,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4032,it,4031,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4034,it,4033,it.hasNext());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed2_add1138() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_add1138");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed2_add1139() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_add1139");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed2_add1140() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_add1140");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed2_add1141() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_add1141");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed2_add1142() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_add1142");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_Transformed2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_Transformed2_literalMutation1118() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_literalMutation1118");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(-1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_Transformed2_literalMutation1119() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_literalMutation1119");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(3).addBranch();
        forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_Transformed2_literalMutation1120() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_literalMutation1120");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        forest.getTree(3).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_Transformed2_literalMutation1121() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_literalMutation1121");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(1).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed2_remove846() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_remove846");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed2_remove847() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_remove847");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed2_remove848() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_remove848");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed2_remove849() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed2_remove849");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(0).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b5 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b5.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4036,it,4035,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4037,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4039,it,4038,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4041,it,4040,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4042,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4044,it,4043,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4046,it,4045,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4047,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4049,it,4048,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4051,it,4050,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4052,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4054,it,4053,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4056,it,4055,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4057,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4059,it,4058,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4061,it,4060,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed3_add1143() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_add1143");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed3_add1144() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_add1144");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed3_add1145() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_add1145");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed3_add1146() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_add1146");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed3_add1147() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_add1147");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_Transformed3() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(2).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_Transformed3_literalMutation1123() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_literalMutation1123");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(0).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_Transformed3_literalMutation1124() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_literalMutation1124");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(1).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_Transformed3_literalMutation1125() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_literalMutation1125");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(1).addBranch();
        forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIteration_Transformed3_literalMutation1126() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_literalMutation1126");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        forest.getTree(3).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed3_remove850() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_remove850");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed3_remove851() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_remove851");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed3_remove852() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_remove852");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIteration_Transformed3_remove853() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIteration_Transformed3_remove853");
        final Forest forest = new Forest();
        forest.addTree();
        forest.addTree();
        forest.addTree();
        final Branch b1 = forest.getTree(1).addBranch();
        final Branch b2 = forest.getTree(1).addBranch();
        final Branch b3 = forest.getTree(2).addBranch();
        final Branch b4 = forest.getTree(2).addBranch();
        final Leaf l1 = b1.addLeaf();
        final Leaf l2 = b1.addLeaf();
        final Leaf l3 = b2.addLeaf();
        final Leaf l4 = b3.addLeaf();
        final Leaf l5 = b4.addLeaf();
        final Iterator<java.lang.Object> it = new ObjectGraphIterator<java.lang.Object>(forest , new LeafFinder());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4063,it,4062,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4064,l1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4066,it,4065,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4068,it,4067,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4069,l2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4071,it,4070,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4073,it,4072,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4074,l3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4076,it,4075,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4078,it,4077,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4079,l4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4081,it,4080,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4083,it,4082,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4084,l5);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4086,it,4085,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4088,it,4087,it.hasNext());
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    static class LeafFinder implements Transformer<java.lang.Object, java.lang.Object> {
        public Object transform(final Object input) {
            if (input instanceof Forest) {
                return ((Forest)(input)).treeIterator();
            } 
            if (input instanceof Tree) {
                return ((Tree)(input)).branchIterator();
            } 
            if (input instanceof Branch) {
                return ((Branch)(input)).leafIterator();
            } 
            if (input instanceof Leaf) {
                return input;
            } 
            throw new ClassCastException();
        }
    }

    static class Forest {
        List<Tree> trees = new ArrayList<Tree>();

        Tree addTree() {
            trees.add(new Tree());
            return getTree(((trees.size()) - 1));
        }

        Tree getTree(final int index) {
            return trees.get(index);
        }

        Iterator<Tree> treeIterator() {
            return trees.iterator();
        }
    }

    static class Tree {
        List<Branch> branches = new ArrayList<Branch>();

        Branch addBranch() {
            branches.add(new Branch());
            return getBranch(((branches.size()) - 1));
        }

        Branch getBranch(final int index) {
            return branches.get(index);
        }

        Iterator<Branch> branchIterator() {
            return branches.iterator();
        }
    }

    static class Branch {
        List<Leaf> leaves = new ArrayList<Leaf>();

        Leaf addLeaf() {
            leaves.add(new Leaf());
            return getLeaf(((leaves.size()) - 1));
        }

        Leaf getLeaf(final int index) {
            return leaves.get(index);
        }

        Iterator<Leaf> leafIterator() {
            return leaves.iterator();
        }
    }

    static class Leaf {
        String colour;

        String getColour() {
            return colour;
        }

        void setColour(final String colour) {
            this.colour = colour;
        }
    }
}

