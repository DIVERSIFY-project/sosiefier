package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.Bag;
import junit.framework.Test;

/** 
 * Extension of {@link AbstractCollectionTest} for exercising the
 * {@link UnmodifiableBag} implementation.
 * 
 * @version $Id$
 * @since 4.0
 */
public class UnmodifiableBagTest<E> extends AbstractBagTest<E> {
    public UnmodifiableBagTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(UnmodifiableBagTest.class);
    }

    @Override
    public Bag<E> makeObject() {
        return org.apache.commons.collections4.bag.UnmodifiableBag.unmodifiableBag(new HashBag<E>());
    }

    @Override
    public Bag<E> makeFullCollection() {
        final Bag<E> bag = new HashBag<E>();
        bag.addAll(java.util.Arrays.asList(getFullElements()));
        return org.apache.commons.collections4.bag.UnmodifiableBag.unmodifiableBag(bag);
    }

    @Override
    public Bag<E> getCollection() {
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5869,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5870,((makeFullCollection()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final Bag<E> queue = makeFullCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5866,queue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5868,null,5867,org.apache.commons.collections4.bag.UnmodifiableBag.unmodifiableBag(queue));
        try {
            org.apache.commons.collections4.bag.UnmodifiableBag.unmodifiableBag(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecorateFactory_add1793() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory_add1793");
        final Bag<E> queue = makeFullCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5866,queue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5868,null,5867,org.apache.commons.collections4.bag.UnmodifiableBag.unmodifiableBag(queue));
        try {
            org.apache.commons.collections4.bag.UnmodifiableBag.unmodifiableBag(null);
            org.apache.commons.collections4.bag.UnmodifiableBag.unmodifiableBag(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

