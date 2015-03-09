package org.apache.commons.collections4.map;

import java.util.HashMap;
import java.util.Map;
import junit.framework.Test;
import java.util.concurrent.TimeUnit;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 * @since 4.0
 */
public class PassiveExpiringMapTest<K, V> extends AbstractMapTest<K, V> {
    private static class TestExpirationPolicy implements PassiveExpiringMap.ExpirationPolicy<java.lang.Integer, java.lang.String> {
        private static final long serialVersionUID = 1L;

        public long expirationTime(final Integer key, final String value) {
            if (key == null) {
                return 0;
            } 
            if (((key.intValue()) % 2) == 0) {
                return -1;
            } 
            return 0;
        }
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(PassiveExpiringMapTest.class);
    }

    public PassiveExpiringMapTest(final String testName) {
        super(testName);
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    private Map<java.lang.Integer, java.lang.String> makeDecoratedTestMap() {
        final Map<java.lang.Integer, java.lang.String> m = new HashMap<java.lang.Integer, java.lang.String>();
        m.put(Integer.valueOf(1), "one");
        m.put(Integer.valueOf(2), "two");
        m.put(Integer.valueOf(3), "three");
        m.put(Integer.valueOf(4), "four");
        m.put(Integer.valueOf(5), "five");
        m.put(Integer.valueOf(6), "six");
        return new PassiveExpiringMap<java.lang.Integer, java.lang.String>(new TestExpirationPolicy() , m);
    }

    @Override
    public Map<K, V> makeObject() {
        return new PassiveExpiringMap<K, V>();
    }

    private Map<java.lang.Integer, java.lang.String> makeTestMap() {
        final Map<java.lang.Integer, java.lang.String> m = new PassiveExpiringMap<java.lang.Integer, java.lang.String>(new TestExpirationPolicy());
        m.put(Integer.valueOf(1), "one");
        m.put(Integer.valueOf(2), "two");
        m.put(Integer.valueOf(3), "three");
        m.put(Integer.valueOf(4), "four");
        m.put(Integer.valueOf(5), "five");
        m.put(Integer.valueOf(6), "six");
        return m;
    }

    public void testConstructors() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testConstructors");
        try {
            final Map<java.lang.String, java.lang.String> map = null;
            new PassiveExpiringMap<java.lang.String, java.lang.String>(map);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            final PassiveExpiringMap.ExpirationPolicy<java.lang.String, java.lang.String> policy = null;
            new PassiveExpiringMap<java.lang.String, java.lang.String>(policy);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            final TimeUnit unit = null;
            new PassiveExpiringMap<java.lang.String, java.lang.String>(9L , unit);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testContainsKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsKey");
        final Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1688,m,1687,m.containsKey(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1690,m,1689,m.containsKey(java.lang.Integer.valueOf(3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1692,m,1691,m.containsKey(java.lang.Integer.valueOf(5)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1694,m,1693,m.containsKey(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1696,m,1695,m.containsKey(java.lang.Integer.valueOf(4)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1698,m,1697,m.containsKey(java.lang.Integer.valueOf(6)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testContainsValue() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testContainsValue");
        final Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1700,m,1699,m.containsValue("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1702,m,1701,m.containsValue("three"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1704,m,1703,m.containsValue("five"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1706,m,1705,m.containsValue("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1708,m,1707,m.containsValue("four"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1710,m,1709,m.containsValue("six"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecoratedMap_add530() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecoratedMap_add530");
        final Map<java.lang.Integer, java.lang.String> m = makeDecoratedTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,m,1711,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,m,1713,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,m,1715,m.get(java.lang.Integer.valueOf(2)));
        m.remove(Integer.valueOf(2));
        m.remove(Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,m,1717,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,m,1719,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,m,1721,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,m,1723,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(2), "two");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,m,1725,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,m,1727,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,m,1729,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(1), "one-one");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,m,1731,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,m,1733,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,m,1735,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecoratedMap_add531() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecoratedMap_add531");
        final Map<java.lang.Integer, java.lang.String> m = makeDecoratedTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,m,1711,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,m,1713,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,m,1715,m.get(java.lang.Integer.valueOf(2)));
        m.remove(Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,m,1717,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,m,1719,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,m,1721,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,m,1723,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(2), "two");
        m.put(Integer.valueOf(2), "two");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,m,1725,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,m,1727,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,m,1729,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(1), "one-one");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,m,1731,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,m,1733,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,m,1735,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecoratedMap_add532() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecoratedMap_add532");
        final Map<java.lang.Integer, java.lang.String> m = makeDecoratedTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,m,1711,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,m,1713,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,m,1715,m.get(java.lang.Integer.valueOf(2)));
        m.remove(Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,m,1717,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,m,1719,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,m,1721,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,m,1723,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(2), "two");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,m,1725,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,m,1727,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,m,1729,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(1), "one-one");
        m.put(Integer.valueOf(1), "one-one");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,m,1731,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,m,1733,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,m,1735,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecoratedMap() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecoratedMap");
        final Map<java.lang.Integer, java.lang.String> m = makeDecoratedTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,m,1711,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,m,1713,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,m,1715,m.get(java.lang.Integer.valueOf(2)));
        m.remove(Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,m,1717,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,m,1719,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,m,1721,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,m,1723,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(2), "two");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,m,1725,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,m,1727,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,m,1729,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(1), "one-one");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,m,1731,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,m,1733,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,m,1735,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecoratedMap_literalMutation501() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecoratedMap_literalMutation501");
        final Map<java.lang.Integer, java.lang.String> m = makeDecoratedTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,m,1711,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,m,1713,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,m,1715,m.get(java.lang.Integer.valueOf(2)));
        m.remove(Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,m,1717,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,m,1719,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,m,1721,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,m,1723,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(3), "two");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,m,1725,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,m,1727,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,m,1729,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(1), "one-one");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,m,1731,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,m,1733,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,m,1735,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecoratedMap_literalMutation502() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecoratedMap_literalMutation502");
        final Map<java.lang.Integer, java.lang.String> m = makeDecoratedTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,m,1711,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,m,1713,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,m,1715,m.get(java.lang.Integer.valueOf(2)));
        m.remove(Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,m,1717,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,m,1719,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,m,1721,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,m,1723,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(2), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,m,1725,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,m,1727,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,m,1729,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(1), "one-one");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,m,1731,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,m,1733,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,m,1735,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecoratedMap_literalMutation503() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecoratedMap_literalMutation503");
        final Map<java.lang.Integer, java.lang.String> m = makeDecoratedTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,m,1711,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,m,1713,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,m,1715,m.get(java.lang.Integer.valueOf(2)));
        m.remove(Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,m,1717,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,m,1719,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,m,1721,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,m,1723,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(2), "two");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,m,1725,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,m,1727,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,m,1729,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(0), "one-one");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,m,1731,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,m,1733,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,m,1735,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecoratedMap_literalMutation504() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecoratedMap_literalMutation504");
        final Map<java.lang.Integer, java.lang.String> m = makeDecoratedTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,m,1711,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,m,1713,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,m,1715,m.get(java.lang.Integer.valueOf(2)));
        m.remove(Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,m,1717,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,m,1719,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,m,1721,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,m,1723,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(2), "two");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,m,1725,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,m,1727,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,m,1729,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(1), "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,m,1731,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,m,1733,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,m,1735,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecoratedMap_remove423() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecoratedMap_remove423");
        final Map<java.lang.Integer, java.lang.String> m = makeDecoratedTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,m,1711,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,m,1713,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,m,1715,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,m,1717,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,m,1719,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,m,1721,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,m,1723,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(2), "two");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,m,1725,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,m,1727,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,m,1729,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(1), "one-one");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,m,1731,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,m,1733,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,m,1735,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecoratedMap_remove424() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecoratedMap_remove424");
        final Map<java.lang.Integer, java.lang.String> m = makeDecoratedTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,m,1711,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,m,1713,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,m,1715,m.get(java.lang.Integer.valueOf(2)));
        m.remove(Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,m,1717,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,m,1719,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,m,1721,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,m,1723,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,m,1725,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,m,1727,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,m,1729,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(1), "one-one");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,m,1731,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,m,1733,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,m,1735,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testDecoratedMap_remove425() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecoratedMap_remove425");
        final Map<java.lang.Integer, java.lang.String> m = makeDecoratedTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1712,m,1711,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1714,m,1713,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1716,m,1715,m.get(java.lang.Integer.valueOf(2)));
        m.remove(Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1718,m,1717,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1720,m,1719,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1722,m,1721,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1724,m,1723,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1726,m,1725,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1728,m,1727,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1730,m,1729,m.get(java.lang.Integer.valueOf(2)));
        m.put(Integer.valueOf(1), "one-one");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1732,m,1731,m.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1734,m,1733,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1736,m,1735,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEntrySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntrySet");
        final Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1738,m.entrySet(),1737,m.entrySet().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testGet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGet");
        final Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1740,m,1739,m.get(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1742,m,1741,m.get(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1744,m,1743,m.get(java.lang.Integer.valueOf(3)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1746,m,1745,m.get(java.lang.Integer.valueOf(4)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1748,m,1747,m.get(java.lang.Integer.valueOf(5)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1750,m,1749,m.get(java.lang.Integer.valueOf(6)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIsEmpty_add537() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_add537");
        Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,m,1751,m.isEmpty());
        m = makeTestMap();
        m.remove(Integer.valueOf(2));
        m.remove(Integer.valueOf(2));
        m.remove(Integer.valueOf(4));
        m.remove(Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1754,m,1753,m.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIsEmpty_add538() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_add538");
        Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,m,1751,m.isEmpty());
        m = makeTestMap();
        m.remove(Integer.valueOf(2));
        m.remove(Integer.valueOf(4));
        m.remove(Integer.valueOf(4));
        m.remove(Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1754,m,1753,m.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIsEmpty_add539() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_add539");
        Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,m,1751,m.isEmpty());
        m = makeTestMap();
        m.remove(Integer.valueOf(2));
        m.remove(Integer.valueOf(4));
        m.remove(Integer.valueOf(6));
        m.remove(Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1754,m,1753,m.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsEmpty() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty");
        Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,m,1751,m.isEmpty());
        m = makeTestMap();
        m.remove(Integer.valueOf(3));
        m.remove(Integer.valueOf(4));
        m.remove(Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1754,m,1753,m.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsEmpty_literalMutation514() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_literalMutation514");
        Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,m,1751,m.isEmpty());
        m = makeTestMap();
        m.remove(Integer.valueOf(2));
        m.remove(Integer.valueOf(3));
        m.remove(Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1754,m,1753,m.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIsEmpty_literalMutation515() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_literalMutation515");
        Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,m,1751,m.isEmpty());
        m = makeTestMap();
        m.remove(Integer.valueOf(2));
        m.remove(Integer.valueOf(4));
        m.remove(Integer.valueOf(7));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1754,m,1753,m.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIsEmpty_remove430() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_remove430");
        Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,m,1751,m.isEmpty());
        m = makeTestMap();
        m.remove(Integer.valueOf(4));
        m.remove(Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1754,m,1753,m.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIsEmpty_remove431() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_remove431");
        Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,m,1751,m.isEmpty());
        m = makeTestMap();
        m.remove(Integer.valueOf(4));
        m.remove(Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1754,m,1753,m.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testIsEmpty_remove432() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIsEmpty_remove432");
        Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1752,m,1751,m.isEmpty());
        m = makeTestMap();
        m.remove(Integer.valueOf(4));
        m.remove(Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1754,m,1753,m.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testKeySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testKeySet");
        final Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1756,m.keySet(),1755,m.keySet().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSize");
        final Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1758,m,1757,m.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testValues");
        final Map<java.lang.Integer, java.lang.String> m = makeTestMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1760,m.values(),1759,m.values().size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testZeroTimeToLive_add540() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroTimeToLive_add540");
        final PassiveExpiringMap<java.lang.String, java.lang.String> m = new PassiveExpiringMap<java.lang.String, java.lang.String>(0L);
        m.put("a", "b");
        m.put("a", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1762,m,1761,m.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroTimeToLive() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroTimeToLive");
        final PassiveExpiringMap<java.lang.String, java.lang.String> m = new PassiveExpiringMap<java.lang.String, java.lang.String>(-1L);
        m.put("a", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1762,m,1761,m.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroTimeToLive_literalMutation517() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroTimeToLive_literalMutation517");
        final PassiveExpiringMap<java.lang.String, java.lang.String> m = new PassiveExpiringMap<java.lang.String, java.lang.String>(0L);
        m.put("foo", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1762,m,1761,m.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testZeroTimeToLive_literalMutation518() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroTimeToLive_literalMutation518");
        final PassiveExpiringMap<java.lang.String, java.lang.String> m = new PassiveExpiringMap<java.lang.String, java.lang.String>(0L);
        m.put("a", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1762,m,1761,m.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testZeroTimeToLive_remove433() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testZeroTimeToLive_remove433");
        final PassiveExpiringMap<java.lang.String, java.lang.String> m = new PassiveExpiringMap<java.lang.String, java.lang.String>(0L);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1762,m,1761,m.get("a"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testExpiration_add533() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_add533");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(500), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(500), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testExpiration_add534() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_add534");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(500), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testExpiration_add535() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_add535");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(500), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testExpiration_add536() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_add536");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(500), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExpiration() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(499), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExpiration_literalMutation506() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_literalMutation506");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(500), 501);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExpiration_literalMutation507() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_literalMutation507");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(500), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1001), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExpiration_literalMutation508() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_literalMutation508");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(500), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1001);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExpiration_literalMutation509() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_literalMutation509");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(500), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(499)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExpiration_literalMutation510() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_literalMutation510");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(500), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 501);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExpiration_literalMutation511() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_literalMutation511");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(500), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(0 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testExpiration_literalMutation512() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_literalMutation512");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(500), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 999);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testExpiration_remove426() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_remove426");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testExpiration_remove427() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_remove427");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testExpiration_remove428() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_remove428");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testExpiration_remove429() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testExpiration_remove429");
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(1000), 1000);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(500)), 500);
        validateExpiration(new PassiveExpiringMap<java.lang.String, java.lang.String>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<java.lang.String, java.lang.String>(1 , TimeUnit.SECONDS)), 1000);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void validateExpiration(final Map<java.lang.String, java.lang.String> map, long timeout) {
        map.put("a", "b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1764,map,1763,map.get("a"));
        try {
            java.lang.Thread.sleep((2 * timeout));
        } catch (InterruptedException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1766,map,1765,map.get("a"));
    }
}

