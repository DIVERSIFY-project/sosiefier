package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.SortedBag;
import junit.framework.Test;

/** 
 * Extension of {@link AbstractCollectionTest} for exercising the
 * {@link UnmodifiableSortedBag} implementation.
 * 
 * @version $Id$
 * @since 4.0
 */
public class UnmodifiableSortedBagTest<E> extends AbstractSortedBagTest<E> {
    public UnmodifiableSortedBagTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(UnmodifiableSortedBagTest.class);
    }

    @Override
    public SortedBag<E> makeObject() {
        return org.apache.commons.collections4.bag.UnmodifiableSortedBag.unmodifiableSortedBag(new TreeBag<E>());
    }

    @Override
    public SortedBag<E> makeFullCollection() {
        final SortedBag<E> bag = new TreeBag<E>();
        bag.addAll(java.util.Arrays.asList(getFullElements()));
        return org.apache.commons.collections4.bag.UnmodifiableSortedBag.unmodifiableSortedBag(bag);
    }

    @Override
    public SortedBag<E> getCollection() {
        return super.getCollection();
    }

    @Override
    public boolean isAddSupported() {
        return false;
    }

    @Override
    public boolean isRemoveSupported() {
        return false;
    }

    @Override
    public boolean isNullSupported() {
        return false;
    }

    public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5908,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5909,((makeFullCollection()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final SortedBag<E> queue = makeFullCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5905,queue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5911,null,5910,org.apache.commons.collections4.bag.UnmodifiableSortedBag.unmodifiableSortedBag(queue));
        try {
            org.apache.commons.collections4.bag.UnmodifiableSortedBag.unmodifiableSortedBag(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

