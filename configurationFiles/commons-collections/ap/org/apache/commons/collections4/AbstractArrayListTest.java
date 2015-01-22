package org.apache.commons.collections4;

import org.apache.commons.collections4.list.AbstractListTest;
import java.util.ArrayList;

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

    public void testNewArrayList() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNewArrayList");
        final ArrayList<E> list = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6400,list,6399,list.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6402,list,6401,list.size());
        try {
            list.get(2);
        } catch (final IndexOutOfBoundsException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch");
        final ArrayList<E> list = makeObject();
        list.add(((E)("First Item")));
        list.add(((E)("Last Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6404,list,6403,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,list,6405,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1941() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1941");
        final ArrayList<E> list = makeObject();
        list.add(((E)("foo")));
        list.add(((E)("Last Item")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6404,list,6403,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,list,6405,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSearch_literalMutation1942() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSearch_literalMutation1942");
        final ArrayList<E> list = makeObject();
        list.add(((E)("First Item")));
        list.add(((E)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6404,list,6403,list.get(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),6406,list,6405,list.get(1));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

