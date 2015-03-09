package org.apache.commons.collections4;

import org.apache.commons.collections4.list.AbstractListTest;
import java.util.ArrayList;
import org.junit.Test;

/** 
 * Abstract test class for ArrayList.
 * 
 * @version $Id$
 */
public abstract class AbstractArrayListTest<E> extends AbstractListTest<E> {
    public AbstractArrayListTest(final String testName) {
        super(testName);
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public abstract ArrayList<E> makeObject();

    @Test(timeout = 1000)
    public void testNewArrayList_add2000() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewArrayList_add2000");
        final ArrayList<E> list = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6361,list,6360,list.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6363,list,6362,list.size());
        try {
            list.get(1);
            list.get(1);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNewArrayList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewArrayList");
        final ArrayList<E> list = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6361,list,6360,list.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6363,list,6362,list.size());
        try {
            list.get(0);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSearch_add2001() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_add2001");
        final ArrayList<E> list = makeObject();
        list.add(((E)("First Item")));
        list.add(((E)("First Item")));
        list.add(((E)("Last Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,list,6364,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,list,6366,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSearch_add2002() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_add2002");
        final ArrayList<E> list = makeObject();
        list.add(((E)("First Item")));
        list.add(((E)("Last Item")));
        list.add(((E)("Last Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,list,6364,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,list,6366,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch");
        final ArrayList<E> list = makeObject();
        list.add(((E)("First Item")));
        list.add(((E)("Last Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,list,6364,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,list,6366,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1941");
        final ArrayList<E> list = makeObject();
        list.add(((E)("foo")));
        list.add(((E)("Last Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,list,6364,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,list,6366,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1942");
        final ArrayList<E> list = makeObject();
        list.add(((E)("First Item")));
        list.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,list,6364,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,list,6366,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSearch_remove1559() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_remove1559");
        final ArrayList<E> list = makeObject();
        list.add(((E)("Last Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,list,6364,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,list,6366,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testSearch_remove1560() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_remove1560");
        final ArrayList<E> list = makeObject();
        list.add(((E)("Last Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6365,list,6364,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6367,list,6366,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

