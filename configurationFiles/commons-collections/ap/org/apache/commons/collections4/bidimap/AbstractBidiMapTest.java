package org.apache.commons.collections4.bidimap;

import org.apache.commons.collections4.map.AbstractIterableMapTest;
import org.apache.commons.collections4.iterators.AbstractMapIteratorTest;
import org.apache.commons.collections4.map.AbstractMapTest;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.BulkTest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.MapIterator;
import java.util.Set;
import org.junit.Test;

/** 
 * Abstract test class for {@link BidiMap} methods and contracts.
 * 
 * @version $Id$
 */
public abstract class AbstractBidiMapTest<K, V> extends AbstractIterableMapTest<K, V> {
    public AbstractBidiMapTest(final String testName) {
        super(testName);
    }

    public AbstractBidiMapTest() {
        super("Inverse");
    }

    /** 
     * Override to create a full <code>BidiMap</code> other than the default.
     * 
     * @return a full <code>BidiMap</code> implementation.
     */
@Override
    public BidiMap<K, V> makeFullMap() {
        return ((BidiMap<K, V>)(super.makeFullMap()));
    }

    /** 
     * Override to return the empty BidiMap.
     */
@Override
    public abstract BidiMap<K, V> makeObject();

    /** 
     * Override to indicate to AbstractTestMap this is a BidiMap.
     */
@Override
    public boolean isAllowDuplicateValues() {
        return false;
    }

    /** 
     * Override as DualHashBidiMap didn't exist until version 3.
     */
@Override
    public String getCompatibilityVersion() {
        return "4";
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBidiPut_add1592() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_add1592");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBidiPut_add1593() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_add1593");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBidiPut_add1594() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_add1594");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBidiPut_add1595() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_add1595");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBidiPut() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBidiPut_literalMutation1389() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_literalMutation1389");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("foo")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBidiPut_literalMutation1390() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_literalMutation1390");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("A")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBidiPut_literalMutation1391() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_literalMutation1391");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("foo")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBidiPut_literalMutation1392() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_literalMutation1392");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBidiPut_literalMutation1393() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_literalMutation1393");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("foo")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBidiPut_literalMutation1394() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_literalMutation1394");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBidiPut_literalMutation1395() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_literalMutation1395");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("foo")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    public void testBidiPut_literalMutation1396() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_literalMutation1396");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBidiPut_remove1210() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_remove1210");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBidiPut_remove1211() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_remove1211");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBidiPut_remove1212() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_remove1212");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    @Test(timeout = 1000)
    public void testBidiPut_remove1213() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut_remove1213");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,map,4935,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,inverse,4937,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,map,4939,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,map,4949,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,inverse,4951,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,map,4953,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,inverse,4955,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,inverse,4957,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,map,4959,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,inverse,4961,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,map,4963,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,map,4965,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,inverse,4967,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,map,4969,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,inverse,4971,inverse.get("F"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    /** 
     * Verifies that {@link #map} is still equal to {@link #confirmed}.
     * <p/>
     * This implementation checks the inverse map as well.
     */
@Override
    public void verify() {
        verifyInverse();
        super.verify();
    }

    public void verifyInverse() {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4976,map,4975,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4978,((org.apache.commons.collections4.BidiMap<K, V>)(map)).inverseBidiMap(),4977,((org.apache.commons.collections4.BidiMap<K, V>)(map)).inverseBidiMap().size());
        final Map<K, V> map1 = new HashMap<K, V>(map);
        final Map<V, K> map2 = new HashMap<V, K>(((BidiMap<K, V>)(map)).inverseBidiMap());
        final Set<K> keys1 = map1.keySet();
        final Set<V> keys2 = map2.keySet();
        final Collection<V> values1 = map1.values();
        final Collection<K> values2 = map2.values();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4980,keys1,4979,keys1.containsAll(values2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4982,values2,4981,values2.containsAll(keys1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4984,values1,4983,values1.containsAll(keys2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4986,keys2,4985,keys2.containsAll(values1));
    }

    @Test(timeout = 1000)
    public void testBidiGetKey_add1570() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiGetKey_add1570");
        doTestGetKey(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        doTestGetKey(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiGetKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiGetKey");
        doTestGetKey(makeFullMap(), getSampleKeys()[1], getSampleValues()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiGetKey_literalMutation1383() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiGetKey_literalMutation1383");
        doTestGetKey(makeFullMap(), getSampleKeys()[0], getSampleValues()[-1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiGetKey_remove1191() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiGetKey_remove1191");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiGetKeyInverse_add1571() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiGetKeyInverse_add1571");
        doTestGetKey(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        doTestGetKey(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiGetKeyInverse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiGetKeyInverse");
        doTestGetKey(makeFullMap().inverseBidiMap(), getSampleValues()[1], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiGetKeyInverse_literalMutation1385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiGetKeyInverse_literalMutation1385");
        doTestGetKey(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiGetKeyInverse_remove1192() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiGetKeyInverse_remove1192");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void doTestGetKey(final BidiMap<?, ?> map, final Object key, final Object value) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4836,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4838,map,4837,map.get(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4839,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4841,map,4840,map.getKey(value));
    }

    public void testBidiInverse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiInverse");
        final BidiMap<K, V> map = makeFullMap();
        final BidiMap<V, K> inverseMap = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4864,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4866,inverseMap,4865,inverseMap.inverseBidiMap());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4867,getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4869,inverseMap,4868,inverseMap.get(getSampleValues()[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4870,getSampleValues()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4872,inverseMap,4871,inverseMap.getKey(getSampleKeys()[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiModifyEntrySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiModifyEntrySet");
        if (!(isSetValueSupported())) {
            return ;
        } 
        modifyEntrySet(makeFullMap());
        modifyEntrySet(makeFullMap());
        modifyEntrySet(makeFullMap().inverseBidiMap());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiModifyEntrySet_add1591() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiModifyEntrySet_add1591");
        if (!(isSetValueSupported())) {
            return ;
        } 
        modifyEntrySet(makeFullMap());
        modifyEntrySet(makeFullMap().inverseBidiMap());
        modifyEntrySet(makeFullMap().inverseBidiMap());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiModifyEntrySet_remove1208() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiModifyEntrySet_remove1208");
        if (!(isSetValueSupported())) {
            return ;
        } 
        modifyEntrySet(makeFullMap().inverseBidiMap());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiModifyEntrySet_remove1209() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiModifyEntrySet_remove1209");
        if (!(isSetValueSupported())) {
            return ;
        } 
        modifyEntrySet(makeFullMap().inverseBidiMap());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @SuppressWarnings(value = "unchecked")
    private <T>void modifyEntrySet(final BidiMap<?, T> map) {
        final Map.Entry<?, T> entry = map.entrySet().iterator().next();
        final Object key = entry.getKey();
        final Object oldValue = entry.getValue();
        final Object newValue = "newValue";
        entry.setValue(((T)(newValue)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4831,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4833,map,4832,map.get(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4835,map,4834,map.getKey(oldValue));
    }

    @Test(timeout = 1000)
    public void testBidiClear() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClear");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().clear();
                makeFullMap().clear();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        BidiMap<?, ?> map = makeFullMap();
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4857,map,4856,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4859,map.inverseBidiMap(),4858,map.inverseBidiMap().isEmpty());
        map = makeFullMap().inverseBidiMap();
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4861,map,4860,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4863,map.inverseBidiMap(),4862,map.inverseBidiMap().isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClear_add1568() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClear_add1568");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().clear();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        BidiMap<?, ?> map = makeFullMap();
        map.clear();
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4857,map,4856,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4859,map.inverseBidiMap(),4858,map.inverseBidiMap().isEmpty());
        map = makeFullMap().inverseBidiMap();
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4861,map,4860,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4863,map.inverseBidiMap(),4862,map.inverseBidiMap().isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClear_add1569() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClear_add1569");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().clear();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        BidiMap<?, ?> map = makeFullMap();
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4857,map,4856,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4859,map.inverseBidiMap(),4858,map.inverseBidiMap().isEmpty());
        map = makeFullMap().inverseBidiMap();
        map.clear();
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4861,map,4860,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4863,map.inverseBidiMap(),4862,map.inverseBidiMap().isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClear_remove1189() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClear_remove1189");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().clear();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        BidiMap<?, ?> map = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4857,map,4856,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4859,map.inverseBidiMap(),4858,map.inverseBidiMap().isEmpty());
        map = makeFullMap().inverseBidiMap();
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4861,map,4860,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4863,map.inverseBidiMap(),4862,map.inverseBidiMap().isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiClear_remove1190() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClear_remove1190");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().clear();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        BidiMap<?, ?> map = makeFullMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4857,map,4856,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4859,map.inverseBidiMap(),4858,map.inverseBidiMap().isEmpty());
        map = makeFullMap().inverseBidiMap();
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4861,map,4860,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4863,map.inverseBidiMap(),4862,map.inverseBidiMap().isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemove_add1596() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_add1596");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemove_add1597() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_add1597");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemove_add1598() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_add1598");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemove_add1599() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_add1599");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemove_add1600() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_add1600");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemove_add1601() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_add1601");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemove() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[1]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemove_literalMutation1398() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_literalMutation1398");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[-1]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemove_literalMutation1399() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_literalMutation1399");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[1]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemove_literalMutation1400() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_literalMutation1400");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[-1]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemove_literalMutation1401() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_literalMutation1401");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[-1]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemove_literalMutation1402() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_literalMutation1402");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[1]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemove_remove1214() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_remove1214");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemove_remove1215() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_remove1215");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemove_remove1216() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_remove1216");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemove_remove1217() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemove_remove1217");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().remove(getSampleKeys()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            try {
                makeFullMap().removeValue(getSampleValues()[0]);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        remove(makeFullMap(), getSampleKeys()[0]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,makeFullMap(),4973,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void remove(final BidiMap<?, ?> map, final Object key) {
        final Object value = map.remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4842,!(map.containsKey(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4844,map,4843,map.getKey(value));
    }

    private void removeValue(final BidiMap<?, ?> map, final Object value) {
        final Object key = map.removeValue(value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4853,!(map.containsKey(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4855,map,4854,map.getKey(value));
    }

    @Test(timeout = 1000)
    public void testBidiKeySetValuesOrder() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiKeySetValuesOrder");
        resetFull();
        resetFull();
        final Iterator<K> keys = map.keySet().iterator();
        final Iterator<V> values = map.values().iterator();
        for ( ; (keys.hasNext()) && (values.hasNext()) ; ) {
            final K key = keys.next();
            final V value = values.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4874,map,4873,map.get(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4875,value);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4877,keys,4876,keys.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4879,values,4878,values.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiKeySetValuesOrder_remove1193() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiKeySetValuesOrder_remove1193");
        final Iterator<K> keys = map.keySet().iterator();
        final Iterator<V> values = map.values().iterator();
        for ( ; (keys.hasNext()) && (values.hasNext()) ; ) {
            final K key = keys.next();
            final V value = values.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4874,map,4873,map.get(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4875,value);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4877,keys,4876,keys.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4879,values,4878,values.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByKeySet_add1604() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByKeySet_add1604");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByKeySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByKeySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByKeySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByKeySet_add1605() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByKeySet_add1605");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByKeySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByKeySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        removeByKeySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByKeySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByKeySet");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByKeySet(makeFullMap(), getSampleKeys()[-1], getSampleValues()[0]);
        removeByKeySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByKeySet_literalMutation1408() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByKeySet_literalMutation1408");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByKeySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[-1]);
        removeByKeySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByKeySet_literalMutation1409() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByKeySet_literalMutation1409");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByKeySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByKeySet(makeFullMap().inverseBidiMap(), getSampleValues()[-1], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByKeySet_literalMutation1410() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByKeySet_literalMutation1410");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByKeySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByKeySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByKeySet_remove1220() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByKeySet_remove1220");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByKeySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByKeySet_remove1221() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByKeySet_remove1221");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByKeySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void removeByKeySet(final BidiMap<?, ?> map, final Object key, final Object value) {
        map.keySet().remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4849,!(map.containsKey(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4850,!(map.containsValue(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4851,!(map.inverseBidiMap().containsValue(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4852,!(map.inverseBidiMap().containsKey(value)));
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByEntrySet_add1602() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByEntrySet_add1602");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByEntrySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByEntrySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByEntrySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByEntrySet_add1603() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByEntrySet_add1603");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByEntrySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByEntrySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        removeByEntrySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByEntrySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByEntrySet");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByEntrySet(makeFullMap(), getSampleKeys()[1], getSampleValues()[0]);
        removeByEntrySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByEntrySet_literalMutation1404() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByEntrySet_literalMutation1404");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByEntrySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[1]);
        removeByEntrySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByEntrySet_literalMutation1405() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByEntrySet_literalMutation1405");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByEntrySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByEntrySet(makeFullMap().inverseBidiMap(), getSampleValues()[-1], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByEntrySet_literalMutation1406() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByEntrySet_literalMutation1406");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByEntrySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByEntrySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[-1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByEntrySet_remove1218() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByEntrySet_remove1218");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByEntrySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiRemoveByEntrySet_remove1219() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByEntrySet_remove1219");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByEntrySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void removeByEntrySet(final BidiMap<?, ?> map, final Object key, final Object value) {
        final Map<java.lang.Object, java.lang.Object> temp = new HashMap<java.lang.Object, java.lang.Object>();
        temp.put(key, value);
        map.entrySet().remove(temp.entrySet().iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4845,!(map.containsKey(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4846,!(map.containsValue(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4847,!(map.inverseBidiMap().containsValue(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4848,!(map.inverseBidiMap().containsKey(value)));
    }

    /** 
     * {@inheritDoc}
     */
@Override
    public BidiMap<K, V> getMap() {
        return ((BidiMap<K, V>)(super.getMap()));
    }

    @Override
    public BulkTest bulkTestMapEntrySet() {
        return new TestBidiMapEntrySet();
    }

    public class TestBidiMapEntrySet extends AbstractMapTest<K, V>.TestMapEntrySet {
        public TestBidiMapEntrySet() {
            super();
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1554() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1554");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1555() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1555");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1556() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1556");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1557() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1557");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1558() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1558");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1559() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1559");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1560() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1560");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1561() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1561");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1562() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1562");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1563() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1563");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1564() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1564");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1565() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1565");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_add1566() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_add1566");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        public void testMapEntrySetIteratorEntrySetValueCrossCheck() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck");
            final K key1 = getSampleKeys()[1];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        public void testMapEntrySetIteratorEntrySetValueCrossCheck_literalMutation1379() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_literalMutation1379");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[0];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        public void testMapEntrySetIteratorEntrySetValueCrossCheck_literalMutation1380() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_literalMutation1380");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[-1];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        public void testMapEntrySetIteratorEntrySetValueCrossCheck_literalMutation1381() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_literalMutation1381");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[0];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_remove1179() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_remove1179");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_remove1180() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_remove1180");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_remove1181() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_remove1181");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_remove1182() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_remove1182");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_remove1183() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_remove1183");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_remove1184() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_remove1184");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_remove1185() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_remove1185");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_remove1186() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_remove1186");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_remove1187() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_remove1187");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }

        @Test(timeout = 1000)
        public void testMapEntrySetIteratorEntrySetValueCrossCheck_remove1188() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck_remove1188");
            final K key1 = getSampleKeys()[0];
            final K key2 = getSampleKeys()[1];
            final V newValue1 = getNewSampleValues()[0];
            final V newValue2 = getNewSampleValues()[1];
            resetFull();
            Iterator<java.util.Map.Entry<K, V>> it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry1 = getEntry(it, key1);
            it = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getCollection().iterator();
            final Map.Entry<K, V> entry2 = getEntry(it, key2);
            Iterator<java.util.Map.Entry<K, V>> itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed1 = getEntry(itConfirmed, key1);
            itConfirmed = org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.getConfirmed().iterator();
            final Map.Entry<K, V> entryConfirmed2 = getEntry(itConfirmed, key2);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            if (!(isSetValueSupported())) {
                try {
                    entry1.setValue(newValue1);
                } catch (final UnsupportedOperationException ex) {
                }
                return ;
            } 
            entry1.setValue(newValue1);
            entryConfirmed1.setValue(newValue1);
            entry2.setValue(newValue2);
            entryConfirmed2.setValue(newValue2);
            try {
                entry2.setValue(newValue1);
            } catch (final IllegalArgumentException ex) {
                return ;
            }
            entryConfirmed2.setValue(newValue1);
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4817,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4819,entry2,4818,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4824,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4826,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4825,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4827,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4829,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
            } 
            fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
        }
    }

    public BulkTest bulkTestInverseMap() {
        return new TestInverseBidiMap(this);
    }

    public class TestInverseBidiMap extends AbstractBidiMapTest<V, K> {
        final AbstractBidiMapTest<K, V> main;

        public TestInverseBidiMap(final AbstractBidiMapTest<K, V> main) {
            super();
            this.main = main;
        }

        @Override
        public BidiMap<V, K> makeObject() {
            return main.makeObject().inverseBidiMap();
        }

        @Override
        public BidiMap<V, K> makeFullMap() {
            return main.makeFullMap().inverseBidiMap();
        }

        @Override
        public V[] getSampleKeys() {
            return main.getSampleValues();
        }

        @Override
        public K[] getSampleValues() {
            return main.getSampleKeys();
        }

        @Override
        public String getCompatibilityVersion() {
            return main.getCompatibilityVersion();
        }

        @Override
        public boolean isAllowNullKey() {
            return main.isAllowNullKey();
        }

        @Override
        public boolean isAllowNullValue() {
            return main.isAllowNullValue();
        }

        @Override
        public boolean isPutAddSupported() {
            return main.isPutAddSupported();
        }

        @Override
        public boolean isPutChangeSupported() {
            return main.isPutChangeSupported();
        }

        @Override
        public boolean isSetValueSupported() {
            return main.isSetValueSupported();
        }

        @Override
        public boolean isRemoveSupported() {
            return main.isRemoveSupported();
        }
    }

    public BulkTest bulkTestBidiMapIterator() {
        return new TestBidiMapIterator();
    }

    public class TestBidiMapIterator extends AbstractMapIteratorTest<K, V> {
        public TestBidiMapIterator() {
            super("TestBidiMapIterator");
        }

        @Override
        public V[] addSetValues() {
            return org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getNewSampleValues();
        }

        @Override
        public boolean supportsRemove() {
            return org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.isRemoveSupported();
        }

        @Override
        public boolean supportsSetValue() {
            return org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.isSetValueSupported();
        }

        @Override
        public MapIterator<K, V> makeEmptyIterator() {
            resetEmpty();
            return org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().mapIterator();
        }

        @Override
        public MapIterator<K, V> makeObject() {
            resetFull();
            return org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().mapIterator();
        }

        @Override
        public BidiMap<K, V> getMap() {
            return org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap();
        }

        @Override
        public Map<K, V> getConfirmedMap() {
            return org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed();
        }

        @Override
        public void verify() {
            super.verify();
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.verify();
        }
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1573() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1573");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1574() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1574");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1575() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1575");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1576() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1576");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1577() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1577");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1578() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1578");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1579() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1579");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1580() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1580");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1581() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1581");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1582() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1582");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1583() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1583");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1584() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1584");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1585() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1585");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1586() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1586");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1587() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1587");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1588() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1588");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_add1589() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_add1589");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiMapIteratorSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet");
        final V newValue1 = getOtherValues()[-1];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiMapIteratorSet_literalMutation1387() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_literalMutation1387");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[0];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1194() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1194");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1195() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1195");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1196() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1196");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1197() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1197");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1198() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1198");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1199() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1199");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1200() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1200");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1201() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1201");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1202() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1202");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1203() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1203");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1204() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1204");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1205() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1205");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1206() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1206");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testBidiMapIteratorSet_remove1207() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet_remove1207");
        final V newValue1 = getOtherValues()[0];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,it,4880,it.hasNext());
        final K key1 = it.next();
        if (!(isSetValueSupported())) {
            try {
                it.setValue(newValue1);
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4882,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,it,4883,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4885,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,it,4886,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,bidi,4888,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4891,bidi,4890,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4895,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,it,4896,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4898,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,it,4899,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,bidi,4901,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4904,bidi,4903,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4908,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,it,4909,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4911,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,it,4912,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,bidi,4914,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4918,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,bidi,4919,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4921,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4923,it,4922,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4925,bidi,4924,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4927,bidi,4926,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,bidi,4929,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,bidi,4931,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,bidi,4933,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

