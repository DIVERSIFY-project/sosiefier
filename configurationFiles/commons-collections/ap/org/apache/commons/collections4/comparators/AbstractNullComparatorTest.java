package org.apache.commons.collections4.comparators;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestSuite;

/** 
 * Test the NullComparator.
 * 
 * @version $Id$
 */
public abstract class AbstractNullComparatorTest extends AbstractComparatorTest<java.lang.Integer> {
    public AbstractNullComparatorTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        final TestSuite suite = new TestSuite(AbstractNullComparatorTest.class.getName());
        suite.addTest(new TestSuite(TestNullComparator1.class));
        suite.addTest(new TestSuite(TestNullComparator2.class));
        return suite;
    }

    /** 
     * Test the NullComparator with nulls high, using comparable comparator
     */
public static class TestNullComparator1 extends AbstractNullComparatorTest {
        public TestNullComparator1(final String testName) {
            super(testName);
        }

        @Override
        public Comparator<java.lang.Integer> makeObject() {
            return new NullComparator<java.lang.Integer>();
        }

        @Override
        public List<java.lang.Integer> getComparableObjectsOrdered() {
            final List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
            list.add(Integer.valueOf(1));
            list.add(Integer.valueOf(2));
            list.add(Integer.valueOf(3));
            list.add(Integer.valueOf(4));
            list.add(Integer.valueOf(5));
            list.add(null);
            return list;
        }

        @Override
        public String getCanonicalComparatorName(final Object object) {
            return (super.getCanonicalComparatorName(object)) + "1";
        }

        @Override
        public String getCompatibilityVersion() {
            return "4";
        }
    }

    /** 
     * Test the NullComparator with nulls low using the comparable comparator
     */
public static class TestNullComparator2 extends AbstractNullComparatorTest {
        public TestNullComparator2(final String testName) {
            super(testName);
        }

        @Override
        public Comparator<java.lang.Integer> makeObject() {
            return new NullComparator<java.lang.Integer>(false);
        }

        @Override
        public List<java.lang.Integer> getComparableObjectsOrdered() {
            final List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
            list.add(null);
            list.add(Integer.valueOf(1));
            list.add(Integer.valueOf(2));
            list.add(Integer.valueOf(3));
            list.add(Integer.valueOf(4));
            list.add(Integer.valueOf(5));
            return list;
        }

        @Override
        public String getCanonicalComparatorName(final Object object) {
            return (super.getCanonicalComparatorName(object)) + "2";
        }

        @Override
        public String getCompatibilityVersion() {
            return "4";
        }
    }
}

