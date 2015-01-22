package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.collection.AbstractCollectionTest;
import org.apache.commons.collections4.set.AbstractSetTest;
import java.util.ArrayList;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.BulkTest;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/** 
 * Abstract test class for {@link org.apache.commons.collections4.Bag Bag} methods and contracts.
 * <p/>
 * To use, simply extend this class, and implement
 * the {@link #makeObject} method.
 * <p/>
 * If your bag fails one of these tests by design,
 * you may still use this base set of cases.  Simply override the
 * test case (method) your bag fails.
 * <p/>
 * <b>Note:</b> The Bag interface does not conform to the Collection interface
 * so the generic collection tests from AbstractCollectionTest would normally fail.
 * As a work-around since 4.0, a CollectionBag decorator can be used
 * to make any Bag implementation comply to the Collection contract.
 * <p/>
 * This abstract test class does wrap the concrete bag implementation
 * with such a decorator, see the overridden {@link #resetEmpty()} and
 * {@link #resetFull()} methods.
 * <p/>
 * In addition to the generic collection tests (prefix testCollection) inherited
 * from AbstractCollectionTest, there are test methods that test the "normal" Bag
 * interface (prefix testBag). For Bag specific tests use the {@link #makeObject()} and
 * {@link #makeFullCollection()} methods instead of {@link #resetEmpty()} and resetFull(),
 * otherwise the collection will be wrapped by a {@link CollectionBag} decorator.
 * 
 * @version $Id$
 */
public abstract class AbstractBagTest<T> extends AbstractCollectionTest<T> {
    /** 
     * JUnit constructor.
     * 
     * @param testName the test class name
     */
public AbstractBagTest(final String testName) {
        super(testName);
    }

    /** 
     * Returns an empty {@link ArrayList}.
     */
@Override
    public Collection<T> makeConfirmedCollection() {
        final ArrayList<T> list = new ArrayList<T>();
        return list;
    }

    /** 
     * Returns a full collection.
     */
@Override
    public Collection<T> makeConfirmedFullCollection() {
        final Collection<T> coll = makeConfirmedCollection();
        coll.addAll(java.util.Arrays.asList(getFullElements()));
        return coll;
    }

    /** 
     * Return a new, empty bag to used for testing.
     * 
     * @return the bag to be tested
     */
@Override
    public abstract Bag<T> makeObject();

    /** 
     * {@inheritDoc}
     */
@Override
    public Bag<T> makeFullCollection() {
        final Bag<T> bag = makeObject();
        bag.addAll(java.util.Arrays.asList(getFullElements()));
        return bag;
    }

    @Override
    public void resetEmpty() {
        setCollection(org.apache.commons.collections4.bag.CollectionBag.collectionBag(makeObject()));
        setConfirmed(makeConfirmedCollection());
    }

    @Override
    public void resetFull() {
        setCollection(org.apache.commons.collections4.bag.CollectionBag.collectionBag(makeFullCollection()));
        setConfirmed(makeConfirmedFullCollection());
    }

    /** 
     * Returns the {@link #collection} field cast to a {@link Bag}.
     * 
     * @return the collection field as a Bag
     */
@Override
    public Bag<T> getCollection() {
        return ((Bag<T>)(super.getCollection()));
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagAdd");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,bag,5603,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,bag,5605,bag.getCount("A"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,bag,5607,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,bag,5609,bag.getCount("A"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,bag,5611,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,bag,5613,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagAdd_literalMutation1427() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagAdd_literalMutation1427");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,bag,5603,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,bag,5605,bag.getCount("A"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,bag,5607,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,bag,5609,bag.getCount("A"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,bag,5611,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,bag,5613,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagAdd_literalMutation1428() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagAdd_literalMutation1428");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,bag,5603,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,bag,5605,bag.getCount("A"));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,bag,5607,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,bag,5609,bag.getCount("A"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,bag,5611,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,bag,5613,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagAdd_literalMutation1429() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagAdd_literalMutation1429");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5604,bag,5603,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5606,bag,5605,bag.getCount("A"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5608,bag,5607,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5610,bag,5609,bag.getCount("A"));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5612,bag,5611,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5614,bag,5613,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsSelf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,bag,5689,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,bag,5691,bag.equals(bag));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,bag,5693,bag.equals(bag));
        bag.add(((T)("elt2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,bag,5695,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsSelf_literalMutation1468() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf_literalMutation1468");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,bag,5689,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,bag,5691,bag.equals(bag));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,bag,5693,bag.equals(bag));
        bag.add(((T)("elt2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,bag,5695,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsSelf_literalMutation1469() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf_literalMutation1469");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,bag,5689,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,bag,5691,bag.equals(bag));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,bag,5693,bag.equals(bag));
        bag.add(((T)("elt2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,bag,5695,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsSelf_literalMutation1470() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf_literalMutation1470");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5690,bag,5689,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5692,bag,5691,bag.equals(bag));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5694,bag,5693,bag.equals(bag));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5696,bag,5695,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag,5771,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag,5775,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag,5777,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5780,bag,5779,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,bag,5781,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemove_literalMutation1513() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_literalMutation1513");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag,5771,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag,5775,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag,5777,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5780,bag,5779,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,bag,5781,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemove_literalMutation1514() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_literalMutation1514");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag,5771,bag.getCount("A"));
        bag.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag,5775,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag,5777,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5780,bag,5779,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,bag,5781,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemove_literalMutation1515() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_literalMutation1515");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag,5771,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.getCount("A"));
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag,5775,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag,5777,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5780,bag,5779,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,bag,5781,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemove_literalMutation1516() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_literalMutation1516");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag,5771,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag,5775,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag,5777,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5780,bag,5779,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,bag,5781,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemove_literalMutation1517() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_literalMutation1517");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag,5771,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag,5775,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag,5777,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5780,bag,5779,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,bag,5781,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemove_literalMutation1518() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_literalMutation1518");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag,5771,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag,5775,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag,5777,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5780,bag,5779,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,bag,5781,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemove_literalMutation1519() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_literalMutation1519");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag,5771,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag,5775,bag.getCount("A"));
        bag.remove("foo", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag,5777,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5780,bag,5779,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,bag,5781,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemove_literalMutation1520() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_literalMutation1520");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag,5771,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag,5775,bag.getCount("A"));
        bag.remove("A", -1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag,5777,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5780,bag,5779,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,bag,5781,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemove_literalMutation1521() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_literalMutation1521");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag,5771,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag,5775,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag,5777,bag.getCount("A"));
        bag.remove("foo", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5780,bag,5779,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,bag,5781,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemove_literalMutation1522() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_literalMutation1522");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag,5771,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag,5775,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag,5777,bag.getCount("A"));
        bag.remove("A", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5780,bag,5779,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,bag,5781,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemove_literalMutation1523() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_literalMutation1523");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag,5771,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag,5775,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag,5777,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5780,bag,5779,bag.getCount("A"));
        bag.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5782,bag,5781,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemoveAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5760,bag,5759,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5762,bag,5761,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,bag,5763,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,bag,5765,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,bag,5767,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5770,bag,5769,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemoveAll_literalMutation1525() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_literalMutation1525");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("foo")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5760,bag,5759,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5762,bag,5761,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,bag,5763,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,bag,5765,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,bag,5767,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5770,bag,5769,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemoveAll_literalMutation1526() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_literalMutation1526");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5760,bag,5759,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5762,bag,5761,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,bag,5763,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,bag,5765,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,bag,5767,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5770,bag,5769,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemoveAll_literalMutation1527() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_literalMutation1527");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5760,bag,5759,bag.getCount("A"));
        bag.add(((T)("foo")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5762,bag,5761,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,bag,5763,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,bag,5765,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,bag,5767,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5770,bag,5769,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemoveAll_literalMutation1528() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_literalMutation1528");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5760,bag,5759,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5762,bag,5761,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,bag,5763,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,bag,5765,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,bag,5767,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5770,bag,5769,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemoveAll_literalMutation1529() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_literalMutation1529");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5760,bag,5759,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5762,bag,5761,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("foo");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,bag,5763,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,bag,5765,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,bag,5767,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5770,bag,5769,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRemoveAll_literalMutation1530() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_literalMutation1530");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5760,bag,5759,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5762,bag,5761,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("foo");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,bag,5763,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,bag,5765,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,bag,5767,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5770,bag,5769,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContains() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5666,bag,5665,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5668,bag,5667,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5670,bag,5669,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5672,bag,5671,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,bag,5673,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,bag,5675,bag.contains("B"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,bag,5677,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContains_literalMutation1431() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains_literalMutation1431");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5666,bag,5665,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5668,bag,5667,bag.contains("B"));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5670,bag,5669,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5672,bag,5671,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,bag,5673,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,bag,5675,bag.contains("B"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,bag,5677,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContains_literalMutation1432() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains_literalMutation1432");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5666,bag,5665,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5668,bag,5667,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5670,bag,5669,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5672,bag,5671,bag.contains("B"));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,bag,5673,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,bag,5675,bag.contains("B"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,bag,5677,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContains_literalMutation1433() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains_literalMutation1433");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5666,bag,5665,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5668,bag,5667,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5670,bag,5669,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5672,bag,5671,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5674,bag,5673,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5676,bag,5675,bag.contains("B"));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,bag,5677,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContainsAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        known1A.add("A");
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,bag,5615,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5618,bag,5617,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5620,bag,5619,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5622,bag,5621,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5624,bag,5623,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5626,bag,5625,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,bag,5627,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,bag,5629,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,bag,5631,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5634,bag,5633,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5636,bag,5635,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5638,bag,5637,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5640,bag,5639,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5642,bag,5641,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,bag,5643,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,bag,5645,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,bag,5647,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,bag,5649,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5652,bag,5651,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5654,bag,5653,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5656,bag,5655,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,bag,5657,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,bag,5659,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,bag,5661,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,bag,5663,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContainsAll_literalMutation1435() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_literalMutation1435");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        known1A.add("foo");
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,bag,5615,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5618,bag,5617,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5620,bag,5619,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5622,bag,5621,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5624,bag,5623,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5626,bag,5625,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,bag,5627,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,bag,5629,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,bag,5631,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5634,bag,5633,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5636,bag,5635,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5638,bag,5637,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5640,bag,5639,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5642,bag,5641,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,bag,5643,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,bag,5645,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,bag,5647,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,bag,5649,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5652,bag,5651,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5654,bag,5653,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5656,bag,5655,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,bag,5657,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,bag,5659,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,bag,5661,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,bag,5663,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContainsAll_literalMutation1436() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_literalMutation1436");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        known1A.add("A");
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("foo");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,bag,5615,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5618,bag,5617,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5620,bag,5619,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5622,bag,5621,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5624,bag,5623,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5626,bag,5625,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,bag,5627,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,bag,5629,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,bag,5631,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5634,bag,5633,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5636,bag,5635,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5638,bag,5637,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5640,bag,5639,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5642,bag,5641,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,bag,5643,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,bag,5645,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,bag,5647,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,bag,5649,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5652,bag,5651,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5654,bag,5653,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5656,bag,5655,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,bag,5657,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,bag,5659,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,bag,5661,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,bag,5663,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContainsAll_literalMutation1437() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_literalMutation1437");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        known1A.add("A");
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("foo");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,bag,5615,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5618,bag,5617,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5620,bag,5619,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5622,bag,5621,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5624,bag,5623,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5626,bag,5625,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,bag,5627,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,bag,5629,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,bag,5631,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5634,bag,5633,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5636,bag,5635,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5638,bag,5637,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5640,bag,5639,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5642,bag,5641,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,bag,5643,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,bag,5645,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,bag,5647,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,bag,5649,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5652,bag,5651,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5654,bag,5653,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5656,bag,5655,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,bag,5657,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,bag,5659,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,bag,5661,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,bag,5663,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContainsAll_literalMutation1438() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_literalMutation1438");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        known1A.add("A");
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("foo");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,bag,5615,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5618,bag,5617,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5620,bag,5619,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5622,bag,5621,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5624,bag,5623,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5626,bag,5625,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,bag,5627,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,bag,5629,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,bag,5631,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5634,bag,5633,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5636,bag,5635,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5638,bag,5637,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5640,bag,5639,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5642,bag,5641,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,bag,5643,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,bag,5645,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,bag,5647,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,bag,5649,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5652,bag,5651,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5654,bag,5653,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5656,bag,5655,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,bag,5657,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,bag,5659,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,bag,5661,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,bag,5663,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContainsAll_literalMutation1439() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_literalMutation1439");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        known1A.add("A");
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("foo");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,bag,5615,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5618,bag,5617,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5620,bag,5619,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5622,bag,5621,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5624,bag,5623,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5626,bag,5625,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,bag,5627,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,bag,5629,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,bag,5631,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5634,bag,5633,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5636,bag,5635,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5638,bag,5637,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5640,bag,5639,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5642,bag,5641,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,bag,5643,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,bag,5645,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,bag,5647,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,bag,5649,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5652,bag,5651,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5654,bag,5653,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5656,bag,5655,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,bag,5657,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,bag,5659,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,bag,5661,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,bag,5663,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContainsAll_literalMutation1440() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_literalMutation1440");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        known1A.add("A");
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,bag,5615,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5618,bag,5617,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5620,bag,5619,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5622,bag,5621,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5624,bag,5623,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5626,bag,5625,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,bag,5627,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,bag,5629,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,bag,5631,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5634,bag,5633,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5636,bag,5635,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5638,bag,5637,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5640,bag,5639,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5642,bag,5641,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,bag,5643,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,bag,5645,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,bag,5647,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,bag,5649,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5652,bag,5651,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5654,bag,5653,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5656,bag,5655,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,bag,5657,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,bag,5659,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,bag,5661,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,bag,5663,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContainsAll_literalMutation1441() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_literalMutation1441");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        known1A.add("A");
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,bag,5615,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5618,bag,5617,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5620,bag,5619,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5622,bag,5621,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5624,bag,5623,bag.containsAll(known1A1B));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5626,bag,5625,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,bag,5627,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,bag,5629,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,bag,5631,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5634,bag,5633,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5636,bag,5635,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5638,bag,5637,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5640,bag,5639,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5642,bag,5641,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,bag,5643,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,bag,5645,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,bag,5647,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,bag,5649,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5652,bag,5651,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5654,bag,5653,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5656,bag,5655,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,bag,5657,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,bag,5659,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,bag,5661,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,bag,5663,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContainsAll_literalMutation1442() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_literalMutation1442");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        known1A.add("A");
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,bag,5615,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5618,bag,5617,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5620,bag,5619,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5622,bag,5621,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5624,bag,5623,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5626,bag,5625,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,bag,5627,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,bag,5629,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,bag,5631,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5634,bag,5633,bag.containsAll(known1A1B));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5636,bag,5635,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5638,bag,5637,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5640,bag,5639,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5642,bag,5641,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,bag,5643,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,bag,5645,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,bag,5647,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,bag,5649,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5652,bag,5651,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5654,bag,5653,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5656,bag,5655,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,bag,5657,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,bag,5659,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,bag,5661,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,bag,5663,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContainsAll_literalMutation1443() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_literalMutation1443");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        known1A.add("A");
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,bag,5615,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5618,bag,5617,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5620,bag,5619,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5622,bag,5621,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5624,bag,5623,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5626,bag,5625,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,bag,5627,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,bag,5629,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,bag,5631,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5634,bag,5633,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5636,bag,5635,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5638,bag,5637,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5640,bag,5639,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5642,bag,5641,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,bag,5643,bag.containsAll(known1A1B));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,bag,5645,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,bag,5647,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,bag,5649,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5652,bag,5651,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5654,bag,5653,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5656,bag,5655,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,bag,5657,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,bag,5659,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,bag,5661,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,bag,5663,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContainsAll_literalMutation1444() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_literalMutation1444");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        known1A.add("A");
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5616,bag,5615,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5618,bag,5617,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5620,bag,5619,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5622,bag,5621,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5624,bag,5623,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5626,bag,5625,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5628,bag,5627,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5630,bag,5629,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5632,bag,5631,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5634,bag,5633,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5636,bag,5635,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5638,bag,5637,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5640,bag,5639,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5642,bag,5641,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5644,bag,5643,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5646,bag,5645,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5648,bag,5647,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5650,bag,5649,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5652,bag,5651,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5654,bag,5653,bag.containsAll(known1A1B));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5656,bag,5655,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5658,bag,5657,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5660,bag,5659,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5662,bag,5661,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5664,bag,5663,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5786,bag,5785,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5788,bag,5787,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5790,bag,5789,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5792,bag,5791,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5794,bag,5793,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5796,bag,5795,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5798,bag,5797,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5800,bag,5799,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5802,bag,5801,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1541() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1541");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5786,bag,5785,bag.size());
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5788,bag,5787,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5790,bag,5789,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5792,bag,5791,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5794,bag,5793,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5796,bag,5795,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5798,bag,5797,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5800,bag,5799,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5802,bag,5801,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1542() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1542");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5786,bag,5785,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5788,bag,5787,bag.size());
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5790,bag,5789,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5792,bag,5791,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5794,bag,5793,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5796,bag,5795,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5798,bag,5797,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5800,bag,5799,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5802,bag,5801,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1543() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1543");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5786,bag,5785,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5788,bag,5787,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5790,bag,5789,bag.size());
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5792,bag,5791,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5794,bag,5793,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5796,bag,5795,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5798,bag,5797,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5800,bag,5799,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5802,bag,5801,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1544() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1544");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5786,bag,5785,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5788,bag,5787,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5790,bag,5789,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5792,bag,5791,bag.size());
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5794,bag,5793,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5796,bag,5795,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5798,bag,5797,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5800,bag,5799,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5802,bag,5801,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1545() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1545");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5786,bag,5785,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5788,bag,5787,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5790,bag,5789,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5792,bag,5791,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5794,bag,5793,bag.size());
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5796,bag,5795,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5798,bag,5797,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5800,bag,5799,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5802,bag,5801,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1546() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1546");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5786,bag,5785,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5788,bag,5787,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5790,bag,5789,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5792,bag,5791,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5794,bag,5793,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5796,bag,5795,bag.size());
        bag.remove("foo", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5798,bag,5797,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5800,bag,5799,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5802,bag,5801,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1547() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1547");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5786,bag,5785,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5788,bag,5787,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5790,bag,5789,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5792,bag,5791,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5794,bag,5793,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5796,bag,5795,bag.size());
        bag.remove("A", 3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5798,bag,5797,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5800,bag,5799,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5802,bag,5801,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1548() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1548");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5786,bag,5785,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5788,bag,5787,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5790,bag,5789,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5792,bag,5791,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5794,bag,5793,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5796,bag,5795,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5798,bag,5797,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5800,bag,5799,bag.size());
        bag.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5802,bag,5801,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRetainAll() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5784,bag,5783,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRetainAll_literalMutation1532() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_literalMutation1532");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5784,bag,5783,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRetainAll_literalMutation1533() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_literalMutation1533");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5784,bag,5783,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRetainAll_literalMutation1534() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_literalMutation1534");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5784,bag,5783,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRetainAll_literalMutation1535() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_literalMutation1535");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5784,bag,5783,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRetainAll_literalMutation1536() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_literalMutation1536");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5784,bag,5783,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRetainAll_literalMutation1537() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_literalMutation1537");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5784,bag,5783,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRetainAll_literalMutation1538() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_literalMutation1538");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("foo");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5784,bag,5783,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagRetainAll_literalMutation1539() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_literalMutation1539");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("foo");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5784,bag,5783,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIterator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,bag,5751,bag.size());
        final Iterator<T> i = bag.iterator();
        boolean foundA = false;
        while (i.hasNext()) {
            final String element = ((String)(i.next()));
            if (element.equals("A")) {
                if (!foundA) {
                    foundA = true;
                } else {
                    i.remove();
                }
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,bag,5753,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5756,bag,5755,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5758,bag,5757,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIterator_literalMutation1490() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_literalMutation1490");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,bag,5751,bag.size());
        final Iterator<T> i = bag.iterator();
        boolean foundA = false;
        while (i.hasNext()) {
            final String element = ((String)(i.next()));
            if (element.equals("A")) {
                if (!foundA) {
                    foundA = true;
                } else {
                    i.remove();
                }
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,bag,5753,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5756,bag,5755,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5758,bag,5757,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIterator_literalMutation1491() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_literalMutation1491");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,bag,5751,bag.size());
        final Iterator<T> i = bag.iterator();
        boolean foundA = false;
        while (i.hasNext()) {
            final String element = ((String)(i.next()));
            if (element.equals("A")) {
                if (!foundA) {
                    foundA = true;
                } else {
                    i.remove();
                }
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,bag,5753,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5756,bag,5755,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5758,bag,5757,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIterator_literalMutation1492() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_literalMutation1492");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,bag,5751,bag.size());
        final Iterator<T> i = bag.iterator();
        boolean foundA = false;
        while (i.hasNext()) {
            final String element = ((String)(i.next()));
            if (element.equals("A")) {
                if (!foundA) {
                    foundA = true;
                } else {
                    i.remove();
                }
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,bag,5753,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5756,bag,5755,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5758,bag,5757,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIterator_literalMutation1493() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_literalMutation1493");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,bag,5751,bag.size());
        final Iterator<T> i = bag.iterator();
        boolean foundA = true;
        while (i.hasNext()) {
            final String element = ((String)(i.next()));
            if (element.equals("A")) {
                if (!foundA) {
                    foundA = true;
                } else {
                    i.remove();
                }
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,bag,5753,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5756,bag,5755,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5758,bag,5757,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIterator_literalMutation1494() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_literalMutation1494");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,bag,5751,bag.size());
        final Iterator<T> i = bag.iterator();
        boolean foundA = false;
        while (i.hasNext()) {
            final String element = ((String)(i.next()));
            if (element.equals("foo")) {
                if (!foundA) {
                    foundA = true;
                } else {
                    i.remove();
                }
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,bag,5753,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5756,bag,5755,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5758,bag,5757,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIterator_literalMutation1495() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_literalMutation1495");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5752,bag,5751,bag.size());
        final Iterator<T> i = bag.iterator();
        boolean foundA = false;
        while (i.hasNext()) {
            final String element = ((String)(i.next()));
            if (element.equals("A")) {
                if (!foundA) {
                    foundA = true;
                } else {
                    i.remove();
                }
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5754,bag,5753,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5756,bag,5755,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5758,bag,5757,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFail() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        bag.remove("A");
        try {
            it.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFail_literalMutation1497() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_literalMutation1497");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        bag.remove("A");
        try {
            it.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFail_literalMutation1498() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_literalMutation1498");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        bag.remove("A");
        try {
            it.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFail_literalMutation1499() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_literalMutation1499");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        final Iterator<T> it = bag.iterator();
        it.next();
        bag.remove("A");
        try {
            it.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFail_literalMutation1500() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_literalMutation1500");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        bag.remove("foo");
        try {
            it.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFailNoMore() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        it.next();
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFailNoMore_literalMutation1506() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_literalMutation1506");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        it.next();
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFailNoMore_literalMutation1507() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_literalMutation1507");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        it.next();
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFailNoMore_literalMutation1508() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_literalMutation1508");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        it.next();
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFailDoubleRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5724,bag,5723,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,bag,5725,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,bag,5727,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,bag,5729,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFailDoubleRemove_literalMutation1502() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_literalMutation1502");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5724,bag,5723,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,bag,5725,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,bag,5727,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,bag,5729,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFailDoubleRemove_literalMutation1503() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_literalMutation1503");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5724,bag,5723,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,bag,5725,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,bag,5727,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,bag,5729,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorFailDoubleRemove_literalMutation1504() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_literalMutation1504");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5724,bag,5723,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5726,bag,5725,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5728,bag,5727,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5730,bag,5729,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorRemoveProtectsInvariants() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorRemoveProtectsInvariants");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,bag,5731,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5734,it,5733,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,it,5735,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,bag,5737,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,it,5739,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5742,it,5741,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5744,it,5743,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5746,bag,5745,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5748,it,5747,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5750,it2,5749,it2.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorRemoveProtectsInvariants_literalMutation1509() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorRemoveProtectsInvariants_literalMutation1509");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,bag,5731,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5734,it,5733,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,it,5735,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,bag,5737,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,it,5739,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5742,it,5741,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5744,it,5743,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5746,bag,5745,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5748,it,5747,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5750,it2,5749,it2.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorRemoveProtectsInvariants_literalMutation1510() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorRemoveProtectsInvariants_literalMutation1510");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,bag,5731,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5734,it,5733,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,it,5735,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,bag,5737,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,it,5739,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5742,it,5741,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5744,it,5743,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5746,bag,5745,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5748,it,5747,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5750,it2,5749,it2.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagIteratorRemoveProtectsInvariants_literalMutation1511() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorRemoveProtectsInvariants_literalMutation1511");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5732,bag,5731,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5734,it,5733,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5736,it,5735,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5738,bag,5737,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5740,it,5739,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5742,it,5741,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5744,it,5743,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5746,bag,5745,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5748,it,5747,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5750,it2,5749,it2.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1550() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1550");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1551() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1551");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1552() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1552");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1553() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1553");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1554() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1554");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1555() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1555");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = -1;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1556() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1556");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 1;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1557() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1557");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 1;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1558() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1558");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("foo") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1559() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1559");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 2 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1560() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1560");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : -1;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1561() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1561");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("foo") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1562() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1562");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 0 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1563() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1563");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : -1;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1564() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1564");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("foo") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1565() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1565");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 2 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArray_literalMutation1566() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_literalMutation1566");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 1;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5806,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5807,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5808,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1568() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1568");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1569() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1569");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1570() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1570");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1571() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1571");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1572() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1572");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1573() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1573");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[1]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1574() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1574");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 1;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1575() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1575");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 1;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1576() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1576");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 1;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1577() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1577");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("foo") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1578() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1578");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 2 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1579() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1579");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : -1;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1580() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1580");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("foo") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1581() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1581");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 0 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1582() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1582");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 1;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1583() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1583");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("foo") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1584() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1584");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 0 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagToArrayPopulate_literalMutation1585() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_literalMutation1585");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 1;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5803,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5804,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5805,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEquals() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5698,bag,5697,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5700,bag,5699,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5702,bag,5701,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5704,bag,5703,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEquals_literalMutation1446() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_literalMutation1446");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5698,bag,5697,bag.equals(bag2));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5700,bag,5699,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5702,bag,5701,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5704,bag,5703,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEquals_literalMutation1447() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_literalMutation1447");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5698,bag,5697,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5700,bag,5699,bag.equals(bag2));
        bag2.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5702,bag,5701,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5704,bag,5703,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEquals_literalMutation1448() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_literalMutation1448");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5698,bag,5697,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5700,bag,5699,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5702,bag,5701,bag.equals(bag2));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5704,bag,5703,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEquals_literalMutation1449() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_literalMutation1449");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5698,bag,5697,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5700,bag,5699,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5702,bag,5701,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5704,bag,5703,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEquals_literalMutation1450() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_literalMutation1450");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5698,bag,5697,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5700,bag,5699,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5702,bag,5701,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5704,bag,5703,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEquals_literalMutation1451() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_literalMutation1451");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5698,bag,5697,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5700,bag,5699,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5702,bag,5701,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5704,bag,5703,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEquals_literalMutation1452() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_literalMutation1452");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5698,bag,5697,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5700,bag,5699,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5702,bag,5701,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5704,bag,5703,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEquals_literalMutation1453() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_literalMutation1453");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5698,bag,5697,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5700,bag,5699,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5702,bag,5701,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5704,bag,5703,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEquals_literalMutation1454() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_literalMutation1454");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5698,bag,5697,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5700,bag,5699,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5702,bag,5701,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5704,bag,5703,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEquals_literalMutation1455() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_literalMutation1455");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5698,bag,5697,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5700,bag,5699,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5702,bag,5701,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5704,bag,5703,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsHashBag() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,bag,5681,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5684,bag,5683,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5686,bag,5685,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5688,bag,5687,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsHashBag_literalMutation1457() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_literalMutation1457");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,bag,5681,bag.equals(bag2));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5684,bag,5683,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5686,bag,5685,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5688,bag,5687,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsHashBag_literalMutation1458() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_literalMutation1458");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,bag,5681,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5684,bag,5683,bag.equals(bag2));
        bag2.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5686,bag,5685,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5688,bag,5687,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsHashBag_literalMutation1459() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_literalMutation1459");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,bag,5681,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5684,bag,5683,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5686,bag,5685,bag.equals(bag2));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5688,bag,5687,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsHashBag_literalMutation1460() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_literalMutation1460");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,bag,5681,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5684,bag,5683,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5686,bag,5685,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5688,bag,5687,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsHashBag_literalMutation1461() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_literalMutation1461");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,bag,5681,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5684,bag,5683,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5686,bag,5685,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5688,bag,5687,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsHashBag_literalMutation1462() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_literalMutation1462");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,bag,5681,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5684,bag,5683,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5686,bag,5685,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5688,bag,5687,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsHashBag_literalMutation1463() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_literalMutation1463");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,bag,5681,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5684,bag,5683,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5686,bag,5685,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5688,bag,5687,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsHashBag_literalMutation1464() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_literalMutation1464");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,bag,5681,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5684,bag,5683,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5686,bag,5685,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5688,bag,5687,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsHashBag_literalMutation1465() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_literalMutation1465");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,bag,5681,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5684,bag,5683,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5686,bag,5685,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5688,bag,5687,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsHashBag_literalMutation1466() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_literalMutation1466");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5682,bag,5681,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5684,bag,5683,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5686,bag,5685,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5688,bag,5687,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1472() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1472");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1473() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1473");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1474() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1474");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1475() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1475");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1476() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1476");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1477() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1477");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1478() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1478");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1479() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1479");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1480() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1480");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1481() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1481");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1482() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1482");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 1;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1483() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1483");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("foo".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1484() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1484");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 1;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1485() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1485");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("foo".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1486() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1486");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 1;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1487() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1487");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("foo".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagHashCode_literalMutation1488() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_literalMutation1488");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5706,bag,5705,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5708,bag2,5707,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5710,bag,5709,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5712,bag2,5711,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5714,bag,5713,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5716,bag2,5715,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 2;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5720,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5722,bag2,5721,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Bulk test {@link Bag#uniqueSet()}.  This method runs through all of
     * the tests in {@link AbstractSetTest}.
     * After modification operations, {@link #verify()} is invoked to ensure
     * that the bag and the other collection views are still valid.
     * 
     * @return a {@link AbstractSetTest} instance for testing the bag's unique set
     */
public BulkTest bulkTestBagUniqueSet() {
        return new TestBagUniqueSet();
    }

    public class TestBagUniqueSet extends AbstractSetTest<T> {
        public TestBagUniqueSet() {
            super("");
        }

        @Override
        public T[] getFullElements() {
            return org.apache.commons.collections4.bag.AbstractBagTest.this.getFullElements();
        }

        @Override
        public T[] getOtherElements() {
            return org.apache.commons.collections4.bag.AbstractBagTest.this.getOtherElements();
        }

        @Override
        public Set<T> makeObject() {
            return org.apache.commons.collections4.bag.AbstractBagTest.this.makeObject().uniqueSet();
        }

        @Override
        public Set<T> makeFullCollection() {
            return org.apache.commons.collections4.bag.AbstractBagTest.this.makeFullCollection().uniqueSet();
        }

        @Override
        public boolean isNullSupported() {
            return org.apache.commons.collections4.bag.AbstractBagTest.this.isNullSupported();
        }

        @Override
        public boolean isAddSupported() {
            return false;
        }

        @Override
        public boolean isRemoveSupported() {
            return false;
        }

        @Override
        public boolean isTestSerialization() {
            return false;
        }

        @Override
        public void resetEmpty() {
            org.apache.commons.collections4.bag.AbstractBagTest.this.resetEmpty();
            org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.this.setCollection(org.apache.commons.collections4.bag.AbstractBagTest.this.getCollection().uniqueSet());
            org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.this.setConfirmed(new java.util.HashSet<T>(org.apache.commons.collections4.bag.AbstractBagTest.this.getConfirmed()));
        }

        @Override
        public void resetFull() {
            org.apache.commons.collections4.bag.AbstractBagTest.this.resetFull();
            org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.this.setCollection(org.apache.commons.collections4.bag.AbstractBagTest.this.getCollection().uniqueSet());
            org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.this.setConfirmed(new java.util.HashSet<T>(org.apache.commons.collections4.bag.AbstractBagTest.this.getConfirmed()));
        }

        @Override
        public void verify() {
            super.verify();
        }
    }

    /** 
     * Compare the current serialized form of the Bag
     * against the canonical version in SVN.
     */
public void testEmptyBagCompatibility() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEmptyBagCompatibility");
        final Bag<T> bag = makeObject();
        if (((bag instanceof java.io.Serializable) && (!(skipSerializedCanonicalTests()))) && (isTestSerialization())) {
            final Bag<?> bag2 = ((Bag<?>)(readExternalFormFromDisk(getCanonicalEmptyCollectionName(bag))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5809,((bag2.size()) == 0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5810,bag);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5811,bag2);
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Compare the current serialized form of the Bag
     * against the canonical version in SVN.
     */
public void testFullBagCompatibility() throws IOException, ClassNotFoundException {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFullBagCompatibility");
        final Bag<T> bag = makeFullCollection();
        if (((bag instanceof java.io.Serializable) && (!(skipSerializedCanonicalTests()))) && (isTestSerialization())) {
            final Bag<?> bag2 = ((Bag<?>)(readExternalFormFromDisk(getCanonicalFullCollectionName(bag))));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5813,bag,5812,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5815,bag2,5814,bag2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5816,bag);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5817,bag2);
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

