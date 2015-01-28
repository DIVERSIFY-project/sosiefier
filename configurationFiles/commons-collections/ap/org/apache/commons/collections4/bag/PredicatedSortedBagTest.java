package org.apache.commons.collections4.bag;

import java.util.Comparator;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.SortedBag;
import junit.framework.Test;

/** 
 * Extension of {@link AbstractSortedBagTest} for exercising the {@link PredicatedSortedBag}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class PredicatedSortedBagTest<T> extends AbstractSortedBagTest<T> {
    private final SortedBag<T> nullBag = null;

    public PredicatedSortedBagTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(PredicatedSortedBagTest.class);
    }

    protected Predicate<T> stringPredicate() {
        return new Predicate<T>() {
            public boolean evaluate(final T o) {
                return o instanceof String;
            }
        };
    }

    protected Predicate<T> truePredicate = org.apache.commons.collections4.functors.TruePredicate.<T>truePredicate();

    protected SortedBag<T> decorateBag(final SortedBag<T> bag, final Predicate<T> predicate) {
        return PredicatedSortedBag.predicatedSortedBag(bag, predicate);
    }

    @Override
    public SortedBag<T> makeObject() {
        return decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), truePredicate);
    }

    protected SortedBag<T> makeTestBag() {
        return decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecorate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorate");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        ((PredicatedSortedBag<T>)(bag)).decorated();
        ((PredicatedSortedBag<T>)(bag)).decorated();
        try {
            decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(nullBag, stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecorate_add1783() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorate_add1783");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        ((PredicatedSortedBag<T>)(bag)).decorated();
        try {
            decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), null);
            decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(nullBag, stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecorate_add1784() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorate_add1784");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        ((PredicatedSortedBag<T>)(bag)).decorated();
        try {
            decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(nullBag, stringPredicate());
            decorateBag(nullBag, stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecorate_remove1364() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorate_remove1364");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        try {
            decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(nullBag, stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        final String one = "one";
        final String two = "two";
        final String three = "three";
        bag.add(((T)(one)));
        bag.add(((T)(two)));
        bag.add(((T)(three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5820,bag,5819,bag.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5821,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5823,bag,5822,bag.last());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5824,two);
        final Comparator<? super T> c = bag.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5825,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testSortOrder_add1785() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_add1785");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        final String one = "one";
        final String two = "two";
        final String three = "three";
        bag.add(((T)(one)));
        bag.add(((T)(one)));
        bag.add(((T)(two)));
        bag.add(((T)(three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5820,bag,5819,bag.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5821,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5823,bag,5822,bag.last());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5824,two);
        final Comparator<? super T> c = bag.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5825,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testSortOrder_add1786() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_add1786");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        final String one = "one";
        final String two = "two";
        final String three = "three";
        bag.add(((T)(one)));
        bag.add(((T)(two)));
        bag.add(((T)(two)));
        bag.add(((T)(three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5820,bag,5819,bag.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5821,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5823,bag,5822,bag.last());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5824,two);
        final Comparator<? super T> c = bag.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5825,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testSortOrder_add1787() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_add1787");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        final String one = "one";
        final String two = "two";
        final String three = "three";
        bag.add(((T)(one)));
        bag.add(((T)(two)));
        bag.add(((T)(three)));
        bag.add(((T)(three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5820,bag,5819,bag.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5821,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5823,bag,5822,bag.last());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5824,two);
        final Comparator<? super T> c = bag.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5825,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation1610() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation1610");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        final String one = "one";
        final String two = "two";
        final String three = "three";
        bag.add(((T)(one)));
        bag.add(((T)(two)));
        bag.add(((T)(three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5820,bag,5819,bag.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5821,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5823,bag,5822,bag.last());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5824,two);
        final Comparator<? super T> c = bag.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5825,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation1611() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation1611");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        final String one = "foo";
        final String two = "two";
        final String three = "three";
        bag.add(((T)(one)));
        bag.add(((T)(two)));
        bag.add(((T)(three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5820,bag,5819,bag.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5821,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5823,bag,5822,bag.last());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5824,two);
        final Comparator<? super T> c = bag.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5825,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation1612() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation1612");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        final String one = "one";
        final String two = "foo";
        final String three = "three";
        bag.add(((T)(one)));
        bag.add(((T)(two)));
        bag.add(((T)(three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5820,bag,5819,bag.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5821,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5823,bag,5822,bag.last());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5824,two);
        final Comparator<? super T> c = bag.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5825,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSortOrder_literalMutation1613() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_literalMutation1613");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        final String one = "one";
        final String two = "two";
        final String three = "foo";
        bag.add(((T)(one)));
        bag.add(((T)(two)));
        bag.add(((T)(three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5820,bag,5819,bag.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5821,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5823,bag,5822,bag.last());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5824,two);
        final Comparator<? super T> c = bag.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5825,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testSortOrder_remove1365() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_remove1365");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        final String one = "one";
        final String two = "two";
        final String three = "three";
        bag.add(((T)(two)));
        bag.add(((T)(three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5820,bag,5819,bag.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5821,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5823,bag,5822,bag.last());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5824,two);
        final Comparator<? super T> c = bag.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5825,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testSortOrder_remove1366() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_remove1366");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        final String one = "one";
        final String two = "two";
        final String three = "three";
        bag.add(((T)(two)));
        bag.add(((T)(three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5820,bag,5819,bag.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5821,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5823,bag,5822,bag.last());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5824,two);
        final Comparator<? super T> c = bag.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5825,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testSortOrder_remove1367() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_remove1367");
        final SortedBag<T> bag = decorateBag(new org.apache.commons.collections4.bag.TreeBag<T>(), stringPredicate());
        final String one = "one";
        final String two = "two";
        final String three = "three";
        bag.add(((T)(two)));
        bag.add(((T)(three)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5820,bag,5819,bag.first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5821,one);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5823,bag,5822,bag.last());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5824,two);
        final Comparator<? super T> c = bag.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5825,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

