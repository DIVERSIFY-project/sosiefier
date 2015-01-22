package org.apache.commons.collections4.set;

import java.util.Set;
import java.util.SortedSet;
import junit.framework.Test;
import java.util.TreeSet;

/** 
 * Extension of {@link AbstractSortedSetTest} for exercising the {@link TransformedSortedSet}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class TransformedSortedSetTest<E> extends AbstractSortedSetTest<E> {
    public TransformedSortedSetTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(TransformedSortedSetTest.class);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public SortedSet<E> makeObject() {
        return org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(new TreeSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.NOOP_TRANSFORMER)));
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public SortedSet<E> makeFullCollection() {
        final SortedSet<E> set = new TreeSet<E>();
        set.addAll(java.util.Arrays.asList(getFullElements()));
        return org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(set, ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.NOOP_TRANSFORMER)));
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet");
        final SortedSet<E> set = org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(new TreeSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6309,set,6308,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,set,6311,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,set,6313,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,set,6315,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1889() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1889");
        final SortedSet<E> set = org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(new TreeSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6309,set,6308,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,set,6311,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,set,6313,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,set,6315,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1890() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1890");
        final SortedSet<E> set = org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(new TreeSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6309,set,6308,set.size());
        final E[] els = ((E[])(new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,set,6311,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,set,6313,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,set,6315,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1891() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1891");
        final SortedSet<E> set = org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(new TreeSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6309,set,6308,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,set,6311,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,set,6313,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,set,6315,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1892() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1892");
        final SortedSet<E> set = org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(new TreeSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6309,set,6308,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,set,6311,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,set,6313,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,set,6315,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1893() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1893");
        final SortedSet<E> set = org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(new TreeSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6309,set,6308,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,set,6311,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,set,6313,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,set,6315,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1894() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1894");
        final SortedSet<E> set = org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(new TreeSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6309,set,6308,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,set,6311,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,set,6313,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,set,6315,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1895() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1895");
        final SortedSet<E> set = org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(new TreeSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6309,set,6308,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,set,6311,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,set,6313,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,set,6315,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1896() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1896");
        final SortedSet<E> set = org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(new TreeSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6309,set,6308,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,set,6311,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,set,6313,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,set,6315,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedSet_literalMutation1897() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_literalMutation1897");
        final SortedSet<E> set = org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(new TreeSet<E>(), ((org.apache.commons.collections4.Transformer<E, E>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6309,set,6308,set.size());
        final E[] els = ((E[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" }));
        for (int i = -1 ; i < (els.length) ; i++) {
            set.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6310,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6312,set,6311,set.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6314,set,6313,set.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6316,set,6315,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform");
        final Set<java.lang.Object> originalSet = new TreeSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6317,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,set,6318,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,set,6320,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,set,6322,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1898() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1898");
        final Set<java.lang.Object> originalSet = new TreeSet<java.lang.Object>();
        final Object[] els = new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6317,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,set,6318,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,set,6320,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,set,6322,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1899() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1899");
        final Set<java.lang.Object> originalSet = new TreeSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6317,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,set,6318,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,set,6320,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,set,6322,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1900() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1900");
        final Set<java.lang.Object> originalSet = new TreeSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6317,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,set,6318,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,set,6320,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,set,6322,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1901() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1901");
        final Set<java.lang.Object> originalSet = new TreeSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6317,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,set,6318,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,set,6320,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,set,6322,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1902() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1902");
        final Set<java.lang.Object> originalSet = new TreeSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6317,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,set,6318,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,set,6320,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,set,6322,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1903() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1903");
        final Set<java.lang.Object> originalSet = new TreeSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6317,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,set,6318,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,set,6320,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,set,6322,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSet_decorateTransform_literalMutation1904() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSet_decorateTransform_literalMutation1904");
        final Set<java.lang.Object> originalSet = new TreeSet<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" };
        java.util.Collections.addAll(originalSet, els);
        final Set<?> set = org.apache.commons.collections4.set.TransformedSet.transformedSet(originalSet, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6317,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6319,set,6318,set.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6321,set,6320,set.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6323,set,6322,set.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

