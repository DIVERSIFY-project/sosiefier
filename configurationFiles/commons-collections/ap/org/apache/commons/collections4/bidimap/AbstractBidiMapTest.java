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
    public void testBidiPut() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiPut");
        if ((!(isPutAddSupported())) || (!(isPutChangeSupported()))) {
            return ;
        } 
        final BidiMap<K, V> map = makeObject();
        final BidiMap<V, K> inverse = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,map,4927,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,inverse,4929,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,map,4931,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,map,4933,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,inverse,4935,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,map,4937,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,inverse,4939,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,inverse,4949,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,map,4951,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,inverse,4953,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,map,4955,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,map,4957,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,inverse,4959,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,map,4961,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,inverse,4963,inverse.get("F"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,map,4927,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,inverse,4929,inverse.size());
        map.put(((K)("foo")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,map,4931,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,map,4933,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,inverse,4935,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,map,4937,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,inverse,4939,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,inverse,4949,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,map,4951,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,inverse,4953,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,map,4955,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,map,4957,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,inverse,4959,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,map,4961,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,inverse,4963,inverse.get("F"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,map,4927,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,inverse,4929,inverse.size());
        map.put(((K)("A")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,map,4931,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,map,4933,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,inverse,4935,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,map,4937,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,inverse,4939,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,inverse,4949,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,map,4951,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,inverse,4953,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,map,4955,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,map,4957,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,inverse,4959,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,map,4961,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,inverse,4963,inverse.get("F"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,map,4927,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,inverse,4929,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,map,4931,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,map,4933,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,inverse,4935,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,map,4937,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,inverse,4939,inverse.get("B"));
        map.put(((K)("foo")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,inverse,4949,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,map,4951,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,inverse,4953,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,map,4955,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,map,4957,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,inverse,4959,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,map,4961,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,inverse,4963,inverse.get("F"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,map,4927,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,inverse,4929,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,map,4931,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,map,4933,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,inverse,4935,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,map,4937,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,inverse,4939,inverse.get("B"));
        map.put(((K)("A")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,inverse,4949,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,map,4951,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,inverse,4953,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,map,4955,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,map,4957,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,inverse,4959,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,map,4961,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,inverse,4963,inverse.get("F"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,map,4927,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,inverse,4929,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,map,4931,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,map,4933,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,inverse,4935,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,map,4937,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,inverse,4939,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("C"));
        map.put(((K)("foo")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,inverse,4949,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,map,4951,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,inverse,4953,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,map,4955,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,map,4957,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,inverse,4959,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,map,4961,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,inverse,4963,inverse.get("F"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,map,4927,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,inverse,4929,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,map,4931,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,map,4933,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,inverse,4935,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,map,4937,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,inverse,4939,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("C"));
        map.put(((K)("B")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,inverse,4949,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,map,4951,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,inverse,4953,inverse.get("C"));
        map.put(((K)("E")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,map,4955,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,map,4957,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,inverse,4959,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,map,4961,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,inverse,4963,inverse.get("F"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,map,4927,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,inverse,4929,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,map,4931,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,map,4933,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,inverse,4935,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,map,4937,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,inverse,4939,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,inverse,4949,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,map,4951,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,inverse,4953,inverse.get("C"));
        map.put(((K)("foo")), ((V)("F")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,map,4955,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,map,4957,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,inverse,4959,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,map,4961,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,inverse,4963,inverse.get("F"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4928,map,4927,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),487,map,486,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4930,inverse,4929,inverse.size());
        map.put(((K)("A")), ((V)("B")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4932,map,4931,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4934,map,4933,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4936,inverse,4935,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4938,map,4937,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4940,inverse,4939,inverse.get("B"));
        map.put(((K)("A")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4942,map,4941,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1952,map,1951,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4944,inverse,4943,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4946,map,4945,map.get("A"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4948,inverse,4947,inverse.get("C"));
        map.put(((K)("B")), ((V)("C")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),386,map,385,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),1802,map,1801,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4950,inverse,4949,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4952,map,4951,map.get("B"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4954,inverse,4953,inverse.get("C"));
        map.put(((K)("E")), ((V)("foo")));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4956,map,4955,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4958,map,4957,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4960,inverse,4959,inverse.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4962,map,4961,map.get("E"));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4964,inverse,4963,inverse.get("F"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4968,map,4967,map.size());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4970,((org.apache.commons.collections4.BidiMap<K, V>)(map)).inverseBidiMap(),4969,((org.apache.commons.collections4.BidiMap<K, V>)(map)).inverseBidiMap().size());
        final Map<K, V> map1 = new HashMap<K, V>(map);
        final Map<V, K> map2 = new HashMap<V, K>(((BidiMap<K, V>)(map)).inverseBidiMap());
        final Set<K> keys1 = map1.keySet();
        final Set<V> keys2 = map2.keySet();
        final Collection<V> values1 = map1.values();
        final Collection<K> values2 = map2.values();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4972,keys1,4971,keys1.containsAll(values2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4974,values2,4973,values2.containsAll(keys1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4976,values1,4975,values1.containsAll(keys2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4978,keys2,4977,keys2.containsAll(values1));
    }

    public void testBidiGetKey() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiGetKey");
        doTestGetKey(makeFullMap(), getSampleKeys()[1], getSampleValues()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiGetKey_literalMutation1383() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiGetKey_literalMutation1383");
        doTestGetKey(makeFullMap(), getSampleKeys()[0], getSampleValues()[1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiGetKeyInverse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiGetKeyInverse");
        doTestGetKey(makeFullMap().inverseBidiMap(), getSampleValues()[-1], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiGetKeyInverse_literalMutation1385() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiGetKeyInverse_literalMutation1385");
        doTestGetKey(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[-1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void doTestGetKey(final BidiMap<?, ?> map, final Object key, final Object value) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4828,value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4830,map,4829,map.get(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4831,key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4833,map,4832,map.getKey(value));
    }

    public void testBidiInverse() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiInverse");
        final BidiMap<K, V> map = makeFullMap();
        final BidiMap<V, K> inverseMap = map.inverseBidiMap();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4856,map);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4858,inverseMap,4857,inverseMap.inverseBidiMap());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4859,getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4861,inverseMap,4860,inverseMap.get(getSampleValues()[0]));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4862,getSampleValues()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4864,inverseMap,4863,inverseMap.getKey(getSampleKeys()[0]));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiModifyEntrySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiModifyEntrySet");
        if (!(isSetValueSupported())) {
            return ;
        } 
        modifyEntrySet(makeFullMap());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4823,newValue);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4825,map,4824,map.get(key));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4827,map,4826,map.getKey(oldValue));
    }

    public void testBidiClear() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiClear");
        if (!(isRemoveSupported())) {
            try {
                makeFullMap().clear();
            } catch (final UnsupportedOperationException ex) {
            }
            return ;
        } 
        BidiMap<?, ?> map = makeFullMap();
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4849,map,4848,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4851,map.inverseBidiMap(),4850,map.inverseBidiMap().isEmpty());
        map = makeFullMap().inverseBidiMap();
        map.clear();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4853,map,4852,map.isEmpty());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4855,map.inverseBidiMap(),4854,map.inverseBidiMap().isEmpty());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,makeFullMap(),4965,makeFullMap().removeValue("NotPresent"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,makeFullMap(),4965,makeFullMap().removeValue("NotPresent"));
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
        remove(makeFullMap(), getSampleKeys()[-1]);
        remove(makeFullMap().inverseBidiMap(), getSampleValues()[0]);
        removeValue(makeFullMap(), getSampleValues()[0]);
        removeValue(makeFullMap().inverseBidiMap(), getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,makeFullMap(),4965,makeFullMap().removeValue("NotPresent"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,makeFullMap(),4965,makeFullMap().removeValue("NotPresent"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,makeFullMap(),4965,makeFullMap().removeValue("NotPresent"));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4966,makeFullMap(),4965,makeFullMap().removeValue("NotPresent"));
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void remove(final BidiMap<?, ?> map, final Object key) {
        final Object value = map.remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4834,!(map.containsKey(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4836,map,4835,map.getKey(value));
    }

    private void removeValue(final BidiMap<?, ?> map, final Object value) {
        final Object key = map.removeValue(value);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4845,!(map.containsKey(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4847,map,4846,map.getKey(value));
    }

    public void testBidiKeySetValuesOrder() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiKeySetValuesOrder");
        resetFull();
        final Iterator<K> keys = map.keySet().iterator();
        final Iterator<V> values = map.values().iterator();
        for ( ; (keys.hasNext()) && (values.hasNext()) ; ) {
            final K key = keys.next();
            final V value = values.next();
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4866,map,4865,map.get(key));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4867,value);
        }
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4869,keys,4868,keys.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4871,values,4870,values.hasNext());
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByKeySet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByKeySet");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByKeySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByKeySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByKeySet_literalMutation1407() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByKeySet_literalMutation1407");
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
        removeByKeySet(makeFullMap().inverseBidiMap(), getSampleValues()[1], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByKeySet_literalMutation1410() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByKeySet_literalMutation1410");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByKeySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByKeySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[-1]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void removeByKeySet(final BidiMap<?, ?> map, final Object key, final Object value) {
        map.keySet().remove(key);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4841,!(map.containsKey(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4842,!(map.containsValue(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4843,!(map.inverseBidiMap().containsValue(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4844,!(map.inverseBidiMap().containsKey(value)));
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
        removeByEntrySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[-1]);
        removeByEntrySet(makeFullMap().inverseBidiMap(), getSampleValues()[0], getSampleKeys()[0]);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testBidiRemoveByEntrySet_literalMutation1405() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiRemoveByEntrySet_literalMutation1405");
        if (!(isRemoveSupported())) {
            return ;
        } 
        removeByEntrySet(makeFullMap(), getSampleKeys()[0], getSampleValues()[0]);
        removeByEntrySet(makeFullMap().inverseBidiMap(), getSampleValues()[1], getSampleKeys()[0]);
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

    private void removeByEntrySet(final BidiMap<?, ?> map, final Object key, final Object value) {
        final Map<java.lang.Object, java.lang.Object> temp = new HashMap<java.lang.Object, java.lang.Object>();
        temp.put(key, value);
        map.entrySet().remove(temp.entrySet().iterator().next());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4837,!(map.containsKey(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4838,!(map.containsValue(value)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4839,!(map.inverseBidiMap().containsValue(key)));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4840,!(map.inverseBidiMap().containsKey(value)));
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

        public void testMapEntrySetIteratorEntrySetValueCrossCheck() {
            fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testMapEntrySetIteratorEntrySetValueCrossCheck");
            final K key1 = getSampleKeys()[-1];
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4809,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4811,entry2,4810,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4813,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4812,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4815,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4814,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4816,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4818,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4817,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4819,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
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
            final K key2 = getSampleKeys()[2];
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4809,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4811,entry2,4810,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4813,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4812,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4815,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4814,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4816,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4818,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4817,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4819,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
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
            final V newValue1 = getNewSampleValues()[1];
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4809,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4811,entry2,4810,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4813,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4812,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4815,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4814,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4816,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4818,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4817,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4819,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
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
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4809,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4811,entry2,4810,entry2.getValue());
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4813,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4812,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4815,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4814,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4816,newValue1);
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4818,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4817,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().get(entry2.getKey()));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4820,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4819,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsKey(key1));
            fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4822,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap(),4821,org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getMap().containsValue(newValue2));
            org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.this.verify();
            it.next();
            if (isRemoveSupported()) {
                it.remove();
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

    public void testBidiMapIteratorSet() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testBidiMapIteratorSet");
        final V newValue1 = getOtherValues()[-1];
        final V newValue2 = getOtherValues()[1];
        resetFull();
        final BidiMap<K, V> bidi = getMap();
        final MapIterator<K, V> it = bidi.mapIterator();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4873,it,4872,it.hasNext());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4874,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4876,it,4875,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4877,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4879,it,4878,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,bidi,4880,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4883,bidi,4882,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4886,bidi,4885,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,it,4888,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4890,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,it,4891,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4896,bidi,4895,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4899,bidi,4898,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,it,4901,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4903,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,it,4904,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4909,bidi,4908,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4912,bidi,4911,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,it,4914,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4919,bidi,4918,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4922,bidi,4921,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4924,bidi,4923,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4926,bidi,4925,bidi.containsValue(newValue2));
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4873,it,4872,it.hasNext());
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
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4874,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4876,it,4875,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4877,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4879,it,4878,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4881,bidi,4880,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4883,bidi,4882,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4884,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4886,bidi,4885,bidi.get(key1));
        verify();
        it.setValue(newValue1);
        confirmed.put(key1, newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4887,key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4889,it,4888,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4890,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4892,it,4891,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4894,bidi,4893,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4896,bidi,4895,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4897,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4899,bidi,4898,bidi.get(key1));
        verify();
        final K key2 = it.next();
        it.setValue(newValue2);
        confirmed.put(key2, newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4900,key2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4902,it,4901,it.getKey());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4903,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4905,it,4904,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4907,bidi,4906,bidi.containsKey(key2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4909,bidi,4908,bidi.containsValue(newValue2));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4910,newValue2);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4912,bidi,4911,bidi.get(key2));
        verify();
        try {
            it.setValue(newValue1);
        } catch (final IllegalArgumentException ex) {
            return ;
        }
        confirmed.put(key2, newValue1);
        org.apache.commons.collections4.bidimap.AbstractBidiMapTest.this.getConfirmed().remove(key1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4913,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4915,it,4914,it.getValue());
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4917,bidi,4916,bidi.containsKey(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4919,bidi,4918,bidi.containsValue(newValue1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4920,newValue1);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4922,bidi,4921,bidi.get(it.getKey()));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4924,bidi,4923,bidi.containsKey(key1));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),4926,bidi,4925,bidi.containsValue(newValue2));
        verify();
        it.next();
        if (isRemoveSupported()) {
            it.remove();
        } 
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

