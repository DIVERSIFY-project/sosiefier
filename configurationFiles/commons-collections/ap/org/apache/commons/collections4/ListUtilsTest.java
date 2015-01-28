package org.apache.commons.collections4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import junit.framework.Test;

/** 
 * Tests for ListUtils.
 * 
 * @version $Id$
 */
public class ListUtilsTest extends BulkTest {
    private static final String a = "a";

    private static final String b = "b";

    private static final String c = "c";

    private static final String d = "d";

    private static final String e = "e";

    private static final String x = "x";

    private String[] fullArray;

    private List<java.lang.String> fullList;

    public ListUtilsTest(final String name) {
        super(name);
    }

    public static Test suite() {
        return BulkTest.makeSuite(ListUtilsTest.class);
    }

    @Override
    public void setUp() {
        fullArray = new String[]{ a , b , c , d , e };
        fullList = new ArrayList<java.lang.String>(java.util.Arrays.asList(fullArray));
    }

    public void testNothing() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNothing");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting a non-empty list with an empty list.
     */
public void testIntersectNonEmptyWithEmptyList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectNonEmptyWithEmptyList");
        final List<java.lang.String> empty = Collections.<String>emptyList();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7707,org.apache.commons.collections4.ListUtils.intersection(empty, fullList),7706,org.apache.commons.collections4.ListUtils.intersection(empty, fullList).isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting a non-empty list with an empty list.
     */
public void testIntersectEmptyWithEmptyList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectEmptyWithEmptyList");
        final List<?> empty = Collections.EMPTY_LIST;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7693,org.apache.commons.collections4.ListUtils.intersection(empty, empty),7692,org.apache.commons.collections4.ListUtils.intersection(empty, empty).isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting a non-empty list with an subset of iteself.
     */
public void testIntersectNonEmptySubset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectNonEmptySubset");
        final List<java.lang.String> other = new ArrayList<java.lang.String>(fullList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7700,other,7699,other.remove(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7702,other,7701,other.remove(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7703,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7705,null,7704,org.apache.commons.collections4.ListUtils.intersection(fullList, other));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting a non-empty list with an subset of iteself.
     */
public void testIntersectListWithNoOverlapAndDifferentTypes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectListWithNoOverlapAndDifferentTypes");
        final List<java.lang.Integer> other = java.util.Arrays.asList(0, 23);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7695,org.apache.commons.collections4.ListUtils.intersection(fullList, other),7694,org.apache.commons.collections4.ListUtils.intersection(fullList, other).isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting a non-empty list with an subset of iteself.
     */
public void testIntersectListWithNoOverlapAndDifferentTypes_literalMutation2508() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectListWithNoOverlapAndDifferentTypes_literalMutation2508");
        final List<java.lang.Integer> other = java.util.Arrays.asList(1, 24);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7695,org.apache.commons.collections4.ListUtils.intersection(fullList, other),7694,org.apache.commons.collections4.ListUtils.intersection(fullList, other).isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting a non-empty list with iteself.
     */
public void testIntersectListWithSelf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectListWithSelf");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7696,fullList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7698,null,7697,org.apache.commons.collections4.ListUtils.intersection(fullList, fullList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
@org.junit.Test(timeout = 1000)
    public void testIntersectionOrderInsensitivity_add2483() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_add2483");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("a");
        one.add("a");
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
@org.junit.Test(timeout = 1000)
    public void testIntersectionOrderInsensitivity_add2484() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_add2484");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("a");
        one.add("b");
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
@org.junit.Test(timeout = 1000)
    public void testIntersectionOrderInsensitivity_add2485() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_add2485");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("a");
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
@org.junit.Test(timeout = 1000)
    public void testIntersectionOrderInsensitivity_add2486() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_add2486");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("a");
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
@org.junit.Test(timeout = 1000)
    public void testIntersectionOrderInsensitivity_add2487() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_add2487");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("a");
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
@org.junit.Test(timeout = 1000)
    public void testIntersectionOrderInsensitivity_add2488() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_add2488");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("a");
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
public void testIntersectionOrderInsensitivity() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("foo");
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
public void testIntersectionOrderInsensitivity_literalMutation2510() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_literalMutation2510");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("a");
        one.add("foo");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
public void testIntersectionOrderInsensitivity_literalMutation2511() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_literalMutation2511");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("a");
        one.add("b");
        two.add("foo");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
public void testIntersectionOrderInsensitivity_literalMutation2512() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_literalMutation2512");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("a");
        one.add("b");
        two.add("a");
        two.add("foo");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
public void testIntersectionOrderInsensitivity_literalMutation2513() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_literalMutation2513");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("a");
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("foo");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
public void testIntersectionOrderInsensitivity_literalMutation2514() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_literalMutation2514");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("a");
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
@org.junit.Test(timeout = 1000)
    public void testIntersectionOrderInsensitivity_remove1944() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_remove1944");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
@org.junit.Test(timeout = 1000)
    public void testIntersectionOrderInsensitivity_remove1945() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_remove1945");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
@org.junit.Test(timeout = 1000)
    public void testIntersectionOrderInsensitivity_remove1946() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_remove1946");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
@org.junit.Test(timeout = 1000)
    public void testIntersectionOrderInsensitivity_remove1947() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_remove1947");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
@org.junit.Test(timeout = 1000)
    public void testIntersectionOrderInsensitivity_remove1948() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_remove1948");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting two lists in different orders.
     */
@org.junit.Test(timeout = 1000)
    public void testIntersectionOrderInsensitivity_remove1949() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectionOrderInsensitivity_remove1949");
        final List<java.lang.String> one = new ArrayList<java.lang.String>();
        final List<java.lang.String> two = new ArrayList<java.lang.String>();
        one.add("b");
        two.add("a");
        two.add("a");
        two.add("b");
        two.add("b");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,null,7708,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7711,null,7710,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testPredicatedList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedList");
        final Predicate<java.lang.Object> predicate = new Predicate<java.lang.Object>() {
            public boolean evaluate(final Object o) {
                return o instanceof String;
            }
        };
        List<java.lang.Object> list = org.apache.commons.collections4.ListUtils.predicatedList(new ArrayList<java.lang.Object>(), predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7739,(list instanceof org.apache.commons.collections4.list.PredicatedList));
        try {
            org.apache.commons.collections4.ListUtils.predicatedList(new ArrayList<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ListUtils.predicatedList(null, predicate);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testPredicatedList_add2501() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedList_add2501");
        final Predicate<java.lang.Object> predicate = new Predicate<java.lang.Object>() {
            public boolean evaluate(final Object o) {
                return o instanceof String;
            }
        };
        List<java.lang.Object> list = org.apache.commons.collections4.ListUtils.predicatedList(new ArrayList<java.lang.Object>(), predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7739,(list instanceof org.apache.commons.collections4.list.PredicatedList));
        try {
            org.apache.commons.collections4.ListUtils.predicatedList(new ArrayList<java.lang.Object>(), null);
            org.apache.commons.collections4.ListUtils.predicatedList(new ArrayList<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ListUtils.predicatedList(null, predicate);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testPredicatedList_add2502() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedList_add2502");
        final Predicate<java.lang.Object> predicate = new Predicate<java.lang.Object>() {
            public boolean evaluate(final Object o) {
                return o instanceof String;
            }
        };
        List<java.lang.Object> list = org.apache.commons.collections4.ListUtils.predicatedList(new ArrayList<java.lang.Object>(), predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7739,(list instanceof org.apache.commons.collections4.list.PredicatedList));
        try {
            org.apache.commons.collections4.ListUtils.predicatedList(new ArrayList<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ListUtils.predicatedList(null, predicate);
            org.apache.commons.collections4.ListUtils.predicatedList(null, predicate);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testPredicatedList_remove1952() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedList_remove1952");
        final Predicate<java.lang.Object> predicate = new Predicate<java.lang.Object>() {
            public boolean evaluate(final Object o) {
                return o instanceof String;
            }
        };
        List<java.lang.Object> list = org.apache.commons.collections4.ListUtils.predicatedList(new ArrayList<java.lang.Object>(), predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7739,(list instanceof org.apache.commons.collections4.list.PredicatedList));
        try {
            org.apache.commons.collections4.ListUtils.predicatedList(new ArrayList<java.lang.Object>(), null);
        } catch (final IllegalArgumentException ex) {
        }
        try {
            org.apache.commons.collections4.ListUtils.predicatedList(null, predicate);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testLazyList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLazyList");
        final List<java.lang.Integer> list = org.apache.commons.collections4.ListUtils.lazyList(new ArrayList<java.lang.Integer>(), new org.apache.commons.collections4.Factory<java.lang.Integer>() {
            private int index;

            public Integer create() {
                (index)++;
                return Integer.valueOf(index);
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7713,list,7712,list.get(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7715,list,7714,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7717,list,7716,list.get(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7719,list,7718,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testLazyList_remove1950() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLazyList_remove1950");
        final List<java.lang.Integer> list = org.apache.commons.collections4.ListUtils.lazyList(new ArrayList<java.lang.Integer>(), new org.apache.commons.collections4.Factory<java.lang.Integer>() {
            private int index;

            public Integer create() {
                (index)++;
                return Integer.valueOf(index);
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7713,list,7712,list.get(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7715,list,7714,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7717,list,7716,list.get(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7719,list,7718,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyIfNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIfNull");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7658,org.apache.commons.collections4.ListUtils.emptyIfNull(null),7657,org.apache.commons.collections4.ListUtils.emptyIfNull(null).isEmpty());
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7659,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7661,null,7660,org.apache.commons.collections4.ListUtils.emptyIfNull(list));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultIfNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultIfNull");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7653,org.apache.commons.collections4.ListUtils.defaultIfNull(null, java.util.Collections.emptyList()),7652,org.apache.commons.collections4.ListUtils.defaultIfNull(null, java.util.Collections.emptyList()).isEmpty());
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7654,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7656,null,7655,org.apache.commons.collections4.ListUtils.defaultIfNull(list, java.util.Collections.<java.lang.Long>emptyList()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7663,a,7662,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7665,null,7664,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7667,null,7666,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7669,null,7668,org.apache.commons.collections4.ListUtils.isEqualList(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7671,null,7670,org.apache.commons.collections4.ListUtils.isEqualList(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7673,null,7672,org.apache.commons.collections4.ListUtils.isEqualList(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testEquals_add2481() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_add2481");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7663,a,7662,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7665,null,7664,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        a.clear();
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7667,null,7666,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7669,null,7668,org.apache.commons.collections4.ListUtils.isEqualList(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7671,null,7670,org.apache.commons.collections4.ListUtils.isEqualList(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7673,null,7672,org.apache.commons.collections4.ListUtils.isEqualList(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation2499() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation2499");
        final Collection<java.lang.String> data = java.util.Arrays.asList("foo", "b", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7663,a,7662,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7665,null,7664,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7667,null,7666,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7669,null,7668,org.apache.commons.collections4.ListUtils.isEqualList(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7671,null,7670,org.apache.commons.collections4.ListUtils.isEqualList(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7673,null,7672,org.apache.commons.collections4.ListUtils.isEqualList(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation2500() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation2500");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "foo", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7663,a,7662,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7665,null,7664,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7667,null,7666,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7669,null,7668,org.apache.commons.collections4.ListUtils.isEqualList(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7671,null,7670,org.apache.commons.collections4.ListUtils.isEqualList(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7673,null,7672,org.apache.commons.collections4.ListUtils.isEqualList(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation2501() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation2501");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "foo");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7663,a,7662,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7665,null,7664,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7667,null,7666,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7669,null,7668,org.apache.commons.collections4.ListUtils.isEqualList(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7671,null,7670,org.apache.commons.collections4.ListUtils.isEqualList(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7673,null,7672,org.apache.commons.collections4.ListUtils.isEqualList(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testEquals_remove1942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_remove1942");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7663,a,7662,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7665,null,7664,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7667,null,7666,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7669,null,7668,org.apache.commons.collections4.ListUtils.isEqualList(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7671,null,7670,org.apache.commons.collections4.ListUtils.isEqualList(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7673,null,7672,org.apache.commons.collections4.ListUtils.isEqualList(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7674,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7675,((a.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7676,((b.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7677,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7678,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7680,null,7679,org.apache.commons.collections4.ListUtils.hashCodeForList(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testHashCode_add2482() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_add2482");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7674,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7675,((a.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7676,((b.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7677,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        a.clear();
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7678,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7680,null,7679,org.apache.commons.collections4.ListUtils.hashCodeForList(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation2502() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation2502");
        final Collection<java.lang.String> data = java.util.Arrays.asList("foo", "b", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7674,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7675,((a.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7676,((b.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7677,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7678,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7680,null,7679,org.apache.commons.collections4.ListUtils.hashCodeForList(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation2503() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation2503");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "foo", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7674,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7675,((a.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7676,((b.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7677,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7678,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7680,null,7679,org.apache.commons.collections4.ListUtils.hashCodeForList(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation2504() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation2504");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "foo");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7674,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7675,((a.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7676,((b.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7677,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7678,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7680,null,7679,org.apache.commons.collections4.ListUtils.hashCodeForList(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testHashCode_remove1943() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_remove1943");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7674,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7675,((a.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7676,((b.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7677,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7678,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7680,null,7679,org.apache.commons.collections4.ListUtils.hashCodeForList(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRetainAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7743,((retained.size()) == 2));
        sub.remove(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7745,retained,7744,retained.equals(sub));
        fullList.retainAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,retained,7746,retained.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRetainAll_add2508() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_add2508");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7743,((retained.size()) == 2));
        sub.remove(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7745,retained,7744,retained.equals(sub));
        fullList.retainAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,retained,7746,retained.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRetainAll_add2509() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_add2509");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7743,((retained.size()) == 2));
        sub.remove(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7745,retained,7744,retained.equals(sub));
        fullList.retainAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,retained,7746,retained.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRetainAll_add2510() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_add2510");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7743,((retained.size()) == 2));
        sub.remove(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7745,retained,7744,retained.equals(sub));
        fullList.retainAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,retained,7746,retained.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRetainAll_add2511() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_add2511");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7743,((retained.size()) == 2));
        sub.remove(x);
        sub.remove(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7745,retained,7744,retained.equals(sub));
        fullList.retainAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,retained,7746,retained.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRetainAll_add2512() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_add2512");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7743,((retained.size()) == 2));
        sub.remove(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7745,retained,7744,retained.equals(sub));
        fullList.retainAll(sub);
        fullList.retainAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,retained,7746,retained.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRetainAll_add2513() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_add2513");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7743,((retained.size()) == 2));
        sub.remove(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7745,retained,7744,retained.equals(sub));
        fullList.retainAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,retained,7746,retained.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRetainAll_remove1957() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_remove1957");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7743,((retained.size()) == 2));
        sub.remove(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7745,retained,7744,retained.equals(sub));
        fullList.retainAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,retained,7746,retained.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRetainAll_remove1958() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_remove1958");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7743,((retained.size()) == 2));
        sub.remove(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7745,retained,7744,retained.equals(sub));
        fullList.retainAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,retained,7746,retained.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRetainAll_remove1959() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_remove1959");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7743,((retained.size()) == 2));
        sub.remove(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7745,retained,7744,retained.equals(sub));
        fullList.retainAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,retained,7746,retained.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRetainAll_remove1960() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_remove1960");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7743,((retained.size()) == 2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7745,retained,7744,retained.equals(sub));
        fullList.retainAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,retained,7746,retained.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRetainAll_remove1961() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll_remove1961");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7743,((retained.size()) == 2));
        sub.remove(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7745,retained,7744,retained.equals(sub));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,retained,7746,retained.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.retainAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> remainder = org.apache.commons.collections4.ListUtils.removeAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7740,((remainder.size()) == 3));
        fullList.removeAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7742,remainder,7741,remainder.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveAll_add2503() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_add2503");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> remainder = org.apache.commons.collections4.ListUtils.removeAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7740,((remainder.size()) == 3));
        fullList.removeAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7742,remainder,7741,remainder.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveAll_add2504() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_add2504");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> remainder = org.apache.commons.collections4.ListUtils.removeAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7740,((remainder.size()) == 3));
        fullList.removeAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7742,remainder,7741,remainder.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveAll_add2505() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_add2505");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        sub.add(x);
        final List<java.lang.String> remainder = org.apache.commons.collections4.ListUtils.removeAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7740,((remainder.size()) == 3));
        fullList.removeAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7742,remainder,7741,remainder.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveAll_add2506() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_add2506");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> remainder = org.apache.commons.collections4.ListUtils.removeAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7740,((remainder.size()) == 3));
        fullList.removeAll(sub);
        fullList.removeAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7742,remainder,7741,remainder.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveAll_add2507() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_add2507");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> remainder = org.apache.commons.collections4.ListUtils.removeAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7740,((remainder.size()) == 3));
        fullList.removeAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7742,remainder,7741,remainder.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.removeAll(null, null);
            org.apache.commons.collections4.ListUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveAll_remove1953() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_remove1953");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> remainder = org.apache.commons.collections4.ListUtils.removeAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7740,((remainder.size()) == 3));
        fullList.removeAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7742,remainder,7741,remainder.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveAll_remove1954() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_remove1954");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> remainder = org.apache.commons.collections4.ListUtils.removeAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7740,((remainder.size()) == 3));
        fullList.removeAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7742,remainder,7741,remainder.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveAll_remove1955() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_remove1955");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> remainder = org.apache.commons.collections4.ListUtils.removeAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7740,((remainder.size()) == 3));
        fullList.removeAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7742,remainder,7741,remainder.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testRemoveAll_remove1956() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveAll_remove1956");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> remainder = org.apache.commons.collections4.ListUtils.removeAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7740,((remainder.size()) == 3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7742,remainder,7741,remainder.equals(fullList));
        try {
            org.apache.commons.collections4.ListUtils.removeAll(null, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubtract() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_add2522() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_add2522");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(a);
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_add2523() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_add2523");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(b);
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_add2524() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_add2524");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(b);
        list.add(a);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_add2525() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_add2525");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(b);
        list.add(a);
        list.add(x);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_add2526() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_add2526");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_add2527() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_add2527");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_add2528() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_add2528");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_add2529() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_add2529");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_add2530() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_add2530");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_remove1970() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_remove1970");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_remove1971() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_remove1971");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_remove1972() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_remove1972");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_remove1973() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_remove1973");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_remove1974() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_remove1974");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_remove1975() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_remove1975");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_remove1976() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_remove1976");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtract_remove1977() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtract_remove1977");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(b);
        list.add(a);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7771,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(a);
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_add2532() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_add2532");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_add2533() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_add2533");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_add2534() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_add2534");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(null);
        list.add(null);
        list.add(x);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_add2535() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_add2535");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_add2536() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_add2536");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_add2537() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_add2537");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_add2538() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_add2538");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_remove1978() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_remove1978");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_remove1979() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_remove1979");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_remove1980() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_remove1980");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_remove1981() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_remove1981");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_remove1982() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_remove1982");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_remove1983() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_remove1983");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_remove1984() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_remove1984");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSubtractNullElement_remove1985() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement_remove1985");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7773,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7775,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>indexOf</code> method in <code>ListUtils</code> class..
     */
public void testIndexOf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf");
        Predicate<java.lang.String> testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("d");
        int index = org.apache.commons.collections4.ListUtils.indexOf(fullList, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7681,org.apache.commons.collections4.ListUtilsTest.d);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7683,fullList,7682,fullList.get(index));
        testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("de");
        index = org.apache.commons.collections4.ListUtils.indexOf(fullList, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7684,index);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7685,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7687,null,7686,org.apache.commons.collections4.ListUtils.indexOf(null, testPredicate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7688,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7690,null,7689,org.apache.commons.collections4.ListUtils.indexOf(fullList, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7691,-1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>indexOf</code> method in <code>ListUtils</code> class..
     */
public void testIndexOf_literalMutation2505() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_literalMutation2505");
        Predicate<java.lang.String> testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo");
        int index = org.apache.commons.collections4.ListUtils.indexOf(fullList, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7681,org.apache.commons.collections4.ListUtilsTest.d);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7683,fullList,7682,fullList.get(index));
        testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("de");
        index = org.apache.commons.collections4.ListUtils.indexOf(fullList, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7684,index);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7685,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7687,null,7686,org.apache.commons.collections4.ListUtils.indexOf(null, testPredicate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7688,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7690,null,7689,org.apache.commons.collections4.ListUtils.indexOf(fullList, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7691,-1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>indexOf</code> method in <code>ListUtils</code> class..
     */
public void testIndexOf_literalMutation2506() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_literalMutation2506");
        Predicate<java.lang.String> testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("d");
        int index = org.apache.commons.collections4.ListUtils.indexOf(fullList, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7681,org.apache.commons.collections4.ListUtilsTest.d);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7683,fullList,7682,fullList.get(index));
        testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo");
        index = org.apache.commons.collections4.ListUtils.indexOf(fullList, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7684,index);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7685,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7687,null,7686,org.apache.commons.collections4.ListUtils.indexOf(null, testPredicate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7688,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7690,null,7689,org.apache.commons.collections4.ListUtils.indexOf(fullList, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7691,-1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testLongestCommonSubsequence_add2490() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequence_add2490");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((List<?>)(null)), null);
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((List<?>)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(java.util.Arrays.asList('A'), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, java.util.Arrays.asList('A'));
        } catch (final IllegalArgumentException e) {
        }
        @SuppressWarnings(value = "unchecked")
        List<java.lang.Character> lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7727,lcs,7726,lcs.size());
        List<java.lang.Character> list1 = java.util.Arrays.asList('B', 'A', 'N', 'A', 'N', 'A');
        List<java.lang.Character> list2 = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A', 'S');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list2);
        List<java.lang.Character> expected = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7728,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7729,lcs);
        List<java.lang.Character> list3 = java.util.Arrays.asList('A', 'T', 'A', 'N', 'A');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list3);
        expected = java.util.Arrays.asList('A', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7730,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7731,lcs);
        List<java.lang.Character> listZorro = java.util.Arrays.asList('Z', 'O', 'R', 'R', 'O');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, listZorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7733,lcs,7732,lcs.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testLongestCommonSubsequence_add2491() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequence_add2491");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((List<?>)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(java.util.Arrays.asList('A'), null);
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(java.util.Arrays.asList('A'), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, java.util.Arrays.asList('A'));
        } catch (final IllegalArgumentException e) {
        }
        @SuppressWarnings(value = "unchecked")
        List<java.lang.Character> lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7727,lcs,7726,lcs.size());
        List<java.lang.Character> list1 = java.util.Arrays.asList('B', 'A', 'N', 'A', 'N', 'A');
        List<java.lang.Character> list2 = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A', 'S');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list2);
        List<java.lang.Character> expected = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7728,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7729,lcs);
        List<java.lang.Character> list3 = java.util.Arrays.asList('A', 'T', 'A', 'N', 'A');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list3);
        expected = java.util.Arrays.asList('A', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7730,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7731,lcs);
        List<java.lang.Character> listZorro = java.util.Arrays.asList('Z', 'O', 'R', 'R', 'O');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, listZorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7733,lcs,7732,lcs.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testLongestCommonSubsequence_add2492() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequence_add2492");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((List<?>)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(java.util.Arrays.asList('A'), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, java.util.Arrays.asList('A'));
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, java.util.Arrays.asList('A'));
        } catch (final IllegalArgumentException e) {
        }
        @SuppressWarnings(value = "unchecked")
        List<java.lang.Character> lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7727,lcs,7726,lcs.size());
        List<java.lang.Character> list1 = java.util.Arrays.asList('B', 'A', 'N', 'A', 'N', 'A');
        List<java.lang.Character> list2 = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A', 'S');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list2);
        List<java.lang.Character> expected = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7728,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7729,lcs);
        List<java.lang.Character> list3 = java.util.Arrays.asList('A', 'T', 'A', 'N', 'A');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list3);
        expected = java.util.Arrays.asList('A', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7730,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7731,lcs);
        List<java.lang.Character> listZorro = java.util.Arrays.asList('Z', 'O', 'R', 'R', 'O');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, listZorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7733,lcs,7732,lcs.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testLongestCommonSubsequence() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequence");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((List<?>)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(java.util.Arrays.asList('A'), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, java.util.Arrays.asList('A'));
        } catch (final IllegalArgumentException e) {
        }
        @SuppressWarnings(value = "unchecked")
        List<java.lang.Character> lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7727,lcs,7726,lcs.size());
        List<java.lang.Character> list1 = java.util.Arrays.asList('B', 'A', 'N', 'A', 'N', 'A');
        List<java.lang.Character> list2 = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A', 'S');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list2);
        List<java.lang.Character> expected = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7728,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7729,lcs);
        List<java.lang.Character> list3 = java.util.Arrays.asList('A', 'T', 'A', 'N', 'A');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list3);
        expected = java.util.Arrays.asList('A', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7730,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7731,lcs);
        List<java.lang.Character> listZorro = java.util.Arrays.asList('Z', 'O', 'R', 'R', 'O');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, listZorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7733,lcs,7732,lcs.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testLongestCommonSubsequence_literalMutation2522() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequence_literalMutation2522");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((List<?>)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(java.util.Arrays.asList('A'), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, java.util.Arrays.asList('A'));
        } catch (final IllegalArgumentException e) {
        }
        @SuppressWarnings(value = "unchecked")
        List<java.lang.Character> lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7727,lcs,7726,lcs.size());
        List<java.lang.Character> list1 = java.util.Arrays.asList('B', 'A', 'N', 'A', 'N', 'A');
        List<java.lang.Character> list2 = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A', 'S');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list2);
        List<java.lang.Character> expected = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7728,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7729,lcs);
        List<java.lang.Character> list3 = java.util.Arrays.asList('A', 'T', 'A', 'N', 'A');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list3);
        expected = java.util.Arrays.asList('A', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7730,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7731,lcs);
        List<java.lang.Character> listZorro = java.util.Arrays.asList('Z', 'O', 'R', 'R', 'O');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, listZorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7733,lcs,7732,lcs.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testLongestCommonSubsequenceWithString_add2493() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequenceWithString_add2493");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((String)(null)), null);
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((String)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence("A", null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, "A");
        } catch (final IllegalArgumentException e) {
        }
        String lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence("", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7721,lcs,7720,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7722,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7723,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7725,lcs,7724,lcs.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testLongestCommonSubsequenceWithString_add2494() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequenceWithString_add2494");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((String)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence("A", null);
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence("A", null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, "A");
        } catch (final IllegalArgumentException e) {
        }
        String lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence("", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7721,lcs,7720,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7722,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7723,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7725,lcs,7724,lcs.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testLongestCommonSubsequenceWithString_add2495() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequenceWithString_add2495");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((String)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence("A", null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, "A");
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, "A");
        } catch (final IllegalArgumentException e) {
        }
        String lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence("", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7721,lcs,7720,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7722,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7723,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7725,lcs,7724,lcs.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongestCommonSubsequenceWithString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequenceWithString");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((String)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence("foo", null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, "A");
        } catch (final IllegalArgumentException e) {
        }
        String lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence("", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7721,lcs,7720,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7722,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7723,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7725,lcs,7724,lcs.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongestCommonSubsequenceWithString_literalMutation2559() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequenceWithString_literalMutation2559");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((String)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence("A", null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, "foo");
        } catch (final IllegalArgumentException e) {
        }
        String lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence("", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7721,lcs,7720,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7722,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7723,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7725,lcs,7724,lcs.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongestCommonSubsequenceWithString_literalMutation2560() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequenceWithString_literalMutation2560");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((String)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence("A", null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, "A");
        } catch (final IllegalArgumentException e) {
        }
        String lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence("foo", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7721,lcs,7720,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7722,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7723,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7725,lcs,7724,lcs.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongestCommonSubsequenceWithString_literalMutation2561() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequenceWithString_literalMutation2561");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((String)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence("A", null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, "A");
        } catch (final IllegalArgumentException e) {
        }
        String lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence("", "foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7721,lcs,7720,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7722,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7723,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7725,lcs,7724,lcs.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongestCommonSubsequenceWithString_literalMutation2562() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequenceWithString_literalMutation2562");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((String)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence("A", null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, "A");
        } catch (final IllegalArgumentException e) {
        }
        String lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence("", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7721,lcs,7720,lcs.length());
        String banana = "foo";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7722,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7723,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7725,lcs,7724,lcs.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongestCommonSubsequenceWithString_literalMutation2563() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequenceWithString_literalMutation2563");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((String)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence("A", null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, "A");
        } catch (final IllegalArgumentException e) {
        }
        String lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence("", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7721,lcs,7720,lcs.length());
        String banana = "BANANA";
        String ananas = "foo";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7722,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7723,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7725,lcs,7724,lcs.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongestCommonSubsequenceWithString_literalMutation2564() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequenceWithString_literalMutation2564");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((String)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence("A", null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, "A");
        } catch (final IllegalArgumentException e) {
        }
        String lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence("", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7721,lcs,7720,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7722,lcs);
        String atana = "foo";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7723,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7725,lcs,7724,lcs.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testLongestCommonSubsequenceWithString_literalMutation2565() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLongestCommonSubsequenceWithString_literalMutation2565");
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(((String)(null)), null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence("A", null);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.longestCommonSubsequence(null, "A");
        } catch (final IllegalArgumentException e) {
        }
        String lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence("", "");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7721,lcs,7720,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7722,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7723,lcs);
        String zorro = "foo";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7725,lcs,7724,lcs.length());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testPartition_add2496() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPartition_add2496");
        final List<java.lang.Integer> strings = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i <= 6 ; i++) {
            strings.add(i);
            strings.add(i);
        }
        final List<java.util.List<java.lang.Integer>> partition = org.apache.commons.collections4.ListUtils.partition(strings, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,partition,7735,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,partition.get(2),7737,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, -10);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testPartition_add2497() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPartition_add2497");
        final List<java.lang.Integer> strings = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i <= 6 ; i++) {
            strings.add(i);
        }
        final List<java.util.List<java.lang.Integer>> partition = org.apache.commons.collections4.ListUtils.partition(strings, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,partition,7735,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,partition.get(2),7737,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, -10);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testPartition_add2498() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPartition_add2498");
        final List<java.lang.Integer> strings = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i <= 6 ; i++) {
            strings.add(i);
        }
        final List<java.util.List<java.lang.Integer>> partition = org.apache.commons.collections4.ListUtils.partition(strings, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,partition,7735,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,partition.get(2),7737,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, -10);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testPartition_add2499() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPartition_add2499");
        final List<java.lang.Integer> strings = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i <= 6 ; i++) {
            strings.add(i);
        }
        final List<java.util.List<java.lang.Integer>> partition = org.apache.commons.collections4.ListUtils.partition(strings, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,partition,7735,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,partition.get(2),7737,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, -10);
            org.apache.commons.collections4.ListUtils.partition(strings, -10);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testPartition() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPartition");
        final List<java.lang.Integer> strings = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i <= 6 ; i++) {
            strings.add(i);
        }
        final List<java.util.List<java.lang.Integer>> partition = org.apache.commons.collections4.ListUtils.partition(strings, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,partition,7735,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,partition.get(2),7737,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, -10);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testPartition_literalMutation2567() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPartition_literalMutation2567");
        final List<java.lang.Integer> strings = new ArrayList<java.lang.Integer>();
        for (int i = -1 ; i <= 6 ; i++) {
            strings.add(i);
        }
        final List<java.util.List<java.lang.Integer>> partition = org.apache.commons.collections4.ListUtils.partition(strings, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,partition,7735,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,partition.get(2),7737,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, -10);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testPartition_literalMutation2568() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPartition_literalMutation2568");
        final List<java.lang.Integer> strings = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i <= 7 ; i++) {
            strings.add(i);
        }
        final List<java.util.List<java.lang.Integer>> partition = org.apache.commons.collections4.ListUtils.partition(strings, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,partition,7735,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,partition.get(2),7737,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, -10);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testPartition_literalMutation2569() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPartition_literalMutation2569");
        final List<java.lang.Integer> strings = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i <= 6 ; i++) {
            strings.add(i);
        }
        final List<java.util.List<java.lang.Integer>> partition = org.apache.commons.collections4.ListUtils.partition(strings, 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,partition,7735,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,partition.get(2),7737,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, -10);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testPartition_literalMutation2571() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPartition_literalMutation2571");
        final List<java.lang.Integer> strings = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i <= 6 ; i++) {
            strings.add(i);
        }
        final List<java.util.List<java.lang.Integer>> partition = org.apache.commons.collections4.ListUtils.partition(strings, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,partition,7735,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,partition.get(2),7737,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 2);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, -10);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testPartition_literalMutation2572() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPartition_literalMutation2572");
        final List<java.lang.Integer> strings = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i <= 6 ; i++) {
            strings.add(i);
        }
        final List<java.util.List<java.lang.Integer>> partition = org.apache.commons.collections4.ListUtils.partition(strings, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,partition,7735,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,partition.get(2),7737,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, -1);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, -10);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testPartition_literalMutation2573() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPartition_literalMutation2573");
        final List<java.lang.Integer> strings = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i <= 6 ; i++) {
            strings.add(i);
        }
        final List<java.util.List<java.lang.Integer>> partition = org.apache.commons.collections4.ListUtils.partition(strings, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,partition,7735,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,partition.get(2),7737,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 9);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testPartition_remove1951() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPartition_remove1951");
        final List<java.lang.Integer> strings = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i <= 6 ; i++) {
        }
        final List<java.util.List<java.lang.Integer>> partition = org.apache.commons.collections4.ListUtils.partition(strings, 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,partition,7735,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,partition.get(2),7737,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, -10);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static Predicate<java.lang.Number> EQUALS_TWO = new Predicate<java.lang.Number>() {
        public boolean evaluate(final Number input) {
            return (input.intValue()) == 2;
        }
    };

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelect_add2514() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_add2514");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelect_add2515() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_add2515");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelect_add2516() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_add2516");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelect_add2517() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_add2517");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelect() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelect_literalMutation2582() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_literalMutation2582");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelect_literalMutation2583() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_literalMutation2583");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelect_literalMutation2584() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_literalMutation2584");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelect_literalMutation2585() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_literalMutation2585");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelect_remove1962() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_remove1962");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelect_remove1963() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_remove1963");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelect_remove1964() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_remove1964");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelect_remove1965() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_remove1965");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,null,7762,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,list,7764,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,output1,7766,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7769,output2.iterator(),7768,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelectRejected_add2518() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_add2518");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelectRejected_add2519() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_add2519");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(2L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelectRejected_add2520() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_add2520");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelectRejected_add2521() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_add2521");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelectRejected() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelectRejected_literalMutation2587() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_literalMutation2587");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(0L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelectRejected_literalMutation2588() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_literalMutation2588");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(3L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelectRejected_literalMutation2589() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_literalMutation2589");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(2L);
        list.add(4L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelectRejected_literalMutation2590() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_literalMutation2590");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(3L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelectRejected_remove1966() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_remove1966");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(2L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelectRejected_remove1967() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_remove1967");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(2L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelectRejected_remove1968() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_remove1968");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(2L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    @org.junit.Test(timeout = 1000)
    public void testSelectRejected_remove1969() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_remove1969");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(2L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7749,null,7748,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7751,null,7750,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,list,7752,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,output1,7754,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7757,output1,7756,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,output1,7758,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,output1,7760,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

