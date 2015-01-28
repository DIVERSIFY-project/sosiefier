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

    @org.junit.Test(timeout = 1000)
    public void testSynchronizedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSynchronizedBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.synchronizedBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6445,(bag instanceof org.apache.commons.collections4.bag.SynchronizedBag));
        try {
            org.apache.commons.collections4.BagUtils.synchronizedBag(null);
            org.apache.commons.collections4.BagUtils.synchronizedBag(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testUnmodifiableBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.unmodifiableBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6449,(bag instanceof org.apache.commons.collections4.bag.UnmodifiableBag));
        try {
            org.apache.commons.collections4.BagUtils.unmodifiableBag(null);
            org.apache.commons.collections4.BagUtils.unmodifiableBag(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6450,bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6452,null,6451,org.apache.commons.collections4.BagUtils.unmodifiableBag(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testPredicatedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.predicatedBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), truePredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6443,(bag instanceof org.apache.commons.collections4.bag.PredicatedBag));
        try {
            org.apache.commons.collections4.BagUtils.predicatedBag(null, truePredicate);
            org.apache.commons.collections4.BagUtils.predicatedBag(null, truePredicate);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.BagUtils.predicatedBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testPredicatedBag_add2049() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedBag_add2049");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.predicatedBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), truePredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6443,(bag instanceof org.apache.commons.collections4.bag.PredicatedBag));
        try {
            org.apache.commons.collections4.BagUtils.predicatedBag(null, truePredicate);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.BagUtils.predicatedBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), null);
            org.apache.commons.collections4.BagUtils.predicatedBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testTransformedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.transformingBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), nopTransformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6447,(bag instanceof org.apache.commons.collections4.bag.TransformedBag));
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

    @org.junit.Test(timeout = 1000)
    public void testTransformedBag_add2054() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_add2054");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.transformingBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), nopTransformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6447,(bag instanceof org.apache.commons.collections4.bag.TransformedBag));
        try {
            org.apache.commons.collections4.BagUtils.transformingBag(null, nopTransformer);
            org.apache.commons.collections4.BagUtils.transformingBag(null, nopTransformer);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.BagUtils.transformingBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testTransformedBag_add2055() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedBag_add2055");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.transformingBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), nopTransformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6447,(bag instanceof org.apache.commons.collections4.bag.TransformedBag));
        try {
            org.apache.commons.collections4.BagUtils.transformingBag(null, nopTransformer);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.BagUtils.transformingBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), null);
            org.apache.commons.collections4.BagUtils.transformingBag(new org.apache.commons.collections4.bag.HashBag<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSynchronizedSortedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSynchronizedSortedBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6446,(bag instanceof org.apache.commons.collections4.bag.SynchronizedSortedBag));
        try {
            org.apache.commons.collections4.BagUtils.synchronizedSortedBag(null);
            org.apache.commons.collections4.BagUtils.synchronizedSortedBag(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testUnmodifiableSortedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiableSortedBag");
        SortedBag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6453,(bag instanceof org.apache.commons.collections4.bag.UnmodifiableSortedBag));
        try {
            org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(null);
            org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6454,bag);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6456,null,6455,org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testPredicatedSortedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedSortedBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.predicatedSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), truePredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6444,(bag instanceof org.apache.commons.collections4.bag.PredicatedSortedBag));
        try {
            org.apache.commons.collections4.BagUtils.predicatedSortedBag(null, truePredicate);
            org.apache.commons.collections4.BagUtils.predicatedSortedBag(null, truePredicate);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.BagUtils.predicatedSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testPredicatedSortedBag_add2051() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedSortedBag_add2051");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.predicatedSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), truePredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6444,(bag instanceof org.apache.commons.collections4.bag.PredicatedSortedBag));
        try {
            org.apache.commons.collections4.BagUtils.predicatedSortedBag(null, truePredicate);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.BagUtils.predicatedSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), null);
            org.apache.commons.collections4.BagUtils.predicatedSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testTransformedSortedBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSortedBag");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.transformingSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), nopTransformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6448,(bag instanceof org.apache.commons.collections4.bag.TransformedSortedBag));
        try {
            org.apache.commons.collections4.BagUtils.transformingSortedBag(null, nopTransformer);
            org.apache.commons.collections4.BagUtils.transformingSortedBag(null, nopTransformer);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.BagUtils.transformingSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testTransformedSortedBag_add2057() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testTransformedSortedBag_add2057");
        Bag<java.lang.Object> bag = org.apache.commons.collections4.BagUtils.transformingSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), nopTransformer);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6448,(bag instanceof org.apache.commons.collections4.bag.TransformedSortedBag));
        try {
            org.apache.commons.collections4.BagUtils.transformingSortedBag(null, nopTransformer);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.BagUtils.transformingSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), null);
            org.apache.commons.collections4.BagUtils.transformingSortedBag(new org.apache.commons.collections4.bag.TreeBag<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

