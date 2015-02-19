package org.apache.commons.collections4.map;

import org.apache.commons.collections4.OrderedMap;
import junit.framework.Test;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
public class SingletonMapTest<K, V> extends AbstractOrderedMapTest<K, V> {
    private static final Integer ONE = Integer.valueOf(1);

    private static final Integer TWO = Integer.valueOf(2);

    private static final String TEN = "10";

    public SingletonMapTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(SingletonMapTest.class);
    }

    @Override
    public OrderedMap<K, V> makeObject() {
        return org.apache.commons.collections4.map.UnmodifiableOrderedMap.unmodifiableOrderedMap(org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(new java.util.HashMap<K, V>()));
    }

    @Override
    public String[] ignoredTests() {
        return new String[]{ "SingletonMapTest.bulkTestMapIterator.testEmptyMapIterator" , "SingletonMapTest.bulkTestOrderedMapIterator.testEmptyMapIterator" };
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public SingletonMap<K, V> makeFullMap() {
        return new SingletonMap<K, V>(((K)(ONE)) , ((V)(TWO)));
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
    @SuppressWarnings(value = "unchecked")
    public K[] getSampleKeys() {
        return ((K[])(new Object[]{ ONE }));
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public V[] getSampleValues() {
        return ((V[])(new Object[]{ TWO }));
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public V[] getNewSampleValues() {
        return ((V[])(new Object[]{ TEN }));
    }

    public void testClone() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone");
        final SingletonMap<K, V> map = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1794,map,1793,map.size());
        final SingletonMap<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1796,cloned,1795,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1798,cloned,1797,cloned.containsKey(org.apache.commons.collections4.map.SingletonMapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1800,cloned,1799,cloned.containsValue(org.apache.commons.collections4.map.SingletonMapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testKeyValue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testKeyValue");
        final SingletonMap<K, V> map = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1803,org.apache.commons.collections4.map.SingletonMapTest.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1805,map,1804,map.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1806,org.apache.commons.collections4.map.SingletonMapTest.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1808,map,1807,map.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1809,(map instanceof org.apache.commons.collections4.KeyValue));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBoundedMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBoundedMap");
        final SingletonMap<K, V> map = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1787,map,1786,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1789,map,1788,map.isFull());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1791,map,1790,map.maxSize());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1792,(map instanceof org.apache.commons.collections4.BoundedMap));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

