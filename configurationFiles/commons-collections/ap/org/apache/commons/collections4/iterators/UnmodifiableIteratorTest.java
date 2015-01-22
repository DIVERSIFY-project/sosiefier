package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
 * Tests the UnmodifiableIterator.
 * 
 * @version $Id$
 */
public class UnmodifiableIteratorTest<E> extends AbstractIteratorTest<E> {
    protected String[] testArray = new String[]{ "One" , "Two" , "Three" };

    protected List<E> testList;

    public UnmodifiableIteratorTest(final String testName) {
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
    public Iterator<E> makeEmptyIterator() {
        return org.apache.commons.collections4.iterators.UnmodifiableIterator.unmodifiableIterator(java.util.Collections.<E>emptyList().iterator());
    }

    @Override
    public Iterator<E> makeObject() {
        return org.apache.commons.collections4.iterators.UnmodifiableIterator.unmodifiableIterator(testList.iterator());
    }

    @Override
    public boolean supportsRemove() {
        return false;
    }

    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4386,((makeEmptyIterator()) instanceof org.apache.commons.collections4.Unmodifiable));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDecorateFactory() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDecorateFactory");
        Iterator<E> it = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4382,it);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4384,null,4383,org.apache.commons.collections4.iterators.UnmodifiableIterator.unmodifiableIterator(it));
        it = testList.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4385,(it != (org.apache.commons.collections4.iterators.UnmodifiableIterator.unmodifiableIterator(it))));
        try {
            org.apache.commons.collections4.iterators.UnmodifiableIterator.unmodifiableIterator(null);
        } catch (final IllegalArgumentException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

