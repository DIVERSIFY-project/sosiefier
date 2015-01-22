package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.Predicate;
import java.util.Set;
import junit.framework.Test;

/** 
 * Extension of {@link AbstractBagTest} for exercising the {@link PredicatedBag}
 * implementation.
 * 
 * @version $Id$
 * @since 3.0
 */
public class PredicatedBagTest<T> extends AbstractBagTest<T> {
    public PredicatedBagTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return org.apache.commons.collections4.BulkTest.makeSuite(PredicatedBagTest.class);
    }

    protected Predicate<T> stringPredicate() {
        return new Predicate<T>() {
            public boolean evaluate(final T o) {
                return o instanceof String;
            }
        };
    }

    protected Predicate<T> truePredicate = org.apache.commons.collections4.functors.TruePredicate.<T>truePredicate();

    protected Bag<T> decorateBag(final HashBag<T> bag, final Predicate<T> predicate) {
        return PredicatedBag.predicatedBag(bag, predicate);
    }

    @Override
    public Bag<T> makeObject() {
        return decorateBag(new HashBag<T>(), truePredicate);
    }

    protected Bag<T> makeTestBag() {
        return decorateBag(new HashBag<T>(), stringPredicate());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5847,bag,5846,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5848,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5850,bag,5849,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,bag,5851,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,set,5853,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5857,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1601() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1601");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5847,bag,5846,bag.size());
        final T[] els = ((T[])(new Object[]{ "foo" , "3" , "5" , "7" , "2" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5848,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5850,bag,5849,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,bag,5851,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,set,5853,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5857,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1602() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1602");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5847,bag,5846,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "foo" , "5" , "7" , "2" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5848,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5850,bag,5849,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,bag,5851,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,set,5853,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5857,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1603() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1603");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5847,bag,5846,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "foo" , "7" , "2" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5848,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5850,bag,5849,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,bag,5851,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,set,5853,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5857,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1604() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1604");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5847,bag,5846,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "foo" , "2" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5848,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5850,bag,5849,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,bag,5851,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,set,5853,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5857,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1605() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1605");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5847,bag,5846,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "7" , "foo" , "4" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5848,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5850,bag,5849,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,bag,5851,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,set,5853,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5857,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1606() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1606");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5847,bag,5846,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "foo" , "1" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5848,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5850,bag,5849,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,bag,5851,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,set,5853,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5857,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1607() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1607");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5847,bag,5846,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "foo" }));
        for (int i = 0 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5848,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5850,bag,5849,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,bag,5851,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,set,5853,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5857,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testlegalAddRemove_literalMutation1608() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testlegalAddRemove_literalMutation1608");
        final Bag<T> bag = makeTestBag();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5847,bag,5846,bag.size());
        final T[] els = ((T[])(new Object[]{ "1" , "3" , "5" , "7" , "2" , "4" , "1" }));
        for (int i = -1 ; i < (els.length) ; i++) {
            bag.add(els[i]);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5848,(i + 1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5850,bag,5849,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5852,bag,5851,bag.contains(els[i]));
        }
        Set<T> set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5854,set,5853,set.contains(els[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5856,bag,5855,bag.remove(els[0]));
        set = ((PredicatedBag<T>)(bag)).uniqueSet();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5857,!(set.contains(els[0])));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd");
        final Bag<T> bag = makeTestBag();
        final Integer i = Integer.valueOf(3);
        try {
            bag.add(((T)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5845,!(bag.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd_literalMutation1592() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_literalMutation1592");
        final Bag<T> bag = makeTestBag();
        final Integer i = Integer.valueOf(3);
        try {
            bag.add(((T)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5845,!(bag.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalAdd_literalMutation1593() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalAdd_literalMutation1593");
        final Bag<T> bag = makeTestBag();
        final Integer i = Integer.valueOf(2);
        try {
            bag.add(((T)(i)));
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5845,!(bag.contains(i)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalDecorate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalDecorate_literalMutation1595() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_literalMutation1595");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("foo");
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalDecorate_literalMutation1596() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_literalMutation1596");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("foo");
        elements.add(Integer.valueOf(3));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalDecorate_literalMutation1597() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_literalMutation1597");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("two");
        elements.add(Integer.valueOf(2));
        elements.add("four");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testIllegalDecorate_literalMutation1598() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testIllegalDecorate_literalMutation1598");
        final HashBag<java.lang.Object> elements = new HashBag<java.lang.Object>();
        elements.add("one");
        elements.add("two");
        elements.add(Integer.valueOf(3));
        elements.add("foo");
        try {
            decorateBag(((HashBag<T>)(elements)), stringPredicate());
        } catch (final IllegalArgumentException e) {
        }
        try {
            decorateBag(new HashBag<T>(), null);
        } catch (final IllegalArgumentException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }
}

