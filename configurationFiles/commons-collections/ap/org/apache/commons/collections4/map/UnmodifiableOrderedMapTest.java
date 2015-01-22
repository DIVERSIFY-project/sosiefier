package org.apache.commons.collections4.map;

import org.apache.commons.collections4.OrderedMap;

/** 
 * Extension of {@link AbstractOrderedMapTest} for exercising the
 * {@link UnmodifiableOrderedMap} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class UnmodifiableOrderedMapTest<K, V> extends AbstractOrderedMapTest<K, V> {
    public UnmodifiableOrderedMapTest(final String testName) {
        super(testName);
    }

    @Override
    public OrderedMap<K, V> makeObject() {
        return org.apache.commons.collections4.map.UnmodifiableOrderedMap.unmodifiableOrderedMap(org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(new java.util.HashMap<K, V>()));
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
    public OrderedMap<K, V> makeFullMap() {
        final OrderedMap<K, V> m = org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(new java.util.HashMap<K, V>());
        addSampleMappings(m);
        return org.apache.commons.collections4.map.UnmodifiableOrderedMap.unmodifiableOrderedMap(m);
    }

    public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1991,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1992,((makeFullMap()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final OrderedMap<K, V> map = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1988,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1990,null,1989,org.apache.commons.collections4.map.UnmodifiableOrderedMap.unmodifiableOrderedMap(map));
        try {
            org.apache.commons.collections4.map.UnmodifiableOrderedMap.unmodifiableOrderedMap(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

