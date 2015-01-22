package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import org.apache.commons.collections4.BulkTest;
import java.util.Iterator;
import java.util.List;
import junit.framework.Test;

/** 
 * Tests for IteratorIterable.
 * 
 * @version $Id$
 */
public class IteratorIterableTest extends BulkTest {
    public static Test suite() {
        return BulkTest.makeSuite(IteratorIterableTest.class);
    }

    public IteratorIterableTest(final String name) {
        super(name);
    }

    private Iterator<java.lang.Integer> createIterator() {
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(Integer.valueOf(0));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        final Iterator<java.lang.Integer> iter = list.iterator();
        return iter;
    }

    @SuppressWarnings(value = "unused")
    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        final Iterator<java.lang.Integer> iter = createIterator();
        final Iterable<java.lang.Number> iterable = new IteratorIterable<java.lang.Number>(iter);
        verifyIteration(iterable);
        for (final Number actual : iterable) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unused")
    public void testIterator_literalMutation1019() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_literalMutation1019");
        final Iterator<java.lang.Integer> iter = createIterator();
        final Iterable<java.lang.Number> iterable = new IteratorIterable<java.lang.Number>(iter);
        verifyIteration(iterable);
        for (final Number actual : iterable) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testMultipleUserIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMultipleUserIterator");
        final Iterator<java.lang.Integer> iter = createIterator();
        final Iterable<java.lang.Number> iterable = new IteratorIterable<java.lang.Number>(iter , false);
        verifyIteration(iterable);
        verifyIteration(iterable);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void verifyIteration(final Iterable<java.lang.Number> iterable) {
        int expected = 0;
        for (final Number actual : iterable) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3413,expected);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3415,actual,3414,actual.intValue());
            ++expected;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3416,(expected > 0));
    }
}

