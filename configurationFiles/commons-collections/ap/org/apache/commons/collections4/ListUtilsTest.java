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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7732,org.apache.commons.collections4.ListUtils.intersection(empty, fullList),7731,org.apache.commons.collections4.ListUtils.intersection(empty, fullList).isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting a non-empty list with an empty list.
     */
public void testIntersectEmptyWithEmptyList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectEmptyWithEmptyList");
        final List<?> empty = Collections.EMPTY_LIST;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7718,org.apache.commons.collections4.ListUtils.intersection(empty, empty),7717,org.apache.commons.collections4.ListUtils.intersection(empty, empty).isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting a non-empty list with an subset of iteself.
     */
public void testIntersectNonEmptySubset() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectNonEmptySubset");
        final List<java.lang.String> other = new ArrayList<java.lang.String>(fullList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7725,other,7724,other.remove(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7727,other,7726,other.remove(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7728,other);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7730,null,7729,org.apache.commons.collections4.ListUtils.intersection(fullList, other));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting a non-empty list with an subset of iteself.
     */
public void testIntersectListWithNoOverlapAndDifferentTypes() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectListWithNoOverlapAndDifferentTypes");
        final List<java.lang.Integer> other = java.util.Arrays.asList(0, 23);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7720,org.apache.commons.collections4.ListUtils.intersection(fullList, other),7719,org.apache.commons.collections4.ListUtils.intersection(fullList, other).isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting a non-empty list with an subset of iteself.
     */
public void testIntersectListWithNoOverlapAndDifferentTypes_literalMutation2508() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectListWithNoOverlapAndDifferentTypes_literalMutation2508");
        final List<java.lang.Integer> other = java.util.Arrays.asList(1, 22);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7720,org.apache.commons.collections4.ListUtils.intersection(fullList, other),7719,org.apache.commons.collections4.ListUtils.intersection(fullList, other).isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests intersecting a non-empty list with iteself.
     */
public void testIntersectListWithSelf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIntersectListWithSelf");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7721,fullList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7723,null,7722,org.apache.commons.collections4.ListUtils.intersection(fullList, fullList));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,null,7733,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,null,7735,org.apache.commons.collections4.ListUtils.intersection(two, one));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,null,7733,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,null,7735,org.apache.commons.collections4.ListUtils.intersection(two, one));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,null,7733,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,null,7735,org.apache.commons.collections4.ListUtils.intersection(two, one));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,null,7733,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,null,7735,org.apache.commons.collections4.ListUtils.intersection(two, one));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,null,7733,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,null,7735,org.apache.commons.collections4.ListUtils.intersection(two, one));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7734,null,7733,org.apache.commons.collections4.ListUtils.intersection(one, two));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7736,null,7735,org.apache.commons.collections4.ListUtils.intersection(two, one));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testPredicatedList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testPredicatedList");
        final Predicate<java.lang.Object> predicate = new Predicate<java.lang.Object>() {
            public boolean evaluate(final Object o) {
                return o instanceof String;
            }
        };
        List<java.lang.Object> list = org.apache.commons.collections4.ListUtils.predicatedList(new ArrayList<java.lang.Object>(), predicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7764,(list instanceof org.apache.commons.collections4.list.PredicatedList));
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

    public void testLazyList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testLazyList");
        final List<java.lang.Integer> list = org.apache.commons.collections4.ListUtils.lazyList(new ArrayList<java.lang.Integer>(), new org.apache.commons.collections4.Factory<java.lang.Integer>() {
            private int index;

            public Integer create() {
                (index)++;
                return Integer.valueOf(index);
            }
        });
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7738,list,7737,list.get(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7740,list,7739,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7742,list,7741,list.get(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7744,list,7743,list.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyIfNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyIfNull");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7683,org.apache.commons.collections4.ListUtils.emptyIfNull(null),7682,org.apache.commons.collections4.ListUtils.emptyIfNull(null).isEmpty());
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7684,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7686,null,7685,org.apache.commons.collections4.ListUtils.emptyIfNull(list));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDefaultIfNull() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDefaultIfNull");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7678,org.apache.commons.collections4.ListUtils.defaultIfNull(null, java.util.Collections.emptyList()),7677,org.apache.commons.collections4.ListUtils.defaultIfNull(null, java.util.Collections.emptyList()).isEmpty());
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7679,list);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7681,null,7680,org.apache.commons.collections4.ListUtils.defaultIfNull(list, java.util.Collections.<java.lang.Long>emptyList()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7688,a,7687,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7690,null,7689,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7692,null,7691,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7694,null,7693,org.apache.commons.collections4.ListUtils.isEqualList(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7696,null,7695,org.apache.commons.collections4.ListUtils.isEqualList(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7698,null,7697,org.apache.commons.collections4.ListUtils.isEqualList(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation2499() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation2499");
        final Collection<java.lang.String> data = java.util.Arrays.asList("foo", "b", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7688,a,7687,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7690,null,7689,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7692,null,7691,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7694,null,7693,org.apache.commons.collections4.ListUtils.isEqualList(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7696,null,7695,org.apache.commons.collections4.ListUtils.isEqualList(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7698,null,7697,org.apache.commons.collections4.ListUtils.isEqualList(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation2500() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation2500");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "foo", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7688,a,7687,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7690,null,7689,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7692,null,7691,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7694,null,7693,org.apache.commons.collections4.ListUtils.isEqualList(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7696,null,7695,org.apache.commons.collections4.ListUtils.isEqualList(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7698,null,7697,org.apache.commons.collections4.ListUtils.isEqualList(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEquals_literalMutation2501() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals_literalMutation2501");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "foo");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7688,a,7687,a.equals(b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7690,null,7689,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7692,null,7691,org.apache.commons.collections4.ListUtils.isEqualList(a, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7694,null,7693,org.apache.commons.collections4.ListUtils.isEqualList(a, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7696,null,7695,org.apache.commons.collections4.ListUtils.isEqualList(null, b));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7698,null,7697,org.apache.commons.collections4.ListUtils.isEqualList(null, null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7699,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7700,((a.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7701,((b.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7702,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7703,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7705,null,7704,org.apache.commons.collections4.ListUtils.hashCodeForList(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation2502() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation2502");
        final Collection<java.lang.String> data = java.util.Arrays.asList("foo", "b", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7699,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7700,((a.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7701,((b.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7702,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7703,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7705,null,7704,org.apache.commons.collections4.ListUtils.hashCodeForList(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation2503() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation2503");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "foo", "c");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7699,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7700,((a.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7701,((b.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7702,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7703,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7705,null,7704,org.apache.commons.collections4.ListUtils.hashCodeForList(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testHashCode_literalMutation2504() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testHashCode_literalMutation2504");
        final Collection<java.lang.String> data = java.util.Arrays.asList("a", "b", "foo");
        final List<java.lang.String> a = new ArrayList<java.lang.String>(data);
        final List<java.lang.String> b = new ArrayList<java.lang.String>(data);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7699,((a.hashCode()) == (b.hashCode())));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7700,((a.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(a))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7701,((b.hashCode()) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7702,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        a.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7703,((org.apache.commons.collections4.ListUtils.hashCodeForList(a)) == (org.apache.commons.collections4.ListUtils.hashCodeForList(b))));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7705,null,7704,org.apache.commons.collections4.ListUtils.hashCodeForList(null));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRetainAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRetainAll");
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(a);
        sub.add(b);
        sub.add(x);
        final List<java.lang.String> retained = org.apache.commons.collections4.ListUtils.retainAll(fullList, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7768,((retained.size()) == 2));
        sub.remove(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7770,retained,7769,retained.equals(sub));
        fullList.retainAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7772,retained,7771,retained.equals(fullList));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7765,((remainder.size()) == 3));
        fullList.removeAll(sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7767,remainder,7766,remainder.equals(fullList));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7795,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(b);
        expected.add(a);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7796,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7797,result);
        try {
            org.apache.commons.collections4.ListUtils.subtract(list, null);
        } catch (final NullPointerException npe) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSubtractNullElement() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSubtractNullElement");
        final List<java.lang.String> list = new ArrayList<java.lang.String>();
        list.add(a);
        list.add(null);
        list.add(null);
        list.add(x);
        final List<java.lang.String> sub = new ArrayList<java.lang.String>();
        sub.add(null);
        final List<java.lang.String> result = org.apache.commons.collections4.ListUtils.subtract(list, sub);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7798,((result.size()) == 3));
        final List<java.lang.String> expected = new ArrayList<java.lang.String>();
        expected.add(a);
        expected.add(null);
        expected.add(x);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7799,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7800,result);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>indexOf</code> method in <code>ListUtils</code> class..
     */
public void testIndexOf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf");
        Predicate<java.lang.String> testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("d");
        int index = org.apache.commons.collections4.ListUtils.indexOf(fullList, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7706,org.apache.commons.collections4.ListUtilsTest.d);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7708,fullList,7707,fullList.get(index));
        testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("de");
        index = org.apache.commons.collections4.ListUtils.indexOf(fullList, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,index);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7710,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7712,null,7711,org.apache.commons.collections4.ListUtils.indexOf(null, testPredicate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7713,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7715,null,7714,org.apache.commons.collections4.ListUtils.indexOf(fullList, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7716,-1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>indexOf</code> method in <code>ListUtils</code> class..
     */
public void testIndexOf_literalMutation2505() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_literalMutation2505");
        Predicate<java.lang.String> testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo");
        int index = org.apache.commons.collections4.ListUtils.indexOf(fullList, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7706,org.apache.commons.collections4.ListUtilsTest.d);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7708,fullList,7707,fullList.get(index));
        testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("de");
        index = org.apache.commons.collections4.ListUtils.indexOf(fullList, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,index);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7710,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7712,null,7711,org.apache.commons.collections4.ListUtils.indexOf(null, testPredicate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7713,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7715,null,7714,org.apache.commons.collections4.ListUtils.indexOf(fullList, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7716,-1);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Tests the <code>indexOf</code> method in <code>ListUtils</code> class..
     */
public void testIndexOf_literalMutation2506() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIndexOf_literalMutation2506");
        Predicate<java.lang.String> testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("d");
        int index = org.apache.commons.collections4.ListUtils.indexOf(fullList, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7706,org.apache.commons.collections4.ListUtilsTest.d);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7708,fullList,7707,fullList.get(index));
        testPredicate = org.apache.commons.collections4.functors.EqualPredicate.equalPredicate("foo");
        index = org.apache.commons.collections4.ListUtils.indexOf(fullList, testPredicate);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7709,index);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7710,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7712,null,7711,org.apache.commons.collections4.ListUtils.indexOf(null, testPredicate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7713,-1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7715,null,7714,org.apache.commons.collections4.ListUtils.indexOf(fullList, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7716,-1);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7752,lcs,7751,lcs.size());
        List<java.lang.Character> list1 = java.util.Arrays.asList('B', 'A', 'N', 'A', 'N', 'A');
        List<java.lang.Character> list2 = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A', 'S');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list2);
        List<java.lang.Character> expected = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7754,lcs);
        List<java.lang.Character> list3 = java.util.Arrays.asList('A', 'T', 'A', 'N', 'A');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list3);
        expected = java.util.Arrays.asList('A', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7756,lcs);
        List<java.lang.Character> listZorro = java.util.Arrays.asList('Z', 'O', 'R', 'R', 'O');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, listZorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7758,lcs,7757,lcs.isEmpty());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7752,lcs,7751,lcs.size());
        List<java.lang.Character> list1 = java.util.Arrays.asList('B', 'A', 'N', 'A', 'N', 'A');
        List<java.lang.Character> list2 = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A', 'S');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list2);
        List<java.lang.Character> expected = java.util.Arrays.asList('A', 'N', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7753,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7754,lcs);
        List<java.lang.Character> list3 = java.util.Arrays.asList('A', 'T', 'A', 'N', 'A');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, list3);
        expected = java.util.Arrays.asList('A', 'A', 'N', 'A');
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7755,expected);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7756,lcs);
        List<java.lang.Character> listZorro = java.util.Arrays.asList('Z', 'O', 'R', 'R', 'O');
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(list1, listZorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7758,lcs,7757,lcs.isEmpty());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7746,lcs,7745,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7748,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7750,lcs,7749,lcs.length());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7746,lcs,7745,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7748,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7750,lcs,7749,lcs.length());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7746,lcs,7745,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7748,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7750,lcs,7749,lcs.length());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7746,lcs,7745,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7748,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7750,lcs,7749,lcs.length());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7746,lcs,7745,lcs.length());
        String banana = "foo";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7748,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7750,lcs,7749,lcs.length());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7746,lcs,7745,lcs.length());
        String banana = "BANANA";
        String ananas = "foo";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7748,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7750,lcs,7749,lcs.length());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7746,lcs,7745,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,lcs);
        String atana = "foo";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7748,lcs);
        String zorro = "ZORRO";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7750,lcs,7749,lcs.length());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7746,lcs,7745,lcs.length());
        String banana = "BANANA";
        String ananas = "ANANAS";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, ananas);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7747,lcs);
        String atana = "ATANA";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, atana);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7748,lcs);
        String zorro = "foo";
        lcs = org.apache.commons.collections4.ListUtils.longestCommonSubsequence(banana, zorro);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7750,lcs,7749,lcs.length());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,partition,7760,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,partition.get(2),7762,partition.get(2).size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,partition,7760,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,partition.get(2),7762,partition.get(2).size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,partition,7760,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,partition.get(2),7762,partition.get(2).size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,partition,7760,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,partition.get(2),7762,partition.get(2).size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,partition,7760,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,partition.get(2),7762,partition.get(2).size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,partition,7760,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,partition.get(2),7762,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 1);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7759,partition);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7761,partition,7760,partition.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7763,partition.get(2),7762,partition.get(2).size());
        try {
            org.apache.commons.collections4.ListUtils.partition(null, 3);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 0);
        } catch (final IllegalArgumentException e) {
        }
        try {
            org.apache.commons.collections4.ListUtils.partition(strings, 11);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7788,null,7787,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7790,list,7789,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7792,output1,7791,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7794,output2.iterator(),7793,output2.iterator().next());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7788,null,7787,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7790,list,7789,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7792,output1,7791,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7794,output2.iterator(),7793,output2.iterator().next());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7788,null,7787,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7790,list,7789,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7792,output1,7791,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7794,output2.iterator(),7793,output2.iterator().next());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7788,null,7787,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7790,list,7789,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7792,output1,7791,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7794,output2.iterator(),7793,output2.iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelect_literalMutation2585() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelect_literalMutation2585");
        final List<java.lang.Integer> list = new ArrayList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        final List<java.lang.Integer> output1 = org.apache.commons.collections4.ListUtils.select(list, ListUtilsTest.EQUALS_TWO);
        final List<java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.<Number>select(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.select(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7788,null,7787,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7790,list,7789,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7792,output1,7791,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7794,output2.iterator(),7793,output2.iterator().next());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,null,7773,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7776,null,7775,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7778,list,7777,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7780,output1,7779,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7782,output1,7781,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7784,output1,7783,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7786,output1,7785,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelectRejected_literalMutation2586() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_literalMutation2586");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,null,7773,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7776,null,7775,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7778,list,7777,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7780,output1,7779,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7782,output1,7781,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7784,output1,7783,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7786,output1,7785,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelectRejected_literalMutation2587() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_literalMutation2587");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(2L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,null,7773,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7776,null,7775,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7778,list,7777,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7780,output1,7779,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7782,output1,7781,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7784,output1,7783,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7786,output1,7785,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelectRejected_literalMutation2588() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_literalMutation2588");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(1L);
        list.add(3L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,null,7773,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7776,null,7775,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7778,list,7777,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7780,output1,7779,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7782,output1,7781,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7784,output1,7783,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7786,output1,7785,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelectRejected_literalMutation2589() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_literalMutation2589");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(2L);
        list.add(2L);
        list.add(4L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,null,7773,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7776,null,7775,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7778,list,7777,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7780,output1,7779,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7782,output1,7781,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7784,output1,7783,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7786,output1,7785,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "boxing")
    public void testSelectRejected_literalMutation2590() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSelectRejected_literalMutation2590");
        final List<java.lang.Long> list = new ArrayList<java.lang.Long>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(5L);
        final List<java.lang.Long> output1 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final List<? extends java.lang.Number> output2 = org.apache.commons.collections4.ListUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO);
        final HashSet<java.lang.Number> output3 = org.apache.commons.collections4.CollectionUtils.selectRejected(list, ListUtilsTest.EQUALS_TWO, new HashSet<java.lang.Number>());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7774,null,7773,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7776,null,7775,org.apache.commons.collections4.CollectionUtils.isEqualCollection(output1, output3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7778,list,7777,list.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7780,output1,7779,output1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7782,output1,7781,output1.contains(1L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7784,output1,7783,output1.contains(3L));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7786,output1,7785,output1.contains(4L));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

