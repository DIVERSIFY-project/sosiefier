package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import org.apache.commons.collections4.BoundedCollection;
import java.util.Collection;

/** 
 * Extension of {@link AbstractCollectionTest} for exercising the
 * {@link UnmodifiableBoundedCollection} implementation.
 * 
 * @version $Id$
 */
public class UnmodifiableBoundedCollectionTest<E> extends AbstractCollectionTest<E> {
    public UnmodifiableBoundedCollectionTest(final String testName) {
        super(testName);
    }

    @Override
    public Collection<E> makeObject() {
        final BoundedCollection<E> coll = org.apache.commons.collections4.list.FixedSizeList.<E>fixedSizeList(new ArrayList<E>());
        return org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(coll);
    }

    @Override
    public BoundedCollection<E> makeFullCollection() {
        final E[] allElements = getFullElements();
        final BoundedCollection<E> coll = org.apache.commons.collections4.list.FixedSizeList.<E>fixedSizeList(new ArrayList<E>(java.util.Arrays.asList(allElements)));
        return org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(coll);
    }

    @Override
    public Collection<E> makeConfirmedCollection() {
        return new ArrayList<E>();
    }

    @Override
    public Collection<E> makeConfirmedFullCollection() {
        final ArrayList<E> list = new ArrayList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return list;
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
    protected boolean skipSerializedCanonicalTests() {
        return true;
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4802,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4803,((makeFullCollection()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final BoundedCollection<E> coll = makeFullCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4799,coll);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4801,null,4800,org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(coll));
        try {
            org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

