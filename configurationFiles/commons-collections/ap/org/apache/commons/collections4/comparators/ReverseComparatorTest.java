package org.apache.commons.collections4.comparators;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;

/** 
 * Tests for ReverseComparator.
 * 
 * @version $Id$
 */
public class ReverseComparatorTest extends AbstractComparatorTest<java.lang.Integer> {
    public ReverseComparatorTest(final String testName) {
        super(testName);
    }

    /** 
     * For the purposes of this test, return a
     * ReverseComparator that wraps the java.util.Collections.reverseOrder()
     * Comparator.  The resulting comparator should
     * sort according to natural Order.  (Note: we wrap
     * a Comparator taken from the JDK so that we can
     * save a "canonical" form in SVN.
     * 
     * @return Comparator that returns "natural" order
     */
@Override
    public Comparator<java.lang.Integer> makeObject() {
        return new ReverseComparator<java.lang.Integer>(java.util.Collections.<Integer>reverseOrder());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    @Override
    public List<java.lang.Integer> getComparableObjectsOrdered() {
        final List<java.lang.Integer> list = new LinkedList<java.lang.Integer>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        list.add(Integer.valueOf(3));
        list.add(Integer.valueOf(4));
        list.add(Integer.valueOf(5));
        return list;
    }

    /** 
     * Override this inherited test since Collections.reverseOrder
     * doesn't adhere to the "soft" Comparator contract, and we've
     * already "canonized" the comparator returned by makeComparator.
     */
@Override
    @Test
    public void testSerializeDeserializeThenCompare() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeThenCompare");
        final Comparator<?> comp = new ReverseComparator<java.lang.String>(new ComparableComparator<java.lang.String>());
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(comp);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        final Object dest = in.readObject();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4534,comp);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4535,dest);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

