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

    @org.junit.Test(timeout = 1000)
    public void testAsIterable_add2426() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterable_add2426");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,actual,7476,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7478,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7480,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7479,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsIterable_add2427() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterable_add2427");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,actual,7476,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7478,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7480,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7479,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsIterable_add2428() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterable_add2428");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,actual,7476,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7478,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7480,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7479,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,actual,7476,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7478,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7480,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7479,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsIterable_literalMutation2467() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterable_literalMutation2467");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,actual,7476,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7478,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7480,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7479,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsIterable_literalMutation2468() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterable_literalMutation2468");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(1));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,actual,7476,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7478,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7480,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7479,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,actual,7476,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7478,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7480,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7479,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsIterable_remove1920() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterable_remove1920");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,actual,7476,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7478,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7480,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7479,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsIterable_remove1921() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterable_remove1921");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,actual,7476,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7478,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7480,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7479,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsIterable_remove1922() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterable_remove1922");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7475,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7477,actual,7476,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7478,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7480,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7479,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsIterableNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsIterableNull");
        try {
            IteratorUtils.asIterable(null);
            IteratorUtils.asIterable(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsMultipleIterable_add2430() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable_add2430");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,actual,7482,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7484,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,actual,7486,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7488,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsMultipleIterable_add2431() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable_add2431");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,actual,7482,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7484,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,actual,7486,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7488,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsMultipleIterable_add2432() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable_add2432");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,actual,7482,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7484,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,actual,7486,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7488,(expected > 0));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,actual,7482,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7484,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,actual,7486,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7488,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsMultipleIterable_literalMutation2472() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable_literalMutation2472");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(2));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,actual,7482,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7484,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,actual,7486,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7488,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testAsMultipleIterable_literalMutation2473() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable_literalMutation2473");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(3));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,actual,7482,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7484,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,actual,7486,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7488,(expected > 0));
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
        int expected = 1;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,actual,7482,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7484,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,actual,7486,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7488,(expected > 0));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,actual,7482,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7484,(expected > 0));
        expected = 1;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,actual,7486,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7488,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsMultipleIterable_remove1923() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable_remove1923");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,actual,7482,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7484,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,actual,7486,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7488,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsMultipleIterable_remove1924() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable_remove1924");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,actual,7482,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7484,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,actual,7486,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7488,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsMultipleIterable_remove1925() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterable_remove1925");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iterator = list.iterator();
        final Iterable<java.lang.Integer> iterable = IteratorUtils.asMultipleUseIterable(iterator);
        int expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7481,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7483,actual,7482,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7484,(expected > 0));
        expected = 0;
        for (final Integer actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7485,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7487,actual,7486,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7488,(expected > 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testAsMultipleIterableNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testAsMultipleIterableNull");
        try {
            IteratorUtils.asMultipleUseIterable(null);
            IteratorUtils.asMultipleUseIterable(null);
        } catch (final NullPointerException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToList_add2468() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToList_add2468");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(1));
        list.add("Two");
        list.add(null);
        final List<java.lang.Object> result = IteratorUtils.toList(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7584,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7585,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToList_add2469() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToList_add2469");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(1));
        list.add("Two");
        list.add("Two");
        list.add(null);
        final List<java.lang.Object> result = IteratorUtils.toList(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7584,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7585,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToList_add2470() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToList_add2470");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(1));
        list.add("Two");
        list.add(null);
        list.add(null);
        final List<java.lang.Object> result = IteratorUtils.toList(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7584,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7585,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToList");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(2));
        list.add("Two");
        list.add(null);
        final List<java.lang.Object> result = IteratorUtils.toList(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7584,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7585,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToList_literalMutation2493() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToList_literalMutation2493");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(1));
        list.add("foo");
        list.add(null);
        final List<java.lang.Object> result = IteratorUtils.toList(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7584,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7585,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToList_remove1939() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToList_remove1939");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add("Two");
        list.add(null);
        final List<java.lang.Object> result = IteratorUtils.toList(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7584,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7585,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToList_remove1940() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToList_remove1940");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add("Two");
        list.add(null);
        final List<java.lang.Object> result = IteratorUtils.toList(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7584,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7585,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToList_remove1941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToList_remove1941");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add("Two");
        list.add(null);
        final List<java.lang.Object> result = IteratorUtils.toList(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7584,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7585,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToArray_add2462() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray_add2462");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(1));
        list.add("Two");
        list.add(null);
        final Object[] result = IteratorUtils.toArray(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7581,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7583,null,7582,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToArray_add2463() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray_add2463");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(1));
        list.add("Two");
        list.add("Two");
        list.add(null);
        final Object[] result = IteratorUtils.toArray(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7581,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7583,null,7582,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToArray_add2464() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray_add2464");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(1));
        list.add("Two");
        list.add(null);
        list.add(null);
        final Object[] result = IteratorUtils.toArray(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7581,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7583,null,7582,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(0));
        list.add("Two");
        list.add(null);
        final Object[] result = IteratorUtils.toArray(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7581,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7583,null,7582,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToArray_literalMutation2487() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray_literalMutation2487");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add(Integer.valueOf(1));
        list.add("foo");
        list.add(null);
        final Object[] result = IteratorUtils.toArray(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7581,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7583,null,7582,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToArray_remove1933() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray_remove1933");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add("Two");
        list.add(null);
        final Object[] result = IteratorUtils.toArray(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7581,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7583,null,7582,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToArray_remove1934() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray_remove1934");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add("Two");
        list.add(null);
        final Object[] result = IteratorUtils.toArray(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7581,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7583,null,7582,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToArray_remove1935() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray_remove1935");
        final List<java.lang.Object> list = new ArrayList<java.lang.Object>();
        list.add("Two");
        list.add(null);
        final Object[] result = IteratorUtils.toArray(list.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7581,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7583,null,7582,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToArray2_add2465() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray2_add2465");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("One");
        list.add("One");
        list.add("Two");
        list.add(null);
        final String[] result = IteratorUtils.toArray(list.iterator(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7578,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7580,null,7579,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToArray2_add2466() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray2_add2466");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("One");
        list.add("Two");
        list.add("Two");
        list.add(null);
        final String[] result = IteratorUtils.toArray(list.iterator(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7578,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7580,null,7579,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToArray2_add2467() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray2_add2467");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("One");
        list.add("Two");
        list.add(null);
        list.add(null);
        final String[] result = IteratorUtils.toArray(list.iterator(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7578,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7580,null,7579,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToArray2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray2");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("foo");
        list.add("Two");
        list.add(null);
        final String[] result = IteratorUtils.toArray(list.iterator(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7578,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7580,null,7579,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToArray2_literalMutation2490() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray2_literalMutation2490");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("One");
        list.add("foo");
        list.add(null);
        final String[] result = IteratorUtils.toArray(list.iterator(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7578,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7580,null,7579,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToArray2_remove1936() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray2_remove1936");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("Two");
        list.add(null);
        final String[] result = IteratorUtils.toArray(list.iterator(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7578,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7580,null,7579,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToArray2_remove1937() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray2_remove1937");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("Two");
        list.add(null);
        final String[] result = IteratorUtils.toArray(list.iterator(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7578,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7580,null,7579,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToArray2_remove1938() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToArray2_remove1938");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add("Two");
        list.add(null);
        final String[] result = IteratorUtils.toArray(list.iterator(), String.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7578,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7580,null,7579,java.util.Arrays.asList(result));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testArrayIterator_add2421() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_add2421");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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

    @org.junit.Test(timeout = 1000)
    public void testArrayIterator_add2422() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_add2422");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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

    @org.junit.Test(timeout = 1000)
    public void testArrayIterator_add2423() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_add2423");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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

    @org.junit.Test(timeout = 1000)
    public void testArrayIterator_add2424() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_add2424");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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

    public void testArrayIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator");
        final Object[] objArray = new Object[]{ "foo" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(-1));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 3, 4);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 3, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 2, 2);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        final int[] intArray = new int[]{ 0 , 0 , 2 };
        iterator = IteratorUtils.arrayIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 1, 1);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testArrayIterator_literalMutation2432() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_literalMutation2432");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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

    @org.junit.Test(timeout = 1000)
    public void testArrayIterator_remove1916() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_remove1916");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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

    @org.junit.Test(timeout = 1000)
    public void testArrayIterator_remove1917() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_remove1917");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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

    @org.junit.Test(timeout = 1000)
    public void testArrayIterator_remove1918() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_remove1918");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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

    @org.junit.Test(timeout = 1000)
    public void testArrayIterator_remove1919() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayIterator_remove1919");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" };
        ResettableIterator<java.lang.Object> iterator = IteratorUtils.arrayIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7383,iterator.next(),7382,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7385,iterator.next(),7384,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7387,iterator.next(),7386,iterator.next().equals("a"));
        try {
            iterator = IteratorUtils.arrayIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7389,iterator.next(),7388,iterator.next().equals("b"));
        try {
            iterator = IteratorUtils.arrayIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7390,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7392,iterator.next(),7391,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7394,iterator.next(),7393,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7396,iterator.next(),7395,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7398,iterator.next(),7397,iterator.next().equals(java.lang.Integer.valueOf(0)));
        iterator = IteratorUtils.arrayIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7400,iterator.next(),7399,iterator.next().equals(java.lang.Integer.valueOf(1)));
        try {
            iterator = IteratorUtils.arrayIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7401,!(iterator.hasNext()));
        iterator.reset();
        try {
            iterator = IteratorUtils.arrayIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7403,iterator.next(),7402,iterator.next().equals(java.lang.Integer.valueOf(2)));
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

    @org.junit.Test(timeout = 1000)
    public void testArrayListIterator_add2425() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator_add2425");
        final Object[] objArray = new Object[]{ "a" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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

    public void testArrayListIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testArrayListIterator");
        final Object[] objArray = new Object[]{ "foo" , "b" , "c" , "d" };
        ResettableListIterator<java.lang.Object> iterator = IteratorUtils.arrayListIterator(objArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(1));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 4);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 2, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1, 1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 3, 1);
        } catch (final IllegalArgumentException ex) {
        }
        final int[] intArray = new int[]{ 0 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        final int[] intArray = new int[]{ -1 , 1 , 2 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        final int[] intArray = new int[]{ 0 , 1 , 3 };
        iterator = IteratorUtils.arrayListIterator(intArray);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 0);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 3);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 2, 1);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7404,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7405,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7406,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7408,iterator.next(),7407,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7410,iterator.previous(),7409,iterator.previous().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7412,iterator.next(),7411,iterator.next().equals("a"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7413,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7414,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7416,iterator.next(),7415,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7418,iterator.next(),7417,iterator.next().equals("c"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7420,iterator.next(),7419,iterator.next().equals("d"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7421,((iterator.nextIndex()) == 4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7422,((iterator.previousIndex()) == 3));
        try {
            iterator = IteratorUtils.arrayListIterator(Integer.valueOf(0));
        } catch (final IllegalArgumentException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(((Object[])(null)));
        } catch (final NullPointerException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7423,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7424,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7425,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7427,iterator.next(),7426,iterator.next().equals("b"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7428,((iterator.previousIndex()) == 0));
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7430,iterator,7429,iterator.hasNext());
        try {
            iterator.previous();
        } catch (final NoSuchElementException ex) {
        }
        try {
            iterator = IteratorUtils.arrayListIterator(objArray, 5);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(objArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7432,iterator.next(),7431,iterator.next().equals("c"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7433,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7434,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7435,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7437,iterator.next(),7436,iterator.next().equals(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7438,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7439,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7441,iterator.next(),7440,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7442,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7443,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7445,iterator.previous(),7444,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7447,iterator.next(),7446,iterator.next().equals(java.lang.Integer.valueOf(1)));
        iterator = IteratorUtils.arrayListIterator(intArray, 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7448,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7449,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7450,((iterator.nextIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7452,iterator.next(),7451,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7454,iterator.previous(),7453,iterator.previous().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7456,iterator.next(),7455,iterator.next().equals(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7457,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7458,((iterator.nextIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7460,iterator.next(),7459,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7461,((iterator.previousIndex()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7462,((iterator.nextIndex()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7464,iterator.previous(),7463,iterator.previous().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7465,((iterator.previousIndex()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7466,((iterator.nextIndex()) == 1));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, -1);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7467,!(iterator.hasNext()));
        try {
            iterator = IteratorUtils.arrayListIterator(intArray, 4);
        } catch (final IndexOutOfBoundsException ex) {
        }
        iterator = IteratorUtils.arrayListIterator(intArray, 2, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7468,!(iterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7469,((iterator.previousIndex()) == (-1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7471,iterator.next(),7470,iterator.next().equals(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7473,iterator,7472,iterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7474,!(iterator.hasNext()));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,org.apache.commons.collections4.iterators.EmptyIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7495,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7497,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR,7498,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR.hasNext());
        IteratorUtils.EMPTY_ITERATOR.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7501,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7503,null,7502,org.apache.commons.collections4.IteratorUtils.emptyIterator());
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
     * Test empty iterator
     */
@org.junit.Test(timeout = 1000)
    public void testEmptyIterator_add2434() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIterator_add2434");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,org.apache.commons.collections4.iterators.EmptyIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7495,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7497,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR,7498,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR.hasNext());
        IteratorUtils.EMPTY_ITERATOR.reset();
        IteratorUtils.EMPTY_ITERATOR.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7501,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7503,null,7502,org.apache.commons.collections4.IteratorUtils.emptyIterator());
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
     * Test empty iterator
     */
@org.junit.Test(timeout = 1000)
    public void testEmptyIterator_add2435() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIterator_add2435");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,org.apache.commons.collections4.iterators.EmptyIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7495,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7497,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR,7498,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR.hasNext());
        IteratorUtils.EMPTY_ITERATOR.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7501,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7503,null,7502,org.apache.commons.collections4.IteratorUtils.emptyIterator());
        try {
            IteratorUtils.EMPTY_ITERATOR.next();
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
     * Test empty iterator
     */
@org.junit.Test(timeout = 1000)
    public void testEmptyIterator_add2436() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIterator_add2436");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,org.apache.commons.collections4.iterators.EmptyIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7495,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7497,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR,7498,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR.hasNext());
        IteratorUtils.EMPTY_ITERATOR.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7501,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7503,null,7502,org.apache.commons.collections4.IteratorUtils.emptyIterator());
        try {
            IteratorUtils.EMPTY_ITERATOR.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_ITERATOR.remove();
            IteratorUtils.EMPTY_ITERATOR.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test empty iterator
     */
@org.junit.Test(timeout = 1000)
    public void testEmptyIterator_remove1926() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIterator_remove1926");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7489,org.apache.commons.collections4.iterators.EmptyIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7490,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7491,org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7492,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7493,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7494,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7495,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7496,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7497,((org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7499,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR,7498,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7500,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7501,org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7503,null,7502,org.apache.commons.collections4.IteratorUtils.emptyIterator());
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
@org.junit.Test(timeout = 1000)
    public void testEmptyListIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListIterator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7504,org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7505,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7506,org.apache.commons.collections4.iterators.EmptyListIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7507,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7508,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7509,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7510,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7511,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7512,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7514,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7513,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7516,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7515,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7517,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7519,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7518,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.previousIndex());
        IteratorUtils.EMPTY_LIST_ITERATOR.reset();
        IteratorUtils.EMPTY_LIST_ITERATOR.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7521,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7523,null,7522,org.apache.commons.collections4.IteratorUtils.emptyListIterator());
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
     * Test empty list iterator
     */
@org.junit.Test(timeout = 1000)
    public void testEmptyListIterator_add2438() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListIterator_add2438");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7504,org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7505,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7506,org.apache.commons.collections4.iterators.EmptyListIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7507,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7508,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7509,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7510,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7511,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7512,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7514,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7513,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7516,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7515,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7517,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7519,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7518,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.previousIndex());
        IteratorUtils.EMPTY_LIST_ITERATOR.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7521,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7523,null,7522,org.apache.commons.collections4.IteratorUtils.emptyListIterator());
        try {
            IteratorUtils.EMPTY_LIST_ITERATOR.next();
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
     * Test empty list iterator
     */
@org.junit.Test(timeout = 1000)
    public void testEmptyListIterator_add2439() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListIterator_add2439");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7504,org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7505,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7506,org.apache.commons.collections4.iterators.EmptyListIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7507,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7508,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7509,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7510,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7511,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7512,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7514,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7513,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7516,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7515,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7517,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7519,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7518,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.previousIndex());
        IteratorUtils.EMPTY_LIST_ITERATOR.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7521,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7523,null,7522,org.apache.commons.collections4.IteratorUtils.emptyListIterator());
        try {
            IteratorUtils.EMPTY_LIST_ITERATOR.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_LIST_ITERATOR.previous();
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
     * Test empty list iterator
     */
@org.junit.Test(timeout = 1000)
    public void testEmptyListIterator_add2440() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListIterator_add2440");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7504,org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7505,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7506,org.apache.commons.collections4.iterators.EmptyListIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7507,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7508,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7509,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7510,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7511,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7512,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7514,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7513,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7516,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7515,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7517,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7519,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7518,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.previousIndex());
        IteratorUtils.EMPTY_LIST_ITERATOR.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7521,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7523,null,7522,org.apache.commons.collections4.IteratorUtils.emptyListIterator());
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
     * Test empty list iterator
     */
@org.junit.Test(timeout = 1000)
    public void testEmptyListIterator_add2441() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListIterator_add2441");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7504,org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7505,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7506,org.apache.commons.collections4.iterators.EmptyListIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7507,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7508,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7509,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7510,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7511,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7512,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7514,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7513,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7516,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7515,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7517,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7519,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7518,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.previousIndex());
        IteratorUtils.EMPTY_LIST_ITERATOR.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7521,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7523,null,7522,org.apache.commons.collections4.IteratorUtils.emptyListIterator());
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
     * Test empty list iterator
     */
@org.junit.Test(timeout = 1000)
    public void testEmptyListIterator_add2442() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListIterator_add2442");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7504,org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7505,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7506,org.apache.commons.collections4.iterators.EmptyListIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7507,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7508,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7509,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7510,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7511,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7512,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7514,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7513,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7516,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7515,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7517,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7519,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7518,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.previousIndex());
        IteratorUtils.EMPTY_LIST_ITERATOR.reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7521,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7523,null,7522,org.apache.commons.collections4.IteratorUtils.emptyListIterator());
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
            IteratorUtils.emptyListIterator().add(null);
        } catch (final UnsupportedOperationException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test empty list iterator
     */
@org.junit.Test(timeout = 1000)
    public void testEmptyListIterator_remove1927() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyListIterator_remove1927");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7504,org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7505,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7506,org.apache.commons.collections4.iterators.EmptyListIterator.RESETTABLE_INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7507,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7508,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7509,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7510,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7511,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.ResettableListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7512,((org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7514,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7513,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7516,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7515,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.nextIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7517,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7519,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR,7518,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR.previousIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7520,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7521,org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7523,null,7522,org.apache.commons.collections4.IteratorUtils.emptyListIterator());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7524,org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7525,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7526,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7527,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7528,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7529,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7530,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7531,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7533,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR,7532,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR.hasNext());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7535,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7537,null,7536,org.apache.commons.collections4.IteratorUtils.emptyMapIterator());
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyMapIterator_add2443() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_add2443");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7524,org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7525,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7526,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7527,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7528,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7529,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7530,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7531,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7533,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR,7532,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR.hasNext());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_MAP_ITERATOR)).reset();
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7535,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7537,null,7536,org.apache.commons.collections4.IteratorUtils.emptyMapIterator());
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyMapIterator_add2444() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_add2444");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7524,org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7525,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7526,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7527,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7528,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7529,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7530,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7531,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7533,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR,7532,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR.hasNext());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7535,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7537,null,7536,org.apache.commons.collections4.IteratorUtils.emptyMapIterator());
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.next();
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyMapIterator_add2445() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_add2445");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7524,org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7525,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7526,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7527,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7528,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7529,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7530,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7531,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7533,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR,7532,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR.hasNext());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7535,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7537,null,7536,org.apache.commons.collections4.IteratorUtils.emptyMapIterator());
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_MAP_ITERATOR.remove();
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyMapIterator_add2446() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_add2446");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7524,org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7525,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7526,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7527,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7528,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7529,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7530,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7531,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7533,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR,7532,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR.hasNext());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7535,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7537,null,7536,org.apache.commons.collections4.IteratorUtils.emptyMapIterator());
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyMapIterator_add2447() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_add2447");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7524,org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7525,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7526,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7527,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7528,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7529,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7530,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7531,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7533,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR,7532,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR.hasNext());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7535,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7537,null,7536,org.apache.commons.collections4.IteratorUtils.emptyMapIterator());
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyMapIterator_add2448() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_add2448");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7524,org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7525,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7526,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7527,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7528,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7529,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7530,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7531,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7533,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR,7532,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR.hasNext());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7535,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7537,null,7536,org.apache.commons.collections4.IteratorUtils.emptyMapIterator());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7524,org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7525,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7526,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7527,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7528,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7529,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7530,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7531,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7533,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR,7532,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR.hasNext());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7535,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7537,null,7536,org.apache.commons.collections4.IteratorUtils.emptyMapIterator());
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyMapIterator_remove1928() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyMapIterator_remove1928");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7524,org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7525,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7526,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7527,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7528,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7529,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7530,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7531,((org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7533,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR,7532,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7534,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7535,org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7537,null,7536,org.apache.commons.collections4.IteratorUtils.emptyMapIterator());
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedIterator_add2449() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedIterator_add2449");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7538,org.apache.commons.collections4.iterators.EmptyOrderedIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7539,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7540,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7541,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7542,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7543,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7544,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7546,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7545,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7548,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7547,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_ITERATOR)).reset();
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7550,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7552,null,7551,org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator());
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedIterator_add2450() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedIterator_add2450");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7538,org.apache.commons.collections4.iterators.EmptyOrderedIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7539,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7540,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7541,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7542,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7543,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7544,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7546,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7545,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7548,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7547,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7550,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7552,null,7551,org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator());
        try {
            IteratorUtils.EMPTY_ORDERED_ITERATOR.next();
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedIterator_add2451() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedIterator_add2451");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7538,org.apache.commons.collections4.iterators.EmptyOrderedIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7539,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7540,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7541,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7542,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7543,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7544,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7546,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7545,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7548,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7547,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7550,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7552,null,7551,org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator());
        try {
            IteratorUtils.EMPTY_ORDERED_ITERATOR.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_ORDERED_ITERATOR.previous();
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedIterator_add2452() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedIterator_add2452");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7538,org.apache.commons.collections4.iterators.EmptyOrderedIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7539,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7540,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7541,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7542,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7543,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7544,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7546,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7545,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7548,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7547,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7550,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7552,null,7551,org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator());
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
            IteratorUtils.EMPTY_ORDERED_ITERATOR.remove();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7538,org.apache.commons.collections4.iterators.EmptyOrderedIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7539,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7540,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7541,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7542,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7543,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7544,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7546,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7545,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7548,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7547,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7550,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7552,null,7551,org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator());
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedIterator_remove1929() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedIterator_remove1929");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7538,org.apache.commons.collections4.iterators.EmptyOrderedIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7539,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7540,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7541,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.OrderedIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7542,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7543,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7544,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7546,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7545,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7548,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR,7547,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7549,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7550,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7552,null,7551,org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator());
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
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedMapIterator_add2453() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedMapIterator_add2453");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7553,org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7554,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7555,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7556,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7557,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7558,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7561,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7560,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7563,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7562,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR)).reset();
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7565,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7567,null,7566,org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator());
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
     * Test empty map iterator
     */
@SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedMapIterator_add2454() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedMapIterator_add2454");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7553,org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7554,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7555,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7556,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7557,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7558,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7561,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7560,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7563,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7562,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7565,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7567,null,7566,org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator());
        try {
            IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.next();
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
     * Test empty map iterator
     */
@SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedMapIterator_add2455() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedMapIterator_add2455");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7553,org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7554,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7555,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7556,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7557,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7558,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7561,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7560,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7563,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7562,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7565,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7567,null,7566,org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator());
        try {
            IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.previous();
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
     * Test empty map iterator
     */
@SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedMapIterator_add2456() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedMapIterator_add2456");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7553,org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7554,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7555,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7556,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7557,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7558,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7561,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7560,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7563,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7562,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7565,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7567,null,7566,org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator());
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
     * Test empty map iterator
     */
@SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedMapIterator_add2457() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedMapIterator_add2457");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7553,org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7554,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7555,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7556,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7557,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7558,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7561,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7560,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7563,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7562,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7565,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7567,null,7566,org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator());
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
     * Test empty map iterator
     */
@SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedMapIterator_add2458() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedMapIterator_add2458");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7553,org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7554,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7555,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7556,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7557,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7558,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7561,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7560,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7563,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7562,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7565,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7567,null,7566,org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator());
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
     * Test empty map iterator
     */
@SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedMapIterator_add2459() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedMapIterator_add2459");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7553,org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7554,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7555,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7556,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7557,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7558,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7561,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7560,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7563,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7562,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7565,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7567,null,7566,org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator());
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
            IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.setValue(null);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7553,org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7554,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7555,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7556,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7557,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7558,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7561,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7560,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7563,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7562,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasPrevious());
        ((ResettableIterator<java.lang.Object>)(IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR)).reset();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7565,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7567,null,7566,org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator());
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
     * Test empty map iterator
     */
@SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testEmptyOrderedMapIterator_remove1930() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyOrderedMapIterator_remove1930");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7553,org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7554,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7555,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.Iterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7556,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.MapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7557,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.OrderedMapIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7558,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof org.apache.commons.collections4.ResettableIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7559,((org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR) instanceof java.util.ListIterator));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7561,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7560,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7563,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR,7562,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7564,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7565,org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7567,null,7566,org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7587,iterator,7586,iterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7589,iterator,7588,iterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7591,iterator,7590,iterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7593,iterator,7592,iterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7595,iterator,7594,iterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7597,iterator,7596,iterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7599,iterator,7598,iterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7601,iterator,7600,iterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7602,!(iterator.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test next(), hasNext(), previous() and hasPrevious() for an immutable
     * ListIterator.
     */
public void testUnmodifiableListIteratorIteration() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorIteration");
        final ListIterator<java.lang.String> listIterator = getImmutableListIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7603,!(listIterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7605,listIterator,7604,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7607,listIterator,7606,listIterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7609,listIterator,7608,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7611,listIterator,7610,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7613,listIterator,7612,listIterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7615,listIterator,7614,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7617,listIterator,7616,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7619,listIterator,7618,listIterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7621,listIterator,7620,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7623,listIterator,7622,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7625,listIterator,7624,listIterator.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7627,listIterator,7626,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7628,!(listIterator.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7630,listIterator,7629,listIterator.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7632,listIterator,7631,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7634,listIterator,7633,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7636,listIterator,7635,listIterator.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7638,listIterator,7637,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7640,listIterator,7639,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7642,listIterator,7641,listIterator.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7644,listIterator,7643,listIterator.hasPrevious());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7646,listIterator,7645,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7648,listIterator,7647,listIterator.previous());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7649,!(listIterator.hasPrevious()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7651,listIterator,7650,listIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove() for an immutable Iterator.
     */
@org.junit.Test(timeout = 1000)
    public void testUnmodifiableIteratorImmutability() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableIteratorImmutability");
        final Iterator<java.lang.String> iterator = getImmutableIterator();
        try {
            iterator.remove();
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
     * Test remove() for an immutable Iterator.
     */
@org.junit.Test(timeout = 1000)
    public void testUnmodifiableIteratorImmutability_add2472() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableIteratorImmutability_add2472");
        final Iterator<java.lang.String> iterator = getImmutableIterator();
        try {
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        iterator.next();
        iterator.next();
        try {
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove() for an immutable Iterator.
     */
@org.junit.Test(timeout = 1000)
    public void testUnmodifiableIteratorImmutability_add2473() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableIteratorImmutability_add2473");
        final Iterator<java.lang.String> iterator = getImmutableIterator();
        try {
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        iterator.next();
        try {
            iterator.remove();
            iterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove() for an immutable ListIterator.
     */
@org.junit.Test(timeout = 1000)
    public void testUnmodifiableListIteratorImmutability_add2474() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorImmutability_add2474");
        final ListIterator<java.lang.String> listIterator = getImmutableListIterator();
        try {
            listIterator.remove();
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
            listIterator.add("a");
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove() for an immutable ListIterator.
     */
@org.junit.Test(timeout = 1000)
    public void testUnmodifiableListIteratorImmutability_add2475() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorImmutability_add2475");
        final ListIterator<java.lang.String> listIterator = getImmutableListIterator();
        try {
            listIterator.remove();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            listIterator.set("a");
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
            listIterator.add("a");
        } catch (final UnsupportedOperationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test remove() for an immutable ListIterator.
     */
@org.junit.Test(timeout = 1000)
    public void testUnmodifiableListIteratorImmutability_add2476() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorImmutability_add2476");
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
@org.junit.Test(timeout = 1000)
    public void testUnmodifiableListIteratorImmutability_add2477() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorImmutability_add2477");
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
@org.junit.Test(timeout = 1000)
    public void testUnmodifiableListIteratorImmutability_add2478() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorImmutability_add2478");
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
@org.junit.Test(timeout = 1000)
    public void testUnmodifiableListIteratorImmutability_add2479() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorImmutability_add2479");
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
@org.junit.Test(timeout = 1000)
    public void testUnmodifiableListIteratorImmutability_add2480() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableListIteratorImmutability_add2480");
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
            listIterator.add("a");
            listIterator.add("a");
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
        int expectedNodeIndex = -1;
        for (final Node actual : IteratorUtils.asIterable(iterator)) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7573,nodes[expectedNodeIndex]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7574,actual);
            ++expectedNodeIndex;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7575,(expectedNodeIndex > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7577,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7576,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method nodeListIterator(Node)
     */
@org.junit.Test(timeout = 1000)
    public void testNodeIterator_add2460() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNodeIterator_add2460");
        final Node[] nodes = createNodes();
        final NodeList nodeList = createNodeList(nodes);
        final Node parentNode = org.easymock.EasyMock.createMock(Node.class);
        org.easymock.EasyMock.expect(parentNode.getChildNodes()).andStubReturn(nodeList);
        org.easymock.EasyMock.expect(parentNode.getChildNodes()).andStubReturn(nodeList);
        org.easymock.EasyMock.replay(parentNode);
        final Iterator<org.w3c.dom.Node> iterator = IteratorUtils.nodeListIterator(parentNode);
        int expectedNodeIndex = 0;
        for (final Node actual : IteratorUtils.asIterable(iterator)) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7568,nodes[expectedNodeIndex]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7569,actual);
            ++expectedNodeIndex;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7570,(expectedNodeIndex > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7572,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7571,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method nodeListIterator(Node)
     */
@org.junit.Test(timeout = 1000)
    public void testNodeIterator_add2461() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNodeIterator_add2461");
        final Node[] nodes = createNodes();
        final NodeList nodeList = createNodeList(nodes);
        final Node parentNode = org.easymock.EasyMock.createMock(Node.class);
        org.easymock.EasyMock.expect(parentNode.getChildNodes()).andStubReturn(nodeList);
        org.easymock.EasyMock.replay(parentNode);
        org.easymock.EasyMock.replay(parentNode);
        final Iterator<org.w3c.dom.Node> iterator = IteratorUtils.nodeListIterator(parentNode);
        int expectedNodeIndex = 0;
        for (final Node actual : IteratorUtils.asIterable(iterator)) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7568,nodes[expectedNodeIndex]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7569,actual);
            ++expectedNodeIndex;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7570,(expectedNodeIndex > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7572,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7571,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7568,nodes[expectedNodeIndex]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7569,actual);
            ++expectedNodeIndex;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7570,(expectedNodeIndex > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7572,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7571,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method nodeListIterator(Node)
     */
@org.junit.Test(timeout = 1000)
    public void testNodeIterator_remove1931() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNodeIterator_remove1931");
        final Node[] nodes = createNodes();
        final NodeList nodeList = createNodeList(nodes);
        final Node parentNode = org.easymock.EasyMock.createMock(Node.class);
        org.easymock.EasyMock.replay(parentNode);
        final Iterator<org.w3c.dom.Node> iterator = IteratorUtils.nodeListIterator(parentNode);
        int expectedNodeIndex = 0;
        for (final Node actual : IteratorUtils.asIterable(iterator)) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7568,nodes[expectedNodeIndex]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7569,actual);
            ++expectedNodeIndex;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7570,(expectedNodeIndex > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7572,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7571,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests method nodeListIterator(Node)
     */
@org.junit.Test(timeout = 1000)
    public void testNodeIterator_remove1932() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNodeIterator_remove1932");
        final Node[] nodes = createNodes();
        final NodeList nodeList = createNodeList(nodes);
        final Node parentNode = org.easymock.EasyMock.createMock(Node.class);
        org.easymock.EasyMock.expect(parentNode.getChildNodes()).andStubReturn(nodeList);
        final Iterator<org.w3c.dom.Node> iterator = IteratorUtils.nodeListIterator(parentNode);
        int expectedNodeIndex = 0;
        for (final Node actual : IteratorUtils.asIterable(iterator)) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7568,nodes[expectedNodeIndex]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7569,actual);
            ++expectedNodeIndex;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7570,(expectedNodeIndex > 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7572,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator(),7571,org.apache.commons.collections4.IteratorUtils.asIterable(iterator).iterator().hasNext());
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

