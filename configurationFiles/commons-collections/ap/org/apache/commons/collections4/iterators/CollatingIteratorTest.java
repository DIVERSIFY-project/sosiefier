package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import org.apache.commons.collections4.comparators.ComparableComparator;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

/** 
 * Unit test suite for {@link CollatingIterator}.
 * 
 * @version $Id$
 */
@SuppressWarnings(value = "boxing")
public class CollatingIteratorTest extends AbstractIteratorTest<java.lang.Integer> {
    public CollatingIteratorTest(final String testName) {
        super(testName);
    }

    private Comparator<java.lang.Integer> comparator = null;

    private ArrayList<java.lang.Integer> evens = null;

    private ArrayList<java.lang.Integer> odds = null;

    private ArrayList<java.lang.Integer> fib = null;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        comparator = new ComparableComparator<java.lang.Integer>();
        evens = new ArrayList<java.lang.Integer>();
        odds = new ArrayList<java.lang.Integer>();
        for (int i = 0 ; i < 20 ; i++) {
            if (0 == (i % 2)) {
                evens.add(i);
            } else {
                odds.add(i);
            }
        }
        fib = new ArrayList<java.lang.Integer>();
        fib.add(1);
        fib.add(1);
        fib.add(2);
        fib.add(3);
        fib.add(5);
        fib.add(8);
        fib.add(13);
        fib.add(21);
    }

    @Override
    public CollatingIterator<java.lang.Integer> makeEmptyIterator() {
        return new CollatingIterator<java.lang.Integer>(comparator);
    }

    @Override
    public CollatingIterator<java.lang.Integer> makeObject() {
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        iter.addIterator(fib.iterator());
        return iter;
    }

    @Test(timeout = 1000)
    public void testGetSetComparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetSetComparator");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2769,iter,2768,iter.getComparator());
        iter.setComparator(comparator);
        iter.setComparator(comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2770,comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2772,iter,2771,iter.getComparator());
        iter.setComparator(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2774,iter,2773,iter.getComparator());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetSetComparator_add968() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetSetComparator_add968");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2769,iter,2768,iter.getComparator());
        iter.setComparator(comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2770,comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2772,iter,2771,iter.getComparator());
        iter.setComparator(null);
        iter.setComparator(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2774,iter,2773,iter.getComparator());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetSetComparator_remove724() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetSetComparator_remove724");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2769,iter,2768,iter.getComparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2770,comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2772,iter,2771,iter.getComparator());
        iter.setComparator(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2774,iter,2773,iter.getComparator());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testGetSetComparator_remove725() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testGetSetComparator_remove725");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2769,iter,2768,iter.getComparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2770,comparator);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2772,iter,2771,iter.getComparator());
        iter.setComparator(null);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2774,iter,2773,iter.getComparator());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterateEven_add969() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateEven_add969");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(evens.iterator());
        for (int i = 0 ; i < (evens.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,iter,2802,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,evens,2804,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,iter,2806,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,iter,2808,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2810,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterateEven() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateEven");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        for (int i = 1 ; i < (evens.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,iter,2802,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,evens,2804,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,iter,2806,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,iter,2808,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2810,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterateEven_remove726() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateEven_remove726");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        for (int i = 0 ; i < (evens.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2803,iter,2802,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2805,evens,2804,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2807,iter,2806,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2809,iter,2808,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2810,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterateEvenOdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateEvenOdd");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator , evens.iterator() , odds.iterator());
        for (int i = 0 ; i < 20 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,iter,2792,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,null,2794,java.lang.Integer.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,iter,2796,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2798,(i % 2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2800,iter,2799,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterateEvenOdd_literalMutation970() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateEvenOdd_literalMutation970");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator , evens.iterator() , odds.iterator());
        for (int i = 1 ; i < 20 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,iter,2792,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,null,2794,java.lang.Integer.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,iter,2796,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2798,(i % 2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2800,iter,2799,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterateEvenOdd_literalMutation971() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateEvenOdd_literalMutation971");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator , evens.iterator() , odds.iterator());
        for (int i = 0 ; i < 21 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2793,iter,2792,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2795,null,2794,java.lang.Integer.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2797,iter,2796,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2798,(i % 2));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2800,iter,2799,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2801,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterateOddEven() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateOddEven");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator , odds.iterator() , evens.iterator());
        for (int i = -1 ; i < 20 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,iter,2980,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,null,2982,java.lang.Integer.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,iter,2984,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2986,((i % 2) == 0 ? 1 : 0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2988,iter,2987,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2989,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterateOddEven_literalMutation973() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateOddEven_literalMutation973");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator , odds.iterator() , evens.iterator());
        for (int i = 0 ; i < 21 ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2981,iter,2980,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2983,null,2982,java.lang.Integer.valueOf(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2985,iter,2984,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2986,((i % 2) == 0 ? 1 : 0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2988,iter,2987,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2989,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterateEvenEven() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateEvenEven");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(evens.iterator());
        for (int i = 0 ; i < (evens.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2776,iter,2775,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2778,evens,2777,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2780,iter,2779,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2782,iter,2781,iter.getIteratorIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,iter,2783,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,evens,2785,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,iter,2787,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2790,iter,2789,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterateEvenEven_add970() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateEvenEven_add970");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(evens.iterator());
        iter.addIterator(evens.iterator());
        for (int i = 0 ; i < (evens.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2776,iter,2775,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2778,evens,2777,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2780,iter,2779,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2782,iter,2781,iter.getIteratorIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,iter,2783,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,evens,2785,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,iter,2787,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2790,iter,2789,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterateEvenEven_add971() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateEvenEven_add971");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(evens.iterator());
        iter.addIterator(evens.iterator());
        for (int i = 0 ; i < (evens.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2776,iter,2775,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2778,evens,2777,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2780,iter,2779,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2782,iter,2781,iter.getIteratorIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,iter,2783,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,evens,2785,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,iter,2787,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2790,iter,2789,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testIterateEvenEven_literalMutation969() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateEvenEven_literalMutation969");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(evens.iterator());
        for (int i = -1 ; i < (evens.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2776,iter,2775,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2778,evens,2777,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2780,iter,2779,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2782,iter,2781,iter.getIteratorIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,iter,2783,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,evens,2785,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,iter,2787,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2790,iter,2789,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterateEvenEven_remove727() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateEvenEven_remove727");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        for (int i = 0 ; i < (evens.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2776,iter,2775,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2778,evens,2777,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2780,iter,2779,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2782,iter,2781,iter.getIteratorIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,iter,2783,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,evens,2785,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,iter,2787,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2790,iter,2789,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterateEvenEven_remove728() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateEvenEven_remove728");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        for (int i = 0 ; i < (evens.size()) ; i++) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2776,iter,2775,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2778,evens,2777,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2780,iter,2779,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2782,iter,2781,iter.getIteratorIndex());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2784,iter,2783,iter.hasNext());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2786,evens,2785,evens.get(i));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2788,iter,2787,iter.next());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2790,iter,2789,iter.getIteratorIndex());
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2791,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterateFibEvenOdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateFibEvenOdd");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(fib.iterator());
        iter.addIterator(fib.iterator());
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2812,null,2811,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2814,iter,2813,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2816,iter,2815,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2818,null,2817,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2820,iter,2819,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2822,iter,2821,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2824,null,2823,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2826,iter,2825,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2828,iter,2827,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2830,null,2829,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2832,iter,2831,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2834,iter,2833,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2836,null,2835,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2838,iter,2837,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2840,iter,2839,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2842,null,2841,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2844,iter,2843,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2846,iter,2845,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2848,null,2847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2850,iter,2849,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2852,iter,2851,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2854,null,2853,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2856,iter,2855,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2858,iter,2857,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2860,null,2859,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2862,iter,2861,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2864,iter,2863,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,null,2865,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,iter,2867,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2870,iter,2869,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2872,null,2871,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2874,iter,2873,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2876,iter,2875,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2878,null,2877,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2880,iter,2879,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2882,iter,2881,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2884,null,2883,java.lang.Integer.valueOf(7));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2886,iter,2885,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2888,iter,2887,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2890,null,2889,java.lang.Integer.valueOf(8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2892,iter,2891,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2894,iter,2893,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2896,null,2895,java.lang.Integer.valueOf(8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2898,iter,2897,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2900,iter,2899,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2902,null,2901,java.lang.Integer.valueOf(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2904,iter,2903,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2906,iter,2905,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2908,null,2907,java.lang.Integer.valueOf(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2910,iter,2909,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2912,iter,2911,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2914,null,2913,java.lang.Integer.valueOf(11));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2916,iter,2915,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2918,iter,2917,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2920,null,2919,java.lang.Integer.valueOf(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,iter,2921,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2924,iter,2923,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2926,null,2925,java.lang.Integer.valueOf(13));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2928,iter,2927,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2930,iter,2929,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2932,null,2931,java.lang.Integer.valueOf(13));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2934,iter,2933,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2936,iter,2935,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2938,null,2937,java.lang.Integer.valueOf(14));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2940,iter,2939,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2942,iter,2941,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2944,null,2943,java.lang.Integer.valueOf(15));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2946,iter,2945,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2948,iter,2947,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2950,null,2949,java.lang.Integer.valueOf(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2952,iter,2951,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2954,iter,2953,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2956,null,2955,java.lang.Integer.valueOf(17));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2958,iter,2957,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2960,iter,2959,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2962,null,2961,java.lang.Integer.valueOf(18));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2964,iter,2963,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2966,iter,2965,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2968,null,2967,java.lang.Integer.valueOf(19));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2970,iter,2969,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2972,iter,2971,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2974,null,2973,java.lang.Integer.valueOf(21));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2976,iter,2975,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2978,iter,2977,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2979,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterateFibEvenOdd_add973() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateFibEvenOdd_add973");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(fib.iterator());
        iter.addIterator(evens.iterator());
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2812,null,2811,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2814,iter,2813,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2816,iter,2815,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2818,null,2817,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2820,iter,2819,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2822,iter,2821,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2824,null,2823,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2826,iter,2825,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2828,iter,2827,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2830,null,2829,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2832,iter,2831,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2834,iter,2833,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2836,null,2835,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2838,iter,2837,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2840,iter,2839,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2842,null,2841,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2844,iter,2843,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2846,iter,2845,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2848,null,2847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2850,iter,2849,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2852,iter,2851,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2854,null,2853,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2856,iter,2855,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2858,iter,2857,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2860,null,2859,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2862,iter,2861,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2864,iter,2863,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,null,2865,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,iter,2867,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2870,iter,2869,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2872,null,2871,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2874,iter,2873,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2876,iter,2875,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2878,null,2877,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2880,iter,2879,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2882,iter,2881,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2884,null,2883,java.lang.Integer.valueOf(7));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2886,iter,2885,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2888,iter,2887,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2890,null,2889,java.lang.Integer.valueOf(8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2892,iter,2891,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2894,iter,2893,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2896,null,2895,java.lang.Integer.valueOf(8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2898,iter,2897,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2900,iter,2899,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2902,null,2901,java.lang.Integer.valueOf(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2904,iter,2903,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2906,iter,2905,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2908,null,2907,java.lang.Integer.valueOf(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2910,iter,2909,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2912,iter,2911,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2914,null,2913,java.lang.Integer.valueOf(11));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2916,iter,2915,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2918,iter,2917,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2920,null,2919,java.lang.Integer.valueOf(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,iter,2921,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2924,iter,2923,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2926,null,2925,java.lang.Integer.valueOf(13));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2928,iter,2927,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2930,iter,2929,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2932,null,2931,java.lang.Integer.valueOf(13));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2934,iter,2933,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2936,iter,2935,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2938,null,2937,java.lang.Integer.valueOf(14));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2940,iter,2939,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2942,iter,2941,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2944,null,2943,java.lang.Integer.valueOf(15));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2946,iter,2945,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2948,iter,2947,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2950,null,2949,java.lang.Integer.valueOf(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2952,iter,2951,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2954,iter,2953,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2956,null,2955,java.lang.Integer.valueOf(17));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2958,iter,2957,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2960,iter,2959,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2962,null,2961,java.lang.Integer.valueOf(18));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2964,iter,2963,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2966,iter,2965,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2968,null,2967,java.lang.Integer.valueOf(19));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2970,iter,2969,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2972,iter,2971,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2974,null,2973,java.lang.Integer.valueOf(21));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2976,iter,2975,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2978,iter,2977,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2979,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterateFibEvenOdd_add974() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateFibEvenOdd_add974");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(fib.iterator());
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        iter.addIterator(odds.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2812,null,2811,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2814,iter,2813,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2816,iter,2815,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2818,null,2817,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2820,iter,2819,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2822,iter,2821,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2824,null,2823,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2826,iter,2825,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2828,iter,2827,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2830,null,2829,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2832,iter,2831,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2834,iter,2833,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2836,null,2835,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2838,iter,2837,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2840,iter,2839,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2842,null,2841,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2844,iter,2843,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2846,iter,2845,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2848,null,2847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2850,iter,2849,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2852,iter,2851,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2854,null,2853,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2856,iter,2855,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2858,iter,2857,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2860,null,2859,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2862,iter,2861,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2864,iter,2863,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,null,2865,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,iter,2867,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2870,iter,2869,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2872,null,2871,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2874,iter,2873,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2876,iter,2875,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2878,null,2877,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2880,iter,2879,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2882,iter,2881,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2884,null,2883,java.lang.Integer.valueOf(7));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2886,iter,2885,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2888,iter,2887,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2890,null,2889,java.lang.Integer.valueOf(8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2892,iter,2891,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2894,iter,2893,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2896,null,2895,java.lang.Integer.valueOf(8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2898,iter,2897,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2900,iter,2899,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2902,null,2901,java.lang.Integer.valueOf(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2904,iter,2903,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2906,iter,2905,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2908,null,2907,java.lang.Integer.valueOf(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2910,iter,2909,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2912,iter,2911,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2914,null,2913,java.lang.Integer.valueOf(11));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2916,iter,2915,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2918,iter,2917,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2920,null,2919,java.lang.Integer.valueOf(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,iter,2921,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2924,iter,2923,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2926,null,2925,java.lang.Integer.valueOf(13));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2928,iter,2927,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2930,iter,2929,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2932,null,2931,java.lang.Integer.valueOf(13));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2934,iter,2933,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2936,iter,2935,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2938,null,2937,java.lang.Integer.valueOf(14));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2940,iter,2939,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2942,iter,2941,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2944,null,2943,java.lang.Integer.valueOf(15));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2946,iter,2945,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2948,iter,2947,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2950,null,2949,java.lang.Integer.valueOf(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2952,iter,2951,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2954,iter,2953,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2956,null,2955,java.lang.Integer.valueOf(17));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2958,iter,2957,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2960,iter,2959,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2962,null,2961,java.lang.Integer.valueOf(18));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2964,iter,2963,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2966,iter,2965,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2968,null,2967,java.lang.Integer.valueOf(19));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2970,iter,2969,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2972,iter,2971,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2974,null,2973,java.lang.Integer.valueOf(21));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2976,iter,2975,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2978,iter,2977,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2979,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterateFibEvenOdd_remove729() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateFibEvenOdd_remove729");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2812,null,2811,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2814,iter,2813,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2816,iter,2815,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2818,null,2817,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2820,iter,2819,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2822,iter,2821,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2824,null,2823,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2826,iter,2825,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2828,iter,2827,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2830,null,2829,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2832,iter,2831,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2834,iter,2833,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2836,null,2835,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2838,iter,2837,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2840,iter,2839,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2842,null,2841,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2844,iter,2843,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2846,iter,2845,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2848,null,2847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2850,iter,2849,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2852,iter,2851,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2854,null,2853,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2856,iter,2855,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2858,iter,2857,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2860,null,2859,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2862,iter,2861,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2864,iter,2863,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,null,2865,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,iter,2867,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2870,iter,2869,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2872,null,2871,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2874,iter,2873,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2876,iter,2875,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2878,null,2877,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2880,iter,2879,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2882,iter,2881,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2884,null,2883,java.lang.Integer.valueOf(7));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2886,iter,2885,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2888,iter,2887,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2890,null,2889,java.lang.Integer.valueOf(8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2892,iter,2891,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2894,iter,2893,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2896,null,2895,java.lang.Integer.valueOf(8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2898,iter,2897,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2900,iter,2899,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2902,null,2901,java.lang.Integer.valueOf(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2904,iter,2903,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2906,iter,2905,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2908,null,2907,java.lang.Integer.valueOf(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2910,iter,2909,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2912,iter,2911,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2914,null,2913,java.lang.Integer.valueOf(11));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2916,iter,2915,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2918,iter,2917,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2920,null,2919,java.lang.Integer.valueOf(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,iter,2921,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2924,iter,2923,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2926,null,2925,java.lang.Integer.valueOf(13));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2928,iter,2927,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2930,iter,2929,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2932,null,2931,java.lang.Integer.valueOf(13));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2934,iter,2933,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2936,iter,2935,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2938,null,2937,java.lang.Integer.valueOf(14));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2940,iter,2939,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2942,iter,2941,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2944,null,2943,java.lang.Integer.valueOf(15));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2946,iter,2945,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2948,iter,2947,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2950,null,2949,java.lang.Integer.valueOf(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2952,iter,2951,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2954,iter,2953,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2956,null,2955,java.lang.Integer.valueOf(17));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2958,iter,2957,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2960,iter,2959,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2962,null,2961,java.lang.Integer.valueOf(18));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2964,iter,2963,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2966,iter,2965,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2968,null,2967,java.lang.Integer.valueOf(19));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2970,iter,2969,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2972,iter,2971,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2974,null,2973,java.lang.Integer.valueOf(21));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2976,iter,2975,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2978,iter,2977,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2979,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterateFibEvenOdd_remove730() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateFibEvenOdd_remove730");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2812,null,2811,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2814,iter,2813,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2816,iter,2815,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2818,null,2817,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2820,iter,2819,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2822,iter,2821,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2824,null,2823,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2826,iter,2825,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2828,iter,2827,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2830,null,2829,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2832,iter,2831,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2834,iter,2833,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2836,null,2835,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2838,iter,2837,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2840,iter,2839,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2842,null,2841,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2844,iter,2843,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2846,iter,2845,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2848,null,2847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2850,iter,2849,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2852,iter,2851,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2854,null,2853,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2856,iter,2855,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2858,iter,2857,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2860,null,2859,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2862,iter,2861,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2864,iter,2863,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,null,2865,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,iter,2867,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2870,iter,2869,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2872,null,2871,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2874,iter,2873,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2876,iter,2875,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2878,null,2877,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2880,iter,2879,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2882,iter,2881,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2884,null,2883,java.lang.Integer.valueOf(7));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2886,iter,2885,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2888,iter,2887,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2890,null,2889,java.lang.Integer.valueOf(8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2892,iter,2891,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2894,iter,2893,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2896,null,2895,java.lang.Integer.valueOf(8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2898,iter,2897,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2900,iter,2899,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2902,null,2901,java.lang.Integer.valueOf(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2904,iter,2903,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2906,iter,2905,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2908,null,2907,java.lang.Integer.valueOf(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2910,iter,2909,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2912,iter,2911,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2914,null,2913,java.lang.Integer.valueOf(11));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2916,iter,2915,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2918,iter,2917,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2920,null,2919,java.lang.Integer.valueOf(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,iter,2921,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2924,iter,2923,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2926,null,2925,java.lang.Integer.valueOf(13));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2928,iter,2927,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2930,iter,2929,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2932,null,2931,java.lang.Integer.valueOf(13));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2934,iter,2933,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2936,iter,2935,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2938,null,2937,java.lang.Integer.valueOf(14));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2940,iter,2939,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2942,iter,2941,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2944,null,2943,java.lang.Integer.valueOf(15));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2946,iter,2945,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2948,iter,2947,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2950,null,2949,java.lang.Integer.valueOf(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2952,iter,2951,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2954,iter,2953,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2956,null,2955,java.lang.Integer.valueOf(17));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2958,iter,2957,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2960,iter,2959,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2962,null,2961,java.lang.Integer.valueOf(18));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2964,iter,2963,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2966,iter,2965,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2968,null,2967,java.lang.Integer.valueOf(19));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2970,iter,2969,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2972,iter,2971,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2974,null,2973,java.lang.Integer.valueOf(21));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2976,iter,2975,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2978,iter,2977,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2979,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterateFibEvenOdd_remove731() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterateFibEvenOdd_remove731");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2812,null,2811,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2814,iter,2813,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2816,iter,2815,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2818,null,2817,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2820,iter,2819,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2822,iter,2821,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2824,null,2823,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2826,iter,2825,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2828,iter,2827,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2830,null,2829,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2832,iter,2831,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2834,iter,2833,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2836,null,2835,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2838,iter,2837,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2840,iter,2839,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2842,null,2841,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2844,iter,2843,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2846,iter,2845,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2848,null,2847,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2850,iter,2849,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2852,iter,2851,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2854,null,2853,java.lang.Integer.valueOf(3));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2856,iter,2855,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2858,iter,2857,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2860,null,2859,java.lang.Integer.valueOf(4));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2862,iter,2861,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2864,iter,2863,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2866,null,2865,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2868,iter,2867,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2870,iter,2869,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2872,null,2871,java.lang.Integer.valueOf(5));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2874,iter,2873,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2876,iter,2875,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2878,null,2877,java.lang.Integer.valueOf(6));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2880,iter,2879,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2882,iter,2881,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2884,null,2883,java.lang.Integer.valueOf(7));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2886,iter,2885,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2888,iter,2887,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2890,null,2889,java.lang.Integer.valueOf(8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2892,iter,2891,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2894,iter,2893,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2896,null,2895,java.lang.Integer.valueOf(8));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2898,iter,2897,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2900,iter,2899,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2902,null,2901,java.lang.Integer.valueOf(9));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2904,iter,2903,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2906,iter,2905,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2908,null,2907,java.lang.Integer.valueOf(10));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2910,iter,2909,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2912,iter,2911,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2914,null,2913,java.lang.Integer.valueOf(11));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2916,iter,2915,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2918,iter,2917,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2920,null,2919,java.lang.Integer.valueOf(12));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2922,iter,2921,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2924,iter,2923,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2926,null,2925,java.lang.Integer.valueOf(13));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2928,iter,2927,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2930,iter,2929,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2932,null,2931,java.lang.Integer.valueOf(13));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2934,iter,2933,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2936,iter,2935,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2938,null,2937,java.lang.Integer.valueOf(14));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2940,iter,2939,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2942,iter,2941,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2944,null,2943,java.lang.Integer.valueOf(15));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2946,iter,2945,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2948,iter,2947,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2950,null,2949,java.lang.Integer.valueOf(16));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2952,iter,2951,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2954,iter,2953,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2956,null,2955,java.lang.Integer.valueOf(17));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2958,iter,2957,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2960,iter,2959,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2962,null,2961,java.lang.Integer.valueOf(18));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2964,iter,2963,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2966,iter,2965,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2968,null,2967,java.lang.Integer.valueOf(19));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2970,iter,2969,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2972,iter,2971,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2974,null,2973,java.lang.Integer.valueOf(21));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2976,iter,2975,iter.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2978,iter,2977,iter.getIteratorIndex());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2979,!(iter.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromSingle_add980() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromSingle_add980");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(evens.iterator());
        int expectedSize = evens.size();
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if (((val.intValue()) % 4) == 0) {
                expectedSize--;
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2998,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3000,evens,2999,evens.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromSingle_add981() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromSingle_add981");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        int expectedSize = evens.size();
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if (((val.intValue()) % 4) == 0) {
                expectedSize--;
                iter.remove();
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2998,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3000,evens,2999,evens.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromSingle() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromSingle");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        int expectedSize = evens.size();
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if (((val.intValue()) % 3) == 0) {
                expectedSize--;
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2998,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3000,evens,2999,evens.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromSingle_literalMutation988() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromSingle_literalMutation988");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        int expectedSize = evens.size();
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if (((val.intValue()) % 4) == -1) {
                expectedSize--;
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2998,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3000,evens,2999,evens.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromSingle_remove735() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromSingle_remove735");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        int expectedSize = evens.size();
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if (((val.intValue()) % 4) == 0) {
                expectedSize--;
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2998,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3000,evens,2999,evens.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromDouble_add977() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromDouble_add977");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        int expectedSize = (evens.size()) + (odds.size());
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if ((((val.intValue()) % 4) == 0) || (((val.intValue()) % 3) == 0)) {
                expectedSize--;
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2996,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2997,((evens.size()) + (odds.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromDouble_add978() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromDouble_add978");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        iter.addIterator(odds.iterator());
        int expectedSize = (evens.size()) + (odds.size());
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if ((((val.intValue()) % 4) == 0) || (((val.intValue()) % 3) == 0)) {
                expectedSize--;
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2996,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2997,((evens.size()) + (odds.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromDouble_add979() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromDouble_add979");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        int expectedSize = (evens.size()) + (odds.size());
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if ((((val.intValue()) % 4) == 0) || (((val.intValue()) % 3) == 0)) {
                expectedSize--;
                iter.remove();
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2996,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2997,((evens.size()) + (odds.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromDouble() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromDouble");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        int expectedSize = (evens.size()) + (odds.size());
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if ((((val.intValue()) % 5) == 0) || (((val.intValue()) % 3) == 0)) {
                expectedSize--;
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2996,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2997,((evens.size()) + (odds.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromDouble_literalMutation984() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromDouble_literalMutation984");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        int expectedSize = (evens.size()) + (odds.size());
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if ((((val.intValue()) % 4) == -1) || (((val.intValue()) % 3) == 0)) {
                expectedSize--;
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2996,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2997,((evens.size()) + (odds.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromDouble_literalMutation985() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromDouble_literalMutation985");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        int expectedSize = (evens.size()) + (odds.size());
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if ((((val.intValue()) % 4) == 0) || (((val.intValue()) % 2) == 0)) {
                expectedSize--;
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2996,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2997,((evens.size()) + (odds.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromDouble_literalMutation986() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromDouble_literalMutation986");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(evens.iterator());
        iter.addIterator(odds.iterator());
        int expectedSize = (evens.size()) + (odds.size());
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if ((((val.intValue()) % 4) == 0) || (((val.intValue()) % 3) == -1)) {
                expectedSize--;
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2996,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2997,((evens.size()) + (odds.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromDouble_remove733() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromDouble_remove733");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(odds.iterator());
        int expectedSize = (evens.size()) + (odds.size());
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if ((((val.intValue()) % 4) == 0) || (((val.intValue()) % 3) == 0)) {
                expectedSize--;
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2996,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2997,((evens.size()) + (odds.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromDouble_remove734() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromDouble_remove734");
        final CollatingIterator<java.lang.Integer> iter = new CollatingIterator<java.lang.Integer>(comparator);
        iter.addIterator(odds.iterator());
        int expectedSize = (evens.size()) + (odds.size());
        while (iter.hasNext()) {
            final Object o = iter.next();
            final Integer val = ((Integer)(o));
            if ((((val.intValue()) % 4) == 0) || (((val.intValue()) % 3) == 0)) {
                expectedSize--;
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2996,expectedSize);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2997,((evens.size()) + (odds.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullComparator_add975() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullComparator_add975");
        final List<java.lang.Integer> l1 = java.util.Arrays.asList(1, 3, 5);
        final List<java.lang.Integer> l2 = java.util.Arrays.asList(2, 4, 6);
        final CollatingIterator<java.lang.Integer> collatingIterator1 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        try {
            collatingIterator1.next();
            collatingIterator1.next();
        } catch (final NullPointerException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2991,e.getMessage(),2990,e.getMessage().startsWith("You must invoke setComparator"));
        }
        int i = 0;
        final CollatingIterator<java.lang.Integer> collatingIterator2 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        collatingIterator2.setComparator(new ComparableComparator<java.lang.Integer>());
        for ( ; collatingIterator2.hasNext() ; i++) {
            final Integer n = collatingIterator2.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2992,((int)(n)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2993,(i + 1));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2994,i);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2995,((l1.size()) + (l2.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullComparator_add976() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullComparator_add976");
        final List<java.lang.Integer> l1 = java.util.Arrays.asList(1, 3, 5);
        final List<java.lang.Integer> l2 = java.util.Arrays.asList(2, 4, 6);
        final CollatingIterator<java.lang.Integer> collatingIterator1 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        try {
            collatingIterator1.next();
        } catch (final NullPointerException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2991,e.getMessage(),2990,e.getMessage().startsWith("You must invoke setComparator"));
        }
        int i = 0;
        final CollatingIterator<java.lang.Integer> collatingIterator2 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        collatingIterator2.setComparator(new ComparableComparator<java.lang.Integer>());
        collatingIterator2.setComparator(new ComparableComparator<java.lang.Integer>());
        for ( ; collatingIterator2.hasNext() ; i++) {
            final Integer n = collatingIterator2.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2992,((int)(n)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2993,(i + 1));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2994,i);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2995,((l1.size()) + (l2.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullComparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullComparator");
        final List<java.lang.Integer> l1 = java.util.Arrays.asList(0, 3, 5);
        final List<java.lang.Integer> l2 = java.util.Arrays.asList(2, 4, 6);
        final CollatingIterator<java.lang.Integer> collatingIterator1 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        try {
            collatingIterator1.next();
        } catch (final NullPointerException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2991,e.getMessage(),2990,e.getMessage().startsWith("You must invoke setComparator"));
        }
        int i = 0;
        final CollatingIterator<java.lang.Integer> collatingIterator2 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        collatingIterator2.setComparator(new ComparableComparator<java.lang.Integer>());
        for ( ; collatingIterator2.hasNext() ; i++) {
            final Integer n = collatingIterator2.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2992,((int)(n)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2993,(i + 1));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2994,i);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2995,((l1.size()) + (l2.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullComparator_literalMutation975() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullComparator_literalMutation975");
        final List<java.lang.Integer> l1 = java.util.Arrays.asList(1, 4, 5);
        final List<java.lang.Integer> l2 = java.util.Arrays.asList(2, 4, 6);
        final CollatingIterator<java.lang.Integer> collatingIterator1 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        try {
            collatingIterator1.next();
        } catch (final NullPointerException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2991,e.getMessage(),2990,e.getMessage().startsWith("You must invoke setComparator"));
        }
        int i = 0;
        final CollatingIterator<java.lang.Integer> collatingIterator2 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        collatingIterator2.setComparator(new ComparableComparator<java.lang.Integer>());
        for ( ; collatingIterator2.hasNext() ; i++) {
            final Integer n = collatingIterator2.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2992,((int)(n)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2993,(i + 1));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2994,i);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2995,((l1.size()) + (l2.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullComparator_literalMutation976() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullComparator_literalMutation976");
        final List<java.lang.Integer> l1 = java.util.Arrays.asList(1, 3, 6);
        final List<java.lang.Integer> l2 = java.util.Arrays.asList(2, 4, 6);
        final CollatingIterator<java.lang.Integer> collatingIterator1 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        try {
            collatingIterator1.next();
        } catch (final NullPointerException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2991,e.getMessage(),2990,e.getMessage().startsWith("You must invoke setComparator"));
        }
        int i = 0;
        final CollatingIterator<java.lang.Integer> collatingIterator2 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        collatingIterator2.setComparator(new ComparableComparator<java.lang.Integer>());
        for ( ; collatingIterator2.hasNext() ; i++) {
            final Integer n = collatingIterator2.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2992,((int)(n)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2993,(i + 1));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2994,i);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2995,((l1.size()) + (l2.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullComparator_literalMutation977() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullComparator_literalMutation977");
        final List<java.lang.Integer> l1 = java.util.Arrays.asList(1, 3, 5);
        final List<java.lang.Integer> l2 = java.util.Arrays.asList(1, 4, 6);
        final CollatingIterator<java.lang.Integer> collatingIterator1 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        try {
            collatingIterator1.next();
        } catch (final NullPointerException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2991,e.getMessage(),2990,e.getMessage().startsWith("You must invoke setComparator"));
        }
        int i = 0;
        final CollatingIterator<java.lang.Integer> collatingIterator2 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        collatingIterator2.setComparator(new ComparableComparator<java.lang.Integer>());
        for ( ; collatingIterator2.hasNext() ; i++) {
            final Integer n = collatingIterator2.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2992,((int)(n)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2993,(i + 1));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2994,i);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2995,((l1.size()) + (l2.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullComparator_literalMutation978() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullComparator_literalMutation978");
        final List<java.lang.Integer> l1 = java.util.Arrays.asList(1, 3, 5);
        final List<java.lang.Integer> l2 = java.util.Arrays.asList(2, 5, 6);
        final CollatingIterator<java.lang.Integer> collatingIterator1 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        try {
            collatingIterator1.next();
        } catch (final NullPointerException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2991,e.getMessage(),2990,e.getMessage().startsWith("You must invoke setComparator"));
        }
        int i = 0;
        final CollatingIterator<java.lang.Integer> collatingIterator2 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        collatingIterator2.setComparator(new ComparableComparator<java.lang.Integer>());
        for ( ; collatingIterator2.hasNext() ; i++) {
            final Integer n = collatingIterator2.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2992,((int)(n)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2993,(i + 1));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2994,i);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2995,((l1.size()) + (l2.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullComparator_literalMutation979() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullComparator_literalMutation979");
        final List<java.lang.Integer> l1 = java.util.Arrays.asList(1, 3, 5);
        final List<java.lang.Integer> l2 = java.util.Arrays.asList(2, 4, 7);
        final CollatingIterator<java.lang.Integer> collatingIterator1 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        try {
            collatingIterator1.next();
        } catch (final NullPointerException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2991,e.getMessage(),2990,e.getMessage().startsWith("You must invoke setComparator"));
        }
        int i = 0;
        final CollatingIterator<java.lang.Integer> collatingIterator2 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        collatingIterator2.setComparator(new ComparableComparator<java.lang.Integer>());
        for ( ; collatingIterator2.hasNext() ; i++) {
            final Integer n = collatingIterator2.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2992,((int)(n)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2993,(i + 1));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2994,i);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2995,((l1.size()) + (l2.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testNullComparator_literalMutation981() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullComparator_literalMutation981");
        final List<java.lang.Integer> l1 = java.util.Arrays.asList(1, 3, 5);
        final List<java.lang.Integer> l2 = java.util.Arrays.asList(2, 4, 6);
        final CollatingIterator<java.lang.Integer> collatingIterator1 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        try {
            collatingIterator1.next();
        } catch (final NullPointerException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2991,e.getMessage(),2990,e.getMessage().startsWith("You must invoke setComparator"));
        }
        int i = 1;
        final CollatingIterator<java.lang.Integer> collatingIterator2 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        collatingIterator2.setComparator(new ComparableComparator<java.lang.Integer>());
        for ( ; collatingIterator2.hasNext() ; i++) {
            final Integer n = collatingIterator2.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2992,((int)(n)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2993,(i + 1));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2994,i);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2995,((l1.size()) + (l2.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testNullComparator_remove732() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testNullComparator_remove732");
        final List<java.lang.Integer> l1 = java.util.Arrays.asList(1, 3, 5);
        final List<java.lang.Integer> l2 = java.util.Arrays.asList(2, 4, 6);
        final CollatingIterator<java.lang.Integer> collatingIterator1 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        try {
            collatingIterator1.next();
        } catch (final NullPointerException e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2991,e.getMessage(),2990,e.getMessage().startsWith("You must invoke setComparator"));
        }
        int i = 0;
        final CollatingIterator<java.lang.Integer> collatingIterator2 = new CollatingIterator<java.lang.Integer>(null , l1.iterator() , l2.iterator());
        for ( ; collatingIterator2.hasNext() ; i++) {
            final Integer n = collatingIterator2.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2992,((int)(n)));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2993,(i + 1));
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2994,i);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2995,((l1.size()) + (l2.size())));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

