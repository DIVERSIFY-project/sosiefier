package org.apache.commons.collections4.bidimap;

import org.apache.commons.collections4.BidiMap;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Test;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
public class UnmodifiableBidiMapTest<K, V> extends AbstractBidiMapTest<K, V> {
    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(UnmodifiableBidiMapTest.class);
    }

    public UnmodifiableBidiMapTest(final String testName) {
        super(testName);
    }

    @Override
    public BidiMap<K, V> makeObject() {
        return org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.unmodifiableBidiMap(new DualHashBidiMap<K, V>());
    }

    @Override
    public BidiMap<K, V> makeFullMap() {
        final BidiMap<K, V> bidi = new DualHashBidiMap<K, V>();
        addSampleMappings(bidi);
        return org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.unmodifiableBidiMap(bidi);
    }

    @Override
    public Map<K, V> makeConfirmedMap() {
        return new HashMap<K, V>();
    }

    /** 
     * Override to prevent infinite recursion of tests.
     */
@Override
    public String[] ignoredTests() {
        return new String[]{ "UnmodifiableBidiMapTest.bulkTestInverseMap.bulkTestInverseMap" };
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5592,((makeFullMap()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final BidiMap<K, V> map = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5588,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5590,null,5589,org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.unmodifiableBidiMap(map));
        try {
            org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.unmodifiableBidiMap(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

