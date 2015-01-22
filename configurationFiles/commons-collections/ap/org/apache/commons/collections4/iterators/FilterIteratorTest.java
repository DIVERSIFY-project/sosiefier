package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.Predicate;

/** 
 * Test the filter iterator.
 * 
 * @version $Id$
 */
public class FilterIteratorTest<E> extends AbstractIteratorTest<E> {
    /** 
     * Creates new TestFilterIterator
     */
public FilterIteratorTest(final String name) {
        super(name);
    }

    private String[] array;

    private List<E> list;

    private FilterIterator<E> iterator;

    /** 
     * Set up instance variables required by this test case.
     */
@Override
    public void setUp() {
        array = new String[]{ "a" , "b" , "c" };
        initIterator();
    }

    /** 
     * Tear down instance variables required by this test case.
     */
@Override
    public void tearDown() throws Exception {
        iterator = null;
    }

    /** 
     * Returns an full iterator wrapped in a
     * FilterIterator that blocks all the elements
     * 
     * @return "empty" FilterIterator
     */
@Override
    public FilterIterator<E> makeEmptyIterator() {
        return makeBlockAllFilter(new org.apache.commons.collections4.iterators.ArrayIterator<E>(array));
    }

    /** 
     * Returns an array with elements wrapped in a pass-through
     * FilterIterator
     * 
     * @return a filtered iterator
     */
@Override
    @SuppressWarnings(value = "unchecked")
    public FilterIterator<E> makeObject() {
        list = new ArrayList<E>(java.util.Arrays.asList(((E[])(array))));
        return makePassThroughFilter(list.iterator());
    }

    public void testRepeatedHasNext() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedHasNext");
        for (int i = -1 ; i <= (array.length) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3002,iterator,3001,iterator.hasNext());
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unused")
    public void testRepeatedNext() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRepeatedNext");
        for (final String element : array) {
            iterator.next();
        }
        verifyNoMoreElements();
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues_literalMutation1000() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues_literalMutation1000");
        verifyElementsInPredicate(new String[0]);
        verifyElementsInPredicate(new String[]{ "a" });
        verifyElementsInPredicate(new String[]{ "b" });
        verifyElementsInPredicate(new String[]{ "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" });
        verifyElementsInPredicate(new String[]{ "a" , "c" });
        verifyElementsInPredicate(new String[]{ "b" , "foo" });
        verifyElementsInPredicate(new String[]{ "a" , "b" , "c" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues_literalMutation1001() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues_literalMutation1001");
        verifyElementsInPredicate(new String[0]);
        verifyElementsInPredicate(new String[]{ "a" });
        verifyElementsInPredicate(new String[]{ "b" });
        verifyElementsInPredicate(new String[]{ "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" });
        verifyElementsInPredicate(new String[]{ "a" , "c" });
        verifyElementsInPredicate(new String[]{ "b" , "c" });
        verifyElementsInPredicate(new String[]{ "foo" , "b" , "c" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues_literalMutation1002() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues_literalMutation1002");
        verifyElementsInPredicate(new String[0]);
        verifyElementsInPredicate(new String[]{ "a" });
        verifyElementsInPredicate(new String[]{ "b" });
        verifyElementsInPredicate(new String[]{ "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" });
        verifyElementsInPredicate(new String[]{ "a" , "c" });
        verifyElementsInPredicate(new String[]{ "b" , "c" });
        verifyElementsInPredicate(new String[]{ "a" , "foo" , "c" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues_literalMutation1003() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues_literalMutation1003");
        verifyElementsInPredicate(new String[0]);
        verifyElementsInPredicate(new String[]{ "a" });
        verifyElementsInPredicate(new String[]{ "b" });
        verifyElementsInPredicate(new String[]{ "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" });
        verifyElementsInPredicate(new String[]{ "a" , "c" });
        verifyElementsInPredicate(new String[]{ "b" , "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" , "foo" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues");
        verifyElementsInPredicate(new String[1]);
        verifyElementsInPredicate(new String[]{ "a" });
        verifyElementsInPredicate(new String[]{ "b" });
        verifyElementsInPredicate(new String[]{ "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" });
        verifyElementsInPredicate(new String[]{ "a" , "c" });
        verifyElementsInPredicate(new String[]{ "b" , "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" , "c" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues_literalMutation992() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues_literalMutation992");
        verifyElementsInPredicate(new String[0]);
        verifyElementsInPredicate(new String[]{ "foo" });
        verifyElementsInPredicate(new String[]{ "b" });
        verifyElementsInPredicate(new String[]{ "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" });
        verifyElementsInPredicate(new String[]{ "a" , "c" });
        verifyElementsInPredicate(new String[]{ "b" , "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" , "c" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues_literalMutation993() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues_literalMutation993");
        verifyElementsInPredicate(new String[0]);
        verifyElementsInPredicate(new String[]{ "a" });
        verifyElementsInPredicate(new String[]{ "foo" });
        verifyElementsInPredicate(new String[]{ "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" });
        verifyElementsInPredicate(new String[]{ "a" , "c" });
        verifyElementsInPredicate(new String[]{ "b" , "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" , "c" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues_literalMutation994() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues_literalMutation994");
        verifyElementsInPredicate(new String[0]);
        verifyElementsInPredicate(new String[]{ "a" });
        verifyElementsInPredicate(new String[]{ "b" });
        verifyElementsInPredicate(new String[]{ "foo" });
        verifyElementsInPredicate(new String[]{ "a" , "b" });
        verifyElementsInPredicate(new String[]{ "a" , "c" });
        verifyElementsInPredicate(new String[]{ "b" , "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" , "c" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues_literalMutation995() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues_literalMutation995");
        verifyElementsInPredicate(new String[0]);
        verifyElementsInPredicate(new String[]{ "a" });
        verifyElementsInPredicate(new String[]{ "b" });
        verifyElementsInPredicate(new String[]{ "c" });
        verifyElementsInPredicate(new String[]{ "foo" , "b" });
        verifyElementsInPredicate(new String[]{ "a" , "c" });
        verifyElementsInPredicate(new String[]{ "b" , "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" , "c" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues_literalMutation996() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues_literalMutation996");
        verifyElementsInPredicate(new String[0]);
        verifyElementsInPredicate(new String[]{ "a" });
        verifyElementsInPredicate(new String[]{ "b" });
        verifyElementsInPredicate(new String[]{ "c" });
        verifyElementsInPredicate(new String[]{ "a" , "foo" });
        verifyElementsInPredicate(new String[]{ "a" , "c" });
        verifyElementsInPredicate(new String[]{ "b" , "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" , "c" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues_literalMutation997() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues_literalMutation997");
        verifyElementsInPredicate(new String[0]);
        verifyElementsInPredicate(new String[]{ "a" });
        verifyElementsInPredicate(new String[]{ "b" });
        verifyElementsInPredicate(new String[]{ "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" });
        verifyElementsInPredicate(new String[]{ "foo" , "c" });
        verifyElementsInPredicate(new String[]{ "b" , "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" , "c" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues_literalMutation998() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues_literalMutation998");
        verifyElementsInPredicate(new String[0]);
        verifyElementsInPredicate(new String[]{ "a" });
        verifyElementsInPredicate(new String[]{ "b" });
        verifyElementsInPredicate(new String[]{ "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" });
        verifyElementsInPredicate(new String[]{ "a" , "foo" });
        verifyElementsInPredicate(new String[]{ "b" , "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" , "c" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testReturnValues_literalMutation999() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testReturnValues_literalMutation999");
        verifyElementsInPredicate(new String[0]);
        verifyElementsInPredicate(new String[]{ "a" });
        verifyElementsInPredicate(new String[]{ "b" });
        verifyElementsInPredicate(new String[]{ "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" });
        verifyElementsInPredicate(new String[]{ "a" , "c" });
        verifyElementsInPredicate(new String[]{ "foo" , "c" });
        verifyElementsInPredicate(new String[]{ "a" , "b" , "c" });
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that when the iterator is changed, the hasNext method returns the
     * correct response for the new iterator.
     */
@SuppressWarnings(value = "unchecked")
    public void testSetIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetIterator");
        final Iterator<E> iter1 = java.util.Collections.singleton(((E)(new Object()))).iterator();
        final Iterator<E> iter2 = java.util.Collections.<E>emptyList().iterator();
        final FilterIterator<E> filterIterator = new FilterIterator<E>(iter1);
        filterIterator.setPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3004,filterIterator,3003,filterIterator.hasNext());
        filterIterator.setIterator(iter2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3006,filterIterator,3005,filterIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Test that when the predicate is changed, the hasNext method returns the
     * correct response for the new predicate.
     */
public void testSetPredicate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSetPredicate");
        final Iterator<E> iter = java.util.Collections.singleton(((E)(null))).iterator();
        final FilterIterator<E> filterIterator = new FilterIterator<E>(iter);
        filterIterator.setPredicate(org.apache.commons.collections4.functors.TruePredicate.truePredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3008,filterIterator,3007,filterIterator.hasNext());
        filterIterator.setPredicate(org.apache.commons.collections4.functors.NotNullPredicate.notNullPredicate());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3010,filterIterator,3009,filterIterator.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void verifyNoMoreElements() {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3015,!(iterator.hasNext()));
        try {
            iterator.next();
        } catch (final NoSuchElementException e) {
        }
    }

    private void verifyElementsInPredicate(final String[] elements) {
        final Predicate<E> pred = new Predicate<E>() {
            public boolean evaluate(final E x) {
                for (final String element : elements) {
                    if (element.equals(x)) {
                        return true;
                    } 
                }
                return false;
            }
        };
        initIterator();
        iterator.setPredicate(pred);
        for (int i = 0 ; i < (elements.length) ; i++) {
            final String s = ((String)(iterator.next()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3011,elements[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3012,s);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3013,(i == ((elements.length) - 1) ? !(iterator.hasNext()) : iterator.hasNext()));
        }
        verifyNoMoreElements();
        initIterator();
        iterator.setPredicate(pred);
        if (iterator.hasNext()) {
            final Object last = iterator.next();
            iterator.remove();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3014,!(list.contains(last)));
        } 
    }

    private void initIterator() {
        iterator = makeObject();
    }

    /** 
     * Returns a FilterIterator that does not filter
     * any of its elements
     * 
     * @param i the Iterator to "filter"
     * @return "filtered" iterator
     */
protected FilterIterator<E> makePassThroughFilter(final Iterator<E> i) {
        final Predicate<E> pred = new Predicate<E>() {
            public boolean evaluate(final E x) {
                return true;
            }
        };
        return new FilterIterator<E>(i , pred);
    }

    /** 
     * Returns a FilterIterator that blocks
     * all of its elements
     * 
     * @param i the Iterator to "filter"
     * @return "filtered" iterator
     */
protected FilterIterator<E> makeBlockAllFilter(final Iterator<E> i) {
        final Predicate<E> pred = new Predicate<E>() {
            public boolean evaluate(final E x) {
                return false;
            }
        };
        return new FilterIterator<E>(i , pred);
    }
}

