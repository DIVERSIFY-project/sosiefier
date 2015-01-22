package org.apache.commons.collections4.map;

import junit.framework.Test;

/** 
 * Unit tests.
 * {@link StaticBucketMap}.
 * 
 * @version $Id$
 */
public class StaticBucketMapTest<K, V> extends AbstractIterableMapTest<K, V> {
    public StaticBucketMapTest(final String name) {
        super(name);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(StaticBucketMapTest.class);
    }

    @Override
    public StaticBucketMap<K, V> makeObject() {
        return new StaticBucketMap<K, V>(30);
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public boolean isFailFastExpected() {
        return false;
    }

    @Override
    public String[] ignoredTests() {
        final String pre = "StaticBucketMapTest.bulkTestMap";
        final String post = ".testCollectionIteratorFailFast";
        return new String[]{ (pre + "EntrySet") + post , (pre + "KeySet") + post , (pre + "Values") + post };
    }

    @SuppressWarnings(value = "unchecked")
    public void test_get_nullMatchesIncorrectly() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_get_nullMatchesIncorrectly");
        final StaticBucketMap<K, V> map = new StaticBucketMap<K, V>(17);
        map.put(null, ((V)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,map,1820,map.get(null));
        for (int i = 'A' ; i <= 'Z' ; i++) {
            final String str = String.valueOf(((char)(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1822,("String: " + str));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1824,map,1823,map.get(str));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void test_get_nullMatchesIncorrectly_literalMutation595() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_get_nullMatchesIncorrectly_literalMutation595");
        final StaticBucketMap<K, V> map = new StaticBucketMap<K, V>(18);
        map.put(null, ((V)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,map,1820,map.get(null));
        for (int i = 'A' ; i <= 'Z' ; i++) {
            final String str = String.valueOf(((char)(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1822,("String: " + str));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1824,map,1823,map.get(str));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void test_get_nullMatchesIncorrectly_literalMutation597() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_get_nullMatchesIncorrectly_literalMutation597");
        final StaticBucketMap<K, V> map = new StaticBucketMap<K, V>(17);
        map.put(null, ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1821,map,1820,map.get(null));
        for (int i = 'A' ; i <= 'Z' ; i++) {
            final String str = String.valueOf(((char)(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1822,("String: " + str));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1824,map,1823,map.get(str));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void test_containsKey_nullMatchesIncorrectly() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_containsKey_nullMatchesIncorrectly");
        final StaticBucketMap<K, V> map = new StaticBucketMap<K, V>(17);
        map.put(null, ((V)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,map,1810,map.containsKey(null));
        for (int i = 'A' ; i <= 'Z' ; i++) {
            final String str = String.valueOf(((char)(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1812,("String: " + str));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1814,map,1813,map.containsKey(str));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void test_containsKey_nullMatchesIncorrectly_literalMutation583() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_containsKey_nullMatchesIncorrectly_literalMutation583");
        final StaticBucketMap<K, V> map = new StaticBucketMap<K, V>(16);
        map.put(null, ((V)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,map,1810,map.containsKey(null));
        for (int i = 'A' ; i <= 'Z' ; i++) {
            final String str = String.valueOf(((char)(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1812,("String: " + str));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1814,map,1813,map.containsKey(str));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void test_containsKey_nullMatchesIncorrectly_literalMutation585() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_containsKey_nullMatchesIncorrectly_literalMutation585");
        final StaticBucketMap<K, V> map = new StaticBucketMap<K, V>(17);
        map.put(null, ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1811,map,1810,map.containsKey(null));
        for (int i = 'A' ; i <= 'Z' ; i++) {
            final String str = String.valueOf(((char)(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1812,("String: " + str));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1814,map,1813,map.containsKey(str));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void test_containsValue_nullMatchesIncorrectly() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_containsValue_nullMatchesIncorrectly");
        final StaticBucketMap<K, V> map = new StaticBucketMap<K, V>(17);
        map.put(((K)("A")), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1816,map,1815,map.containsValue(null));
        for (int i = 'A' ; i <= 'Z' ; i++) {
            final String str = String.valueOf(((char)(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,("String: " + str));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,map,1818,map.containsValue(str));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void test_containsValue_nullMatchesIncorrectly_literalMutation589() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_containsValue_nullMatchesIncorrectly_literalMutation589");
        final StaticBucketMap<K, V> map = new StaticBucketMap<K, V>(16);
        map.put(((K)("A")), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1816,map,1815,map.containsValue(null));
        for (int i = 'A' ; i <= 'Z' ; i++) {
            final String str = String.valueOf(((char)(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,("String: " + str));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,map,1818,map.containsValue(str));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void test_containsValue_nullMatchesIncorrectly_literalMutation590() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "test_containsValue_nullMatchesIncorrectly_literalMutation590");
        final StaticBucketMap<K, V> map = new StaticBucketMap<K, V>(17);
        map.put(((K)("foo")), null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1816,map,1815,map.containsValue(null));
        for (int i = 'A' ; i <= 'Z' ; i++) {
            final String str = String.valueOf(((char)(i)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1817,("String: " + str));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1819,map,1818,map.containsValue(str));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

