package org.apache.commons.collections4.bidimap;

import org.apache.commons.collections4.map.AbstractMapTest;
import org.apache.commons.collections4.BulkTest;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.collections4.comparators.ReverseComparator;
import java.io.Serializable;
import org.apache.commons.collections4.SortedBidiMap;
import junit.framework.Test;
import java.util.TreeMap;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
@SuppressWarnings(value = "boxing")
public class DualTreeBidiMap2Test<K extends java.lang.Comparable<K>, V extends Comparable<V>> extends AbstractSortedBidiMapTest<K, V> {
    public static Test suite() {
        return BulkTest.makeSuite(DualTreeBidiMap2Test.class);
    }

    public DualTreeBidiMap2Test(final String testName) {
        super(testName);
    }

    @Override
    public DualTreeBidiMap<K, V> makeObject() {
        return new DualTreeBidiMap<K, V>(new ReverseComparator<K>(org.apache.commons.collections4.comparators.ComparableComparator.<K>comparableComparator()) , new ReverseComparator<V>(org.apache.commons.collections4.comparators.ComparableComparator.<V>comparableComparator()));
    }

    @Override
    public TreeMap<K, V> makeConfirmedMap() {
        return new TreeMap<K, V>(new ReverseComparator<K>(org.apache.commons.collections4.comparators.ComparableComparator.<K>comparableComparator()));
    }

    @org.junit.Test(timeout = 1000)
    public void testComparator_add1644() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator_add1644");
        resetEmpty();
        resetEmpty();
        final SortedBidiMap<K, V> bidi = ((SortedBidiMap<K, V>)(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5538,bidi,5537,bidi.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5539,((bidi.comparator()) instanceof org.apache.commons.collections4.comparators.ReverseComparator));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testComparator_remove1243() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator_remove1243");
        final SortedBidiMap<K, V> bidi = ((SortedBidiMap<K, V>)(map));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5538,bidi,5537,bidi.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5539,((bidi.comparator()) instanceof org.apache.commons.collections4.comparators.ReverseComparator));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testComparator2_add1645() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator2_add1645");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> dtbm = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , null);
        dtbm.put("two", 0);
        dtbm.put("two", 0);
        dtbm.put("one", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5534,dtbm,5533,dtbm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5536,dtbm,5535,dtbm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testComparator2_add1646() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator2_add1646");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> dtbm = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , null);
        dtbm.put("two", 0);
        dtbm.put("one", 1);
        dtbm.put("one", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5534,dtbm,5533,dtbm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5536,dtbm,5535,dtbm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComparator() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> dtbm = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , null);
        dtbm.put("foo", 0);
        dtbm.put("one", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5534,dtbm,5533,dtbm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5536,dtbm,5535,dtbm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComparator2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator2");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> dtbm = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , null);
        dtbm.put("two", 1);
        dtbm.put("one", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5534,dtbm,5533,dtbm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5536,dtbm,5535,dtbm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComparator2_literalMutation1418() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator2_literalMutation1418");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> dtbm = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , null);
        dtbm.put("two", 0);
        dtbm.put("foo", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5534,dtbm,5533,dtbm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5536,dtbm,5535,dtbm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testComparator2_literalMutation1419() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator2_literalMutation1419");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> dtbm = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , null);
        dtbm.put("two", 0);
        dtbm.put("one", 0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5534,dtbm,5533,dtbm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5536,dtbm,5535,dtbm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testComparator2_remove1244() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator2_remove1244");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> dtbm = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , null);
        dtbm.put("one", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5534,dtbm,5533,dtbm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5536,dtbm,5535,dtbm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testComparator2_remove1245() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testComparator2_remove1245");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> dtbm = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , null);
        dtbm.put("one", 1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5534,dtbm,5533,dtbm.firstKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5536,dtbm,5535,dtbm.lastKey());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSerializeDeserializeCheckComparator() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeCheckComparator");
        final SortedBidiMap<?, ?> obj = makeObject();
        if ((obj instanceof Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            final SortedBidiMap<?, ?> bidi = ((SortedBidiMap<?, ?>)(dest));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5541,obj,5540,obj.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5543,bidi,5542,bidi.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5544,((bidi.comparator()) instanceof org.apache.commons.collections4.comparators.ReverseComparator));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSerializeDeserializeCheckComparator_add1648() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeCheckComparator_add1648");
        final SortedBidiMap<?, ?> obj = makeObject();
        if ((obj instanceof Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            final SortedBidiMap<?, ?> bidi = ((SortedBidiMap<?, ?>)(dest));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5541,obj,5540,obj.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5543,bidi,5542,bidi.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5544,((bidi.comparator()) instanceof org.apache.commons.collections4.comparators.ReverseComparator));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSerializeDeserializeCheckComparator_add1649() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeCheckComparator_add1649");
        final SortedBidiMap<?, ?> obj = makeObject();
        if ((obj instanceof Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            in.close();
            final SortedBidiMap<?, ?> bidi = ((SortedBidiMap<?, ?>)(dest));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5541,obj,5540,obj.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5543,bidi,5542,bidi.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5544,((bidi.comparator()) instanceof org.apache.commons.collections4.comparators.ReverseComparator));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSerializeDeserializeCheckComparator_remove1246() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeCheckComparator_remove1246");
        final SortedBidiMap<?, ?> obj = makeObject();
        if ((obj instanceof Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            final SortedBidiMap<?, ?> bidi = ((SortedBidiMap<?, ?>)(dest));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5541,obj,5540,obj.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5543,bidi,5542,bidi.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5544,((bidi.comparator()) instanceof org.apache.commons.collections4.comparators.ReverseComparator));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSerializeDeserializeCheckComparator_remove1247() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeCheckComparator_remove1247");
        final SortedBidiMap<?, ?> obj = makeObject();
        if ((obj instanceof Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            in.close();
            final SortedBidiMap<?, ?> bidi = ((SortedBidiMap<?, ?>)(dest));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5541,obj,5540,obj.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5543,bidi,5542,bidi.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5544,((bidi.comparator()) instanceof org.apache.commons.collections4.comparators.ReverseComparator));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSerializeDeserializeCheckComparator_remove1248() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerializeDeserializeCheckComparator_remove1248");
        final SortedBidiMap<?, ?> obj = makeObject();
        if ((obj instanceof Serializable) && (isTestSerialization())) {
            final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            final ObjectOutputStream out = new ObjectOutputStream(buffer);
            out.writeObject(obj);
            out.close();
            final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
            final Object dest = in.readObject();
            final SortedBidiMap<?, ?> bidi = ((SortedBidiMap<?, ?>)(dest));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5541,obj,5540,obj.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5543,bidi,5542,bidi.comparator());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5544,((bidi.comparator()) instanceof org.apache.commons.collections4.comparators.ReverseComparator));
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private static class IntegerComparator implements Serializable , Comparator<java.lang.Integer> {
        private static final long serialVersionUID = 1L;

        public int compare(final Integer o1, final Integer o2) {
            return o1.compareTo(o2);
        }
    }

    @org.junit.Test(timeout = 1000)
    public void testCollections364_add1641() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections364_add1641");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> original = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , new IntegerComparator());
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.writeObject(original);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        @SuppressWarnings(value = "unchecked")
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> deserialised = ((DualTreeBidiMap<java.lang.String, java.lang.Integer>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5522,original,5521,original.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5524,deserialised,5523,deserialised.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5526,original.comparator(),5525,original.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5528,deserialised.comparator(),5527,deserialised.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5530,original.valueComparator(),5529,original.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5532,deserialised.valueComparator(),5531,deserialised.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testCollections364_add1642() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections364_add1642");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> original = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , new IntegerComparator());
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        @SuppressWarnings(value = "unchecked")
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> deserialised = ((DualTreeBidiMap<java.lang.String, java.lang.Integer>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5522,original,5521,original.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5524,deserialised,5523,deserialised.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5526,original.comparator(),5525,original.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5528,deserialised.comparator(),5527,deserialised.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5530,original.valueComparator(),5529,original.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5532,deserialised.valueComparator(),5531,deserialised.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testCollections364_add1643() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections364_add1643");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> original = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , new IntegerComparator());
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        @SuppressWarnings(value = "unchecked")
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> deserialised = ((DualTreeBidiMap<java.lang.String, java.lang.Integer>)(in.readObject()));
        in.close();
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5522,original,5521,original.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5524,deserialised,5523,deserialised.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5526,original.comparator(),5525,original.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5528,deserialised.comparator(),5527,deserialised.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5530,original.valueComparator(),5529,original.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5532,deserialised.valueComparator(),5531,deserialised.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollections364() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections364");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> original = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , new IntegerComparator());
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        @SuppressWarnings(value = "unchecked")
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> deserialised = ((DualTreeBidiMap<java.lang.String, java.lang.Integer>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5522,original,5521,original.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5524,deserialised,5523,deserialised.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5526,original.comparator(),5525,original.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5528,deserialised.comparator(),5527,deserialised.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5530,original.valueComparator(),5529,original.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5532,deserialised.valueComparator(),5531,deserialised.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testCollections364_remove1240() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections364_remove1240");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> original = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , new IntegerComparator());
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        @SuppressWarnings(value = "unchecked")
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> deserialised = ((DualTreeBidiMap<java.lang.String, java.lang.Integer>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5522,original,5521,original.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5524,deserialised,5523,deserialised.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5526,original.comparator(),5525,original.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5528,deserialised.comparator(),5527,deserialised.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5530,original.valueComparator(),5529,original.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5532,deserialised.valueComparator(),5531,deserialised.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testCollections364_remove1241() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections364_remove1241");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> original = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , new IntegerComparator());
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        @SuppressWarnings(value = "unchecked")
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> deserialised = ((DualTreeBidiMap<java.lang.String, java.lang.Integer>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5522,original,5521,original.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5524,deserialised,5523,deserialised.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5526,original.comparator(),5525,original.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5528,deserialised.comparator(),5527,deserialised.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5530,original.valueComparator(),5529,original.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5532,deserialised.valueComparator(),5531,deserialised.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testCollections364_remove1242() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections364_remove1242");
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> original = new DualTreeBidiMap<java.lang.String, java.lang.Integer>(String.CASE_INSENSITIVE_ORDER , new IntegerComparator());
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(original);
        out.close();
        final ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        @SuppressWarnings(value = "unchecked")
        final DualTreeBidiMap<java.lang.String, java.lang.Integer> deserialised = ((DualTreeBidiMap<java.lang.String, java.lang.Integer>)(in.readObject()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5522,original,5521,original.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5524,deserialised,5523,deserialised.comparator());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5526,original.comparator(),5525,original.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5528,deserialised.comparator(),5527,deserialised.comparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5530,original.valueComparator(),5529,original.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5532,deserialised.valueComparator(),5531,deserialised.valueComparator().getClass());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSortOrder() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder");
        final SortedBidiMap<K, V> sm = makeFullMap();
        List<K> newSortedKeys = getAsList(getSampleKeys());
        java.util.Collections.sort(newSortedKeys, new ReverseComparator<K>(org.apache.commons.collections4.comparators.ComparableComparator.<K>comparableComparator()));
        newSortedKeys = java.util.Collections.unmodifiableList(newSortedKeys);
        final Iterator<K> mapIter = sm.keySet().iterator();
        final Iterator<K> expectedIter = newSortedKeys.iterator();
        while (expectedIter.hasNext()) {
            final K expectedKey = expectedIter.next();
            final K mapKey = mapIter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5545,expectedKey);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5546,mapKey);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5547,expectedKey);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5548,mapKey);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSortOrder_add1650() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_add1650");
        final SortedBidiMap<K, V> sm = makeFullMap();
        List<K> newSortedKeys = getAsList(getSampleKeys());
        java.util.Collections.sort(newSortedKeys, new ReverseComparator<K>(org.apache.commons.collections4.comparators.ComparableComparator.<K>comparableComparator()));
        java.util.Collections.sort(newSortedKeys, new ReverseComparator<K>(org.apache.commons.collections4.comparators.ComparableComparator.<K>comparableComparator()));
        newSortedKeys = java.util.Collections.unmodifiableList(newSortedKeys);
        final Iterator<K> mapIter = sm.keySet().iterator();
        final Iterator<K> expectedIter = newSortedKeys.iterator();
        while (expectedIter.hasNext()) {
            final K expectedKey = expectedIter.next();
            final K mapKey = mapIter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5545,expectedKey);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5546,mapKey);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5547,expectedKey);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5548,mapKey);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @org.junit.Test(timeout = 1000)
    public void testSortOrder_remove1249() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSortOrder_remove1249");
        final SortedBidiMap<K, V> sm = makeFullMap();
        List<K> newSortedKeys = getAsList(getSampleKeys());
        newSortedKeys = java.util.Collections.unmodifiableList(newSortedKeys);
        final Iterator<K> mapIter = sm.keySet().iterator();
        final Iterator<K> expectedIter = newSortedKeys.iterator();
        while (expectedIter.hasNext()) {
            final K expectedKey = expectedIter.next();
            final K mapKey = mapIter.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5545,expectedKey);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5546,mapKey);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5547,expectedKey);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),5548,mapKey);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public String getCompatibilityVersion() {
        return "4.Test2";
    }

    /** 
     * Override to prevent infinite recursion of tests.
     */
@Override
    public String[] ignoredTests() {
        String recursiveTest = "DualTreeBidiMap2Test.bulkTestInverseMap.bulkTestInverseMap";
        if (BulkTest.IBMJDK16) {
            final String preSub = "DualTreeBidiMap2Test.bulkTestSubMap.";
            final String preTail = "DualTreeBidiMap2Test.bulkTestTailMap.";
            return new String[]{ recursiveTest , preSub + "bulkTestMapEntrySet.testCollectionIteratorRemove" , preSub + "bulkTestMapValues.testCollectionIteratorRemove" , preTail + "testMapRemove" , preTail + "bulkTestMapEntrySet.testCollectionIteratorRemove" , preTail + "bulkTestMapEntrySet.testCollectionRemoveAll" , preTail + "bulkTestMapKeySet.testCollectionIteratorRemove" , preTail + "bulkTestMapKeySet.testCollectionRemoveAll" , preTail + "bulkTestMapValues.testCollectionClear" , preTail + "bulkTestMapValues.testCollectionRemoveAll" , preTail + "bulkTestMapValues.testCollectionRetainAll" };
        } else {
            return new String[]{ recursiveTest };
        }
    }
}

