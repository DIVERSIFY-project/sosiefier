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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7365,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7366,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7367,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7368,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7369,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7370,actualList);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7365,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7366,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7367,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7368,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7369,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7370,actualList);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7365,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7366,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7367,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7368,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7369,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7370,actualList);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7365,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7366,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7367,expectedList1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7368,actualList);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7369,expectedList2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7370,actualList);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("foo", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expected,7341,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,actualEltList,7343,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,actualEltList,7345,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,actualEltList,7347,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7350,actualEltList,7349,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7352,actualEltList,7351,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,expected,7353,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,actualEltList,7355,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,actualKeyList,7357,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,actualKeyList,7359,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,actualKeyList,7361,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,actualKeyList,7363,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2372() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2372");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(0));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expected,7341,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,actualEltList,7343,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,actualEltList,7345,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,actualEltList,7347,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7350,actualEltList,7349,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7352,actualEltList,7351,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,expected,7353,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,actualEltList,7355,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,actualKeyList,7357,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,actualKeyList,7359,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,actualKeyList,7361,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,actualKeyList,7363,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2373() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2373");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("foo", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expected,7341,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,actualEltList,7343,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,actualEltList,7345,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,actualEltList,7347,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7350,actualEltList,7349,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7352,actualEltList,7351,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,expected,7353,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,actualEltList,7355,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,actualKeyList,7357,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,actualKeyList,7359,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,actualKeyList,7361,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,actualKeyList,7363,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2374() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2374");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(1));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expected,7341,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,actualEltList,7343,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,actualEltList,7345,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,actualEltList,7347,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7350,actualEltList,7349,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7352,actualEltList,7351,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,expected,7353,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,actualEltList,7355,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,actualKeyList,7357,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,actualKeyList,7359,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,actualKeyList,7361,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,actualKeyList,7363,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2375() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2375");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("foo", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expected,7341,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,actualEltList,7343,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,actualEltList,7345,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,actualEltList,7347,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7350,actualEltList,7349,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7352,actualEltList,7351,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,expected,7353,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,actualEltList,7355,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,actualKeyList,7357,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,actualKeyList,7359,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,actualKeyList,7361,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,actualKeyList,7363,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2376() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2376");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(2));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expected,7341,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,actualEltList,7343,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,actualEltList,7345,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,actualEltList,7347,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7350,actualEltList,7349,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7352,actualEltList,7351,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,expected,7353,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,actualEltList,7355,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,actualKeyList,7357,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,actualKeyList,7359,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,actualKeyList,7361,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,actualKeyList,7363,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2377() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2377");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expected,7341,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,actualEltList,7343,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,actualEltList,7345,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,actualEltList,7347,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7350,actualEltList,7349,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(0));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7352,actualEltList,7351,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,expected,7353,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,actualEltList,7355,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,actualKeyList,7357,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,actualKeyList,7359,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,actualKeyList,7361,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,actualKeyList,7363,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2378() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2378");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expected,7341,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,actualEltList,7343,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,actualEltList,7345,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,actualEltList,7347,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7350,actualEltList,7349,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7352,actualEltList,7351,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,expected,7353,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,actualEltList,7355,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,actualKeyList,7357,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,actualKeyList,7359,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,actualKeyList,7361,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,actualKeyList,7363,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2379() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2379");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expected,7341,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,actualEltList,7343,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,actualEltList,7345,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,actualEltList,7347,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7350,actualEltList,7349,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7352,actualEltList,7351,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,expected,7353,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,actualEltList,7355,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,actualKeyList,7357,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,actualKeyList,7359,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,actualKeyList,7361,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,actualKeyList,7363,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2380() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2380");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expected,7341,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,actualEltList,7343,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,actualEltList,7345,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,actualEltList,7347,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7350,actualEltList,7349,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7352,actualEltList,7351,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,expected,7353,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,actualEltList,7355,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,actualKeyList,7357,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,actualKeyList,7359,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,actualKeyList,7361,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("foo");
        expectedKeyList.add("two");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,actualKeyList,7363,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2381() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2381");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expected,7341,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,actualEltList,7343,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,actualEltList,7345,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,actualEltList,7347,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7350,actualEltList,7349,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7352,actualEltList,7351,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,expected,7353,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,actualEltList,7355,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,actualKeyList,7357,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,actualKeyList,7359,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,actualKeyList,7361,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("foo");
        expectedKeyList.add("three");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,actualKeyList,7363,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToListWithHashtable_literalMutation2382() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToListWithHashtable_literalMutation2382");
        final Hashtable<java.lang.String, java.lang.Integer> expected = new Hashtable<java.lang.String, java.lang.Integer>();
        expected.put("one", Integer.valueOf(1));
        expected.put("two", Integer.valueOf(2));
        expected.put("three", Integer.valueOf(3));
        final List<java.lang.Integer> actualEltList = org.apache.commons.collections4.EnumerationUtils.toList(expected.elements());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7342,expected,7341,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7344,actualEltList,7343,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7346,actualEltList,7345,actualEltList.contains(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7348,actualEltList,7347,actualEltList.contains(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7350,actualEltList,7349,actualEltList.contains(java.lang.Integer.valueOf(3)));
        final List<java.lang.Integer> expectedEltList = new ArrayList<java.lang.Integer>();
        expectedEltList.add(Integer.valueOf(1));
        expectedEltList.add(Integer.valueOf(2));
        expectedEltList.add(Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7352,actualEltList,7351,actualEltList.containsAll(expectedEltList));
        final List<java.lang.String> actualKeyList = org.apache.commons.collections4.EnumerationUtils.toList(expected.keys());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7354,expected,7353,expected.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7356,actualEltList,7355,actualEltList.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7358,actualKeyList,7357,actualKeyList.contains("one"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7360,actualKeyList,7359,actualKeyList.contains("two"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7362,actualKeyList,7361,actualKeyList.contains("three"));
        final List<java.lang.String> expectedKeyList = new ArrayList<java.lang.String>();
        expectedKeyList.add("one");
        expectedKeyList.add("two");
        expectedKeyList.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),7364,actualKeyList,7363,actualKeyList.containsAll(expectedKeyList));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public static Test suite() {
        return BulkTest.makeSuite(EnumerationUtilsTest.class);
    }
}

