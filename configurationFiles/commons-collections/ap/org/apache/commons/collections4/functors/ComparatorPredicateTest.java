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

    @Test(timeout = 1000)
    public void compareEquals_add1228() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareEquals_add1228");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>());
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareEquals_add1229() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareEquals_add1229");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>());
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareEquals_add1230() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareEquals_add1230");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>());
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
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
        assertFalse(p, Integer.valueOf(((value.intValue()) - 2)));
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

    @Test(timeout = 1000)
    public void compareEquals_remove901() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareEquals_remove901");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>());
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareEquals_remove902() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareEquals_remove902");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>());
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareEquals_remove903() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareEquals_remove903");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>());
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareGreater_add1231() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreater_add1231");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareGreater_add1232() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreater_add1232");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareGreater_add1233() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreater_add1233");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareGreater() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreater");
        final Integer value = Integer.valueOf(9);
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
        assertTrue(p, Integer.valueOf(((value.intValue()) - 2)));
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
        assertFalse(p, Integer.valueOf(((value.intValue()) + 0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareGreater_remove904() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreater_remove904");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER);
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareGreater_remove905() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreater_remove905");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareGreater_remove906() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreater_remove906");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareLess_add1237() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLess_add1237");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareLess_add1238() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLess_add1238");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareLess_add1239() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLess_add1239");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
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
        assertFalse(p, Integer.valueOf(((value.intValue()) - 2)));
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
        assertTrue(p, Integer.valueOf(((value.intValue()) + 0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareLess_remove910() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLess_remove910");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS);
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareLess_remove911() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLess_remove911");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS);
        assertFalse(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareLess_remove912() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLess_remove912");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(value.intValue()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareGreaterOrEqual() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreaterOrEqual");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER_OR_EQUAL);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareGreaterOrEqual_add1234() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreaterOrEqual_add1234");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER_OR_EQUAL);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareGreaterOrEqual_add1235() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreaterOrEqual_add1235");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER_OR_EQUAL);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareGreaterOrEqual_add1236() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreaterOrEqual_add1236");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER_OR_EQUAL);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test
    public void compareGreaterOrEqual_literalMutation1184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreaterOrEqual_literalMutation1184");
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
        assertTrue(p, Integer.valueOf(((value.intValue()) - 0)));
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

    @Test(timeout = 1000)
    public void compareGreaterOrEqual_remove907() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreaterOrEqual_remove907");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER_OR_EQUAL);
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareGreaterOrEqual_remove908() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreaterOrEqual_remove908");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER_OR_EQUAL);
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertFalse(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareGreaterOrEqual_remove909() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareGreaterOrEqual_remove909");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.GREATER_OR_EQUAL);
        assertTrue(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareLessOrEqual_add1240() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLessOrEqual_add1240");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS_OR_EQUAL);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareLessOrEqual_add1241() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLessOrEqual_add1241");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS_OR_EQUAL);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareLessOrEqual_add1242() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLessOrEqual_add1242");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS_OR_EQUAL);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
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
        assertTrue(p, Integer.valueOf(((value.intValue()) + 0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareLessOrEqual_remove913() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLessOrEqual_remove913");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS_OR_EQUAL);
        assertTrue(p, Integer.valueOf(value.intValue()));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareLessOrEqual_remove914() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLessOrEqual_remove914");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS_OR_EQUAL);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void compareLessOrEqual_remove915() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "compareLessOrEqual_remove915");
        final Integer value = Integer.valueOf(10);
        final Predicate<java.lang.Integer> p = org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(value, new TestComparator<java.lang.Integer>(), org.apache.commons.collections4.functors.ComparatorPredicate.Criterion.LESS_OR_EQUAL);
        assertFalse(p, Integer.valueOf(((value.intValue()) - 1)));
        assertTrue(p, Integer.valueOf(((value.intValue()) + 1)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    protected Predicate<?> generatePredicate() {
        return org.apache.commons.collections4.functors.ComparatorPredicate.comparatorPredicate(Integer.valueOf(10), new TestComparator<java.lang.Integer>());
    }
}

