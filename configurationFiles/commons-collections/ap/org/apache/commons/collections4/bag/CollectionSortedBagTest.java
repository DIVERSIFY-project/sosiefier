package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.collection.AbstractCollectionTest;
import java.util.ArrayList;
import org.apache.commons.collections4.Bag;
import java.util.Collection;
import java.io.IOException;
import org.apache.commons.collections4.SortedBag;

/** 
 * Test class for {@link CollectionSortedBag}.
 * <p/>
 * Note: This test is mainly for serialization support, the CollectionSortedBag decorator
 * is extensively used and tested in AbstractSortedBagTest.
 * 
 * @version $Id$
 * @since 4.0
 */
public class CollectionSortedBagTest<T> extends AbstractCollectionTest<T> {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test class name
     */
public CollectionSortedBagTest(final String testName) {
        super(testName);
    }

    /** 
     * Overridden because SortedBags don't allow null elements (normally).
     * 
     * @return false
     */
@Override
    public boolean isNullSupported() {
        return false;
    }

    @Override
    public Bag<T> makeObject() {
        return org.apache.commons.collections4.bag.CollectionSortedBag.collectionSortedBag(new org.apache.commons.collections4.bag.TreeBag<T>());
    }

    /** 
     * Returns an empty List for use in modification testing.
     * 
     * @return a confirmed empty collection
     */
@Override
    public Collection<T> makeConfirmedCollection() {
        return new ArrayList<T>();
    }

    /** 
     * Returns a full Set for use in modification testing.
     * 
     * @return a confirmed full collection
     */
@Override
    public Collection<T> makeConfirmedFullCollection() {
        final Collection<T> set = makeConfirmedCollection();
        set.addAll(java.util.Arrays.asList(getFullElements()));
        return set;
    }

    /** 
     * Override to return comparable objects.
     */
@Override
    @SuppressWarnings(value = "unchecked")
    public T[] getFullNonNullElements() {
        final Object[] elements = new Object[30];
        for (int i = 0 ; i < 30 ; i++) {
            elements[i] = java.lang.Integer.valueOf(((i + i) + 1));
        }
        return ((T[])(elements));
    }

    /** 
     * Override to return comparable objects.
     */
@Override
    @SuppressWarnings(value = "unchecked")
    public T[] getOtherNonNullElements() {
        final Object[] elements = new Object[30];
        for (int i = 0 ; i < 30 ; i++) {
            elements[i] = java.lang.Integer.valueOf(((i + i) + 2));
        }
        return ((T[])(elements));
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    /** 
     * Compare the current serialized form of the Bag
     * against the canonical version in SVN.
     */
public void testEmptyBagCompatibility() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBagCompatibility");
        final Bag<T> bag = makeObject();
        if (((bag instanceof java.io.Serializable) && (!(skipSerializedCanonicalTests()))) && (isTestSerialization())) {
            final Bag<?> bag2 = ((Bag<?>)(readExternalFormFromDisk(getCanonicalEmptyCollectionName(bag))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5797,((bag2.size()) == 0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5798,bag);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5799,bag2);
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the Bag
     * against the canonical version in SVN.
     */
public void testFullBagCompatibility() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullBagCompatibility");
        final SortedBag<T> bag = ((SortedBag<T>)(makeFullCollection()));
        if (((bag instanceof java.io.Serializable) && (!(skipSerializedCanonicalTests()))) && (isTestSerialization())) {
            final SortedBag<?> bag2 = ((SortedBag<?>)(readExternalFormFromDisk(getCanonicalFullCollectionName(bag))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5801,bag,5800,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,bag2,5802,bag2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,bag);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,bag2);
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

