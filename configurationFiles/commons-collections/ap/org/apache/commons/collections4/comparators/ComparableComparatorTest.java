package org.apache.commons.collections4.comparators;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/** 
 * Tests for ComparableComparator.
 * 
 * @version $Id$
 */
@SuppressWarnings(value = "boxing")
public class ComparableComparatorTest extends AbstractComparatorTest<java.lang.Integer> {
    public ComparableComparatorTest(final String testName) {
        super(testName);
    }

    @Override
    public Comparator<java.lang.Integer> makeObject() {
        return new ComparableComparator<java.lang.Integer>();
    }

    @Override
    public List<java.lang.Integer> getComparableObjectsOrdered() {
        final List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        return list;
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

