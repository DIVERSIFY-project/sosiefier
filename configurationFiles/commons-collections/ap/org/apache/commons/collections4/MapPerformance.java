package org.apache.commons.collections4;

import java.util.Collection;
import org.apache.commons.collections4.map.Flat3Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** 
 * <code>MapPerformanceTest</code> is designed to perform basic Map performance tests.
 * 
 * @version $Id$
 */
public class MapPerformance {
    /** 
     * The total number of runs for each test
     */
private static final int RUNS = 20000000;

    /** 
     * Main method
     */
public static void main(final String[] args) {
        MapPerformance.testAll();
    }

    private static void testAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.testAll");
        final Map<java.lang.String, java.lang.String> dummyMap = new DummyMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> hashMap = new HashMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> flatMap = new Flat3Map<java.lang.String, java.lang.String>(hashMap);
        System.out.println(flatMap);
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void testAll_literalMutation2609() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.testAll_literalMutation2609");
        final Map<java.lang.String, java.lang.String> dummyMap = new DummyMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> hashMap = new HashMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> flatMap = new Flat3Map<java.lang.String, java.lang.String>(hashMap);
        System.out.println(flatMap);
        MapPerformance.test(dummyMap, "foo");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void testAll_literalMutation2610() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.testAll_literalMutation2610");
        final Map<java.lang.String, java.lang.String> dummyMap = new DummyMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> hashMap = new HashMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> flatMap = new Flat3Map<java.lang.String, java.lang.String>(hashMap);
        System.out.println(flatMap);
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "foo");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void testAll_literalMutation2611() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.testAll_literalMutation2611");
        final Map<java.lang.String, java.lang.String> dummyMap = new DummyMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> hashMap = new HashMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> flatMap = new Flat3Map<java.lang.String, java.lang.String>(hashMap);
        System.out.println(flatMap);
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "foo");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void testAll_literalMutation2612() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.testAll_literalMutation2612");
        final Map<java.lang.String, java.lang.String> dummyMap = new DummyMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> hashMap = new HashMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> flatMap = new Flat3Map<java.lang.String, java.lang.String>(hashMap);
        System.out.println(flatMap);
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(flatMap, "foo");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void testAll_literalMutation2613() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.testAll_literalMutation2613");
        final Map<java.lang.String, java.lang.String> dummyMap = new DummyMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> hashMap = new HashMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> flatMap = new Flat3Map<java.lang.String, java.lang.String>(hashMap);
        System.out.println(flatMap);
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "foo");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void testAll_literalMutation2614() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.testAll_literalMutation2614");
        final Map<java.lang.String, java.lang.String> dummyMap = new DummyMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> hashMap = new HashMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> flatMap = new Flat3Map<java.lang.String, java.lang.String>(hashMap);
        System.out.println(flatMap);
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(flatMap, "foo");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void testAll_literalMutation2615() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.testAll_literalMutation2615");
        final Map<java.lang.String, java.lang.String> dummyMap = new DummyMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> hashMap = new HashMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> flatMap = new Flat3Map<java.lang.String, java.lang.String>(hashMap);
        System.out.println(flatMap);
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "foo");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void testAll_literalMutation2616() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.testAll_literalMutation2616");
        final Map<java.lang.String, java.lang.String> dummyMap = new DummyMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> hashMap = new HashMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> flatMap = new Flat3Map<java.lang.String, java.lang.String>(hashMap);
        System.out.println(flatMap);
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "foo");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void testAll_literalMutation2617() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.testAll_literalMutation2617");
        final Map<java.lang.String, java.lang.String> dummyMap = new DummyMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> hashMap = new HashMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> flatMap = new Flat3Map<java.lang.String, java.lang.String>(hashMap);
        System.out.println(flatMap);
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "foo");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void testAll_literalMutation2618() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.testAll_literalMutation2618");
        final Map<java.lang.String, java.lang.String> dummyMap = new DummyMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> hashMap = new HashMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> flatMap = new Flat3Map<java.lang.String, java.lang.String>(hashMap);
        System.out.println(flatMap);
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "foo");
        MapPerformance.test(hashMap, "       HashMap ");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void testAll_literalMutation2619() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.testAll_literalMutation2619");
        final Map<java.lang.String, java.lang.String> dummyMap = new DummyMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> hashMap = new HashMap<java.lang.String, java.lang.String>();
        final Map<java.lang.String, java.lang.String> flatMap = new Flat3Map<java.lang.String, java.lang.String>(hashMap);
        System.out.println(flatMap);
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(dummyMap, "         Dummy ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(flatMap, "         Flat3 ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "       HashMap ");
        MapPerformance.test(hashMap, "foo");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test");
        long start = 1;
        long end = 0;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > 0 ; i--) {
            map.put("Alpha", "A");
            map.put("Beta", "B");
            map.put("Beta", "C");
            map.put("Gamma", "D");
            map.put("Delta", "E");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test_literalMutation2597(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test_literalMutation2597");
        long start = 0;
        long end = 1;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > 0 ; i--) {
            map.put("Alpha", "A");
            map.put("Beta", "B");
            map.put("Beta", "C");
            map.put("Gamma", "D");
            map.put("Delta", "E");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test_literalMutation2598(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test_literalMutation2598");
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > -1 ; i--) {
            map.put("Alpha", "A");
            map.put("Beta", "B");
            map.put("Beta", "C");
            map.put("Gamma", "D");
            map.put("Delta", "E");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test_literalMutation2599(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test_literalMutation2599");
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > 0 ; i--) {
            map.put("foo", "A");
            map.put("Beta", "B");
            map.put("Beta", "C");
            map.put("Gamma", "D");
            map.put("Delta", "E");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test_literalMutation2600(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test_literalMutation2600");
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > 0 ; i--) {
            map.put("Alpha", "foo");
            map.put("Beta", "B");
            map.put("Beta", "C");
            map.put("Gamma", "D");
            map.put("Delta", "E");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test_literalMutation2601(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test_literalMutation2601");
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > 0 ; i--) {
            map.put("Alpha", "A");
            map.put("foo", "B");
            map.put("Beta", "C");
            map.put("Gamma", "D");
            map.put("Delta", "E");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test_literalMutation2602(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test_literalMutation2602");
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > 0 ; i--) {
            map.put("Alpha", "A");
            map.put("Beta", "foo");
            map.put("Beta", "C");
            map.put("Gamma", "D");
            map.put("Delta", "E");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test_literalMutation2603(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test_literalMutation2603");
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > 0 ; i--) {
            map.put("Alpha", "A");
            map.put("Beta", "B");
            map.put("foo", "C");
            map.put("Gamma", "D");
            map.put("Delta", "E");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test_literalMutation2604(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test_literalMutation2604");
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > 0 ; i--) {
            map.put("Alpha", "A");
            map.put("Beta", "B");
            map.put("Beta", "foo");
            map.put("Gamma", "D");
            map.put("Delta", "E");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test_literalMutation2605(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test_literalMutation2605");
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > 0 ; i--) {
            map.put("Alpha", "A");
            map.put("Beta", "B");
            map.put("Beta", "C");
            map.put("foo", "D");
            map.put("Delta", "E");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test_literalMutation2606(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test_literalMutation2606");
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > 0 ; i--) {
            map.put("Alpha", "A");
            map.put("Beta", "B");
            map.put("Beta", "C");
            map.put("Gamma", "foo");
            map.put("Delta", "E");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test_literalMutation2607(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test_literalMutation2607");
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > 0 ; i--) {
            map.put("Alpha", "A");
            map.put("Beta", "B");
            map.put("Beta", "C");
            map.put("Gamma", "D");
            map.put("foo", "E");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static void test_literalMutation2608(final Map<java.lang.String, java.lang.String> map, final String name) {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(), "org.apache.commons.collections4.MapPerformance.test_literalMutation2608");
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        for (int i = RUNS ; i > 0 ; i--) {
            map.put("Alpha", "A");
            map.put("Beta", "B");
            map.put("Beta", "C");
            map.put("Gamma", "D");
            map.put("Delta", "foo");
            map.clear();
        }
        end = System.currentTimeMillis();
        System.out.println((name + (end - start)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class DummyMap<K, V> implements Map<K, V> {
        public void clear() {
        }

        public boolean containsKey(final Object key) {
            return false;
        }

        public boolean containsValue(final Object value) {
            return false;
        }

        public Set<java.util.Map.Entry<K, V>> entrySet() {
            return null;
        }

        public V get(final Object key) {
            return null;
        }

        public boolean isEmpty() {
            return false;
        }

        public Set<K> keySet() {
            return null;
        }

        public V put(final K key, final V value) {
            return null;
        }

        public void putAll(final Map<? extends K, ? extends V> t) {
        }

        public V remove(final Object key) {
            return null;
        }

        public int size() {
            return 0;
        }

        public Collection<V> values() {
            return null;
        }
    }
}

