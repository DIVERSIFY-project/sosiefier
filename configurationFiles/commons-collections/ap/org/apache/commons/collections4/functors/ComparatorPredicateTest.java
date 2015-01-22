package org.apache.commons.collections4.functors;

import java.util.Comparator;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class ComparatorPredicateTest extends AbstractPredicateTest {
    private class TestComparator<T extends java.lang.Comparable<T>> implements Comparator<T> {
        public int compare(final T first, final T second) {
            return first.compareTo(second);
        }
    }

    @Test
    public void compareEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareEquals");
        final Integer value = Integer.valueOf(9);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>());
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareEquals_literalMutation1179() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareEquals_literalMutation1179");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>());
        assertFalse(p, Integer.valueOf(((value.intValue()) - 0)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareEquals_literalMutation1180() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareEquals_literalMutation1180");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>());
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareGreater() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreater");
        final Integer value = Integer.valueOf(11);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareGreater_literalMutation1182() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreater_literalMutation1182");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 0)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareGreater_literalMutation1183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreater_literalMutation1183");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareLess() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLess");
        final Integer value = Integer.valueOf(11);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareLess_literalMutation1188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLess_literalMutation1188");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 0)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareLess_literalMutation1189() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLess_literalMutation1189");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareGreaterOrEqual() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreaterOrEqual");
        final Integer value = Integer.valueOf(9);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER_OR_EQUAL);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareGreaterOrEqual_literalMutation1185() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreaterOrEqual_literalMutation1185");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER_OR_EQUAL);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 2)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareGreaterOrEqual_literalMutation1186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreaterOrEqual_literalMutation1186");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER_OR_EQUAL);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareLessOrEqual() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLessOrEqual");
        final Integer value = Integer.valueOf(11);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS_OR_EQUAL);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareLessOrEqual_literalMutation1191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLessOrEqual_literalMutation1191");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS_OR_EQUAL);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 0)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareLessOrEqual_literalMutation1192() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLessOrEqual_literalMutation1192");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS_OR_EQUAL);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    protected Predicate<?> generatePredicate() {
        return org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(Integer.valueOf(10), new TestComparator<java.lang.Integer>());
    }
}

