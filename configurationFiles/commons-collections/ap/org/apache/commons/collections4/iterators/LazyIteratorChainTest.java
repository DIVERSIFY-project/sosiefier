package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

/** 
 * Tests the LazyIteratorChain class.
 * 
 * @version $Id$
 */
public class LazyIteratorChainTest extends AbstractIteratorTest<java.lang.String> {
    protected String[] testArray = new String[]{ "One" , "Two" , "Three" , "Four" , "Five" , "Six" };

    protected List<java.lang.String> list1 = null;

    protected List<java.lang.String> list2 = null;

    protected List<java.lang.String> list3 = null;

    public LazyIteratorChainTest(final String testName) {
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
    public LazyIteratorChain<java.lang.String> makeEmptyIterator() {
        return new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                return null;
            }
        };
    }

    @Override
    public LazyIteratorChain<java.lang.String> makeObject() {
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return list1.iterator();
                    case 2 :
                        return list2.iterator();
                    case 3 :
                        return list3.iterator();
                }
                return null;
            }
        };
        return chain;
    }

    public void testIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator");
        final Iterator<java.lang.String> iter = makeObject();
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3432,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3433,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3434,!(iter.hasNext()));
        try {
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3436,e.getClass(),3435,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testIterator_add1041() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIterator_add1041");
        final Iterator<java.lang.String> iter = makeObject();
        for (final String testValue : testArray) {
            final Object iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3432,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3433,iterValue);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3434,!(iter.hasNext()));
        try {
            iter.next();
            iter.next();
        } catch (final Exception e) {
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3436,e.getClass(),3435,e.getClass().equals(new java.util.NoSuchElementException().getClass()));
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1044() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1044");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1045() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1045");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1046() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1046");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1047() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1047");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1048() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1048");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1049() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1049");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_add1050() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_add1050");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator_literalMutation1026() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_literalMutation1026");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(5))) < 0;
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator_literalMutation1027() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_literalMutation1027");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator_literalMutation1028() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_literalMutation1028");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(0));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator_literalMutation1029() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_literalMutation1029");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(3));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator_literalMutation1030() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_literalMutation1030");
        final Predicate<java.lang.Integer> myPredicate = new Predicate<java.lang.Integer>() {
            public boolean evaluate(final Integer i) {
                return (i.compareTo(Integer.valueOf(4))) < 0;
            }
        };
        final List<java.lang.Integer> list1 = new ArrayList<java.lang.Integer>();
        final List<java.lang.Integer> list2 = new ArrayList<java.lang.Integer>();
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(4));
        final Iterator<java.lang.Integer> it1 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list1.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it2 = org.apache.commons.collections4.IteratorUtils.filteredIterator(list2.iterator(), myPredicate);
        final Iterator<java.lang.Integer> it = org.apache.commons.collections4.IteratorUtils.chainedIterator(it1, it2);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemoveFromFilteredIterator_literalMutation1031() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_literalMutation1031");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_remove784() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_remove784");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_remove785() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_remove785");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_remove786() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_remove786");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_remove787() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_remove787");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemoveFromFilteredIterator_remove788() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemoveFromFilteredIterator_remove788");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3443,list1,3442,list1.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3445,list2,3444,list2.size());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3437,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3438,iterValue);
            if (!(iterValue.equals("Four"))) {
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3439,((list1.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3440,((list2.size()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3441,((list3.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add1042() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1042");
        final Iterator<java.lang.String> iter = makeObject();
        try {
            iter.remove();
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        for (final String testValue : testArray) {
            final String iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3437,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3438,iterValue);
            if (!(iterValue.equals("Four"))) {
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3439,((list1.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3440,((list2.size()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3441,((list3.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_add1043() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_add1043");
        final Iterator<java.lang.String> iter = makeObject();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        for (final String testValue : testArray) {
            final String iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3437,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3438,iterValue);
            if (!(iterValue.equals("Four"))) {
                iter.remove();
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3439,((list1.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3440,((list2.size()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3441,((list3.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testRemove_literalMutation1025() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_literalMutation1025");
        final Iterator<java.lang.String> iter = makeObject();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        for (final String testValue : testArray) {
            final String iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3437,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3438,iterValue);
            if (!(iterValue.equals("foo"))) {
                iter.remove();
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3439,((list1.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3440,((list2.size()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3441,((list3.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testRemove_remove783() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testRemove_remove783");
        final Iterator<java.lang.String> iter = makeObject();
        try {
            iter.remove();
        } catch (final IllegalStateException e) {
        }
        for (final String testValue : testArray) {
            final String iterValue = iter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3437,testValue);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3438,iterValue);
            if (!(iterValue.equals("Four"))) {
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3439,((list1.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3440,((list2.size()) == 1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3441,((list3.size()) == 0));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFirstIteratorIsEmptyBug() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("C");
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return empty.iterator();
                    case 2 :
                        return notEmpty.iterator();
                }
                return null;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,chain,3419,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,chain,3421,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,chain,3423,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,chain,3425,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,chain,3427,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,chain,3429,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3431,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_add1037() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_add1037");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("C");
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return empty.iterator();
                    case 2 :
                        return notEmpty.iterator();
                }
                return null;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,chain,3419,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,chain,3421,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,chain,3423,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,chain,3425,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,chain,3427,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,chain,3429,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3431,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_add1038() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_add1038");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("B");
        notEmpty.add("C");
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return empty.iterator();
                    case 2 :
                        return notEmpty.iterator();
                }
                return null;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,chain,3419,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,chain,3421,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,chain,3423,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,chain,3425,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,chain,3427,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,chain,3429,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3431,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_add1039() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_add1039");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("C");
        notEmpty.add("C");
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return empty.iterator();
                    case 2 :
                        return notEmpty.iterator();
                }
                return null;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,chain,3419,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,chain,3421,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,chain,3423,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,chain,3425,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,chain,3427,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,chain,3429,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3431,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_add1040() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_add1040");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("C");
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return empty.iterator();
                    case 2 :
                        return notEmpty.iterator();
                }
                return null;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,chain,3419,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,chain,3421,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,chain,3423,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,chain,3425,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,chain,3427,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,chain,3429,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3431,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFirstIteratorIsEmptyBug_literalMutation1021() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_literalMutation1021");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("foo");
        notEmpty.add("B");
        notEmpty.add("C");
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return empty.iterator();
                    case 2 :
                        return notEmpty.iterator();
                }
                return null;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,chain,3419,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,chain,3421,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,chain,3423,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,chain,3425,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,chain,3427,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,chain,3429,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3431,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFirstIteratorIsEmptyBug_literalMutation1022() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_literalMutation1022");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("foo");
        notEmpty.add("C");
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return empty.iterator();
                    case 2 :
                        return notEmpty.iterator();
                }
                return null;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,chain,3419,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,chain,3421,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,chain,3423,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,chain,3425,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,chain,3427,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,chain,3429,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3431,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFirstIteratorIsEmptyBug_literalMutation1023() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_literalMutation1023");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("foo");
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return empty.iterator();
                    case 2 :
                        return notEmpty.iterator();
                }
                return null;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,chain,3419,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,chain,3421,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,chain,3423,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,chain,3425,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,chain,3427,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,chain,3429,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3431,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_remove779() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_remove779");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("B");
        notEmpty.add("C");
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return empty.iterator();
                    case 2 :
                        return notEmpty.iterator();
                }
                return null;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,chain,3419,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,chain,3421,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,chain,3423,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,chain,3425,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,chain,3427,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,chain,3429,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3431,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_remove780() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_remove780");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("B");
        notEmpty.add("C");
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return empty.iterator();
                    case 2 :
                        return notEmpty.iterator();
                }
                return null;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,chain,3419,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,chain,3421,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,chain,3423,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,chain,3425,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,chain,3427,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,chain,3429,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3431,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_remove781() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_remove781");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("B");
        notEmpty.add("C");
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return empty.iterator();
                    case 2 :
                        return notEmpty.iterator();
                }
                return null;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,chain,3419,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,chain,3421,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,chain,3423,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,chain,3425,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,chain,3427,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,chain,3429,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3431,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFirstIteratorIsEmptyBug_remove782() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFirstIteratorIsEmptyBug_remove782");
        final List<java.lang.String> empty = new ArrayList<java.lang.String>();
        final List<java.lang.String> notEmpty = new ArrayList<java.lang.String>();
        notEmpty.add("A");
        notEmpty.add("B");
        notEmpty.add("C");
        final LazyIteratorChain<java.lang.String> chain = new LazyIteratorChain<java.lang.String>() {
            @Override
            protected Iterator<java.lang.String> nextIterator(final int count) {
                switch (count) {
                    case 1 :
                        return empty.iterator();
                    case 2 :
                        return notEmpty.iterator();
                }
                return null;
            }
        };
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3420,chain,3419,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3422,chain,3421,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3424,chain,3423,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3426,chain,3425,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3428,chain,3427,chain.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3430,chain,3429,chain.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3431,!(chain.hasNext()));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testEmptyChain() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyChain");
        final LazyIteratorChain<java.lang.String> chain = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3418,chain,3417,chain.hasNext());
        try {
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
    public void testEmptyChain_add1035() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyChain_add1035");
        final LazyIteratorChain<java.lang.String> chain = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3418,chain,3417,chain.hasNext());
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
    public void testEmptyChain_add1036() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyChain_add1036");
        final LazyIteratorChain<java.lang.String> chain = makeEmptyIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),3418,chain,3417,chain.hasNext());
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

