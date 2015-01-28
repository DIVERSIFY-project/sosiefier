package org.apache.commons.collections4.trie;

import org.apache.commons.collections4.map.AbstractSortedMapTest;
import org.apache.commons.collections4.BulkTest;
import junit.framework.Test;
import org.apache.commons.collections4.Trie;

/** 
 * Extension of {@link AbstractSortedMapTest} for exercising the
 * {@link UnmodifiableTrie} implementation.
 * 
 * @version $Id$
 * @since 4.0
 */
public class UnmodifiableTrieTest<V> extends AbstractSortedMapTest<java.lang.String, V> {
    public UnmodifiableTrieTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return BulkTest.makeSuite(UnmodifiableTrieTest.class);
    }

    @Override
    public Trie<java.lang.String, V> makeObject() {
        return org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(new PatriciaTrie<V>());
    }

    @Override
    public boolean isPutChangeSupported() {
        return false;
    }

    @Override
    public boolean isPutAddSupported() {
        return false;
    }

    @Override
    public boolean isRemoveSupported() {
        return false;
    }

    @Override
    public Trie<java.lang.String, V> makeFullMap() {
        final Trie<java.lang.String, V> m = new PatriciaTrie<V>();
        addSampleMappings(m);
        return org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(m);
    }

    public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6358,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6359,((makeFullMap()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final Trie<java.lang.String, V> trie = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,trie);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,null,6356,org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(trie));
        try {
            org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecorateFactory_add1999() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory_add1999");
        final Trie<java.lang.String, V> trie = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6355,trie);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6357,null,6356,org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(trie));
        try {
            org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(null);
            org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Override to prevent infinite recursion of tests.
     */
@Override
    public String[] ignoredTests() {
        if (BulkTest.IBMJDK16) {
            final String prefix = "UnmodifiableTrieTest.";
            return new String[]{ prefix + "bulkTestHeadMap.bulkTestMapEntrySet.testCollectionToArray2" , prefix + "bulkTestTailMap.bulkTestMapEntrySet.testCollectionToArray2" , prefix + "bulkTestSubMap.bulkTestMapEntrySet.testCollectionToArray2" };
        } else {
            return null;
        }
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

