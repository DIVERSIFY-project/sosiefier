package org.apache.commons.collections4.set;

import java.util.Iterator;
import java.util.Set;

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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1843() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1843");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 1 ; i < 10 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),933,it,932,it.next());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testOrdering_literalMutation1844() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering_literalMutation1844");
        final Set<E> set = setupSet();
        Iterator<E> it = set.iterator();
        for (int i = 0 ; i < 11 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = -1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 11 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 1) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 9 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 1) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 1 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 9 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 11 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 1) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 11 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6259,null,6258,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6261,it,6260,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6263,set,6262,set.remove(java.lang.Integer.toString(i)));
        }
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6265,null,6264,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6267,it,6266,it.next());
        }
        for (int i = 0 ; i < 10 ; i++) {
            set.add(((E)(java.lang.Integer.toString(i))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6269,set,6268,set.size());
        it = set.iterator();
        for (int i = 1 ; i < 10 ; i += 2) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6271,null,6270,java.lang.Integer.toString(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),927,it,926,it.next());
        }
        for (int i = 0 ; i < 10 ; i += 3) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6273,null,6272,java.lang.Integer.toString(i));
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

