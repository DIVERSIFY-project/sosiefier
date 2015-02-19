package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.SortedBag;
import junit.framework.Test;

/** 
 * Extension of {@link AbstractSortedBagTest} for exercising the {@link TransformedSortedBag}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class TransformedSortedBagTest<T> extends AbstractSortedBagTest<T> {
    public TransformedSortedBagTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(TransformedSortedBagTest.class);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public SortedBag<T> makeObject() {
        return org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.NOOP_TRANSFORMER)));
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag");
        final SortedBag<T> bag = org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5827,bag,5826,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5828,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5830,bag,5829,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5832,bag,5831,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5851,bag,5850,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testTransformedBag_add1790() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_add1790");
        final SortedBag<T> bag = org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5827,bag,5826,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5828,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5830,bag,5829,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5832,bag,5831,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5851,bag,5850,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1631() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1631");
        final SortedBag<T> bag = org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5827,bag,5826,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5828,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5830,bag,5829,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5832,bag,5831,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5851,bag,5850,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1632() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1632");
        final SortedBag<T> bag = org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5827,bag,5826,bag.size());
        final Object[] els = new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5828,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5830,bag,5829,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5832,bag,5831,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5851,bag,5850,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1633() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1633");
        final SortedBag<T> bag = org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5827,bag,5826,bag.size());
        final Object[] els = new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5828,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5830,bag,5829,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5832,bag,5831,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5851,bag,5850,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1634() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1634");
        final SortedBag<T> bag = org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5827,bag,5826,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5828,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5830,bag,5829,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5832,bag,5831,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5851,bag,5850,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1635() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1635");
        final SortedBag<T> bag = org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5827,bag,5826,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5828,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5830,bag,5829,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5832,bag,5831,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5851,bag,5850,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1636() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1636");
        final SortedBag<T> bag = org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5827,bag,5826,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5828,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5830,bag,5829,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5832,bag,5831,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5851,bag,5850,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1637() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1637");
        final SortedBag<T> bag = org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5827,bag,5826,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5828,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5830,bag,5829,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5832,bag,5831,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5851,bag,5850,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1638() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1638");
        final SortedBag<T> bag = org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5827,bag,5826,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" };
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5828,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5830,bag,5829,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5832,bag,5831,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5851,bag,5850,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testTransformedBag_literalMutation1639() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_literalMutation1639");
        final SortedBag<T> bag = org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5827,bag,5826,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = -1 ; i < (els.length) ; i++) {
            bag.add(((T)(els[i])));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5828,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5830,bag,5829,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5832,bag,5831,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5851,bag,5850,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @org.junit.Test(timeout = 1000)
    public void testTransformedBag_remove1370() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_remove1370");
        final SortedBag<T> bag = org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(new TreeBag<T>(), ((org.apache.commons.collections4.Transformer<T, T>)(org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5827,bag,5826,bag.size());
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (int i = 0 ; i < (els.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5828,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5830,bag,5829,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5832,bag,5831,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(els[i])))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5851,bag,5850,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedBag_decorateTransform() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform");
        final Bag<java.lang.Object> originalBag = new TreeBag<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(el);
        }
        final Bag<?> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,bag,5853,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5858,bag,5857,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testTransformedBag_decorateTransform_add1791() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_add1791");
        final Bag<java.lang.Object> originalBag = new TreeBag<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(el);
            originalBag.add(el);
        }
        final Bag<?> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,bag,5853,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5858,bag,5857,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedBag_decorateTransform_literalMutation1640() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1640");
        final Bag<java.lang.Object> originalBag = new TreeBag<java.lang.Object>();
        final Object[] els = new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(el);
        }
        final Bag<?> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,bag,5853,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5858,bag,5857,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedBag_decorateTransform_literalMutation1641() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1641");
        final Bag<java.lang.Object> originalBag = new TreeBag<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(el);
        }
        final Bag<?> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,bag,5853,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5858,bag,5857,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedBag_decorateTransform_literalMutation1642() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1642");
        final Bag<java.lang.Object> originalBag = new TreeBag<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(el);
        }
        final Bag<?> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,bag,5853,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5858,bag,5857,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedBag_decorateTransform_literalMutation1643() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1643");
        final Bag<java.lang.Object> originalBag = new TreeBag<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(el);
        }
        final Bag<?> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,bag,5853,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5858,bag,5857,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedBag_decorateTransform_literalMutation1644() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1644");
        final Bag<java.lang.Object> originalBag = new TreeBag<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "6" };
        for (final Object el : els) {
            originalBag.add(el);
        }
        final Bag<?> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,bag,5853,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5858,bag,5857,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedBag_decorateTransform_literalMutation1645() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1645");
        final Bag<java.lang.Object> originalBag = new TreeBag<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "6" };
        for (final Object el : els) {
            originalBag.add(el);
        }
        final Bag<?> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,bag,5853,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5858,bag,5857,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedBag_decorateTransform_literalMutation1646() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_literalMutation1646");
        final Bag<java.lang.Object> originalBag = new TreeBag<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" };
        for (final Object el : els) {
            originalBag.add(el);
        }
        final Bag<?> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,bag,5853,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5858,bag,5857,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testTransformedBag_decorateTransform_remove1371() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_decorateTransform_remove1371");
        final Bag<java.lang.Object> originalBag = new TreeBag<java.lang.Object>();
        final Object[] els = new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "6" };
        for (final Object el : els) {
        }
        final Bag<?> bag = org.apache.commons.collections4.bag.TransformedBag.transformedBag(originalBag, org.apache.commons.collections4.collection.TransformedCollectionTest.STRING_TO_INTEGER_TRANSFORMER);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,els.length);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,bag,5853,bag.size());
        for (final Object el : els) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.contains(java.lang.Integer.valueOf(((java.lang.String)(el)))));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5858,bag,5857,bag.remove(java.lang.Integer.valueOf(((java.lang.String)(els[0])))));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

