package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.junit.Test;

/** 
 * Tests the UnmodifiableListIterator.
 * 
 * @version $Id$
 */
public class UnmodifiableListIteratorTest<E> extends AbstractListIteratorTest<E> {
    protected String[] testArray = new String[]{ "One" , "Two" , "Three" };

    protected List<E> testList;

    public UnmodifiableListIteratorTest(final String testName) {
        super(testName);
    }

    /** 
     * {@inheritDoc}
     */
@SuppressWarnings(value = "unchecked")
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        testList = new ArrayList<E>(java.util.Arrays.asList(((E[])(testArray))));
    }

    @Override
    public ListIterator<E> makeEmptyIterator() {
        return org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(java.util.Collections.<E>emptyList().listIterator());
    }

    @Override
    public ListIterator<E> makeObject() {
        return org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(testList.listIterator());
    }

    @Override
    public boolean supportsRemove() {
        return false;
    }

    @Override
    public boolean supportsAdd() {
        return false;
    }

    @Override
    public boolean supportsSet() {
        return false;
    }

    public void testListIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testListIterator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4391,((makeEmptyIterator()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        ListIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4387,it);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4389,null,4388,org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(it));
        it = testList.listIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4390,(it != (org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(it))));
        try {
            org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testDecorateFactory_add1215() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory_add1215");
        ListIterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4387,it);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4389,null,4388,org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(it));
        it = testList.listIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4390,(it != (org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(it))));
        try {
            org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(null);
            org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

