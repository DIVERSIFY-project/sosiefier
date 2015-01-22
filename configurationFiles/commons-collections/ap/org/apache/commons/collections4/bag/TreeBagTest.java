package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.SortedBag;
import junit.framework.Test;

/** 
 * Extension of {@link AbstractBagTest} for exercising the {@link TreeBag}
 * implementation.
 * 
 * @version $Id$
 */
public class TreeBagTest<T> extends AbstractSortedBagTest<T> {
    public TreeBagTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(TreeBagTest.class);
    }

    @Override
    public SortedBag<T> makeObject() {
        return new TreeBag<T>();
    }

    @SuppressWarnings(value = "unchecked")
    public SortedBag<T> setupBag() {
        final SortedBag<T> bag = makeObject();
        bag.add(((T)("C")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("D")));
        return bag;
    }

    public void testCollections265() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections265");
        final Bag<java.lang.Object> bag = new TreeBag<java.lang.Object>();
        try {
            bag.add(new Object());
        } catch (final IllegalArgumentException iae) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testOrdering() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testOrdering");
        final Bag<T> bag = setupBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5898,bag.toArray()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5899,bag.toArray()[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5900,bag.toArray()[2]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5902,((org.apache.commons.collections4.SortedBag<T>)(bag)),5901,((org.apache.commons.collections4.SortedBag<T>)(bag)).first());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5904,((org.apache.commons.collections4.SortedBag<T>)(bag)),5903,((org.apache.commons.collections4.SortedBag<T>)(bag)).last());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

