package org.apache.commons.collections4;

import junit.framework.Test;

/** 
 * Tests for BagUtils factory methods.
 * 
 * @version $Id$
 */
public class BagUtilsTest extends BulkTest {
    public BagUtilsTest(final String name) {
        super(name);
    }

    public static Test suite() {
        return BulkTest.makeSuite(BagUtilsTest.class);
    }

    protected Class<?> stringClass = getName().getClass();

    protected Predicate<java.lang.Object> truePredicate = org.apache.commons.collections4.functors.TruePredicate.truePredicate();

    protected Transformer<java.lang.Object, java.lang.Object> nopTransformer = org.apache.commons.collections4.TransformerUtils.nopTransformer();

    public void testSynchronizedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSynchronizedBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.synchronizedBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6484,(bag instanceof org.apache.commons.collections4.bag.SynchronizedBag));
        try {
            org.apache.commons.collections4.BagUtils.synchronizedBag(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnmodifiableBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.unmodifiableBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6488,(bag instanceof org.apache.commons.collections4.bag.UnmodifiableBag));
        try {
            org.apache.commons.collections4.BagUtils.unmodifiableBag(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6489,bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6491,null,6490,org.apache.commons.collections4.BagUtils.unmodifiableBag(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPredicatedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.predicatedBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), truePredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6482,(bag instanceof org.apache.commons.collections4.bag.PredicatedBag));
        try {
            org.apache.commons.collections4.BagUtils.predicatedBag(null, truePredicate);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.BagUtils.predicatedBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.transformingBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), nopTransformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6486,(bag instanceof org.apache.commons.collections4.bag.TransformedBag));
        try {
            org.apache.commons.collections4.BagUtils.transformingBag(null, nopTransformer);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.BagUtils.transformingBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSynchronizedSortedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSynchronizedSortedBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6485,(bag instanceof org.apache.commons.collections4.bag.SynchronizedSortedBag));
        try {
            org.apache.commons.collections4.BagUtils.synchronizedSortedBag(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testUnmodifiableSortedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableSortedBag");
        SortedBag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6492,(bag instanceof org.apache.commons.collections4.bag.UnmodifiableSortedBag));
        try {
            org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6493,bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6495,null,6494,org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPredicatedSortedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedSortedBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.predicatedSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), truePredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6483,(bag instanceof org.apache.commons.collections4.bag.PredicatedSortedBag));
        try {
            org.apache.commons.collections4.BagUtils.predicatedSortedBag(null, truePredicate);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.BagUtils.predicatedSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedSortedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSortedBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.transformingSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), nopTransformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6487,(bag instanceof org.apache.commons.collections4.bag.TransformedSortedBag));
        try {
            org.apache.commons.collections4.BagUtils.transformingSortedBag(null, nopTransformer);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.BagUtils.transformingSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

