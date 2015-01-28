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
import org.junit.Test;

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
    @Test(timeout = 1000)
    public void testBagAdd_add1654() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagAdd_add1654");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5565,bag,5564,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5567,bag,5566,bag.getCount("A"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5569,bag,5568,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5571,bag,5570,bag.getCount("A"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5573,bag,5572,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5575,bag,5574,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagAdd_add1655() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagAdd_add1655");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5565,bag,5564,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5567,bag,5566,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5569,bag,5568,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5571,bag,5570,bag.getCount("A"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5573,bag,5572,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5575,bag,5574,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagAdd_add1656() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagAdd_add1656");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5565,bag,5564,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5567,bag,5566,bag.getCount("A"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5569,bag,5568,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5571,bag,5570,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5573,bag,5572,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5575,bag,5574,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagAdd() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagAdd");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5565,bag,5564,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5567,bag,5566,bag.getCount("A"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5569,bag,5568,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5571,bag,5570,bag.getCount("A"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5573,bag,5572,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5575,bag,5574,bag.contains("B"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5565,bag,5564,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5567,bag,5566,bag.getCount("A"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5569,bag,5568,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5571,bag,5570,bag.getCount("A"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5573,bag,5572,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5575,bag,5574,bag.contains("B"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5565,bag,5564,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5567,bag,5566,bag.getCount("A"));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5569,bag,5568,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5571,bag,5570,bag.getCount("A"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5573,bag,5572,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5575,bag,5574,bag.contains("B"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5565,bag,5564,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5567,bag,5566,bag.getCount("A"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5569,bag,5568,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5571,bag,5570,bag.getCount("A"));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5573,bag,5572,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5575,bag,5574,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagAdd_remove1250() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagAdd_remove1250");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5565,bag,5564,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5567,bag,5566,bag.getCount("A"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5569,bag,5568,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5571,bag,5570,bag.getCount("A"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5573,bag,5572,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5575,bag,5574,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagAdd_remove1251() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagAdd_remove1251");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5565,bag,5564,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5567,bag,5566,bag.getCount("A"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5569,bag,5568,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5571,bag,5570,bag.getCount("A"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5573,bag,5572,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5575,bag,5574,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagAdd_remove1252() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagAdd_remove1252");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5565,bag,5564,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5567,bag,5566,bag.getCount("A"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5569,bag,5568,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5571,bag,5570,bag.getCount("A"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5573,bag,5572,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5575,bag,5574,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsSelf_add1690() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf_add1690");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,bag,5650,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        bag.add(((T)("elt")));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,bag,5652,bag.equals(bag));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,bag,5654,bag.equals(bag));
        bag.add(((T)("elt2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,bag,5656,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsSelf_add1691() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf_add1691");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,bag,5650,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,bag,5652,bag.equals(bag));
        bag.add(((T)("elt")));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,bag,5654,bag.equals(bag));
        bag.add(((T)("elt2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,bag,5656,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsSelf_add1692() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf_add1692");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,bag,5650,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,bag,5652,bag.equals(bag));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,bag,5654,bag.equals(bag));
        bag.add(((T)("elt2")));
        bag.add(((T)("elt2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,bag,5656,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsSelf() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,bag,5650,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,bag,5652,bag.equals(bag));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,bag,5654,bag.equals(bag));
        bag.add(((T)("elt2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,bag,5656,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsSelf_literalMutation1468() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf_literalMutation1468");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,bag,5650,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,bag,5652,bag.equals(bag));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,bag,5654,bag.equals(bag));
        bag.add(((T)("elt2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,bag,5656,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsSelf_literalMutation1469() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf_literalMutation1469");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,bag,5650,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,bag,5652,bag.equals(bag));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,bag,5654,bag.equals(bag));
        bag.add(((T)("elt2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,bag,5656,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagEqualsSelf_literalMutation1470() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf_literalMutation1470");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,bag,5650,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,bag,5652,bag.equals(bag));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,bag,5654,bag.equals(bag));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,bag,5656,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsSelf_remove1286() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf_remove1286");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,bag,5650,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,bag,5652,bag.equals(bag));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,bag,5654,bag.equals(bag));
        bag.add(((T)("elt2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,bag,5656,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsSelf_remove1287() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf_remove1287");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,bag,5650,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,bag,5652,bag.equals(bag));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,bag,5654,bag.equals(bag));
        bag.add(((T)("elt2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,bag,5656,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsSelf_remove1288() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsSelf_remove1288");
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5651,bag,5650,bag.equals(bag));
        if (!(isAddSupported())) {
            return ;
        } 
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5653,bag,5652,bag.equals(bag));
        bag.add(((T)("elt")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5655,bag,5654,bag.equals(bag));
        bag.add(((T)("elt2")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5657,bag,5656,bag.equals(bag));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_add1733() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_add1733");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_add1734() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_add1734");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_add1735() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_add1735");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_add1736() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_add1736");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_add1737() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_add1737");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_add1738() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_add1738");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_add1739() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_add1739");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_add1740() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_add1740");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_add1741() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_add1741");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("foo", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", -1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("foo", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_remove1318() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_remove1318");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_remove1319() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_remove1319");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_remove1320() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_remove1320");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_remove1321() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_remove1321");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_remove1322() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_remove1322");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_remove1323() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_remove1323");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_remove1324() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_remove1324");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_remove1325() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_remove1325");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemove_remove1326() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemove_remove1326");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5733,bag,5732,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5735,bag,5734,bag.getCount("A"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5737,bag,5736,bag.getCount("A"));
        bag.remove("A", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5739,bag,5738,bag.getCount("A"));
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5741,bag,5740,bag.getCount("A"));
        bag.remove("A");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5743,bag,5742,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemoveAll_add1742() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_add1742");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemoveAll_add1743() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_add1743");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemoveAll_add1744() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_add1744");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemoveAll_add1745() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_add1745");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemoveAll_add1746() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_add1746");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemoveAll_add1747() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_add1747");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("foo")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("foo");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("foo");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemoveAll_remove1327() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_remove1327");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemoveAll_remove1328() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_remove1328");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemoveAll_remove1329() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_remove1329");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemoveAll_remove1330() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_remove1330");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemoveAll_remove1331() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_remove1331");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("B");
        bag.removeAll(delete);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRemoveAll_remove1332() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRemoveAll_remove1332");
        if (!(isRemoveSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")), 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5721,bag,5720,bag.getCount("A"));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5723,bag,5722,bag.size());
        final List<java.lang.String> delete = new ArrayList<java.lang.String>();
        delete.add("A");
        delete.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5725,bag,5724,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5727,bag,5726,bag.getCount("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5729,bag,5728,bag.getCount("C"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5731,bag,5730,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContains_add1657() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains_add1657");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,bag,5626,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5629,bag,5628,bag.contains("B"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5631,bag,5630,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,bag,5632,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,bag,5634,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,bag,5636,bag.contains("B"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,bag,5638,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,bag,5640,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContains_add1658() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains_add1658");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,bag,5626,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5629,bag,5628,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5631,bag,5630,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,bag,5632,bag.contains("B"));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,bag,5634,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,bag,5636,bag.contains("B"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,bag,5638,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,bag,5640,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContains_add1659() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains_add1659");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,bag,5626,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5629,bag,5628,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5631,bag,5630,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,bag,5632,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,bag,5634,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,bag,5636,bag.contains("B"));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,bag,5638,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,bag,5640,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContains() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,bag,5626,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5629,bag,5628,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5631,bag,5630,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,bag,5632,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,bag,5634,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,bag,5636,bag.contains("B"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,bag,5638,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,bag,5640,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContains_literalMutation1431() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains_literalMutation1431");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,bag,5626,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5629,bag,5628,bag.contains("B"));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5631,bag,5630,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,bag,5632,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,bag,5634,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,bag,5636,bag.contains("B"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,bag,5638,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,bag,5640,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContains_literalMutation1432() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains_literalMutation1432");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,bag,5626,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5629,bag,5628,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5631,bag,5630,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,bag,5632,bag.contains("B"));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,bag,5634,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,bag,5636,bag.contains("B"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,bag,5638,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,bag,5640,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagContains_literalMutation1433() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains_literalMutation1433");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,bag,5626,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5629,bag,5628,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5631,bag,5630,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,bag,5632,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,bag,5634,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,bag,5636,bag.contains("B"));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,bag,5638,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,bag,5640,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContains_remove1253() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains_remove1253");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,bag,5626,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5629,bag,5628,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5631,bag,5630,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,bag,5632,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,bag,5634,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,bag,5636,bag.contains("B"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,bag,5638,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,bag,5640,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContains_remove1254() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains_remove1254");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,bag,5626,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5629,bag,5628,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5631,bag,5630,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,bag,5632,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,bag,5634,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,bag,5636,bag.contains("B"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,bag,5638,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,bag,5640,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContains_remove1255() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContains_remove1255");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5627,bag,5626,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5629,bag,5628,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5631,bag,5630,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5633,bag,5632,bag.contains("B"));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5635,bag,5634,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5637,bag,5636,bag.contains("B"));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5639,bag,5638,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5641,bag,5640,bag.contains("B"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_add1660() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_add1660");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        known1A.add("A");
        known1A.add("A");
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_add1661() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_add1661");
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
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_add1662() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_add1662");
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
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_add1663() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_add1663");
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
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_add1664() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_add1664");
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
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_add1665() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_add1665");
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
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_add1666() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_add1666");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_add1667() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_add1667");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_add1668() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_add1668");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_add1669() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_add1669");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_remove1256() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_remove1256");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_remove1257() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_remove1257");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_remove1258() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_remove1258");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_remove1259() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_remove1259");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_remove1260() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_remove1260");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_remove1261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_remove1261");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final List<java.lang.String> known = new ArrayList<java.lang.String>();
        final List<java.lang.String> known1A = new ArrayList<java.lang.String>();
        final List<java.lang.String> known2A = new ArrayList<java.lang.String>();
        known2A.add("A");
        known2A.add("A");
        final List<java.lang.String> known1B = new ArrayList<java.lang.String>();
        known1B.add("B");
        final List<java.lang.String> known1A1B = new ArrayList<java.lang.String>();
        known1A1B.add("A");
        known1A1B.add("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_remove1262() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_remove1262");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_remove1263() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_remove1263");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_remove1264() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_remove1264");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagContainsAll_remove1265() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagContainsAll_remove1265");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5577,bag,5576,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5579,bag,5578,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5581,bag,5580,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5583,bag,5582,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5585,bag,5584,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5587,bag,5586,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5589,bag,5588,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5591,bag,5590,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5593,bag,5592,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5595,bag,5594,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5597,bag,5596,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5599,bag,5598,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5601,bag,5600,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5603,bag,5602,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5605,bag,5604,bag.containsAll(known1A1B));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5607,bag,5606,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5609,bag,5608,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5611,bag,5610,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5613,bag,5612,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5615,bag,5614,bag.containsAll(known1A1B));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5617,bag,5616,bag.containsAll(known));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5619,bag,5618,bag.containsAll(known1A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5621,bag,5620,bag.containsAll(known2A));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5623,bag,5622,bag.containsAll(known1B));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5625,bag,5624,bag.containsAll(known1A1B));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_add1757() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_add1757");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_add1758() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_add1758");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_add1759() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_add1759");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_add1760() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_add1760");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_add1761() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_add1761");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_add1762() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_add1762");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_add1763() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_add1763");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1541() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1541");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1542() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1542");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1543() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1543");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1544() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1544");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1545() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1545");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1546() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1546");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("foo", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1547() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1547");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBagSize_literalMutation1548() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_literalMutation1548");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("foo");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_remove1342() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_remove1342");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_remove1343() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_remove1343");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_remove1344() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_remove1344");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_remove1345() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_remove1345");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_remove1346() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_remove1346");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        bag.remove("A", 2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_remove1347() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_remove1347");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagSize_remove1348() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagSize_remove1348");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5747,bag,5746,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5749,bag,5748,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5751,bag,5750,bag.size());
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5753,bag,5752,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5755,bag,5754,bag.size());
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5757,bag,5756,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5759,bag,5758,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5761,bag,5760,bag.size());
        bag.remove("B");
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5763,bag,5762,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_add1748() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_add1748");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_add1749() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_add1749");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_add1750() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_add1750");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_add1751() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_add1751");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_add1752() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_add1752");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_add1753() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_add1753");
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
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_add1754() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_add1754");
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
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_add1755() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_add1755");
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
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_add1756() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_add1756");
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
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_remove1333() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_remove1333");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_remove1334() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_remove1334");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_remove1335() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_remove1335");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_remove1336() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_remove1336");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_remove1337() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_remove1337");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_remove1338() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_remove1338");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        final List<java.lang.String> retains = new ArrayList<java.lang.String>();
        retains.add("B");
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_remove1339() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_remove1339");
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
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_remove1340() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_remove1340");
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
        retains.add("C");
        bag.retainAll(retains);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagRetainAll_remove1341() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagRetainAll_remove1341");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5745,bag,5744,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIterator_add1703() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_add1703");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIterator_add1704() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_add1704");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIterator_add1705() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_add1705");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIterator_add1706() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_add1706");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
        final Iterator<T> i = bag.iterator();
        boolean foundA = false;
        while (i.hasNext()) {
            final String element = ((String)(i.next()));
            if (element.equals("A")) {
                if (!foundA) {
                    foundA = true;
                } else {
                    i.remove();
                    i.remove();
                }
            } 
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIterator_remove1299() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_remove1299");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIterator_remove1300() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_remove1300");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIterator_remove1301() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIterator_remove1301");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5713,bag,5712,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5715,bag,5714,bag.contains("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5717,bag,5716,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5719,bag,5718,bag.getCount("A"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFail_add1707() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_add1707");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
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
    @Test(timeout = 1000)
    public void testBagIteratorFail_add1708() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_add1708");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
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
    @Test(timeout = 1000)
    public void testBagIteratorFail_add1709() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_add1709");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
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
    @Test(timeout = 1000)
    public void testBagIteratorFail_add1710() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_add1710");
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
        bag.remove("A");
        try {
            it.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFail_add1711() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_add1711");
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
        bag.remove("A");
        try {
            it.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFail_add1712() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_add1712");
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
            it.next();
        } catch (final ConcurrentModificationException e) {
        }
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
    @Test(timeout = 1000)
    public void testBagIteratorFail_remove1302() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_remove1302");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
    @Test(timeout = 1000)
    public void testBagIteratorFail_remove1303() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_remove1303");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
    @Test(timeout = 1000)
    public void testBagIteratorFail_remove1304() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_remove1304");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
    @Test(timeout = 1000)
    public void testBagIteratorFail_remove1305() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFail_remove1305");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        try {
            it.next();
        } catch (final ConcurrentModificationException e) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailNoMore_add1722() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_add1722");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
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
    @Test(timeout = 1000)
    public void testBagIteratorFailNoMore_add1723() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_add1723");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
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
    @Test(timeout = 1000)
    public void testBagIteratorFailNoMore_add1724() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_add1724");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
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
    @Test(timeout = 1000)
    public void testBagIteratorFailNoMore_add1725() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_add1725");
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
        it.next();
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailNoMore_add1726() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_add1726");
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
        it.next();
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailNoMore_add1727() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_add1727");
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
        it.next();
        try {
            it.next();
        } catch (final NoSuchElementException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailNoMore_add1728() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_add1728");
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
            it.next();
        } catch (final NoSuchElementException ex) {
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
    @Test(timeout = 1000)
    public void testBagIteratorFailNoMore_remove1311() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_remove1311");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
    @Test(timeout = 1000)
    public void testBagIteratorFailNoMore_remove1312() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_remove1312");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
    @Test(timeout = 1000)
    public void testBagIteratorFailNoMore_remove1313() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailNoMore_remove1313");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_add1713() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_add1713");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_add1714() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_add1714");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_add1715() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_add1715");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_add1716() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_add1716");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_add1717() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_add1717");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_add1718() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_add1718");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_add1719() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_add1719");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_add1720() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_add1720");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_add1721() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_add1721");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_remove1306() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_remove1306");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_remove1307() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_remove1307");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_remove1308() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_remove1308");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        final Iterator<T> it = bag.iterator();
        it.next();
        it.next();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_remove1309() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_remove1309");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorFailDoubleRemove_remove1310() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorFailDoubleRemove_remove1310");
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5685,bag,5684,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5687,bag,5686,bag.size());
        try {
            it.remove();
        } catch (final IllegalStateException ex) {
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5689,bag,5688,bag.size());
        it.next();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5691,bag,5690,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorRemoveProtectsInvariants_add1729() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorRemoveProtectsInvariants_add1729");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5693,bag,5692,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5695,it,5694,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,it,5696,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,bag,5698,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,it,5700,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5703,it,5702,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5705,it,5704,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5707,bag,5706,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5709,it,5708,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5711,it2,5710,it2.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorRemoveProtectsInvariants_add1730() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorRemoveProtectsInvariants_add1730");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5693,bag,5692,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5695,it,5694,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,it,5696,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,bag,5698,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,it,5700,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5703,it,5702,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5705,it,5704,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5707,bag,5706,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5709,it,5708,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5711,it2,5710,it2.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorRemoveProtectsInvariants_add1731() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorRemoveProtectsInvariants_add1731");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5693,bag,5692,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5695,it,5694,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,it,5696,it.hasNext());
        it.remove();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,bag,5698,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,it,5700,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5703,it,5702,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5705,it,5704,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5707,bag,5706,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5709,it,5708,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5711,it2,5710,it2.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorRemoveProtectsInvariants_add1732() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorRemoveProtectsInvariants_add1732");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5693,bag,5692,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5695,it,5694,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,it,5696,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,bag,5698,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,it,5700,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5703,it,5702,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5705,it,5704,it.hasNext());
        it.remove();
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5707,bag,5706,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5709,it,5708,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5711,it2,5710,it2.hasNext());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5693,bag,5692,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5695,it,5694,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,it,5696,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,bag,5698,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,it,5700,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5703,it,5702,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5705,it,5704,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5707,bag,5706,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5709,it,5708,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5711,it2,5710,it2.hasNext());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5693,bag,5692,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5695,it,5694,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,it,5696,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,bag,5698,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,it,5700,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5703,it,5702,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5705,it,5704,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5707,bag,5706,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5709,it,5708,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5711,it2,5710,it2.hasNext());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5693,bag,5692,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5695,it,5694,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,it,5696,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,bag,5698,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,it,5700,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5703,it,5702,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5705,it,5704,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5707,bag,5706,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5709,it,5708,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5711,it2,5710,it2.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorRemoveProtectsInvariants_remove1314() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorRemoveProtectsInvariants_remove1314");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5693,bag,5692,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5695,it,5694,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,it,5696,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,bag,5698,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,it,5700,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5703,it,5702,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5705,it,5704,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5707,bag,5706,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5709,it,5708,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5711,it2,5710,it2.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorRemoveProtectsInvariants_remove1315() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorRemoveProtectsInvariants_remove1315");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5693,bag,5692,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5695,it,5694,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,it,5696,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,bag,5698,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,it,5700,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5703,it,5702,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5705,it,5704,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5707,bag,5706,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5709,it,5708,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5711,it2,5710,it2.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorRemoveProtectsInvariants_remove1316() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorRemoveProtectsInvariants_remove1316");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5693,bag,5692,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5695,it,5694,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,it,5696,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,bag,5698,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,it,5700,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5703,it,5702,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5705,it,5704,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5707,bag,5706,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5709,it,5708,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5711,it2,5710,it2.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagIteratorRemoveProtectsInvariants_remove1317() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagIteratorRemoveProtectsInvariants_remove1317");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5693,bag,5692,bag.size());
        final Iterator<T> it = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5695,it,5694,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5697,it,5696,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5699,bag,5698,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5701,it,5700,it.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5703,it,5702,it.next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5705,it,5704,it.hasNext());
        it.remove();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5707,bag,5706,bag.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5709,it,5708,it.hasNext());
        final Iterator<T> it2 = bag.iterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5711,it2,5710,it2.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArray_add1764() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_add1764");
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
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArray_add1765() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_add1765");
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
        final Object[] array = bag.toArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArray_add1766() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_add1766");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArray_add1767() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_add1767");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArray_add1768() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_add1768");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        int a = 1;
        int b = 0;
        int c = 0;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        int c = -1;
        for (final Object element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
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
            c += element.equals("C") ? 1 : -1;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArray_remove1349() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_remove1349");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArray_remove1350() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_remove1350");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArray_remove1351() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_remove1351");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArray_remove1352() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_remove1352");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArray_remove1353() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArray_remove1353");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5767,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5768,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5769,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArrayPopulate_add1769() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_add1769");
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
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArrayPopulate_add1770() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_add1770");
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
        final String[] array = bag.toArray(new String[0]);
        int a = 0;
        int b = 0;
        int c = 0;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArrayPopulate_add1771() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_add1771");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArrayPopulate_add1772() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_add1772");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArrayPopulate_add1773() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_add1773");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        int c = -1;
        for (final String element : array) {
            a += element.equals("A") ? 1 : 0;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
            a += element.equals("A") ? 1 : 1;
            b += element.equals("B") ? 1 : 0;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
            b += element.equals("B") ? 1 : -1;
            c += element.equals("C") ? 1 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
            c += element.equals("C") ? 2 : 0;
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArrayPopulate_remove1354() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_remove1354");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArrayPopulate_remove1355() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_remove1355");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArrayPopulate_remove1356() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_remove1356");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArrayPopulate_remove1357() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_remove1357");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagToArrayPopulate_remove1358() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagToArrayPopulate_remove1358");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5764,a);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5765,b);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5766,c);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_add1670() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_add1670");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_add1671() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_add1671");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_add1672() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_add1672");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_add1673() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_add1673");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_add1674() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_add1674");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_add1675() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_add1675");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_add1676() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_add1676");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_add1677() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_add1677");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_add1678() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_add1678");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_add1679() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_add1679");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_remove1266() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_remove1266");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_remove1267() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_remove1267");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_remove1268() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_remove1268");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_remove1269() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_remove1269");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_remove1270() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_remove1270");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_remove1271() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_remove1271");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_remove1272() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_remove1272");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_remove1273() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_remove1273");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_remove1274() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_remove1274");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEquals_remove1275() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEquals_remove1275");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5659,bag,5658,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5661,bag,5660,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5663,bag,5662,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5665,bag,5664,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_add1680() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_add1680");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_add1681() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_add1681");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_add1682() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_add1682");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_add1683() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_add1683");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_add1684() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_add1684");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_add1685() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_add1685");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_add1686() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_add1686");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_add1687() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_add1687");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_add1688() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_add1688");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_add1689() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_add1689");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("foo")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("foo")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("foo")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        bag.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_remove1276() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_remove1276");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_remove1277() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_remove1277");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_remove1278() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_remove1278");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_remove1279() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_remove1279");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_remove1280() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_remove1280");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_remove1281() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_remove1281");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_remove1282() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_remove1282");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_remove1283() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_remove1283");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_remove1284() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_remove1284");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagEqualsHashBag_remove1285() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagEqualsHashBag_remove1285");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = new HashBag<T>();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5643,bag,5642,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5645,bag,5644,bag.equals(bag2));
        bag2.add(((T)("A")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5647,bag,5646,bag.equals(bag2));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5649,bag,5648,bag.equals(bag2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_add1693() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_add1693");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_add1694() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_add1694");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_add1695() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_add1695");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_add1696() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_add1696");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_add1697() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_add1697");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_add1698() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_add1698");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_add1699() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_add1699");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_add1700() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_add1700");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_add1701() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_add1701");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_add1702() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_add1702");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 1;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("foo".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 1;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("foo".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 1;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("foo".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 0;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_remove1289() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_remove1289");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_remove1290() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_remove1290");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_remove1291() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_remove1291");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_remove1292() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_remove1292");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_remove1293() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_remove1293");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_remove1294() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_remove1294");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_remove1295() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_remove1295");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_remove1296() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_remove1296");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_remove1297() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_remove1297");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBagHashCode_remove1298() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBagHashCode_remove1298");
        if (!(isAddSupported())) {
            return ;
        } 
        final Bag<T> bag = makeObject();
        final Bag<T> bag2 = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5667,bag,5666,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5669,bag2,5668,bag2.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5671,bag,5670,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5673,bag2,5672,bag2.hashCode());
        bag.add(((T)("A")));
        bag.add(((T)("B")));
        bag.add(((T)("B")));
        bag.add(((T)("C")));
        bag2.add(((T)("A")));
        bag2.add(((T)("A")));
        bag2.add(((T)("B")));
        bag2.add(((T)("B")));
        bag2.add(((T)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5675,bag,5674,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5677,bag2,5676,bag2.hashCode());
        int total = 0;
        total += ("A".hashCode()) ^ 2;
        total += ("B".hashCode()) ^ 2;
        total += ("C".hashCode()) ^ 1;
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5678,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5680,bag,5679,bag.hashCode());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5681,total);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5683,bag2,5682,bag2.hashCode());
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5770,((bag2.size()) == 0));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5771,bag);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5772,bag2);
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5774,bag,5773,bag.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5776,bag2,5775,bag2.size());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5777,bag);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5778,bag2);
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

