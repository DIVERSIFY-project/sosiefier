package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

/** 
 * Tests the IteratorChain class.
 * 
 * @version $Id$
 */
public class IteratorChainTest extends AbstractIteratorTest<java.lang.String> {
    protected String[] testArray = new String[]{ "One" , "Two" , "Three" , "Four" , "Five" , "Six" };

    protected List<java.lang.String> list1 = null;

    protected List<java.lang.String> list2 = null;

    protected List<java.lang.String> list3 = null;

    public IteratorChainTest(final String testName) {
        super(testName);
    }

    @Override
    public void setUp() {
        list1 = new ArrayList<java.lang.String>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list2 = new ArrayList<java.lang.String>();
        list2.add("Four");
        list3 = new ArrayList<java.lang.String>();
        list3.add("Five");
        list3.add("Six");
    }

    @Override
    public IteratorChain<java.lang.String> makeEmptyIterator() {
        final ArrayList<java.lang.String> list = new ArrayList<java.lang.String>();
        return new IteratorChain<java.lang.String>(list.iterator());
    }

    @Override
    public IteratorChain<java.lang.String> makeObject() {
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(list1.iterator());
        chain.addIterator(list2.iterator());
        chain.addIterator(list3.iterator());
        return chain;
    }

    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        final Iterator<java.lang.String> iter = makeObject();
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3386,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3387,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3388,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3390,e.getClass(),3389,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterator_add1021() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_add1021");
        final Iterator<java.lang.String> iter = makeObject();
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3386,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3387,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3388,!(iter.hasNext()));
        try {
            iter.next();
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3390,e.getClass(),3389,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1024() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1024");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1025() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1025");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1026() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1026");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1027() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1027");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1028() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1028");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1029() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1029");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1030() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1030");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(3))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator_literalMutation1011() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_literalMutation1011");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 1;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator_literalMutation1012() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_literalMutation1012");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(2));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator_literalMutation1013() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_literalMutation1013");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(1));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator_literalMutation1014() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_literalMutation1014");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(4));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator_literalMutation1015() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_literalMutation1015");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(3));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_remove771() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_remove771");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_remove772() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_remove772");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_remove773() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_remove773");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_remove774() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_remove774");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_remove775() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_remove775");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3397,list1,3396,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3399,list2,3398,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public void testRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove");
        final Iterator<java.lang.String> iter = makeObject();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        for (final String testValue : testArray) {
            final String iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3391,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3392,iterValue);
            if (!(iterValue.equals("Four"))) {
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3393,((list1.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3394,((list2.size()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3395,((list3.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add1022() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1022");
        final Iterator<java.lang.String> iter = makeObject();
        try {
            iter.remove();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        for (final String testValue : testArray) {
            final String iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3391,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3392,iterValue);
            if (!(iterValue.equals("Four"))) {
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3393,((list1.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3394,((list2.size()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3395,((list3.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add1023() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1023");
        final Iterator<java.lang.String> iter = makeObject();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        for (final String testValue : testArray) {
            final String iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3391,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3392,iterValue);
            if (!(iterValue.equals("Four"))) {
                iter.remove();
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3393,((list1.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3394,((list2.size()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3395,((list3.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemove_literalMutation1009() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_literalMutation1009");
        final Iterator<java.lang.String> iter = makeObject();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        for (final String testValue : testArray) {
            final String iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3391,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3392,iterValue);
            if (!(iterValue.equals("foo"))) {
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3393,((list1.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3394,((list2.size()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3395,((list3.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove770() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove770");
        final Iterator<java.lang.String> iter = makeObject();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        for (final String testValue : testArray) {
            final String iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3391,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3392,iterValue);
            if (!(iterValue.equals("Four"))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3393,((list1.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3394,((list2.size()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3395,((list3.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_add1016() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_add1016");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("C");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(empty.iterator());
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_add1017() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_add1017");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("B");
        notEmpty.add("C");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(empty.iterator());
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_add1018() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_add1018");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("C");
        notEmpty.add("C");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(empty.iterator());
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_add1019() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_add1019");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("C");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(empty.iterator());
        chain.addIterator(empty.iterator());
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_add1020() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_add1020");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("C");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(empty.iterator());
        chain.addIterator(notEmpty.iterator());
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFirstIteratorIsEmptyBug() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("foo");
        notEmpty.add("B");
        notEmpty.add("C");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(empty.iterator());
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFirstIteratorIsEmptyBug_literalMutation1007() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_literalMutation1007");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("foo");
        notEmpty.add("C");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(empty.iterator());
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFirstIteratorIsEmptyBug_literalMutation1008() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_literalMutation1008");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("foo");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(empty.iterator());
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_remove765() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_remove765");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("B");
        notEmpty.add("C");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(empty.iterator());
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_remove766() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_remove766");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("B");
        notEmpty.add("C");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(empty.iterator());
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_remove767() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_remove767");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("B");
        notEmpty.add("C");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(empty.iterator());
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_remove768() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_remove768");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("C");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_remove769() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_remove769");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("C");
        final IteratorChain<java.lang.String> chain = new IteratorChain<java.lang.String>();
        chain.addIterator(notEmpty.iterator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3374,chain,3373,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3376,chain,3375,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3378,chain,3377,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3380,chain,3379,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3382,chain,3381,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3384,chain,3383,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3385,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyChain() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyChain");
        final IteratorChain<java.lang.Object> chain = new IteratorChain<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3372,chain,3371,chain.hasNext());
        try {
            chain.next();
            chain.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            chain.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testEmptyChain_add1015() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyChain_add1015");
        final IteratorChain<java.lang.Object> chain = new IteratorChain<java.lang.Object>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3372,chain,3371,chain.hasNext());
        try {
            chain.next();
        } catch (final NoSuchElementException ex) {
        }
        try {
            chain.remove();
            chain.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

