package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4807,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4808,((makeFullCollection()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final Collection<E> coll = makeFullCollection();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4804,coll);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4806,null,4805,org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(coll));
        try {
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

