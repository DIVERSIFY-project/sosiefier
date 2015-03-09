package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.collection.AbstractCollectionTest;
import java.util.ArrayList;
import org.apache.commons.collections4.Bag;
import java.util.Collection;
import java.io.IOException;

/** 
 * Test class for {@link CollectionBag}.
 * <p/>
 * Note: This test is mainly for serialization support, the CollectionBag decorator
 * is extensively used and tested in AbstractBagTest.
 * 
 * @version $Id$
 * @since 4.0
 */
public class CollectionBagTest<T> extends AbstractCollectionTest<T> {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test class name
     */
public CollectionBagTest(final String testName) {
        super(testName);
    }

    @Override
    public Bag<T> makeObject() {
        return org.apache.commons.collections4.bag.CollectionBag.collectionBag(new org.apache.commons.collections4.bag.HashBag<T>());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5788,((bag2.size()) == 0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5789,bag);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5790,bag2);
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the Bag
     * against the canonical version in SVN.
     */
public void testFullBagCompatibility() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullBagCompatibility");
        final Bag<T> bag = ((Bag<T>)(makeFullCollection()));
        if (((bag instanceof java.io.Serializable) && (!(skipSerializedCanonicalTests()))) && (isTestSerialization())) {
            final Bag<?> bag2 = ((Bag<?>)(readExternalFormFromDisk(getCanonicalFullCollectionName(bag))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5792,bag,5791,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5794,bag2,5793,bag2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5795,bag);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5796,bag2);
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

