package org.apache.commons.collections4.map;

import java.util.HashMap;
import org.apache.commons.collections4.IterableMap;
import java.util.Map;

/** 
 * Extension of {@link AbstractMapTest} for exercising the
 * {@link UnmodifiableMap} implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class UnmodifiableMapTest<K, V> extends AbstractIterableMapTest<K, V> {
    public UnmodifiableMapTest(final String testName) {
        super(testName);
    }

    @Override
    public IterableMap<K, V> makeObject() {
        return ((IterableMap<K, V>)(org.apache.commons.collections4.map.UnmodifiableMap.unmodifiableMap(new HashMap<K, V>())));
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
    public IterableMap<K, V> makeFullMap() {
        final Map<K, V> m = new HashMap<K, V>();
        addSampleMappings(m);
        return ((IterableMap<K, V>)(org.apache.commons.collections4.map.UnmodifiableMap.unmodifiableMap(m)));
    }

    public void testUnmodifiable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testUnmodifiable");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1986,((makeObject()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1987,((makeFullMap()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        final Map<K, V> map = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1983,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1985,null,1984,org.apache.commons.collections4.map.UnmodifiableMap.unmodifiableMap(map));
        try {
            org.apache.commons.collections4.map.UnmodifiableMap.unmodifiableMap(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

