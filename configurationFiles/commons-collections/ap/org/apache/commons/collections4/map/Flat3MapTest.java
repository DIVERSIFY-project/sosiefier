package org.apache.commons.collections4.map;

import org.apache.commons.collections4.iterators.AbstractMapIteratorTest;
import org.apache.commons.collections4.BulkTest;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.apache.commons.collections4.IterableMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import junit.framework.Test;

/** 
 * JUnit tests.
 * 
 * @version $Id$
 */
public class Flat3MapTest<K, V> extends AbstractIterableMapTest<K, V> {
    private static final Integer ONE = Integer.valueOf(1);

    private static final Integer TWO = Integer.valueOf(2);

    private static final Integer THREE = Integer.valueOf(3);

    private static final String TEN = "10";

    private static final String TWENTY = "20";

    private static final String THIRTY = "30";

    public Flat3MapTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return BulkTest.makeSuite(Flat3MapTest.class);
    }

    @Override
    public Flat3Map<K, V> makeObject() {
        return new Flat3Map<K, V>();
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals1() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals1");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("b")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,map1,684,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals1_literalMutation177() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals1_literalMutation177");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("foo")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("b")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,map1,684,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals1_literalMutation178() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals1_literalMutation178");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("foo")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("b")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,map1,684,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals1_literalMutation179() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals1_literalMutation179");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("foo")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("b")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,map1,684,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals1_literalMutation180() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals1_literalMutation180");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("foo")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("b")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,map1,684,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals1_literalMutation181() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals1_literalMutation181");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("foo")), ((V)("testB")));
        map2.put(((K)("b")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,map1,684,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals1_literalMutation182() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals1_literalMutation182");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("foo")));
        map2.put(((K)("b")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,map1,684,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals1_literalMutation183() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals1_literalMutation183");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("foo")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,map1,684,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals1_literalMutation184() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals1_literalMutation184");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("b")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),685,map1,684,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals2");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("c")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,map1,686,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals2_literalMutation186() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals2_literalMutation186");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("foo")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("c")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,map1,686,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals2_literalMutation187() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals2_literalMutation187");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("foo")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("c")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,map1,686,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals2_literalMutation188() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals2_literalMutation188");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("foo")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("c")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,map1,686,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals2_literalMutation189() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals2_literalMutation189");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("foo")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("c")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,map1,686,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals2_literalMutation190() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals2_literalMutation190");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("foo")), ((V)("testB")));
        map2.put(((K)("c")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,map1,686,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals2_literalMutation191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals2_literalMutation191");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("foo")));
        map2.put(((K)("c")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,map1,686,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals2_literalMutation192() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals2_literalMutation192");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("foo")), ((V)("testA")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,map1,686,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEquals2_literalMutation193() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEquals2_literalMutation193");
        final Flat3Map<K, V> map1 = makeObject();
        map1.put(((K)("a")), ((V)("testA")));
        map1.put(((K)("b")), ((V)("testB")));
        final Flat3Map<K, V> map2 = makeObject();
        map2.put(((K)("a")), ((V)("testB")));
        map2.put(((K)("c")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),687,map1,686,map1.equals(map2));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone2() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone2");
        final Flat3Map<K, V> map = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),531,map,530,map.size());
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),533,map,532,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),535,map,534,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),537,map,536,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),538,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),540,map,539,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),541,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),543,map,542,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        final Flat3Map<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),545,cloned,544,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),547,cloned,546,cloned.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),549,cloned,548,cloned.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),550,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),552,cloned,551,cloned.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),553,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),555,cloned,554,cloned.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        map.put(((K)(TEN)), ((V)(ONE)));
        map.put(((K)(TWENTY)), ((V)(TWO)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),557,cloned,556,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),559,cloned,558,cloned.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),561,cloned,560,cloned.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),562,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),564,cloned,563,cloned.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),565,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),567,cloned,566,cloned.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testClone4() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testClone4");
        final Flat3Map<K, V> map = makeObject();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),507,map,506,map.size());
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(TEN)), ((V)(ONE)));
        map.put(((K)(TWENTY)), ((V)(TWO)));
        final Flat3Map<K, V> cloned = map.clone();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),569,map,568,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),571,cloned,570,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),573,cloned,572,cloned.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),575,cloned,574,cloned.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),577,cloned,576,cloned.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TEN));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),579,cloned,578,cloned.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWENTY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),580,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),582,cloned,581,cloned.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),583,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),585,cloned,584,cloned.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),586,org.apache.commons.collections4.map.Flat3MapTest.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),588,cloned,587,cloned.get(org.apache.commons.collections4.map.Flat3MapTest.TEN));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),589,org.apache.commons.collections4.map.Flat3MapTest.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),591,cloned,590,cloned.get(org.apache.commons.collections4.map.Flat3MapTest.TWENTY));
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),593,map,592,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),595,cloned,594,cloned.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),597,cloned,596,cloned.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),599,cloned,598,cloned.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),601,cloned,600,cloned.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TEN));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),603,cloned,602,cloned.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWENTY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),604,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),606,cloned,605,cloned.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),607,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),609,cloned,608,cloned.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),610,org.apache.commons.collections4.map.Flat3MapTest.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),612,cloned,611,cloned.get(org.apache.commons.collections4.map.Flat3MapTest.TEN));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),613,org.apache.commons.collections4.map.Flat3MapTest.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),615,cloned,614,cloned.get(org.apache.commons.collections4.map.Flat3MapTest.TWENTY));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testSerialisation0() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialisation0");
        final Flat3Map<K, V> map = makeObject();
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(bout);
        out.writeObject(map);
        final byte[] bytes = bout.toByteArray();
        out.close();
        final ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
        final ObjectInputStream in = new ObjectInputStream(bin);
        final Flat3Map<?, ?> ser = ((Flat3Map<?, ?>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),737,map,736,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),739,ser,738,ser.size());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSerialisation2() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialisation2");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(bout);
        out.writeObject(map);
        final byte[] bytes = bout.toByteArray();
        out.close();
        final ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
        final ObjectInputStream in = new ObjectInputStream(bin);
        final Flat3Map<?, ?> ser = ((Flat3Map<?, ?>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),741,map,740,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),743,ser,742,ser.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),745,ser,744,ser.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),747,ser,746,ser.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),748,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),750,ser,749,ser.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),751,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),753,ser,752,ser.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testSerialisation4() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testSerialisation4");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(TEN)), ((V)(ONE)));
        map.put(((K)(TWENTY)), ((V)(TWO)));
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(bout);
        out.writeObject(map);
        final byte[] bytes = bout.toByteArray();
        out.close();
        final ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
        final ObjectInputStream in = new ObjectInputStream(bin);
        final Flat3Map<?, ?> ser = ((Flat3Map<?, ?>)(in.readObject()));
        in.close();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),755,map,754,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),757,ser,756,ser.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),759,ser,758,ser.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),761,ser,760,ser.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),763,ser,762,ser.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TEN));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),765,ser,764,ser.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWENTY));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),766,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),768,ser,767,ser.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),769,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),771,ser,770,ser.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),772,org.apache.commons.collections4.map.Flat3MapTest.ONE);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),774,ser,773,ser.get(org.apache.commons.collections4.map.Flat3MapTest.TEN));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),775,org.apache.commons.collections4.map.Flat3MapTest.TWO);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),777,ser,776,ser.get(org.apache.commons.collections4.map.Flat3MapTest.TWENTY));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntryIteratorSetValue1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntryIteratorSetValue1");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(THREE)), ((V)(THIRTY)));
        final Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        final Map.Entry<K, V> entry = it.next();
        entry.setValue(((V)("NewValue")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),637,map,636,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),639,map,638,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),641,map,640,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),643,map,642,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),645,map,644,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),648,map,647,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,org.apache.commons.collections4.map.Flat3MapTest.THIRTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),651,map,650,map.get(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntryIteratorSetValue1_literalMutation171() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntryIteratorSetValue1_literalMutation171");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(THREE)), ((V)(THIRTY)));
        final Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        final Map.Entry<K, V> entry = it.next();
        entry.setValue(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),637,map,636,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),639,map,638,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),641,map,640,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),643,map,642,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),645,map,644,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),646,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),648,map,647,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),649,org.apache.commons.collections4.map.Flat3MapTest.THIRTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),651,map,650,map.get(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntryIteratorSetValue2() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntryIteratorSetValue2");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(THREE)), ((V)(THIRTY)));
        final Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        it.next();
        final Map.Entry<K, V> entry = it.next();
        entry.setValue(((V)("NewValue")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),653,map,652,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),655,map,654,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),657,map,656,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,map,658,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,map,661,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,map,663,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),665,org.apache.commons.collections4.map.Flat3MapTest.THIRTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,map,666,map.get(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntryIteratorSetValue2_literalMutation173() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntryIteratorSetValue2_literalMutation173");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(THREE)), ((V)(THIRTY)));
        final Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        it.next();
        final Map.Entry<K, V> entry = it.next();
        entry.setValue(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),653,map,652,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),655,map,654,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),657,map,656,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),659,map,658,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),660,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),662,map,661,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),664,map,663,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),665,org.apache.commons.collections4.map.Flat3MapTest.THIRTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),667,map,666,map.get(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntryIteratorSetValue3() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntryIteratorSetValue3");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(THREE)), ((V)(THIRTY)));
        final Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        it.next();
        it.next();
        final Map.Entry<K, V> entry = it.next();
        entry.setValue(((V)("NewValue")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),669,map,668,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,map,670,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,map,672,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),675,map,674,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),676,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),678,map,677,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),679,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),681,map,680,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),683,map,682,map.get(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testEntryIteratorSetValue3_literalMutation175() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testEntryIteratorSetValue3_literalMutation175");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(THREE)), ((V)(THIRTY)));
        final Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        it.next();
        it.next();
        final Map.Entry<K, V> entry = it.next();
        entry.setValue(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),669,map,668,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),671,map,670,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),673,map,672,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),675,map,674,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),676,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),678,map,677,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),679,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),681,map,680,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),683,map,682,map.get(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapIteratorSetValue1() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetValue1");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(THREE)), ((V)(THIRTY)));
        final MapIterator<K, V> it = map.mapIterator();
        it.next();
        it.setValue(((V)("NewValue")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),689,map,688,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),691,map,690,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),693,map,692,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),695,map,694,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),697,map,696,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),698,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),700,map,699,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),701,org.apache.commons.collections4.map.Flat3MapTest.THIRTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),703,map,702,map.get(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapIteratorSetValue1_literalMutation195() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetValue1_literalMutation195");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(THREE)), ((V)(THIRTY)));
        final MapIterator<K, V> it = map.mapIterator();
        it.next();
        it.setValue(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),689,map,688,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),691,map,690,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),693,map,692,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),695,map,694,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),697,map,696,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),698,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),700,map,699,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),701,org.apache.commons.collections4.map.Flat3MapTest.THIRTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),703,map,702,map.get(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapIteratorSetValue2() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetValue2");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(THREE)), ((V)(THIRTY)));
        final MapIterator<K, V> it = map.mapIterator();
        it.next();
        it.next();
        it.setValue(((V)("NewValue")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),705,map,704,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,map,706,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),709,map,708,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),711,map,710,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),712,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),714,map,713,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),716,map,715,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),717,org.apache.commons.collections4.map.Flat3MapTest.THIRTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),719,map,718,map.get(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapIteratorSetValue2_literalMutation197() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetValue2_literalMutation197");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(THREE)), ((V)(THIRTY)));
        final MapIterator<K, V> it = map.mapIterator();
        it.next();
        it.next();
        it.setValue(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),705,map,704,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),707,map,706,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),709,map,708,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),711,map,710,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),712,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),714,map,713,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),716,map,715,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),717,org.apache.commons.collections4.map.Flat3MapTest.THIRTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),719,map,718,map.get(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapIteratorSetValue3() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetValue3");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(THREE)), ((V)(THIRTY)));
        final MapIterator<K, V> it = map.mapIterator();
        it.next();
        it.next();
        it.next();
        it.setValue(((V)("NewValue")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),721,map,720,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),723,map,722,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),725,map,724,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),727,map,726,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),728,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),730,map,729,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),731,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),733,map,732,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),735,map,734,map.get(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testMapIteratorSetValue3_literalMutation199() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapIteratorSetValue3_literalMutation199");
        final Flat3Map<K, V> map = makeObject();
        map.put(((K)(ONE)), ((V)(TEN)));
        map.put(((K)(TWO)), ((V)(TWENTY)));
        map.put(((K)(THREE)), ((V)(THIRTY)));
        final MapIterator<K, V> it = map.mapIterator();
        it.next();
        it.next();
        it.next();
        it.setValue(((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),721,map,720,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),723,map,722,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),725,map,724,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),727,map,726,map.containsKey(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),728,org.apache.commons.collections4.map.Flat3MapTest.TEN);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),730,map,729,map.get(org.apache.commons.collections4.map.Flat3MapTest.ONE));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),731,org.apache.commons.collections4.map.Flat3MapTest.TWENTY);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),733,map,732,map.get(org.apache.commons.collections4.map.Flat3MapTest.TWO));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),735,map,734,map.get(org.apache.commons.collections4.map.Flat3MapTest.THREE));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Override
    public BulkTest bulkTestMapIterator() {
        return new TestFlatMapIterator();
    }

    public class TestFlatMapIterator extends AbstractMapIteratorTest<K, V> {
        public TestFlatMapIterator() {
            super("TestFlatMapIterator");
        }

        @Override
        public V[] addSetValues() {
            return org.apache.commons.collections4.map.Flat3MapTest.this.getNewSampleValues();
        }

        @Override
        public boolean supportsRemove() {
            return org.apache.commons.collections4.map.Flat3MapTest.this.isRemoveSupported();
        }

        @Override
        public boolean supportsSetValue() {
            return org.apache.commons.collections4.map.Flat3MapTest.this.isSetValueSupported();
        }

        @Override
        public MapIterator<K, V> makeEmptyIterator() {
            resetEmpty();
            return org.apache.commons.collections4.map.Flat3MapTest.this.getMap().mapIterator();
        }

        @Override
        public MapIterator<K, V> makeObject() {
            resetFull();
            return org.apache.commons.collections4.map.Flat3MapTest.this.getMap().mapIterator();
        }

        @Override
        public IterableMap<K, V> getMap() {
            return org.apache.commons.collections4.map.Flat3MapTest.this.getMap();
        }

        @Override
        public Map<K, V> getConfirmedMap() {
            return org.apache.commons.collections4.map.Flat3MapTest.this.getConfirmed();
        }

        @Override
        public void verify() {
            super.verify();
            org.apache.commons.collections4.map.Flat3MapTest.this.verify();
        }
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

    public void testCollections261() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections261");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        m.put(Integer.valueOf(0), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,null,616,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,m,618,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),621,null,620,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,m,622,m.remove(java.lang.Integer.valueOf(0)));
        m.put(Integer.valueOf(2), Integer.valueOf(2));
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,null,624,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),627,m,626,m.remove(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,null,628,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),631,m,630,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),633,null,632,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,m,634,m.remove(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollections261_literalMutation161() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections261_literalMutation161");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        m.put(Integer.valueOf(1), Integer.valueOf(2));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,null,616,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,m,618,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),621,null,620,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,m,622,m.remove(java.lang.Integer.valueOf(0)));
        m.put(Integer.valueOf(2), Integer.valueOf(2));
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,null,624,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),627,m,626,m.remove(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,null,628,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),631,m,630,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),633,null,632,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,m,634,m.remove(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollections261_literalMutation162() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections261_literalMutation162");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(1), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,null,616,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,m,618,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),621,null,620,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,m,622,m.remove(java.lang.Integer.valueOf(0)));
        m.put(Integer.valueOf(2), Integer.valueOf(2));
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,null,624,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),627,m,626,m.remove(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,null,628,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),631,m,630,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),633,null,632,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,m,634,m.remove(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollections261_literalMutation163() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections261_literalMutation163");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,null,616,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,m,618,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),621,null,620,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,m,622,m.remove(java.lang.Integer.valueOf(0)));
        m.put(Integer.valueOf(2), Integer.valueOf(2));
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,null,624,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),627,m,626,m.remove(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,null,628,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),631,m,630,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),633,null,632,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,m,634,m.remove(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollections261_literalMutation164() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections261_literalMutation164");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,null,616,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,m,618,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),621,null,620,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,m,622,m.remove(java.lang.Integer.valueOf(0)));
        m.put(Integer.valueOf(1), Integer.valueOf(2));
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,null,624,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),627,m,626,m.remove(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,null,628,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),631,m,630,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),633,null,632,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,m,634,m.remove(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollections261_literalMutation165() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections261_literalMutation165");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,null,616,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,m,618,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),621,null,620,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,m,622,m.remove(java.lang.Integer.valueOf(0)));
        m.put(Integer.valueOf(2), Integer.valueOf(1));
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,null,624,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),627,m,626,m.remove(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,null,628,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),631,m,630,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),633,null,632,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,m,634,m.remove(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollections261_literalMutation166() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections261_literalMutation166");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,null,616,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,m,618,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),621,null,620,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,m,622,m.remove(java.lang.Integer.valueOf(0)));
        m.put(Integer.valueOf(2), Integer.valueOf(2));
        m.put(Integer.valueOf(2), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,null,624,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),627,m,626,m.remove(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,null,628,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),631,m,630,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),633,null,632,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,m,634,m.remove(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollections261_literalMutation167() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections261_literalMutation167");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,null,616,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,m,618,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),621,null,620,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,m,622,m.remove(java.lang.Integer.valueOf(0)));
        m.put(Integer.valueOf(2), Integer.valueOf(2));
        m.put(Integer.valueOf(1), Integer.valueOf(2));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,null,624,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),627,m,626,m.remove(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,null,628,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),631,m,630,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),633,null,632,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,m,634,m.remove(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollections261_literalMutation168() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections261_literalMutation168");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,null,616,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,m,618,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),621,null,620,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,m,622,m.remove(java.lang.Integer.valueOf(0)));
        m.put(Integer.valueOf(2), Integer.valueOf(2));
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(1), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,null,624,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),627,m,626,m.remove(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,null,628,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),631,m,630,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),633,null,632,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,m,634,m.remove(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testCollections261_literalMutation169() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testCollections261_literalMutation169");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),617,null,616,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),619,m,618,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),621,null,620,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),623,m,622,m.remove(java.lang.Integer.valueOf(0)));
        m.put(Integer.valueOf(2), Integer.valueOf(2));
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        m.put(Integer.valueOf(0), Integer.valueOf(-1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),625,null,624,java.lang.Integer.valueOf(2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),627,m,626,m.remove(java.lang.Integer.valueOf(2)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),629,null,628,java.lang.Integer.valueOf(1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),631,m,630,m.remove(java.lang.Integer.valueOf(1)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),633,null,632,java.lang.Integer.valueOf(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),635,m,634,m.remove(java.lang.Integer.valueOf(0)));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToString() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        final String string0 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,string0);
        m.put(Integer.valueOf(2), Integer.valueOf(1));
        final String string1 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,string1);
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        final String string2 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),784,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,string2);
        m.put(Integer.valueOf(2), Integer.valueOf(2));
        final String string3 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),790,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),792,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,string3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToString_literalMutation203() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString_literalMutation203");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        final String string0 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,string0);
        m.put(Integer.valueOf(1), Integer.valueOf(0));
        final String string1 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,string1);
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        final String string2 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),784,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,string2);
        m.put(Integer.valueOf(2), Integer.valueOf(2));
        final String string3 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),790,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),792,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,string3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToString_literalMutation204() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString_literalMutation204");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        final String string0 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,string0);
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        final String string1 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,string1);
        m.put(Integer.valueOf(1), Integer.valueOf(0));
        final String string2 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),784,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,string2);
        m.put(Integer.valueOf(2), Integer.valueOf(2));
        final String string3 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),790,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),792,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,string3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToString_literalMutation205() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString_literalMutation205");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        final String string0 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,string0);
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        final String string1 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,string1);
        m.put(Integer.valueOf(0), Integer.valueOf(1));
        final String string2 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),784,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,string2);
        m.put(Integer.valueOf(2), Integer.valueOf(2));
        final String string3 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),790,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),792,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,string3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToString_literalMutation206() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString_literalMutation206");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        final String string0 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,string0);
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        final String string1 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,string1);
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        final String string2 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),784,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,string2);
        m.put(Integer.valueOf(1), Integer.valueOf(2));
        final String string3 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),790,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),792,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,string3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testToString_literalMutation207() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testToString_literalMutation207");
        final Flat3Map<java.lang.Integer, java.lang.Integer> m = new Flat3Map<java.lang.Integer, java.lang.Integer>();
        final String string0 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),778,string0);
        m.put(Integer.valueOf(1), Integer.valueOf(1));
        final String string1 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),779,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),780,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),781,string1);
        m.put(Integer.valueOf(0), Integer.valueOf(0));
        final String string2 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),782,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),783,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),784,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),785,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),786,string2);
        m.put(Integer.valueOf(2), Integer.valueOf(3));
        final String string3 = m.toString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),787,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),788,string0);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),789,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),790,string1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),791,string3);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),792,string2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),793,string3);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

