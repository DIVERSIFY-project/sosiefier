package org.apache.commons.collections4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import junit.framework.Test;

/** 
 * Tests for IteratorUtils.
 * 
 * @version $Id$
 */
public class IteratorUtilsTest extends BulkTest {
    public IteratorUtilsTest(final String name) {
        super(name);
    }

    public static Test suite() {
        return BulkTest.makeSuite(IteratorUtilsTest.class);
    }

    public void testAsIterable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterable");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(-1));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7502,actual,7501,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7503,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7505,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7504,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsIterable_literalMutation2467() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterable_literalMutation2467");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(2));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7502,actual,7501,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7503,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7505,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7504,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsIterable_literalMutation2468() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterable_literalMutation2468");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(3));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7502,actual,7501,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7503,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7505,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7504,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsIterable_literalMutation2469() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterable_literalMutation2469");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asIterable(iterator);
        int expected = 1;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7502,actual,7501,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7503,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7505,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7504,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsIterableNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterableNull");
        try {
            IteratorUtils.asIterable(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsMultipleIterable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(-1));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7506,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7508,actual,7507,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7509,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7510,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7512,actual,7511,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7513,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsMultipleIterable_literalMutation2472() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable_literalMutation2472");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7506,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7508,actual,7507,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7509,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7510,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7512,actual,7511,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7513,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsMultipleIterable_literalMutation2473() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable_literalMutation2473");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(1));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7506,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7508,actual,7507,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7509,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7510,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7512,actual,7511,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7513,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsMultipleIterable_literalMutation2474() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable_literalMutation2474");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = -1;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7506,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7508,actual,7507,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7509,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7510,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7512,actual,7511,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7513,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsMultipleIterable_literalMutation2475() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable_literalMutation2475");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7506,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7508,actual,7507,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7509,(expected > 0));
        expected = 1;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7510,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7512,actual,7511,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7513,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsMultipleIterableNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterableNull");
        try {
            IteratorUtils.asMultipleUseIterable(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToList");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(2));
        list.add("Two");
        list.add(null);
        final List<java.lang.Object> result = IteratorUtils.toList(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7609,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7610,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToList_literalMutation2493() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToList_literalMutation2493");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(1));
        list.add("foo");
        list.add(null);
        final List<java.lang.Object> result = IteratorUtils.toList(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7609,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7610,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(2));
        list.add("Two");
        list.add(null);
        final Object[] result = IteratorUtils.toArray(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7606,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7608,null,7607,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToArray_literalMutation2487() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray_literalMutation2487");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(1));
        list.add("foo");
        list.add(null);
        final Object[] result = IteratorUtils.toArray(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7606,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7608,null,7607,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToArray2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray2");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("foo");
        list.add("Two");
        list.add(null);
        final String[] result = IteratorUtils.toArray(list.iterator(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7603,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7605,null,7604,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToArray2_literalMutation2490() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray2_literalMutation2490");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("One");
        list.add("foo");
        list.add(null);
        final String[] result = IteratorUtils.toArray(list.iterator(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7603,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7605,null,7604,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator");
        final Object[] objArray = new Object[]{ "foo" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2402() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2402");
        final Object[] objArray = new Object[]{ "a" , "foo" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2403() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2403");
        final Object[] objArray = new Object[]{ "a" , "b" , "foo" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2404() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2404");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(1));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2406() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2406");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2407() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2407");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2408() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2408");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2409() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2409");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 3);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2410() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2410");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2411() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2411");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2412() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2412");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 1, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2413() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2413");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2414() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2414");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 0, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2415() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2415");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2416() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2416");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 1, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2417() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2417");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 0);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2418() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2418");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 1 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2419() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2419");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 2 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2420() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2420");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 1 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2421() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2421");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2422() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2422");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2423() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2423");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2424() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2424");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 3);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2425() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2425");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 1, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2426() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2426");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2427() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2427");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 1, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2428() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2428");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2429() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2429");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 0, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2430() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2430");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2431() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2431");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 3, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2432() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2432");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.next(),7409,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,iterator.next(),7413,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7415,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7417,iterator.next(),7416,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7419,iterator.next(),7418,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,iterator.next(),7420,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,iterator.next(),7422,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,iterator.next(),7424,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7426,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,iterator.next(),7427,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 2);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator");
        final Object[] objArray = new Object[]{ "foo" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2434() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2434");
        final Object[] objArray = new Object[]{ "a" , "foo" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2435() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2435");
        final Object[] objArray = new Object[]{ "a" , "b" , "foo" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2436() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2436");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "foo" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2437() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2437");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(1));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2439() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2439");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2440() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2440");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2441() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2441");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2442() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2442");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2443() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2443");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2444() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2444");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2445() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2445");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 1, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2446() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2446");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 6);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2447() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2447");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 0, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2448() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2448");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2449() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2449");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 1, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2450() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2450");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 2);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2451() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2451");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 1 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2452() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2452");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 2 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2453() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2453");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 1 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2454() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2454");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2455() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2455");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2456() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2456");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2457() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2457");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2458() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2458");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2459() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2459");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2460() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2460");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 1, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2461() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2461");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2462() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2462");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 0, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2463() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2463");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 2);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2464() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2464");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 3, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayListIterator_literalMutation2465() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_literalMutation2465");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7429,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7431,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,iterator.next(),7432,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,iterator.previous(),7434,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,iterator.next(),7442,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.next(),7444,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7446,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7453,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7455,iterator,7454,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,iterator.next(),7456,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7459,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,iterator.next(),7461,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7463,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,iterator.next(),7465,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7470,iterator.previous(),7469,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7472,iterator.next(),7471,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,iterator.next(),7476,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7479,iterator.previous(),7478,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,iterator.next(),7480,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7482,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,iterator.next(),7484,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7486,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,iterator.previous(),7488,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,iterator.next(),7495,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7498,iterator,7497,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 2);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Gets an immutable Iterator operating on the elements ["a", "b", "c", "d"].
     */
private Iterator<java.lang.String> getImmutableIterator() {
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        return IteratorUtils.unmodifiableIterator(list.iterator());
    }

    /** 
     * Gets an immutable ListIterator operating on the elements ["a", "b", "c", "d"].
     */
private ListIterator<java.lang.String> getImmutableListIterator() {
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        return IteratorUtils.unmodifiableListIterator(list.listIterator());
    }

    /** 
     * Test empty iterator
     */
public void testEmptyIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIterator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7514,org.apache.commons.collections4.iterators.EmptyIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7515,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7516,org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7517,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7518,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7519,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7521,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7522,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7524,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR,7523,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR.hasNext());
        IteratorUtils.EMPTY_ITERATOR.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7525,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7525,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7526,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7528,null,7527,org.apache.commons.collections4.IteratorUtils.emptyIterator());
        try {
            IteratorUtils.EMPTY_ITERATOR.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_ITERATOR.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test empty list iterator
     */
public void testEmptyListIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListIterator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7529,org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7530,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7531,org.apache.commons.collections4.iterators.EmptyListIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7532,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7533,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7535,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7536,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7537,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7539,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7538,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7541,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7540,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7542,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7544,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7543,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.previousIndex());
        IteratorUtils.EMPTY_LIST_ITERATOR.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7545,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7545,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7546,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7548,null,7547,org.apache.commons.collections4.IteratorUtils.emptyListIterator());
        try {
            IteratorUtils.EMPTY_LIST_ITERATOR.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_LIST_ITERATOR.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_LIST_ITERATOR.remove();
        } catch (final IllegalStateException ex) {
        }
        try {
            IteratorUtils.emptyListIterator().set(null);
        } catch (final IllegalStateException ex) {
        }
        try {
            IteratorUtils.emptyListIterator().add(null);
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test empty map iterator
     */
@SuppressWarnings(value = "unchecked")
    public void testEmptyMapIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7550,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7551,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7552,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7553,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7554,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7555,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7556,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7558,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR,7557,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR.hasNext());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7560,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7562,null,7561,org.apache.commons.collections4.IteratorUtils.emptyMapIterator());
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.remove();
        } catch (final IllegalStateException ex) {
        }
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.getKey();
        } catch (final IllegalStateException ex) {
        }
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.getValue();
        } catch (final IllegalStateException ex) {
        }
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.setValue(null);
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test empty map iterator
     */
@SuppressWarnings(value = "unchecked")
    public void testEmptyMapIterator_literalMutation2479() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_literalMutation2479");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7550,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7551,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7552,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7553,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7554,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7555,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7556,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7558,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR,7557,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR.hasNext());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7560,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7562,null,7561,org.apache.commons.collections4.IteratorUtils.emptyMapIterator());
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.remove();
        } catch (final IllegalStateException ex) {
        }
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.getKey();
        } catch (final IllegalStateException ex) {
        }
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.getValue();
        } catch (final IllegalStateException ex) {
        }
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.setValue(null);
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test empty map iterator
     */
@SuppressWarnings(value = "unchecked")
    public void testEmptyOrderedIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedIterator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7563,org.apache.commons.collections4.iterators.EmptyOrderedIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7565,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7566,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7567,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7568,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7569,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7571,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7570,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7573,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7572,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7574,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7574,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7575,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7577,null,7576,org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator());
        try {
            IteratorUtils.EMPTY_ORDERED_ITERATOR.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_ORDERED_ITERATOR.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_ORDERED_ITERATOR.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test empty map iterator
     */
@SuppressWarnings(value = "unchecked")
    public void testEmptyOrderedMapIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedMapIterator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7578,org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7579,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7580,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7581,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7582,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7583,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7584,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7586,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7585,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7588,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7587,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7589,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7589,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7590,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7592,null,7591,org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator());
        try {
            IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.remove();
        } catch (final IllegalStateException ex) {
        }
        try {
            IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.getKey();
        } catch (final IllegalStateException ex) {
        }
        try {
            IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.getValue();
        } catch (final IllegalStateException ex) {
        }
        try {
            IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.setValue(null);
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test next() and hasNext() for an immutable Iterator.
     */
public void testUnmodifiableIteratorIteration() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableIteratorIteration");
        final Iterator<java.lang.String> iterator = getImmutableIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7612,iterator,7611,iterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7614,iterator,7613,iterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7616,iterator,7615,iterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7618,iterator,7617,iterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7620,iterator,7619,iterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7622,iterator,7621,iterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7624,iterator,7623,iterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7626,iterator,7625,iterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7627,!(iterator.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test next(), hasNext(), previous() and hasPrevious() for an immutable
     * ListIterator.
     */
public void testUnmodifiableListIteratorIteration() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorIteration");
        final ListIterator<java.lang.String> listIterator = getImmutableListIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7628,!(listIterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7630,listIterator,7629,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7632,listIterator,7631,listIterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7634,listIterator,7633,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7636,listIterator,7635,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7638,listIterator,7637,listIterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7640,listIterator,7639,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7642,listIterator,7641,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7644,listIterator,7643,listIterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7646,listIterator,7645,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7648,listIterator,7647,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7650,listIterator,7649,listIterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7652,listIterator,7651,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7653,!(listIterator.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7655,listIterator,7654,listIterator.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7657,listIterator,7656,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7659,listIterator,7658,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7661,listIterator,7660,listIterator.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7663,listIterator,7662,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7665,listIterator,7664,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7667,listIterator,7666,listIterator.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7669,listIterator,7668,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7671,listIterator,7670,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7673,listIterator,7672,listIterator.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7674,!(listIterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7676,listIterator,7675,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove() for an immutable Iterator.
     */
public void testUnmodifiableIteratorImmutability() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableIteratorImmutability");
        final Iterator<java.lang.String> iterator = getImmutableIterator();
        try {
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        iterator.next();
        try {
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove() for an immutable ListIterator.
     */
public void testUnmodifiableListIteratorImmutability() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorImmutability");
        final ListIterator<java.lang.String> listIterator = getImmutableListIterator();
        try {
            listIterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.set("foo");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.add("a");
        } catch (final UnsupportedOperationException e) {
        }
        listIterator.next();
        try {
            listIterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.set("a");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.add("a");
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove() for an immutable ListIterator.
     */
public void testUnmodifiableListIteratorImmutability_literalMutation2496() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorImmutability_literalMutation2496");
        final ListIterator<java.lang.String> listIterator = getImmutableListIterator();
        try {
            listIterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.set("a");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.add("foo");
        } catch (final UnsupportedOperationException e) {
        }
        listIterator.next();
        try {
            listIterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.set("a");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.add("a");
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove() for an immutable ListIterator.
     */
public void testUnmodifiableListIteratorImmutability_literalMutation2497() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorImmutability_literalMutation2497");
        final ListIterator<java.lang.String> listIterator = getImmutableListIterator();
        try {
            listIterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.set("a");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.add("a");
        } catch (final UnsupportedOperationException e) {
        }
        listIterator.next();
        try {
            listIterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.set("foo");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.add("a");
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove() for an immutable ListIterator.
     */
public void testUnmodifiableListIteratorImmutability_literalMutation2498() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorImmutability_literalMutation2498");
        final ListIterator<java.lang.String> listIterator = getImmutableListIterator();
        try {
            listIterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.set("a");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.add("a");
        } catch (final UnsupportedOperationException e) {
        }
        listIterator.next();
        try {
            listIterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.set("a");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.add("foo");
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method nodeListIterator(NodeList)
     */
public void testNodeListIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNodeListIterator");
        final Node[] nodes = createNodes();
        final NodeList nodeList = createNodeList(nodes);
        final Iterator<org.w3c.dom.Node> iterator = IteratorUtils.nodeListIterator(nodeList);
        int expectedNodeIndex = 1;
        for (final Node actual : IteratorUtils.asIterable(iterator)) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7598,nodes[expectedNodeIndex]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7599,actual);
            ++expectedNodeIndex;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7600,(expectedNodeIndex > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7602,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7601,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method nodeListIterator(Node)
     */
public void testNodeIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNodeIterator");
        final Node[] nodes = createNodes();
        final NodeList nodeList = createNodeList(nodes);
        final Node parentNode = org.easymock.EasyMock.createMock(Node.class);
        org.easymock.EasyMock.expect(parentNode.getChildNodes()).andStubReturn(nodeList);
        org.easymock.EasyMock.replay(parentNode);
        final Iterator<org.w3c.dom.Node> iterator = IteratorUtils.nodeListIterator(parentNode);
        int expectedNodeIndex = -1;
        for (final Node actual : IteratorUtils.asIterable(iterator)) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7593,nodes[expectedNodeIndex]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7594,actual);
            ++expectedNodeIndex;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7595,(expectedNodeIndex > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7597,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7596,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * creates an array of four Node instances, mocked by EasyMock.
     */
private Node[] createNodes() {
        final Node node1 = org.easymock.EasyMock.createMock(Node.class);
        final Node node2 = org.easymock.EasyMock.createMock(Node.class);
        final Node node3 = org.easymock.EasyMock.createMock(Node.class);
        final Node node4 = org.easymock.EasyMock.createMock(Node.class);
        org.easymock.EasyMock.replay(node1);
        org.easymock.EasyMock.replay(node2);
        org.easymock.EasyMock.replay(node3);
        org.easymock.EasyMock.replay(node4);
        return new Node[]{ node1 , node2 , node3 , node4 };
    }

    /** 
     * Creates a NodeList containing the specified nodes.
     */
private NodeList createNodeList(final Node[] nodes) {
        return new NodeList() {
            public Node item(final int index) {
                return nodes[index];
            }

            public int getLength() {
                return nodes.length;
            }
        };
    }
}

