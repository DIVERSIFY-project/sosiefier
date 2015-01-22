package org.apache.commons.collections4.set;

import java.util.Comparator;
import org.apache.commons.collections4.Predicate;
import java.util.Set;
import java.util.SortedSet;
import junit.framework.Test;
import java.util.TreeSet;

/** 
 * Extension of {@link AbstractSortedSetTest} for exercising the
 * {@link PredicatedSortedSet} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class PredicatedSortedSetTest<E> extends AbstractSortedSetTest<E> {
    public PredicatedSortedSetTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(PredicatedSortedSetTest.class);
    }

    protected Predicate<E> truePredicate = org.apache.commons.collections4.functors.TruePredicate.<E>truePredicate();

    @Override
    public SortedSet<E> makeObject() {
        return PredicatedSortedSet.predicatedSortedSet(new TreeSet<E>(), truePredicate);
    }

    @Override
    public SortedSet<E> makeFullCollection() {
        final TreeSet<E> set = new TreeSet<E>();
        set.addAll(java.util.Arrays.asList(getFullElements()));
        return PredicatedSortedSet.predicatedSortedSet(set, truePredicate);
    }

    protected Predicate<E> testPredicate = new Predicate<E>() {
        public boolean evaluate(final E o) {
            return (o instanceof String) && (((String)(o)).startsWith("A"));
        }
    };

    protected PredicatedSortedSet<E> makeTestSet() {
        return PredicatedSortedSet.predicatedSortedSet(new TreeSet<E>(), testPredicate);
    }

    public void testGetSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetSet");
        final PredicatedSortedSet<E> set = makeTestSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6281,((set.decorated()) != null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd");
        final SortedSet<E> set = makeTestSet();
        final String testString = "B";
        try {
            set.add(((E)(testString)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6282,!(set.contains(testString)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd_literalMutation1866() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_literalMutation1866");
        final SortedSet<E> set = makeTestSet();
        final String testString = "B";
        try {
            set.add(((E)(testString)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6282,!(set.contains(testString)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd_literalMutation1867() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_literalMutation1867");
        final SortedSet<E> set = makeTestSet();
        final String testString = "foo";
        try {
            set.add(((E)(testString)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6282,!(set.contains(testString)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll");
        final SortedSet<E> set = makeTestSet();
        final Set<E> elements = new TreeSet<E>();
        elements.add(((E)("Aone")));
        elements.add(((E)("Atwo")));
        elements.add(((E)("Bthree")));
        elements.add(((E)("Afour")));
        try {
            set.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6283,!(set.contains("Aone")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6284,!(set.contains("Atwo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6285,!(set.contains("Bthree")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6286,!(set.contains("Afour")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1868() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1868");
        final SortedSet<E> set = makeTestSet();
        final Set<E> elements = new TreeSet<E>();
        elements.add(((E)("Aone")));
        elements.add(((E)("Atwo")));
        elements.add(((E)("Bthree")));
        elements.add(((E)("Afour")));
        try {
            set.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6283,!(set.contains("Aone")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6284,!(set.contains("Atwo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6285,!(set.contains("Bthree")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6286,!(set.contains("Afour")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1869() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1869");
        final SortedSet<E> set = makeTestSet();
        final Set<E> elements = new TreeSet<E>();
        elements.add(((E)("foo")));
        elements.add(((E)("Atwo")));
        elements.add(((E)("Bthree")));
        elements.add(((E)("Afour")));
        try {
            set.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6283,!(set.contains("Aone")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6284,!(set.contains("Atwo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6285,!(set.contains("Bthree")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6286,!(set.contains("Afour")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1870() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1870");
        final SortedSet<E> set = makeTestSet();
        final Set<E> elements = new TreeSet<E>();
        elements.add(((E)("Aone")));
        elements.add(((E)("foo")));
        elements.add(((E)("Bthree")));
        elements.add(((E)("Afour")));
        try {
            set.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6283,!(set.contains("Aone")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6284,!(set.contains("Atwo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6285,!(set.contains("Bthree")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6286,!(set.contains("Afour")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1871() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1871");
        final SortedSet<E> set = makeTestSet();
        final Set<E> elements = new TreeSet<E>();
        elements.add(((E)("Aone")));
        elements.add(((E)("Atwo")));
        elements.add(((E)("foo")));
        elements.add(((E)("Afour")));
        try {
            set.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6283,!(set.contains("Aone")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6284,!(set.contains("Atwo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6285,!(set.contains("Bthree")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6286,!(set.contains("Afour")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAddAll_literalMutation1872() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAddAll_literalMutation1872");
        final SortedSet<E> set = makeTestSet();
        final Set<E> elements = new TreeSet<E>();
        elements.add(((E)("Aone")));
        elements.add(((E)("Atwo")));
        elements.add(((E)("Bthree")));
        elements.add(((E)("foo")));
        try {
            set.addAll(elements);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6283,!(set.contains("Aone")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6284,!(set.contains("Atwo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6285,!(set.contains("Bthree")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6286,!(set.contains("Afour")));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator");
        final SortedSet<E> set = makeTestSet();
        final Comparator<? super E> c = set.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6280,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

