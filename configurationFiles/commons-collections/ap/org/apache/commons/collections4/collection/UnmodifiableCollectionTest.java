package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

/** 
 * Extension of {@link AbstractCollectionTest} for exercising the
 * {@link UnmodifiableCollection} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class UnmodifiableCollectionTest<E> extends AbstractCollectionTest<E> {
    public UnmodifiableCollectionTest(final String testName) {
        super(testName);
    }

    @Override
    public Collection<E> makeObject() {
        return org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(new ArrayList<E>());
    }

    @Override
    public Collection<E> makeFullCollection() {
        final List<E> list = new ArrayList<E>();
        list.addAll(java.util.Arrays.asList(getFullElements()));
        return org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(list);
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

    public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4815,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4816,((makeFullCollection()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final Collection<E> coll = makeFullCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4812,coll);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4814,null,4813,org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(coll));
        try {
            org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecorateFactory_add1553() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory_add1553");
        final Collection<E> coll = makeFullCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4812,coll);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4814,null,4813,org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(coll));
        try {
            org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(null);
            org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

