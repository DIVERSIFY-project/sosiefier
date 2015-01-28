package org.apache.commons.collections4.set;

import java.util.Iterator;
import java.util.Set;
import org.junit.Test;

/** 
 * JUnit test.
 * 
 * @version $Id$
 * @since 3.1
 */
public class MapBackedSet2Test<E> extends AbstractSetTest<E> {
    public MapBackedSet2Test(final String testName) {
        super(testName);
    }

    @Override
    public Set<E> makeObject() {
        return org.apache.commons.collections4.set.MapBackedSet.mapBackedSet(new org.apache.commons.collections4.map.LinkedMap<E, java.lang.Object>());
    }

    @SuppressWarnings(value = "unchecked")
    protected Set<E> setupSet() {
        final Set<E> set = makeObject();
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        return set;
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testOrdering_add1965() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_add1965");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1842() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1842");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1843() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1843");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = -1 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1844() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1844");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 9 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1845() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1845");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = -1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1846() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1846");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 11 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1847() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1847");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 3) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1848() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1848");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 2 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1849() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1849");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 9 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1850() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1850");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 1) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1851() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1851");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = -1 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1852() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1852");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 9 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1853() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1853");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1854() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1854");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 11 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1855() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1855");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 1) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1856() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1856");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1857() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1857");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 9 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1858() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1858");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 3) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testOrdering_remove1531() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_remove1531");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6220,null,6219,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6222,it,6221,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6224,set,6223,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6226,null,6225,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6228,it,6227,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6230,set,6229,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6232,null,6231,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6234,null,6233,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public void testCanonicalEmptyCollectionExists() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCanonicalEmptyCollectionExists");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public void testCanonicalFullCollectionExists() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCanonicalFullCollectionExists");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

