package org.apache.commons.collections4.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import junit.framework.Test;
import java.util.TreeSet;

/** 
 * Extension of {@link AbstractSortedSetTest} for exercising the
 * {@link UnmodifiableSortedSet} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class UnmodifiableSortedSetTest<E> extends AbstractSortedSetTest<E> {
    protected UnmodifiableSortedSet<E> set = null;

    protected ArrayList<E> array = null;

    public UnmodifiableSortedSetTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(UnmodifiableSortedSetTest.class);
    }

    @Override
    public SortedSet<E> makeObject() {
        return UnmodifiableSortedSet.unmodifiableSortedSet(new TreeSet<E>());
    }

    @Override
    public UnmodifiableSortedSet<E> makeFullCollection() {
        final TreeSet<E> set = new TreeSet<E>();
        set.addAll(java.util.Arrays.asList(getFullElements()));
        return ((UnmodifiableSortedSet<E>)(UnmodifiableSortedSet.unmodifiableSortedSet(set)));
    }

    @Override
    public boolean isAddSupported() {
        return false;
    }

    @Override
    public boolean isRemoveSupported() {
        return false;
    }

    @SuppressWarnings(value = "unchecked")
    protected void setupSet() {
        set = makeFullCollection();
        array = new ArrayList<E>();
        array.add(((E)(java.lang.Integer.valueOf(1))));
    }

    /** 
     * Verify that base set and subsets are not modifiable
     */
@SuppressWarnings(value = "unchecked")
    public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        setupSet();
        verifyUnmodifiable(set);
        verifyUnmodifiable(set.headSet(((E)(java.lang.Integer.valueOf(1)))));
        verifyUnmodifiable(set.tailSet(((E)(java.lang.Integer.valueOf(1)))));
        verifyUnmodifiable(set.subSet(((E)(java.lang.Integer.valueOf(1))), ((E)(java.lang.Integer.valueOf(3)))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that base set and subsets are not modifiable
     */
@SuppressWarnings(value = "unchecked")
    public void testUnmodifiable_literalMutation1907() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable_literalMutation1907");
        setupSet();
        verifyUnmodifiable(set);
        verifyUnmodifiable(set.headSet(((E)(java.lang.Integer.valueOf(1)))));
        verifyUnmodifiable(set.tailSet(((E)(java.lang.Integer.valueOf(1)))));
        verifyUnmodifiable(set.subSet(((E)(java.lang.Integer.valueOf(1))), ((E)(java.lang.Integer.valueOf(3)))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that base set and subsets are not modifiable
     */
@SuppressWarnings(value = "unchecked")
    public void testUnmodifiable_literalMutation1908() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable_literalMutation1908");
        setupSet();
        verifyUnmodifiable(set);
        verifyUnmodifiable(set.headSet(((E)(java.lang.Integer.valueOf(0)))));
        verifyUnmodifiable(set.tailSet(((E)(java.lang.Integer.valueOf(1)))));
        verifyUnmodifiable(set.subSet(((E)(java.lang.Integer.valueOf(1))), ((E)(java.lang.Integer.valueOf(3)))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that base set and subsets are not modifiable
     */
@SuppressWarnings(value = "unchecked")
    public void testUnmodifiable_literalMutation1909() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable_literalMutation1909");
        setupSet();
        verifyUnmodifiable(set);
        verifyUnmodifiable(set.headSet(((E)(java.lang.Integer.valueOf(1)))));
        verifyUnmodifiable(set.tailSet(((E)(java.lang.Integer.valueOf(0)))));
        verifyUnmodifiable(set.subSet(((E)(java.lang.Integer.valueOf(1))), ((E)(java.lang.Integer.valueOf(3)))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that base set and subsets are not modifiable
     */
@SuppressWarnings(value = "unchecked")
    public void testUnmodifiable_literalMutation1910() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable_literalMutation1910");
        setupSet();
        verifyUnmodifiable(set);
        verifyUnmodifiable(set.headSet(((E)(java.lang.Integer.valueOf(1)))));
        verifyUnmodifiable(set.tailSet(((E)(java.lang.Integer.valueOf(1)))));
        verifyUnmodifiable(set.subSet(((E)(java.lang.Integer.valueOf(0))), ((E)(java.lang.Integer.valueOf(3)))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verify that base set and subsets are not modifiable
     */
@SuppressWarnings(value = "unchecked")
    public void testUnmodifiable_literalMutation1911() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable_literalMutation1911");
        setupSet();
        verifyUnmodifiable(set);
        verifyUnmodifiable(set.headSet(((E)(java.lang.Integer.valueOf(1)))));
        verifyUnmodifiable(set.tailSet(((E)(java.lang.Integer.valueOf(1)))));
        verifyUnmodifiable(set.subSet(((E)(java.lang.Integer.valueOf(1))), ((E)(java.lang.Integer.valueOf(4)))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final SortedSet<E> set = makeFullCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6330,set);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6332,null,6331,org.apache.commons.collections4.set.UnmodifiableSortedSet.unmodifiableSortedSet(set));
        try {
            UnmodifiableSortedSet.unmodifiableSortedSet(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verifies that a set is not modifiable
     */
@SuppressWarnings(value = "unchecked")
    public void verifyUnmodifiable(final Set<E> set) {
        try {
            set.add(((E)("value")));
        } catch (final UnsupportedOperationException e) {
        }
        try {
            set.addAll(new TreeSet<E>());
        } catch (final UnsupportedOperationException e) {
        }
        try {
            set.clear();
        } catch (final UnsupportedOperationException e) {
        }
        try {
            set.remove("x");
        } catch (final UnsupportedOperationException e) {
        }
        try {
            set.removeAll(array);
        } catch (final UnsupportedOperationException e) {
        }
        try {
            set.retainAll(array);
        } catch (final UnsupportedOperationException e) {
        }
    }

    public void testComparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator");
        setupSet();
        final Comparator<? super E> c = set.comparator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6329,(c == null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

