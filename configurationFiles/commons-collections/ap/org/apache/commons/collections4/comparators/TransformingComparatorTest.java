package org.apache.commons.collections4.comparators;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/** 
 * Test class for TransformingComparator.
 * 
 * @version $Id$
 */
public class TransformingComparatorTest extends AbstractComparatorTest<java.lang.Integer> {
    public TransformingComparatorTest(final String name) {
        super(name);
    }

    @Override
    public Comparator<java.lang.Integer> makeObject() {
        final Comparator<java.lang.String> decorated = new ComparableComparator<java.lang.String>();
        return org.apache.commons.collections4.ComparatorUtils.transformedComparator(decorated, org.apache.commons.collections4.TransformerUtils.<Integer>stringValueTransformer());
    }

    @Override
    @SuppressWarnings(value = "boxing")
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

