package org.apache.commons.collections4;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.StringTokenizer;
import junit.framework.Test;

/** 
 * Tests EnumerationUtils.
 * 
 * @version $Id$
 */
public class EnumerationUtilsTest extends BulkTest {
    public EnumerationUtilsTest(final String name) {
        super(name);
    }

    public static final String TO_LIST_FIXTURE = "this is a test";

    @org.junit.Test(timeout = 1000)
    public void testToListWithStringTokenizer_add2393() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer_add2393");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("this");
        expectedList2.add("is");
        expectedList2.add("a");
        expectedList2.add("test");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithStringTokenizer_add2394() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer_add2394");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("this");
        expectedList2.add("this");
        expectedList2.add("is");
        expectedList2.add("a");
        expectedList2.add("test");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithStringTokenizer_add2395() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer_add2395");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("this");
        expectedList2.add("is");
        expectedList2.add("is");
        expectedList2.add("a");
        expectedList2.add("test");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithStringTokenizer_add2396() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer_add2396");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("this");
        expectedList2.add("is");
        expectedList2.add("a");
        expectedList2.add("a");
        expectedList2.add("test");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithStringTokenizer_add2397() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer_add2397");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("this");
        expectedList2.add("is");
        expectedList2.add("a");
        expectedList2.add("test");
        expectedList2.add("test");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithStringTokenizer() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("foo");
        expectedList2.add("is");
        expectedList2.add("a");
        expectedList2.add("test");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithStringTokenizer_literalMutation2384() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer_literalMutation2384");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("this");
        expectedList2.add("foo");
        expectedList2.add("a");
        expectedList2.add("test");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithStringTokenizer_literalMutation2385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer_literalMutation2385");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("this");
        expectedList2.add("is");
        expectedList2.add("foo");
        expectedList2.add("test");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithStringTokenizer_literalMutation2386() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer_literalMutation2386");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("this");
        expectedList2.add("is");
        expectedList2.add("a");
        expectedList2.add("foo");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithStringTokenizer_remove1895() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer_remove1895");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("is");
        expectedList2.add("a");
        expectedList2.add("test");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithStringTokenizer_remove1896() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer_remove1896");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("is");
        expectedList2.add("a");
        expectedList2.add("test");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithStringTokenizer_remove1897() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer_remove1897");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("is");
        expectedList2.add("a");
        expectedList2.add("test");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithStringTokenizer_remove1898() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithStringTokenizer_remove1898");
        final List<java.lang.String> expectedList1 = new ArrayList<java.lang.String>();
        final StringTokenizer st = new StringTokenizer(TO_LIST_FIXTURE);
        while (st.hasMoreTokens()) {
            expectedList1.add(st.nextToken());
        }
        final List<java.lang.String> expectedList2 = new ArrayList<java.lang.String>();
        expectedList2.add("is");
        expectedList2.add("a");
        expectedList2.add("test");
        final List<java.lang.String> actualList = org.apache.commons.collections4.EnumerationUtils.toList(new StringTokenizer(TO_LIST_FIXTURE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7340,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7341,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7343,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7345,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_add2384() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_add2384");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_add2385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_add2385");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_add2386() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_add2386");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_add2387() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_add2387");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_add2388() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_add2388");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_add2389() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_add2389");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_add2390() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_add2390");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_add2391() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_add2391");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_add2392() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_add2392");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("foo", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2372() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2372");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(2));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2373() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2373");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("foo", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2374() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2374");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(3));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2375() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2375");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("foo", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2376() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2376");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(4));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2377() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2377");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(0));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2378() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2378");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(3));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2379() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2379");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2380() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2380");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("foo");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2381() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2381");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("foo");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2382() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2382");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_remove1886() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_remove1886");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_remove1887() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_remove1887");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_remove1888() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_remove1888");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_remove1889() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_remove1889");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_remove1890() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_remove1890");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_remove1891() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_remove1891");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_remove1892() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_remove1892");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_remove1893() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_remove1893");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testToListWithHashtable_remove1894() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_remove1894");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7317,expected,7316,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7319,actualEltList,7318,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7321,actualEltList,7320,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7323,actualEltList,7322,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7325,actualEltList,7324,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7327,actualEltList,7326,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7329,expected,7328,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7331,actualEltList,7330,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7333,actualKeyList,7332,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7335,actualKeyList,7334,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7337,actualKeyList,7336,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7339,actualKeyList,7338,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public static Test suite() {
        return BulkTest.makeSuite(EnumerationUtilsTest.class);
    }
}

