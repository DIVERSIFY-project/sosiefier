package org.apache.commons.collections4.bidimap;

import java.util.Map;
import org.apache.commons.collections4.OrderedBidiMap;
import junit.framework.Test;
import java.util.TreeMap;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
public class UnmodifiableOrderedBidiMapTest<K extends java.lang.Comparable<K>, V extends Comparable<V>> extends AbstractOrderedBidiMapTest<K, V> {
    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(UnmodifiableOrderedBidiMapTest.class);
    }

    public UnmodifiableOrderedBidiMapTest(final String testName) {
        super(testName);
    }

    @Override
    public OrderedBidiMap<K, V> makeObject() {
        return org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(new TreeBidiMap<K, V>());
    }

    @Override
    public OrderedBidiMap<K, V> makeFullMap() {
        final OrderedBidiMap<K, V> bidi = new TreeBidiMap<K, V>();
        addSampleMappings(bidi);
        return org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(bidi);
    }

    @Override
    public Map<K, V> makeConfirmedMap() {
        return new TreeMap<K, V>();
    }

    /** 
     * Override to prevent infinite recursion of tests.
     */
@Override
    public String[] ignoredTests() {
        return new String[]{ "UnmodifiableOrderedBidiMapTest.bulkTestInverseMap.bulkTestInverseMap" };
    }

    @Override
    public boolean isAllowNullKey() {
        return false;
    }

    @Override
    public boolean isAllowNullValue() {
        return false;
    }

    @Override
    public boolean isPutAddSupported() {
        return false;
    }

    @Override
    public boolean isPutChangeSupported() {
        return false;
    }

    @Override
    public boolean isRemoveSupported() {
        return false;
    }

    public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5557,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5558,((makeFullMap()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final OrderedBidiMap<K, V> map = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5554,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5556,null,5555,org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(map));
        try {
            org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecorateFactory_add1652() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory_add1652");
        final OrderedBidiMap<K, V> map = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5554,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5556,null,5555,org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(map));
        try {
            org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(null);
            org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

